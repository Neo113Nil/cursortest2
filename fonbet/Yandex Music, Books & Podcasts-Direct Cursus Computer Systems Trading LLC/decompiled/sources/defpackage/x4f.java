package defpackage;

/* loaded from: classes5.dex */
public abstract class x4f {
    public static final ome a;

    static {
        ff7.N(ekr.a);
        a = n7w.s(tkr.a, "kotlinx.serialization.json.JsonUnquotedLiteral");
    }

    public static final v6f a(Boolean bool) {
        return bool == null ? m5f.INSTANCE : new j5f(bool, false, null);
    }

    public static final v6f b(Number number) {
        return number == null ? m5f.INSTANCE : new j5f(number, false, null);
    }

    public static final v6f c(String str) {
        return str == null ? m5f.INSTANCE : new j5f(str, true, null);
    }

    public static final void d(w4f w4fVar, String str) {
        throw new IllegalArgumentException("Element " + ern.a(w4fVar.getClass()) + " is not a " + str);
    }

    public static final Integer e(v6f v6fVar) {
        Long l;
        v6fVar.getClass();
        try {
            l = Long.valueOf(i(v6fVar));
        } catch (u4f unused) {
            l = null;
        }
        if (l != null) {
            long longValue = l.longValue();
            if (-2147483648L <= longValue && longValue <= 2147483647L) {
                return Integer.valueOf((int) longValue);
            }
        }
        return null;
    }

    public static final q5f f(w4f w4fVar) {
        w4fVar.getClass();
        q5f q5fVar = w4fVar instanceof q5f ? (q5f) w4fVar : null;
        if (q5fVar != null) {
            return q5fVar;
        }
        d(w4fVar, "JsonObject");
        throw null;
    }

    public static final v6f g(w4f w4fVar) {
        w4fVar.getClass();
        v6f v6fVar = w4fVar instanceof v6f ? (v6f) w4fVar : null;
        if (v6fVar != null) {
            return v6fVar;
        }
        d(w4fVar, "JsonPrimitive");
        throw null;
    }

    public static final Long h(v6f v6fVar) {
        v6fVar.getClass();
        try {
            return Long.valueOf(i(v6fVar));
        } catch (u4f unused) {
            return null;
        }
    }

    public static final long i(v6f v6fVar) {
        v6fVar.getClass();
        kkr kkrVar = new kkr(v6fVar.a());
        long i = kkrVar.i();
        if (kkrVar.f() == 10) {
            return i;
        }
        int i2 = kkrVar.b;
        int i3 = i2 - 1;
        String str = kkrVar.f;
        y6.q(kkrVar, hrg.q("Expected input to contain a single valid number, but got '", (i2 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3)), "' after it"), i3, null, 4);
        throw null;
    }
}
