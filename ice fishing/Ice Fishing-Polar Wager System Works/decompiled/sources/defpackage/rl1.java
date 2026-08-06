package defpackage;

/* loaded from: classes.dex */
public final class rl1 {
    public final long IHQe1A4L2xu;

    public static final long F7NU4MC0GW(long j, long j2) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) - java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static long IHQe1A4L2xu(long j, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = java.lang.Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public static final long adDC3e2L(long j, long j2) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j2 >> 32)) + java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)) + java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final float oh6vYeIP(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float r1MBDhnF(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static java.lang.String xiZrDbcSW0(long j) {
        return "(" + oh6vYeIP(j) + ", " + r1MBDhnF(j) + ") px/sec";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.rl1) {
            return this.IHQe1A4L2xu == ((defpackage.rl1) obj).IHQe1A4L2xu;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.IHQe1A4L2xu);
    }

    public final java.lang.String toString() {
        return xiZrDbcSW0(this.IHQe1A4L2xu);
    }
}
