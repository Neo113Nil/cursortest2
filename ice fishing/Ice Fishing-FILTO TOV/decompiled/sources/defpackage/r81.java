package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class r81 {
    public static final /* synthetic */ int X1lG3V04pd = 0;
    public static final long Yi7zF1RB1 = d70.EljAMC1QTz(0, 0);
    public final long GWasM1elztuh;

    public /* synthetic */ r81(long j) {
        this.GWasM1elztuh = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r81) {
            return this.GWasM1elztuh == ((r81) obj).GWasM1elztuh;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.GWasM1elztuh);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextRange(");
        long j = this.GWasM1elztuh;
        sb.append((int) (j >> 32));
        sb.append(", ");
        sb.append((int) (j & 4294967295L));
        sb.append(')');
        return sb.toString();
    }
}
