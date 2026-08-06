package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class jj1 extends defpackage.f51 implements defpackage.c20 {
    public final /* synthetic */ defpackage.s11 GE9mJIPrb8gP;
    public final /* synthetic */ defpackage.d20 Ns0WNyEWdPsk;
    public /* synthetic */ java.lang.Object P05cfTpS5W5L;
    public int QiMR8OkAhezm;
    public final /* synthetic */ defpackage.sm e6mdH7fiFuta;
    public final /* synthetic */ defpackage.vl fNwYGHIYeJcR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj1(defpackage.sm smVar, defpackage.s11 s11Var, defpackage.d20 d20Var, defpackage.vl vlVar, defpackage.kl klVar) {
        super(klVar);
        this.e6mdH7fiFuta = smVar;
        this.GE9mJIPrb8gP = s11Var;
        this.Ns0WNyEWdPsk = d20Var;
        this.fNwYGHIYeJcR = vlVar;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.jj1) XntWc4eZSQ8j((defpackage.kl) obj2, (defpackage.ri1) obj)).s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        defpackage.jj1 jj1Var = new defpackage.jj1(this.e6mdH7fiFuta, this.GE9mJIPrb8gP, this.Ns0WNyEWdPsk, this.fNwYGHIYeJcR, klVar);
        jj1Var.P05cfTpS5W5L = obj;
        return jj1Var;
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        int i = this.QiMR8OkAhezm;
        if (i == 0) {
            defpackage.b80.KrtOTfE6jiS2(obj);
            defpackage.ri1 ri1Var = (defpackage.ri1) this.P05cfTpS5W5L;
            this.QiMR8OkAhezm = 1;
            java.lang.Object oh71FJcDz6S2 = defpackage.oj1.oh71FJcDz6S2(ri1Var, this.e6mdH7fiFuta, this.GE9mJIPrb8gP, this.Ns0WNyEWdPsk, this.fNwYGHIYeJcR, this);
            defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
            if (oh71FJcDz6S2 == tmVar) {
                return tmVar;
            }
        } else {
            if (i != 1) {
                defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            defpackage.b80.KrtOTfE6jiS2(obj);
        }
        return defpackage.gs1.ZpBGe2uQfcn8;
    }
}
