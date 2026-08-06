package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class r50 {
    public final int GWasM1elztuh;
    public final boolean X1lG3V04pd;
    public final int Yi7zF1RB1;

    public r50(int i, int i2, boolean z) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = i2;
        this.X1lG3V04pd = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r50)) {
            return false;
        }
        r50 r50Var = (r50) obj;
        return this.GWasM1elztuh == r50Var.GWasM1elztuh && this.Yi7zF1RB1 == r50Var.Yi7zF1RB1 && this.X1lG3V04pd == r50Var.X1lG3V04pd;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.X1lG3V04pd) + mr0.Yi7zF1RB1(this.Yi7zF1RB1, Integer.hashCode(this.GWasM1elztuh) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.GWasM1elztuh + ", end=" + this.Yi7zF1RB1 + ", isRtl=" + this.X1lG3V04pd + ')';
    }
}
