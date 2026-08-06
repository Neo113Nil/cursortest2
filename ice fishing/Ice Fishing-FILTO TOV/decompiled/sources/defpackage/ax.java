package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ax extends d71 implements lv {
    public final /* synthetic */ String E7jCp8Ls;
    public int JFJ3QoxA;
    public final /* synthetic */ int mOu10nynGul;
    public final /* synthetic */ p31 rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ax(p31 p31Var, String str, vg vgVar, int i) {
        super(2, vgVar);
        this.mOu10nynGul = i;
        this.rQPn8YBR = p31Var;
        this.E7jCp8Ls = str;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        ph phVar = (ph) obj;
        vg vgVar = (vg) obj2;
        switch (i) {
        }
        return ((ax) uFEq9NpZ(vgVar, phVar)).WIEu4Ya2g8(kc1Var);
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        String str = this.E7jCp8Ls;
        p31 p31Var = this.rQPn8YBR;
        qh qhVar = qh.OOA6hdeuvCS;
        switch (i) {
            case 0:
                int i2 = this.JFJ3QoxA;
                if (i2 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    this.JFJ3QoxA = 1;
                    if (p31.Yi7zF1RB1(p31Var, str, this) == qhVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    o50.A1EKNP6CxJ(obj);
                    break;
                }
                break;
            case 1:
                int i3 = this.JFJ3QoxA;
                if (i3 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    this.JFJ3QoxA = 1;
                    if (p31.Yi7zF1RB1(p31Var, str, this) == qhVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    o50.A1EKNP6CxJ(obj);
                    break;
                }
                break;
            default:
                int i4 = this.JFJ3QoxA;
                if (i4 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    this.JFJ3QoxA = 1;
                    if (p31.Yi7zF1RB1(p31Var, str, this) == qhVar) {
                        break;
                    }
                } else if (i4 != 1) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    o50.A1EKNP6CxJ(obj);
                    break;
                }
                break;
        }
        return qhVar;
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        switch (this.mOu10nynGul) {
            case 0:
                return new ax(this.rQPn8YBR, this.E7jCp8Ls, vgVar, 0);
            case 1:
                return new ax(this.rQPn8YBR, this.E7jCp8Ls, vgVar, 1);
            default:
                return new ax(this.rQPn8YBR, this.E7jCp8Ls, vgVar, 2);
        }
    }
}
