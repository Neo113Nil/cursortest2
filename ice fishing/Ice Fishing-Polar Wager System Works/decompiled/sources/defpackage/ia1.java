package defpackage;

/* loaded from: classes.dex */
public final class ia1 {
    public int AARZUJiTa;
    public int DFo87pBq1E5;
    public int EXtogiMhuM;
    public defpackage.xk0 EgCjBq0SZwJ;
    public java.util.ArrayList F7NU4MC0GW;
    public final defpackage.k70 G3OKOH3wZRC;
    public final defpackage.fa1 IHQe1A4L2xu;
    public int JlrlGoKF;
    public boolean PAEGRtP0bX;
    public final defpackage.k70 QoRHpC4k;
    public int SH1y5HwkJhh;
    public int SyNS6RMn;
    public int V7bD7b8KA;
    public defpackage.wk0 abhbClRa;
    public java.util.HashMap adDC3e2L;
    public int cnag84Bm;
    public int ez2rX8ReCYw;
    public int fnWB2E7cs;
    public int kNAkVymC;
    public final defpackage.k70 kd6TUFXn;
    public int[] oh6vYeIP;
    public java.lang.Object[] r1MBDhnF;
    public int riuEU0zW4;
    public defpackage.xk0 xiZrDbcSW0;

    public ia1(defpackage.fa1 fa1Var) {
        this.IHQe1A4L2xu = fa1Var;
        int[] iArr = fa1Var.adDC3e2L;
        this.oh6vYeIP = iArr;
        java.lang.Object[] objArr = fa1Var.AARZUJiTa;
        this.r1MBDhnF = objArr;
        this.F7NU4MC0GW = fa1Var.DFo87pBq1E5;
        this.adDC3e2L = fa1Var.SyNS6RMn;
        this.xiZrDbcSW0 = fa1Var.cnag84Bm;
        int i = fa1Var.xiZrDbcSW0;
        this.AARZUJiTa = i;
        this.EXtogiMhuM = (iArr.length / 5) - i;
        int i2 = fa1Var.EXtogiMhuM;
        this.ez2rX8ReCYw = i2;
        this.JlrlGoKF = objArr.length - i2;
        this.DFo87pBq1E5 = i;
        this.QoRHpC4k = new defpackage.k70();
        this.G3OKOH3wZRC = new defpackage.k70();
        this.kd6TUFXn = new defpackage.k70();
        this.kNAkVymC = i;
        this.V7bD7b8KA = -1;
    }

    public static void QQUzIjv3iOC5(defpackage.ia1 ia1Var) {
        int i = ia1Var.V7bD7b8KA;
        int kd6TUFXn = ia1Var.kd6TUFXn(i);
        int[] iArr = ia1Var.oh6vYeIP;
        int i2 = (kd6TUFXn * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        ia1Var.Ye0N2xE9Hc(ia1Var.D2vUnMij(iArr, i));
    }

    public static int riuEU0zW4(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public final int AARZUJiTa(int[] iArr, int i) {
        if (i >= cnag84Bm()) {
            return this.r1MBDhnF.length - this.JlrlGoKF;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.r1MBDhnF.length - this.JlrlGoKF) + i2 + 1 : i2;
    }

    public final void C0U8sNJm(defpackage.fa1 fa1Var, int i) {
        if (this.SyNS6RMn <= 0) {
            defpackage.dh.IHQe1A4L2xu("Check failed");
        }
        if (i == 0 && this.fnWB2E7cs == 0 && this.IHQe1A4L2xu.xiZrDbcSW0 == 0) {
            int[] iArr = fa1Var.adDC3e2L;
            int i2 = iArr[(i * 5) + 3];
            int i3 = fa1Var.xiZrDbcSW0;
            if (i2 == i3) {
                int[] iArr2 = this.oh6vYeIP;
                java.lang.Object[] objArr = this.r1MBDhnF;
                java.util.ArrayList arrayList = this.F7NU4MC0GW;
                java.util.HashMap hashMap = this.adDC3e2L;
                defpackage.xk0 xk0Var = this.xiZrDbcSW0;
                java.lang.Object[] objArr2 = fa1Var.AARZUJiTa;
                int i4 = fa1Var.EXtogiMhuM;
                java.util.HashMap hashMap2 = fa1Var.SyNS6RMn;
                defpackage.xk0 xk0Var2 = fa1Var.cnag84Bm;
                this.oh6vYeIP = iArr;
                this.r1MBDhnF = objArr2;
                this.F7NU4MC0GW = fa1Var.DFo87pBq1E5;
                this.AARZUJiTa = i3;
                this.EXtogiMhuM = (iArr.length / 5) - i3;
                this.ez2rX8ReCYw = i4;
                this.JlrlGoKF = objArr2.length - i4;
                this.DFo87pBq1E5 = i3;
                this.adDC3e2L = hashMap2;
                this.xiZrDbcSW0 = xk0Var2;
                fa1Var.adDC3e2L = iArr2;
                fa1Var.xiZrDbcSW0 = 0;
                fa1Var.AARZUJiTa = objArr;
                fa1Var.EXtogiMhuM = 0;
                fa1Var.DFo87pBq1E5 = arrayList;
                fa1Var.SyNS6RMn = hashMap;
                fa1Var.cnag84Bm = xk0Var;
                return;
            }
        }
        defpackage.ia1 adDC3e2L = fa1Var.adDC3e2L();
        try {
            defpackage.a70.V7bD7b8KA(adDC3e2L, i, this, true, true, false);
            adDC3e2L.adDC3e2L(true);
        } catch (java.lang.Throwable th) {
            adDC3e2L.adDC3e2L(false);
            throw th;
        }
    }

    public final int D2vUnMij(int[] iArr, int i) {
        int i2 = iArr[(kd6TUFXn(i) * 5) + 2];
        return i2 > -2 ? i2 : (QoRHpC4k() + i2) - (-2);
    }

    public final void DFo87pBq1E5(int i, int i2, int i3) {
        if (i >= this.AARZUJiTa) {
            i = -((QoRHpC4k() - i) + 2);
        }
        while (i3 < i2) {
            this.oh6vYeIP[(kd6TUFXn(i3) * 5) + 2] = i;
            int i4 = this.oh6vYeIP[(kd6TUFXn(i3) * 5) + 3] + i3;
            DFo87pBq1E5(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public final int EXtogiMhuM(int i) {
        return (this.JlrlGoKF * (i < this.ez2rX8ReCYw ? 0 : 1)) + i;
    }

    public final int EgCjBq0SZwJ(int i) {
        return this.oh6vYeIP[kd6TUFXn(i) * 5];
    }

    public final void EoOhNTTfIN7K(int i, java.lang.Object obj) {
        int kd6TUFXn = kd6TUFXn(i);
        int[] iArr = this.oh6vYeIP;
        if (kd6TUFXn >= iArr.length || (iArr[(kd6TUFXn * 5) + 1] & 1073741824) == 0) {
            defpackage.dh.IHQe1A4L2xu("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.r1MBDhnF[EXtogiMhuM(AARZUJiTa(this.oh6vYeIP, kd6TUFXn))] = obj;
    }

    public final void F7NU4MC0GW() {
        int i = this.SyNS6RMn;
        this.SyNS6RMn = i + 1;
        if (i == 0) {
            this.G3OKOH3wZRC.r1MBDhnF((cnag84Bm() - this.EXtogiMhuM) - this.kNAkVymC);
        }
    }

    public final java.lang.Object G3OKOH3wZRC(int i) {
        int kd6TUFXn = kd6TUFXn(i);
        int[] iArr = this.oh6vYeIP;
        int i2 = (kd6TUFXn * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return defpackage.bh.IHQe1A4L2xu;
        }
        return this.r1MBDhnF[java.lang.Integer.bitCount(iArr[i2] >> 29) + AARZUJiTa(iArr, kd6TUFXn)];
    }

    public final void IHQe1A4L2xu(int i) {
        if (i < 0) {
            defpackage.dh.IHQe1A4L2xu("Cannot seek backwards");
        }
        if (this.SyNS6RMn > 0) {
            defpackage.nw0.oh6vYeIP("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.fnWB2E7cs + i;
        if (i2 < this.V7bD7b8KA || i2 > this.kNAkVymC) {
            defpackage.dh.IHQe1A4L2xu("Cannot seek outside the current group (" + this.V7bD7b8KA + '-' + this.kNAkVymC + ')');
        }
        this.fnWB2E7cs = i2;
        int AARZUJiTa = AARZUJiTa(this.oh6vYeIP, kd6TUFXn(i2));
        this.riuEU0zW4 = AARZUJiTa;
        this.SH1y5HwkJhh = AARZUJiTa;
    }

    public final void JlrlGoKF(int i) {
        boolean z = false;
        if (!(this.SyNS6RMn <= 0)) {
            defpackage.dh.IHQe1A4L2xu("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.V7bD7b8KA;
        if (i2 != i) {
            if (i >= i2 && i < this.kNAkVymC) {
                z = true;
            }
            if (!z) {
                defpackage.dh.IHQe1A4L2xu("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.fnWB2E7cs;
            int i4 = this.riuEU0zW4;
            int i5 = this.SH1y5HwkJhh;
            this.fnWB2E7cs = i;
            hkbnNdmy();
            this.fnWB2E7cs = i3;
            this.riuEU0zW4 = i4;
            this.SH1y5HwkJhh = i5;
        }
    }

    public final boolean NHJTzaLwkd(int i) {
        return (this.oh6vYeIP[(kd6TUFXn(i) * 5) + 1] & 1073741824) != 0;
    }

    public final void PAEGRtP0bX(int i) {
        if (i > 0) {
            int i2 = this.fnWB2E7cs;
            UsuH8pd5P(i2);
            int i3 = this.AARZUJiTa;
            int i4 = this.EXtogiMhuM;
            int[] iArr = this.oh6vYeIP;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int max = java.lang.Math.max(java.lang.Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i6 = max - i5;
                defpackage.t6.Ye0N2xE9Hc(iArr, iArr2, 0, 0, i3 * 5);
                defpackage.t6.Ye0N2xE9Hc(iArr, iArr2, (i3 + i6) * 5, (i4 + i3) * 5, length * 5);
                this.oh6vYeIP = iArr2;
                i4 = i6;
            }
            int i7 = this.kNAkVymC;
            if (i7 >= i3) {
                this.kNAkVymC = i7 + i;
            }
            int i8 = i3 + i;
            this.AARZUJiTa = i8;
            this.EXtogiMhuM = i4 - i;
            int riuEU0zW4 = riuEU0zW4(i5 > 0 ? xiZrDbcSW0(i2 + i) : 0, this.DFo87pBq1E5 >= i3 ? this.ez2rX8ReCYw : 0, this.JlrlGoKF, this.r1MBDhnF.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.oh6vYeIP[(i9 * 5) + 4] = riuEU0zW4;
            }
            int i10 = this.DFo87pBq1E5;
            if (i10 >= i3) {
                this.DFo87pBq1E5 = i10 + i;
            }
        }
    }

    public final void QPwENk36pDC(java.lang.Object obj) {
        int kd6TUFXn = kd6TUFXn(this.fnWB2E7cs);
        int i = (kd6TUFXn * 5) + 1;
        if ((this.oh6vYeIP[i] & 268435456) == 0) {
            defpackage.dh.IHQe1A4L2xu("Updating the data of a group that was not created with a data slot");
        }
        java.lang.Object[] objArr = this.r1MBDhnF;
        int[] iArr = this.oh6vYeIP;
        objArr[EXtogiMhuM(java.lang.Integer.bitCount(iArr[i] >> 29) + AARZUJiTa(iArr, kd6TUFXn))] = obj;
    }

    public final int QoRHpC4k() {
        return cnag84Bm() - this.EXtogiMhuM;
    }

    public final void SH1y5HwkJhh() {
        defpackage.gl0 gl0Var;
        boolean z = this.SyNS6RMn > 0;
        int i = this.fnWB2E7cs;
        int i2 = this.kNAkVymC;
        int i3 = this.V7bD7b8KA;
        int kd6TUFXn = kd6TUFXn(i3);
        int i4 = this.cnag84Bm;
        int i5 = i - i3;
        int i6 = kd6TUFXn * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.oh6vYeIP[i7] & 1073741824) != 0;
        defpackage.k70 k70Var = this.kd6TUFXn;
        if (z) {
            defpackage.xk0 xk0Var = this.EgCjBq0SZwJ;
            if (xk0Var != null && (gl0Var = (defpackage.gl0) xk0Var.oh6vYeIP(i3)) != null) {
                java.lang.Object[] objArr = gl0Var.IHQe1A4L2xu;
                int i8 = gl0Var.oh6vYeIP;
                for (int i9 = 0; i9 < i8; i9++) {
                    frpfPPIgqM9O(objArr[i9]);
                }
            }
            int[] iArr = this.oh6vYeIP;
            iArr[i6 + 3] = i5;
            defpackage.ha1.r1MBDhnF(iArr, kd6TUFXn, i4);
            int oh6vYeIP = k70Var.oh6vYeIP();
            if (z2) {
                i4 = 1;
            }
            this.cnag84Bm = oh6vYeIP + i4;
            int D2vUnMij = D2vUnMij(this.oh6vYeIP, i3);
            this.V7bD7b8KA = D2vUnMij;
            int QoRHpC4k = D2vUnMij < 0 ? QoRHpC4k() : kd6TUFXn(D2vUnMij + 1);
            int AARZUJiTa = QoRHpC4k >= 0 ? AARZUJiTa(this.oh6vYeIP, QoRHpC4k) : 0;
            this.riuEU0zW4 = AARZUJiTa;
            this.SH1y5HwkJhh = AARZUJiTa;
            return;
        }
        if (i != i2) {
            defpackage.dh.IHQe1A4L2xu("Expected to be at the end of a group");
        }
        int[] iArr2 = this.oh6vYeIP;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        defpackage.ha1.r1MBDhnF(iArr2, kd6TUFXn, i4);
        int oh6vYeIP2 = this.QoRHpC4k.oh6vYeIP();
        this.kNAkVymC = (cnag84Bm() - this.EXtogiMhuM) - this.G3OKOH3wZRC.oh6vYeIP();
        this.V7bD7b8KA = oh6vYeIP2;
        int D2vUnMij2 = D2vUnMij(this.oh6vYeIP, i3);
        int oh6vYeIP3 = k70Var.oh6vYeIP();
        this.cnag84Bm = oh6vYeIP3;
        if (D2vUnMij2 == oh6vYeIP2) {
            this.cnag84Bm = oh6vYeIP3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (D2vUnMij2 != 0 && D2vUnMij2 != oh6vYeIP2 && (i14 != 0 || i13 != 0)) {
                int kd6TUFXn2 = kd6TUFXn(D2vUnMij2);
                if (i13 != 0) {
                    int[] iArr3 = this.oh6vYeIP;
                    int i15 = (kd6TUFXn2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.oh6vYeIP;
                    defpackage.ha1.r1MBDhnF(iArr4, kd6TUFXn2, (iArr4[(kd6TUFXn2 * 5) + 1] & 67108863) + i14);
                }
                int[] iArr5 = this.oh6vYeIP;
                if ((iArr5[(kd6TUFXn2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                D2vUnMij2 = D2vUnMij(iArr5, D2vUnMij2);
            }
        }
        this.cnag84Bm += i14;
    }

    public final void SiPhmbmu() {
        int i;
        defpackage.wk0 wk0Var = this.abhbClRa;
        if (wk0Var != null) {
            while (wk0Var.oh6vYeIP != 0) {
                int D2vUnMij = defpackage.j70.D2vUnMij(wk0Var);
                int kd6TUFXn = kd6TUFXn(D2vUnMij);
                int i2 = D2vUnMij + 1;
                int kNAkVymC = kNAkVymC(D2vUnMij) + D2vUnMij;
                while (true) {
                    if (i2 >= kNAkVymC) {
                        i = 0;
                        break;
                    } else {
                        if ((this.oh6vYeIP[(kd6TUFXn(i2) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        i2 += kNAkVymC(i2);
                    }
                }
                int[] iArr = this.oh6vYeIP;
                int i3 = (kd6TUFXn * 5) + 1;
                int i4 = iArr[i3];
                if (((67108864 & i4) != 0 ? 1 : 0) != i) {
                    iArr[i3] = (i << 26) | ((-67108865) & i4);
                    int D2vUnMij2 = D2vUnMij(iArr, D2vUnMij);
                    if (D2vUnMij2 >= 0) {
                        defpackage.j70.AARZUJiTa(wk0Var, D2vUnMij2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x012d, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void SyNS6RMn(int i, defpackage.k00 k00Var) {
        int i2;
        int i3;
        int i4;
        defpackage.k00 k00Var2 = k00Var;
        int D2vUnMij = D2vUnMij(this.oh6vYeIP, i);
        int QoRHpC4k = QoRHpC4k();
        int kNAkVymC = kNAkVymC(i) + i;
        int i5 = i;
        defpackage.yk0 yk0Var = null;
        defpackage.wk0 wk0Var = null;
        loop0: while (i5 < kNAkVymC) {
            int xiZrDbcSW0 = xiZrDbcSW0(i5);
            int i6 = i5 + 1;
            int xiZrDbcSW02 = xiZrDbcSW0(i6);
            while (xiZrDbcSW0 < xiZrDbcSW02) {
                java.lang.Object obj = this.r1MBDhnF[EXtogiMhuM(xiZrDbcSW0)];
                if (obj instanceof defpackage.x10) {
                    defpackage.x10 x10Var = (defpackage.x10) obj;
                    if (!(x10Var instanceof defpackage.x10)) {
                        x10Var = null;
                    }
                    if (x10Var == null) {
                        defpackage.dh.oh6vYeIP("Inconsistent composition");
                        throw new defpackage.cf();
                    }
                    int i7 = x10Var.oh6vYeIP;
                    if (i7 >= 0) {
                        int kNAkVymC2 = kNAkVymC(i5) + i5;
                        int i8 = i6;
                        int i9 = 0;
                        while (i8 < kNAkVymC2 && i9 < i7) {
                            int kd6TUFXn = kd6TUFXn(i8);
                            int i10 = D2vUnMij;
                            int[] iArr = this.oh6vYeIP;
                            int i11 = kd6TUFXn * 5;
                            i8 = iArr[i11 + 3] + i8;
                            if (i8 < kNAkVymC2 && (iArr[i11 + 1] & 536870912) == 0) {
                                i9++;
                            }
                            D2vUnMij = i10;
                        }
                        i4 = D2vUnMij;
                        if (yk0Var == null) {
                            int[] iArr2 = defpackage.h70.IHQe1A4L2xu;
                            yk0Var = new defpackage.yk0();
                        }
                        if (wk0Var == null) {
                            wk0Var = new defpackage.wk0();
                        }
                        yk0Var.IHQe1A4L2xu(i8);
                        wk0Var.IHQe1A4L2xu(i8);
                        wk0Var.IHQe1A4L2xu(xiZrDbcSW0);
                        xiZrDbcSW0++;
                        D2vUnMij = i4;
                    }
                }
                i4 = D2vUnMij;
                k00Var2.adDC3e2L(java.lang.Integer.valueOf(xiZrDbcSW0), obj);
                xiZrDbcSW0++;
                D2vUnMij = i4;
            }
            int i12 = D2vUnMij;
            D2vUnMij = i6 < QoRHpC4k ? D2vUnMij(this.oh6vYeIP, i6) : -1;
            if (D2vUnMij != i5) {
                int i13 = i12;
                while (true) {
                    if (wk0Var == null || yk0Var == null || !yk0Var.adDC3e2L(i5)) {
                        i2 = QoRHpC4k;
                    } else {
                        int i14 = wk0Var.oh6vYeIP;
                        int i15 = i14 / 2;
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < i15) {
                            int i18 = i16 * 2;
                            int i19 = QoRHpC4k;
                            int oh6vYeIP = wk0Var.oh6vYeIP(i18);
                            if (oh6vYeIP == i5) {
                                int oh6vYeIP2 = wk0Var.oh6vYeIP(i18 + 1);
                                k00Var2.adDC3e2L(java.lang.Integer.valueOf(oh6vYeIP2), this.r1MBDhnF[EXtogiMhuM(oh6vYeIP2)]);
                            } else if (i18 != i17) {
                                int i20 = i17 + 1;
                                wk0Var.adDC3e2L(i17, oh6vYeIP);
                                i17 += 2;
                                wk0Var.adDC3e2L(i20, wk0Var.oh6vYeIP(i18 + 1));
                            } else {
                                i17 += 2;
                            }
                            i16++;
                            k00Var2 = k00Var;
                            QoRHpC4k = i19;
                        }
                        i2 = QoRHpC4k;
                        if (i17 != i14) {
                            if (i17 < 0 || i17 > (i3 = wk0Var.oh6vYeIP) || i14 < 0 || i14 > i3) {
                                break loop0;
                            }
                            if (i14 < i17) {
                                defpackage.db.fnWB2E7cs("The end index must be < start index");
                                return;
                            } else if (i14 != i17) {
                                if (i14 < i3) {
                                    int[] iArr3 = wk0Var.IHQe1A4L2xu;
                                    defpackage.t6.Ye0N2xE9Hc(iArr3, iArr3, i17, i14, i3);
                                }
                                wk0Var.oh6vYeIP -= i14 - i17;
                            }
                        }
                    }
                    if (i5 != i && i13 != D2vUnMij) {
                        i5 = i13;
                        QoRHpC4k = i2;
                        i13 = D2vUnMij(this.oh6vYeIP, i13);
                        k00Var2 = k00Var;
                    }
                }
            } else {
                i2 = QoRHpC4k;
            }
            k00Var2 = k00Var;
            i5 = i6;
            QoRHpC4k = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void TFRaUu83X3E(int i, java.lang.Object obj, boolean z, java.lang.Object obj2) {
        int i2;
        int i3 = this.V7bD7b8KA;
        java.lang.Object[] objArr = this.SyNS6RMn > 0;
        this.kd6TUFXn.r1MBDhnF(this.cnag84Bm);
        defpackage.ad1 ad1Var = defpackage.bh.IHQe1A4L2xu;
        if (objArr == true) {
            int i4 = this.fnWB2E7cs;
            int AARZUJiTa = AARZUJiTa(this.oh6vYeIP, kd6TUFXn(i4));
            PAEGRtP0bX(1);
            this.riuEU0zW4 = AARZUJiTa;
            this.SH1y5HwkJhh = AARZUJiTa;
            int kd6TUFXn = kd6TUFXn(i4);
            int i5 = obj != ad1Var ? 1 : 0;
            int i6 = (z || obj2 == ad1Var) ? 0 : 1;
            int riuEU0zW4 = riuEU0zW4(AARZUJiTa, this.ez2rX8ReCYw, this.JlrlGoKF, this.r1MBDhnF.length);
            if (riuEU0zW4 >= 0 && this.DFo87pBq1E5 < i4) {
                riuEU0zW4 = -(((this.r1MBDhnF.length - this.JlrlGoKF) - riuEU0zW4) + 1);
            }
            int[] iArr = this.oh6vYeIP;
            int i7 = this.V7bD7b8KA;
            int i8 = kd6TUFXn * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = riuEU0zW4;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                abhbClRa(i9, i4);
                java.lang.Object[] objArr2 = this.r1MBDhnF;
                int i10 = this.riuEU0zW4;
                if (z) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr2[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                this.riuEU0zW4 = i10;
            }
            this.cnag84Bm = 0;
            i2 = i4 + 1;
            this.V7bD7b8KA = i4;
            this.fnWB2E7cs = i2;
            if (i3 >= 0) {
                lpprD5VAS(i3);
            }
        } else {
            this.QoRHpC4k.r1MBDhnF(i3);
            this.G3OKOH3wZRC.r1MBDhnF((cnag84Bm() - this.EXtogiMhuM) - this.kNAkVymC);
            int i11 = this.fnWB2E7cs;
            int kd6TUFXn2 = kd6TUFXn(i11);
            if (!defpackage.x70.QoRHpC4k(obj2, ad1Var)) {
                if (z) {
                    EoOhNTTfIN7K(this.fnWB2E7cs, obj2);
                } else {
                    QPwENk36pDC(obj2);
                }
            }
            this.riuEU0zW4 = Uv8CGu3G(this.oh6vYeIP, kd6TUFXn2);
            this.SH1y5HwkJhh = AARZUJiTa(this.oh6vYeIP, kd6TUFXn(this.fnWB2E7cs + 1));
            int[] iArr2 = this.oh6vYeIP;
            int i12 = kd6TUFXn2 * 5;
            this.cnag84Bm = iArr2[i12 + 1] & 67108863;
            this.V7bD7b8KA = i11;
            this.fnWB2E7cs = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.kNAkVymC = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r2 = r8.oh6vYeIP;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        defpackage.t6.Ye0N2xE9Hc(r2, r2, r4 + r3, r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        defpackage.t6.Ye0N2xE9Hc(r2, r2, r5, r5 + r4, r3 + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void UsuH8pd5P(int i) {
        defpackage.o10 o10Var;
        int i2;
        defpackage.o10 o10Var2;
        int i3;
        int i4;
        int i5 = this.EXtogiMhuM;
        int i6 = this.AARZUJiTa;
        if (i6 != i) {
            if (!this.F7NU4MC0GW.isEmpty()) {
                int cnag84Bm = cnag84Bm() - this.EXtogiMhuM;
                java.util.ArrayList arrayList = this.F7NU4MC0GW;
                if (i6 < i) {
                    for (int IHQe1A4L2xu = defpackage.ha1.IHQe1A4L2xu(arrayList, i6, cnag84Bm); IHQe1A4L2xu < this.F7NU4MC0GW.size() && (i3 = (o10Var2 = (defpackage.o10) this.F7NU4MC0GW.get(IHQe1A4L2xu)).IHQe1A4L2xu) < 0 && (i4 = i3 + cnag84Bm) < i; IHQe1A4L2xu++) {
                        o10Var2.IHQe1A4L2xu = i4;
                    }
                } else {
                    for (int IHQe1A4L2xu2 = defpackage.ha1.IHQe1A4L2xu(arrayList, i, cnag84Bm); IHQe1A4L2xu2 < this.F7NU4MC0GW.size() && (i2 = (o10Var = (defpackage.o10) this.F7NU4MC0GW.get(IHQe1A4L2xu2)).IHQe1A4L2xu) >= 0; IHQe1A4L2xu2++) {
                        o10Var.IHQe1A4L2xu = -(cnag84Bm - i2);
                    }
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int cnag84Bm2 = cnag84Bm();
            if (i6 >= cnag84Bm2) {
                defpackage.dh.IHQe1A4L2xu("Check failed");
            }
            while (i6 < cnag84Bm2) {
                int i7 = (i6 * 5) + 2;
                int i8 = this.oh6vYeIP[i7];
                int QoRHpC4k = i8 > -2 ? i8 : (QoRHpC4k() + i8) - (-2);
                if (QoRHpC4k >= i) {
                    QoRHpC4k = -((QoRHpC4k() - QoRHpC4k) - (-2));
                }
                if (QoRHpC4k != i8) {
                    this.oh6vYeIP[i7] = QoRHpC4k;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.AARZUJiTa = i;
    }

    public final int Uv8CGu3G(int[] iArr, int i) {
        if (i >= cnag84Bm()) {
            return this.r1MBDhnF.length - this.JlrlGoKF;
        }
        int oh6vYeIP = defpackage.ha1.oh6vYeIP(iArr, i);
        return oh6vYeIP < 0 ? (this.r1MBDhnF.length - this.JlrlGoKF) + oh6vYeIP + 1 : oh6vYeIP;
    }

    public final boolean V7bD7b8KA(int i, int i2) {
        int cnag84Bm;
        int kNAkVymC;
        if (i2 == this.V7bD7b8KA) {
            cnag84Bm = this.kNAkVymC;
        } else {
            defpackage.k70 k70Var = this.QoRHpC4k;
            if (i2 > k70Var.IHQe1A4L2xu(0)) {
                kNAkVymC = kNAkVymC(i2);
            } else {
                int[] iArr = k70Var.IHQe1A4L2xu;
                int min = java.lang.Math.min(iArr.length, k70Var.oh6vYeIP);
                int i3 = 0;
                while (true) {
                    if (i3 >= min) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    kNAkVymC = kNAkVymC(i2);
                } else {
                    cnag84Bm = (cnag84Bm() - this.EXtogiMhuM) - this.G3OKOH3wZRC.IHQe1A4L2xu[i3];
                }
            }
            cnag84Bm = kNAkVymC + i2;
        }
        return i > i2 && i < cnag84Bm;
    }

    public final defpackage.o10 WLpAkxCo(int i) {
        java.util.ArrayList arrayList;
        int adDC3e2L;
        if (i < 0 || i >= QoRHpC4k() || (adDC3e2L = defpackage.ha1.adDC3e2L((arrayList = this.F7NU4MC0GW), i, QoRHpC4k())) < 0) {
            return null;
        }
        return (defpackage.o10) arrayList.get(adDC3e2L);
    }

    public final java.lang.Object XZx205DYe(int i, int i2, java.lang.Object obj) {
        int Uv8CGu3G = Uv8CGu3G(this.oh6vYeIP, kd6TUFXn(i));
        int AARZUJiTa = AARZUJiTa(this.oh6vYeIP, kd6TUFXn(i + 1));
        int i3 = Uv8CGu3G + i2;
        if (i3 < Uv8CGu3G || i3 >= AARZUJiTa) {
            defpackage.dh.IHQe1A4L2xu("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int EXtogiMhuM = EXtogiMhuM(i3);
        java.lang.Object[] objArr = this.r1MBDhnF;
        java.lang.Object obj2 = objArr[EXtogiMhuM];
        objArr[EXtogiMhuM] = obj;
        return obj2;
    }

    public final void Ye0N2xE9Hc(int i) {
        if (i >= 0) {
            defpackage.wk0 wk0Var = this.abhbClRa;
            if (wk0Var == null) {
                wk0Var = new defpackage.wk0();
                this.abhbClRa = wk0Var;
            }
            defpackage.j70.AARZUJiTa(wk0Var, i);
        }
    }

    public final void abhbClRa(int i, int i2) {
        if (i > 0) {
            nBH8hAHy(this.riuEU0zW4, i2);
            int i3 = this.ez2rX8ReCYw;
            int i4 = this.JlrlGoKF;
            if (i4 < i) {
                java.lang.Object[] objArr = this.r1MBDhnF;
                int length = objArr.length;
                int i5 = length - i4;
                int max = java.lang.Math.max(java.lang.Math.max(length * 2, i5 + i), 32);
                java.lang.Object[] objArr2 = new java.lang.Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                java.lang.System.arraycopy(objArr, 0, objArr2, 0, i3);
                java.lang.System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.r1MBDhnF = objArr2;
                i4 = i7;
            }
            int i9 = this.SH1y5HwkJhh;
            if (i9 >= i3) {
                this.SH1y5HwkJhh = i9 + i;
            }
            this.ez2rX8ReCYw = i3 + i;
            this.JlrlGoKF = i4 - i;
        }
    }

    public final void adDC3e2L(boolean z) {
        this.PAEGRtP0bX = true;
        if (z && this.QoRHpC4k.oh6vYeIP == 0) {
            UsuH8pd5P(QoRHpC4k());
            nBH8hAHy(this.r1MBDhnF.length - this.JlrlGoKF, this.AARZUJiTa);
            int i = this.ez2rX8ReCYw;
            java.util.Arrays.fill(this.r1MBDhnF, i, this.JlrlGoKF + i, (java.lang.Object) null);
            SiPhmbmu();
        }
        int[] iArr = this.oh6vYeIP;
        int i2 = this.AARZUJiTa;
        java.lang.Object[] objArr = this.r1MBDhnF;
        int i3 = this.ez2rX8ReCYw;
        java.util.ArrayList arrayList = this.F7NU4MC0GW;
        java.util.HashMap hashMap = this.adDC3e2L;
        defpackage.xk0 xk0Var = this.xiZrDbcSW0;
        defpackage.fa1 fa1Var = this.IHQe1A4L2xu;
        if (!fa1Var.ez2rX8ReCYw) {
            defpackage.nw0.IHQe1A4L2xu("Unexpected writer close()");
        }
        fa1Var.ez2rX8ReCYw = false;
        fa1Var.adDC3e2L = iArr;
        fa1Var.xiZrDbcSW0 = i2;
        fa1Var.AARZUJiTa = objArr;
        fa1Var.EXtogiMhuM = i3;
        fa1Var.DFo87pBq1E5 = arrayList;
        fa1Var.SyNS6RMn = hashMap;
        fa1Var.cnag84Bm = xk0Var;
    }

    public final int cnag84Bm() {
        return this.oh6vYeIP.length / 5;
    }

    public final void ez2rX8ReCYw() {
        if (this.SyNS6RMn <= 0) {
            defpackage.nw0.oh6vYeIP("Unbalanced begin/end insert");
        }
        int i = this.SyNS6RMn - 1;
        this.SyNS6RMn = i;
        if (i == 0) {
            if (this.kd6TUFXn.oh6vYeIP != this.QoRHpC4k.oh6vYeIP) {
                defpackage.dh.IHQe1A4L2xu("startGroup/endGroup mismatch while inserting");
            }
            this.kNAkVymC = (cnag84Bm() - this.EXtogiMhuM) - this.G3OKOH3wZRC.oh6vYeIP();
        }
    }

    public final java.lang.Object fnWB2E7cs(int i) {
        int kd6TUFXn = kd6TUFXn(i);
        int[] iArr = this.oh6vYeIP;
        int i2 = kd6TUFXn * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.r1MBDhnF[java.lang.Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final java.lang.Object frpfPPIgqM9O(java.lang.Object obj) {
        if (this.SyNS6RMn > 0) {
            abhbClRa(1, this.V7bD7b8KA);
        }
        java.lang.Object[] objArr = this.r1MBDhnF;
        int i = this.riuEU0zW4;
        this.riuEU0zW4 = i + 1;
        java.lang.Object obj2 = objArr[EXtogiMhuM(i)];
        if (this.riuEU0zW4 > this.SH1y5HwkJhh) {
            defpackage.dh.IHQe1A4L2xu("Writing to an invalid slot");
        }
        this.r1MBDhnF[EXtogiMhuM(this.riuEU0zW4 - 1)] = obj;
        return obj2;
    }

    public final void hkbnNdmy() {
        if (this.SyNS6RMn != 0) {
            defpackage.dh.IHQe1A4L2xu("Key must be supplied when inserting");
        }
        defpackage.ad1 ad1Var = defpackage.bh.IHQe1A4L2xu;
        TFRaUu83X3E(0, ad1Var, false, ad1Var);
    }

    public final void hyxIchWRW() {
        int i = this.kNAkVymC;
        this.fnWB2E7cs = i;
        this.riuEU0zW4 = AARZUJiTa(this.oh6vYeIP, kd6TUFXn(i));
    }

    public final int kNAkVymC(int i) {
        return this.oh6vYeIP[(kd6TUFXn(i) * 5) + 3];
    }

    public final int kd6TUFXn(int i) {
        return (this.EXtogiMhuM * (i < this.AARZUJiTa ? 0 : 1)) + i;
    }

    public final defpackage.v10 lpprD5VAS(int i) {
        defpackage.o10 WLpAkxCo;
        java.util.HashMap hashMap = this.adDC3e2L;
        if (hashMap == null || (WLpAkxCo = WLpAkxCo(i)) == null) {
            return null;
        }
        return (defpackage.v10) hashMap.get(WLpAkxCo);
    }

    public final int mAr5m2L7gYDP() {
        int kd6TUFXn = kd6TUFXn(this.fnWB2E7cs);
        int i = this.fnWB2E7cs;
        int[] iArr = this.oh6vYeIP;
        int i2 = kd6TUFXn * 5;
        int i3 = iArr[i2 + 3] + i;
        this.fnWB2E7cs = i3;
        this.riuEU0zW4 = AARZUJiTa(iArr, kd6TUFXn(i3));
        int i4 = this.oh6vYeIP[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void nBH8hAHy(int i, int i2) {
        int i3 = this.JlrlGoKF;
        int i4 = this.ez2rX8ReCYw;
        int i5 = this.DFo87pBq1E5;
        if (i4 != i) {
            java.lang.Object[] objArr = this.r1MBDhnF;
            if (i < i4) {
                java.lang.System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                java.lang.System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int min = java.lang.Math.min(i2 + 1, QoRHpC4k());
        if (i5 != min) {
            int length = this.r1MBDhnF.length - i3;
            if (min < i5) {
                int kd6TUFXn = kd6TUFXn(min);
                int kd6TUFXn2 = kd6TUFXn(i5);
                int i7 = this.AARZUJiTa;
                while (kd6TUFXn < kd6TUFXn2) {
                    int i8 = (kd6TUFXn * 5) + 4;
                    int i9 = this.oh6vYeIP[i8];
                    if (i9 < 0) {
                        defpackage.dh.IHQe1A4L2xu("Unexpected anchor value, expected a positive anchor");
                    }
                    this.oh6vYeIP[i8] = -((length - i9) + 1);
                    kd6TUFXn++;
                    if (kd6TUFXn == i7) {
                        kd6TUFXn += this.EXtogiMhuM;
                    }
                }
            } else {
                int kd6TUFXn3 = kd6TUFXn(i5);
                int kd6TUFXn4 = kd6TUFXn(min);
                while (kd6TUFXn3 < kd6TUFXn4) {
                    int i10 = (kd6TUFXn3 * 5) + 4;
                    int i11 = this.oh6vYeIP[i10];
                    if (i11 >= 0) {
                        defpackage.dh.IHQe1A4L2xu("Unexpected anchor value, expected a negative anchor");
                    }
                    this.oh6vYeIP[i10] = i11 + length + 1;
                    kd6TUFXn3++;
                    if (kd6TUFXn3 == this.AARZUJiTa) {
                        kd6TUFXn3 += this.EXtogiMhuM;
                    }
                }
            }
            this.DFo87pBq1E5 = min;
        }
        this.ez2rX8ReCYw = i;
    }

    public final defpackage.o10 oh6vYeIP(int i) {
        java.util.ArrayList arrayList = this.F7NU4MC0GW;
        int adDC3e2L = defpackage.ha1.adDC3e2L(arrayList, i, QoRHpC4k());
        if (adDC3e2L >= 0) {
            return (defpackage.o10) arrayList.get(adDC3e2L);
        }
        if (i > this.AARZUJiTa) {
            i = -(QoRHpC4k() - i);
        }
        defpackage.o10 o10Var = new defpackage.o10(i);
        arrayList.add(-(adDC3e2L + 1), o10Var);
        return o10Var;
    }

    public final boolean p4kuH6PDtgom() {
        if (this.SyNS6RMn != 0) {
            defpackage.dh.IHQe1A4L2xu("Cannot remove group while inserting");
        }
        int i = this.fnWB2E7cs;
        int i2 = this.riuEU0zW4;
        int AARZUJiTa = AARZUJiTa(this.oh6vYeIP, kd6TUFXn(i));
        int mAr5m2L7gYDP = mAr5m2L7gYDP();
        lpprD5VAS(this.V7bD7b8KA);
        defpackage.wk0 wk0Var = this.abhbClRa;
        if (wk0Var != null) {
            while (true) {
                int i3 = wk0Var.oh6vYeIP;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    throw new java.util.NoSuchElementException("IntList is empty.");
                }
                if (wk0Var.IHQe1A4L2xu[0] < i) {
                    break;
                }
                defpackage.j70.D2vUnMij(wk0Var);
            }
        }
        boolean yIx6ChFVk = yIx6ChFVk(i, this.fnWB2E7cs - i);
        wll2JLbTBC2(AARZUJiTa, this.riuEU0zW4 - AARZUJiTa, i - 1);
        this.fnWB2E7cs = i;
        this.riuEU0zW4 = i2;
        this.cnag84Bm -= mAr5m2L7gYDP;
        return yIx6ChFVk;
    }

    public final int r1MBDhnF(defpackage.o10 o10Var) {
        int i = o10Var.IHQe1A4L2xu;
        return i < 0 ? QoRHpC4k() + i : i;
    }

    public final java.lang.String toString() {
        return "SlotWriter(current = " + this.fnWB2E7cs + " end=" + this.kNAkVymC + " size = " + QoRHpC4k() + " gap=" + this.AARZUJiTa + '-' + (this.AARZUJiTa + this.EXtogiMhuM) + ')';
    }

    public final java.lang.Object v5iciZok(int i) {
        int kd6TUFXn = kd6TUFXn(i);
        int[] iArr = this.oh6vYeIP;
        if ((iArr[(kd6TUFXn * 5) + 1] & 1073741824) != 0) {
            return this.r1MBDhnF[EXtogiMhuM(AARZUJiTa(iArr, kd6TUFXn))];
        }
        return null;
    }

    public final void wll2JLbTBC2(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.JlrlGoKF;
            int i5 = i + i2;
            nBH8hAHy(i5, i3);
            this.ez2rX8ReCYw = i;
            this.JlrlGoKF = i4 + i2;
            java.util.Arrays.fill(this.r1MBDhnF, i, i5, (java.lang.Object) null);
            int i6 = this.SH1y5HwkJhh;
            if (i6 >= i) {
                this.SH1y5HwkJhh = i6 - i2;
            }
        }
    }

    public final int xiZrDbcSW0(int i) {
        return AARZUJiTa(this.oh6vYeIP, kd6TUFXn(i));
    }

    public final boolean yIx6ChFVk(int i, int i2) {
        if (i2 > 0) {
            java.util.ArrayList arrayList = this.F7NU4MC0GW;
            UsuH8pd5P(i);
            if (!arrayList.isEmpty()) {
                java.util.HashMap hashMap = this.adDC3e2L;
                int i3 = i + i2;
                int IHQe1A4L2xu = defpackage.ha1.IHQe1A4L2xu(this.F7NU4MC0GW, i3, cnag84Bm() - this.EXtogiMhuM);
                if (IHQe1A4L2xu >= this.F7NU4MC0GW.size()) {
                    IHQe1A4L2xu--;
                }
                int i4 = IHQe1A4L2xu + 1;
                int i5 = 0;
                while (IHQe1A4L2xu >= 0) {
                    defpackage.o10 o10Var = (defpackage.o10) this.F7NU4MC0GW.get(IHQe1A4L2xu);
                    int r1MBDhnF = r1MBDhnF(o10Var);
                    if (r1MBDhnF < i) {
                        break;
                    }
                    if (r1MBDhnF < i3) {
                        o10Var.IHQe1A4L2xu = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i5 == 0) {
                            i5 = IHQe1A4L2xu + 1;
                        }
                        i4 = IHQe1A4L2xu;
                    }
                    IHQe1A4L2xu--;
                }
                r0 = i4 < i5;
                if (r0) {
                    this.F7NU4MC0GW.subList(i4, i5).clear();
                }
            }
            this.AARZUJiTa = i;
            this.EXtogiMhuM += i2;
            int i6 = this.DFo87pBq1E5;
            if (i6 > i) {
                this.DFo87pBq1E5 = java.lang.Math.max(i, i6 - i2);
            }
            int i7 = this.kNAkVymC;
            if (i7 >= this.AARZUJiTa) {
                this.kNAkVymC = i7 - i2;
            }
            int i8 = this.V7bD7b8KA;
            if (i8 >= 0 && (this.oh6vYeIP[(kd6TUFXn(i8) * 5) + 1] & 67108864) != 0) {
                Ye0N2xE9Hc(i8);
            }
        }
        return r0;
    }
}
