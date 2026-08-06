package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class uk0 {
    public final long GWasM1elztuh;

    public /* synthetic */ uk0(long j) {
        this.GWasM1elztuh = j;
    }

    public static String AvO7iQsrTN(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + fb1.ZCWXqiC0(Float.intBitsToFloat((int) (j >> 32))) + ", " + fb1.ZCWXqiC0(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public static final long EljAMC1QTz(float f, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static long GWasM1elztuh(long j, float f, int i) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits((i & 2) != 0 ? Float.intBitsToFloat((int) (j & 4294967295L)) : 0.0f) & 4294967295L);
    }

    public static final long OOA6hdeuvCS(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final float X1lG3V04pd(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (float) Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat));
    }

    public static final boolean Yi7zF1RB1(long j, long j2) {
        return j == j2;
    }

    public static final long xqGvceK5x(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uk0) {
            return this.GWasM1elztuh == ((uk0) obj).GWasM1elztuh;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.GWasM1elztuh);
    }

    public final String toString() {
        return AvO7iQsrTN(this.GWasM1elztuh);
    }
}
