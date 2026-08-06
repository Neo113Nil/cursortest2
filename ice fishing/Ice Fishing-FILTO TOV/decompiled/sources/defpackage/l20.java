package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class l20 {
    public final int GWasM1elztuh;
    public final int X1lG3V04pd;
    public final int Yi7zF1RB1;
    public final int xqGvceK5x;

    public l20(int i, int i2, int i3, int i4) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = i2;
        this.X1lG3V04pd = i3;
        this.xqGvceK5x = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l20)) {
            return false;
        }
        l20 l20Var = (l20) obj;
        return this.GWasM1elztuh == l20Var.GWasM1elztuh && this.Yi7zF1RB1 == l20Var.Yi7zF1RB1 && this.X1lG3V04pd == l20Var.X1lG3V04pd && this.xqGvceK5x == l20Var.xqGvceK5x;
    }

    public final int hashCode() {
        return (((((this.GWasM1elztuh * 31) + this.Yi7zF1RB1) * 31) + this.X1lG3V04pd) * 31) + this.xqGvceK5x;
    }

    public final String toString() {
        return "InsetsValues(left=" + this.GWasM1elztuh + ", top=" + this.Yi7zF1RB1 + ", right=" + this.X1lG3V04pd + ", bottom=" + this.xqGvceK5x + ')';
    }
}
