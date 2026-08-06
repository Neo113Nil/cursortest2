package defpackage;

/* loaded from: classes.dex */
public final class kg1 implements defpackage.jj {
    public final defpackage.mg1 AARZUJiTa;
    public final java.lang.Object adDC3e2L;
    public final java.lang.ThreadLocal xiZrDbcSW0;

    public kg1(java.lang.Object obj, java.lang.ThreadLocal threadLocal) {
        this.adDC3e2L = obj;
        this.xiZrDbcSW0 = threadLocal;
        this.AARZUJiTa = new defpackage.mg1(threadLocal);
    }

    @Override // defpackage.lj
    public final java.lang.Object EgCjBq0SZwJ(defpackage.k00 k00Var, java.lang.Object obj) {
        return k00Var.adDC3e2L(obj, this);
    }

    public final void IHQe1A4L2xu(java.lang.Object obj) {
        this.xiZrDbcSW0.set(obj);
    }

    @Override // defpackage.lj
    public final defpackage.lj JlrlGoKF(defpackage.lj ljVar) {
        return defpackage.ci0.hkbnNdmy(this, ljVar);
    }

    @Override // defpackage.lj
    public final defpackage.lj V7bD7b8KA(defpackage.kj kjVar) {
        return this.AARZUJiTa.equals(kjVar) ? defpackage.lt.adDC3e2L : this;
    }

    @Override // defpackage.lj
    public final defpackage.jj cnag84Bm(defpackage.kj kjVar) {
        if (this.AARZUJiTa.equals(kjVar)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.jj
    public final defpackage.kj getKey() {
        return this.AARZUJiTa;
    }

    public final java.lang.Object r1MBDhnF() {
        java.lang.ThreadLocal threadLocal = this.xiZrDbcSW0;
        java.lang.Object obj = threadLocal.get();
        threadLocal.set(this.adDC3e2L);
        return obj;
    }

    public final java.lang.String toString() {
        return "ThreadLocal(value=" + this.adDC3e2L + ", threadLocal = " + this.xiZrDbcSW0 + ')';
    }
}
