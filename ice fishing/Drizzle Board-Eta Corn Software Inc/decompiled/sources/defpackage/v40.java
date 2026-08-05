package defpackage;

import com.kolosta.rejin.jilosa.presentation.ui.SauceBenchFragment;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class v40 extends bb0 implements dl {
    public final /* synthetic */ int P7K7Inc8;
    public final /* synthetic */ SauceBenchFragment Qr9iLBAD;
    public int b2ZJblxo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v40(SauceBenchFragment sauceBenchFragment, g9 g9Var, int i) {
        super(2, g9Var);
        this.P7K7Inc8 = i;
        this.Qr9iLBAD = sauceBenchFragment;
    }

    @Override // defpackage.h9
    public final Object OxcuoDLp(Object obj) {
        int i = this.P7K7Inc8;
        int i2 = 0;
        xe0 xe0Var = xe0.qoPGr6Ce;
        u9 u9Var = u9.NCTxEWno;
        SauceBenchFragment sauceBenchFragment = this.Qr9iLBAD;
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
                h70 h70Var = sauceBenchFragment.FXJmAAN1().VgvYg0wo;
                u40 u40Var = new u40(sauceBenchFragment, i2);
                this.b2ZJblxo = 1;
                h70Var.getClass();
                h70.eVhOlqcC(h70Var, u40Var, this);
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
                bk lDXGDhIF = sauceBenchFragment.lDXGDhIF();
                v40 v40Var = new v40(sauceBenchFragment, g9Var, i2);
                this.b2ZJblxo = 1;
                return le0.VhgXwMj9(lDXGDhIF, v40Var, this) == u9Var ? u9Var : xe0Var;
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
                e10 e10Var = sauceBenchFragment.FXJmAAN1().P7K7Inc8;
                u40 u40Var2 = new u40(sauceBenchFragment, i3);
                this.b2ZJblxo = 1;
                e10Var.NCTxEWno.NCTxEWno(u40Var2, this);
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
                bk lDXGDhIF2 = sauceBenchFragment.lDXGDhIF();
                v40 v40Var2 = new v40(sauceBenchFragment, g9Var, 2);
                this.b2ZJblxo = 1;
                return le0.VhgXwMj9(lDXGDhIF2, v40Var2, this) == u9Var ? u9Var : xe0Var;
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
                ((v40) lDXGDhIF(g9Var, t9Var)).OxcuoDLp(xe0Var);
                return u9Var;
            case 1:
                return ((v40) lDXGDhIF(g9Var, t9Var)).OxcuoDLp(xe0Var);
            case 2:
                ((v40) lDXGDhIF(g9Var, t9Var)).OxcuoDLp(xe0Var);
                return u9Var;
            default:
                return ((v40) lDXGDhIF(g9Var, t9Var)).OxcuoDLp(xe0Var);
        }
    }

    @Override // defpackage.h9
    public final g9 lDXGDhIF(g9 g9Var, Object obj) {
        int i = this.P7K7Inc8;
        SauceBenchFragment sauceBenchFragment = this.Qr9iLBAD;
        switch (i) {
            case 0:
                return new v40(sauceBenchFragment, g9Var, 0);
            case 1:
                return new v40(sauceBenchFragment, g9Var, 1);
            case 2:
                return new v40(sauceBenchFragment, g9Var, 2);
            default:
                return new v40(sauceBenchFragment, g9Var, 3);
        }
    }
}
