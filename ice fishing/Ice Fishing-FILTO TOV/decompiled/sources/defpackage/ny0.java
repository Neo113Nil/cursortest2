package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ny0 extends d71 implements lv {
    public final /* synthetic */ float E7jCp8Ls;
    public final /* synthetic */ oy0 JFJ3QoxA;
    public int mOu10nynGul;
    public final /* synthetic */ float rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny0(oy0 oy0Var, float f, float f2, vg vgVar) {
        super(2, vgVar);
        this.JFJ3QoxA = oy0Var;
        this.rQPn8YBR = f;
        this.E7jCp8Ls = f2;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        return ((ny0) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1.GWasM1elztuh);
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.mOu10nynGul;
        if (i == 0) {
            o50.A1EKNP6CxJ(obj);
            this.mOu10nynGul = 1;
            Object GWasM1elztuh = hy0.GWasM1elztuh(this.JFJ3QoxA.YXi2hvwn7WL, (Float.floatToRawIntBits(this.rQPn8YBR) << 32) | (Float.floatToRawIntBits(this.E7jCp8Ls) & 4294967295L), this);
            qh qhVar = qh.OOA6hdeuvCS;
            if (GWasM1elztuh == qhVar) {
                return qhVar;
            }
        } else {
            if (i != 1) {
                o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o50.A1EKNP6CxJ(obj);
        }
        return kc1.GWasM1elztuh;
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        return new ny0(this.JFJ3QoxA, this.rQPn8YBR, this.E7jCp8Ls, vgVar);
    }
}
