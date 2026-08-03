package e1;

import bc.a0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f1929a;

    public static long a(int i10, long j3) {
        return (Float.floatToRawIntBits((i10 & 1) != 0 ? Float.intBitsToFloat((int) (j3 >> 32)) : 0.0f) << 32) | (Float.floatToRawIntBits((i10 & 2) != 0 ? Float.intBitsToFloat((int) (j3 & 4294967295L)) : 0.0f) & 4294967295L);
    }

    public static final boolean b(long j3, long j6) {
        return j3 == j6;
    }

    public static final float c(long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        return (float) Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat));
    }

    public static final float d(long j3) {
        return Float.intBitsToFloat((int) (j3 >> 32));
    }

    public static final float e(long j3) {
        return Float.intBitsToFloat((int) (j3 & 4294967295L));
    }

    public static final long f(long j3, long j6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) - Float.intBitsToFloat((int) (j6 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) - Float.intBitsToFloat((int) (j6 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long g(long j3, long j6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) + Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) + Float.intBitsToFloat((int) (j3 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final long h(long j3, float f10) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) * f10;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) * f10;
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static String i(long j3) {
        if ((9223372034707292159L & j3) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + a0.L(Float.intBitsToFloat((int) (j3 >> 32))) + ", " + a0.L(Float.intBitsToFloat((int) (j3 & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f1929a == ((b) obj).f1929a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1929a);
    }

    public final String toString() {
        return i(this.f1929a);
    }
}
