package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ni extends d71 implements lv {
    public /* synthetic */ Object JFJ3QoxA;
    public final /* synthetic */ int mOu10nynGul;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ni(int i, vg vgVar, int i2) {
        super(i, vgVar);
        this.mOu10nynGul = i2;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        switch (i) {
            case 0:
                return ((ni) uFEq9NpZ((vg) obj2, (l51) obj)).WIEu4Ya2g8(kc1Var);
            case 1:
                ((ni) uFEq9NpZ((vg) obj2, (eg0) obj)).WIEu4Ya2g8(kc1Var);
                return kc1Var;
            case 2:
                return ((ni) uFEq9NpZ((vg) obj2, (dt0) obj)).WIEu4Ya2g8(kc1Var);
            default:
                return ((ni) uFEq9NpZ((vg) obj2, (j21) obj)).WIEu4Ya2g8(kc1Var);
        }
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        switch (this.mOu10nynGul) {
            case 0:
                o50.A1EKNP6CxJ(obj);
                return Boolean.valueOf(!(((l51) this.JFJ3QoxA) instanceof wr));
            case 1:
                eg0 eg0Var = (eg0) this.JFJ3QoxA;
                o50.A1EKNP6CxJ(obj);
                eg0Var.getClass();
                dr0 dr0Var = lj.X1lG3V04pd;
                dr0Var.getClass();
                eg0Var.Yi7zF1RB1();
                eg0Var.GWasM1elztuh.remove(dr0Var);
                eg0Var.xqGvceK5x(lj.xqGvceK5x, new Integer(5));
                return kc1.GWasM1elztuh;
            case 2:
                o50.A1EKNP6CxJ(obj);
                return Boolean.valueOf(((dt0) this.JFJ3QoxA) == dt0.OOA6hdeuvCS);
            default:
                o50.A1EKNP6CxJ(obj);
                return Boolean.valueOf(((j21) this.JFJ3QoxA) != j21.OOA6hdeuvCS);
        }
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        switch (this.mOu10nynGul) {
            case 0:
                ni niVar = new ni(2, vgVar, 0);
                niVar.JFJ3QoxA = obj;
                return niVar;
            case 1:
                ni niVar2 = new ni(2, vgVar, 1);
                niVar2.JFJ3QoxA = obj;
                return niVar2;
            case 2:
                ni niVar3 = new ni(2, vgVar, 2);
                niVar3.JFJ3QoxA = obj;
                return niVar3;
            default:
                ni niVar4 = new ni(2, vgVar, 3);
                niVar4.JFJ3QoxA = obj;
                return niVar4;
        }
    }
}
