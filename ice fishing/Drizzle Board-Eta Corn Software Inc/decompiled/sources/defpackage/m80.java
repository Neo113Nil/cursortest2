package defpackage;

import com.kolosta.rejin.jilosa.presentation.ui.SprintRecapFragment;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class m80 extends bb0 implements dl {
    public final /* synthetic */ int P7K7Inc8;
    public final /* synthetic */ SprintRecapFragment Qr9iLBAD;
    public int b2ZJblxo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m80(SprintRecapFragment sprintRecapFragment, g9 g9Var, int i) {
        super(2, g9Var);
        this.P7K7Inc8 = i;
        this.Qr9iLBAD = sprintRecapFragment;
    }

    @Override // defpackage.h9
    public final Object OxcuoDLp(Object obj) {
        int i = this.P7K7Inc8;
        u9 u9Var = u9.NCTxEWno;
        SprintRecapFragment sprintRecapFragment = this.Qr9iLBAD;
        g9 g9Var = null;
        switch (i) {
            case 0:
                int i2 = this.b2ZJblxo;
                if (i2 != 0) {
                    if (i2 != 1) {
                        m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fn.SgZGMMPL(obj);
                    throw new d7();
                }
                fn.SgZGMMPL(obj);
                e10 e10Var = ((p80) sprintRecapFragment.tef3qNMP.getValue()).b2ZJblxo;
                lx lxVar = new lx(3, sprintRecapFragment);
                this.b2ZJblxo = 1;
                e10Var.NCTxEWno.NCTxEWno(lxVar, this);
                return u9Var;
            default:
                int i3 = this.b2ZJblxo;
                if (i3 == 0) {
                    fn.SgZGMMPL(obj);
                    bk lDXGDhIF = sprintRecapFragment.lDXGDhIF();
                    m80 m80Var = new m80(sprintRecapFragment, g9Var, 0);
                    this.b2ZJblxo = 1;
                    if (le0.VhgXwMj9(lDXGDhIF, m80Var, this) == u9Var) {
                        return u9Var;
                    }
                } else {
                    if (i3 != 1) {
                        m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fn.SgZGMMPL(obj);
                }
                return xe0.qoPGr6Ce;
        }
    }

    @Override // defpackage.dl
    public final Object Qr9iLBAD(Object obj, Object obj2) {
        int i = this.P7K7Inc8;
        xe0 xe0Var = xe0.qoPGr6Ce;
        t9 t9Var = (t9) obj;
        g9 g9Var = (g9) obj2;
        switch (i) {
            case 0:
                ((m80) lDXGDhIF(g9Var, t9Var)).OxcuoDLp(xe0Var);
                return u9.NCTxEWno;
            default:
                return ((m80) lDXGDhIF(g9Var, t9Var)).OxcuoDLp(xe0Var);
        }
    }

    @Override // defpackage.h9
    public final g9 lDXGDhIF(g9 g9Var, Object obj) {
        int i = this.P7K7Inc8;
        SprintRecapFragment sprintRecapFragment = this.Qr9iLBAD;
        switch (i) {
            case 0:
                return new m80(sprintRecapFragment, g9Var, 0);
            default:
                return new m80(sprintRecapFragment, g9Var, 1);
        }
    }
}
