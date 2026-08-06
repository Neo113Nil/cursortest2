package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class t21 {
    public final long GWasM1elztuh;

    public static final boolean GWasM1elztuh(long j, long j2) {
        return j == j2;
    }

    public static final boolean X1lG3V04pd(long j) {
        return (j == 9205357640488583168L) | (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
    }

    public static final float Yi7zF1RB1(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static String xqGvceK5x(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + fb1.ZCWXqiC0(Float.intBitsToFloat((int) (j >> 32))) + ", " + fb1.ZCWXqiC0(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t21) {
            return this.GWasM1elztuh == ((t21) obj).GWasM1elztuh;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.GWasM1elztuh);
    }

    public final String toString() {
        return xqGvceK5x(this.GWasM1elztuh);
    }
}
