package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ag extends bg {
    public final float[] AvO7iQsrTN;
    public final gv0 EljAMC1QTz;
    public final gv0 OOA6hdeuvCS;

    public ag(gv0 gv0Var, gv0 gv0Var2) {
        super(gv0Var2, gv0Var, gv0Var2, null);
        float[] A1EKNP6CxJ;
        this.OOA6hdeuvCS = gv0Var;
        this.EljAMC1QTz = gv0Var2;
        float[] fArr = (float[]) j6IIN2O8eOU.AvO7iQsrTN.EljAMC1QTz;
        nf1 nf1Var = gv0Var.xqGvceK5x;
        float[] fArr2 = gv0Var.mOu10nynGul;
        nf1 nf1Var2 = gv0Var2.xqGvceK5x;
        float[] fArr3 = gv0Var2.JFJ3QoxA;
        if (qj.uFEq9NpZ(nf1Var, nf1Var2)) {
            A1EKNP6CxJ = qj.A1EKNP6CxJ(fArr3, fArr2);
        } else {
            float[] GWasM1elztuh = nf1Var.GWasM1elztuh();
            float[] GWasM1elztuh2 = nf1Var2.GWasM1elztuh();
            nf1 nf1Var3 = ki1.OOA6hdeuvCS;
            A1EKNP6CxJ = qj.A1EKNP6CxJ(qj.uFEq9NpZ(nf1Var2, nf1Var3) ? fArr3 : qj.ozMwhSAI(qj.A1EKNP6CxJ(qj.E7jCp8Ls(fArr, GWasM1elztuh2, new float[]{0.964212f, 1.0f, 0.825188f}), gv0Var2.mOu10nynGul)), qj.uFEq9NpZ(nf1Var, nf1Var3) ? fArr2 : qj.A1EKNP6CxJ(qj.E7jCp8Ls(fArr, GWasM1elztuh, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.AvO7iQsrTN = A1EKNP6CxJ;
    }

    @Override // defpackage.bg
    public final long GWasM1elztuh(long j) {
        float encWxUiV2 = yb.encWxUiV2(j);
        float AvO7iQsrTN = yb.AvO7iQsrTN(j);
        float OOA6hdeuvCS = yb.OOA6hdeuvCS(j);
        float xqGvceK5x = yb.xqGvceK5x(j);
        cv0 cv0Var = this.OOA6hdeuvCS.WIEu4Ya2g8;
        float X1lG3V04pd = (float) cv0Var.X1lG3V04pd(encWxUiV2);
        float X1lG3V04pd2 = (float) cv0Var.X1lG3V04pd(AvO7iQsrTN);
        float X1lG3V04pd3 = (float) cv0Var.X1lG3V04pd(OOA6hdeuvCS);
        float[] fArr = this.AvO7iQsrTN;
        float f = (fArr[6] * X1lG3V04pd3) + (fArr[3] * X1lG3V04pd2) + (fArr[0] * X1lG3V04pd);
        float f2 = (fArr[7] * X1lG3V04pd3) + (fArr[4] * X1lG3V04pd2) + (fArr[1] * X1lG3V04pd);
        float f3 = (fArr[8] * X1lG3V04pd3) + (fArr[5] * X1lG3V04pd2) + (fArr[2] * X1lG3V04pd);
        gv0 gv0Var = this.EljAMC1QTz;
        float X1lG3V04pd4 = (float) gv0Var.XnEVoBF0td1l.X1lG3V04pd(f);
        cv0 cv0Var2 = gv0Var.XnEVoBF0td1l;
        return ki1.Yi7zF1RB1(X1lG3V04pd4, (float) cv0Var2.X1lG3V04pd(f2), (float) cv0Var2.X1lG3V04pd(f3), xqGvceK5x, gv0Var);
    }
}
