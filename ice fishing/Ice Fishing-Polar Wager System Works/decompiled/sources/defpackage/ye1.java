package defpackage;

/* loaded from: classes.dex */
public final class ye1 implements defpackage.y4 {
    public final defpackage.i5 AARZUJiTa;
    public long EXtogiMhuM;
    public java.lang.Object F7NU4MC0GW;
    public final defpackage.nl1 IHQe1A4L2xu;
    public defpackage.i5 adDC3e2L;
    public final defpackage.F7NU4MC0GW oh6vYeIP;
    public java.lang.Object r1MBDhnF;
    public defpackage.i5 riuEU0zW4;
    public defpackage.i5 xiZrDbcSW0;

    public ye1(defpackage.c5 c5Var, defpackage.F7NU4MC0GW f7nu4mc0gw, java.lang.Object obj, java.lang.Object obj2, defpackage.i5 i5Var) {
        this.IHQe1A4L2xu = c5Var.IHQe1A4L2xu(f7nu4mc0gw);
        this.oh6vYeIP = f7nu4mc0gw;
        this.r1MBDhnF = obj2;
        this.F7NU4MC0GW = obj;
        this.adDC3e2L = (defpackage.i5) ((defpackage.g00) f7nu4mc0gw.xiZrDbcSW0).AARZUJiTa(obj);
        defpackage.g00 g00Var = (defpackage.g00) f7nu4mc0gw.xiZrDbcSW0;
        this.xiZrDbcSW0 = (defpackage.i5) g00Var.AARZUJiTa(obj2);
        this.AARZUJiTa = i5Var != null ? defpackage.ci0.kd6TUFXn(i5Var) : ((defpackage.i5) g00Var.AARZUJiTa(obj)).r1MBDhnF();
        this.EXtogiMhuM = -1L;
    }

    public final void EXtogiMhuM(java.lang.Object obj) {
        if (defpackage.x70.QoRHpC4k(obj, this.F7NU4MC0GW)) {
            return;
        }
        this.F7NU4MC0GW = obj;
        this.adDC3e2L = (defpackage.i5) ((defpackage.g00) this.oh6vYeIP.xiZrDbcSW0).AARZUJiTa(obj);
        this.riuEU0zW4 = null;
        this.EXtogiMhuM = -1L;
    }

    @Override // defpackage.y4
    public final defpackage.F7NU4MC0GW F7NU4MC0GW() {
        return this.oh6vYeIP;
    }

    @Override // defpackage.y4
    public final boolean IHQe1A4L2xu() {
        return this.IHQe1A4L2xu.IHQe1A4L2xu();
    }

    @Override // defpackage.y4
    public final java.lang.Object adDC3e2L() {
        return this.r1MBDhnF;
    }

    @Override // defpackage.y4
    public final java.lang.Object oh6vYeIP(long j) {
        if (AARZUJiTa(j)) {
            return this.r1MBDhnF;
        }
        defpackage.i5 cnag84Bm = this.IHQe1A4L2xu.cnag84Bm(j, this.adDC3e2L, this.xiZrDbcSW0, this.AARZUJiTa);
        int oh6vYeIP = cnag84Bm.oh6vYeIP();
        for (int i = 0; i < oh6vYeIP; i++) {
            if (java.lang.Float.isNaN(cnag84Bm.IHQe1A4L2xu(i))) {
                defpackage.pw0.oh6vYeIP("AnimationVector cannot contain a NaN. " + cnag84Bm + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return ((defpackage.g00) this.oh6vYeIP.AARZUJiTa).AARZUJiTa(cnag84Bm);
    }

    @Override // defpackage.y4
    public final long r1MBDhnF() {
        if (this.EXtogiMhuM < 0) {
            this.EXtogiMhuM = this.IHQe1A4L2xu.oh6vYeIP(this.adDC3e2L, this.xiZrDbcSW0, this.AARZUJiTa);
        }
        return this.EXtogiMhuM;
    }

    public final void riuEU0zW4(java.lang.Object obj) {
        if (defpackage.x70.QoRHpC4k(this.r1MBDhnF, obj)) {
            return;
        }
        this.r1MBDhnF = obj;
        this.xiZrDbcSW0 = (defpackage.i5) ((defpackage.g00) this.oh6vYeIP.xiZrDbcSW0).AARZUJiTa(obj);
        this.riuEU0zW4 = null;
        this.EXtogiMhuM = -1L;
    }

    public final java.lang.String toString() {
        return "TargetBasedAnimation: " + this.F7NU4MC0GW + " -> " + this.r1MBDhnF + ",initial velocity: " + this.AARZUJiTa + ", duration: " + (r1MBDhnF() / 1000000) + " ms,animationSpec: " + this.IHQe1A4L2xu;
    }

    @Override // defpackage.y4
    public final defpackage.i5 xiZrDbcSW0(long j) {
        if (!AARZUJiTa(j)) {
            return this.IHQe1A4L2xu.JlrlGoKF(j, this.adDC3e2L, this.xiZrDbcSW0, this.AARZUJiTa);
        }
        defpackage.i5 i5Var = this.riuEU0zW4;
        if (i5Var != null) {
            return i5Var;
        }
        defpackage.i5 QoRHpC4k = this.IHQe1A4L2xu.QoRHpC4k(this.adDC3e2L, this.xiZrDbcSW0, this.AARZUJiTa);
        this.riuEU0zW4 = QoRHpC4k;
        return QoRHpC4k;
    }
}
