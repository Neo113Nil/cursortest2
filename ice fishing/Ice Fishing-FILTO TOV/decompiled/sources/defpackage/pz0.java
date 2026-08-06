package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class pz0 extends d71 implements hv {
    public final /* synthetic */ Object E7jCp8Ls;
    public int JFJ3QoxA;
    public final /* synthetic */ qa1 XnEVoBF0td1l;
    public final /* synthetic */ int mOu10nynGul = 0;
    public final /* synthetic */ vz0 rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz0(qa1 qa1Var, vz0 vz0Var, Object obj, vg vgVar) {
        super(1, vgVar);
        this.XnEVoBF0td1l = qa1Var;
        this.rQPn8YBR = vz0Var;
        this.E7jCp8Ls = obj;
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        qh qhVar = qh.OOA6hdeuvCS;
        vz0 vz0Var = this.rQPn8YBR;
        Object obj2 = this.E7jCp8Ls;
        qa1 qa1Var = this.XnEVoBF0td1l;
        switch (i) {
            case 0:
                int i2 = this.JFJ3QoxA;
                if (i2 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    ei eiVar = new ei(vz0Var, obj2, qa1Var, null);
                    this.JFJ3QoxA = 1;
                    if (fb1.mE4lRynR(eiVar, this) == qhVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    o50.A1EKNP6CxJ(obj);
                }
                qa1Var.mOu10nynGul();
                break;
            default:
                int i3 = this.JFJ3QoxA;
                if (i3 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    vz0Var.Mjvvu5DE();
                    fo0 fo0Var = vz0Var.Yi7zF1RB1;
                    vz0Var.XnEVoBF0td1l = Long.MIN_VALUE;
                    vz0Var.cilMamHF(0.0f);
                    float f = obj2.equals(vz0Var.X1lG3V04pd.getValue()) ? -4.0f : obj2.equals(fo0Var.getValue()) ? -5.0f : -3.0f;
                    qa1Var.WIEu4Ya2g8(obj2);
                    qa1Var.uFEq9NpZ(0L);
                    fo0Var.setValue(obj2);
                    vz0Var.cilMamHF(0.0f);
                    vz0Var.JFJ3QoxA(obj2);
                    qa1Var.JFJ3QoxA(f);
                    if (f == -3.0f) {
                        this.JFJ3QoxA = 1;
                        if (vz0.WIEu4Ya2g8(vz0Var, this) == qhVar) {
                            break;
                        }
                    }
                } else if (i3 != 1) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    o50.A1EKNP6CxJ(obj);
                }
                qa1Var.mOu10nynGul();
                break;
        }
        return kc1Var;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        qa1 qa1Var = this.XnEVoBF0td1l;
        Object obj2 = this.E7jCp8Ls;
        vz0 vz0Var = this.rQPn8YBR;
        vg vgVar = (vg) obj;
        switch (i) {
            case 0:
                return new pz0(qa1Var, vz0Var, obj2, vgVar).WIEu4Ya2g8(kc1Var);
            default:
                return new pz0(vz0Var, obj2, qa1Var, vgVar).WIEu4Ya2g8(kc1Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz0(vz0 vz0Var, Object obj, qa1 qa1Var, vg vgVar) {
        super(1, vgVar);
        this.rQPn8YBR = vz0Var;
        this.E7jCp8Ls = obj;
        this.XnEVoBF0td1l = qa1Var;
    }
}
