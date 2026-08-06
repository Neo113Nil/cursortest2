package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class ch0 extends we1 {
    public final n8 EljAMC1QTz;
    public final aa OOA6hdeuvCS;
    public final ys0 X1lG3V04pd;
    public final p51 Yi7zF1RB1;
    public final n8 xqGvceK5x;

    public ch0(dc1 dc1Var) {
        p51 EljAMC1QTz = vc0.EljAMC1QTz(dc1Var);
        this.Yi7zF1RB1 = EljAMC1QTz;
        this.X1lG3V04pd = new ys0(EljAMC1QTz);
        n8 Yi7zF1RB1 = fb1.Yi7zF1RB1(-2, null, 6);
        this.xqGvceK5x = Yi7zF1RB1;
        this.OOA6hdeuvCS = new aa(Yi7zF1RB1, false);
        this.EljAMC1QTz = fb1.Yi7zF1RB1(Integer.MAX_VALUE, null, 6);
        fb1.MZhzXH72(rj0.arNh8D4Z5gB(this), null, new xqGvceK5x(this, null, 16), 3);
    }

    public final Object AvO7iQsrTN(bc1 bc1Var, wg wgVar) {
        Object X1lG3V04pd = this.xqGvceK5x.X1lG3V04pd(wgVar, bc1Var);
        return X1lG3V04pd == qh.OOA6hdeuvCS ? X1lG3V04pd : kc1.GWasM1elztuh;
    }

    public abstract Object EljAMC1QTz(cc1 cc1Var, xqGvceK5x xqgvcek5x);

    public final dc1 OOA6hdeuvCS() {
        return (dc1) this.Yi7zF1RB1.getValue();
    }

    public final void encWxUiV2(hv hvVar) {
        p51 p51Var;
        Object value;
        do {
            p51Var = this.Yi7zF1RB1;
            value = p51Var.getValue();
        } while (!p51Var.encWxUiV2(value, hvVar.mOu10nynGul(value)));
    }

    @Override // defpackage.we1
    public void xqGvceK5x() {
        d70.E7jCp8Ls(this.EljAMC1QTz);
        d70.E7jCp8Ls(this.xqGvceK5x);
    }
}
