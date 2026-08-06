package defpackage;

/* loaded from: classes.dex */
public final class s3 implements defpackage.nn1 {
    public final int IHQe1A4L2xu;
    public final java.lang.String oh6vYeIP;
    public final defpackage.qt0 r1MBDhnF = defpackage.c80.nBH8hAHy(defpackage.i60.adDC3e2L);
    public final defpackage.qt0 F7NU4MC0GW = defpackage.c80.nBH8hAHy(java.lang.Boolean.TRUE);

    public s3(java.lang.String str, int i) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = str;
    }

    public final void AARZUJiTa(defpackage.ro1 ro1Var, int i) {
        int i2 = this.IHQe1A4L2xu;
        if (i == 0 || (i & i2) != 0) {
            this.r1MBDhnF.setValue(ro1Var.IHQe1A4L2xu.EXtogiMhuM(i2));
            xiZrDbcSW0(ro1Var.IHQe1A4L2xu.fnWB2E7cs(i2));
        }
    }

    @Override // defpackage.nn1
    public final int F7NU4MC0GW(defpackage.qn qnVar, defpackage.w90 w90Var) {
        return adDC3e2L().IHQe1A4L2xu;
    }

    @Override // defpackage.nn1
    public final int IHQe1A4L2xu(defpackage.qn qnVar) {
        return adDC3e2L().F7NU4MC0GW;
    }

    public final defpackage.i60 adDC3e2L() {
        return (defpackage.i60) this.r1MBDhnF.getValue();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.s3) {
            return this.IHQe1A4L2xu == ((defpackage.s3) obj).IHQe1A4L2xu;
        }
        return false;
    }

    public final int hashCode() {
        return this.IHQe1A4L2xu;
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
        return this.oh6vYeIP + '(' + adDC3e2L().IHQe1A4L2xu + ", " + adDC3e2L().oh6vYeIP + ", " + adDC3e2L().r1MBDhnF + ", " + adDC3e2L().F7NU4MC0GW + ')';
    }

    public final void xiZrDbcSW0(boolean z) {
        this.F7NU4MC0GW.setValue(java.lang.Boolean.valueOf(z));
    }
}
