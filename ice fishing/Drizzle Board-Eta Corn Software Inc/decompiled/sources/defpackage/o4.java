package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class o4 extends bb0 implements dl {
    public final /* synthetic */ int P7K7Inc8 = 1;
    public /* synthetic */ Object Qr9iLBAD;
    public int b2ZJblxo;
    public final /* synthetic */ yg eVhOlqcC;
    public final /* synthetic */ r4 jb9XjC4I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(r4 r4Var, yg ygVar, Object obj, g9 g9Var) {
        super(2, g9Var);
        this.jb9XjC4I = r4Var;
        this.eVhOlqcC = ygVar;
        this.Qr9iLBAD = obj;
    }

    @Override // defpackage.h9
    public final Object OxcuoDLp(Object obj) {
        int i = this.P7K7Inc8;
        xe0 xe0Var = xe0.qoPGr6Ce;
        yg ygVar = this.eVhOlqcC;
        r4 r4Var = this.jb9XjC4I;
        u9 u9Var = u9.NCTxEWno;
        switch (i) {
            case 0:
                int i2 = this.b2ZJblxo;
                if (i2 == 0) {
                    fn.SgZGMMPL(obj);
                    el elVar = r4Var.P7K7Inc8;
                    Object obj2 = this.Qr9iLBAD;
                    this.b2ZJblxo = 1;
                    if (elVar.b2ZJblxo(ygVar, obj2, this) == u9Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    fn.SgZGMMPL(obj);
                    break;
                }
                break;
            default:
                int i3 = this.b2ZJblxo;
                if (i3 == 0) {
                    fn.SgZGMMPL(obj);
                    t9 t9Var = (t9) this.Qr9iLBAD;
                    l20 l20Var = new l20();
                    xg xgVar = r4Var.VgvYg0wo;
                    q4 q4Var = new q4(l20Var, t9Var, r4Var, ygVar);
                    this.b2ZJblxo = 1;
                    if (xgVar.NCTxEWno(q4Var, this) == u9Var) {
                        break;
                    }
                } else if (i3 != 1) {
                    m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    fn.SgZGMMPL(obj);
                    break;
                }
                break;
        }
        return u9Var;
    }

    @Override // defpackage.dl
    public final Object Qr9iLBAD(Object obj, Object obj2) {
        int i = this.P7K7Inc8;
        xe0 xe0Var = xe0.qoPGr6Ce;
        t9 t9Var = (t9) obj;
        g9 g9Var = (g9) obj2;
        switch (i) {
        }
        return ((o4) lDXGDhIF(g9Var, t9Var)).OxcuoDLp(xe0Var);
    }

    @Override // defpackage.h9
    public final g9 lDXGDhIF(g9 g9Var, Object obj) {
        int i = this.P7K7Inc8;
        yg ygVar = this.eVhOlqcC;
        r4 r4Var = this.jb9XjC4I;
        switch (i) {
            case 0:
                return new o4(r4Var, ygVar, this.Qr9iLBAD, g9Var);
            default:
                o4 o4Var = new o4(r4Var, ygVar, g9Var);
                o4Var.Qr9iLBAD = obj;
                return o4Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(r4 r4Var, yg ygVar, g9 g9Var) {
        super(2, g9Var);
        this.jb9XjC4I = r4Var;
        this.eVhOlqcC = ygVar;
    }
}
