package com.google.gson.internal;

import com.google.gson.ExclusionStrategy;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import defpackage.xq0;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class Excluder implements TypeAdapterFactory, Cloneable {
    public static final Excluder c = new Excluder();
    public List a;
    public List b;

    public Excluder() {
        List list = Collections.EMPTY_LIST;
        this.a = list;
        this.b = list;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter b(final Gson gson, final TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        final boolean d = d(rawType, true);
        final boolean d2 = d(rawType, false);
        if (d || d2) {
            return new TypeAdapter<Object>() { // from class: com.google.gson.internal.Excluder.1
                public volatile TypeAdapter a;

                @Override // com.google.gson.TypeAdapter
                public final Object b(JsonReader jsonReader) {
                    if (d2) {
                        jsonReader.w();
                        return null;
                    }
                    TypeAdapter typeAdapter = this.a;
                    if (typeAdapter == null) {
                        typeAdapter = gson.g(Excluder.this, typeToken);
                        this.a = typeAdapter;
                    }
                    return typeAdapter.b(jsonReader);
                }

                @Override // com.google.gson.TypeAdapter
                public final void c(JsonWriter jsonWriter, Object obj) {
                    if (d) {
                        jsonWriter.l0();
                        return;
                    }
                    TypeAdapter typeAdapter = this.a;
                    if (typeAdapter == null) {
                        typeAdapter = gson.g(Excluder.this, typeToken);
                        this.a = typeAdapter;
                    }
                    typeAdapter.c(jsonWriter, obj);
                }
            };
        }
        return null;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            xq0.w(e);
            return null;
        }
    }

    public final boolean d(Class cls, boolean z) {
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            ReflectionHelper.RecordHelper recordHelper = ReflectionHelper.a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z ? this.a : this.b).iterator();
        while (it.hasNext()) {
            ((ExclusionStrategy) it.next()).getClass();
        }
        return false;
    }
}
