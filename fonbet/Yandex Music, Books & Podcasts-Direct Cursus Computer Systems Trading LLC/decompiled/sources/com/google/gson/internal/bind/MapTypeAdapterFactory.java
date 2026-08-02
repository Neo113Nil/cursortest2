package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.GsonPreconditions;
import com.google.gson.internal.GsonTypes;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import defpackage.hrg;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes3.dex */
public final class MapTypeAdapterFactory implements TypeAdapterFactory {
    public final ConstructorConstructor a;

    public final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {
        public final TypeAdapter a;
        public final TypeAdapter b;
        public final ObjectConstructor c;

        public Adapter(MapTypeAdapterFactory mapTypeAdapterFactory, TypeAdapter typeAdapter, TypeAdapter typeAdapter2, ObjectConstructor objectConstructor) {
            this.a = typeAdapter;
            this.b = typeAdapter2;
            this.c = objectConstructor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        public final Object b(JsonReader jsonReader) {
            JsonToken H0 = jsonReader.H0();
            if (H0 == JsonToken.NULL) {
                jsonReader.u0();
                return null;
            }
            Map map = (Map) this.c.f();
            if (H0 != JsonToken.BEGIN_ARRAY) {
                jsonReader.g();
                while (jsonReader.hasNext()) {
                    JsonReaderInternalAccess.a.a(jsonReader);
                    Object b = ((TypeAdapterRuntimeTypeWrapper) this.a).b.b(jsonReader);
                    if (map.put(b, ((TypeAdapterRuntimeTypeWrapper) this.b).b.b(jsonReader)) != null) {
                        throw new JsonSyntaxException(hrg.n(b, "duplicate key: "));
                    }
                }
                jsonReader.I();
                return map;
            }
            jsonReader.b();
            while (jsonReader.hasNext()) {
                jsonReader.b();
                Object b2 = ((TypeAdapterRuntimeTypeWrapper) this.a).b.b(jsonReader);
                if (map.put(b2, ((TypeAdapterRuntimeTypeWrapper) this.b).b.b(jsonReader)) != null) {
                    throw new JsonSyntaxException(hrg.n(b2, "duplicate key: "));
                }
                jsonReader.H();
            }
            jsonReader.H();
            return map;
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(JsonWriter jsonWriter, Object obj) {
            Map map = (Map) obj;
            if (map == null) {
                jsonWriter.l0();
                return;
            }
            jsonWriter.z();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                jsonWriter.Y(String.valueOf(entry.getKey()));
                this.b.c(jsonWriter, entry.getValue());
            }
            jsonWriter.I();
        }
    }

    public MapTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.a = constructorConstructor;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter b(Gson gson, TypeToken typeToken) {
        Type[] actualTypeArguments;
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (Properties.class.isAssignableFrom(rawType)) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            GsonPreconditions.a(Map.class.isAssignableFrom(rawType));
            Type h = GsonTypes.h(type, rawType, GsonTypes.e(type, rawType, Map.class), new HashMap());
            actualTypeArguments = h instanceof ParameterizedType ? ((ParameterizedType) h).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        Type type3 = actualTypeArguments[1];
        return new Adapter(this, new TypeAdapterRuntimeTypeWrapper(gson, (type2 == Boolean.TYPE || type2 == Boolean.class) ? TypeAdapters.c : gson.f(TypeToken.get(type2)), type2), new TypeAdapterRuntimeTypeWrapper(gson, gson.f(TypeToken.get(type3)), type3), this.a.b(typeToken, false));
    }
}
