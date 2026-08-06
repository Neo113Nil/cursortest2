package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class rz0 extends d71 implements lv {
    public final /* synthetic */ Object E7jCp8Ls;
    public /* synthetic */ Object JFJ3QoxA;
    public final /* synthetic */ vz0 XnEVoBF0td1l;
    public final /* synthetic */ float iwATDS1i01k;
    public int mOu10nynGul;
    public final /* synthetic */ Object rQPn8YBR;
    public final /* synthetic */ qa1 uFEq9NpZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz0(Object obj, Object obj2, vz0 vz0Var, qa1 qa1Var, float f, vg vgVar) {
        super(2, vgVar);
        this.rQPn8YBR = obj;
        this.E7jCp8Ls = obj2;
        this.XnEVoBF0td1l = vz0Var;
        this.uFEq9NpZ = qa1Var;
        this.iwATDS1i01k = f;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        return ((rz0) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1.GWasM1elztuh);
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        vg vgVar = null;
        vz0 vz0Var = this.XnEVoBF0td1l;
        if (i == 0) {
            o50.A1EKNP6CxJ(obj);
            ph phVar = (ph) this.JFJ3QoxA;
            Object obj2 = this.rQPn8YBR;
            Object obj3 = this.E7jCp8Ls;
            if (o30.rQPn8YBR(obj2, obj3)) {
                vz0Var.iwATDS1i01k = null;
                if (o30.rQPn8YBR(vz0Var.X1lG3V04pd.getValue(), obj2)) {
                    return kc1Var;
                }
            } else {
                vz0.XnEVoBF0td1l(vz0Var);
            }
            boolean rQPn8YBR = o30.rQPn8YBR(obj2, obj3);
            float f = this.iwATDS1i01k;
            if (!rQPn8YBR) {
                qa1 qa1Var = this.uFEq9NpZ;
                qa1Var.WIEu4Ya2g8(obj2);
                qa1Var.uFEq9NpZ(0L);
                vz0Var.Yi7zF1RB1.setValue(obj2);
                qa1Var.JFJ3QoxA(f);
            }
            vz0Var.cilMamHF(f);
            if (vz0Var.uFEq9NpZ.mOu10nynGul()) {
                fb1.MZhzXH72(phVar, null, new xj(vz0Var, vgVar, 6), 3);
            } else {
                vz0Var.XnEVoBF0td1l = Long.MIN_VALUE;
            }
            this.mOu10nynGul = 1;
            Object WIEu4Ya2g8 = vz0.WIEu4Ya2g8(vz0Var, this);
            qh qhVar = qh.OOA6hdeuvCS;
            if (WIEu4Ya2g8 == qhVar) {
                return qhVar;
            }
        } else {
            if (i != 1) {
                o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o50.A1EKNP6CxJ(obj);
        }
        vz0Var.Y6hRI1cF8();
        return kc1Var;
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        rz0 rz0Var = new rz0(this.rQPn8YBR, this.E7jCp8Ls, this.XnEVoBF0td1l, this.uFEq9NpZ, this.iwATDS1i01k, vgVar);
        rz0Var.JFJ3QoxA = obj;
        return rz0Var;
    }
}
