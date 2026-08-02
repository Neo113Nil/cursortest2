package defpackage;

import com.google.gson.Strictness;
import com.google.gson.internal.a;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class rex extends wdx {
    public static final pex M = new pex();
    public static final Object N = new Object();
    public Object[] I;
    public int J;
    public String[] K;
    public int[] L;

    public rex(pcx pcxVar) {
        super(M);
        this.I = new Object[32];
        this.J = 0;
        this.K = new String[32];
        this.L = new int[32];
        x0(pcxVar);
    }

    @Override // defpackage.wdx
    public final void B0() {
        k0(JsonToken.NULL);
        w0();
        int i = this.J;
        if (i > 0) {
            int[] iArr = this.L;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.wdx
    public final JsonToken R() {
        if (this.J == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object v0 = v0();
        if (v0 instanceof Iterator) {
            boolean z = this.I[this.J - 2] instanceof jdx;
            Iterator it = (Iterator) v0;
            if (!it.hasNext()) {
                return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z) {
                return JsonToken.NAME;
            }
            x0(it.next());
            return R();
        }
        if (v0 instanceof jdx) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (v0 instanceof wbx) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (v0 instanceof rdx) {
            Serializable serializable = ((rdx) v0).a;
            if (serializable instanceof String) {
                return JsonToken.STRING;
            }
            if (serializable instanceof Boolean) {
                return JsonToken.BOOLEAN;
            }
            if (serializable instanceof Number) {
                return JsonToken.NUMBER;
            }
            ny61.w();
            return null;
        }
        if (v0 instanceof fdx) {
            return JsonToken.NULL;
        }
        if (v0 == N) {
            ny61.r("JsonReader is closed");
            return null;
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + v0.getClass().getName() + " is not supported");
    }

    @Override // defpackage.wdx
    public final void a() {
        k0(JsonToken.BEGIN_ARRAY);
        x0(((wbx) v0()).a.iterator());
        this.L[this.J - 1] = 0;
    }

    @Override // defpackage.wdx
    public final void c() {
        k0(JsonToken.BEGIN_OBJECT);
        x0(((a) ((jdx) v0()).a.entrySet()).iterator());
    }

    @Override // defpackage.wdx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.I = new Object[]{N};
        this.J = 1;
    }

    @Override // defpackage.wdx
    public final String getPath() {
        return n0(false);
    }

    @Override // defpackage.wdx
    public final boolean hasNext() {
        JsonToken R = R();
        return (R == JsonToken.END_OBJECT || R == JsonToken.END_ARRAY || R == JsonToken.END_DOCUMENT) ? false : true;
    }

    @Override // defpackage.wdx
    public final void k() {
        k0(JsonToken.END_ARRAY);
        w0();
        w0();
        int i = this.J;
        if (i > 0) {
            int[] iArr = this.L;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final void k0(JsonToken jsonToken) {
        if (R() == jsonToken) {
            return;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(jsonToken);
        sb.append(" but was ");
        sb.append(R());
        w511.o(sb, q0());
    }

    @Override // defpackage.wdx
    public final void n() {
        k0(JsonToken.END_OBJECT);
        this.K[this.J - 1] = null;
        w0();
        w0();
        int i = this.J;
        if (i > 0) {
            int[] iArr = this.L;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final String n0(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.J;
            if (i >= i2) {
                return sb.toString();
            }
            Object[] objArr = this.I;
            Object obj = objArr[i];
            if (obj instanceof wbx) {
                i++;
                if (i < i2 && (objArr[i] instanceof Iterator)) {
                    int i3 = this.L[i];
                    if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                        i3--;
                    }
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                }
            } else if ((obj instanceof jdx) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                sb.append('.');
                String str = this.K[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    @Override // defpackage.wdx
    public final boolean nextBoolean() {
        k0(JsonToken.BOOLEAN);
        boolean b = ((rdx) w0()).b();
        int i = this.J;
        if (i > 0) {
            int[] iArr = this.L;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return b;
    }

    @Override // defpackage.wdx
    public final double nextDouble() {
        JsonToken R = R();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (R != jsonToken && R != JsonToken.STRING) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(jsonToken);
            sb.append(" but was ");
            sb.append(R);
            w511.o(sb, q0());
            return 0.0d;
        }
        double d = ((rdx) v0()).d();
        if (this.b != Strictness.LENIENT && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + d);
        }
        w0();
        int i = this.J;
        if (i > 0) {
            int[] iArr = this.L;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return d;
    }

    @Override // defpackage.wdx
    public final int nextInt() {
        JsonToken R = R();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (R != jsonToken && R != JsonToken.STRING) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(jsonToken);
            sb.append(" but was ");
            sb.append(R);
            w511.o(sb, q0());
            return 0;
        }
        rdx rdxVar = (rdx) v0();
        int intValue = rdxVar.a instanceof Number ? rdxVar.e().intValue() : Integer.parseInt(rdxVar.f());
        w0();
        int i = this.J;
        if (i > 0) {
            int[] iArr = this.L;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return intValue;
    }

    @Override // defpackage.wdx
    public final long nextLong() {
        JsonToken R = R();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (R != jsonToken && R != JsonToken.STRING) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(jsonToken);
            sb.append(" but was ");
            sb.append(R);
            w511.o(sb, q0());
            return 0L;
        }
        rdx rdxVar = (rdx) v0();
        long longValue = rdxVar.a instanceof Number ? rdxVar.e().longValue() : Long.parseLong(rdxVar.f());
        w0();
        int i = this.J;
        if (i > 0) {
            int[] iArr = this.L;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return longValue;
    }

    @Override // defpackage.wdx
    public final String nextName() {
        return u0(false);
    }

    @Override // defpackage.wdx
    public final String nextString() {
        JsonToken R = R();
        JsonToken jsonToken = JsonToken.STRING;
        if (R != jsonToken && R != JsonToken.NUMBER) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(jsonToken);
            sb.append(" but was ");
            sb.append(R);
            w511.o(sb, q0());
            return null;
        }
        String f = ((rdx) w0()).f();
        int i = this.J;
        if (i > 0) {
            int[] iArr = this.L;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return f;
    }

    public final String q0() {
        return " at path ".concat(n0(false));
    }

    @Override // defpackage.wdx
    public final void skipValue() {
        int i = qex.a[R().ordinal()];
        if (i == 1) {
            u0(true);
            return;
        }
        if (i == 2) {
            k();
            return;
        }
        if (i == 3) {
            n();
            return;
        }
        if (i != 4) {
            w0();
            int i2 = this.J;
            if (i2 > 0) {
                int[] iArr = this.L;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
        }
    }

    @Override // defpackage.wdx
    public final String toString() {
        return rex.class.getSimpleName().concat(q0());
    }

    public final String u0(boolean z) {
        k0(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) v0()).next();
        String str = (String) entry.getKey();
        this.K[this.J - 1] = z ? "<skipped>" : str;
        x0(entry.getValue());
        return str;
    }

    public final Object v0() {
        return this.I[this.J - 1];
    }

    @Override // defpackage.wdx
    public final String w() {
        return n0(true);
    }

    public final Object w0() {
        Object[] objArr = this.I;
        int i = this.J - 1;
        this.J = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void x0(Object obj) {
        int i = this.J;
        Object[] objArr = this.I;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.I = Arrays.copyOf(objArr, i2);
            this.L = Arrays.copyOf(this.L, i2);
            this.K = (String[]) Arrays.copyOf(this.K, i2);
        }
        Object[] objArr2 = this.I;
        int i3 = this.J;
        this.J = i3 + 1;
        objArr2[i3] = obj;
    }
}
