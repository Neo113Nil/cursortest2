package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class rQPn8YBR extends d71 implements lv {
    public final /* synthetic */ Object JFJ3QoxA;
    public final /* synthetic */ int mOu10nynGul;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rQPn8YBR(Object obj, vg vgVar, int i) {
        super(2, vgVar);
        this.mOu10nynGul = i;
        this.JFJ3QoxA = obj;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        ph phVar = (ph) obj;
        vg vgVar = (vg) obj2;
        switch (i) {
            case 0:
                ((rQPn8YBR) uFEq9NpZ(vgVar, phVar)).WIEu4Ya2g8(kc1Var);
                break;
            case 1:
                ((rQPn8YBR) uFEq9NpZ(vgVar, phVar)).WIEu4Ya2g8(kc1Var);
                break;
            default:
                ((rQPn8YBR) uFEq9NpZ(vgVar, phVar)).WIEu4Ya2g8(kc1Var);
                break;
        }
        return kc1Var;
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        Object obj2 = this.JFJ3QoxA;
        switch (i) {
            case 0:
                o50.A1EKNP6CxJ(obj);
                bb bbVar = (bb) obj2;
                if (bbVar.AEn1Rrio == null) {
                    vz vzVar = new vz();
                    tf0 tf0Var = bbVar.Y6hRI1cF8;
                    if (tf0Var != null) {
                        fb1.MZhzXH72(bbVar.oFzb77RX3H8t(), null, new xqGvceK5x(tf0Var, vzVar, null, 0), 3);
                    }
                    bbVar.AEn1Rrio = vzVar;
                    break;
                }
                break;
            case 1:
                o50.A1EKNP6CxJ(obj);
                bb bbVar2 = (bb) obj2;
                vz vzVar2 = bbVar2.AEn1Rrio;
                if (vzVar2 != null) {
                    wz wzVar = new wz(vzVar2);
                    tf0 tf0Var2 = bbVar2.Y6hRI1cF8;
                    if (tf0Var2 != null) {
                        fb1.MZhzXH72(bbVar2.oFzb77RX3H8t(), null, new xqGvceK5x(tf0Var2, wzVar, null, 1), 3);
                    }
                    bbVar2.AEn1Rrio = null;
                    break;
                }
                break;
            default:
                o50.A1EKNP6CxJ(obj);
                ((wu) obj2).GWasM1elztuh();
                break;
        }
        return kc1Var;
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        int i = this.mOu10nynGul;
        Object obj2 = this.JFJ3QoxA;
        switch (i) {
            case 0:
                return new rQPn8YBR((bb) obj2, vgVar, 0);
            case 1:
                return new rQPn8YBR((bb) obj2, vgVar, 1);
            default:
                return new rQPn8YBR((wu) obj2, vgVar, 2);
        }
    }
}
