package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ka1 implements m51 {
    public hv AvO7iQsrTN;
    public hv EljAMC1QTz;
    public final oa1 OOA6hdeuvCS;
    public final /* synthetic */ la1 encWxUiV2;

    public ka1(la1 la1Var, oa1 oa1Var, hv hvVar, hv hvVar2) {
        this.encWxUiV2 = la1Var;
        this.OOA6hdeuvCS = oa1Var;
        this.EljAMC1QTz = hvVar;
        this.AvO7iQsrTN = hvVar2;
    }

    public final void GWasM1elztuh(ma1 ma1Var) {
        oa1 oa1Var = this.OOA6hdeuvCS;
        fo0 fo0Var = oa1Var.rQPn8YBR;
        fo0 fo0Var2 = oa1Var.EljAMC1QTz;
        bo0 bo0Var = oa1Var.E7jCp8Ls;
        Object mOu10nynGul = this.AvO7iQsrTN.mOu10nynGul(ma1Var.X1lG3V04pd());
        if (this.encWxUiV2.X1lG3V04pd.AvO7iQsrTN()) {
            oa1Var.AvO7iQsrTN(this.AvO7iQsrTN.mOu10nynGul(ma1Var.Yi7zF1RB1()), mOu10nynGul, (xr) this.EljAMC1QTz.mOu10nynGul(ma1Var));
            return;
        }
        xr xrVar = (xr) this.EljAMC1QTz.mOu10nynGul(ma1Var);
        if (oa1Var.XnEVoBF0td1l) {
            t71 t71Var = oa1Var.JFJ3QoxA;
            if (o30.rQPn8YBR(mOu10nynGul, t71Var != null ? t71Var.X1lG3V04pd : null)) {
                return;
            }
        }
        if (o30.rQPn8YBR(fo0Var2.getValue(), mOu10nynGul) && bo0Var.AvO7iQsrTN() == -1.0f) {
            return;
        }
        fo0Var2.setValue(mOu10nynGul);
        oa1Var.AvO7iQsrTN.setValue(xrVar);
        oa1Var.EljAMC1QTz(bo0Var.AvO7iQsrTN() == -3.0f ? mOu10nynGul : oa1Var.uFEq9NpZ.getValue(), !((Boolean) fo0Var.getValue()).booleanValue());
        fo0Var.setValue(Boolean.valueOf(bo0Var.AvO7iQsrTN() == -3.0f));
        if (bo0Var.AvO7iQsrTN() >= 0.0f) {
            oa1Var.OOA6hdeuvCS(oa1Var.GWasM1elztuh().Yi7zF1RB1((long) (bo0Var.AvO7iQsrTN() * oa1Var.GWasM1elztuh().X1lG3V04pd())));
        } else if (bo0Var.AvO7iQsrTN() == -3.0f) {
            oa1Var.OOA6hdeuvCS(mOu10nynGul);
        }
        oa1Var.XnEVoBF0td1l = false;
        bo0Var.encWxUiV2(-1.0f);
    }

    @Override // defpackage.m51
    public final Object getValue() {
        GWasM1elztuh(this.encWxUiV2.X1lG3V04pd.EljAMC1QTz());
        return this.OOA6hdeuvCS.uFEq9NpZ.getValue();
    }
}
