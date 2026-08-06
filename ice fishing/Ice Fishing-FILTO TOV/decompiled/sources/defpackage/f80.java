package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class f80 extends d71 implements lv {
    public final /* synthetic */ g80 JFJ3QoxA;
    public int mOu10nynGul;
    public final /* synthetic */ int rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f80(g80 g80Var, int i, vg vgVar) {
        super(2, vgVar);
        this.JFJ3QoxA = g80Var;
        this.rQPn8YBR = i;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        return ((f80) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1.GWasM1elztuh);
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        if (i != 0) {
            if (i == 1) {
                o50.A1EKNP6CxJ(obj);
                return kc1Var;
            }
            o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o50.A1EKNP6CxJ(obj);
        b80 b80Var = this.JFJ3QoxA.jivtDDk9H;
        this.mOu10nynGul = 1;
        u80 u80Var = b80Var.Yi7zF1RB1;
        d dVar = u80.WdrkLMV3xh;
        u80Var.getClass();
        Object xqGvceK5x = u80Var.xqGvceK5x(tg0.OOA6hdeuvCS, new xj(u80Var, this.rQPn8YBR, (vg) null), this);
        qh qhVar = qh.OOA6hdeuvCS;
        if (xqGvceK5x != qhVar) {
            xqGvceK5x = kc1Var;
        }
        if (xqGvceK5x != qhVar) {
            xqGvceK5x = kc1Var;
        }
        return xqGvceK5x == qhVar ? qhVar : kc1Var;
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        return new f80(this.JFJ3QoxA, this.rQPn8YBR, vgVar);
    }
}
