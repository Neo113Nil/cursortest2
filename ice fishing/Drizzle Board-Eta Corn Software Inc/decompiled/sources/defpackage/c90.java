package defpackage;

import com.kolosta.rejin.jilosa.presentation.ui.SprintRoundFragment;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class c90 extends bb0 implements dl {
    public final /* synthetic */ int P7K7Inc8;
    public final /* synthetic */ SprintRoundFragment Qr9iLBAD;
    public int b2ZJblxo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c90(SprintRoundFragment sprintRoundFragment, g9 g9Var, int i) {
        super(2, g9Var);
        this.P7K7Inc8 = i;
        this.Qr9iLBAD = sprintRoundFragment;
    }

    @Override // defpackage.h9
    public final Object OxcuoDLp(Object obj) {
        int i = this.P7K7Inc8;
        int i2 = 0;
        xe0 xe0Var = xe0.qoPGr6Ce;
        u9 u9Var = u9.NCTxEWno;
        SprintRoundFragment sprintRoundFragment = this.Qr9iLBAD;
        int i3 = 1;
        g9 g9Var = null;
        switch (i) {
            case 0:
                int i4 = this.b2ZJblxo;
                if (i4 != 0) {
                    if (i4 != 1) {
                        m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fn.SgZGMMPL(obj);
                    throw new d7();
                }
                fn.SgZGMMPL(obj);
                h70 h70Var = ((h90) sprintRoundFragment.tef3qNMP.getValue()).Qr9iLBAD;
                b90 b90Var = new b90(sprintRoundFragment, i2);
                this.b2ZJblxo = 1;
                h70Var.getClass();
                h70.eVhOlqcC(h70Var, b90Var, this);
                return u9Var;
            case 1:
                int i5 = this.b2ZJblxo;
                if (i5 != 0) {
                    if (i5 == 1) {
                        fn.SgZGMMPL(obj);
                        return xe0Var;
                    }
                    m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fn.SgZGMMPL(obj);
                bk lDXGDhIF = sprintRoundFragment.lDXGDhIF();
                c90 c90Var = new c90(sprintRoundFragment, g9Var, i2);
                this.b2ZJblxo = 1;
                return le0.VhgXwMj9(lDXGDhIF, c90Var, this) == u9Var ? u9Var : xe0Var;
            case 2:
                int i6 = this.b2ZJblxo;
                if (i6 != 0) {
                    if (i6 != 1) {
                        m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fn.SgZGMMPL(obj);
                    throw new d7();
                }
                fn.SgZGMMPL(obj);
                e10 e10Var = ((h90) sprintRoundFragment.tef3qNMP.getValue()).P7K7Inc8;
                b90 b90Var2 = new b90(sprintRoundFragment, i3);
                this.b2ZJblxo = 1;
                e10Var.NCTxEWno.NCTxEWno(b90Var2, this);
                return u9Var;
            default:
                int i7 = this.b2ZJblxo;
                if (i7 != 0) {
                    if (i7 == 1) {
                        fn.SgZGMMPL(obj);
                        return xe0Var;
                    }
                    m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fn.SgZGMMPL(obj);
                bk lDXGDhIF2 = sprintRoundFragment.lDXGDhIF();
                c90 c90Var2 = new c90(sprintRoundFragment, g9Var, 2);
                this.b2ZJblxo = 1;
                return le0.VhgXwMj9(lDXGDhIF2, c90Var2, this) == u9Var ? u9Var : xe0Var;
        }
    }

    @Override // defpackage.dl
    public final Object Qr9iLBAD(Object obj, Object obj2) {
        int i = this.P7K7Inc8;
        u9 u9Var = u9.NCTxEWno;
        xe0 xe0Var = xe0.qoPGr6Ce;
        t9 t9Var = (t9) obj;
        g9 g9Var = (g9) obj2;
        switch (i) {
            case 0:
                ((c90) lDXGDhIF(g9Var, t9Var)).OxcuoDLp(xe0Var);
                return u9Var;
            case 1:
                return ((c90) lDXGDhIF(g9Var, t9Var)).OxcuoDLp(xe0Var);
            case 2:
                ((c90) lDXGDhIF(g9Var, t9Var)).OxcuoDLp(xe0Var);
                return u9Var;
            default:
                return ((c90) lDXGDhIF(g9Var, t9Var)).OxcuoDLp(xe0Var);
        }
    }

    @Override // defpackage.h9
    public final g9 lDXGDhIF(g9 g9Var, Object obj) {
        int i = this.P7K7Inc8;
        SprintRoundFragment sprintRoundFragment = this.Qr9iLBAD;
        switch (i) {
            case 0:
                return new c90(sprintRoundFragment, g9Var, 0);
            case 1:
                return new c90(sprintRoundFragment, g9Var, 1);
            case 2:
                return new c90(sprintRoundFragment, g9Var, 2);
            default:
                return new c90(sprintRoundFragment, g9Var, 3);
        }
    }
}
