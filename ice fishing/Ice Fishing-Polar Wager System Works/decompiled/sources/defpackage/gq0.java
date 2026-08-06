package defpackage;

/* loaded from: classes.dex */
public final class gq0 {
    public final long IHQe1A4L2xu;

    public static java.lang.String AARZUJiTa(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + defpackage.s21.sJNB7mCer5(java.lang.Float.intBitsToFloat((int) (j >> 32))) + ", " + defpackage.s21.sJNB7mCer5(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public static final long F7NU4MC0GW(long j, long j2) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) - java.lang.Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static long IHQe1A4L2xu(int i, long j) {
        return (java.lang.Float.floatToRawIntBits((i & 1) != 0 ? java.lang.Float.intBitsToFloat((int) (j >> 32)) : 0.0f) << 32) | (java.lang.Float.floatToRawIntBits((i & 2) != 0 ? java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) : 0.0f) & 4294967295L);
    }

    public static final long adDC3e2L(long j, long j2) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j2 >> 32)) + java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)) + java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final boolean oh6vYeIP(long j, long j2) {
        return j == j2;
    }

    public static final float r1MBDhnF(long j) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return (float) java.lang.Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat));
    }

    public static final long xiZrDbcSW0(long j, float f) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) * f;
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.gq0) {
            return this.IHQe1A4L2xu == ((defpackage.gq0) obj).IHQe1A4L2xu;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.IHQe1A4L2xu);
    }

    public final java.lang.String toString() {
        return AARZUJiTa(this.IHQe1A4L2xu);
    }
}
