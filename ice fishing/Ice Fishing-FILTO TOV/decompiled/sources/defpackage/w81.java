package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class w81 {
    public final String GWasM1elztuh;
    public String Yi7zF1RB1;
    public boolean X1lG3V04pd = false;
    public xn0 xqGvceK5x = null;

    public w81(String str, String str2) {
        this.GWasM1elztuh = str;
        this.Yi7zF1RB1 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w81)) {
            return false;
        }
        w81 w81Var = (w81) obj;
        return o30.rQPn8YBR(this.GWasM1elztuh, w81Var.GWasM1elztuh) && o30.rQPn8YBR(this.Yi7zF1RB1, w81Var.Yi7zF1RB1) && this.X1lG3V04pd == w81Var.X1lG3V04pd && o30.rQPn8YBR(this.xqGvceK5x, w81Var.xqGvceK5x);
    }

    public final int hashCode() {
        int xqGvceK5x = mr0.xqGvceK5x((this.Yi7zF1RB1.hashCode() + (this.GWasM1elztuh.hashCode() * 31)) * 31, 31, this.X1lG3V04pd);
        xn0 xn0Var = this.xqGvceK5x;
        return xqGvceK5x + (xn0Var == null ? 0 : xn0Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.xqGvceK5x + ", isShowingSubstitution=" + this.X1lG3V04pd + ')';
    }
}
