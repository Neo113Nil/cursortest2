package defpackage;

/* loaded from: classes.dex */
public abstract class zf0 extends defpackage.bv0 implements defpackage.yj0, defpackage.ki0 {
    public boolean DFo87pBq1E5;
    public defpackage.jn0 G3OKOH3wZRC;
    public defpackage.dv0 JlrlGoKF;
    public final defpackage.ag0 QoRHpC4k = new defpackage.ag0(0, this);
    public defpackage.wf0 SH1y5HwkJhh;
    public boolean SyNS6RMn;
    public boolean cnag84Bm;
    public defpackage.g00 ez2rX8ReCYw;
    public defpackage.nl0 kd6TUFXn;

    public static void UVjEelCZ(defpackage.ip0 ip0Var) {
        defpackage.na0 na0Var;
        defpackage.ip0 ip0Var2 = ip0Var.fnWB2E7cs;
        defpackage.ma0 ma0Var = ip0Var.EgCjBq0SZwJ;
        if (!defpackage.x70.QoRHpC4k(ip0Var2 != null ? ip0Var2.EgCjBq0SZwJ : null, ma0Var)) {
            ma0Var.wll2JLbTBC2.QoRHpC4k.C0U8sNJm.xiZrDbcSW0();
            return;
        }
        defpackage.t V7bD7b8KA = ma0Var.wll2JLbTBC2.QoRHpC4k.V7bD7b8KA();
        if (V7bD7b8KA == null || (na0Var = ((defpackage.hi0) V7bD7b8KA).C0U8sNJm) == null) {
            return;
        }
        na0Var.xiZrDbcSW0();
    }

    public abstract defpackage.zf0 Ay906ovssqgN();

    public abstract long FisHbM7NmV();

    /* JADX WARN: Multi-variable type inference failed */
    public final void H6IrRhrpWoH(defpackage.ol0 ol0Var) {
        defpackage.ma0 ma0Var;
        java.lang.Object[] objArr = ol0Var.oh6vYeIP;
        long[] jArr = ol0Var.IHQe1A4L2xu;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (ma0Var = (defpackage.ma0) ((defpackage.hn1) objArr[(i << 3) + i3]).get()) != null) {
                        if (cnag84Bm()) {
                            ma0Var.QPwENk36pDC(false);
                        } else {
                            ma0Var.EoOhNTTfIN7K(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public abstract defpackage.zf0 JX5fKip1C6();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OtkytngK3Mr(defpackage.ma0 ma0Var, defpackage.i40 i40Var) {
        char c;
        long j;
        long j2;
        long j3;
        defpackage.nl0 nl0Var;
        defpackage.nl0 nl0Var2;
        java.lang.Object AARZUJiTa;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        defpackage.nl0 nl0Var3 = this.kd6TUFXn;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (nl0Var3 != null) {
            java.lang.Object[] objArr = nl0Var3.r1MBDhnF;
            long[] jArr3 = nl0Var3.IHQe1A4L2xu;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                defpackage.ol0 ol0Var = (defpackage.ol0) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                java.lang.Object[] objArr2 = ol0Var.oh6vYeIP;
                                long[] jArr4 = ol0Var.IHQe1A4L2xu;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    defpackage.ma0 ma0Var2 = (defpackage.ma0) ((defpackage.hn1) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (ma0Var2 != null) {
                                                        boolean p4kuH6PDtgom = ma0Var2.p4kuH6PDtgom();
                                                        i4 = i8;
                                                        if (p4kuH6PDtgom) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    ol0Var.DFo87pBq1E5(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
                nl0Var = this.kd6TUFXn;
                if (nl0Var != null) {
                    long[] jArr5 = nl0Var.IHQe1A4L2xu;
                    int length3 = jArr5.length - 2;
                    if (length3 >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j11 = jArr5[i15];
                            if ((((~j11) << c) & j11 & j) != j) {
                                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                                for (int i17 = 0; i17 < i16; i17++) {
                                    if ((j11 & j2) < j3) {
                                        int i18 = (i15 << 3) + i17;
                                        if (((defpackage.ol0) nl0Var.r1MBDhnF[i18]).AARZUJiTa()) {
                                            nl0Var.JlrlGoKF(i18);
                                        }
                                    }
                                    j11 >>= 8;
                                }
                                if (i16 != 8) {
                                    break;
                                }
                            }
                            if (i15 == length3) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                    }
                }
                nl0Var2 = this.kd6TUFXn;
                if (nl0Var2 == null) {
                    nl0Var2 = new defpackage.nl0();
                    this.kd6TUFXn = nl0Var2;
                }
                AARZUJiTa = nl0Var2.AARZUJiTa(i40Var);
                if (AARZUJiTa == null) {
                    AARZUJiTa = new defpackage.ol0();
                    nl0Var2.DFo87pBq1E5(i40Var, AARZUJiTa);
                }
                ((defpackage.ol0) AARZUJiTa).ez2rX8ReCYw(new defpackage.hn1(ma0Var));
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 255;
        j3 = 128;
        nl0Var = this.kd6TUFXn;
        if (nl0Var != null) {
        }
        nl0Var2 = this.kd6TUFXn;
        if (nl0Var2 == null) {
        }
        AARZUJiTa = nl0Var2.AARZUJiTa(i40Var);
        if (AARZUJiTa == null) {
        }
        ((defpackage.ol0) AARZUJiTa).ez2rX8ReCYw(new defpackage.hn1(ma0Var));
    }

    @Override // defpackage.yj0
    public final void QoRHpC4k(boolean z) {
        defpackage.zf0 Ay906ovssqgN = Ay906ovssqgN();
        defpackage.ma0 boH8X4DXyc4 = Ay906ovssqgN != null ? Ay906ovssqgN.boH8X4DXyc4() : null;
        if (defpackage.x70.QoRHpC4k(boH8X4DXyc4, boH8X4DXyc4())) {
            this.DFo87pBq1E5 = z;
            return;
        }
        if ((boH8X4DXyc4 != null ? boH8X4DXyc4.wll2JLbTBC2.F7NU4MC0GW : null) != defpackage.ia0.AARZUJiTa) {
            if ((boH8X4DXyc4 != null ? boH8X4DXyc4.wll2JLbTBC2.F7NU4MC0GW : null) != defpackage.ia0.EXtogiMhuM) {
                return;
            }
        }
        this.DFo87pBq1E5 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ZNF7fheNE(defpackage.dv0 dv0Var, long j, long j2) {
        char c;
        long j3;
        long j4;
        long j5;
        defpackage.ma0 ma0Var;
        int i;
        char c2;
        long j6;
        defpackage.zf0 Ay906ovssqgN;
        defpackage.ws0 snapshotObserver;
        defpackage.nl0 nl0Var = this.kd6TUFXn;
        defpackage.jn0 jn0Var = this.G3OKOH3wZRC;
        if (jn0Var == null) {
            jn0Var = new defpackage.jn0();
            this.G3OKOH3wZRC = jn0Var;
        }
        defpackage.jn0 jn0Var2 = jn0Var;
        defpackage.ts0 ts0Var = boH8X4DXyc4().kd6TUFXn;
        if (ts0Var != null && (snapshotObserver = ((defpackage.v0) ts0Var).getSnapshotObserver()) != null) {
            snapshotObserver.IHQe1A4L2xu.oh6vYeIP(dv0Var, defpackage.q0.QQUzIjv3iOC5, new defpackage.xf0(this, j, j2, dv0Var));
        }
        boolean cnag84Bm = cnag84Bm();
        defpackage.ol0 ol0Var = (defpackage.ol0) jn0Var2.adDC3e2L;
        defpackage.ol0 ol0Var2 = (defpackage.ol0) jn0Var2.xiZrDbcSW0;
        int i2 = jn0Var2.IHQe1A4L2xu;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) jn0Var2.F7NU4MC0GW)[i3];
            if (b == 3) {
                defpackage.i40 i40Var = ((defpackage.i40[]) jn0Var2.oh6vYeIP)[i3];
                i40Var.getClass();
                ol0Var2.ez2rX8ReCYw(i40Var);
            } else if (b != 0 && nl0Var != null) {
                defpackage.i40 i40Var2 = ((defpackage.i40[]) jn0Var2.oh6vYeIP)[i3];
                i40Var2.getClass();
                defpackage.ol0 ol0Var3 = (defpackage.ol0) nl0Var.ez2rX8ReCYw(i40Var2);
                if (ol0Var3 != null) {
                    ol0Var.SH1y5HwkJhh(ol0Var3);
                }
            }
        }
        int i4 = jn0Var2.IHQe1A4L2xu;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) jn0Var2.F7NU4MC0GW;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                defpackage.i40[] i40VarArr = (defpackage.i40[]) jn0Var2.oh6vYeIP;
                i40VarArr[i6 - i5] = i40VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = jn0Var2.IHQe1A4L2xu;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((defpackage.i40[]) jn0Var2.oh6vYeIP)[i8] = null;
        }
        jn0Var2.IHQe1A4L2xu -= i5;
        defpackage.zf0 Ay906ovssqgN2 = Ay906ovssqgN();
        java.lang.Object[] objArr = ol0Var2.oh6vYeIP;
        long[] jArr = ol0Var2.IHQe1A4L2xu;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            defpackage.i40 i40Var3 = (defpackage.i40) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            defpackage.zf0 zf0Var = Ay906ovssqgN2 == null ? this : Ay906ovssqgN2;
                            i = i9;
                            defpackage.zf0 zf0Var2 = zf0Var;
                            while (true) {
                                defpackage.jn0 jn0Var3 = zf0Var2.G3OKOH3wZRC;
                                if ((jn0Var3 == null || defpackage.t6.JcqDrWrgMf((defpackage.i40[]) jn0Var3.oh6vYeIP, i40Var3) < 0) && (Ay906ovssqgN = zf0Var2.Ay906ovssqgN()) != null) {
                                    zf0Var2 = Ay906ovssqgN;
                                }
                            }
                            defpackage.nl0 nl0Var2 = zf0Var2.kd6TUFXn;
                            defpackage.ol0 ol0Var4 = nl0Var2 != null ? (defpackage.ol0) nl0Var2.ez2rX8ReCYw(i40Var3) : null;
                            if (ol0Var4 != null) {
                                zf0Var.H6IrRhrpWoH(ol0Var4);
                            }
                        } else {
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                    }
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                i9 = 8;
            }
        } else {
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        ol0Var2.oh6vYeIP();
        java.lang.Object[] objArr2 = ol0Var.oh6vYeIP;
        long[] jArr2 = ol0Var.IHQe1A4L2xu;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (ma0Var = (defpackage.ma0) ((defpackage.hn1) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (cnag84Bm) {
                                ma0Var.QPwENk36pDC(false);
                            } else {
                                ma0Var.EoOhNTTfIN7K(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        ol0Var.oh6vYeIP();
    }

    public abstract defpackage.ma0 boH8X4DXyc4();

    public boolean cnag84Bm() {
        return false;
    }

    public abstract int dOmtpLcqqI1y(defpackage.o oVar);

    public final void flIYPhR0(defpackage.ji0 ji0Var) {
        long j;
        long j2;
        defpackage.nl0 nl0Var = this.kd6TUFXn;
        if (this.cnag84Bm) {
            return;
        }
        defpackage.g00 F7NU4MC0GW = ji0Var.F7NU4MC0GW();
        if (F7NU4MC0GW != null) {
            boolean z = this.ez2rX8ReCYw != F7NU4MC0GW;
            if (z || !xWQVQvEdoGv().adDC3e2L) {
                j = 0;
                j2 = 9223372034707292159L;
            } else {
                defpackage.v90 yUiIS9dG7NYk = yUiIS9dG7NYk();
                long UsuH8pd5P = defpackage.a70.UsuH8pd5P(yUiIS9dG7NYk.F7NU4MC0GW(0L));
                long mAr5m2L7gYDP = yUiIS9dG7NYk.mAr5m2L7gYDP();
                j2 = UsuH8pd5P;
                j = mAr5m2L7gYDP;
                z = (defpackage.z60.IHQe1A4L2xu(UsuH8pd5P, xWQVQvEdoGv().xiZrDbcSW0) && defpackage.i70.IHQe1A4L2xu(mAr5m2L7gYDP, xWQVQvEdoGv().AARZUJiTa)) ? false : true;
            }
            if (z) {
                defpackage.dv0 dv0Var = this.JlrlGoKF;
                if (dv0Var != null) {
                    dv0Var.adDC3e2L = ji0Var;
                } else {
                    dv0Var = new defpackage.dv0(ji0Var, this);
                    this.JlrlGoKF = dv0Var;
                }
                ZNF7fheNE(dv0Var, j2, j);
                this.ez2rX8ReCYw = ji0Var.F7NU4MC0GW();
                return;
            }
            return;
        }
        if (nl0Var != null) {
            java.lang.Object[] objArr = nl0Var.r1MBDhnF;
            long[] jArr = nl0Var.IHQe1A4L2xu;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j3 = jArr[i];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j3) < 128) {
                                H6IrRhrpWoH((defpackage.ol0) objArr[(i << 3) + i3]);
                            }
                            j3 >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            nl0Var.IHQe1A4L2xu();
        }
    }

    public abstract boolean juTJww2r();

    public final int k3hcgHS3MP(defpackage.o oVar) {
        int dOmtpLcqqI1y;
        if (!juTJww2r() || (dOmtpLcqqI1y = dOmtpLcqqI1y(oVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = oVar instanceof defpackage.yl1;
        long j = this.riuEU0zW4;
        return dOmtpLcqqI1y + ((int) (z ? j >> 32 : 4294967295L & j));
    }

    @Override // defpackage.ki0
    public final defpackage.ji0 p4kuH6PDtgom(int i, int i2, java.util.Map map, defpackage.g00 g00Var, defpackage.g00 g00Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            defpackage.x50.oh6vYeIP("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new defpackage.yf0(i, i2, map, g00Var, g00Var2, this);
    }

    public abstract void pm90rNzI5F();

    public abstract defpackage.ji0 seT5W8IHOge();

    public final defpackage.wf0 xWQVQvEdoGv() {
        defpackage.wf0 wf0Var = this.SH1y5HwkJhh;
        if (wf0Var != null) {
            return wf0Var;
        }
        defpackage.wf0 wf0Var2 = new defpackage.wf0(this);
        this.SH1y5HwkJhh = wf0Var2;
        return wf0Var2;
    }

    public abstract defpackage.v90 yUiIS9dG7NYk();
}
