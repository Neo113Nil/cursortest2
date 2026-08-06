package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class wn1 implements defpackage.hm {
    public final defpackage.yn1 QiMR8OkAhezm;
    public final java.lang.Object WDYagTQQm9ns;
    public final java.lang.ThreadLocal oh71FJcDz6S2;

    public wn1(java.lang.Object obj, java.lang.ThreadLocal threadLocal) {
        this.WDYagTQQm9ns = obj;
        this.oh71FJcDz6S2 = threadLocal;
        this.QiMR8OkAhezm = new defpackage.yn1(threadLocal);
    }

    @Override // defpackage.jm
    public final java.lang.Object BHfvd2J71qpO(defpackage.c20 c20Var, java.lang.Object obj) {
        return c20Var.QiMR8OkAhezm(obj, this);
    }

    @Override // defpackage.jm
    public final defpackage.hm XntWc4eZSQ8j(defpackage.im imVar) {
        if (this.QiMR8OkAhezm.equals(imVar)) {
            return this;
        }
        return null;
    }

    public final void ZpBGe2uQfcn8(java.lang.Object obj) {
        this.oh71FJcDz6S2.set(obj);
    }

    @Override // defpackage.jm
    public final defpackage.jm fNwYGHIYeJcR(defpackage.jm jmVar) {
        return defpackage.h0.zJPqDeoF0Os1(this, jmVar);
    }

    public final java.lang.Object fWTAfUmVKrZq() {
        java.lang.ThreadLocal threadLocal = this.oh71FJcDz6S2;
        java.lang.Object obj = threadLocal.get();
        threadLocal.set(this.WDYagTQQm9ns);
        return obj;
    }

    @Override // defpackage.hm
    public final defpackage.im getKey() {
        return this.QiMR8OkAhezm;
    }

    public final java.lang.String toString() {
        return "ThreadLocal(value=" + this.WDYagTQQm9ns + ", threadLocal = " + this.oh71FJcDz6S2 + ')';
    }

    @Override // defpackage.jm
    public final defpackage.jm w7APNrr0aGRc(defpackage.im imVar) {
        return this.QiMR8OkAhezm.equals(imVar) ? defpackage.xu.WDYagTQQm9ns : this;
    }
}
