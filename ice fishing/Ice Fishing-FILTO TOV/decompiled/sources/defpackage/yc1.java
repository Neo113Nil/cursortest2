package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class yc1 extends he0 implements w50 {
    public float jivtDDk9H;
    public float mE4lRynR;

    @Override // defpackage.w50
    public final cd0 ES6ysExf(dd0 dd0Var, wc0 wc0Var, long j) {
        int JFJ3QoxA;
        int mOu10nynGul;
        if (Float.isNaN(this.mE4lRynR) || eg.JFJ3QoxA(j) != 0) {
            JFJ3QoxA = eg.JFJ3QoxA(j);
        } else {
            int rezfBrjOrqK = dd0Var.rezfBrjOrqK(this.mE4lRynR);
            JFJ3QoxA = eg.encWxUiV2(j);
            if (rezfBrjOrqK < 0) {
                rezfBrjOrqK = 0;
            }
            if (rezfBrjOrqK <= JFJ3QoxA) {
                JFJ3QoxA = rezfBrjOrqK;
            }
        }
        int encWxUiV2 = eg.encWxUiV2(j);
        if (Float.isNaN(this.jivtDDk9H) || eg.mOu10nynGul(j) != 0) {
            mOu10nynGul = eg.mOu10nynGul(j);
        } else {
            int rezfBrjOrqK2 = dd0Var.rezfBrjOrqK(this.jivtDDk9H);
            mOu10nynGul = eg.AvO7iQsrTN(j);
            int i = rezfBrjOrqK2 >= 0 ? rezfBrjOrqK2 : 0;
            if (i <= mOu10nynGul) {
                mOu10nynGul = i;
            }
        }
        up0 OOA6hdeuvCS = wc0Var.OOA6hdeuvCS(fg.GWasM1elztuh(JFJ3QoxA, encWxUiV2, mOu10nynGul, eg.AvO7iQsrTN(j)));
        return dd0Var.MjxSquD6Av(OOA6hdeuvCS.OOA6hdeuvCS, OOA6hdeuvCS.EljAMC1QTz, yp.OOA6hdeuvCS, new f5(OOA6hdeuvCS, 5));
    }

    @Override // defpackage.w50
    public final int EljAMC1QTz(ub0 ub0Var, wc0 wc0Var, int i) {
        int J3Xc8BaqpN8 = wc0Var.J3Xc8BaqpN8(i);
        int rezfBrjOrqK = !Float.isNaN(this.mE4lRynR) ? ub0Var.rezfBrjOrqK(this.mE4lRynR) : 0;
        return J3Xc8BaqpN8 < rezfBrjOrqK ? rezfBrjOrqK : J3Xc8BaqpN8;
    }

    @Override // defpackage.w50
    public final int JFJ3QoxA(ub0 ub0Var, wc0 wc0Var, int i) {
        int EljAMC1QTz = wc0Var.EljAMC1QTz(i);
        int rezfBrjOrqK = !Float.isNaN(this.jivtDDk9H) ? ub0Var.rezfBrjOrqK(this.jivtDDk9H) : 0;
        return EljAMC1QTz < rezfBrjOrqK ? rezfBrjOrqK : EljAMC1QTz;
    }

    @Override // defpackage.w50
    public final int WRKkgoJXwDn(ub0 ub0Var, wc0 wc0Var, int i) {
        int Uxq83abb04 = wc0Var.Uxq83abb04(i);
        int rezfBrjOrqK = !Float.isNaN(this.jivtDDk9H) ? ub0Var.rezfBrjOrqK(this.jivtDDk9H) : 0;
        return Uxq83abb04 < rezfBrjOrqK ? rezfBrjOrqK : Uxq83abb04;
    }

    @Override // defpackage.w50
    public final int dqB83aoLBB(ub0 ub0Var, wc0 wc0Var, int i) {
        int dqB83aoLBB = wc0Var.dqB83aoLBB(i);
        int rezfBrjOrqK = !Float.isNaN(this.mE4lRynR) ? ub0Var.rezfBrjOrqK(this.mE4lRynR) : 0;
        return dqB83aoLBB < rezfBrjOrqK ? rezfBrjOrqK : dqB83aoLBB;
    }
}
