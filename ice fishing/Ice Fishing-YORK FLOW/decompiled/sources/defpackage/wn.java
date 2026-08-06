package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class wn extends defpackage.mi1 implements defpackage.c20 {
    public defpackage.b6 GE9mJIPrb8gP;
    public int Ns0WNyEWdPsk;
    public defpackage.w31 e6mdH7fiFuta;
    public final /* synthetic */ float fNwYGHIYeJcR;
    public final /* synthetic */ defpackage.u91 gUjdnLbkVAaA;
    public final /* synthetic */ defpackage.xn h3m55N1URyyK;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn(float f, defpackage.xn xnVar, defpackage.u91 u91Var, defpackage.kl klVar) {
        super(2, klVar);
        this.fNwYGHIYeJcR = f;
        this.h3m55N1URyyK = xnVar;
        this.gUjdnLbkVAaA = u91Var;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.wn) XntWc4eZSQ8j((defpackage.kl) obj2, (defpackage.sm) obj)).s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        return new defpackage.wn(this.fNwYGHIYeJcR, this.h3m55N1URyyK, this.gUjdnLbkVAaA, klVar);
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        float f;
        defpackage.b6 b6Var;
        defpackage.w31 w31Var;
        defpackage.b6 b6Var2;
        defpackage.pn pnVar;
        defpackage.w4 w4Var;
        int i = this.Ns0WNyEWdPsk;
        if (i == 0) {
            defpackage.b80.KrtOTfE6jiS2(obj);
            f = this.fNwYGHIYeJcR;
            if (java.lang.Math.abs(f) > 1.0f) {
                defpackage.w31 w31Var2 = new defpackage.w31();
                w31Var2.WDYagTQQm9ns = f;
                defpackage.w31 w31Var3 = new defpackage.w31();
                defpackage.b6 ZpBGe2uQfcn8 = defpackage.ma0.ZpBGe2uQfcn8(f, 28);
                try {
                    defpackage.xn xnVar = this.h3m55N1URyyK;
                    pnVar = xnVar.ZpBGe2uQfcn8;
                    w4Var = new defpackage.w4(w31Var3, this.gUjdnLbkVAaA, w31Var2, xnVar, 2);
                    this.e6mdH7fiFuta = w31Var2;
                    this.GE9mJIPrb8gP = ZpBGe2uQfcn8;
                    this.Ns0WNyEWdPsk = 1;
                    b6Var = ZpBGe2uQfcn8;
                } catch (java.util.concurrent.CancellationException unused) {
                    b6Var = ZpBGe2uQfcn8;
                }
                try {
                    java.lang.Object QiMR8OkAhezm = defpackage.t80.QiMR8OkAhezm(b6Var, new defpackage.on(pnVar, defpackage.nn.ZVVdXbWmyCSK, ZpBGe2uQfcn8.oh71FJcDz6S2.getValue(), ZpBGe2uQfcn8.QiMR8OkAhezm), Long.MIN_VALUE, w4Var, this);
                    java.lang.Object obj2 = defpackage.tm.WDYagTQQm9ns;
                    if (QiMR8OkAhezm != obj2) {
                        QiMR8OkAhezm = defpackage.gs1.ZpBGe2uQfcn8;
                    }
                    if (QiMR8OkAhezm == obj2) {
                        return obj2;
                    }
                    w31Var = w31Var2;
                } catch (java.util.concurrent.CancellationException unused2) {
                    w31Var = w31Var2;
                    b6Var2 = b6Var;
                    w31Var.WDYagTQQm9ns = ((java.lang.Number) b6Var2.WDYagTQQm9ns.giKS3J6vZuNy.P05cfTpS5W5L(b6Var2.QiMR8OkAhezm)).floatValue();
                    f = w31Var.WDYagTQQm9ns;
                    return new java.lang.Float(f);
                }
            }
            return new java.lang.Float(f);
        }
        if (i != 1) {
            defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b6Var2 = this.GE9mJIPrb8gP;
        w31Var = this.e6mdH7fiFuta;
        try {
            defpackage.b80.KrtOTfE6jiS2(obj);
        } catch (java.util.concurrent.CancellationException unused3) {
            w31Var.WDYagTQQm9ns = ((java.lang.Number) b6Var2.WDYagTQQm9ns.giKS3J6vZuNy.P05cfTpS5W5L(b6Var2.QiMR8OkAhezm)).floatValue();
            f = w31Var.WDYagTQQm9ns;
            return new java.lang.Float(f);
        }
        f = w31Var.WDYagTQQm9ns;
        return new java.lang.Float(f);
    }
}
