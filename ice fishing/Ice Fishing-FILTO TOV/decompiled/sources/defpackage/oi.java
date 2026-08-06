package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class oi extends d71 implements lv {
    public /* synthetic */ Object JFJ3QoxA;
    public final /* synthetic */ int mOu10nynGul;
    public final /* synthetic */ Object rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oi(Object obj, vg vgVar, int i) {
        super(2, vgVar);
        this.mOu10nynGul = i;
        this.rQPn8YBR = obj;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        switch (i) {
            case 0:
                return ((oi) uFEq9NpZ((vg) obj2, (l51) obj)).WIEu4Ya2g8(kc1Var);
            default:
                ((oi) uFEq9NpZ((vg) obj2, (eg0) obj)).WIEu4Ya2g8(kc1Var);
                return kc1Var;
        }
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.mOu10nynGul;
        Object obj2 = this.rQPn8YBR;
        switch (i) {
            case 0:
                o50.A1EKNP6CxJ(obj);
                l51 l51Var = (l51) this.JFJ3QoxA;
                return Boolean.valueOf((l51Var instanceof bi) && ((bi) l51Var).GWasM1elztuh <= ((bi) ((l51) obj2)).GWasM1elztuh);
            default:
                eg0 eg0Var = (eg0) this.JFJ3QoxA;
                o50.A1EKNP6CxJ(obj);
                dr0 dr0Var = lj.xqGvceK5x;
                Integer num = (Integer) eg0Var.X1lG3V04pd(dr0Var);
                int intValue = num != null ? num.intValue() : 5;
                if (intValue > 0) {
                    eg0Var.OOA6hdeuvCS(dr0Var, new Integer(intValue - 1));
                    ((nt0) obj2).OOA6hdeuvCS = true;
                }
                return kc1.GWasM1elztuh;
        }
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        int i = this.mOu10nynGul;
        Object obj2 = this.rQPn8YBR;
        switch (i) {
            case 0:
                oi oiVar = new oi((l51) obj2, vgVar, 0);
                oiVar.JFJ3QoxA = obj;
                return oiVar;
            default:
                oi oiVar2 = new oi((nt0) obj2, vgVar, 1);
                oiVar2.JFJ3QoxA = obj;
                return oiVar2;
        }
    }
}
