package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class y20 {
    public static final y20 OOA6hdeuvCS = new y20(0, 0, 0, 0);
    public final int GWasM1elztuh;
    public final int X1lG3V04pd;
    public final int Yi7zF1RB1;
    public final int xqGvceK5x;

    public y20(int i, int i2, int i3, int i4) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = i2;
        this.X1lG3V04pd = i3;
        this.xqGvceK5x = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y20)) {
            return false;
        }
        y20 y20Var = (y20) obj;
        return this.GWasM1elztuh == y20Var.GWasM1elztuh && this.Yi7zF1RB1 == y20Var.Yi7zF1RB1 && this.X1lG3V04pd == y20Var.X1lG3V04pd && this.xqGvceK5x == y20Var.xqGvceK5x;
    }

    public final int hashCode() {
        return Integer.hashCode(this.xqGvceK5x) + mr0.Yi7zF1RB1(this.X1lG3V04pd, mr0.Yi7zF1RB1(this.Yi7zF1RB1, Integer.hashCode(this.GWasM1elztuh) * 31, 31), 31);
    }

    public final String toString() {
        return "IntRect.fromLTRB(" + this.GWasM1elztuh + ", " + this.Yi7zF1RB1 + ", " + this.X1lG3V04pd + ", " + this.xqGvceK5x + ')';
    }
}
