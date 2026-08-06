package defpackage;

/* loaded from: classes.dex */
public final class yi1 {
    public static final defpackage.yi1 adDC3e2L = new defpackage.yi1(0, 0, new java.lang.Object[0], null);
    public java.lang.Object[] F7NU4MC0GW;
    public int IHQe1A4L2xu;
    public int oh6vYeIP;
    public final defpackage.ky r1MBDhnF;

    public yi1(int i, int i2, java.lang.Object[] objArr, defpackage.ky kyVar) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = i2;
        this.r1MBDhnF = kyVar;
        this.F7NU4MC0GW = objArr;
    }

    public static defpackage.yi1 SH1y5HwkJhh(int i, java.lang.Object obj, java.lang.Object obj2, int i2, java.lang.Object obj3, java.lang.Object obj4, int i3, defpackage.ky kyVar) {
        if (i3 > 30) {
            return new defpackage.yi1(0, 0, new java.lang.Object[]{obj, obj2, obj3, obj4}, kyVar);
        }
        int kNAkVymC = defpackage.j70.kNAkVymC(i, i3);
        int kNAkVymC2 = defpackage.j70.kNAkVymC(i2, i3);
        if (kNAkVymC != kNAkVymC2) {
            return new defpackage.yi1((1 << kNAkVymC) | (1 << kNAkVymC2), 0, kNAkVymC < kNAkVymC2 ? new java.lang.Object[]{obj, obj2, obj3, obj4} : new java.lang.Object[]{obj3, obj4, obj, obj2}, kyVar);
        }
        return new defpackage.yi1(0, 1 << kNAkVymC, new java.lang.Object[]{SH1y5HwkJhh(i, obj, obj2, i2, obj3, obj4, i3 + 5, kyVar)}, kyVar);
    }

    public final java.lang.Object AARZUJiTa(int i, int i2, java.lang.Object obj) {
        int kNAkVymC = 1 << defpackage.j70.kNAkVymC(i, i2);
        if (EXtogiMhuM(kNAkVymC)) {
            int xiZrDbcSW0 = xiZrDbcSW0(kNAkVymC);
            if (defpackage.x70.QoRHpC4k(obj, this.F7NU4MC0GW[xiZrDbcSW0])) {
                return abhbClRa(xiZrDbcSW0);
            }
            return null;
        }
        if (!riuEU0zW4(kNAkVymC)) {
            return null;
        }
        defpackage.yi1 EgCjBq0SZwJ = EgCjBq0SZwJ(fnWB2E7cs(kNAkVymC));
        if (i2 != 30) {
            return EgCjBq0SZwJ.AARZUJiTa(i, i2 + 5, obj);
        }
        defpackage.b70 Uv8CGu3G = defpackage.x80.Uv8CGu3G(defpackage.x80.QPwENk36pDC(0, EgCjBq0SZwJ.F7NU4MC0GW.length));
        int i3 = Uv8CGu3G.adDC3e2L;
        int i4 = Uv8CGu3G.xiZrDbcSW0;
        int i5 = Uv8CGu3G.AARZUJiTa;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!defpackage.x70.QoRHpC4k(obj, EgCjBq0SZwJ.F7NU4MC0GW[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return EgCjBq0SZwJ.abhbClRa(i3);
    }

    public final defpackage.yi1 DFo87pBq1E5(defpackage.yi1 yi1Var, int i, defpackage.pn pnVar, defpackage.fu0 fu0Var) {
        java.lang.Object[] objArr;
        defpackage.yi1 SH1y5HwkJhh;
        if (this == yi1Var) {
            pnVar.IHQe1A4L2xu += oh6vYeIP();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            defpackage.ky kyVar = fu0Var.adDC3e2L;
            int i3 = yi1Var.oh6vYeIP;
            java.lang.Object[] objArr2 = this.F7NU4MC0GW;
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, objArr2.length + yi1Var.F7NU4MC0GW.length);
            int length = this.F7NU4MC0GW.length;
            defpackage.b70 Uv8CGu3G = defpackage.x80.Uv8CGu3G(defpackage.x80.QPwENk36pDC(0, yi1Var.F7NU4MC0GW.length));
            int i4 = Uv8CGu3G.adDC3e2L;
            int i5 = Uv8CGu3G.xiZrDbcSW0;
            int i6 = Uv8CGu3G.AARZUJiTa;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (r1MBDhnF(yi1Var.F7NU4MC0GW[i4])) {
                        pnVar.IHQe1A4L2xu++;
                    } else {
                        java.lang.Object[] objArr3 = yi1Var.F7NU4MC0GW;
                        copyOf[length] = objArr3[i4];
                        copyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.F7NU4MC0GW.length) {
                return length == yi1Var.F7NU4MC0GW.length ? yi1Var : length == copyOf.length ? new defpackage.yi1(0, 0, copyOf, kyVar) : new defpackage.yi1(0, 0, java.util.Arrays.copyOf(copyOf, length), kyVar);
            }
        } else {
            int i7 = this.oh6vYeIP | yi1Var.oh6vYeIP;
            int i8 = this.IHQe1A4L2xu;
            int i9 = yi1Var.IHQe1A4L2xu;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int lowestOneBit = java.lang.Integer.lowestOneBit(i11);
                if (defpackage.x70.QoRHpC4k(this.F7NU4MC0GW[xiZrDbcSW0(lowestOneBit)], yi1Var.F7NU4MC0GW[yi1Var.xiZrDbcSW0(lowestOneBit)])) {
                    i12 |= lowestOneBit;
                } else {
                    i7 |= lowestOneBit;
                }
                i11 ^= lowestOneBit;
            }
            if ((i7 & i12) != 0) {
                defpackage.nw0.oh6vYeIP("Check failed.");
            }
            defpackage.yi1 yi1Var2 = (defpackage.x70.QoRHpC4k(this.r1MBDhnF, fu0Var.adDC3e2L) && this.IHQe1A4L2xu == i12 && this.oh6vYeIP == i7) ? this : new defpackage.yi1(i12, i7, new java.lang.Object[java.lang.Integer.bitCount(i7) + (java.lang.Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int lowestOneBit2 = java.lang.Integer.lowestOneBit(i13);
                java.lang.Object[] objArr4 = yi1Var2.F7NU4MC0GW;
                int length2 = (objArr4.length - 1) - i14;
                if (riuEU0zW4(lowestOneBit2)) {
                    SH1y5HwkJhh = EgCjBq0SZwJ(fnWB2E7cs(lowestOneBit2));
                    if (yi1Var.riuEU0zW4(lowestOneBit2)) {
                        SH1y5HwkJhh = SH1y5HwkJhh.DFo87pBq1E5(yi1Var.EgCjBq0SZwJ(yi1Var.fnWB2E7cs(lowestOneBit2)), i + 5, pnVar, fu0Var);
                        objArr = objArr4;
                    } else if (yi1Var.EXtogiMhuM(lowestOneBit2)) {
                        int xiZrDbcSW0 = yi1Var.xiZrDbcSW0(lowestOneBit2);
                        java.lang.Object obj = yi1Var.F7NU4MC0GW[xiZrDbcSW0];
                        java.lang.Object abhbClRa = yi1Var.abhbClRa(xiZrDbcSW0);
                        int i15 = fu0Var.riuEU0zW4;
                        objArr = objArr4;
                        SH1y5HwkJhh = SH1y5HwkJhh.JlrlGoKF(obj != null ? obj.hashCode() : i2, obj, abhbClRa, i + 5, fu0Var);
                        if (fu0Var.riuEU0zW4 == i15) {
                            pnVar.IHQe1A4L2xu++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (yi1Var.riuEU0zW4(lowestOneBit2)) {
                        defpackage.yi1 EgCjBq0SZwJ = yi1Var.EgCjBq0SZwJ(yi1Var.fnWB2E7cs(lowestOneBit2));
                        if (EXtogiMhuM(lowestOneBit2)) {
                            int xiZrDbcSW02 = xiZrDbcSW0(lowestOneBit2);
                            java.lang.Object obj2 = this.F7NU4MC0GW[xiZrDbcSW02];
                            int i16 = i + 5;
                            if (EgCjBq0SZwJ.F7NU4MC0GW(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                pnVar.IHQe1A4L2xu++;
                            } else {
                                SH1y5HwkJhh = EgCjBq0SZwJ.JlrlGoKF(obj2 != null ? obj2.hashCode() : 0, obj2, abhbClRa(xiZrDbcSW02), i16, fu0Var);
                            }
                        }
                        SH1y5HwkJhh = EgCjBq0SZwJ;
                    } else {
                        int xiZrDbcSW03 = xiZrDbcSW0(lowestOneBit2);
                        java.lang.Object obj3 = this.F7NU4MC0GW[xiZrDbcSW03];
                        java.lang.Object abhbClRa2 = abhbClRa(xiZrDbcSW03);
                        int xiZrDbcSW04 = yi1Var.xiZrDbcSW0(lowestOneBit2);
                        java.lang.Object obj4 = yi1Var.F7NU4MC0GW[xiZrDbcSW04];
                        SH1y5HwkJhh = SH1y5HwkJhh(obj3 != null ? obj3.hashCode() : 0, obj3, abhbClRa2, obj4 != null ? obj4.hashCode() : 0, obj4, yi1Var.abhbClRa(xiZrDbcSW04), i + 5, fu0Var.adDC3e2L);
                    }
                }
                objArr[length2] = SH1y5HwkJhh;
                i14++;
                i13 ^= lowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int lowestOneBit3 = java.lang.Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (yi1Var.EXtogiMhuM(lowestOneBit3)) {
                    int xiZrDbcSW05 = yi1Var.xiZrDbcSW0(lowestOneBit3);
                    java.lang.Object[] objArr5 = yi1Var2.F7NU4MC0GW;
                    objArr5[i18] = yi1Var.F7NU4MC0GW[xiZrDbcSW05];
                    objArr5[i18 + 1] = yi1Var.abhbClRa(xiZrDbcSW05);
                    if (EXtogiMhuM(lowestOneBit3)) {
                        pnVar.IHQe1A4L2xu++;
                    }
                } else {
                    int xiZrDbcSW06 = xiZrDbcSW0(lowestOneBit3);
                    java.lang.Object[] objArr6 = yi1Var2.F7NU4MC0GW;
                    objArr6[i18] = this.F7NU4MC0GW[xiZrDbcSW06];
                    objArr6[i18 + 1] = abhbClRa(xiZrDbcSW06);
                }
                i17++;
                i12 ^= lowestOneBit3;
            }
            if (!adDC3e2L(yi1Var2)) {
                return yi1Var.adDC3e2L(yi1Var2) ? yi1Var : yi1Var2;
            }
        }
        return this;
    }

    public final boolean EXtogiMhuM(int i) {
        return (this.IHQe1A4L2xu & i) != 0;
    }

    public final defpackage.yi1 EgCjBq0SZwJ(int i) {
        java.lang.Object obj = this.F7NU4MC0GW[i];
        obj.getClass();
        return (defpackage.yi1) obj;
    }

    public final boolean F7NU4MC0GW(int i, int i2, java.lang.Object obj) {
        int kNAkVymC = 1 << defpackage.j70.kNAkVymC(i, i2);
        if (EXtogiMhuM(kNAkVymC)) {
            return defpackage.x70.QoRHpC4k(obj, this.F7NU4MC0GW[xiZrDbcSW0(kNAkVymC)]);
        }
        if (!riuEU0zW4(kNAkVymC)) {
            return false;
        }
        defpackage.yi1 EgCjBq0SZwJ = EgCjBq0SZwJ(fnWB2E7cs(kNAkVymC));
        return i2 == 30 ? EgCjBq0SZwJ.r1MBDhnF(obj) : EgCjBq0SZwJ.F7NU4MC0GW(i, i2 + 5, obj);
    }

    public final defpackage.yi1 G3OKOH3wZRC(defpackage.yi1 yi1Var, defpackage.yi1 yi1Var2, int i, int i2, defpackage.ky kyVar) {
        defpackage.ky kyVar2 = this.r1MBDhnF;
        if (yi1Var2 != null) {
            return (kyVar2 == kyVar || yi1Var != yi1Var2) ? kd6TUFXn(i, yi1Var2, kyVar) : this;
        }
        java.lang.Object[] objArr = this.F7NU4MC0GW;
        if (objArr.length == 1) {
            return null;
        }
        if (kyVar2 != kyVar) {
            return new defpackage.yi1(this.IHQe1A4L2xu, this.oh6vYeIP ^ i2, defpackage.j70.xiZrDbcSW0(i, objArr), kyVar);
        }
        this.F7NU4MC0GW = defpackage.j70.xiZrDbcSW0(i, objArr);
        this.oh6vYeIP ^= i2;
        return this;
    }

    public final java.lang.Object[] IHQe1A4L2xu(int i, int i2, int i3, java.lang.Object obj, java.lang.Object obj2, int i4, defpackage.ky kyVar) {
        java.lang.Object obj3 = this.F7NU4MC0GW[i];
        defpackage.yi1 SH1y5HwkJhh = SH1y5HwkJhh(obj3 != null ? obj3.hashCode() : 0, obj3, abhbClRa(i), i3, obj, obj2, i4 + 5, kyVar);
        int fnWB2E7cs = fnWB2E7cs(i2);
        int i5 = fnWB2E7cs + 1;
        java.lang.Object[] objArr = this.F7NU4MC0GW;
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length - 1];
        defpackage.t6.RmCzwkUxICV(objArr, objArr2, 0, i, 6);
        defpackage.t6.wKlPRKlRnfqr(objArr, objArr2, i, i + 2, i5);
        objArr2[fnWB2E7cs - 1] = SH1y5HwkJhh;
        defpackage.t6.wKlPRKlRnfqr(objArr, objArr2, fnWB2E7cs, i5, objArr.length);
        return objArr2;
    }

    public final defpackage.yi1 JlrlGoKF(int i, java.lang.Object obj, java.lang.Object obj2, int i2, defpackage.fu0 fu0Var) {
        defpackage.fu0 fu0Var2;
        defpackage.yi1 JlrlGoKF;
        int kNAkVymC = 1 << defpackage.j70.kNAkVymC(i, i2);
        boolean EXtogiMhuM = EXtogiMhuM(kNAkVymC);
        defpackage.ky kyVar = this.r1MBDhnF;
        if (EXtogiMhuM) {
            int xiZrDbcSW0 = xiZrDbcSW0(kNAkVymC);
            if (!defpackage.x70.QoRHpC4k(obj, this.F7NU4MC0GW[xiZrDbcSW0])) {
                fu0Var.adDC3e2L(fu0Var.riuEU0zW4 + 1);
                defpackage.ky kyVar2 = fu0Var.adDC3e2L;
                if (kyVar != kyVar2) {
                    return new defpackage.yi1(this.IHQe1A4L2xu ^ kNAkVymC, this.oh6vYeIP | kNAkVymC, IHQe1A4L2xu(xiZrDbcSW0, kNAkVymC, i, obj, obj2, i2, kyVar2), kyVar2);
                }
                this.F7NU4MC0GW = IHQe1A4L2xu(xiZrDbcSW0, kNAkVymC, i, obj, obj2, i2, kyVar2);
                this.IHQe1A4L2xu ^= kNAkVymC;
                this.oh6vYeIP |= kNAkVymC;
                return this;
            }
            fu0Var.AARZUJiTa = abhbClRa(xiZrDbcSW0);
            if (abhbClRa(xiZrDbcSW0) == obj2) {
                return this;
            }
            if (kyVar == fu0Var.adDC3e2L) {
                this.F7NU4MC0GW[xiZrDbcSW0 + 1] = obj2;
                return this;
            }
            fu0Var.EXtogiMhuM++;
            java.lang.Object[] objArr = this.F7NU4MC0GW;
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
            copyOf[xiZrDbcSW0 + 1] = obj2;
            return new defpackage.yi1(this.IHQe1A4L2xu, this.oh6vYeIP, copyOf, fu0Var.adDC3e2L);
        }
        if (!riuEU0zW4(kNAkVymC)) {
            fu0Var.adDC3e2L(fu0Var.riuEU0zW4 + 1);
            defpackage.ky kyVar3 = fu0Var.adDC3e2L;
            int xiZrDbcSW02 = xiZrDbcSW0(kNAkVymC);
            java.lang.Object[] objArr2 = this.F7NU4MC0GW;
            if (kyVar != kyVar3) {
                return new defpackage.yi1(this.IHQe1A4L2xu | kNAkVymC, this.oh6vYeIP, defpackage.j70.F7NU4MC0GW(objArr2, xiZrDbcSW02, obj, obj2), kyVar3);
            }
            this.F7NU4MC0GW = defpackage.j70.F7NU4MC0GW(objArr2, xiZrDbcSW02, obj, obj2);
            this.IHQe1A4L2xu |= kNAkVymC;
            return this;
        }
        int fnWB2E7cs = fnWB2E7cs(kNAkVymC);
        defpackage.yi1 EgCjBq0SZwJ = EgCjBq0SZwJ(fnWB2E7cs);
        if (i2 == 30) {
            defpackage.b70 Uv8CGu3G = defpackage.x80.Uv8CGu3G(defpackage.x80.QPwENk36pDC(0, EgCjBq0SZwJ.F7NU4MC0GW.length));
            int i3 = Uv8CGu3G.adDC3e2L;
            int i4 = Uv8CGu3G.xiZrDbcSW0;
            int i5 = Uv8CGu3G.AARZUJiTa;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (!defpackage.x70.QoRHpC4k(obj, EgCjBq0SZwJ.F7NU4MC0GW[i3])) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                fu0Var.AARZUJiTa = EgCjBq0SZwJ.abhbClRa(i3);
                if (EgCjBq0SZwJ.r1MBDhnF == fu0Var.adDC3e2L) {
                    EgCjBq0SZwJ.F7NU4MC0GW[i3 + 1] = obj2;
                    JlrlGoKF = EgCjBq0SZwJ;
                } else {
                    fu0Var.EXtogiMhuM++;
                    java.lang.Object[] objArr3 = EgCjBq0SZwJ.F7NU4MC0GW;
                    java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(objArr3, objArr3.length);
                    copyOf2[i3 + 1] = obj2;
                    JlrlGoKF = new defpackage.yi1(0, 0, copyOf2, fu0Var.adDC3e2L);
                }
                fu0Var2 = fu0Var;
            }
            fu0Var.adDC3e2L(fu0Var.riuEU0zW4 + 1);
            JlrlGoKF = new defpackage.yi1(0, 0, defpackage.j70.F7NU4MC0GW(EgCjBq0SZwJ.F7NU4MC0GW, 0, obj, obj2), fu0Var.adDC3e2L);
            fu0Var2 = fu0Var;
        } else {
            fu0Var2 = fu0Var;
            JlrlGoKF = EgCjBq0SZwJ.JlrlGoKF(i, obj, obj2, i2 + 5, fu0Var2);
        }
        return EgCjBq0SZwJ == JlrlGoKF ? this : kd6TUFXn(fnWB2E7cs, JlrlGoKF, fu0Var2.adDC3e2L);
    }

    public final defpackage.yi1 PAEGRtP0bX(int i, int i2, defpackage.yi1 yi1Var) {
        java.lang.Object[] objArr = yi1Var.F7NU4MC0GW;
        if (objArr.length != 2 || yi1Var.oh6vYeIP != 0) {
            java.lang.Object[] objArr2 = this.F7NU4MC0GW;
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr2, objArr2.length);
            copyOf[i] = yi1Var;
            return new defpackage.yi1(this.IHQe1A4L2xu, this.oh6vYeIP, copyOf, null);
        }
        if (this.F7NU4MC0GW.length == 1) {
            yi1Var.IHQe1A4L2xu = this.oh6vYeIP;
            return yi1Var;
        }
        int xiZrDbcSW0 = xiZrDbcSW0(i2);
        java.lang.Object[] objArr3 = this.F7NU4MC0GW;
        java.lang.Object obj = objArr[0];
        java.lang.Object obj2 = objArr[1];
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(objArr3, objArr3.length + 1);
        defpackage.t6.wKlPRKlRnfqr(copyOf2, copyOf2, i + 2, i + 1, objArr3.length);
        defpackage.t6.wKlPRKlRnfqr(copyOf2, copyOf2, xiZrDbcSW0 + 2, xiZrDbcSW0, i);
        copyOf2[xiZrDbcSW0] = obj;
        copyOf2[xiZrDbcSW0 + 1] = obj2;
        return new defpackage.yi1(this.IHQe1A4L2xu ^ i2, this.oh6vYeIP ^ i2, copyOf2, null);
    }

    public final defpackage.yi1 QoRHpC4k(int i, int i2, defpackage.fu0 fu0Var) {
        fu0Var.adDC3e2L(fu0Var.riuEU0zW4 - 1);
        fu0Var.AARZUJiTa = abhbClRa(i);
        java.lang.Object[] objArr = this.F7NU4MC0GW;
        if (objArr.length == 2) {
            return null;
        }
        if (this.r1MBDhnF != fu0Var.adDC3e2L) {
            return new defpackage.yi1(i2 ^ this.IHQe1A4L2xu, this.oh6vYeIP, defpackage.j70.adDC3e2L(i, objArr), fu0Var.adDC3e2L);
        }
        this.F7NU4MC0GW = defpackage.j70.adDC3e2L(i, objArr);
        this.IHQe1A4L2xu ^= i2;
        return this;
    }

    public final defpackage.yi1 SyNS6RMn(int i, java.lang.Object obj, int i2, defpackage.fu0 fu0Var) {
        defpackage.yi1 SyNS6RMn;
        int kNAkVymC = 1 << defpackage.j70.kNAkVymC(i, i2);
        if (EXtogiMhuM(kNAkVymC)) {
            int xiZrDbcSW0 = xiZrDbcSW0(kNAkVymC);
            if (defpackage.x70.QoRHpC4k(obj, this.F7NU4MC0GW[xiZrDbcSW0])) {
                return QoRHpC4k(xiZrDbcSW0, kNAkVymC, fu0Var);
            }
        } else if (riuEU0zW4(kNAkVymC)) {
            int fnWB2E7cs = fnWB2E7cs(kNAkVymC);
            defpackage.yi1 EgCjBq0SZwJ = EgCjBq0SZwJ(fnWB2E7cs);
            if (i2 == 30) {
                defpackage.b70 Uv8CGu3G = defpackage.x80.Uv8CGu3G(defpackage.x80.QPwENk36pDC(0, EgCjBq0SZwJ.F7NU4MC0GW.length));
                int i3 = Uv8CGu3G.adDC3e2L;
                int i4 = Uv8CGu3G.xiZrDbcSW0;
                int i5 = Uv8CGu3G.AARZUJiTa;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!defpackage.x70.QoRHpC4k(obj, EgCjBq0SZwJ.F7NU4MC0GW[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    SyNS6RMn = EgCjBq0SZwJ.ez2rX8ReCYw(i3, fu0Var);
                }
                SyNS6RMn = EgCjBq0SZwJ;
                break;
            }
            SyNS6RMn = EgCjBq0SZwJ.SyNS6RMn(i, obj, i2 + 5, fu0Var);
            return G3OKOH3wZRC(EgCjBq0SZwJ, SyNS6RMn, fnWB2E7cs, kNAkVymC, fu0Var.adDC3e2L);
        }
        return this;
    }

    public final defpackage.yi1 V7bD7b8KA(int i, int i2, java.lang.Object obj) {
        defpackage.yi1 V7bD7b8KA;
        int kNAkVymC = 1 << defpackage.j70.kNAkVymC(i, i2);
        if (EXtogiMhuM(kNAkVymC)) {
            int xiZrDbcSW0 = xiZrDbcSW0(kNAkVymC);
            if (!defpackage.x70.QoRHpC4k(obj, this.F7NU4MC0GW[xiZrDbcSW0])) {
                return this;
            }
            java.lang.Object[] objArr = this.F7NU4MC0GW;
            if (objArr.length != 2) {
                return new defpackage.yi1(this.IHQe1A4L2xu ^ kNAkVymC, this.oh6vYeIP, defpackage.j70.adDC3e2L(xiZrDbcSW0, objArr), null);
            }
        } else {
            if (!riuEU0zW4(kNAkVymC)) {
                return this;
            }
            int fnWB2E7cs = fnWB2E7cs(kNAkVymC);
            defpackage.yi1 EgCjBq0SZwJ = EgCjBq0SZwJ(fnWB2E7cs);
            if (i2 == 30) {
                defpackage.b70 Uv8CGu3G = defpackage.x80.Uv8CGu3G(defpackage.x80.QPwENk36pDC(0, EgCjBq0SZwJ.F7NU4MC0GW.length));
                int i3 = Uv8CGu3G.adDC3e2L;
                int i4 = Uv8CGu3G.xiZrDbcSW0;
                int i5 = Uv8CGu3G.AARZUJiTa;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!defpackage.x70.QoRHpC4k(obj, EgCjBq0SZwJ.F7NU4MC0GW[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    java.lang.Object[] objArr2 = EgCjBq0SZwJ.F7NU4MC0GW;
                    V7bD7b8KA = objArr2.length == 2 ? null : new defpackage.yi1(0, 0, defpackage.j70.adDC3e2L(i3, objArr2), null);
                }
                V7bD7b8KA = EgCjBq0SZwJ;
                break;
            }
            V7bD7b8KA = EgCjBq0SZwJ.V7bD7b8KA(i, i2 + 5, obj);
            if (V7bD7b8KA != null) {
                return EgCjBq0SZwJ != V7bD7b8KA ? PAEGRtP0bX(fnWB2E7cs, kNAkVymC, V7bD7b8KA) : this;
            }
            java.lang.Object[] objArr3 = this.F7NU4MC0GW;
            if (objArr3.length != 1) {
                return new defpackage.yi1(this.IHQe1A4L2xu, this.oh6vYeIP ^ kNAkVymC, defpackage.j70.xiZrDbcSW0(fnWB2E7cs, objArr3), null);
            }
        }
        return null;
    }

    public final java.lang.Object abhbClRa(int i) {
        return this.F7NU4MC0GW[i + 1];
    }

    public final boolean adDC3e2L(defpackage.yi1 yi1Var) {
        if (this == yi1Var) {
            return true;
        }
        if (this.oh6vYeIP == yi1Var.oh6vYeIP && this.IHQe1A4L2xu == yi1Var.IHQe1A4L2xu) {
            int length = this.F7NU4MC0GW.length;
            for (int i = 0; i < length; i++) {
                if (this.F7NU4MC0GW[i] == yi1Var.F7NU4MC0GW[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final defpackage.yi1 cnag84Bm(int i, java.lang.Object obj, java.lang.Object obj2, int i2, defpackage.fu0 fu0Var) {
        defpackage.fu0 fu0Var2;
        defpackage.yi1 cnag84Bm;
        int kNAkVymC = 1 << defpackage.j70.kNAkVymC(i, i2);
        if (EXtogiMhuM(kNAkVymC)) {
            int xiZrDbcSW0 = xiZrDbcSW0(kNAkVymC);
            return (defpackage.x70.QoRHpC4k(obj, this.F7NU4MC0GW[xiZrDbcSW0]) && defpackage.x70.QoRHpC4k(obj2, abhbClRa(xiZrDbcSW0))) ? QoRHpC4k(xiZrDbcSW0, kNAkVymC, fu0Var) : this;
        }
        if (!riuEU0zW4(kNAkVymC)) {
            return this;
        }
        int fnWB2E7cs = fnWB2E7cs(kNAkVymC);
        defpackage.yi1 EgCjBq0SZwJ = EgCjBq0SZwJ(fnWB2E7cs);
        if (i2 == 30) {
            defpackage.b70 Uv8CGu3G = defpackage.x80.Uv8CGu3G(defpackage.x80.QPwENk36pDC(0, EgCjBq0SZwJ.F7NU4MC0GW.length));
            int i3 = Uv8CGu3G.adDC3e2L;
            int i4 = Uv8CGu3G.xiZrDbcSW0;
            int i5 = Uv8CGu3G.AARZUJiTa;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!defpackage.x70.QoRHpC4k(obj, EgCjBq0SZwJ.F7NU4MC0GW[i3]) || !defpackage.x70.QoRHpC4k(obj2, EgCjBq0SZwJ.abhbClRa(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        cnag84Bm = EgCjBq0SZwJ.ez2rX8ReCYw(i3, fu0Var);
                        break;
                    }
                }
            }
            cnag84Bm = EgCjBq0SZwJ;
            fu0Var2 = fu0Var;
        } else {
            fu0Var2 = fu0Var;
            cnag84Bm = EgCjBq0SZwJ.cnag84Bm(i, obj, obj2, i2 + 5, fu0Var2);
        }
        return G3OKOH3wZRC(EgCjBq0SZwJ, cnag84Bm, fnWB2E7cs, kNAkVymC, fu0Var2.adDC3e2L);
    }

    public final defpackage.yi1 ez2rX8ReCYw(int i, defpackage.fu0 fu0Var) {
        fu0Var.adDC3e2L(fu0Var.riuEU0zW4 - 1);
        fu0Var.AARZUJiTa = abhbClRa(i);
        java.lang.Object[] objArr = this.F7NU4MC0GW;
        if (objArr.length == 2) {
            return null;
        }
        if (this.r1MBDhnF != fu0Var.adDC3e2L) {
            return new defpackage.yi1(0, 0, defpackage.j70.adDC3e2L(i, objArr), fu0Var.adDC3e2L);
        }
        this.F7NU4MC0GW = defpackage.j70.adDC3e2L(i, objArr);
        return this;
    }

    public final int fnWB2E7cs(int i) {
        return (this.F7NU4MC0GW.length - 1) - java.lang.Integer.bitCount(this.oh6vYeIP & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
    
        if (r13 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d1, code lost:
    
        r13.oh6vYeIP = PAEGRtP0bX(r11, r4, (defpackage.yi1) r13.oh6vYeIP);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00db, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ce, code lost:
    
        if (r13 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final defpackage.fz kNAkVymC(int i, int i2, java.lang.Object obj, java.lang.Object obj2) {
        defpackage.fz kNAkVymC;
        int kNAkVymC2 = 1 << defpackage.j70.kNAkVymC(i, i2);
        if (EXtogiMhuM(kNAkVymC2)) {
            int xiZrDbcSW0 = xiZrDbcSW0(kNAkVymC2);
            if (!defpackage.x70.QoRHpC4k(obj, this.F7NU4MC0GW[xiZrDbcSW0])) {
                return new defpackage.fz(new defpackage.yi1(this.IHQe1A4L2xu ^ kNAkVymC2, this.oh6vYeIP | kNAkVymC2, IHQe1A4L2xu(xiZrDbcSW0, kNAkVymC2, i, obj, obj2, i2, null), null), 1);
            }
            if (abhbClRa(xiZrDbcSW0) != obj2) {
                java.lang.Object[] objArr = this.F7NU4MC0GW;
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
                copyOf[xiZrDbcSW0 + 1] = obj2;
                return new defpackage.fz(new defpackage.yi1(this.IHQe1A4L2xu, this.oh6vYeIP, copyOf, null), 0);
            }
        } else {
            if (!riuEU0zW4(kNAkVymC2)) {
                return new defpackage.fz(new defpackage.yi1(this.IHQe1A4L2xu | kNAkVymC2, this.oh6vYeIP, defpackage.j70.F7NU4MC0GW(this.F7NU4MC0GW, xiZrDbcSW0(kNAkVymC2), obj, obj2), null), 1);
            }
            int fnWB2E7cs = fnWB2E7cs(kNAkVymC2);
            defpackage.yi1 EgCjBq0SZwJ = EgCjBq0SZwJ(fnWB2E7cs);
            if (i2 == 30) {
                defpackage.b70 Uv8CGu3G = defpackage.x80.Uv8CGu3G(defpackage.x80.QPwENk36pDC(0, EgCjBq0SZwJ.F7NU4MC0GW.length));
                int i3 = Uv8CGu3G.adDC3e2L;
                int i4 = Uv8CGu3G.xiZrDbcSW0;
                int i5 = Uv8CGu3G.AARZUJiTa;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!defpackage.x70.QoRHpC4k(obj, EgCjBq0SZwJ.F7NU4MC0GW[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    if (obj2 == EgCjBq0SZwJ.abhbClRa(i3)) {
                        kNAkVymC = null;
                    } else {
                        java.lang.Object[] objArr2 = EgCjBq0SZwJ.F7NU4MC0GW;
                        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(objArr2, objArr2.length);
                        copyOf2[i3 + 1] = obj2;
                        kNAkVymC = new defpackage.fz(new defpackage.yi1(0, 0, copyOf2, null), 0);
                    }
                }
                kNAkVymC = new defpackage.fz(new defpackage.yi1(0, 0, defpackage.j70.F7NU4MC0GW(EgCjBq0SZwJ.F7NU4MC0GW, 0, obj, obj2), null), 1);
                break;
            }
            kNAkVymC = EgCjBq0SZwJ.kNAkVymC(i, i2 + 5, obj, obj2);
        }
        return null;
    }

    public final defpackage.yi1 kd6TUFXn(int i, defpackage.yi1 yi1Var, defpackage.ky kyVar) {
        java.lang.Object[] objArr = this.F7NU4MC0GW;
        if (objArr.length == 1 && yi1Var.F7NU4MC0GW.length == 2 && yi1Var.oh6vYeIP == 0) {
            yi1Var.IHQe1A4L2xu = this.oh6vYeIP;
            return yi1Var;
        }
        if (this.r1MBDhnF == kyVar) {
            objArr[i] = yi1Var;
            return this;
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = yi1Var;
        return new defpackage.yi1(this.IHQe1A4L2xu, this.oh6vYeIP, copyOf, kyVar);
    }

    public final int oh6vYeIP() {
        if (this.oh6vYeIP == 0) {
            return this.F7NU4MC0GW.length / 2;
        }
        int bitCount = java.lang.Integer.bitCount(this.IHQe1A4L2xu);
        int length = this.F7NU4MC0GW.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += EgCjBq0SZwJ(i).oh6vYeIP();
        }
        return bitCount;
    }

    public final boolean r1MBDhnF(java.lang.Object obj) {
        defpackage.b70 Uv8CGu3G = defpackage.x80.Uv8CGu3G(defpackage.x80.QPwENk36pDC(0, this.F7NU4MC0GW.length));
        int i = Uv8CGu3G.adDC3e2L;
        int i2 = Uv8CGu3G.xiZrDbcSW0;
        int i3 = Uv8CGu3G.AARZUJiTa;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!defpackage.x70.QoRHpC4k(obj, this.F7NU4MC0GW[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean riuEU0zW4(int i) {
        return (this.oh6vYeIP & i) != 0;
    }

    public final int xiZrDbcSW0(int i) {
        return java.lang.Integer.bitCount(this.IHQe1A4L2xu & (i - 1)) * 2;
    }
}
