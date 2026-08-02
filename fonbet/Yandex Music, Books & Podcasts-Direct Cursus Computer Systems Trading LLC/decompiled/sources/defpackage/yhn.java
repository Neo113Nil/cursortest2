package defpackage;

import kotlin.ranges.IntRange;
import kotlin.ranges.a;

/* loaded from: classes5.dex */
public class yhn extends xhn {
    public static Comparable a(cma cmaVar, cma cmaVar2) {
        return cmaVar.compareTo(cmaVar2) < 0 ? cmaVar2 : cmaVar;
    }

    public static double b(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
        sb.append(d3);
        sb.append(" is less than minimum ");
        xq0.x(k5r.n(sb, d2, '.'));
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

    /* JADX WARN: Multi-variable type inference failed */
    public static int e(int i, IntRange intRange) {
        int i2 = intRange.b;
        int i3 = intRange.a;
        if (intRange instanceof gq4) {
            return ((Number) h(Integer.valueOf(i), (gq4) intRange)).intValue();
        }
        if (!intRange.isEmpty()) {
            return i < Integer.valueOf(i3).intValue() ? Integer.valueOf(i3).intValue() : i > Integer.valueOf(i2).intValue() ? Integer.valueOf(i2).intValue() : i;
        }
        l1j.q(intRange, "Cannot coerce value to an empty range: ");
        return 0;
    }

    public static long f(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        xq0.x(eta.g(tlm.l(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum "), j2, '.'));
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long g(long j, lvg lvgVar) {
        long j2 = lvgVar.b;
        long j3 = lvgVar.a;
        if (lvgVar instanceof gq4) {
            return ((Number) h(Long.valueOf(j), (gq4) lvgVar)).longValue();
        }
        if (!lvgVar.isEmpty()) {
            return j < Long.valueOf(j3).longValue() ? Long.valueOf(j3).longValue() : j > Long.valueOf(j2).longValue() ? Long.valueOf(j2).longValue() : j;
        }
        l1j.q(lvgVar, "Cannot coerce value to an empty range: ");
        return 0L;
    }

    public static Comparable h(Comparable comparable, gq4 gq4Var) {
        if (!gq4Var.isEmpty()) {
            return (!gq4Var.a(comparable, gq4Var.g()) || gq4Var.a(gq4Var.g(), comparable)) ? (!gq4Var.a(gq4Var.m(), comparable) || gq4Var.a(comparable, gq4Var.m())) ? comparable : gq4Var.m() : gq4Var.g();
        }
        l1j.q(gq4Var, "Cannot coerce value to an empty range: ");
        return null;
    }

    public static Comparable i(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        if (comparable2 == null || comparable3 == null) {
            if (comparable2 != null && comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable3 != null && comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        } else {
            if (comparable2.compareTo(comparable3) > 0) {
                xq0.r("Cannot coerce value to an empty range: maximum ", comparable3, " is less than minimum ", comparable2, 46);
                return null;
            }
            if (comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        }
        return comparable;
    }

    public static int j(IntRange intRange, ohn ohnVar) {
        ohnVar.getClass();
        try {
            return ldg.A(ohnVar, intRange);
        } catch (IllegalArgumentException e) {
            wvs.h(e.getMessage());
            return 0;
        }
    }

    public static a k(IntRange intRange) {
        xpe xpeVar = a.d;
        int i = intRange.b;
        int i2 = intRange.a;
        int i3 = -intRange.c;
        xpeVar.getClass();
        return new a(i, i2, i3);
    }

    public static a l(int i, IntRange intRange) {
        intRange.getClass();
        boolean z = i > 0;
        Integer valueOf = Integer.valueOf(i);
        if (!z) {
            l1j.q(valueOf, "Step must be positive, was: ");
            return null;
        }
        xpe xpeVar = a.d;
        int i2 = intRange.a;
        int i3 = intRange.b;
        if (intRange.c <= 0) {
            i = -i;
        }
        xpeVar.getClass();
        return new a(i2, i3, i);
    }

    public static IntRange m(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new IntRange(i, i2 - 1, 1);
        }
        IntRange.e.getClass();
        return IntRange.f;
    }
}
