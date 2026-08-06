package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
final class e6 extends me0 {
    public final long GWasM1elztuh;
    public final float X1lG3V04pd;
    public final qj Yi7zF1RB1;
    public final z11 xqGvceK5x;

    public e6(long j, qj qjVar, z11 z11Var, int i) {
        j = (i & 1) != 0 ? yb.AvO7iQsrTN : j;
        qjVar = (i & 2) != 0 ? null : qjVar;
        this.GWasM1elztuh = j;
        this.Yi7zF1RB1 = qjVar;
        this.X1lG3V04pd = 1.0f;
        this.xqGvceK5x = z11Var;
    }

    @Override // defpackage.me0
    public final void OOA6hdeuvCS(he0 he0Var) {
        f6 f6Var = (f6) he0Var;
        f6Var.mE4lRynR = this.GWasM1elztuh;
        f6Var.jivtDDk9H = this.Yi7zF1RB1;
        f6Var.Y6hRI1cF8 = this.X1lG3V04pd;
        z11 z11Var = f6Var.cilMamHF;
        z11 z11Var2 = this.xqGvceK5x;
        if (!o30.rQPn8YBR(z11Var, z11Var2)) {
            f6Var.cilMamHF = z11Var2;
            l60.WIEu4Ya2g8(f6Var);
        }
        p.uFEq9NpZ(f6Var);
    }

    public final boolean equals(Object obj) {
        e6 e6Var = obj instanceof e6 ? (e6) obj : null;
        return e6Var != null && yb.X1lG3V04pd(this.GWasM1elztuh, e6Var.GWasM1elztuh) && o30.rQPn8YBR(this.Yi7zF1RB1, e6Var.Yi7zF1RB1) && this.X1lG3V04pd == e6Var.X1lG3V04pd && o30.rQPn8YBR(this.xqGvceK5x, e6Var.xqGvceK5x);
    }

    public final int hashCode() {
        int i = yb.encWxUiV2;
        int hashCode = Long.hashCode(this.GWasM1elztuh) * 31;
        qj qjVar = this.Yi7zF1RB1;
        return this.xqGvceK5x.hashCode() + mr0.GWasM1elztuh(this.X1lG3V04pd, (hashCode + (qjVar != null ? qjVar.hashCode() : 0)) * 31, 31);
    }

    @Override // defpackage.me0
    public final he0 xqGvceK5x() {
        f6 f6Var = new f6();
        f6Var.mE4lRynR = this.GWasM1elztuh;
        f6Var.jivtDDk9H = this.Yi7zF1RB1;
        f6Var.Y6hRI1cF8 = this.X1lG3V04pd;
        f6Var.cilMamHF = this.xqGvceK5x;
        f6Var.lv06NcmrQ = 9205357640488583168L;
        return f6Var;
    }
}
