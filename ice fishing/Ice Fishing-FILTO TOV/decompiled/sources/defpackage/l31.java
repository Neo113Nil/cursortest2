package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class l31 extends d71 implements lv {
    public final /* synthetic */ c51 E7jCp8Ls;
    public final /* synthetic */ g2 JFJ3QoxA;
    public int mOu10nynGul;
    public final /* synthetic */ boolean rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l31(g2 g2Var, boolean z, c51 c51Var, vg vgVar) {
        super(2, vgVar);
        this.JFJ3QoxA = g2Var;
        this.rQPn8YBR = z;
        this.E7jCp8Ls = c51Var;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        return ((l31) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1.GWasM1elztuh);
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.mOu10nynGul;
        if (i == 0) {
            o50.A1EKNP6CxJ(obj);
            Float f = new Float(this.rQPn8YBR ? 1.0f : 0.8f);
            this.mOu10nynGul = 1;
            Object X1lG3V04pd = g2.X1lG3V04pd(this.JFJ3QoxA, f, this.E7jCp8Ls, this);
            qh qhVar = qh.OOA6hdeuvCS;
            if (X1lG3V04pd == qhVar) {
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
        return new l31(this.JFJ3QoxA, this.rQPn8YBR, this.E7jCp8Ls, vgVar);
    }
}
