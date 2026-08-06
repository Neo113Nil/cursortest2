package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class en {
    public final long GWasM1elztuh;

    public final boolean equals(Object obj) {
        if (obj instanceof en) {
            return this.GWasM1elztuh == ((en) obj).GWasM1elztuh;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.GWasM1elztuh);
    }

    public final String toString() {
        long j = this.GWasM1elztuh;
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) cn.X1lG3V04pd(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) cn.X1lG3V04pd(Float.intBitsToFloat((int) (4294967295L & j)))) + ')';
    }
}
