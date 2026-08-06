package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class qq extends defpackage.qj1 {
    public int QiMR8OkAhezm;

    public qq(int i) {
        super(0L, false);
        this.QiMR8OkAhezm = i;
    }

    public java.lang.Throwable JhCgjQRTAOCT(java.lang.Object obj) {
        defpackage.ug ugVar = obj instanceof defpackage.ug ? (defpackage.ug) obj : null;
        if (ugVar != null) {
            return ugVar.ZpBGe2uQfcn8;
        }
        return null;
    }

    public abstract java.lang.Object Ns0WNyEWdPsk();

    public final void P05cfTpS5W5L(java.lang.Throwable th) {
        defpackage.ma0.ZVVdXbWmyCSK(fWTAfUmVKrZq().oh71FJcDz6S2(), new defpackage.wm("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract defpackage.kl fWTAfUmVKrZq();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        r4 = (defpackage.cb0) r5.XntWc4eZSQ8j(defpackage.jVUAPb5NnIYW.Jkfc0NcwyPL8);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            defpackage.kl fWTAfUmVKrZq = fWTAfUmVKrZq();
            fWTAfUmVKrZq.getClass();
            defpackage.oq oqVar = (defpackage.oq) fWTAfUmVKrZq;
            defpackage.ll llVar = oqVar.e6mdH7fiFuta;
            java.lang.Object obj = oqVar.Ns0WNyEWdPsk;
            defpackage.jm oh71FJcDz6S2 = llVar.oh71FJcDz6S2();
            java.lang.Object FhgBoOud6zyW = defpackage.nq1.FhgBoOud6zyW(oh71FJcDz6S2, obj);
            defpackage.cb0 cb0Var = null;
            defpackage.ds1 KrtOTfE6jiS2 = FhgBoOud6zyW != defpackage.nq1.w7APNrr0aGRc ? defpackage.nn.KrtOTfE6jiS2(llVar, oh71FJcDz6S2, FhgBoOud6zyW) : null;
            try {
                defpackage.jm oh71FJcDz6S22 = llVar.oh71FJcDz6S2();
                java.lang.Object Ns0WNyEWdPsk = Ns0WNyEWdPsk();
                java.lang.Throwable JhCgjQRTAOCT = JhCgjQRTAOCT(Ns0WNyEWdPsk);
                if (JhCgjQRTAOCT == null) {
                    int i = this.QiMR8OkAhezm;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                }
                if (cb0Var != null && !cb0Var.giKS3J6vZuNy()) {
                    java.util.concurrent.CancellationException s0TASMVLSWD5 = cb0Var.s0TASMVLSWD5();
                    giKS3J6vZuNy(s0TASMVLSWD5);
                    llVar.e6mdH7fiFuta(defpackage.b80.fNwYGHIYeJcR(s0TASMVLSWD5));
                } else if (JhCgjQRTAOCT != null) {
                    llVar.e6mdH7fiFuta(new defpackage.g51(JhCgjQRTAOCT));
                } else {
                    llVar.e6mdH7fiFuta(QiMR8OkAhezm(Ns0WNyEWdPsk));
                }
                if (KrtOTfE6jiS2 != null && !KrtOTfE6jiS2.pf0OXpZQoaz3()) {
                    return;
                }
                defpackage.nq1.EPEWHACkMcF1(oh71FJcDz6S2, FhgBoOud6zyW);
            } catch (java.lang.Throwable th) {
                if (KrtOTfE6jiS2 == null || KrtOTfE6jiS2.pf0OXpZQoaz3()) {
                    defpackage.nq1.EPEWHACkMcF1(oh71FJcDz6S2, FhgBoOud6zyW);
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            P05cfTpS5W5L(th2);
        }
    }

    public java.lang.Object QiMR8OkAhezm(java.lang.Object obj) {
        return obj;
    }

    public void giKS3J6vZuNy(java.util.concurrent.CancellationException cancellationException) {
    }
}
