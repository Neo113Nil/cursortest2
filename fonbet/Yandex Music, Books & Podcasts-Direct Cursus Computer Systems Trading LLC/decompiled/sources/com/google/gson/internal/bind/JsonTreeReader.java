package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import defpackage.wvs;
import defpackage.xq0;
import java.io.Reader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class JsonTreeReader extends JsonReader {
    public static final Reader D0 = new Reader() { // from class: com.google.gson.internal.bind.JsonTreeReader.1
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };
    public static final Object E0 = new Object();
    public int A0;
    public String[] B0;
    public int[] C0;
    public Object[] z0;

    /* renamed from: com.google.gson.internal.bind.JsonTreeReader$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            a = iArr;
            try {
                iArr[JsonToken.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonToken.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[JsonToken.END_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public JsonTreeReader(JsonElement jsonElement) {
        super(D0);
        this.z0 = new Object[32];
        this.A0 = 0;
        this.B0 = new String[32];
        this.C0 = new int[32];
        a1(jsonElement);
    }

    @Override // com.google.gson.stream.JsonReader
    public final void H() {
        V0(JsonToken.END_ARRAY);
        Z0();
        Z0();
        int i = this.A0;
        if (i > 0) {
            int[] iArr = this.C0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final JsonToken H0() {
        if (this.A0 == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object Y0 = Y0();
        if (Y0 instanceof Iterator) {
            boolean z = this.z0[this.A0 - 2] instanceof JsonObject;
            Iterator it = (Iterator) Y0;
            if (!it.hasNext()) {
                return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z) {
                return JsonToken.NAME;
            }
            a1(it.next());
            return H0();
        }
        if (Y0 instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (Y0 instanceof JsonArray) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (Y0 instanceof JsonPrimitive) {
            Serializable serializable = ((JsonPrimitive) Y0).a;
            if (serializable instanceof String) {
                return JsonToken.STRING;
            }
            if (serializable instanceof Boolean) {
                return JsonToken.BOOLEAN;
            }
            if (serializable instanceof Number) {
                return JsonToken.NUMBER;
            }
            wvs.b();
            return null;
        }
        if (Y0 instanceof JsonNull) {
            return JsonToken.NULL;
        }
        if (Y0 == E0) {
            xq0.q("JsonReader is closed");
            return null;
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + Y0.getClass().getName() + " is not supported");
    }

    @Override // com.google.gson.stream.JsonReader
    public final void I() {
        V0(JsonToken.END_OBJECT);
        this.B0[this.A0 - 1] = null;
        Z0();
        Z0();
        int i = this.A0;
        if (i > 0) {
            int[] iArr = this.C0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String L() {
        return X0(false);
    }

    public final String Q(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.A0;
            if (i >= i2) {
                return sb.toString();
            }
            Object[] objArr = this.z0;
            Object obj = objArr[i];
            if (obj instanceof JsonArray) {
                i++;
                if (i < i2 && (objArr[i] instanceof Iterator)) {
                    int i3 = this.C0[i];
                    if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                        i3--;
                    }
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                }
            } else if ((obj instanceof JsonObject) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                sb.append('.');
                String str = this.B0[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String R() {
        return Q(true);
    }

    public final void V0(JsonToken jsonToken) {
        if (H0() == jsonToken) {
            return;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(jsonToken);
        sb.append(" but was ");
        sb.append(H0());
        wvs.k(sb, W0());
    }

    public final String W0() {
        return " at path ".concat(Q(false));
    }

    public final String X0(boolean z) {
        V0(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) Y0()).next();
        String str = (String) entry.getKey();
        this.B0[this.A0 - 1] = z ? "<skipped>" : str;
        a1(entry.getValue());
        return str;
    }

    public final Object Y0() {
        return this.z0[this.A0 - 1];
    }

    public final Object Z0() {
        Object[] objArr = this.z0;
        int i = this.A0 - 1;
        this.A0 = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void a1(Object obj) {
        int i = this.A0;
        Object[] objArr = this.z0;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.z0 = Arrays.copyOf(objArr, i2);
            this.C0 = Arrays.copyOf(this.C0, i2);
            this.B0 = (String[]) Arrays.copyOf(this.B0, i2);
        }
        Object[] objArr2 = this.z0;
        int i3 = this.A0;
        this.A0 = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void b() {
        V0(JsonToken.BEGIN_ARRAY);
        a1(((JsonArray) Y0()).a.iterator());
        this.C0[this.A0 - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.z0 = new Object[]{E0};
        this.A0 = 1;
    }

    @Override // com.google.gson.stream.JsonReader
    public final String f0() {
        JsonToken H0 = H0();
        JsonToken jsonToken = JsonToken.STRING;
        if (H0 != jsonToken && H0 != JsonToken.NUMBER) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(jsonToken);
            sb.append(" but was ");
            sb.append(H0);
            wvs.k(sb, W0());
            return null;
        }
        String q = ((JsonPrimitive) Z0()).q();
        int i = this.A0;
        if (i > 0) {
            int[] iArr = this.C0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return q;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void g() {
        V0(JsonToken.BEGIN_OBJECT);
        a1(((JsonObject) Y0()).a.entrySet().iterator());
    }

    @Override // com.google.gson.stream.JsonReader
    public final String getPath() {
        return Q(false);
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean hasNext() {
        JsonToken H0 = H0();
        return (H0 == JsonToken.END_OBJECT || H0 == JsonToken.END_ARRAY || H0 == JsonToken.END_DOCUMENT) ? false : true;
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean nextBoolean() {
        V0(JsonToken.BOOLEAN);
        boolean s = ((JsonPrimitive) Z0()).s();
        int i = this.A0;
        if (i > 0) {
            int[] iArr = this.C0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return s;
    }

    @Override // com.google.gson.stream.JsonReader
    public final double nextDouble() {
        JsonToken H0 = H0();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (H0 != jsonToken && H0 != JsonToken.STRING) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(jsonToken);
            sb.append(" but was ");
            sb.append(H0);
            wvs.k(sb, W0());
            return 0.0d;
        }
        double t = ((JsonPrimitive) Y0()).t();
        if (!X() && (Double.isNaN(t) || Double.isInfinite(t))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + t);
        }
        Z0();
        int i = this.A0;
        if (i > 0) {
            int[] iArr = this.C0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return t;
    }

    @Override // com.google.gson.stream.JsonReader
    public final int nextInt() {
        JsonToken H0 = H0();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (H0 != jsonToken && H0 != JsonToken.STRING) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(jsonToken);
            sb.append(" but was ");
            sb.append(H0);
            wvs.k(sb, W0());
            return 0;
        }
        int a = ((JsonPrimitive) Y0()).a();
        Z0();
        int i = this.A0;
        if (i > 0) {
            int[] iArr = this.C0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return a;
    }

    @Override // com.google.gson.stream.JsonReader
    public final long nextLong() {
        JsonToken H0 = H0();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (H0 != jsonToken && H0 != JsonToken.STRING) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(jsonToken);
            sb.append(" but was ");
            sb.append(H0);
            wvs.k(sb, W0());
            return 0L;
        }
        long o = ((JsonPrimitive) Y0()).o();
        Z0();
        int i = this.A0;
        if (i > 0) {
            int[] iArr = this.C0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return o;
    }

    @Override // com.google.gson.stream.JsonReader
    public final String toString() {
        return "JsonTreeReader".concat(W0());
    }

    @Override // com.google.gson.stream.JsonReader
    public final void u0() {
        V0(JsonToken.NULL);
        Z0();
        int i = this.A0;
        if (i > 0) {
            int[] iArr = this.C0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final void w() {
        int i = AnonymousClass2.a[H0().ordinal()];
        if (i == 1) {
            X0(true);
            return;
        }
        if (i == 2) {
            H();
            return;
        }
        if (i == 3) {
            I();
            return;
        }
        if (i != 4) {
            Z0();
            int i2 = this.A0;
            if (i2 > 0) {
                int[] iArr = this.C0;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
        }
    }
}
