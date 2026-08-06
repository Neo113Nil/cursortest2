package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class P05cfTpS5W5L extends defpackage.mi1 implements defpackage.c20 {
    public int GE9mJIPrb8gP;
    public final /* synthetic */ defpackage.in0 Ns0WNyEWdPsk;
    public final /* synthetic */ int e6mdH7fiFuta;
    public final /* synthetic */ defpackage.u11 fNwYGHIYeJcR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P05cfTpS5W5L(defpackage.u11 u11Var, defpackage.in0 in0Var, defpackage.kl klVar) {
        super(2, klVar);
        this.e6mdH7fiFuta = 0;
        this.fNwYGHIYeJcR = u11Var;
        this.Ns0WNyEWdPsk = in0Var;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.e6mdH7fiFuta;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        defpackage.sm smVar = (defpackage.sm) obj;
        defpackage.kl klVar = (defpackage.kl) obj2;
        switch (i) {
        }
        return ((defpackage.P05cfTpS5W5L) XntWc4eZSQ8j(klVar, smVar)).s0TASMVLSWD5(gs1Var);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        int i = this.e6mdH7fiFuta;
        defpackage.u11 u11Var = this.fNwYGHIYeJcR;
        defpackage.in0 in0Var = this.Ns0WNyEWdPsk;
        switch (i) {
            case 0:
                return new defpackage.P05cfTpS5W5L(u11Var, in0Var, klVar);
            case 1:
                return new defpackage.P05cfTpS5W5L(in0Var, u11Var, klVar, 1);
            default:
                return new defpackage.P05cfTpS5W5L(in0Var, u11Var, klVar, 2);
        }
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        int i = this.e6mdH7fiFuta;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        defpackage.u11 u11Var = this.fNwYGHIYeJcR;
        defpackage.in0 in0Var = this.Ns0WNyEWdPsk;
        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
        switch (i) {
            case 0:
                int i2 = this.GE9mJIPrb8gP;
                if (i2 == 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    defpackage.v11 v11Var = new defpackage.v11(u11Var);
                    this.GE9mJIPrb8gP = 1;
                    if (in0Var.ZpBGe2uQfcn8(v11Var, this) == tmVar) {
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
            case 1:
                int i3 = this.GE9mJIPrb8gP;
                if (i3 == 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    this.GE9mJIPrb8gP = 1;
                    if (in0Var.ZpBGe2uQfcn8(u11Var, this) == tmVar) {
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
            default:
                int i4 = this.GE9mJIPrb8gP;
                if (i4 == 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    this.GE9mJIPrb8gP = 1;
                    if (in0Var.ZpBGe2uQfcn8(u11Var, this) == tmVar) {
                        break;
                    }
                } else if (i4 != 1) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P05cfTpS5W5L(defpackage.in0 in0Var, defpackage.u11 u11Var, defpackage.kl klVar, int i) {
        super(2, klVar);
        this.e6mdH7fiFuta = i;
        this.Ns0WNyEWdPsk = in0Var;
        this.fNwYGHIYeJcR = u11Var;
    }
}
