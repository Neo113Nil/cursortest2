package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class nc0 implements defpackage.j41, defpackage.mm {
    public defpackage.yf1 P05cfTpS5W5L;
    public final defpackage.jl QiMR8OkAhezm;
    public final defpackage.jm WDYagTQQm9ns;
    public final defpackage.c20 oh71FJcDz6S2;

    public nc0(defpackage.jm jmVar, defpackage.c20 c20Var) {
        this.WDYagTQQm9ns = jmVar;
        this.oh71FJcDz6S2 = c20Var;
        this.QiMR8OkAhezm = defpackage.ok0.QiMR8OkAhezm(jmVar.fNwYGHIYeJcR(this));
    }

    @Override // defpackage.jm
    public final java.lang.Object BHfvd2J71qpO(defpackage.c20 c20Var, java.lang.Object obj) {
        return c20Var.QiMR8OkAhezm(obj, this);
    }

    @Override // defpackage.j41
    public final void WDYagTQQm9ns() {
        defpackage.yf1 yf1Var = this.P05cfTpS5W5L;
        if (yf1Var != null) {
            yf1Var.qjMheFZ0l9kA(new defpackage.c10(1));
        }
        this.P05cfTpS5W5L = null;
    }

    @Override // defpackage.mm
    public final void WmetiUbpKU9I(defpackage.jm jmVar, java.lang.Throwable th) {
        defpackage.jj jjVar = (defpackage.jj) jmVar.XntWc4eZSQ8j(defpackage.jj.oh71FJcDz6S2);
        if (jjVar != null) {
            defpackage.ok0.GoIRkIe1iwj6(th, new defpackage.S0YpfprlOYIn(6, jjVar, this));
        }
        defpackage.mm mmVar = (defpackage.mm) this.WDYagTQQm9ns.XntWc4eZSQ8j(defpackage.jVUAPb5NnIYW.blKFvluuDQOf);
        if (mmVar == null) {
            throw th;
        }
        mmVar.WmetiUbpKU9I(jmVar, th);
    }

    @Override // defpackage.jm
    public final defpackage.hm XntWc4eZSQ8j(defpackage.im imVar) {
        return defpackage.h0.dG7RjM6DqYVL(this, imVar);
    }

    @Override // defpackage.j41
    public final void ZpBGe2uQfcn8() {
        defpackage.yf1 yf1Var = this.P05cfTpS5W5L;
        if (yf1Var != null) {
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            yf1Var.JhCgjQRTAOCT(cancellationException);
        }
        this.P05cfTpS5W5L = defpackage.ok0.zJPqDeoF0Os1(this.QiMR8OkAhezm, null, this.oh71FJcDz6S2, 3);
    }

    @Override // defpackage.jm
    public final defpackage.jm fNwYGHIYeJcR(defpackage.jm jmVar) {
        return defpackage.h0.zJPqDeoF0Os1(this, jmVar);
    }

    @Override // defpackage.j41
    public final void fWTAfUmVKrZq() {
        defpackage.yf1 yf1Var = this.P05cfTpS5W5L;
        if (yf1Var != null) {
            yf1Var.qjMheFZ0l9kA(new defpackage.c10(1));
        }
        this.P05cfTpS5W5L = null;
    }

    @Override // defpackage.hm
    public final defpackage.im getKey() {
        return defpackage.jVUAPb5NnIYW.blKFvluuDQOf;
    }

    @Override // defpackage.jm
    public final defpackage.jm w7APNrr0aGRc(defpackage.im imVar) {
        return defpackage.h0.xahdJg25P1Bv(this, imVar);
    }
}
