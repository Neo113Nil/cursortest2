package defpackage;

/* loaded from: classes.dex */
public final class sc0 implements defpackage.ji0 {
    public final boolean AARZUJiTa;
    public final int DFo87pBq1E5;
    public final defpackage.uj EXtogiMhuM;
    public final float F7NU4MC0GW;
    public final int G3OKOH3wZRC;
    public final defpackage.tc0 IHQe1A4L2xu;
    public final int JlrlGoKF;
    public final int QoRHpC4k;
    public final long SH1y5HwkJhh;
    public final int SyNS6RMn;
    public final defpackage.ji0 adDC3e2L;
    public final defpackage.ks0 cnag84Bm;
    public final java.util.List ez2rX8ReCYw;
    public final int oh6vYeIP;
    public final boolean r1MBDhnF;
    public final defpackage.qn riuEU0zW4;
    public final float xiZrDbcSW0;

    public sc0(defpackage.tc0 tc0Var, int i, boolean z, float f, defpackage.ji0 ji0Var, float f2, boolean z2, defpackage.uj ujVar, defpackage.qn qnVar, long j, java.util.List list, int i2, int i3, int i4, defpackage.ks0 ks0Var, int i5, int i6) {
        this.IHQe1A4L2xu = tc0Var;
        this.oh6vYeIP = i;
        this.r1MBDhnF = z;
        this.F7NU4MC0GW = f;
        this.adDC3e2L = ji0Var;
        this.xiZrDbcSW0 = f2;
        this.AARZUJiTa = z2;
        this.EXtogiMhuM = ujVar;
        this.riuEU0zW4 = qnVar;
        this.SH1y5HwkJhh = j;
        this.ez2rX8ReCYw = list;
        this.JlrlGoKF = i2;
        this.DFo87pBq1E5 = i3;
        this.SyNS6RMn = i4;
        this.cnag84Bm = ks0Var;
        this.QoRHpC4k = i5;
        this.G3OKOH3wZRC = i6;
    }

    public final long AARZUJiTa() {
        defpackage.ji0 ji0Var = this.adDC3e2L;
        return (ji0Var.adDC3e2L() << 32) | (ji0Var.r1MBDhnF() & 4294967295L);
    }

    @Override // defpackage.ji0
    public final defpackage.g00 F7NU4MC0GW() {
        return this.adDC3e2L.F7NU4MC0GW();
    }

    @Override // defpackage.ji0
    public final java.util.Map IHQe1A4L2xu() {
        return this.adDC3e2L.IHQe1A4L2xu();
    }

    @Override // defpackage.ji0
    public final int adDC3e2L() {
        return this.adDC3e2L.adDC3e2L();
    }

    @Override // defpackage.ji0
    public final void oh6vYeIP() {
        this.adDC3e2L.oh6vYeIP();
    }

    @Override // defpackage.ji0
    public final int r1MBDhnF() {
        return this.adDC3e2L.r1MBDhnF();
    }

    public final defpackage.sc0 xiZrDbcSW0(int i, boolean z) {
        defpackage.tc0 tc0Var;
        if (this.AARZUJiTa) {
            return null;
        }
        java.util.List list = this.ez2rX8ReCYw;
        if (list.isEmpty() || (tc0Var = this.IHQe1A4L2xu) == null) {
            return null;
        }
        int i2 = tc0Var.JlrlGoKF;
        int i3 = this.oh6vYeIP - i;
        if (i3 < 0 || i3 >= i2) {
            return null;
        }
        defpackage.tc0 tc0Var2 = (defpackage.tc0) defpackage.td.JcqDrWrgMf(list);
        defpackage.tc0 tc0Var3 = (defpackage.tc0) defpackage.td.NWDBeGGF(list);
        if (tc0Var2.SyNS6RMn || tc0Var3.SyNS6RMn) {
            return null;
        }
        int i4 = tc0Var2.SH1y5HwkJhh;
        int i5 = this.DFo87pBq1E5;
        int i6 = this.JlrlGoKF;
        if (i < 0) {
            if (java.lang.Math.min((i4 + tc0Var2.JlrlGoKF) - i6, (tc0Var3.SH1y5HwkJhh + tc0Var3.JlrlGoKF) - i5) <= (-i)) {
                return null;
            }
        } else if (java.lang.Math.min(i6 - i4, i5 - tc0Var3.SH1y5HwkJhh) <= i) {
            return null;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            defpackage.tc0 tc0Var4 = (defpackage.tc0) list.get(i7);
            tc0Var4.getClass();
            int[] iArr = tc0Var4.QoRHpC4k;
            if (!tc0Var4.SyNS6RMn) {
                tc0Var4.SH1y5HwkJhh += i;
                int length = iArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    if ((i8 & 1) != 0) {
                        iArr[i8] = iArr[i8] + i;
                    }
                }
                if (z) {
                    int size2 = tc0Var4.oh6vYeIP.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        defpackage.fx0.kd6TUFXn(tc0Var4.riuEU0zW4.IHQe1A4L2xu.AARZUJiTa(tc0Var4.AARZUJiTa));
                    }
                }
            }
        }
        return new defpackage.sc0(this.IHQe1A4L2xu, i3, this.r1MBDhnF || i > 0, i, this.adDC3e2L, this.xiZrDbcSW0, this.AARZUJiTa, this.EXtogiMhuM, this.riuEU0zW4, this.SH1y5HwkJhh, list, this.JlrlGoKF, this.DFo87pBq1E5, this.SyNS6RMn, this.cnag84Bm, this.QoRHpC4k, this.G3OKOH3wZRC);
    }
}
