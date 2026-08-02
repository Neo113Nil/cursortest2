package com.google.gson.internal.bind;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.GsonTypes;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class MapTypeAdapterFactory implements TypeAdapterFactory {
    final boolean complexMapKeySerialization;
    private final ConstructorConstructor constructorConstructor;

    public final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {
        private final ObjectConstructor<? extends Map<K, V>> constructor;
        private final TypeAdapter<K> keyTypeAdapter;
        private final TypeAdapter<V> valueTypeAdapter;

        public Adapter(TypeAdapter<K> typeAdapter, TypeAdapter<V> typeAdapter2, ObjectConstructor<? extends Map<K, V>> objectConstructor) {
            this.keyTypeAdapter = typeAdapter;
            this.valueTypeAdapter = typeAdapter2;
            this.constructor = objectConstructor;
        }

        private String keyToString(JsonElement jsonElement) {
            if (!jsonElement.isJsonPrimitive()) {
                if (jsonElement.isJsonNull()) {
                    return "null";
                }
                Path$$ExternalSyntheticBUOutline0.m$2();
                return null;
            }
            JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
            if (asJsonPrimitive.isNumber()) {
                return String.valueOf(asJsonPrimitive.getAsNumber());
            }
            if (asJsonPrimitive.isBoolean()) {
                return Boolean.toString(asJsonPrimitive.getAsBoolean());
            }
            if (asJsonPrimitive.isString()) {
                return asJsonPrimitive.getAsString();
            }
            Path$$ExternalSyntheticBUOutline0.m$2();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public Map<K, V> read2(JsonReader jsonReader) {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map<K, V> construct = this.constructor.construct();
            if (peek != JsonToken.BEGIN_ARRAY) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(jsonReader);
                    K read2 = this.keyTypeAdapter.read2(jsonReader);
                    if (construct.put(read2, this.valueTypeAdapter.read2(jsonReader)) != null) {
                        throw new JsonSyntaxException(Boxes$$ExternalSyntheticOutline1.m("duplicate key: ", read2));
                    }
                }
                jsonReader.endObject();
                return construct;
            }
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                jsonReader.beginArray();
                K read22 = this.keyTypeAdapter.read2(jsonReader);
                if (construct.put(read22, this.valueTypeAdapter.read2(jsonReader)) != null) {
                    throw new JsonSyntaxException(Boxes$$ExternalSyntheticOutline1.m("duplicate key: ", read22));
                }
                jsonReader.endArray();
            }
            jsonReader.endArray();
            return construct;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Map<K, V> map) {
            if (map == null) {
                jsonWriter.nullValue();
                return;
            }
            if (!MapTypeAdapterFactory.this.complexMapKeySerialization) {
                jsonWriter.beginObject();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    this.valueTypeAdapter.write(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i = 0;
            boolean z = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                JsonElement jsonTree = this.keyTypeAdapter.toJsonTree(entry2.getKey());
                arrayList.add(jsonTree);
                arrayList2.add(entry2.getValue());
                z |= jsonTree.isJsonArray() || jsonTree.isJsonObject();
            }
            if (!z) {
                jsonWriter.beginObject();
                int size = arrayList.size();
                while (i < size) {
                    jsonWriter.name(keyToString((JsonElement) arrayList.get(i)));
                    this.valueTypeAdapter.write(jsonWriter, arrayList2.get(i));
                    i++;
                }
                jsonWriter.endObject();
                return;
            }
            jsonWriter.beginArray();
            int size2 = arrayList.size();
            while (i < size2) {
                jsonWriter.beginArray();
                Streams.write((JsonElement) arrayList.get(i), jsonWriter);
                this.valueTypeAdapter.write(jsonWriter, arrayList2.get(i));
                jsonWriter.endArray();
                i++;
            }
            jsonWriter.endArray();
        }
    }

    public MapTypeAdapterFactory(ConstructorConstructor constructorConstructor, boolean z) {
        this.constructorConstructor = constructorConstructor;
        this.complexMapKeySerialization = z;
    }

    private TypeAdapter<?> getKeyAdapter(Gson gson, Type type2) {
        return (type2 == Boolean.TYPE || type2 == Boolean.class) ? TypeAdapters.BOOLEAN_AS_STRING : gson.getAdapter(TypeToken.get(type2));
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type type2 = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] mapKeyAndValueTypes = GsonTypes.getMapKeyAndValueTypes(type2, rawType);
        Type type3 = mapKeyAndValueTypes[0];
        Type type4 = mapKeyAndValueTypes[1];
        return new Adapter(new TypeAdapterRuntimeTypeWrapper(gson, getKeyAdapter(gson, type3), type3), new TypeAdapterRuntimeTypeWrapper(gson, gson.getAdapter(TypeToken.get(type4)), type4), this.constructorConstructor.get(typeToken, false));
    }
}
