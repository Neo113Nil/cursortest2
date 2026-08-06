package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
final class dq extends me0 {
    public final qa1 GWasM1elztuh;
    public final eq OOA6hdeuvCS;
    public final xq X1lG3V04pd;
    public final lq Yi7zF1RB1;
    public final wu xqGvceK5x;

    public dq(qa1 qa1Var, lq lqVar, xq xqVar, wu wuVar, eq eqVar) {
        this.GWasM1elztuh = qa1Var;
        this.Yi7zF1RB1 = lqVar;
        this.X1lG3V04pd = xqVar;
        this.xqGvceK5x = wuVar;
        this.OOA6hdeuvCS = eqVar;
    }

    @Override // defpackage.me0
    public final void OOA6hdeuvCS(he0 he0Var) {
        kq kqVar = (kq) he0Var;
        kqVar.mE4lRynR = this.GWasM1elztuh;
        kqVar.jivtDDk9H = this.X1lG3V04pd;
        kqVar.Y6hRI1cF8 = this.xqGvceK5x;
        kqVar.cilMamHF = this.OOA6hdeuvCS;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dq)) {
            return false;
        }
        dq dqVar = (dq) obj;
        return dqVar.GWasM1elztuh == this.GWasM1elztuh && dqVar.Yi7zF1RB1.equals(this.Yi7zF1RB1) && o30.rQPn8YBR(dqVar.X1lG3V04pd, this.X1lG3V04pd) && dqVar.xqGvceK5x == this.xqGvceK5x && o30.rQPn8YBR(dqVar.OOA6hdeuvCS, this.OOA6hdeuvCS);
    }

    public final int hashCode() {
        return this.OOA6hdeuvCS.hashCode() + ((this.xqGvceK5x.hashCode() + ((this.X1lG3V04pd.GWasM1elztuh.hashCode() + ((this.Yi7zF1RB1.GWasM1elztuh.hashCode() + (this.GWasM1elztuh.hashCode() * 923521)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.me0
    public final he0 xqGvceK5x() {
        kq kqVar = new kq();
        kqVar.mE4lRynR = this.GWasM1elztuh;
        kqVar.jivtDDk9H = this.X1lG3V04pd;
        kqVar.Y6hRI1cF8 = this.xqGvceK5x;
        kqVar.cilMamHF = this.OOA6hdeuvCS;
        kqVar.lv06NcmrQ = -9223372034707292160L;
        fg.Yi7zF1RB1(0, 0, 15);
        new jq(kqVar, 0);
        new jq(kqVar, 1);
        return kqVar;
    }
}
