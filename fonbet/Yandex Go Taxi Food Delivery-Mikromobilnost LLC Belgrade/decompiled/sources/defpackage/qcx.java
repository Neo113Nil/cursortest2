package defpackage;

import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes9.dex */
public abstract class qcx {
    public static final exv a = uh6.c("kotlinx.serialization.json.JsonUnquotedLiteral", auu0.a);

    public static final d a(Boolean bool) {
        return bool == null ? JsonNull.INSTANCE : new adx(bool, false, null);
    }

    public static final d b(Number number) {
        return number == null ? JsonNull.INSTANCE : new adx(number, false, null);
    }

    public static final d c(String str) {
        return str == null ? JsonNull.INSTANCE : new adx(str, true, null);
    }

    public static final void d(String str, b bVar) {
        throw new IllegalArgumentException("Element " + qoi0.a(bVar.getClass()) + " is not a " + str);
    }

    public static final boolean e(d dVar) {
        String a2 = dVar.a();
        String[] strArr = ytu0.a;
        Boolean bool = a2.equalsIgnoreCase("true") ? Boolean.TRUE : a2.equalsIgnoreCase("false") ? Boolean.FALSE : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException(dVar + " does not represent a Boolean");
    }

    public static final Boolean f(d dVar) {
        String a2 = dVar.a();
        String[] strArr = ytu0.a;
        if (a2.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (a2.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final String g(d dVar) {
        if (dVar instanceof JsonNull) {
            return null;
        }
        return dVar.a();
    }

    public static final double h(d dVar) {
        return Double.parseDouble(dVar.a());
    }

    public static final Double i(d dVar) {
        return avu0.i(dVar.a());
    }

    public static final int j(d dVar) {
        try {
            long p = p(dVar);
            if (-2147483648L <= p && p <= 2147483647L) {
                return (int) p;
            }
            throw new NumberFormatException(dVar.a() + " is not an Int");
        } catch (JsonDecodingException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static final Integer k(d dVar) {
        Long l;
        try {
            l = Long.valueOf(p(dVar));
        } catch (JsonDecodingException unused) {
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

    public static final a l(b bVar) {
        a aVar = bVar instanceof a ? (a) bVar : null;
        if (aVar != null) {
            return aVar;
        }
        d("JsonArray", bVar);
        throw null;
    }

    public static final c m(b bVar) {
        c cVar = bVar instanceof c ? (c) bVar : null;
        if (cVar != null) {
            return cVar;
        }
        d("JsonObject", bVar);
        throw null;
    }

    public static final d n(b bVar) {
        d dVar = bVar instanceof d ? (d) bVar : null;
        if (dVar != null) {
            return dVar;
        }
        d("JsonPrimitive", bVar);
        throw null;
    }

    public static final Long o(d dVar) {
        try {
            return Long.valueOf(p(dVar));
        } catch (JsonDecodingException unused) {
            return null;
        }
    }

    public static final long p(d dVar) {
        ltu0 d = ffx.d(sbx.d, dVar.a());
        String str = d.f;
        long i = d.i();
        if (d.f() == 10) {
            return i;
        }
        int i2 = d.b;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        b8.q(d, oyr.p("Expected input to contain a single valid number, but got '", (i2 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3)), "' after it"), i3, null, 4);
        throw null;
    }
}
