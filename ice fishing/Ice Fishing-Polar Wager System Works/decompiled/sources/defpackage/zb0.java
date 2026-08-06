package defpackage;

/* loaded from: classes.dex */
public final class zb0 {
    public int F7NU4MC0GW;
    public final java.lang.Object IHQe1A4L2xu;
    public defpackage.zb0 adDC3e2L;
    public final defpackage.bc0 oh6vYeIP;
    public boolean xiZrDbcSW0;
    public int r1MBDhnF = -1;
    public final defpackage.qt0 AARZUJiTa = defpackage.c80.nBH8hAHy(null);

    public zb0(java.lang.Object obj, defpackage.bc0 bc0Var) {
        this.IHQe1A4L2xu = obj;
        this.oh6vYeIP = bc0Var;
    }

    public final defpackage.zb0 IHQe1A4L2xu() {
        if (this.xiZrDbcSW0) {
            defpackage.a60.r1MBDhnF("Pin should not be called on an already disposed item ");
        }
        if (this.F7NU4MC0GW == 0) {
            this.oh6vYeIP.adDC3e2L.add(this);
            defpackage.zb0 zb0Var = (defpackage.zb0) this.AARZUJiTa.getValue();
            if (zb0Var != null) {
                zb0Var.IHQe1A4L2xu();
            } else {
                zb0Var = null;
            }
            this.adDC3e2L = zb0Var;
        }
        this.F7NU4MC0GW++;
        return this;
    }

    public final void oh6vYeIP() {
        if (this.xiZrDbcSW0) {
            return;
        }
        if (this.F7NU4MC0GW <= 0) {
            defpackage.a60.r1MBDhnF("Release should only be called once");
        }
        int i = this.F7NU4MC0GW - 1;
        this.F7NU4MC0GW = i;
        if (i == 0) {
            this.oh6vYeIP.adDC3e2L.remove(this);
            defpackage.zb0 zb0Var = this.adDC3e2L;
            if (zb0Var != null) {
                zb0Var.oh6vYeIP();
            }
            this.adDC3e2L = null;
        }
    }
}
