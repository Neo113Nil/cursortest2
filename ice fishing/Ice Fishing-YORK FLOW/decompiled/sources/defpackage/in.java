package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class in extends defpackage.mi1 implements defpackage.c20 {
    public int GE9mJIPrb8gP;
    public /* synthetic */ java.lang.Object Ns0WNyEWdPsk;
    public final /* synthetic */ defpackage.y10 T1fB7bDYiVJQ;
    public defpackage.wo1 e6mdH7fiFuta;
    public final /* synthetic */ boolean fNwYGHIYeJcR;
    public final /* synthetic */ defpackage.h61 gUjdnLbkVAaA;
    public final /* synthetic */ boolean h3m55N1URyyK;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in(defpackage.kl klVar, defpackage.y10 y10Var, defpackage.h61 h61Var, boolean z, boolean z2) {
        super(2, klVar);
        this.fNwYGHIYeJcR = z;
        this.h3m55N1URyyK = z2;
        this.gUjdnLbkVAaA = h61Var;
        this.T1fB7bDYiVJQ = y10Var;
    }

    @Override // defpackage.c20
    public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.in) XntWc4eZSQ8j((defpackage.kl) obj2, (defpackage.xo1) obj)).s0TASMVLSWD5(defpackage.gs1.ZpBGe2uQfcn8);
    }

    @Override // defpackage.m9
    public final defpackage.kl XntWc4eZSQ8j(defpackage.kl klVar, java.lang.Object obj) {
        defpackage.in inVar = new defpackage.in(klVar, this.T1fB7bDYiVJQ, this.gUjdnLbkVAaA, this.fNwYGHIYeJcR, this.h3m55N1URyyK);
        inVar.Ns0WNyEWdPsk = obj;
        return inVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
    
        if (r13 == r9) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
    
        if (r13 == r9) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00b7  */
    @Override // defpackage.m9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object s0TASMVLSWD5(java.lang.Object obj) {
        defpackage.wo1 wo1Var;
        defpackage.xo1 xo1Var;
        defpackage.wo1 wo1Var2;
        defpackage.xo1 xo1Var2;
        java.lang.Object obj2;
        int i = this.GE9mJIPrb8gP;
        defpackage.y10 y10Var = this.T1fB7bDYiVJQ;
        defpackage.h61 h61Var = this.gUjdnLbkVAaA;
        boolean z = this.h3m55N1URyyK;
        defpackage.kl klVar = null;
        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
        if (i == 0) {
            defpackage.b80.KrtOTfE6jiS2(obj);
            defpackage.xo1 xo1Var3 = (defpackage.xo1) this.Ns0WNyEWdPsk;
            if (!this.fNwYGHIYeJcR) {
                xo1Var3.getClass();
                return y10Var.P05cfTpS5W5L(((defpackage.y21) xo1Var3).giKS3J6vZuNy());
            }
            wo1Var = z ? defpackage.wo1.WDYagTQQm9ns : defpackage.wo1.oh71FJcDz6S2;
            if (!z) {
                this.Ns0WNyEWdPsk = xo1Var3;
                this.e6mdH7fiFuta = wo1Var;
                this.GE9mJIPrb8gP = 1;
                java.lang.Boolean fWTAfUmVKrZq = xo1Var3.fWTAfUmVKrZq(this);
                if (fWTAfUmVKrZq != tmVar) {
                    xo1Var2 = xo1Var3;
                    obj = fWTAfUmVKrZq;
                }
                return tmVar;
            }
            defpackage.wo1 wo1Var3 = wo1Var;
            xo1Var = xo1Var3;
            wo1Var2 = wo1Var3;
            defpackage.dn dnVar = new defpackage.dn((defpackage.kl) null, y10Var);
            this.Ns0WNyEWdPsk = xo1Var;
            this.e6mdH7fiFuta = null;
            this.GE9mJIPrb8gP = 3;
            obj = xo1Var.ZpBGe2uQfcn8(wo1Var2, dnVar, this);
        } else if (i == 1) {
            wo1Var = this.e6mdH7fiFuta;
            xo1Var2 = (defpackage.xo1) this.Ns0WNyEWdPsk;
            defpackage.b80.KrtOTfE6jiS2(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    xo1Var = (defpackage.xo1) this.Ns0WNyEWdPsk;
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    if (z) {
                        return obj;
                    }
                    this.Ns0WNyEWdPsk = obj;
                    this.GE9mJIPrb8gP = 4;
                    java.lang.Boolean fWTAfUmVKrZq2 = xo1Var.fWTAfUmVKrZq(this);
                    if (fWTAfUmVKrZq2 != tmVar) {
                        java.lang.Object obj3 = obj;
                        obj = fWTAfUmVKrZq2;
                        obj2 = obj3;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                        }
                        return obj2;
                    }
                    return tmVar;
                }
                if (i != 4) {
                    defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.Ns0WNyEWdPsk;
                defpackage.b80.KrtOTfE6jiS2(obj);
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.wa0 JhCgjQRTAOCT = h61Var.JhCgjQRTAOCT();
                    defpackage.hq1 hq1Var = JhCgjQRTAOCT.giKS3J6vZuNy;
                    defpackage.n8 n8Var = JhCgjQRTAOCT.WDYagTQQm9ns;
                    defpackage.n8 n8Var2 = JhCgjQRTAOCT.oh71FJcDz6S2;
                    hq1Var.getClass();
                    n8Var.getClass();
                    n8Var2.getClass();
                    if (hq1Var.GE9mJIPrb8gP.compareAndSet(false, true)) {
                        defpackage.jl jlVar = hq1Var.ZpBGe2uQfcn8.ZpBGe2uQfcn8;
                        if (jlVar != null) {
                            defpackage.ok0.zJPqDeoF0Os1(jlVar, new defpackage.om(), new defpackage.JhCgjQRTAOCT(hq1Var, n8Var2, klVar, 28), 2);
                            return obj2;
                        }
                        defpackage.ma0.hH0RRJrNssvh("coroutineScope");
                        throw null;
                    }
                }
                return obj2;
            }
            wo1Var = this.e6mdH7fiFuta;
            xo1Var2 = (defpackage.xo1) this.Ns0WNyEWdPsk;
            defpackage.b80.KrtOTfE6jiS2(obj);
            wo1Var2 = wo1Var;
            xo1Var = xo1Var2;
            defpackage.dn dnVar2 = new defpackage.dn((defpackage.kl) null, y10Var);
            this.Ns0WNyEWdPsk = xo1Var;
            this.e6mdH7fiFuta = null;
            this.GE9mJIPrb8gP = 3;
            obj = xo1Var.ZpBGe2uQfcn8(wo1Var2, dnVar2, this);
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
            defpackage.wa0 JhCgjQRTAOCT2 = h61Var.JhCgjQRTAOCT();
            this.Ns0WNyEWdPsk = xo1Var2;
            this.e6mdH7fiFuta = wo1Var;
            this.GE9mJIPrb8gP = 2;
            java.lang.Object WDYagTQQm9ns = JhCgjQRTAOCT2.giKS3J6vZuNy.WDYagTQQm9ns(this);
            if (WDYagTQQm9ns != tmVar) {
                WDYagTQQm9ns = defpackage.gs1.ZpBGe2uQfcn8;
            }
        }
        wo1Var2 = wo1Var;
        xo1Var = xo1Var2;
        defpackage.dn dnVar22 = new defpackage.dn((defpackage.kl) null, y10Var);
        this.Ns0WNyEWdPsk = xo1Var;
        this.e6mdH7fiFuta = null;
        this.GE9mJIPrb8gP = 3;
        obj = xo1Var.ZpBGe2uQfcn8(wo1Var2, dnVar22, this);
    }
}
