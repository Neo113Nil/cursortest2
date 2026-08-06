package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class vl extends d71 implements lv {
    public final /* synthetic */ am JFJ3QoxA;
    public final /* synthetic */ mg0 mOu10nynGul;
    public final /* synthetic */ p41 rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(mg0 mg0Var, am amVar, p41 p41Var, vg vgVar) {
        super(2, vgVar);
        this.mOu10nynGul = mg0Var;
        this.JFJ3QoxA = amVar;
        this.rQPn8YBR = p41Var;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        vl vlVar = (vl) uFEq9NpZ((vg) obj2, (ph) obj);
        kc1 kc1Var = kc1.GWasM1elztuh;
        vlVar.WIEu4Ya2g8(kc1Var);
        return kc1Var;
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        o50.A1EKNP6CxJ(obj);
        for (fh0 fh0Var : (Set) this.mOu10nynGul.getValue()) {
            am amVar = this.JFJ3QoxA;
            if (!((List) amVar.Yi7zF1RB1().OOA6hdeuvCS.OOA6hdeuvCS.getValue()).contains(fh0Var) && !this.rQPn8YBR.contains(fh0Var)) {
                amVar.Yi7zF1RB1().X1lG3V04pd(fh0Var);
            }
        }
        return kc1.GWasM1elztuh;
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        return new vl(this.mOu10nynGul, this.JFJ3QoxA, this.rQPn8YBR, vgVar);
    }
}
