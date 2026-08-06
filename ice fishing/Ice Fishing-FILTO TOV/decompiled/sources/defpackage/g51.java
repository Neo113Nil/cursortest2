package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class g51 {
    public final float GWasM1elztuh;
    public final long OOA6hdeuvCS;
    public final float X1lG3V04pd;
    public final float Yi7zF1RB1;
    public final float xqGvceK5x;

    public g51(float f, float f2, float f3, float f4, long j) {
        this.GWasM1elztuh = f;
        this.Yi7zF1RB1 = f2;
        this.X1lG3V04pd = f3;
        this.xqGvceK5x = f4;
        this.OOA6hdeuvCS = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g51)) {
            return false;
        }
        g51 g51Var = (g51) obj;
        return Float.compare(this.GWasM1elztuh, g51Var.GWasM1elztuh) == 0 && Float.compare(this.Yi7zF1RB1, g51Var.Yi7zF1RB1) == 0 && Float.compare(this.X1lG3V04pd, g51Var.X1lG3V04pd) == 0 && Float.compare(this.xqGvceK5x, g51Var.xqGvceK5x) == 0 && yb.X1lG3V04pd(this.OOA6hdeuvCS, g51Var.OOA6hdeuvCS);
    }

    public final int hashCode() {
        int GWasM1elztuh = mr0.GWasM1elztuh(this.xqGvceK5x, mr0.GWasM1elztuh(this.X1lG3V04pd, mr0.GWasM1elztuh(this.Yi7zF1RB1, Float.hashCode(this.GWasM1elztuh) * 31, 31), 31), 31);
        int i = yb.encWxUiV2;
        return Long.hashCode(this.OOA6hdeuvCS) + GWasM1elztuh;
    }

    public final String toString() {
        return "Star(x=" + this.GWasM1elztuh + ", y=" + this.Yi7zF1RB1 + ", radius=" + this.X1lG3V04pd + ", phase=" + this.xqGvceK5x + ", tint=" + yb.mOu10nynGul(this.OOA6hdeuvCS) + ")";
    }
}
