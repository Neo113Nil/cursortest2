package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class bf1 extends defpackage.mi1 implements defpackage.c20 {
    public int GE9mJIPrb8gP;
    public /* synthetic */ java.lang.Object Ns0WNyEWdPsk;
    public final /* synthetic */ int e6mdH7fiFuta;
    public final /* synthetic */ defpackage.c20 fNwYGHIYeJcR;
    public final /* synthetic */ defpackage.fo0 h3m55N1URyyK;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bf1(defpackage.c20 c20Var, defpackage.fo0 fo0Var, defpackage.kl klVar, int i) {
        super(2, klVar);
        this.e6mdH7fiFuta = i;
        this.fNwYGHIYeJcR = c20Var;
        this.h3m55N1URyyK = fo0Var;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.e6mdH7fiFuta;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        defpackage.sm smVar = (defpackage.sm) obj;
        defpackage.kl klVar = (defpackage.kl) obj2;
        switch (i) {
        }
        return ((defpackage.bf1) XntWc4eZSQ8j(klVar, smVar)).s0TASMVLSWD5(gs1Var);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        switch (this.e6mdH7fiFuta) {
            case 0:
                defpackage.bf1 bf1Var = new defpackage.bf1(this.fNwYGHIYeJcR, this.h3m55N1URyyK, klVar, 0);
                bf1Var.Ns0WNyEWdPsk = obj;
                return bf1Var;
            default:
                defpackage.bf1 bf1Var2 = new defpackage.bf1(this.fNwYGHIYeJcR, this.h3m55N1URyyK, klVar, 1);
                bf1Var2.Ns0WNyEWdPsk = obj;
                return bf1Var2;
        }
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        int i = this.e6mdH7fiFuta;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        defpackage.fo0 fo0Var = this.h3m55N1URyyK;
        defpackage.c20 c20Var = this.fNwYGHIYeJcR;
        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
        switch (i) {
            case 0:
                int i2 = this.GE9mJIPrb8gP;
                if (i2 == 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    defpackage.j21 j21Var = new defpackage.j21(fo0Var, ((defpackage.sm) this.Ns0WNyEWdPsk).QiMR8OkAhezm());
                    this.GE9mJIPrb8gP = 1;
                    if (c20Var.QiMR8OkAhezm(j21Var, this) == tmVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    break;
                }
                break;
            default:
                int i3 = this.GE9mJIPrb8gP;
                if (i3 == 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    defpackage.j21 j21Var2 = new defpackage.j21(fo0Var, ((defpackage.sm) this.Ns0WNyEWdPsk).QiMR8OkAhezm());
                    this.GE9mJIPrb8gP = 1;
                    if (c20Var.QiMR8OkAhezm(j21Var2, this) == tmVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    break;
                }
                break;
        }
        return tmVar;
    }
}
