package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class m41 extends d71 implements lv {
    public final /* synthetic */ lv E7jCp8Ls;
    public int JFJ3QoxA;
    public final /* synthetic */ mg0 XnEVoBF0td1l;
    public final /* synthetic */ int mOu10nynGul;
    public /* synthetic */ Object rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m41(lv lvVar, mg0 mg0Var, vg vgVar, int i) {
        super(2, vgVar);
        this.mOu10nynGul = i;
        this.E7jCp8Ls = lvVar;
        this.XnEVoBF0td1l = mg0Var;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        ph phVar = (ph) obj;
        vg vgVar = (vg) obj2;
        switch (i) {
        }
        return ((m41) uFEq9NpZ(vgVar, phVar)).WIEu4Ya2g8(kc1Var);
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        mg0 mg0Var = this.XnEVoBF0td1l;
        lv lvVar = this.E7jCp8Ls;
        qh qhVar = qh.OOA6hdeuvCS;
        switch (i) {
            case 0:
                int i2 = this.JFJ3QoxA;
                if (i2 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    cs0 cs0Var = new cs0(mg0Var, ((ph) this.rQPn8YBR).EljAMC1QTz());
                    this.JFJ3QoxA = 1;
                    if (lvVar.EljAMC1QTz(cs0Var, this) == qhVar) {
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
                    cs0 cs0Var2 = new cs0(mg0Var, ((ph) this.rQPn8YBR).EljAMC1QTz());
                    this.JFJ3QoxA = 1;
                    if (lvVar.EljAMC1QTz(cs0Var2, this) == qhVar) {
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
                    cs0 cs0Var3 = new cs0(mg0Var, ((ph) this.rQPn8YBR).EljAMC1QTz());
                    this.JFJ3QoxA = 1;
                    if (lvVar.EljAMC1QTz(cs0Var3, this) == qhVar) {
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
                m41 m41Var = new m41(this.E7jCp8Ls, this.XnEVoBF0td1l, vgVar, 0);
                m41Var.rQPn8YBR = obj;
                return m41Var;
            case 1:
                m41 m41Var2 = new m41(this.E7jCp8Ls, this.XnEVoBF0td1l, vgVar, 1);
                m41Var2.rQPn8YBR = obj;
                return m41Var2;
            default:
                m41 m41Var3 = new m41(this.E7jCp8Ls, this.XnEVoBF0td1l, vgVar, 2);
                m41Var3.rQPn8YBR = obj;
                return m41Var3;
        }
    }
}
