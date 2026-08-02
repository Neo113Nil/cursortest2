package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.ToNumberPolicy;
import com.google.gson.ToNumberStrategy;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import defpackage.b6e;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ObjectTypeAdapter extends TypeAdapter<Object> {
    public static final TypeAdapterFactory c = new AnonymousClass1(ToNumberPolicy.a);
    public final Gson a;
    public final ToNumberStrategy b;

    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$1, reason: invalid class name */
    class AnonymousClass1 implements TypeAdapterFactory {
        public final /* synthetic */ ToNumberStrategy a;

        public AnonymousClass1(ToNumberStrategy toNumberStrategy) {
            this.a = toNumberStrategy;
        }

        @Override // com.google.gson.TypeAdapterFactory
        public final TypeAdapter b(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == Object.class) {
                return new ObjectTypeAdapter(gson, this.a);
            }
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ObjectTypeAdapter(Gson gson, ToNumberStrategy toNumberStrategy) {
        this.a = gson;
        this.b = toNumberStrategy;
    }

    public static TypeAdapterFactory d(ToNumberStrategy toNumberStrategy) {
        return toNumberStrategy == ToNumberPolicy.a ? c : new AnonymousClass1(toNumberStrategy);
    }

    public static Serializable f(JsonReader jsonReader, JsonToken jsonToken) {
        int i = AnonymousClass2.a[jsonToken.ordinal()];
        if (i == 1) {
            jsonReader.b();
            return new ArrayList();
        }
        if (i != 2) {
            return null;
        }
        jsonReader.g();
        return new LinkedTreeMap(true);
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) {
        JsonToken H0 = jsonReader.H0();
        Object f = f(jsonReader, H0);
        if (f == null) {
            return e(jsonReader, H0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                String L = f instanceof Map ? jsonReader.L() : null;
                JsonToken H02 = jsonReader.H0();
                Serializable f2 = f(jsonReader, H02);
                boolean z = f2 != null;
                if (f2 == null) {
                    f2 = e(jsonReader, H02);
                }
                if (f instanceof List) {
                    ((List) f).add(f2);
                } else {
                    ((Map) f).put(L, f2);
                }
                if (z) {
                    arrayDeque.addLast(f);
                    f = f2;
                }
            } else {
                if (f instanceof List) {
                    jsonReader.H();
                } else {
                    jsonReader.I();
                }
                if (arrayDeque.isEmpty()) {
                    return f;
                }
                f = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.l0();
            return;
        }
        Class<?> cls = obj.getClass();
        Gson gson = this.a;
        gson.getClass();
        TypeAdapter f = gson.f(TypeToken.get((Class) cls));
        if (!(f instanceof ObjectTypeAdapter)) {
            f.c(jsonWriter, obj);
        } else {
            jsonWriter.z();
            jsonWriter.I();
        }
    }

    public final Serializable e(JsonReader jsonReader, JsonToken jsonToken) {
        int i = AnonymousClass2.a[jsonToken.ordinal()];
        if (i == 3) {
            return jsonReader.f0();
        }
        if (i == 4) {
            return this.b.a(jsonReader);
        }
        if (i == 5) {
            return Boolean.valueOf(jsonReader.nextBoolean());
        }
        if (i == 6) {
            jsonReader.u0();
            return null;
        }
        b6e.u(jsonToken, "Unexpected token: ");
        return null;
    }
}
