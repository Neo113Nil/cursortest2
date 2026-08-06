package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
final class f70 extends me0 {
    public final h80 GWasM1elztuh;
    public final xm0 X1lG3V04pd;
    public final x7 Yi7zF1RB1;

    public f70(h80 h80Var, x7 x7Var, xm0 xm0Var) {
        this.GWasM1elztuh = h80Var;
        this.Yi7zF1RB1 = x7Var;
        this.X1lG3V04pd = xm0Var;
    }

    @Override // defpackage.me0
    public final void OOA6hdeuvCS(he0 he0Var) {
        i70 i70Var = (i70) he0Var;
        i70Var.mE4lRynR = this.GWasM1elztuh;
        i70Var.jivtDDk9H = this.Yi7zF1RB1;
        i70Var.Y6hRI1cF8 = this.X1lG3V04pd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f70)) {
            return false;
        }
        f70 f70Var = (f70) obj;
        return o30.rQPn8YBR(this.GWasM1elztuh, f70Var.GWasM1elztuh) && o30.rQPn8YBR(this.Yi7zF1RB1, f70Var.Yi7zF1RB1) && this.X1lG3V04pd == f70Var.X1lG3V04pd;
    }

    public final int hashCode() {
        return this.X1lG3V04pd.hashCode() + mr0.xqGvceK5x((this.Yi7zF1RB1.hashCode() + (this.GWasM1elztuh.hashCode() * 31)) * 31, 31, false);
    }

    @Override // defpackage.me0
    public final he0 xqGvceK5x() {
        i70 i70Var = new i70();
        i70Var.mE4lRynR = this.GWasM1elztuh;
        i70Var.jivtDDk9H = this.Yi7zF1RB1;
        i70Var.Y6hRI1cF8 = this.X1lG3V04pd;
        return i70Var;
    }
}
