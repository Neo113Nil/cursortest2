package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ur extends he0 implements w50 {
    public float jivtDDk9H;
    public gm mE4lRynR;

    @Override // defpackage.w50
    public final cd0 ES6ysExf(dd0 dd0Var, wc0 wc0Var, long j) {
        int JFJ3QoxA;
        int encWxUiV2;
        int i;
        int i2;
        if (!eg.xqGvceK5x(j) || this.mE4lRynR == gm.OOA6hdeuvCS) {
            JFJ3QoxA = eg.JFJ3QoxA(j);
            encWxUiV2 = eg.encWxUiV2(j);
        } else {
            int round = Math.round(eg.encWxUiV2(j) * this.jivtDDk9H);
            int JFJ3QoxA2 = eg.JFJ3QoxA(j);
            JFJ3QoxA = eg.encWxUiV2(j);
            if (round < JFJ3QoxA2) {
                round = JFJ3QoxA2;
            }
            if (round <= JFJ3QoxA) {
                JFJ3QoxA = round;
            }
            encWxUiV2 = JFJ3QoxA;
        }
        if (!eg.X1lG3V04pd(j) || this.mE4lRynR == gm.EljAMC1QTz) {
            int mOu10nynGul = eg.mOu10nynGul(j);
            int AvO7iQsrTN = eg.AvO7iQsrTN(j);
            i = mOu10nynGul;
            i2 = AvO7iQsrTN;
        } else {
            int round2 = Math.round(eg.AvO7iQsrTN(j) * this.jivtDDk9H);
            int mOu10nynGul2 = eg.mOu10nynGul(j);
            i = eg.AvO7iQsrTN(j);
            if (round2 < mOu10nynGul2) {
                round2 = mOu10nynGul2;
            }
            if (round2 <= i) {
                i = round2;
            }
            i2 = i;
        }
        up0 OOA6hdeuvCS = wc0Var.OOA6hdeuvCS(fg.GWasM1elztuh(JFJ3QoxA, encWxUiV2, i, i2));
        return dd0Var.MjxSquD6Av(OOA6hdeuvCS.OOA6hdeuvCS, OOA6hdeuvCS.EljAMC1QTz, yp.OOA6hdeuvCS, new f5(OOA6hdeuvCS, 1));
    }
}
