package defpackage;

/* loaded from: classes.dex */
public final class so0 extends defpackage.oa1 {
    public final defpackage.g00 adDC3e2L;
    public final defpackage.oa1 xiZrDbcSW0;

    public so0(long j, defpackage.ua1 ua1Var, defpackage.g00 g00Var, defpackage.oa1 oa1Var) {
        super(j, ua1Var);
        this.adDC3e2L = g00Var;
        this.xiZrDbcSW0 = oa1Var;
        oa1Var.ez2rX8ReCYw();
    }

    @Override // defpackage.oa1
    public final void JlrlGoKF() {
        defpackage.l80.C0U8sNJm();
        throw null;
    }

    @Override // defpackage.oa1
    public final void SyNS6RMn(defpackage.kc1 kc1Var) {
        defpackage.r41 r41Var = defpackage.wa1.IHQe1A4L2xu;
        throw new java.lang.IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.oa1
    public final defpackage.g00 adDC3e2L() {
        return this.adDC3e2L;
    }

    @Override // defpackage.oa1
    public final void ez2rX8ReCYw() {
        defpackage.l80.C0U8sNJm();
        throw null;
    }

    @Override // defpackage.oa1
    public final defpackage.oa1 kNAkVymC(defpackage.g00 g00Var) {
        return new defpackage.so0(this.oh6vYeIP, this.IHQe1A4L2xu, defpackage.wa1.ez2rX8ReCYw(g00Var, this.adDC3e2L, true), this.xiZrDbcSW0);
    }

    @Override // defpackage.oa1
    public final void r1MBDhnF() {
        defpackage.oa1 oa1Var = this.xiZrDbcSW0;
        if (this.r1MBDhnF) {
            return;
        }
        if (this.oh6vYeIP != oa1Var.AARZUJiTa()) {
            IHQe1A4L2xu();
        }
        oa1Var.JlrlGoKF();
        this.r1MBDhnF = true;
        synchronized (defpackage.wa1.r1MBDhnF) {
            cnag84Bm();
        }
    }

    @Override // defpackage.oa1
    public final defpackage.g00 riuEU0zW4() {
        return null;
    }

    @Override // defpackage.oa1
    public final boolean xiZrDbcSW0() {
        return true;
    }

    @Override // defpackage.oa1
    public final void DFo87pBq1E5() {
    }
}
