package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class u20 {
    public final long GWasM1elztuh;

    public static final boolean GWasM1elztuh(long j, long j2) {
        return j == j2;
    }

    public static final long X1lG3V04pd(long j, long j2) {
        return ((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public static final long Yi7zF1RB1(long j, long j2) {
        return ((((int) (j >> 32)) - ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u20) {
            return this.GWasM1elztuh == ((u20) obj).GWasM1elztuh;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.GWasM1elztuh);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.GWasM1elztuh;
        sb.append((int) (j >> 32));
        sb.append(", ");
        sb.append((int) (j & 4294967295L));
        sb.append(')');
        return sb.toString();
    }
}
