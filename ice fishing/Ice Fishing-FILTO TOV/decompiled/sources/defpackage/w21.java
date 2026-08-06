package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class w21 extends he0 implements w50 {
    public float Y6hRI1cF8;
    public float cilMamHF;
    public float jivtDDk9H;
    public boolean lv06NcmrQ;
    public float mE4lRynR;

    @Override // defpackage.w50
    public final cd0 ES6ysExf(dd0 dd0Var, wc0 wc0Var, long j) {
        int JFJ3QoxA;
        int encWxUiV2;
        int mOu10nynGul;
        int AvO7iQsrTN;
        long GWasM1elztuh;
        long gqMuANyCes = gqMuANyCes(dd0Var);
        if (this.lv06NcmrQ) {
            int JFJ3QoxA2 = eg.JFJ3QoxA(j);
            int encWxUiV22 = eg.encWxUiV2(j);
            int mOu10nynGul2 = eg.mOu10nynGul(j);
            int AvO7iQsrTN2 = eg.AvO7iQsrTN(j);
            int JFJ3QoxA3 = eg.JFJ3QoxA(gqMuANyCes);
            if (JFJ3QoxA3 < JFJ3QoxA2) {
                JFJ3QoxA3 = JFJ3QoxA2;
            }
            if (JFJ3QoxA3 > encWxUiV22) {
                JFJ3QoxA3 = encWxUiV22;
            }
            int encWxUiV23 = eg.encWxUiV2(gqMuANyCes);
            if (encWxUiV23 >= JFJ3QoxA2) {
                JFJ3QoxA2 = encWxUiV23;
            }
            if (JFJ3QoxA2 <= encWxUiV22) {
                encWxUiV22 = JFJ3QoxA2;
            }
            int mOu10nynGul3 = eg.mOu10nynGul(gqMuANyCes);
            if (mOu10nynGul3 < mOu10nynGul2) {
                mOu10nynGul3 = mOu10nynGul2;
            }
            if (mOu10nynGul3 > AvO7iQsrTN2) {
                mOu10nynGul3 = AvO7iQsrTN2;
            }
            int AvO7iQsrTN3 = eg.AvO7iQsrTN(gqMuANyCes);
            if (AvO7iQsrTN3 >= mOu10nynGul2) {
                mOu10nynGul2 = AvO7iQsrTN3;
            }
            if (mOu10nynGul2 <= AvO7iQsrTN2) {
                AvO7iQsrTN2 = mOu10nynGul2;
            }
            GWasM1elztuh = fg.GWasM1elztuh(JFJ3QoxA3, encWxUiV22, mOu10nynGul3, AvO7iQsrTN2);
        } else {
            if (Float.isNaN(this.mE4lRynR)) {
                JFJ3QoxA = eg.JFJ3QoxA(j);
                int encWxUiV24 = eg.encWxUiV2(gqMuANyCes);
                if (JFJ3QoxA > encWxUiV24) {
                    JFJ3QoxA = encWxUiV24;
                }
            } else {
                JFJ3QoxA = eg.JFJ3QoxA(gqMuANyCes);
            }
            if (Float.isNaN(this.Y6hRI1cF8)) {
                encWxUiV2 = eg.encWxUiV2(j);
                int JFJ3QoxA4 = eg.JFJ3QoxA(gqMuANyCes);
                if (encWxUiV2 < JFJ3QoxA4) {
                    encWxUiV2 = JFJ3QoxA4;
                }
            } else {
                encWxUiV2 = eg.encWxUiV2(gqMuANyCes);
            }
            if (Float.isNaN(this.jivtDDk9H)) {
                mOu10nynGul = eg.mOu10nynGul(j);
                int AvO7iQsrTN4 = eg.AvO7iQsrTN(gqMuANyCes);
                if (mOu10nynGul > AvO7iQsrTN4) {
                    mOu10nynGul = AvO7iQsrTN4;
                }
            } else {
                mOu10nynGul = eg.mOu10nynGul(gqMuANyCes);
            }
            if (Float.isNaN(this.cilMamHF)) {
                AvO7iQsrTN = eg.AvO7iQsrTN(j);
                int mOu10nynGul4 = eg.mOu10nynGul(gqMuANyCes);
                if (AvO7iQsrTN < mOu10nynGul4) {
                    AvO7iQsrTN = mOu10nynGul4;
                }
            } else {
                AvO7iQsrTN = eg.AvO7iQsrTN(gqMuANyCes);
            }
            GWasM1elztuh = fg.GWasM1elztuh(JFJ3QoxA, encWxUiV2, mOu10nynGul, AvO7iQsrTN);
        }
        up0 OOA6hdeuvCS = wc0Var.OOA6hdeuvCS(GWasM1elztuh);
        return dd0Var.MjxSquD6Av(OOA6hdeuvCS.OOA6hdeuvCS, OOA6hdeuvCS.EljAMC1QTz, yp.OOA6hdeuvCS, new f5(OOA6hdeuvCS, 3));
    }

    @Override // defpackage.w50
    public final int EljAMC1QTz(ub0 ub0Var, wc0 wc0Var, int i) {
        long gqMuANyCes = gqMuANyCes(ub0Var);
        if (eg.EljAMC1QTz(gqMuANyCes)) {
            return eg.encWxUiV2(gqMuANyCes);
        }
        if (!this.lv06NcmrQ) {
            i = fg.OOA6hdeuvCS(i, gqMuANyCes);
        }
        return fg.EljAMC1QTz(wc0Var.J3Xc8BaqpN8(i), gqMuANyCes);
    }

    @Override // defpackage.w50
    public final int JFJ3QoxA(ub0 ub0Var, wc0 wc0Var, int i) {
        long gqMuANyCes = gqMuANyCes(ub0Var);
        if (eg.OOA6hdeuvCS(gqMuANyCes)) {
            return eg.AvO7iQsrTN(gqMuANyCes);
        }
        if (!this.lv06NcmrQ) {
            i = fg.EljAMC1QTz(i, gqMuANyCes);
        }
        return fg.OOA6hdeuvCS(wc0Var.EljAMC1QTz(i), gqMuANyCes);
    }

    @Override // defpackage.w50
    public final int WRKkgoJXwDn(ub0 ub0Var, wc0 wc0Var, int i) {
        long gqMuANyCes = gqMuANyCes(ub0Var);
        if (eg.OOA6hdeuvCS(gqMuANyCes)) {
            return eg.AvO7iQsrTN(gqMuANyCes);
        }
        if (!this.lv06NcmrQ) {
            i = fg.EljAMC1QTz(i, gqMuANyCes);
        }
        return fg.OOA6hdeuvCS(wc0Var.Uxq83abb04(i), gqMuANyCes);
    }

    @Override // defpackage.w50
    public final int dqB83aoLBB(ub0 ub0Var, wc0 wc0Var, int i) {
        long gqMuANyCes = gqMuANyCes(ub0Var);
        if (eg.EljAMC1QTz(gqMuANyCes)) {
            return eg.encWxUiV2(gqMuANyCes);
        }
        if (!this.lv06NcmrQ) {
            i = fg.OOA6hdeuvCS(i, gqMuANyCes);
        }
        return fg.EljAMC1QTz(wc0Var.dqB83aoLBB(i), gqMuANyCes);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r4 != Integer.MAX_VALUE) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long gqMuANyCes(dd0 dd0Var) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (Float.isNaN(this.Y6hRI1cF8)) {
            i = Integer.MAX_VALUE;
        } else {
            i = dd0Var.rezfBrjOrqK(this.Y6hRI1cF8);
            if (i < 0) {
                i = 0;
            }
        }
        if (Float.isNaN(this.cilMamHF)) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = dd0Var.rezfBrjOrqK(this.cilMamHF);
            if (i2 < 0) {
                i2 = 0;
            }
        }
        if (!Float.isNaN(this.mE4lRynR)) {
            i3 = dd0Var.rezfBrjOrqK(this.mE4lRynR);
            if (i3 < 0) {
                i3 = 0;
            }
            if (i3 > i) {
                i3 = i;
            }
        }
        i3 = 0;
        if (!Float.isNaN(this.jivtDDk9H)) {
            int rezfBrjOrqK = dd0Var.rezfBrjOrqK(this.jivtDDk9H);
            if (rezfBrjOrqK < 0) {
                rezfBrjOrqK = 0;
            }
            if (rezfBrjOrqK > i2) {
                rezfBrjOrqK = i2;
            }
            if (rezfBrjOrqK != Integer.MAX_VALUE) {
                i4 = rezfBrjOrqK;
            }
        }
        return fg.GWasM1elztuh(i3, i, i4, i2);
    }
}
