package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ds1 extends defpackage.r81 {
    public final java.lang.ThreadLocal Ns0WNyEWdPsk;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ds1(defpackage.kl klVar, defpackage.jm jmVar) {
        super(klVar, jmVar.XntWc4eZSQ8j(r0) == null ? jmVar.fNwYGHIYeJcR(r0) : jmVar);
        defpackage.hd hdVar = defpackage.hd.P05cfTpS5W5L;
        this.Ns0WNyEWdPsk = new java.lang.ThreadLocal();
        if (klVar.oh71FJcDz6S2().XntWc4eZSQ8j(defpackage.jVUAPb5NnIYW.OcTWLQzke1i2) instanceof defpackage.lm) {
            return;
        }
        java.lang.Object FhgBoOud6zyW = defpackage.nq1.FhgBoOud6zyW(jmVar, null);
        defpackage.nq1.EPEWHACkMcF1(jmVar, FhgBoOud6zyW);
        Hx18F4M3RgD4(jmVar, FhgBoOud6zyW);
    }

    public final void Hx18F4M3RgD4(defpackage.jm jmVar, java.lang.Object obj) {
        this.threadLocalIsSet = true;
        this.Ns0WNyEWdPsk.set(new defpackage.bw0(jmVar, obj));
    }

    @Override // defpackage.r81, defpackage.jb0
    public final void oCu53ZX2v4Ju(java.lang.Object obj) {
        if (this.threadLocalIsSet) {
            defpackage.bw0 bw0Var = (defpackage.bw0) this.Ns0WNyEWdPsk.get();
            if (bw0Var != null) {
                defpackage.nq1.EPEWHACkMcF1((defpackage.jm) bw0Var.WDYagTQQm9ns, bw0Var.oh71FJcDz6S2);
            }
            this.Ns0WNyEWdPsk.remove();
        }
        java.lang.Object GoIRkIe1iwj6 = defpackage.h0.GoIRkIe1iwj6(obj);
        defpackage.kl klVar = this.GE9mJIPrb8gP;
        defpackage.jm oh71FJcDz6S2 = klVar.oh71FJcDz6S2();
        java.lang.Object FhgBoOud6zyW = defpackage.nq1.FhgBoOud6zyW(oh71FJcDz6S2, null);
        defpackage.ds1 KrtOTfE6jiS2 = FhgBoOud6zyW != defpackage.nq1.w7APNrr0aGRc ? defpackage.nn.KrtOTfE6jiS2(klVar, oh71FJcDz6S2, FhgBoOud6zyW) : null;
        try {
            this.GE9mJIPrb8gP.e6mdH7fiFuta(GoIRkIe1iwj6);
            if (KrtOTfE6jiS2 == null || KrtOTfE6jiS2.pf0OXpZQoaz3()) {
                defpackage.nq1.EPEWHACkMcF1(oh71FJcDz6S2, FhgBoOud6zyW);
            }
        } catch (java.lang.Throwable th) {
            if (KrtOTfE6jiS2 == null || KrtOTfE6jiS2.pf0OXpZQoaz3()) {
                defpackage.nq1.EPEWHACkMcF1(oh71FJcDz6S2, FhgBoOud6zyW);
            }
            throw th;
        }
    }

    public final boolean pf0OXpZQoaz3() {
        boolean z = this.threadLocalIsSet && this.Ns0WNyEWdPsk.get() == null;
        this.Ns0WNyEWdPsk.remove();
        return !z;
    }
}
