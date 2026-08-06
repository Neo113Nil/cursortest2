package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class fa1 extends defpackage.mi1 implements defpackage.c20 {
    public /* synthetic */ java.lang.Object GE9mJIPrb8gP;
    public final /* synthetic */ java.lang.Object Ns0WNyEWdPsk;
    public final /* synthetic */ float T1fB7bDYiVJQ;
    public int e6mdH7fiFuta;
    public final /* synthetic */ java.lang.Object fNwYGHIYeJcR;
    public final /* synthetic */ defpackage.jp1 gUjdnLbkVAaA;
    public final /* synthetic */ defpackage.ja1 h3m55N1URyyK;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa1(java.lang.Object obj, java.lang.Object obj2, defpackage.ja1 ja1Var, defpackage.jp1 jp1Var, float f, defpackage.kl klVar) {
        super(2, klVar);
        this.Ns0WNyEWdPsk = obj;
        this.fNwYGHIYeJcR = obj2;
        this.h3m55N1URyyK = ja1Var;
        this.gUjdnLbkVAaA = jp1Var;
        this.T1fB7bDYiVJQ = f;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.fa1) XntWc4eZSQ8j((defpackage.kl) obj2, (defpackage.sm) obj)).s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        defpackage.fa1 fa1Var = new defpackage.fa1(this.Ns0WNyEWdPsk, this.fNwYGHIYeJcR, this.h3m55N1URyyK, this.gUjdnLbkVAaA, this.T1fB7bDYiVJQ, klVar);
        fa1Var.GE9mJIPrb8gP = obj;
        return fa1Var;
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        int i = this.e6mdH7fiFuta;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        defpackage.kl klVar = null;
        defpackage.ja1 ja1Var = this.h3m55N1URyyK;
        if (i == 0) {
            defpackage.b80.KrtOTfE6jiS2(obj);
            defpackage.sm smVar = (defpackage.sm) this.GE9mJIPrb8gP;
            java.lang.Object obj2 = this.Ns0WNyEWdPsk;
            java.lang.Object obj3 = this.fNwYGHIYeJcR;
            if (defpackage.ma0.QiMR8OkAhezm(obj2, obj3)) {
                ja1Var.T1fB7bDYiVJQ = null;
                if (defpackage.ma0.QiMR8OkAhezm(ja1Var.fWTAfUmVKrZq.getValue(), obj2)) {
                    return gs1Var;
                }
            } else {
                defpackage.ja1.gUjdnLbkVAaA(ja1Var);
            }
            boolean QiMR8OkAhezm = defpackage.ma0.QiMR8OkAhezm(obj2, obj3);
            float f = this.T1fB7bDYiVJQ;
            if (!QiMR8OkAhezm) {
                defpackage.jp1 jp1Var = this.gUjdnLbkVAaA;
                jp1Var.XntWc4eZSQ8j(obj2);
                jp1Var.gUjdnLbkVAaA(0L);
                ja1Var.giKS3J6vZuNy.setValue(obj2);
                jp1Var.GE9mJIPrb8gP(f);
            }
            ja1Var.IJ0hOnjhPOri(f);
            if (ja1Var.gUjdnLbkVAaA.e6mdH7fiFuta()) {
                defpackage.ok0.zJPqDeoF0Os1(smVar, null, new defpackage.x6(ja1Var, klVar, 11), 3);
            } else {
                ja1Var.h3m55N1URyyK = Long.MIN_VALUE;
            }
            this.e6mdH7fiFuta = 1;
            java.lang.Object WmetiUbpKU9I = defpackage.ja1.WmetiUbpKU9I(ja1Var, this);
            defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
            if (WmetiUbpKU9I == tmVar) {
                return tmVar;
            }
        } else {
            if (i != 1) {
                defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            defpackage.b80.KrtOTfE6jiS2(obj);
        }
        ja1Var.maCixPsq4ml2();
        return gs1Var;
    }
}
