package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class u20 extends bb0 implements dl {
    public l20 P7K7Inc8;
    public int Qr9iLBAD;
    public l20 b2ZJblxo;
    public final /* synthetic */ t9 eVhOlqcC;
    public final /* synthetic */ xo jb9XjC4I;
    public final /* synthetic */ dl k3x7lurq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u20(xo xoVar, t9 t9Var, dl dlVar, g9 g9Var) {
        super(2, g9Var);
        this.jb9XjC4I = xoVar;
        this.eVhOlqcC = t9Var;
        this.k3x7lurq = dlVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[SYNTHETIC] */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OxcuoDLp(Object obj) {
        l20 l20Var;
        Throwable th;
        l20 l20Var2;
        vn vnVar;
        to toVar;
        int i = this.Qr9iLBAD;
        xe0 xe0Var = xe0.qoPGr6Ce;
        xo xoVar = this.jb9XjC4I;
        if (i == 0) {
            fn.SgZGMMPL(obj);
            if (xoVar.MdtA4re8 != po.NCTxEWno) {
                l20 l20Var3 = new l20();
                l20 l20Var4 = new l20();
                try {
                    t9 t9Var = this.eVhOlqcC;
                    dl dlVar = this.k3x7lurq;
                    this.P7K7Inc8 = l20Var3;
                    this.b2ZJblxo = l20Var4;
                    this.Qr9iLBAD = 1;
                    m3 m3Var = new m3(1, w30.SgZGMMPL(this));
                    m3Var.I5GHvsYW();
                    oo.Companion.getClass();
                    t20 t20Var = new t20(oo.ON_START, l20Var3, t9Var, oo.ON_STOP, m3Var, new qt(), dlVar);
                    l20Var4.NCTxEWno = t20Var;
                    xoVar.qoPGr6Ce(t20Var);
                    Object Ey6iv0m0 = m3Var.Ey6iv0m0();
                    u9 u9Var = u9.NCTxEWno;
                    if (Ey6iv0m0 == u9Var) {
                        return u9Var;
                    }
                    l20Var = l20Var4;
                    l20Var2 = l20Var3;
                } catch (Throwable th2) {
                    l20Var = l20Var4;
                    th = th2;
                    l20Var2 = l20Var3;
                    vnVar = (vn) l20Var2.NCTxEWno;
                    if (vnVar != null) {
                    }
                    toVar = (to) l20Var.NCTxEWno;
                    if (toVar != null) {
                    }
                }
            }
            return xe0Var;
        }
        if (i != 1) {
            m1.Ey6iv0m0("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        l20Var = this.b2ZJblxo;
        l20Var2 = this.P7K7Inc8;
        try {
            fn.SgZGMMPL(obj);
        } catch (Throwable th3) {
            th = th3;
            vnVar = (vn) l20Var2.NCTxEWno;
            if (vnVar != null) {
                vnVar.b2ZJblxo(null);
            }
            toVar = (to) l20Var.NCTxEWno;
            if (toVar != null) {
                throw th;
            }
            xoVar.P7K7Inc8(toVar);
            throw th;
        }
        vn vnVar2 = (vn) l20Var2.NCTxEWno;
        if (vnVar2 != null) {
            vnVar2.b2ZJblxo(null);
        }
        to toVar2 = (to) l20Var.NCTxEWno;
        if (toVar2 != null) {
            xoVar.P7K7Inc8(toVar2);
        }
        return xe0Var;
    }

    @Override // defpackage.dl
    public final Object Qr9iLBAD(Object obj, Object obj2) {
        return ((u20) lDXGDhIF((g9) obj2, (t9) obj)).OxcuoDLp(xe0.qoPGr6Ce);
    }

    @Override // defpackage.h9
    public final g9 lDXGDhIF(g9 g9Var, Object obj) {
        return new u20(this.jb9XjC4I, this.eVhOlqcC, this.k3x7lurq, g9Var);
    }
}
