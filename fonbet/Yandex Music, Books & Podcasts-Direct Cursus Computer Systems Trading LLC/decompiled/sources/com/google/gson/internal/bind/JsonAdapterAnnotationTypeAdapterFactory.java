package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.reflect.TypeToken;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements TypeAdapterFactory {
    public static final TypeAdapterFactory c;
    public static final TypeAdapterFactory d;
    public final ConstructorConstructor a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        int i = 0;
        c = new DummyTypeAdapterFactory(i);
        d = new DummyTypeAdapterFactory(i);
    }

    public JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.a = constructorConstructor;
    }

    public final TypeAdapter a(ConstructorConstructor constructorConstructor, Gson gson, TypeToken typeToken, JsonAdapter jsonAdapter, boolean z) {
        TypeAdapter typeAdapter;
        Object f = constructorConstructor.b(TypeToken.get(jsonAdapter.value()), true).f();
        boolean nullSafe = jsonAdapter.nullSafe();
        if (f instanceof TypeAdapter) {
            typeAdapter = (TypeAdapter) f;
        } else if (f instanceof TypeAdapterFactory) {
            TypeAdapterFactory typeAdapterFactory = (TypeAdapterFactory) f;
            if (z) {
                TypeAdapterFactory typeAdapterFactory2 = (TypeAdapterFactory) this.b.putIfAbsent(typeToken.getRawType(), typeAdapterFactory);
                if (typeAdapterFactory2 != null) {
                    typeAdapterFactory = typeAdapterFactory2;
                }
            }
            typeAdapter = typeAdapterFactory.b(gson, typeToken);
        } else {
            boolean z2 = f instanceof JsonSerializer;
            if (!z2 && !(f instanceof JsonDeserializer)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + f.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            TreeTypeAdapter treeTypeAdapter = new TreeTypeAdapter(z2 ? (JsonSerializer) f : null, f instanceof JsonDeserializer ? (JsonDeserializer) f : null, gson, typeToken, z ? c : d, nullSafe);
            nullSafe = false;
            typeAdapter = treeTypeAdapter;
        }
        return (typeAdapter == null || !nullSafe) ? typeAdapter : typeAdapter.a();
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter b(Gson gson, TypeToken typeToken) {
        JsonAdapter jsonAdapter = (JsonAdapter) typeToken.getRawType().getAnnotation(JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return a(this.a, gson, typeToken, jsonAdapter, true);
    }

    public static class DummyTypeAdapterFactory implements TypeAdapterFactory {
        private DummyTypeAdapterFactory() {
        }

        @Override // com.google.gson.TypeAdapterFactory
        public final TypeAdapter b(Gson gson, TypeToken typeToken) {
            throw new AssertionError("Factory should not be used");
        }

        public /* synthetic */ DummyTypeAdapterFactory(int i) {
            this();
        }
    }
}
