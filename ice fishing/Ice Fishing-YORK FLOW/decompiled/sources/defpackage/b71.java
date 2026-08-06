package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class b71 extends defpackage.ll implements defpackage.ux {
    public final int GE9mJIPrb8gP;
    public defpackage.jm Ns0WNyEWdPsk;
    public final defpackage.ux P05cfTpS5W5L;
    public final defpackage.jm e6mdH7fiFuta;
    public defpackage.kl fNwYGHIYeJcR;

    public b71(defpackage.ux uxVar, defpackage.jm jmVar) {
        super(defpackage.tg.QiMR8OkAhezm, defpackage.xu.WDYagTQQm9ns);
        this.P05cfTpS5W5L = uxVar;
        this.e6mdH7fiFuta = jmVar;
        this.GE9mJIPrb8gP = ((java.lang.Number) jmVar.BHfvd2J71qpO(new defpackage.b7(20, (byte) 0), 0)).intValue();
    }

    @Override // defpackage.m9, defpackage.um
    public final defpackage.um WDYagTQQm9ns() {
        defpackage.kl klVar = this.fNwYGHIYeJcR;
        if (klVar instanceof defpackage.um) {
            return (defpackage.um) klVar;
        }
        return null;
    }

    @Override // defpackage.m9
    public final java.lang.StackTraceElement WmetiUbpKU9I() {
        return null;
    }

    public final java.lang.Object ZVVdXbWmyCSK(defpackage.kl klVar, java.lang.Object obj) {
        defpackage.jm oh71FJcDz6S2 = klVar.oh71FJcDz6S2();
        defpackage.b80.h3m55N1URyyK(oh71FJcDz6S2);
        defpackage.jm jmVar = this.Ns0WNyEWdPsk;
        if (jmVar != oh71FJcDz6S2) {
            if (jmVar instanceof defpackage.nr) {
                throw new java.lang.IllegalStateException(defpackage.ug1.GcLuU6pT9wO9("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((defpackage.nr) jmVar).oh71FJcDz6S2 + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((java.lang.Number) oh71FJcDz6S2.BHfvd2J71qpO(new defpackage.l2(14, this), 0)).intValue() != this.GE9mJIPrb8gP) {
                throw new java.lang.IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.e6mdH7fiFuta + ",\n\t\tbut emission happened in " + oh71FJcDz6S2 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.Ns0WNyEWdPsk = oh71FJcDz6S2;
        }
        this.fNwYGHIYeJcR = klVar;
        defpackage.d20 d20Var = defpackage.d71.ZpBGe2uQfcn8;
        defpackage.ux uxVar = this.P05cfTpS5W5L;
        uxVar.getClass();
        java.lang.Object JhCgjQRTAOCT = d20Var.JhCgjQRTAOCT(uxVar, obj, this);
        if (!defpackage.ma0.QiMR8OkAhezm(JhCgjQRTAOCT, defpackage.tm.WDYagTQQm9ns)) {
            this.fNwYGHIYeJcR = null;
        }
        return JhCgjQRTAOCT;
    }

    @Override // defpackage.ux
    public final java.lang.Object fNwYGHIYeJcR(java.lang.Object obj, defpackage.kl klVar) {
        try {
            java.lang.Object ZVVdXbWmyCSK = ZVVdXbWmyCSK(klVar, obj);
            return ZVVdXbWmyCSK == defpackage.tm.WDYagTQQm9ns ? ZVVdXbWmyCSK : defpackage.gs1.ZpBGe2uQfcn8;
        } catch (java.lang.Throwable th) {
            this.Ns0WNyEWdPsk = new defpackage.nr(klVar.oh71FJcDz6S2(), th);
            throw th;
        }
    }

    @Override // defpackage.ll, defpackage.kl
    public final defpackage.jm oh71FJcDz6S2() {
        defpackage.jm jmVar = this.Ns0WNyEWdPsk;
        return jmVar == null ? defpackage.xu.WDYagTQQm9ns : jmVar;
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        java.lang.Throwable ZpBGe2uQfcn8 = defpackage.h51.ZpBGe2uQfcn8(obj);
        if (ZpBGe2uQfcn8 != null) {
            this.Ns0WNyEWdPsk = new defpackage.nr(oh71FJcDz6S2(), ZpBGe2uQfcn8);
        }
        defpackage.kl klVar = this.fNwYGHIYeJcR;
        if (klVar != null) {
            klVar.e6mdH7fiFuta(obj);
        }
        return defpackage.tm.WDYagTQQm9ns;
    }
}
