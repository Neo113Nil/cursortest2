package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ud extends defpackage.mi1 implements defpackage.c20 {
    public int GE9mJIPrb8gP;
    public /* synthetic */ java.lang.Object Ns0WNyEWdPsk;
    public final /* synthetic */ int e6mdH7fiFuta = 0;
    public final /* synthetic */ defpackage.xd fNwYGHIYeJcR;
    public final /* synthetic */ defpackage.ux h3m55N1URyyK;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud(defpackage.xd xdVar, defpackage.ux uxVar, java.lang.Object obj, defpackage.kl klVar) {
        super(2, klVar);
        this.fNwYGHIYeJcR = xdVar;
        this.h3m55N1URyyK = uxVar;
        this.Ns0WNyEWdPsk = obj;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.e6mdH7fiFuta;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        defpackage.sm smVar = (defpackage.sm) obj;
        defpackage.kl klVar = (defpackage.kl) obj2;
        switch (i) {
        }
        return ((defpackage.ud) XntWc4eZSQ8j(klVar, smVar)).s0TASMVLSWD5(gs1Var);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        int i = this.e6mdH7fiFuta;
        defpackage.ux uxVar = this.h3m55N1URyyK;
        defpackage.xd xdVar = this.fNwYGHIYeJcR;
        switch (i) {
            case 0:
                return new defpackage.ud(xdVar, uxVar, this.Ns0WNyEWdPsk, klVar);
            default:
                defpackage.ud udVar = new defpackage.ud(xdVar, uxVar, klVar);
                udVar.Ns0WNyEWdPsk = obj;
                return udVar;
        }
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        int i = this.e6mdH7fiFuta;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
        switch (i) {
            case 0:
                int i2 = this.GE9mJIPrb8gP;
                if (i2 == 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    defpackage.d20 d20Var = this.fNwYGHIYeJcR.e6mdH7fiFuta;
                    java.lang.Object obj2 = this.Ns0WNyEWdPsk;
                    this.GE9mJIPrb8gP = 1;
                    if (d20Var.JhCgjQRTAOCT(this.h3m55N1URyyK, obj2, this) == tmVar) {
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
                    defpackage.sm smVar = (defpackage.sm) this.Ns0WNyEWdPsk;
                    defpackage.z31 z31Var = new defpackage.z31();
                    defpackage.xd xdVar = this.fNwYGHIYeJcR;
                    defpackage.tx txVar = xdVar.P05cfTpS5W5L;
                    defpackage.wd wdVar = new defpackage.wd(z31Var, smVar, xdVar, this.h3m55N1URyyK, 0);
                    this.GE9mJIPrb8gP = 1;
                    if (txVar.ZpBGe2uQfcn8(wdVar, this) == tmVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud(defpackage.xd xdVar, defpackage.ux uxVar, defpackage.kl klVar) {
        super(2, klVar);
        this.fNwYGHIYeJcR = xdVar;
        this.h3m55N1URyyK = uxVar;
    }
}
