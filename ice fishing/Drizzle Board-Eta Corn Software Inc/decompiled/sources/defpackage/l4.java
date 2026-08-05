package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class l4 extends bb0 implements dl {
    public final /* synthetic */ int P7K7Inc8;
    public /* synthetic */ Object Qr9iLBAD;
    public int b2ZJblxo;
    public final /* synthetic */ m4 jb9XjC4I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l4(m4 m4Var, g9 g9Var, int i) {
        super(2, g9Var);
        this.P7K7Inc8 = i;
        this.jb9XjC4I = m4Var;
    }

    @Override // defpackage.h9
    public final Object OxcuoDLp(Object obj) {
        int i = this.P7K7Inc8;
        m4 m4Var = this.jb9XjC4I;
        xe0 xe0Var = xe0.qoPGr6Ce;
        u9 u9Var = u9.NCTxEWno;
        switch (i) {
            case 0:
                int i2 = this.b2ZJblxo;
                if (i2 == 0) {
                    fn.SgZGMMPL(obj);
                    i00 i00Var = (i00) this.Qr9iLBAD;
                    this.b2ZJblxo = 1;
                    Object wxUZMvaN = m4Var.wxUZMvaN(new j60(i00Var), this);
                    if (wxUZMvaN != u9Var) {
                        wxUZMvaN = xe0Var;
                    }
                    if (wxUZMvaN == u9Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    fn.SgZGMMPL(obj);
                }
                break;
            default:
                int i3 = this.b2ZJblxo;
                if (i3 == 0) {
                    fn.SgZGMMPL(obj);
                    yg ygVar = (yg) this.Qr9iLBAD;
                    this.b2ZJblxo = 1;
                    if (m4Var.wxUZMvaN(ygVar, this) == u9Var) {
                        break;
                    }
                } else if (i3 != 1) {
                    m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    fn.SgZGMMPL(obj);
                }
                break;
        }
        return xe0Var;
    }

    @Override // defpackage.dl
    public final Object Qr9iLBAD(Object obj, Object obj2) {
        int i = this.P7K7Inc8;
        xe0 xe0Var = xe0.qoPGr6Ce;
        switch (i) {
            case 0:
                return ((l4) lDXGDhIF((g9) obj2, (i00) obj)).OxcuoDLp(xe0Var);
            default:
                return ((l4) lDXGDhIF((g9) obj2, (yg) obj)).OxcuoDLp(xe0Var);
        }
    }

    @Override // defpackage.h9
    public final g9 lDXGDhIF(g9 g9Var, Object obj) {
        int i = this.P7K7Inc8;
        m4 m4Var = this.jb9XjC4I;
        switch (i) {
            case 0:
                l4 l4Var = new l4(m4Var, g9Var, 0);
                l4Var.Qr9iLBAD = obj;
                return l4Var;
            default:
                l4 l4Var2 = new l4(m4Var, g9Var, 1);
                l4Var2.Qr9iLBAD = obj;
                return l4Var2;
        }
    }
}
