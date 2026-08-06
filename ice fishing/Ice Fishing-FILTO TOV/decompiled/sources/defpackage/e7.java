package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class e7 extends me0 {
    public final float GWasM1elztuh;
    public final z11 X1lG3V04pd;
    public final t41 Yi7zF1RB1;

    public e7(float f, t41 t41Var, z11 z11Var) {
        this.GWasM1elztuh = f;
        this.Yi7zF1RB1 = t41Var;
        this.X1lG3V04pd = z11Var;
    }

    @Override // defpackage.me0
    public final void OOA6hdeuvCS(he0 he0Var) {
        d7 d7Var = (d7) he0Var;
        float f = d7Var.cilMamHF;
        d9 d9Var = d7Var.WRKkgoJXwDn;
        float f2 = this.GWasM1elztuh;
        if (!cn.Yi7zF1RB1(f, f2)) {
            d7Var.cilMamHF = f2;
            d9Var.gqMuANyCes();
        }
        t41 t41Var = d7Var.lv06NcmrQ;
        t41 t41Var2 = this.Yi7zF1RB1;
        if (!o30.rQPn8YBR(t41Var, t41Var2)) {
            d7Var.lv06NcmrQ = t41Var2;
            d9Var.gqMuANyCes();
        }
        z11 z11Var = d7Var.WdrkLMV3xh;
        z11 z11Var2 = this.X1lG3V04pd;
        if (o30.rQPn8YBR(z11Var, z11Var2)) {
            return;
        }
        d7Var.WdrkLMV3xh = z11Var2;
        d9Var.gqMuANyCes();
        l60.WIEu4Ya2g8(d7Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        return cn.Yi7zF1RB1(this.GWasM1elztuh, e7Var.GWasM1elztuh) && this.Yi7zF1RB1.equals(e7Var.Yi7zF1RB1) && o30.rQPn8YBR(this.X1lG3V04pd, e7Var.X1lG3V04pd);
    }

    public final int hashCode() {
        return this.X1lG3V04pd.hashCode() + ((this.Yi7zF1RB1.hashCode() + (Float.hashCode(this.GWasM1elztuh) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) cn.X1lG3V04pd(this.GWasM1elztuh)) + ", brush=" + this.Yi7zF1RB1 + ", shape=" + this.X1lG3V04pd + ')';
    }

    @Override // defpackage.me0
    public final he0 xqGvceK5x() {
        return new d7(this.GWasM1elztuh, this.Yi7zF1RB1, this.X1lG3V04pd);
    }
}
