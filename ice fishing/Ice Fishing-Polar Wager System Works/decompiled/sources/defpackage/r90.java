package defpackage;

/* loaded from: classes.dex */
public final class r90 implements defpackage.w01, defpackage.oj {
    public final defpackage.dj AARZUJiTa;
    public defpackage.xb1 EXtogiMhuM;
    public final defpackage.lj adDC3e2L;
    public final defpackage.k00 xiZrDbcSW0;

    public r90(defpackage.lj ljVar, defpackage.k00 k00Var) {
        this.adDC3e2L = ljVar;
        this.xiZrDbcSW0 = k00Var;
        this.AARZUJiTa = defpackage.h1.oh6vYeIP(ljVar.JlrlGoKF(this));
    }

    @Override // defpackage.lj
    public final java.lang.Object EgCjBq0SZwJ(defpackage.k00 k00Var, java.lang.Object obj) {
        return k00Var.adDC3e2L(obj, this);
    }

    @Override // defpackage.oj
    public final void G3OKOH3wZRC(defpackage.lj ljVar, java.lang.Throwable th) {
        defpackage.ih ihVar = (defpackage.ih) ljVar.cnag84Bm(defpackage.ih.xiZrDbcSW0);
        if (ihVar != null) {
            defpackage.x70.RmCzwkUxICV(th, new defpackage.DSux0S2nxMSk(3, ihVar, this));
        }
        defpackage.oj ojVar = (defpackage.oj) this.adDC3e2L.cnag84Bm(defpackage.n.C0U8sNJm);
        if (ojVar == null) {
            throw th;
        }
        ojVar.G3OKOH3wZRC(ljVar, th);
    }

    @Override // defpackage.w01
    public final void IHQe1A4L2xu() {
        defpackage.xb1 xb1Var = this.EXtogiMhuM;
        if (xb1Var != null) {
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            xb1Var.F7NU4MC0GW(cancellationException);
        }
        this.EXtogiMhuM = defpackage.fm.SiPhmbmu(this.AARZUJiTa, null, this.xiZrDbcSW0, 3);
    }

    @Override // defpackage.lj
    public final defpackage.lj JlrlGoKF(defpackage.lj ljVar) {
        return defpackage.ci0.hkbnNdmy(this, ljVar);
    }

    @Override // defpackage.lj
    public final defpackage.lj V7bD7b8KA(defpackage.kj kjVar) {
        return defpackage.ci0.XZx205DYe(this, kjVar);
    }

    @Override // defpackage.w01
    public final void adDC3e2L() {
        defpackage.xb1 xb1Var = this.EXtogiMhuM;
        if (xb1Var != null) {
            xb1Var.v5iciZok(new defpackage.kz(1));
        }
        this.EXtogiMhuM = null;
    }

    @Override // defpackage.lj
    public final defpackage.jj cnag84Bm(defpackage.kj kjVar) {
        return defpackage.ci0.NHJTzaLwkd(this, kjVar);
    }

    @Override // defpackage.jj
    public final defpackage.kj getKey() {
        return defpackage.n.C0U8sNJm;
    }

    @Override // defpackage.w01
    public final void r1MBDhnF() {
        defpackage.xb1 xb1Var = this.EXtogiMhuM;
        if (xb1Var != null) {
            xb1Var.v5iciZok(new defpackage.kz(1));
        }
        this.EXtogiMhuM = null;
    }
}
