package defpackage;

/* loaded from: classes.dex */
public abstract class oa1 {
    public int F7NU4MC0GW;
    public defpackage.ua1 IHQe1A4L2xu;
    public long oh6vYeIP;
    public boolean r1MBDhnF;

    public oa1(long j, defpackage.ua1 ua1Var) {
        int i;
        int numberOfTrailingZeros;
        this.IHQe1A4L2xu = ua1Var;
        this.oh6vYeIP = j;
        defpackage.r41 r41Var = defpackage.wa1.IHQe1A4L2xu;
        if (j != 0) {
            defpackage.ua1 F7NU4MC0GW = F7NU4MC0GW();
            long j2 = F7NU4MC0GW.AARZUJiTa;
            long[] jArr = F7NU4MC0GW.EXtogiMhuM;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = F7NU4MC0GW.xiZrDbcSW0;
                if (j3 != 0) {
                    numberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = F7NU4MC0GW.adDC3e2L;
                    if (j4 != 0) {
                        j2 += 64;
                        numberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j4);
                    }
                }
                j = numberOfTrailingZeros + j2;
            }
            synchronized (defpackage.wa1.r1MBDhnF) {
                i = defpackage.wa1.xiZrDbcSW0.IHQe1A4L2xu(j);
            }
        } else {
            i = -1;
        }
        this.F7NU4MC0GW = i;
    }

    public static void G3OKOH3wZRC(defpackage.oa1 oa1Var) {
        defpackage.wa1.oh6vYeIP.cnag84Bm(oa1Var);
    }

    public long AARZUJiTa() {
        return this.oh6vYeIP;
    }

    public abstract void DFo87pBq1E5();

    public int EXtogiMhuM() {
        return 0;
    }

    public void EgCjBq0SZwJ(long j) {
        this.oh6vYeIP = j;
    }

    public defpackage.ua1 F7NU4MC0GW() {
        return this.IHQe1A4L2xu;
    }

    public final void IHQe1A4L2xu() {
        synchronized (defpackage.wa1.r1MBDhnF) {
            oh6vYeIP();
            QoRHpC4k();
        }
    }

    public abstract void JlrlGoKF();

    public void QoRHpC4k() {
        cnag84Bm();
    }

    public final defpackage.oa1 SH1y5HwkJhh() {
        defpackage.v5 v5Var = defpackage.wa1.oh6vYeIP;
        defpackage.oa1 oa1Var = (defpackage.oa1) v5Var.adDC3e2L();
        v5Var.cnag84Bm(this);
        return oa1Var;
    }

    public abstract void SyNS6RMn(defpackage.kc1 kc1Var);

    public abstract defpackage.g00 adDC3e2L();

    public final void cnag84Bm() {
        int i = this.F7NU4MC0GW;
        if (i >= 0) {
            defpackage.wa1.kNAkVymC(i);
            this.F7NU4MC0GW = -1;
        }
    }

    public abstract void ez2rX8ReCYw();

    public void fnWB2E7cs(int i) {
        throw new java.lang.IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract defpackage.oa1 kNAkVymC(defpackage.g00 g00Var);

    public void kd6TUFXn(defpackage.ua1 ua1Var) {
        this.IHQe1A4L2xu = ua1Var;
    }

    public void oh6vYeIP() {
        defpackage.wa1.F7NU4MC0GW = defpackage.wa1.F7NU4MC0GW.oh6vYeIP(AARZUJiTa());
    }

    public abstract void r1MBDhnF();

    public abstract defpackage.g00 riuEU0zW4();

    public abstract boolean xiZrDbcSW0();
}
