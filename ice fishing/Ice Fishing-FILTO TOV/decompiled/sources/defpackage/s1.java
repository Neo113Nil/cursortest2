package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class s1 extends d71 implements lv {
    public final /* synthetic */ int mOu10nynGul;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(int i, vg vgVar, int i2) {
        super(i, vgVar);
        this.mOu10nynGul = i2;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        switch (i) {
            case 0:
                break;
            case 1:
                ((s1) uFEq9NpZ((vg) obj2, (ls) obj)).WIEu4Ya2g8(kc1Var);
                break;
            default:
                ((s1) uFEq9NpZ((vg) obj2, (ms) obj)).WIEu4Ya2g8(kc1Var);
                break;
        }
        return kc1Var;
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        switch (i) {
            case 0:
                o50.A1EKNP6CxJ(obj);
                break;
            case 1:
                o50.A1EKNP6CxJ(obj);
                break;
            default:
                o50.A1EKNP6CxJ(obj);
                break;
        }
        return kc1Var;
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        switch (this.mOu10nynGul) {
            case 0:
                return new s1(2, vgVar, 0);
            case 1:
                return new s1(2, vgVar, 1);
            default:
                return new s1(2, vgVar, 2);
        }
    }
}
