package defpackage;

/* loaded from: classes.dex */
public final class z91 {
    public final long IHQe1A4L2xu;

    public static java.lang.String F7NU4MC0GW(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + defpackage.s21.sJNB7mCer5(java.lang.Float.intBitsToFloat((int) (j >> 32))) + ", " + defpackage.s21.sJNB7mCer5(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public static final boolean IHQe1A4L2xu(long j, long j2) {
        return j == j2;
    }

    public static final float oh6vYeIP(long j) {
        return java.lang.Math.min(java.lang.Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), java.lang.Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final boolean r1MBDhnF(long j) {
        return (j == 9205357640488583168L) | (java.lang.Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.z91) {
            return this.IHQe1A4L2xu == ((defpackage.z91) obj).IHQe1A4L2xu;
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
