package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class dq extends defpackage.mi1 implements defpackage.c20 {
    public /* synthetic */ java.lang.Object GE9mJIPrb8gP;
    public final /* synthetic */ java.lang.Object Ns0WNyEWdPsk;
    public final /* synthetic */ int e6mdH7fiFuta = 0;
    public final /* synthetic */ java.lang.Object fNwYGHIYeJcR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq(defpackage.fo0 fo0Var, defpackage.hq hqVar, defpackage.ff1 ff1Var, defpackage.kl klVar) {
        super(2, klVar);
        this.GE9mJIPrb8gP = fo0Var;
        this.Ns0WNyEWdPsk = hqVar;
        this.fNwYGHIYeJcR = ff1Var;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.e6mdH7fiFuta;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        defpackage.sm smVar = (defpackage.sm) obj;
        defpackage.kl klVar = (defpackage.kl) obj2;
        switch (i) {
            case 0:
                ((defpackage.dq) XntWc4eZSQ8j(klVar, smVar)).s0TASMVLSWD5(gs1Var);
                return gs1Var;
            default:
                return ((defpackage.dq) XntWc4eZSQ8j(klVar, smVar)).s0TASMVLSWD5(gs1Var);
        }
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        int i = this.e6mdH7fiFuta;
        java.lang.Object obj2 = this.fNwYGHIYeJcR;
        java.lang.Object obj3 = this.Ns0WNyEWdPsk;
        switch (i) {
            case 0:
                return new defpackage.dq((defpackage.fo0) this.GE9mJIPrb8gP, (defpackage.hq) obj3, (defpackage.ff1) obj2, klVar);
            default:
                defpackage.dq dqVar = new defpackage.dq((defpackage.g01) obj3, (defpackage.uk1) obj2, klVar);
                dqVar.GE9mJIPrb8gP = obj;
                return dqVar;
        }
    }

    @Override // defpackage.m9
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        int i = this.e6mdH7fiFuta;
        java.lang.Object obj2 = this.fNwYGHIYeJcR;
        java.lang.Object obj3 = this.Ns0WNyEWdPsk;
        switch (i) {
            case 0:
                defpackage.b80.KrtOTfE6jiS2(obj);
                defpackage.hq hqVar = (defpackage.hq) obj3;
                defpackage.ff1 ff1Var = (defpackage.ff1) obj2;
                for (defpackage.xo0 xo0Var : (java.util.Set) ((defpackage.fo0) this.GE9mJIPrb8gP).getValue()) {
                    if (!((java.util.List) hqVar.giKS3J6vZuNy().WDYagTQQm9ns.WDYagTQQm9ns.getValue()).contains(xo0Var) && !ff1Var.contains(xo0Var)) {
                        hqVar.giKS3J6vZuNy().fWTAfUmVKrZq(xo0Var);
                    }
                }
                return defpackage.gs1.ZpBGe2uQfcn8;
            default:
                defpackage.b80.KrtOTfE6jiS2(obj);
                defpackage.sm smVar = (defpackage.sm) this.GE9mJIPrb8gP;
                defpackage.g01 g01Var = (defpackage.g01) obj3;
                defpackage.uk1 uk1Var = (defpackage.uk1) obj2;
                defpackage.kl klVar = null;
                defpackage.ok0.zJPqDeoF0Os1(smVar, null, new defpackage.yl(g01Var, uk1Var, klVar, 1), 1);
                return defpackage.ok0.zJPqDeoF0Os1(smVar, null, new defpackage.yl(g01Var, uk1Var, klVar, 2), 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq(defpackage.g01 g01Var, defpackage.uk1 uk1Var, defpackage.kl klVar) {
        super(2, klVar);
        this.Ns0WNyEWdPsk = g01Var;
        this.fNwYGHIYeJcR = uk1Var;
    }
}
