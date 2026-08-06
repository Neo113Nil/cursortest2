package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class i90 {
    public final int GWasM1elztuh;
    public final String OOA6hdeuvCS;
    public final int X1lG3V04pd;
    public final int Yi7zF1RB1;
    public final boolean xqGvceK5x;

    public i90(int i, int i2, int i3, boolean z, String str) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = i2;
        this.X1lG3V04pd = i3;
        this.xqGvceK5x = z;
        this.OOA6hdeuvCS = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i90)) {
            return false;
        }
        i90 i90Var = (i90) obj;
        return this.GWasM1elztuh == i90Var.GWasM1elztuh && this.Yi7zF1RB1 == i90Var.Yi7zF1RB1 && this.X1lG3V04pd == i90Var.X1lG3V04pd && this.xqGvceK5x == i90Var.xqGvceK5x && this.OOA6hdeuvCS.equals(i90Var.OOA6hdeuvCS);
    }

    public final int hashCode() {
        return this.OOA6hdeuvCS.hashCode() + mr0.xqGvceK5x(mr0.Yi7zF1RB1(this.X1lG3V04pd, mr0.Yi7zF1RB1(this.Yi7zF1RB1, Integer.hashCode(this.GWasM1elztuh) * 31, 31), 31), 31, this.xqGvceK5x);
    }

    public final String toString() {
        return "LevelCell(index=" + this.GWasM1elztuh + ", number=" + this.Yi7zF1RB1 + ", stars=" + this.X1lG3V04pd + ", unlocked=" + this.xqGvceK5x + ", gridLabel=" + this.OOA6hdeuvCS + ")";
    }
}
