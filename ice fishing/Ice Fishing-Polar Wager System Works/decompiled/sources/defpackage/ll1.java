package defpackage;

/* loaded from: classes.dex */
public final class ll1 implements defpackage.nn1 {
    public final java.lang.String IHQe1A4L2xu;
    public final defpackage.qt0 oh6vYeIP;

    public ll1(defpackage.q60 q60Var, java.lang.String str) {
        this.IHQe1A4L2xu = str;
        this.oh6vYeIP = defpackage.c80.nBH8hAHy(q60Var);
    }

    @Override // defpackage.nn1
    public final int F7NU4MC0GW(defpackage.qn qnVar, defpackage.w90 w90Var) {
        return adDC3e2L().IHQe1A4L2xu;
    }

    @Override // defpackage.nn1
    public final int IHQe1A4L2xu(defpackage.qn qnVar) {
        return adDC3e2L().F7NU4MC0GW;
    }

    public final defpackage.q60 adDC3e2L() {
        return (defpackage.q60) this.oh6vYeIP.getValue();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ll1) {
            return defpackage.x70.QoRHpC4k(adDC3e2L(), ((defpackage.ll1) obj).adDC3e2L());
        }
        return false;
    }

    public final int hashCode() {
        return this.IHQe1A4L2xu.hashCode();
    }

    @Override // defpackage.nn1
    public final int oh6vYeIP(defpackage.qn qnVar) {
        return adDC3e2L().oh6vYeIP;
    }

    @Override // defpackage.nn1
    public final int r1MBDhnF(defpackage.qn qnVar, defpackage.w90 w90Var) {
        return adDC3e2L().r1MBDhnF;
    }

    public final java.lang.String toString() {
        return this.IHQe1A4L2xu + "(left=" + adDC3e2L().IHQe1A4L2xu + ", top=" + adDC3e2L().oh6vYeIP + ", right=" + adDC3e2L().r1MBDhnF + ", bottom=" + adDC3e2L().F7NU4MC0GW + ')';
    }

    public final void xiZrDbcSW0(defpackage.q60 q60Var) {
        this.oh6vYeIP.setValue(q60Var);
    }
}
