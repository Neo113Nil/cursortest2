package defpackage;

import com.google.gson.internal.LazilyParsedNumber;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes11.dex */
public abstract class um11 {
    public static final ln60 A;
    public static final jm11 B;
    public static final jm11 C;
    public static final q4o D;
    public static final jm11 a = new jm11(Class.class, new zl11().nullSafe(), 0);
    public static final jm11 b = new jm11(BitSet.class, new im11().nullSafe(), 0);
    public static final nm11 c;
    public static final km11 d;
    public static final km11 e;
    public static final km11 f;
    public static final km11 g;
    public static final jm11 h;
    public static final jm11 i;
    public static final jm11 j;
    public static final sl11 k;
    public static final tl11 l;
    public static final sm11 m;
    public static final sm11 n;
    public static final km11 o;
    public static final jm11 p;
    public static final jm11 q;
    public static final jm11 r;
    public static final jm11 s;
    public static final jm11 t;
    public static final jm11 u;
    public static final jm11 v;
    public static final jm11 w;
    public static final jm11 x;
    public static final jm11 y;
    public static final jm11 z;

    static {
        mm11 mm11Var = new mm11();
        c = new nm11();
        d = new km11(Boolean.TYPE, Boolean.class, mm11Var);
        e = new km11(Byte.TYPE, Byte.class, new om11());
        f = new km11(Short.TYPE, Short.class, new pm11());
        g = new km11(Integer.TYPE, Integer.class, new qm11());
        h = new jm11(AtomicInteger.class, new rm11().nullSafe(), 0);
        i = new jm11(AtomicBoolean.class, new pl11().nullSafe(), 0);
        j = new jm11(AtomicIntegerArray.class, new ql11().nullSafe(), 0);
        k = new sl11();
        l = new tl11();
        new sm11(false, 1);
        m = new sm11(true, 1);
        new sm11(false, 0);
        n = new sm11(true, 0);
        o = new km11(Character.TYPE, Character.class, new ul11());
        vl11 vl11Var = new vl11();
        p = new jm11(BigDecimal.class, new wl11(), 0);
        q = new jm11(BigInteger.class, new xl11(), 0);
        r = new jm11(LazilyParsedNumber.class, new yl11(), 0);
        s = new jm11(String.class, vl11Var, 0);
        t = new jm11(StringBuilder.class, new am11(), 0);
        u = new jm11(StringBuffer.class, new bm11(), 0);
        v = new jm11(URL.class, new cm11(), 0);
        w = new jm11(URI.class, new dm11(), 0);
        x = new jm11(InetAddress.class, new em11(), 1);
        y = new jm11(UUID.class, new fm11(), 0);
        z = new jm11(Currency.class, new gm11().nullSafe(), 0);
        A = new ln60(2, new f7x(new String[]{"year", "month", "dayOfMonth", "hourOfDay", "minute", "second"}, 8));
        B = new jm11(Locale.class, new hm11(), 0);
        C = new jm11(pcx.class, ucx.a, 1);
        D = r4o.d;
    }

    public static void a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public static int b(long j2) {
        int i2 = (int) j2;
        if (i2 == j2) {
            return i2;
        }
        ny61.g(qv10.j(j2, "Too big for an int: "));
        return 0;
    }
}
