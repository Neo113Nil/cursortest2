package defpackage;

import kotlin.random.Random;

/* loaded from: classes9.dex */
public class y6i0 extends x6i0 {
    public static Comparable a(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2) < 0 ? comparable2 : comparable;
    }

    public static double b(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        ny61.g(unr0.q(oyr.u(d3, "Cannot coerce value to an empty range: maximum ", " is less than minimum "), d2, '.'));
        return 0.0d;
    }

    public static float c(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int d(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static int e(int i, a6c a6cVar) {
        if (a6cVar instanceof s5c) {
            return ((Number) h(Integer.valueOf(i), (s5c) a6cVar)).intValue();
        }
        if (!a6cVar.isEmpty()) {
            return i < ((Number) a6cVar.e()).intValue() ? ((Number) a6cVar.e()).intValue() : i > ((Number) a6cVar.d()).intValue() ? ((Number) a6cVar.d()).intValue() : i;
        }
        vg10.h("Cannot coerce value to an empty range: ", a6cVar, 46);
        return 0;
    }

    public static long f(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        ny61.g(b64.o(unr0.w(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum "), j2, '.'));
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long g(long j, imz imzVar) {
        if (imzVar instanceof s5c) {
            return ((Number) h(Long.valueOf(j), (s5c) imzVar)).longValue();
        }
        if (!imzVar.isEmpty()) {
            return j < ((Number) imzVar.e()).longValue() ? ((Number) imzVar.e()).longValue() : j > ((Number) imzVar.d()).longValue() ? ((Number) imzVar.d()).longValue() : j;
        }
        vg10.h("Cannot coerce value to an empty range: ", imzVar, 46);
        return 0L;
    }

    public static Comparable h(Comparable comparable, s5c s5cVar) {
        if (!s5cVar.isEmpty()) {
            return (!s5cVar.a(comparable, s5cVar.e()) || s5cVar.a(s5cVar.e(), comparable)) ? (!s5cVar.a(s5cVar.d(), comparable) || s5cVar.a(comparable, s5cVar.d())) ? comparable : s5cVar.d() : s5cVar.e();
        }
        vg10.h("Cannot coerce value to an empty range: ", s5cVar, 46);
        return null;
    }

    public static b6w i(int i, int i2) {
        return new b6w(i, i2, -1);
    }

    public static int j(d6w d6wVar, Random random) {
        try {
            return gga1.i(d6wVar, random);
        } catch (IllegalArgumentException e) {
            w511.i(e.getMessage());
            return 0;
        }
    }

    public static long k(imz imzVar, Random random) {
        try {
            return gga1.j(imzVar, random);
        } catch (IllegalArgumentException e) {
            w511.i(e.getMessage());
            return 0L;
        }
    }

    public static b6w l(d6w d6wVar) {
        return new b6w(d6wVar.b, d6wVar.a, -d6wVar.c);
    }

    public static b6w m(b6w b6wVar, int i) {
        boolean z = i > 0;
        Integer valueOf = Integer.valueOf(i);
        if (!z) {
            vg10.h("Step must be positive, was: ", valueOf, 46);
            return null;
        }
        int i2 = b6wVar.a;
        int i3 = b6wVar.b;
        if (b6wVar.c <= 0) {
            i = -i;
        }
        return new b6w(i2, i3, i);
    }

    public static d6w n(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new d6w(i, i2 - 1, 1);
        }
        d6w d6wVar = d6w.w;
        return d6w.w;
    }
}
