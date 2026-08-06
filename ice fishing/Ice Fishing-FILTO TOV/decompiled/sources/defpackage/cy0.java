package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
final class cy0 extends me0 {
    public final m0 AvO7iQsrTN;
    public final boolean EljAMC1QTz;
    public final py0 GWasM1elztuh;
    public final tf0 OOA6hdeuvCS;
    public final boolean X1lG3V04pd;
    public final xm0 Yi7zF1RB1;
    public final fk xqGvceK5x;

    public cy0(m0 m0Var, fk fkVar, tf0 tf0Var, xm0 xm0Var, py0 py0Var, boolean z, boolean z2) {
        this.GWasM1elztuh = py0Var;
        this.Yi7zF1RB1 = xm0Var;
        this.X1lG3V04pd = z;
        this.xqGvceK5x = fkVar;
        this.OOA6hdeuvCS = tf0Var;
        this.EljAMC1QTz = z2;
        this.AvO7iQsrTN = m0Var;
    }

    @Override // defpackage.me0
    public final void OOA6hdeuvCS(he0 he0Var) {
        ((dy0) he0Var).bfDgRvRIg(this.AvO7iQsrTN, this.xqGvceK5x, this.OOA6hdeuvCS, this.Yi7zF1RB1, this.GWasM1elztuh, this.EljAMC1QTz, this.X1lG3V04pd);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cy0.class != obj.getClass()) {
            return false;
        }
        cy0 cy0Var = (cy0) obj;
        return o30.rQPn8YBR(this.GWasM1elztuh, cy0Var.GWasM1elztuh) && this.Yi7zF1RB1 == cy0Var.Yi7zF1RB1 && this.X1lG3V04pd == cy0Var.X1lG3V04pd && o30.rQPn8YBR(this.xqGvceK5x, cy0Var.xqGvceK5x) && o30.rQPn8YBR(this.OOA6hdeuvCS, cy0Var.OOA6hdeuvCS) && this.EljAMC1QTz == cy0Var.EljAMC1QTz && o30.rQPn8YBR(this.AvO7iQsrTN, cy0Var.AvO7iQsrTN);
    }

    public final int hashCode() {
        int xqGvceK5x = mr0.xqGvceK5x(mr0.xqGvceK5x((this.Yi7zF1RB1.hashCode() + (this.GWasM1elztuh.hashCode() * 31)) * 31, 31, this.X1lG3V04pd), 31, false);
        fk fkVar = this.xqGvceK5x;
        int hashCode = (xqGvceK5x + (fkVar != null ? fkVar.hashCode() : 0)) * 31;
        tf0 tf0Var = this.OOA6hdeuvCS;
        int xqGvceK5x2 = mr0.xqGvceK5x((hashCode + (tf0Var != null ? tf0Var.hashCode() : 0)) * 961, 31, this.EljAMC1QTz);
        m0 m0Var = this.AvO7iQsrTN;
        return xqGvceK5x2 + (m0Var != null ? m0Var.hashCode() : 0);
    }

    @Override // defpackage.me0
    public final he0 xqGvceK5x() {
        dy0 dy0Var = new dy0();
        dy0Var.Y6hRI1cF8 = this.GWasM1elztuh;
        dy0Var.cilMamHF = this.Yi7zF1RB1;
        dy0Var.lv06NcmrQ = this.X1lG3V04pd;
        dy0Var.WdrkLMV3xh = this.xqGvceK5x;
        dy0Var.WRKkgoJXwDn = this.OOA6hdeuvCS;
        dy0Var.arNh8D4Z5gB = this.EljAMC1QTz;
        dy0Var.pog2g9KITJA = this.AvO7iQsrTN;
        return dy0Var;
    }
}
