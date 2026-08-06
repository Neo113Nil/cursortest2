package defpackage;

/* loaded from: classes.dex */
public final class fg1 {
    public static final defpackage.gg1[] oh6vYeIP = {new defpackage.gg1(0), new defpackage.gg1(4294967296L), new defpackage.gg1(8589934592L)};
    public static final long r1MBDhnF = defpackage.e90.V7bD7b8KA(0, Float.NaN);
    public final long IHQe1A4L2xu;

    public static java.lang.String F7NU4MC0GW(long j) {
        long oh6vYeIP2 = oh6vYeIP(j);
        if (defpackage.gg1.IHQe1A4L2xu(oh6vYeIP2, 0L)) {
            return "Unspecified";
        }
        if (defpackage.gg1.IHQe1A4L2xu(oh6vYeIP2, 4294967296L)) {
            return r1MBDhnF(j) + ".sp";
        }
        if (!defpackage.gg1.IHQe1A4L2xu(oh6vYeIP2, 8589934592L)) {
            return "Invalid";
        }
        return r1MBDhnF(j) + ".em";
    }

    public static final boolean IHQe1A4L2xu(long j, long j2) {
        return j == j2;
    }

    public static final long oh6vYeIP(long j) {
        return oh6vYeIP[(int) ((j & 1095216660480L) >>> 32)].IHQe1A4L2xu;
    }

    public static final float r1MBDhnF(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.fg1) {
            return this.IHQe1A4L2xu == ((defpackage.fg1) obj).IHQe1A4L2xu;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.IHQe1A4L2xu);
    }

    public final java.lang.String toString() {
        return F7NU4MC0GW(this.IHQe1A4L2xu);
    }
}
