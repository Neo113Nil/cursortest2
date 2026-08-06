package defpackage;

/* loaded from: classes.dex */
public final class mg {
    public boolean AARZUJiTa;
    public defpackage.x9 adDC3e2L;
    public final defpackage.o7 oh6vYeIP;
    public final defpackage.uj r1MBDhnF;
    public defpackage.xb1 xiZrDbcSW0;
    public final defpackage.p7 IHQe1A4L2xu = new defpackage.p7(0, this);
    public defpackage.k00 F7NU4MC0GW = new defpackage.i3(2, null, 1);

    public mg(defpackage.uj ujVar, defpackage.qw0 qw0Var) {
        this.oh6vYeIP = new defpackage.o7(this, qw0Var);
        this.r1MBDhnF = ujVar;
    }

    public final void F7NU4MC0GW() {
        oh6vYeIP();
        if (IHQe1A4L2xu()) {
            this.AARZUJiTa = true;
            this.adDC3e2L = defpackage.w70.oh6vYeIP(-2, 4, defpackage.t9.adDC3e2L);
            this.xiZrDbcSW0 = defpackage.fm.SiPhmbmu(this.r1MBDhnF, null, new defpackage.adDC3e2L(this, (defpackage.ej) null, 8), 3);
        }
    }

    public final boolean IHQe1A4L2xu() {
        return this.IHQe1A4L2xu.oh6vYeIP && this.oh6vYeIP.oh6vYeIP;
    }

    public final void adDC3e2L(boolean z) {
        defpackage.xb1 xb1Var;
        if (!z && IHQe1A4L2xu() && (xb1Var = this.xiZrDbcSW0) != null && !xb1Var.oh6vYeIP()) {
            oh6vYeIP();
        }
        this.IHQe1A4L2xu.F7NU4MC0GW(z);
        this.oh6vYeIP.xiZrDbcSW0(z);
    }

    public final void oh6vYeIP() {
        defpackage.x9 x9Var = this.adDC3e2L;
        if (x9Var != null) {
            x9Var.SH1y5HwkJhh(new java.util.concurrent.CancellationException("onBack cancelled"), true);
        }
        defpackage.xb1 xb1Var = this.xiZrDbcSW0;
        if (xb1Var != null) {
            xb1Var.F7NU4MC0GW(null);
        }
        this.adDC3e2L = null;
        this.xiZrDbcSW0 = null;
        this.AARZUJiTa = false;
    }

    public final void r1MBDhnF() {
        if (this.adDC3e2L != null && !this.AARZUJiTa) {
            oh6vYeIP();
        }
        if (this.adDC3e2L == null) {
            this.AARZUJiTa = false;
            this.adDC3e2L = defpackage.w70.oh6vYeIP(-2, 4, defpackage.t9.adDC3e2L);
            this.xiZrDbcSW0 = defpackage.fm.SiPhmbmu(this.r1MBDhnF, null, new defpackage.adDC3e2L(this, (defpackage.ej) null, 8), 3);
        }
        defpackage.x9 x9Var = this.adDC3e2L;
        if (x9Var != null) {
            defpackage.f70.xiZrDbcSW0(x9Var);
        }
        this.AARZUJiTa = false;
    }
}
