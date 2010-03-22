/**
 * Copyright (C) 2010 Olafur Gauti Gudmundsson
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.code.morphia.testdaos;

import com.google.code.morphia.Morphia;
import com.google.code.morphia.dao.AbstractMongoDAO;
import com.google.code.morphia.testmodel.Hotel;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;

/**
 *
 * @author Olafur Gauti Gudmundsson
 */
public class HotelDAO extends AbstractMongoDAO<Hotel> {

    private final Mongo mongo;

    public HotelDAO( Morphia morphia, Mongo mongo ) {
        super(Hotel.class, morphia);
        this.mongo = mongo;
    }

    @Override
    protected DBCollection collection() {
        return mongo.getDB("morphia_test").getCollection("hotels");
    }
}