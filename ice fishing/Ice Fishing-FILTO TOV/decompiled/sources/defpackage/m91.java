package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class m91 implements hv {
    public final /* synthetic */ Object AvO7iQsrTN;
    public final /* synthetic */ float EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS = 1;
    public final /* synthetic */ Object encWxUiV2;

    public /* synthetic */ m91(up0 up0Var, o91 o91Var, float f) {
        this.AvO7iQsrTN = up0Var;
        this.encWxUiV2 = o91Var;
        this.EljAMC1QTz = f;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        int i = this.OOA6hdeuvCS;
        kc1 kc1Var = kc1.GWasM1elztuh;
        Object obj2 = this.encWxUiV2;
        float f = this.EljAMC1QTz;
        Object obj3 = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                up0 up0Var = (up0) obj3;
                tp0 tp0Var = (tp0) obj;
                g2 g2Var = ((o91) obj2).lv06NcmrQ;
                tp0.JFJ3QoxA(tp0Var, up0Var, g2Var != null ? (int) ((Number) g2Var.xqGvceK5x()).floatValue() : (int) f, 0);
                break;
            default:
                bd1 bd1Var = (bd1) obj3;
                hv hvVar = (hv) obj2;
                long longValue = ((Long) obj).longValue();
                if (bd1Var.Yi7zF1RB1 == Long.MIN_VALUE) {
                    bd1Var.Yi7zF1RB1 = longValue;
                }
                float f2 = bd1Var.OOA6hdeuvCS;
                n3 n3Var = new n3(f2);
                n3 n3Var2 = bd1.EljAMC1QTz;
                long Yi7zF1RB1 = f == 0.0f ? bd1Var.GWasM1elztuh.Yi7zF1RB1(new n3(f2), n3Var2, bd1Var.X1lG3V04pd) : vc0.DmJncFq5((longValue - bd1Var.Yi7zF1RB1) / f);
                float f3 = ((n3) bd1Var.GWasM1elztuh.iwATDS1i01k(Yi7zF1RB1, n3Var, n3Var2, bd1Var.X1lG3V04pd)).GWasM1elztuh;
                bd1Var.X1lG3V04pd = (n3) bd1Var.GWasM1elztuh.E7jCp8Ls(Yi7zF1RB1, n3Var, n3Var2, bd1Var.X1lG3V04pd);
                bd1Var.Yi7zF1RB1 = longValue;
                float f4 = bd1Var.OOA6hdeuvCS - f3;
                bd1Var.OOA6hdeuvCS = f3;
                hvVar.mOu10nynGul(Float.valueOf(f4));
                break;
        }
        return kc1Var;
    }

    public /* synthetic */ m91(bd1 bd1Var, float f, hv hvVar) {
        this.AvO7iQsrTN = bd1Var;
        this.EljAMC1QTz = f;
        this.encWxUiV2 = hvVar;
    }
}
