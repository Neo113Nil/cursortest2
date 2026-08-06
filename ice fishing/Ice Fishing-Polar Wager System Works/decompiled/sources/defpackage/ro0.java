package defpackage;

/* loaded from: classes.dex */
public final class ro0 extends defpackage.rl0 {
    public boolean QoRHpC4k;
    public final defpackage.rl0 cnag84Bm;

    public ro0(long j, defpackage.ua1 ua1Var, defpackage.g00 g00Var, defpackage.g00 g00Var2, defpackage.rl0 rl0Var) {
        super(j, ua1Var, g00Var, g00Var2);
        this.cnag84Bm = rl0Var;
        rl0Var.ez2rX8ReCYw();
    }

    @Override // defpackage.rl0
    public final defpackage.j70 PAEGRtP0bX() {
        defpackage.ro0 ro0Var;
        defpackage.rl0 rl0Var = this.cnag84Bm;
        if (rl0Var.DFo87pBq1E5 || rl0Var.r1MBDhnF) {
            return new defpackage.qa1(this);
        }
        defpackage.ol0 ol0Var = this.EXtogiMhuM;
        long j = this.oh6vYeIP;
        java.util.HashMap oh6vYeIP = ol0Var != null ? defpackage.wa1.oh6vYeIP(rl0Var.AARZUJiTa(), this, this.cnag84Bm.F7NU4MC0GW()) : null;
        java.lang.Object obj = defpackage.wa1.r1MBDhnF;
        synchronized (obj) {
            try {
                defpackage.wa1.r1MBDhnF(this);
                if (ol0Var == null || ol0Var.F7NU4MC0GW == 0) {
                    ro0Var = this;
                    ro0Var.IHQe1A4L2xu();
                } else {
                    ro0Var = this;
                    defpackage.j70 QQUzIjv3iOC5 = ro0Var.QQUzIjv3iOC5(this.cnag84Bm.AARZUJiTa(), ol0Var, oh6vYeIP, this.cnag84Bm.F7NU4MC0GW());
                    if (!QQUzIjv3iOC5.equals(defpackage.ra1.adDC3e2L)) {
                        return QQUzIjv3iOC5;
                    }
                    defpackage.ol0 abhbClRa = ro0Var.cnag84Bm.abhbClRa();
                    if (abhbClRa != null) {
                        abhbClRa.SH1y5HwkJhh(ol0Var);
                    } else {
                        ro0Var.cnag84Bm.UsuH8pd5P(ol0Var);
                        ro0Var.EXtogiMhuM = null;
                    }
                }
                if (defpackage.x70.V7bD7b8KA(ro0Var.cnag84Bm.AARZUJiTa(), j) < 0) {
                    ro0Var.cnag84Bm.V7bD7b8KA();
                }
                defpackage.rl0 rl0Var2 = ro0Var.cnag84Bm;
                rl0Var2.kd6TUFXn(rl0Var2.F7NU4MC0GW().oh6vYeIP(j).IHQe1A4L2xu(ro0Var.SH1y5HwkJhh));
                ro0Var.cnag84Bm.C0U8sNJm(j);
                defpackage.rl0 rl0Var3 = ro0Var.cnag84Bm;
                int i = ro0Var.F7NU4MC0GW;
                ro0Var.F7NU4MC0GW = -1;
                if (i >= 0) {
                    int[] iArr = rl0Var3.ez2rX8ReCYw;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] copyOf = java.util.Arrays.copyOf(iArr, length + 1);
                    copyOf[length] = i;
                    rl0Var3.ez2rX8ReCYw = copyOf;
                } else {
                    rl0Var3.getClass();
                }
                defpackage.rl0 rl0Var4 = ro0Var.cnag84Bm;
                defpackage.ua1 ua1Var = ro0Var.SH1y5HwkJhh;
                rl0Var4.getClass();
                synchronized (obj) {
                    rl0Var4.SH1y5HwkJhh = rl0Var4.SH1y5HwkJhh.adDC3e2L(ua1Var);
                    defpackage.rl0 rl0Var5 = ro0Var.cnag84Bm;
                    int[] iArr2 = ro0Var.ez2rX8ReCYw;
                    rl0Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = rl0Var5.ez2rX8ReCYw;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] copyOf2 = java.util.Arrays.copyOf(iArr3, length2 + length3);
                            java.lang.System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                            iArr2 = copyOf2;
                        }
                        rl0Var5.ez2rX8ReCYw = iArr2;
                    }
                }
                ro0Var.DFo87pBq1E5 = true;
                if (!ro0Var.QoRHpC4k) {
                    ro0Var.QoRHpC4k = true;
                    ro0Var.cnag84Bm.JlrlGoKF();
                }
                return defpackage.ra1.adDC3e2L;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rl0, defpackage.oa1
    public final void r1MBDhnF() {
        if (this.r1MBDhnF) {
            return;
        }
        super.r1MBDhnF();
        if (this.QoRHpC4k) {
            return;
        }
        this.QoRHpC4k = true;
        this.cnag84Bm.JlrlGoKF();
    }
}
