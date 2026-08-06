package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class un0 extends defpackage.f51 implements defpackage.c20 {
    public int GE9mJIPrb8gP;
    public int Ns0WNyEWdPsk;
    public defpackage.vn0 P05cfTpS5W5L;
    public defpackage.l30 QiMR8OkAhezm;
    public long[] e6mdH7fiFuta;
    public /* synthetic */ java.lang.Object fNwYGHIYeJcR;
    public final /* synthetic */ defpackage.l30 gUjdnLbkVAaA;
    public final /* synthetic */ defpackage.vn0 h3m55N1URyyK;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un0(defpackage.vn0 vn0Var, defpackage.l30 l30Var, defpackage.kl klVar) {
        super(klVar);
        this.h3m55N1URyyK = vn0Var;
        this.gUjdnLbkVAaA = l30Var;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.un0) XntWc4eZSQ8j((defpackage.kl) obj2, (defpackage.ec1) obj)).s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        defpackage.un0 un0Var = new defpackage.un0(this.h3m55N1URyyK, this.gUjdnLbkVAaA, klVar);
        un0Var.fNwYGHIYeJcR = obj;
        return un0Var;
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        defpackage.ec1 ec1Var;
        defpackage.vn0 vn0Var;
        long[] jArr;
        int i;
        defpackage.l30 l30Var;
        int i2 = this.Ns0WNyEWdPsk;
        if (i2 == 0) {
            defpackage.b80.KrtOTfE6jiS2(obj);
            ec1Var = (defpackage.ec1) this.fNwYGHIYeJcR;
            vn0Var = this.h3m55N1URyyK;
            defpackage.tn0 tn0Var = vn0Var.oh71FJcDz6S2;
            jArr = tn0Var.fWTAfUmVKrZq;
            i = tn0Var.WDYagTQQm9ns;
            l30Var = this.gUjdnLbkVAaA;
        } else {
            if (i2 != 1) {
                defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.GE9mJIPrb8gP;
            jArr = this.e6mdH7fiFuta;
            vn0Var = this.P05cfTpS5W5L;
            l30Var = this.QiMR8OkAhezm;
            ec1Var = (defpackage.ec1) this.fNwYGHIYeJcR;
            defpackage.b80.KrtOTfE6jiS2(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return defpackage.gs1.ZpBGe2uQfcn8;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        l30Var.oh71FJcDz6S2 = i;
        java.lang.Object obj2 = vn0Var.oh71FJcDz6S2.giKS3J6vZuNy[i];
        this.fNwYGHIYeJcR = ec1Var;
        this.QiMR8OkAhezm = l30Var;
        this.P05cfTpS5W5L = vn0Var;
        this.e6mdH7fiFuta = jArr;
        this.GE9mJIPrb8gP = i3;
        this.Ns0WNyEWdPsk = 1;
        ec1Var.giKS3J6vZuNy(obj2, this);
        return defpackage.tm.WDYagTQQm9ns;
    }
}
