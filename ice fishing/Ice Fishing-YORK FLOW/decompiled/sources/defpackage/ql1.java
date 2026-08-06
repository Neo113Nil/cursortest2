package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ql1 extends defpackage.mi1 implements defpackage.c20 {
    public int GE9mJIPrb8gP;
    public final /* synthetic */ defpackage.fo0 Ns0WNyEWdPsk;
    public defpackage.fo0 e6mdH7fiFuta;
    public final /* synthetic */ boolean fNwYGHIYeJcR;
    public final /* synthetic */ defpackage.in0 h3m55N1URyyK;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql1(defpackage.fo0 fo0Var, boolean z, defpackage.in0 in0Var, defpackage.kl klVar) {
        super(2, klVar);
        this.Ns0WNyEWdPsk = fo0Var;
        this.fNwYGHIYeJcR = z;
        this.h3m55N1URyyK = in0Var;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.ql1) XntWc4eZSQ8j((defpackage.kl) obj2, (defpackage.sm) obj)).s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        return new defpackage.ql1(this.Ns0WNyEWdPsk, this.fNwYGHIYeJcR, this.h3m55N1URyyK, klVar);
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        defpackage.fo0 fo0Var;
        defpackage.fo0 fo0Var2;
        int i = this.GE9mJIPrb8gP;
        if (i == 0) {
            defpackage.b80.KrtOTfE6jiS2(obj);
            fo0Var = this.Ns0WNyEWdPsk;
            defpackage.u11 u11Var = (defpackage.u11) fo0Var.getValue();
            if (u11Var != null) {
                defpackage.w90 v11Var = this.fNwYGHIYeJcR ? new defpackage.v11(u11Var) : new defpackage.t11(u11Var);
                defpackage.in0 in0Var = this.h3m55N1URyyK;
                if (in0Var != null) {
                    this.e6mdH7fiFuta = fo0Var;
                    this.GE9mJIPrb8gP = 1;
                    java.lang.Object ZpBGe2uQfcn8 = in0Var.ZpBGe2uQfcn8(v11Var, this);
                    defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                    if (ZpBGe2uQfcn8 == tmVar) {
                        return tmVar;
                    }
                    fo0Var2 = fo0Var;
                }
                fo0Var.setValue(null);
            }
            return defpackage.gs1.ZpBGe2uQfcn8;
        }
        if (i != 1) {
            defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fo0Var2 = this.e6mdH7fiFuta;
        defpackage.b80.KrtOTfE6jiS2(obj);
        fo0Var = fo0Var2;
        fo0Var.setValue(null);
        return defpackage.gs1.ZpBGe2uQfcn8;
    }
}
