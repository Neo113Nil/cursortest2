package defpackage;

import com.kolosta.rejin.jilosa.presentation.ui.TasteLedgerFragment;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class tb0 extends bb0 implements dl {
    public final /* synthetic */ int P7K7Inc8;
    public final /* synthetic */ TasteLedgerFragment Qr9iLBAD;
    public int b2ZJblxo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tb0(TasteLedgerFragment tasteLedgerFragment, g9 g9Var, int i) {
        super(2, g9Var);
        this.P7K7Inc8 = i;
        this.Qr9iLBAD = tasteLedgerFragment;
    }

    @Override // defpackage.h9
    public final Object OxcuoDLp(Object obj) {
        int i = this.P7K7Inc8;
        u9 u9Var = u9.NCTxEWno;
        TasteLedgerFragment tasteLedgerFragment = this.Qr9iLBAD;
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
                e10 e10Var = ((yb0) tasteLedgerFragment.tef3qNMP.getValue()).NCTxEWno;
                lx lxVar = new lx(4, tasteLedgerFragment);
                this.b2ZJblxo = 1;
                e10Var.NCTxEWno.NCTxEWno(lxVar, this);
                return u9Var;
            default:
                int i3 = this.b2ZJblxo;
                if (i3 == 0) {
                    fn.SgZGMMPL(obj);
                    bk lDXGDhIF = tasteLedgerFragment.lDXGDhIF();
                    tb0 tb0Var = new tb0(tasteLedgerFragment, g9Var, 0);
                    this.b2ZJblxo = 1;
                    if (le0.VhgXwMj9(lDXGDhIF, tb0Var, this) == u9Var) {
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
                ((tb0) lDXGDhIF(g9Var, t9Var)).OxcuoDLp(xe0Var);
                return u9.NCTxEWno;
            default:
                return ((tb0) lDXGDhIF(g9Var, t9Var)).OxcuoDLp(xe0Var);
        }
    }

    @Override // defpackage.h9
    public final g9 lDXGDhIF(g9 g9Var, Object obj) {
        int i = this.P7K7Inc8;
        TasteLedgerFragment tasteLedgerFragment = this.Qr9iLBAD;
        switch (i) {
            case 0:
                return new tb0(tasteLedgerFragment, g9Var, 0);
            default:
                return new tb0(tasteLedgerFragment, g9Var, 1);
        }
    }
}
