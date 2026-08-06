package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class s2 extends h50 implements hv {
    public final /* synthetic */ t2 AvO7iQsrTN;
    public final /* synthetic */ up0[] EljAMC1QTz;
    public final /* synthetic */ int encWxUiV2;
    public final /* synthetic */ int mOu10nynGul;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(up0[] up0VarArr, t2 t2Var, int i, int i2) {
        super(1);
        this.EljAMC1QTz = up0VarArr;
        this.AvO7iQsrTN = t2Var;
        this.encWxUiV2 = i;
        this.mOu10nynGul = i2;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        tp0 tp0Var = (tp0) obj;
        for (up0 up0Var : this.EljAMC1QTz) {
            if (up0Var != null) {
                long GWasM1elztuh = this.AvO7iQsrTN.GWasM1elztuh.Yi7zF1RB1.GWasM1elztuh((up0Var.OOA6hdeuvCS << 32) | (up0Var.EljAMC1QTz & 4294967295L), (this.encWxUiV2 << 32) | (this.mOu10nynGul & 4294967295L), p50.OOA6hdeuvCS);
                tp0.AvO7iQsrTN(tp0Var, up0Var, (int) (GWasM1elztuh >> 32), (int) (GWasM1elztuh & 4294967295L));
            }
        }
        return kc1.GWasM1elztuh;
    }
}
