package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import defpackage.b6e;
import defpackage.kac;
import defpackage.rj7;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
class JsonElementTypeAdapter extends TypeAdapter<JsonElement> {
    public static final JsonElementTypeAdapter a = new JsonElementTypeAdapter();

    /* renamed from: com.google.gson.internal.bind.JsonElementTypeAdapter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
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

    private JsonElementTypeAdapter() {
    }

    public static JsonElement d(JsonReader jsonReader, JsonToken jsonToken) {
        int i = AnonymousClass1.a[jsonToken.ordinal()];
        if (i == 3) {
            return new JsonPrimitive(jsonReader.f0());
        }
        if (i == 4) {
            return new JsonPrimitive(new LazilyParsedNumber(jsonReader.f0()));
        }
        if (i == 5) {
            return new JsonPrimitive(Boolean.valueOf(jsonReader.nextBoolean()));
        }
        if (i == 6) {
            jsonReader.u0();
            return JsonNull.a;
        }
        b6e.u(jsonToken, "Unexpected token: ");
        return null;
    }

    public static JsonElement e(JsonReader jsonReader, JsonToken jsonToken) {
        int i = AnonymousClass1.a[jsonToken.ordinal()];
        if (i == 1) {
            jsonReader.b();
            return new JsonArray();
        }
        if (i != 2) {
            return null;
        }
        jsonReader.g();
        return new JsonObject();
    }

    public static void f(JsonElement jsonElement, JsonWriter jsonWriter) {
        if (jsonElement == null || (jsonElement instanceof JsonNull)) {
            jsonWriter.l0();
            return;
        }
        if (jsonElement instanceof JsonPrimitive) {
            JsonPrimitive n = jsonElement.n();
            Serializable serializable = n.a;
            if (serializable instanceof Number) {
                jsonWriter.T0(n.u());
                return;
            } else if (serializable instanceof Boolean) {
                jsonWriter.V0(n.s());
                return;
            } else {
                jsonWriter.U0(n.q());
                return;
            }
        }
        if (jsonElement instanceof JsonArray) {
            jsonWriter.o();
            Iterator it = jsonElement.g().a.iterator();
            while (it.hasNext()) {
                f((JsonElement) it.next(), jsonWriter);
            }
            jsonWriter.H();
            return;
        }
        if (!(jsonElement instanceof JsonObject)) {
            kac.l(jsonElement.getClass(), "Couldn't write ");
            return;
        }
        jsonWriter.z();
        for (Map.Entry entry : jsonElement.m().a.entrySet()) {
            jsonWriter.Y((String) entry.getKey());
            f((JsonElement) entry.getValue(), jsonWriter);
        }
        jsonWriter.I();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) {
        if (jsonReader instanceof JsonTreeReader) {
            JsonTreeReader jsonTreeReader = (JsonTreeReader) jsonReader;
            JsonToken H0 = jsonTreeReader.H0();
            if (H0 == JsonToken.NAME || H0 == JsonToken.END_ARRAY || H0 == JsonToken.END_OBJECT || H0 == JsonToken.END_DOCUMENT) {
                rj7.n(H0, " when reading a JsonElement.", "Unexpected ");
                return null;
            }
            JsonElement jsonElement = (JsonElement) jsonTreeReader.Y0();
            jsonTreeReader.w();
            return jsonElement;
        }
        JsonToken H02 = jsonReader.H0();
        JsonElement e = e(jsonReader, H02);
        if (e == null) {
            return d(jsonReader, H02);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                String L = e instanceof JsonObject ? jsonReader.L() : null;
                JsonToken H03 = jsonReader.H0();
                JsonElement e2 = e(jsonReader, H03);
                boolean z = e2 != null;
                if (e2 == null) {
                    e2 = d(jsonReader, H03);
                }
                if (e instanceof JsonArray) {
                    ((JsonArray) e).r(e2);
                } else {
                    ((JsonObject) e).r(L, e2);
                }
                if (z) {
                    arrayDeque.addLast(e);
                    e = e2;
                }
            } else {
                if (e instanceof JsonArray) {
                    jsonReader.H();
                } else {
                    jsonReader.I();
                }
                if (arrayDeque.isEmpty()) {
                    return e;
                }
                e = (JsonElement) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final /* bridge */ /* synthetic */ void c(JsonWriter jsonWriter, Object obj) {
        f((JsonElement) obj, jsonWriter);
    }
}
