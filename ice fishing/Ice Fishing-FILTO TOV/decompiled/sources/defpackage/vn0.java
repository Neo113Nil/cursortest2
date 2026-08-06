package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class vn0 {
    public final f1 GWasM1elztuh;
    public final int X1lG3V04pd;
    public final int Yi7zF1RB1;

    public vn0(f1 f1Var, int i, int i2) {
        this.GWasM1elztuh = f1Var;
        this.Yi7zF1RB1 = i;
        this.X1lG3V04pd = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vn0) {
            vn0 vn0Var = (vn0) obj;
            if (this.GWasM1elztuh == vn0Var.GWasM1elztuh && this.Yi7zF1RB1 == vn0Var.Yi7zF1RB1 && this.X1lG3V04pd == vn0Var.X1lG3V04pd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.X1lG3V04pd) + mr0.Yi7zF1RB1(this.Yi7zF1RB1, this.GWasM1elztuh.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.GWasM1elztuh + ", startIndex=" + this.Yi7zF1RB1 + ", endIndex=" + this.X1lG3V04pd + ')';
    }
}
