package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ei1 extends d71 implements lv {
    public int JFJ3QoxA;
    public final /* synthetic */ int mOu10nynGul;
    public final /* synthetic */ fi1 rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ei1(fi1 fi1Var, vg vgVar, int i) {
        super(2, vgVar);
        this.mOu10nynGul = i;
        this.rQPn8YBR = fi1Var;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        ph phVar = (ph) obj;
        vg vgVar = (vg) obj2;
        switch (i) {
        }
        return ((ei1) uFEq9NpZ(vgVar, phVar)).WIEu4Ya2g8(kc1Var);
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.mOu10nynGul;
        fi1 fi1Var = this.rQPn8YBR;
        qh qhVar = qh.OOA6hdeuvCS;
        kc1 kc1Var = kc1.GWasM1elztuh;
        switch (i) {
            case 0:
                int i2 = this.JFJ3QoxA;
                if (i2 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    c cVar = fi1Var.OOA6hdeuvCS;
                    this.JFJ3QoxA = 1;
                    Object xqGvceK5x = cVar.EXrPz3p7hFb.xqGvceK5x(this);
                    if (xqGvceK5x != qhVar) {
                        xqGvceK5x = kc1Var;
                    }
                    if (xqGvceK5x == qhVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    o50.A1EKNP6CxJ(obj);
                }
                break;
            default:
                int i3 = this.JFJ3QoxA;
                if (i3 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    c cVar2 = fi1Var.OOA6hdeuvCS;
                    this.JFJ3QoxA = 1;
                    Object xqGvceK5x2 = cVar2.ozMwhSAI.xqGvceK5x(this);
                    if (xqGvceK5x2 != qhVar) {
                        xqGvceK5x2 = kc1Var;
                    }
                    if (xqGvceK5x2 == qhVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    o50.A1EKNP6CxJ(obj);
                }
                break;
        }
        return qhVar;
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        int i = this.mOu10nynGul;
        fi1 fi1Var = this.rQPn8YBR;
        switch (i) {
            case 0:
                return new ei1(fi1Var, vgVar, 0);
            default:
                return new ei1(fi1Var, vgVar, 1);
        }
    }
}
