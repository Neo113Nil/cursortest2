package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class x4 extends defpackage.mi1 implements defpackage.y10 {
    public defpackage.v31 GE9mJIPrb8gP;
    public int Ns0WNyEWdPsk;
    public final /* synthetic */ long T1fB7bDYiVJQ;
    public final /* synthetic */ defpackage.y10 XntWc4eZSQ8j;
    public defpackage.b6 e6mdH7fiFuta;
    public final /* synthetic */ defpackage.z4 fNwYGHIYeJcR;
    public final /* synthetic */ defpackage.pj1 gUjdnLbkVAaA;
    public final /* synthetic */ java.lang.Object h3m55N1URyyK;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(defpackage.z4 z4Var, java.lang.Object obj, defpackage.pj1 pj1Var, long j, defpackage.y10 y10Var, defpackage.kl klVar) {
        super(1, klVar);
        this.fNwYGHIYeJcR = z4Var;
        this.h3m55N1URyyK = obj;
        this.gUjdnLbkVAaA = pj1Var;
        this.T1fB7bDYiVJQ = j;
        this.XntWc4eZSQ8j = y10Var;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        long j = this.T1fB7bDYiVJQ;
        defpackage.y10 y10Var = this.XntWc4eZSQ8j;
        return new defpackage.x4(this.fNwYGHIYeJcR, this.h3m55N1URyyK, this.gUjdnLbkVAaA, j, y10Var, (defpackage.kl) obj).s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        defpackage.z4 z4Var;
        defpackage.b6 b6Var;
        defpackage.v31 v31Var;
        long j;
        defpackage.w4 w4Var;
        defpackage.b6 b6Var2;
        defpackage.v31 v31Var2;
        java.util.concurrent.CancellationException cancellationException;
        defpackage.pj1 pj1Var = this.gUjdnLbkVAaA;
        int i = this.Ns0WNyEWdPsk;
        defpackage.z4 z4Var2 = this.fNwYGHIYeJcR;
        if (i == 0) {
            defpackage.b80.KrtOTfE6jiS2(obj);
            try {
                z4Var2.fWTAfUmVKrZq.QiMR8OkAhezm = (defpackage.g6) z4Var2.ZpBGe2uQfcn8.ZpBGe2uQfcn8.P05cfTpS5W5L(this.h3m55N1URyyK);
                z4Var2.WDYagTQQm9ns.setValue(pj1Var.fWTAfUmVKrZq);
                z4Var2.JhCgjQRTAOCT.setValue(java.lang.Boolean.TRUE);
                defpackage.b6 b6Var3 = z4Var2.fWTAfUmVKrZq;
                b6Var = new defpackage.b6(b6Var3.WDYagTQQm9ns, b6Var3.oh71FJcDz6S2.getValue(), defpackage.ok0.maCixPsq4ml2(b6Var3.QiMR8OkAhezm), b6Var3.P05cfTpS5W5L, Long.MIN_VALUE, b6Var3.GE9mJIPrb8gP);
                v31Var = new defpackage.v31();
                j = this.T1fB7bDYiVJQ;
                w4Var = new defpackage.w4(z4Var2, b6Var, this.XntWc4eZSQ8j, v31Var, 0);
                z4Var = z4Var2;
            } catch (java.util.concurrent.CancellationException e) {
                e = e;
                z4Var = z4Var2;
                cancellationException = e;
                defpackage.z4.giKS3J6vZuNy(z4Var);
                throw cancellationException;
            }
            try {
                this.e6mdH7fiFuta = b6Var;
                this.GE9mJIPrb8gP = v31Var;
                this.Ns0WNyEWdPsk = 1;
                java.lang.Object QiMR8OkAhezm = defpackage.t80.QiMR8OkAhezm(b6Var, pj1Var, j, w4Var, this);
                defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                if (QiMR8OkAhezm == tmVar) {
                    return tmVar;
                }
                b6Var2 = b6Var;
                v31Var2 = v31Var;
            } catch (java.util.concurrent.CancellationException e2) {
                e = e2;
                cancellationException = e;
                defpackage.z4.giKS3J6vZuNy(z4Var);
                throw cancellationException;
            }
        } else {
            if (i != 1) {
                defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v31Var2 = this.GE9mJIPrb8gP;
            b6Var2 = this.e6mdH7fiFuta;
            try {
                defpackage.b80.KrtOTfE6jiS2(obj);
                z4Var = z4Var2;
            } catch (java.util.concurrent.CancellationException e3) {
                cancellationException = e3;
                z4Var = z4Var2;
                defpackage.z4.giKS3J6vZuNy(z4Var);
                throw cancellationException;
            }
        }
        defpackage.x5 x5Var = v31Var2.WDYagTQQm9ns ? defpackage.x5.WDYagTQQm9ns : defpackage.x5.oh71FJcDz6S2;
        defpackage.z4.giKS3J6vZuNy(z4Var);
        return new defpackage.y5(b6Var2, x5Var);
    }
}
