package defpackage;

/* loaded from: classes.dex */
public final class rg1 {
    public long AARZUJiTa = Long.MIN_VALUE;
    public final /* synthetic */ defpackage.sg1 EXtogiMhuM;
    public defpackage.rg1 F7NU4MC0GW;
    public final int IHQe1A4L2xu;
    public long adDC3e2L;
    public final defpackage.i7 oh6vYeIP;
    public final defpackage.r1MBDhnF r1MBDhnF;
    public long xiZrDbcSW0;

    public rg1(defpackage.sg1 sg1Var, int i, defpackage.i7 i7Var, defpackage.r1MBDhnF r1mbdhnf) {
        this.EXtogiMhuM = sg1Var;
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = i7Var;
        this.r1MBDhnF = r1mbdhnf;
    }

    public final void IHQe1A4L2xu(long j, long j2, long j3, long j4, float[] fArr) {
        defpackage.xz0 xz0Var;
        defpackage.xz0 xz0Var2;
        long j5 = this.EXtogiMhuM.xiZrDbcSW0;
        defpackage.i7 i7Var = this.oh6vYeIP;
        defpackage.ip0 nBH8hAHy = defpackage.w70.nBH8hAHy(i7Var, 2);
        defpackage.ma0 D2vUnMij = defpackage.w70.D2vUnMij(i7Var);
        boolean yIx6ChFVk = D2vUnMij.yIx6ChFVk();
        defpackage.ep0 ep0Var = D2vUnMij.yIx6ChFVk;
        if (yIx6ChFVk) {
            if (ep0Var.F7NU4MC0GW != nBH8hAHy) {
                long floatToRawIntBits = (java.lang.Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (java.lang.Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = nBH8hAHy.AARZUJiTa;
                defpackage.ip0 ip0Var = ep0Var.F7NU4MC0GW;
                ip0Var.getClass();
                xz0Var = new defpackage.xz0(defpackage.a70.UsuH8pd5P(ip0Var.D2vUnMij(nBH8hAHy, floatToRawIntBits)), (4294967295L & (((int) (r3 & 4294967295L)) + ((int) (j6 & 4294967295L)))) | ((((int) (r3 >> 32)) + ((int) (j6 >> 32))) << 32), j3, j4, j5, fArr, i7Var);
            } else {
                xz0Var = new defpackage.xz0(j, j2, j3, j4, j5, fArr, i7Var);
            }
            xz0Var2 = xz0Var;
        } else {
            xz0Var2 = null;
        }
        if (xz0Var2 == null) {
            return;
        }
        this.r1MBDhnF.AARZUJiTa(xz0Var2);
    }

    public final void oh6vYeIP() {
        defpackage.sg1 sg1Var = this.EXtogiMhuM;
        defpackage.xk0 xk0Var = sg1Var.IHQe1A4L2xu;
        int i = this.IHQe1A4L2xu;
        defpackage.rg1 rg1Var = (defpackage.rg1) xk0Var.AARZUJiTa(i);
        if (rg1Var != null) {
            if (rg1Var == this) {
                defpackage.rg1 rg1Var2 = this.F7NU4MC0GW;
                this.F7NU4MC0GW = null;
                if (rg1Var2 == null) {
                    defpackage.ma0 D2vUnMij = defpackage.w70.D2vUnMij(this.oh6vYeIP.adDC3e2L);
                    if (D2vUnMij.ez2rX8ReCYw) {
                        ((defpackage.v0) defpackage.pa0.IHQe1A4L2xu(D2vUnMij)).getRectManager().oh6vYeIP.xiZrDbcSW0(D2vUnMij.xiZrDbcSW0, false);
                        return;
                    }
                    return;
                }
                int F7NU4MC0GW = xk0Var.F7NU4MC0GW(i);
                java.lang.Object[] objArr = xk0Var.r1MBDhnF;
                java.lang.Object obj = objArr[F7NU4MC0GW];
                xk0Var.oh6vYeIP[F7NU4MC0GW] = i;
                objArr[F7NU4MC0GW] = rg1Var2;
                return;
            }
            int F7NU4MC0GW2 = xk0Var.F7NU4MC0GW(i);
            java.lang.Object[] objArr2 = xk0Var.r1MBDhnF;
            java.lang.Object obj2 = objArr2[F7NU4MC0GW2];
            xk0Var.oh6vYeIP[F7NU4MC0GW2] = i;
            objArr2[F7NU4MC0GW2] = rg1Var;
            while (true) {
                defpackage.rg1 rg1Var3 = rg1Var.F7NU4MC0GW;
                if (rg1Var3 == null) {
                    break;
                }
                if (rg1Var3 == this) {
                    rg1Var.F7NU4MC0GW = this.F7NU4MC0GW;
                    this.F7NU4MC0GW = null;
                    return;
                }
                rg1Var = rg1Var3;
            }
        }
        defpackage.rg1 rg1Var4 = sg1Var.oh6vYeIP;
        if (rg1Var4 == this) {
            sg1Var.oh6vYeIP = rg1Var4.F7NU4MC0GW;
            this.F7NU4MC0GW = null;
            return;
        }
        defpackage.rg1 rg1Var5 = rg1Var4 != null ? rg1Var4.F7NU4MC0GW : null;
        while (true) {
            defpackage.rg1 rg1Var6 = rg1Var4;
            rg1Var4 = rg1Var5;
            if (rg1Var4 == null) {
                return;
            }
            if (rg1Var4 == this) {
                if (rg1Var6 != null) {
                    rg1Var6.F7NU4MC0GW = rg1Var4.F7NU4MC0GW;
                }
                this.F7NU4MC0GW = null;
                return;
            }
            rg1Var5 = rg1Var4.F7NU4MC0GW;
        }
    }
}
