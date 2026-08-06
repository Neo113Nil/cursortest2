package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class cq1 extends defpackage.mi1 implements defpackage.c20 {
    public int GE9mJIPrb8gP;
    public /* synthetic */ java.lang.Object Ns0WNyEWdPsk;
    public final /* synthetic */ int e6mdH7fiFuta;
    public final /* synthetic */ defpackage.hq1 fNwYGHIYeJcR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cq1(defpackage.hq1 hq1Var, defpackage.kl klVar, int i) {
        super(2, klVar);
        this.e6mdH7fiFuta = i;
        this.fNwYGHIYeJcR = hq1Var;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.e6mdH7fiFuta;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        switch (i) {
            case 0:
                return ((defpackage.cq1) XntWc4eZSQ8j((defpackage.kl) obj2, (defpackage.sw0) obj)).s0TASMVLSWD5(gs1Var);
            default:
                return ((defpackage.cq1) XntWc4eZSQ8j((defpackage.kl) obj2, (defpackage.xo1) obj)).s0TASMVLSWD5(gs1Var);
        }
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        switch (this.e6mdH7fiFuta) {
            case 0:
                defpackage.cq1 cq1Var = new defpackage.cq1(this.fNwYGHIYeJcR, klVar, 0);
                cq1Var.Ns0WNyEWdPsk = obj;
                return cq1Var;
            default:
                defpackage.cq1 cq1Var2 = new defpackage.cq1(this.fNwYGHIYeJcR, klVar, 1);
                cq1Var2.Ns0WNyEWdPsk = obj;
                return cq1Var2;
        }
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        defpackage.xo1 xo1Var;
        int i = this.e6mdH7fiFuta;
        defpackage.hq1 hq1Var = this.fNwYGHIYeJcR;
        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
        defpackage.kl klVar = null;
        switch (i) {
            case 0:
                int i2 = this.GE9mJIPrb8gP;
                if (i2 != 0) {
                    if (i2 == 1) {
                        defpackage.b80.KrtOTfE6jiS2(obj);
                        return obj;
                    }
                    defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.b80.KrtOTfE6jiS2(obj);
                defpackage.sw0 sw0Var = (defpackage.sw0) this.Ns0WNyEWdPsk;
                this.GE9mJIPrb8gP = 1;
                java.lang.Object ZpBGe2uQfcn8 = defpackage.hq1.ZpBGe2uQfcn8(hq1Var, sw0Var, this);
                return ZpBGe2uQfcn8 == tmVar ? tmVar : ZpBGe2uQfcn8;
            default:
                int i3 = this.GE9mJIPrb8gP;
                try {
                    if (i3 == 0) {
                        defpackage.b80.KrtOTfE6jiS2(obj);
                        xo1Var = (defpackage.xo1) this.Ns0WNyEWdPsk;
                        this.Ns0WNyEWdPsk = xo1Var;
                        this.GE9mJIPrb8gP = 1;
                        obj = xo1Var.fWTAfUmVKrZq(this);
                        if (obj == tmVar) {
                            return tmVar;
                        }
                    } else {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                defpackage.b80.KrtOTfE6jiS2(obj);
                                return (java.util.Set) obj;
                            }
                            defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xo1Var = (defpackage.xo1) this.Ns0WNyEWdPsk;
                        defpackage.b80.KrtOTfE6jiS2(obj);
                    }
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        defpackage.wo1 wo1Var = defpackage.wo1.oh71FJcDz6S2;
                        defpackage.cq1 cq1Var = new defpackage.cq1(hq1Var, klVar, 0);
                        this.Ns0WNyEWdPsk = null;
                        this.GE9mJIPrb8gP = 2;
                        obj = xo1Var.ZpBGe2uQfcn8(wo1Var, cq1Var, this);
                        if (obj == tmVar) {
                            return tmVar;
                        }
                        return (java.util.Set) obj;
                    }
                } catch (android.database.SQLException unused) {
                }
                return defpackage.ev.WDYagTQQm9ns;
        }
    }
}
