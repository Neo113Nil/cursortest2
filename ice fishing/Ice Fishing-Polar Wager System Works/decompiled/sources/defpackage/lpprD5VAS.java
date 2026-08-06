package defpackage;

/* loaded from: classes.dex */
public abstract class lpprD5VAS {
    public int AARZUJiTa;
    public defpackage.jd1 EXtogiMhuM;
    public defpackage.hkbnNdmy[] adDC3e2L;
    public int xiZrDbcSW0;

    public final defpackage.jd1 AARZUJiTa() {
        defpackage.jd1 jd1Var;
        synchronized (this) {
            jd1Var = this.EXtogiMhuM;
            if (jd1Var == null) {
                int i = this.xiZrDbcSW0;
                jd1Var = new defpackage.jd1(1, Integer.MAX_VALUE, defpackage.t9.xiZrDbcSW0);
                jd1Var.G3OKOH3wZRC(java.lang.Integer.valueOf(i));
                this.EXtogiMhuM = jd1Var;
            }
        }
        return jd1Var;
    }

    public abstract defpackage.hkbnNdmy F7NU4MC0GW();

    public abstract defpackage.hkbnNdmy[] adDC3e2L();

    public final defpackage.hkbnNdmy r1MBDhnF() {
        defpackage.hkbnNdmy hkbnndmy;
        defpackage.jd1 jd1Var;
        synchronized (this) {
            try {
                defpackage.hkbnNdmy[] hkbnndmyArr = this.adDC3e2L;
                if (hkbnndmyArr == null) {
                    hkbnndmyArr = adDC3e2L();
                    this.adDC3e2L = hkbnndmyArr;
                } else if (this.xiZrDbcSW0 >= hkbnndmyArr.length) {
                    java.lang.Object[] copyOf = java.util.Arrays.copyOf(hkbnndmyArr, hkbnndmyArr.length * 2);
                    this.adDC3e2L = (defpackage.hkbnNdmy[]) copyOf;
                    hkbnndmyArr = (defpackage.hkbnNdmy[]) copyOf;
                }
                int i = this.AARZUJiTa;
                do {
                    hkbnndmy = hkbnndmyArr[i];
                    if (hkbnndmy == null) {
                        hkbnndmy = F7NU4MC0GW();
                        hkbnndmyArr[i] = hkbnndmy;
                    }
                    i++;
                    if (i >= hkbnndmyArr.length) {
                        i = 0;
                    }
                } while (!hkbnndmy.IHQe1A4L2xu(this));
                this.AARZUJiTa = i;
                this.xiZrDbcSW0++;
                jd1Var = this.EXtogiMhuM;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (jd1Var != null) {
            jd1Var.PAEGRtP0bX(1);
        }
        return hkbnndmy;
    }

    public final void xiZrDbcSW0(defpackage.hkbnNdmy hkbnndmy) {
        defpackage.jd1 jd1Var;
        int i;
        defpackage.ej[] oh6vYeIP;
        synchronized (this) {
            try {
                int i2 = this.xiZrDbcSW0 - 1;
                this.xiZrDbcSW0 = i2;
                jd1Var = this.EXtogiMhuM;
                if (i2 == 0) {
                    this.AARZUJiTa = 0;
                }
                hkbnndmy.getClass();
                oh6vYeIP = hkbnndmy.oh6vYeIP(this);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        for (defpackage.ej ejVar : oh6vYeIP) {
            if (ejVar != null) {
                ejVar.SH1y5HwkJhh(defpackage.ok1.IHQe1A4L2xu);
            }
        }
        if (jd1Var != null) {
            jd1Var.PAEGRtP0bX(-1);
        }
    }
}
