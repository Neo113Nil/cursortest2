package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
final class c80 extends me0 {
    public final wu GWasM1elztuh;
    public final xm0 X1lG3V04pd;
    public final b80 Yi7zF1RB1;
    public final boolean xqGvceK5x;

    public c80(wu wuVar, b80 b80Var, xm0 xm0Var, boolean z) {
        this.GWasM1elztuh = wuVar;
        this.Yi7zF1RB1 = b80Var;
        this.X1lG3V04pd = xm0Var;
        this.xqGvceK5x = z;
    }

    @Override // defpackage.me0
    public final void OOA6hdeuvCS(he0 he0Var) {
        g80 g80Var = (g80) he0Var;
        g80Var.mE4lRynR = this.GWasM1elztuh;
        g80Var.jivtDDk9H = this.Yi7zF1RB1;
        xm0 xm0Var = g80Var.Y6hRI1cF8;
        xm0 xm0Var2 = this.X1lG3V04pd;
        if (xm0Var != xm0Var2) {
            g80Var.Y6hRI1cF8 = xm0Var2;
            l60.WIEu4Ya2g8(g80Var);
        }
        boolean z = g80Var.cilMamHF;
        boolean z2 = this.xqGvceK5x;
        if (z == z2) {
            return;
        }
        g80Var.cilMamHF = z2;
        g80Var.gqMuANyCes();
        l60.WIEu4Ya2g8(g80Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c80)) {
            return false;
        }
        c80 c80Var = (c80) obj;
        return this.GWasM1elztuh == c80Var.GWasM1elztuh && o30.rQPn8YBR(this.Yi7zF1RB1, c80Var.Yi7zF1RB1) && this.X1lG3V04pd == c80Var.X1lG3V04pd && this.xqGvceK5x == c80Var.xqGvceK5x;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + mr0.xqGvceK5x((this.X1lG3V04pd.hashCode() + ((this.Yi7zF1RB1.hashCode() + (this.GWasM1elztuh.hashCode() * 31)) * 31)) * 31, 31, this.xqGvceK5x);
    }

    @Override // defpackage.me0
    public final he0 xqGvceK5x() {
        return new g80(this.GWasM1elztuh, this.Yi7zF1RB1, this.X1lG3V04pd, this.xqGvceK5x);
    }
}
