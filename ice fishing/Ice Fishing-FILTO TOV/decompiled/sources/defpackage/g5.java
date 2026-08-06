package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class g5 extends he0 implements w50 {
    public float mE4lRynR;

    @Override // defpackage.w50
    public final cd0 ES6ysExf(dd0 dd0Var, wc0 wc0Var, long j) {
        long sb9fmtV8A = sb9fmtV8A(j, true);
        if (b30.GWasM1elztuh(sb9fmtV8A, 0L)) {
            sb9fmtV8A = gqMuANyCes(j, true);
            if (b30.GWasM1elztuh(sb9fmtV8A, 0L)) {
                sb9fmtV8A = Hc2GqxcqBiX(j, true);
                if (b30.GWasM1elztuh(sb9fmtV8A, 0L)) {
                    sb9fmtV8A = XmVeRDAr(j, true);
                    if (b30.GWasM1elztuh(sb9fmtV8A, 0L)) {
                        sb9fmtV8A = sb9fmtV8A(j, false);
                        if (b30.GWasM1elztuh(sb9fmtV8A, 0L)) {
                            sb9fmtV8A = gqMuANyCes(j, false);
                            if (b30.GWasM1elztuh(sb9fmtV8A, 0L)) {
                                sb9fmtV8A = Hc2GqxcqBiX(j, false);
                                if (b30.GWasM1elztuh(sb9fmtV8A, 0L)) {
                                    sb9fmtV8A = XmVeRDAr(j, false);
                                    if (b30.GWasM1elztuh(sb9fmtV8A, 0L)) {
                                        sb9fmtV8A = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!b30.GWasM1elztuh(sb9fmtV8A, 0L)) {
            int i = (int) (sb9fmtV8A >> 32);
            int i2 = (int) (4294967295L & sb9fmtV8A);
            if (!((i >= 0) & (i2 >= 0))) {
                v10.GWasM1elztuh("width and height must be >= 0");
            }
            j = fg.AvO7iQsrTN(i, i, i2, i2);
        }
        up0 OOA6hdeuvCS = wc0Var.OOA6hdeuvCS(j);
        return dd0Var.MjxSquD6Av(OOA6hdeuvCS.OOA6hdeuvCS, OOA6hdeuvCS.EljAMC1QTz, yp.OOA6hdeuvCS, new f5(OOA6hdeuvCS, 0));
    }

    @Override // defpackage.w50
    public final int EljAMC1QTz(ub0 ub0Var, wc0 wc0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.mE4lRynR) : wc0Var.J3Xc8BaqpN8(i);
    }

    public final long Hc2GqxcqBiX(long j, boolean z) {
        int JFJ3QoxA = eg.JFJ3QoxA(j);
        int round = Math.round(JFJ3QoxA / this.mE4lRynR);
        if (round <= 0) {
            return 0L;
        }
        if (!z || fb1.A1EKNP6CxJ(JFJ3QoxA, round, j)) {
            return (JFJ3QoxA << 32) | (round & 4294967295L);
        }
        return 0L;
    }

    @Override // defpackage.w50
    public final int JFJ3QoxA(ub0 ub0Var, wc0 wc0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.mE4lRynR) : wc0Var.EljAMC1QTz(i);
    }

    @Override // defpackage.w50
    public final int WRKkgoJXwDn(ub0 ub0Var, wc0 wc0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.mE4lRynR) : wc0Var.Uxq83abb04(i);
    }

    public final long XmVeRDAr(long j, boolean z) {
        int mOu10nynGul = eg.mOu10nynGul(j);
        int round = Math.round(mOu10nynGul * this.mE4lRynR);
        if (round <= 0) {
            return 0L;
        }
        if (!z || fb1.A1EKNP6CxJ(round, mOu10nynGul, j)) {
            return (round << 32) | (mOu10nynGul & 4294967295L);
        }
        return 0L;
    }

    @Override // defpackage.w50
    public final int dqB83aoLBB(ub0 ub0Var, wc0 wc0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.mE4lRynR) : wc0Var.dqB83aoLBB(i);
    }

    public final long gqMuANyCes(long j, boolean z) {
        int round;
        int AvO7iQsrTN = eg.AvO7iQsrTN(j);
        if (AvO7iQsrTN == Integer.MAX_VALUE || (round = Math.round(AvO7iQsrTN * this.mE4lRynR)) <= 0) {
            return 0L;
        }
        if (!z || fb1.A1EKNP6CxJ(round, AvO7iQsrTN, j)) {
            return (round << 32) | (AvO7iQsrTN & 4294967295L);
        }
        return 0L;
    }

    public final long sb9fmtV8A(long j, boolean z) {
        int round;
        int encWxUiV2 = eg.encWxUiV2(j);
        if (encWxUiV2 == Integer.MAX_VALUE || (round = Math.round(encWxUiV2 / this.mE4lRynR)) <= 0) {
            return 0L;
        }
        if (!z || fb1.A1EKNP6CxJ(encWxUiV2, round, j)) {
            return (encWxUiV2 << 32) | (round & 4294967295L);
        }
        return 0L;
    }
}
