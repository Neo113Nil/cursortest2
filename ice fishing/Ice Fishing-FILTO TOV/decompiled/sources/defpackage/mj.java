package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class mj extends d71 implements lv {
    public /* synthetic */ Object JFJ3QoxA;
    public final /* synthetic */ int mOu10nynGul;
    public final /* synthetic */ boolean rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mj(boolean z, vg vgVar, int i) {
        super(2, vgVar);
        this.mOu10nynGul = i;
        this.rQPn8YBR = z;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        eg0 eg0Var = (eg0) obj;
        vg vgVar = (vg) obj2;
        switch (i) {
            case 0:
                ((mj) uFEq9NpZ(vgVar, eg0Var)).WIEu4Ya2g8(kc1Var);
                break;
            case 1:
                ((mj) uFEq9NpZ(vgVar, eg0Var)).WIEu4Ya2g8(kc1Var);
                break;
            default:
                ((mj) uFEq9NpZ(vgVar, eg0Var)).WIEu4Ya2g8(kc1Var);
                break;
        }
        return kc1Var;
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        boolean z = this.rQPn8YBR;
        eg0 eg0Var = (eg0) this.JFJ3QoxA;
        switch (i) {
            case 0:
                o50.A1EKNP6CxJ(obj);
                eg0Var.xqGvceK5x(oj.xqGvceK5x, Boolean.valueOf(z));
                break;
            case 1:
                o50.A1EKNP6CxJ(obj);
                eg0Var.xqGvceK5x(oj.X1lG3V04pd, Boolean.valueOf(z));
                break;
            default:
                o50.A1EKNP6CxJ(obj);
                eg0Var.xqGvceK5x(oj.OOA6hdeuvCS, Boolean.valueOf(z));
                break;
        }
        return kc1Var;
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        switch (this.mOu10nynGul) {
            case 0:
                mj mjVar = new mj(this.rQPn8YBR, vgVar, 0);
                mjVar.JFJ3QoxA = obj;
                return mjVar;
            case 1:
                mj mjVar2 = new mj(this.rQPn8YBR, vgVar, 1);
                mjVar2.JFJ3QoxA = obj;
                return mjVar2;
            default:
                mj mjVar3 = new mj(this.rQPn8YBR, vgVar, 2);
                mjVar3.JFJ3QoxA = obj;
                return mjVar3;
        }
    }
}
