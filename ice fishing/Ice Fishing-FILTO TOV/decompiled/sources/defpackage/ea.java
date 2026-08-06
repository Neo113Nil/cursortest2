package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ea extends d71 implements lv {
    public final /* synthetic */ ha E7jCp8Ls;
    public int JFJ3QoxA;
    public final /* synthetic */ ms XnEVoBF0td1l;
    public final /* synthetic */ int mOu10nynGul = 0;
    public /* synthetic */ Object rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(ha haVar, ms msVar, Object obj, vg vgVar) {
        super(2, vgVar);
        this.E7jCp8Ls = haVar;
        this.XnEVoBF0td1l = msVar;
        this.rQPn8YBR = obj;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        ph phVar = (ph) obj;
        vg vgVar = (vg) obj2;
        switch (i) {
        }
        return ((ea) uFEq9NpZ(vgVar, phVar)).WIEu4Ya2g8(kc1Var);
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        qh qhVar = qh.OOA6hdeuvCS;
        switch (i) {
            case 0:
                int i2 = this.JFJ3QoxA;
                if (i2 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    mv mvVar = this.E7jCp8Ls.mOu10nynGul;
                    Object obj2 = this.rQPn8YBR;
                    this.JFJ3QoxA = 1;
                    if (mvVar.X1lG3V04pd(this.XnEVoBF0td1l, obj2, this) == qhVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    o50.A1EKNP6CxJ(obj);
                    break;
                }
                break;
            default:
                int i3 = this.JFJ3QoxA;
                if (i3 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    ph phVar = (ph) this.rQPn8YBR;
                    rt0 rt0Var = new rt0();
                    ha haVar = this.E7jCp8Ls;
                    ls lsVar = haVar.encWxUiV2;
                    ga gaVar = new ga(rt0Var, phVar, haVar, this.XnEVoBF0td1l, 0);
                    this.JFJ3QoxA = 1;
                    if (lsVar.GWasM1elztuh(gaVar, this) == qhVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    o50.A1EKNP6CxJ(obj);
                    break;
                }
                break;
        }
        return qhVar;
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        int i = this.mOu10nynGul;
        ms msVar = this.XnEVoBF0td1l;
        ha haVar = this.E7jCp8Ls;
        switch (i) {
            case 0:
                return new ea(haVar, msVar, this.rQPn8YBR, vgVar);
            default:
                ea eaVar = new ea(haVar, msVar, vgVar);
                eaVar.rQPn8YBR = obj;
                return eaVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea(ha haVar, ms msVar, vg vgVar) {
        super(2, vgVar);
        this.E7jCp8Ls = haVar;
        this.XnEVoBF0td1l = msVar;
    }
}
