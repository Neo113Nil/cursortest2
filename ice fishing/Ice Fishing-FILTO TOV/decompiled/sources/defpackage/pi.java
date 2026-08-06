package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class pi extends d71 implements mv {
    public int JFJ3QoxA;
    public final /* synthetic */ int mOu10nynGul = 1;
    public /* synthetic */ Object rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(fj fjVar, vg vgVar) {
        super(3, vgVar);
        this.rQPn8YBR = fjVar;
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.mOu10nynGul;
        qh qhVar = qh.OOA6hdeuvCS;
        int i2 = 1;
        vg vgVar = null;
        switch (i) {
            case 0:
                int i3 = this.JFJ3QoxA;
                if (i3 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    fj fjVar = (fj) this.rQPn8YBR;
                    this.JFJ3QoxA = 1;
                    if (fj.X1lG3V04pd(fjVar, this) == qhVar) {
                        return qhVar;
                    }
                } else {
                    if (i3 != 1) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o50.A1EKNP6CxJ(obj);
                }
                return kc1.GWasM1elztuh;
            default:
                int i4 = this.JFJ3QoxA;
                if (i4 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    lr lrVar = (lr) this.rQPn8YBR;
                    this.JFJ3QoxA = 1;
                    if (!lrVar.Yi7zF1RB1.get()) {
                        Object JFJ3QoxA = o30.JFJ3QoxA(lrVar.GWasM1elztuh, new zi(lrVar, vgVar, i2), this);
                        return JFJ3QoxA == qhVar ? qhVar : JFJ3QoxA;
                    }
                    o4.jivtDDk9H("This scope has already been closed.");
                } else {
                    if (i4 == 1) {
                        o50.A1EKNP6CxJ(obj);
                        return obj;
                    }
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    @Override // defpackage.mv
    public final Object X1lG3V04pd(Object obj, Object obj2, Object obj3) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        switch (i) {
            case 0:
                return new pi((fj) this.rQPn8YBR, (vg) obj3).WIEu4Ya2g8(kc1Var);
            default:
                ((Boolean) obj2).getClass();
                pi piVar = new pi(3, (vg) obj3);
                piVar.rQPn8YBR = (lr) obj;
                return piVar.WIEu4Ya2g8(kc1Var);
        }
    }

    public /* synthetic */ pi(int i, vg vgVar) {
        super(i, vgVar);
    }
}
