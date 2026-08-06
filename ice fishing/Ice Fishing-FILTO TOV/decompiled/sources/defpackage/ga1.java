package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ga1 {
    public static final /* synthetic */ int X1lG3V04pd = 0;
    public static final long Yi7zF1RB1 = (Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L);
    public final long GWasM1elztuh;

    public static final boolean GWasM1elztuh(long j, long j2) {
        return j == j2;
    }

    public static String Yi7zF1RB1(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ga1) {
            return this.GWasM1elztuh == ((ga1) obj).GWasM1elztuh;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.GWasM1elztuh);
    }

    public final String toString() {
        return Yi7zF1RB1(this.GWasM1elztuh);
    }
}
