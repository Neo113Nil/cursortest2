package defpackage;

/* loaded from: classes.dex */
public final class ea1 {
    public int AARZUJiTa;
    public int DFo87pBq1E5;
    public int EXtogiMhuM;
    public java.lang.Object[] F7NU4MC0GW;
    public final defpackage.fa1 IHQe1A4L2xu;
    public int JlrlGoKF;
    public final defpackage.k70 SH1y5HwkJhh;
    public boolean SyNS6RMn;
    public final int adDC3e2L;
    public int ez2rX8ReCYw;
    public final int[] oh6vYeIP;
    public final int r1MBDhnF;
    public int riuEU0zW4;
    public boolean xiZrDbcSW0;

    public ea1(defpackage.fa1 fa1Var) {
        this.IHQe1A4L2xu = fa1Var;
        this.oh6vYeIP = fa1Var.adDC3e2L;
        int i = fa1Var.xiZrDbcSW0;
        this.r1MBDhnF = i;
        this.F7NU4MC0GW = fa1Var.AARZUJiTa;
        this.adDC3e2L = fa1Var.EXtogiMhuM;
        this.EXtogiMhuM = i;
        this.riuEU0zW4 = -1;
        this.SH1y5HwkJhh = new defpackage.k70();
    }

    public final int AARZUJiTa() {
        int i = this.AARZUJiTa;
        if (i >= this.EXtogiMhuM) {
            return 0;
        }
        return this.oh6vYeIP[i * 5];
    }

    public final java.lang.Object DFo87pBq1E5() {
        int i;
        if (this.ez2rX8ReCYw > 0 || (i = this.JlrlGoKF) >= this.DFo87pBq1E5) {
            this.SyNS6RMn = false;
            return defpackage.bh.IHQe1A4L2xu;
        }
        this.SyNS6RMn = true;
        java.lang.Object[] objArr = this.F7NU4MC0GW;
        this.JlrlGoKF = i + 1;
        return objArr[i];
    }

    public final java.lang.Object EXtogiMhuM(int i, int i2) {
        int[] iArr = this.oh6vYeIP;
        int oh6vYeIP = defpackage.ha1.oh6vYeIP(iArr, i);
        int i3 = i + 1;
        int i4 = oh6vYeIP + i2;
        return i4 < (i3 < this.r1MBDhnF ? iArr[(i3 * 5) + 4] : this.adDC3e2L) ? this.F7NU4MC0GW[i4] : defpackage.bh.IHQe1A4L2xu;
    }

    public final int EgCjBq0SZwJ() {
        if (this.ez2rX8ReCYw != 0) {
            defpackage.dh.IHQe1A4L2xu("Cannot skip while in an empty region");
        }
        int i = this.AARZUJiTa;
        int i2 = i * 5;
        int[] iArr = this.oh6vYeIP;
        int i3 = iArr[i2 + 1];
        int i4 = (1073741824 & i3) != 0 ? 1 : i3 & 67108863;
        this.AARZUJiTa = iArr[i2 + 3] + i;
        return i4;
    }

    public final boolean F7NU4MC0GW(int i) {
        return (this.oh6vYeIP[(i * 5) + 1] & 67108864) != 0;
    }

    public final int G3OKOH3wZRC(int i) {
        return this.oh6vYeIP[(i * 5) + 2];
    }

    public final defpackage.o10 IHQe1A4L2xu(int i) {
        java.util.ArrayList arrayList = this.IHQe1A4L2xu.DFo87pBq1E5;
        int adDC3e2L = defpackage.ha1.adDC3e2L(arrayList, i, this.r1MBDhnF);
        if (adDC3e2L >= 0) {
            return (defpackage.o10) arrayList.get(adDC3e2L);
        }
        defpackage.o10 o10Var = new defpackage.o10(i);
        arrayList.add(-(adDC3e2L + 1), o10Var);
        return o10Var;
    }

    public final boolean JlrlGoKF(int i) {
        return (this.oh6vYeIP[(i * 5) + 1] & 1073741824) != 0;
    }

    public final java.lang.Object QoRHpC4k(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.F7NU4MC0GW[java.lang.Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final boolean SH1y5HwkJhh(int i) {
        return (this.oh6vYeIP[(i * 5) + 1] & 134217728) != 0;
    }

    public final java.lang.Object SyNS6RMn(int i) {
        int i2 = i * 5;
        int[] iArr = this.oh6vYeIP;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 != 0) {
            return i3 != 0 ? this.F7NU4MC0GW[iArr[i2 + 4]] : defpackage.bh.IHQe1A4L2xu;
        }
        return null;
    }

    public final void adDC3e2L() {
        if (this.ez2rX8ReCYw == 0) {
            if (this.AARZUJiTa != this.EXtogiMhuM) {
                defpackage.dh.IHQe1A4L2xu("endGroup() not called at the end of a group");
            }
            int i = (this.riuEU0zW4 * 5) + 2;
            int[] iArr = this.oh6vYeIP;
            int i2 = iArr[i];
            this.riuEU0zW4 = i2;
            int i3 = this.r1MBDhnF;
            this.EXtogiMhuM = i2 < 0 ? i3 : iArr[(i2 * 5) + 3] + i2;
            int oh6vYeIP = this.SH1y5HwkJhh.oh6vYeIP();
            if (oh6vYeIP < 0) {
                this.JlrlGoKF = 0;
                this.DFo87pBq1E5 = 0;
            } else {
                this.JlrlGoKF = oh6vYeIP;
                this.DFo87pBq1E5 = i2 >= i3 + (-1) ? this.adDC3e2L : iArr[((i2 + 1) * 5) + 4];
            }
        }
    }

    public final int cnag84Bm(int i) {
        return this.oh6vYeIP[(i * 5) + 1] & 67108863;
    }

    public final boolean ez2rX8ReCYw(int i) {
        return (this.oh6vYeIP[(i * 5) + 1] & 536870912) != 0;
    }

    public final void fnWB2E7cs() {
        if (!(this.ez2rX8ReCYw == 0)) {
            defpackage.dh.IHQe1A4L2xu("Cannot skip the enclosing group while in an empty region");
        }
        this.AARZUJiTa = this.EXtogiMhuM;
        this.JlrlGoKF = 0;
        this.DFo87pBq1E5 = 0;
    }

    public final void kNAkVymC() {
        if (this.ez2rX8ReCYw <= 0) {
            int i = this.riuEU0zW4;
            int i2 = this.AARZUJiTa;
            int i3 = i2 * 5;
            int[] iArr = this.oh6vYeIP;
            if (iArr[i3 + 2] != i) {
                defpackage.nw0.IHQe1A4L2xu("Invalid slot table detected");
            }
            int i4 = this.JlrlGoKF;
            int i5 = this.DFo87pBq1E5;
            defpackage.k70 k70Var = this.SH1y5HwkJhh;
            if (i4 == 0 && i5 == 0) {
                k70Var.r1MBDhnF(-1);
            } else {
                k70Var.r1MBDhnF(i4);
            }
            this.riuEU0zW4 = i2;
            this.EXtogiMhuM = iArr[i3 + 3] + i2;
            int i6 = i2 + 1;
            this.AARZUJiTa = i6;
            this.JlrlGoKF = defpackage.ha1.oh6vYeIP(iArr, i2);
            this.DFo87pBq1E5 = i2 >= this.r1MBDhnF + (-1) ? this.adDC3e2L : iArr[(i6 * 5) + 4];
        }
    }

    public final void kd6TUFXn(int i) {
        if (this.ez2rX8ReCYw != 0) {
            defpackage.dh.IHQe1A4L2xu("Cannot reposition while in an empty region");
        }
        this.AARZUJiTa = i;
        int[] iArr = this.oh6vYeIP;
        int i2 = this.r1MBDhnF;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        if (i3 != this.riuEU0zW4) {
            this.riuEU0zW4 = i3;
            if (i3 < 0) {
                this.EXtogiMhuM = i2;
            } else {
                this.EXtogiMhuM = iArr[(i3 * 5) + 3] + i3;
            }
            this.JlrlGoKF = 0;
            this.DFo87pBq1E5 = 0;
        }
    }

    public final java.lang.Object oh6vYeIP(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            return this.F7NU4MC0GW[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + java.lang.Integer.bitCount(i3 >> 29)];
        }
        return defpackage.bh.IHQe1A4L2xu;
    }

    public final void r1MBDhnF() {
        this.xiZrDbcSW0 = true;
        if (this.IHQe1A4L2xu.riuEU0zW4 <= 0) {
            defpackage.dh.IHQe1A4L2xu("Unexpected reader close()");
        }
        r0.riuEU0zW4--;
        this.F7NU4MC0GW = new java.lang.Object[0];
    }

    public final int riuEU0zW4(int i) {
        return this.oh6vYeIP[i * 5];
    }

    public final java.lang.String toString() {
        return "SlotReader(current=" + this.AARZUJiTa + ", key=" + AARZUJiTa() + ", parent=" + this.riuEU0zW4 + ", end=" + this.EXtogiMhuM + ')';
    }

    public final java.lang.Object xiZrDbcSW0() {
        int i = this.AARZUJiTa;
        if (i < this.EXtogiMhuM) {
            return oh6vYeIP(this.oh6vYeIP, i);
        }
        return 0;
    }
}
