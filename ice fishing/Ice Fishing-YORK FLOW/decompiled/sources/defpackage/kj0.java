package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class kj0 extends defpackage.ry0 implements defpackage.hm0, defpackage.xk0 {
    public defpackage.hj0 GE9mJIPrb8gP;
    public defpackage.y10 Ns0WNyEWdPsk;
    public boolean T1fB7bDYiVJQ;
    public defpackage.qp0 WmetiUbpKU9I;
    public final defpackage.lj0 XntWc4eZSQ8j = new defpackage.lj0(0, this);
    public defpackage.ty0 fNwYGHIYeJcR;
    public boolean gUjdnLbkVAaA;
    public boolean h3m55N1URyyK;
    public defpackage.yn0 s0TASMVLSWD5;

    public static void Ux2tdpxXtKdg(defpackage.sr0 sr0Var) {
        defpackage.kd0 kd0Var;
        defpackage.sr0 sr0Var2 = sr0Var.ZVVdXbWmyCSK;
        defpackage.jd0 jd0Var = sr0Var.BHfvd2J71qpO;
        if (!defpackage.ma0.QiMR8OkAhezm(sr0Var2 != null ? sr0Var2.BHfvd2J71qpO : null, jd0Var)) {
            jd0Var.BXaznwstz2U0.XntWc4eZSQ8j.OcTWLQzke1i2.oh71FJcDz6S2();
            return;
        }
        defpackage.vgZvSmsixr00 XntWc4eZSQ8j = jd0Var.BXaznwstz2U0.XntWc4eZSQ8j.XntWc4eZSQ8j();
        if (XntWc4eZSQ8j == null || (kd0Var = ((defpackage.uk0) XntWc4eZSQ8j).OcTWLQzke1i2) == null) {
            return;
        }
        kd0Var.oh71FJcDz6S2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ARgw6UjYb9W7(defpackage.zn0 zn0Var) {
        defpackage.jd0 jd0Var;
        java.lang.Object[] objArr = zn0Var.giKS3J6vZuNy;
        long[] jArr = zn0Var.ZpBGe2uQfcn8;
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
                    if ((255 & j) < 128 && (jd0Var = (defpackage.jd0) ((defpackage.xu1) objArr[(i << 3) + i3]).get()) != null) {
                        if (ZVVdXbWmyCSK()) {
                            jd0Var.Fu5WBEia9jBo(false);
                        } else {
                            jd0Var.EPEWHACkMcF1(false);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void Hx18F4M3RgD4(defpackage.ty0 ty0Var, long j, long j2) {
        char c;
        long j3;
        long j4;
        long j5;
        defpackage.jd0 jd0Var;
        int i;
        char c2;
        long j6;
        defpackage.kj0 Wx2ec0FCRg9J;
        defpackage.rv0 snapshotObserver;
        defpackage.yn0 yn0Var = this.s0TASMVLSWD5;
        defpackage.qp0 qp0Var = this.WmetiUbpKU9I;
        if (qp0Var == null) {
            qp0Var = new defpackage.qp0();
            this.WmetiUbpKU9I = qp0Var;
        }
        defpackage.qp0 qp0Var2 = qp0Var;
        defpackage.ov0 ov0Var = ZEXjjCYihNTt().s0TASMVLSWD5;
        if (ov0Var != null && (snapshotObserver = ((defpackage.u) ov0Var).getSnapshotObserver()) != null) {
            snapshotObserver.ZpBGe2uQfcn8.JhCgjQRTAOCT(ty0Var, defpackage.n.qjMheFZ0l9kA, new defpackage.ij0(this, j, j2, ty0Var));
        }
        boolean ZVVdXbWmyCSK = ZVVdXbWmyCSK();
        defpackage.zn0 zn0Var = (defpackage.zn0) qp0Var2.WDYagTQQm9ns;
        defpackage.zn0 zn0Var2 = (defpackage.zn0) qp0Var2.oh71FJcDz6S2;
        int i2 = qp0Var2.ZpBGe2uQfcn8;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) qp0Var2.JhCgjQRTAOCT)[i3];
            if (b == 3) {
                defpackage.o50 o50Var = ((defpackage.o50[]) qp0Var2.giKS3J6vZuNy)[i3];
                o50Var.getClass();
                zn0Var2.Ns0WNyEWdPsk(o50Var);
            } else if (b != 0 && yn0Var != null) {
                defpackage.o50 o50Var2 = ((defpackage.o50[]) qp0Var2.giKS3J6vZuNy)[i3];
                o50Var2.getClass();
                defpackage.zn0 zn0Var3 = (defpackage.zn0) yn0Var.Ns0WNyEWdPsk(o50Var2);
                if (zn0Var3 != null) {
                    zn0Var.GE9mJIPrb8gP(zn0Var3);
                }
            }
        }
        int i4 = qp0Var2.ZpBGe2uQfcn8;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) qp0Var2.JhCgjQRTAOCT;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                defpackage.o50[] o50VarArr = (defpackage.o50[]) qp0Var2.giKS3J6vZuNy;
                o50VarArr[i6 - i5] = o50VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = qp0Var2.ZpBGe2uQfcn8;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((defpackage.o50[]) qp0Var2.giKS3J6vZuNy)[i8] = null;
        }
        qp0Var2.ZpBGe2uQfcn8 -= i5;
        defpackage.kj0 Wx2ec0FCRg9J2 = Wx2ec0FCRg9J();
        java.lang.Object[] objArr = zn0Var2.giKS3J6vZuNy;
        long[] jArr = zn0Var2.ZpBGe2uQfcn8;
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
                            defpackage.o50 o50Var3 = (defpackage.o50) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            defpackage.kj0 kj0Var = Wx2ec0FCRg9J2 == null ? this : Wx2ec0FCRg9J2;
                            i = i9;
                            defpackage.kj0 kj0Var2 = kj0Var;
                            while (true) {
                                defpackage.qp0 qp0Var3 = kj0Var2.WmetiUbpKU9I;
                                if ((qp0Var3 == null || defpackage.y7.eSwlWMUpitz8((defpackage.o50[]) qp0Var3.giKS3J6vZuNy, o50Var3) < 0) && (Wx2ec0FCRg9J = kj0Var2.Wx2ec0FCRg9J()) != null) {
                                    kj0Var2 = Wx2ec0FCRg9J;
                                }
                            }
                            defpackage.yn0 yn0Var2 = kj0Var2.s0TASMVLSWD5;
                            defpackage.zn0 zn0Var4 = yn0Var2 != null ? (defpackage.zn0) yn0Var2.Ns0WNyEWdPsk(o50Var3) : null;
                            if (zn0Var4 != null) {
                                kj0Var.ARgw6UjYb9W7(zn0Var4);
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
        zn0Var2.giKS3J6vZuNy();
        java.lang.Object[] objArr2 = zn0Var.giKS3J6vZuNy;
        long[] jArr2 = zn0Var.ZpBGe2uQfcn8;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (jd0Var = (defpackage.jd0) ((defpackage.xu1) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (ZVVdXbWmyCSK) {
                                jd0Var.Fu5WBEia9jBo(false);
                            } else {
                                jd0Var.EPEWHACkMcF1(false);
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
        zn0Var.giKS3J6vZuNy();
    }

    public final defpackage.hj0 K0gkXZrJwRZi() {
        defpackage.hj0 hj0Var = this.GE9mJIPrb8gP;
        if (hj0Var != null) {
            return hj0Var;
        }
        defpackage.hj0 hj0Var2 = new defpackage.hj0(this);
        this.GE9mJIPrb8gP = hj0Var2;
        return hj0Var2;
    }

    public abstract defpackage.kj0 RIHPIrzkudeW();

    public abstract defpackage.rc0 S0c5Wv6LbIVo();

    public abstract void SJaTq1YjP6B8();

    public abstract boolean TlJvUa0ZXCBu();

    @Override // defpackage.xk0
    public final defpackage.wk0 Wc0TdmRSwbbi(int i, int i2, java.util.Map map, defpackage.y10 y10Var, defpackage.y10 y10Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            defpackage.e80.giKS3J6vZuNy("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new defpackage.jj0(i, i2, map, y10Var, y10Var2, this);
    }

    public abstract defpackage.kj0 Wx2ec0FCRg9J();

    public final int XuMcJunjB8iA(defpackage.VpXebusPOq9I vpXebusPOq9I) {
        int mnkwqFSfsWTC;
        if (!TlJvUa0ZXCBu() || (mnkwqFSfsWTC = mnkwqFSfsWTC(vpXebusPOq9I)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = vpXebusPOq9I instanceof defpackage.qt1;
        long j = this.e6mdH7fiFuta;
        return mnkwqFSfsWTC + ((int) (z ? j >> 32 : 4294967295L & j));
    }

    public abstract defpackage.jd0 ZEXjjCYihNTt();

    @Override // defpackage.fa0
    public boolean ZVVdXbWmyCSK() {
        return false;
    }

    public abstract long ZdAZC2JJ1p6Z();

    public abstract defpackage.wk0 awuGf4qH8HFd();

    public final void cSrsis27vXSh(defpackage.wk0 wk0Var) {
        long j;
        long j2;
        defpackage.yn0 yn0Var = this.s0TASMVLSWD5;
        if (this.T1fB7bDYiVJQ) {
            return;
        }
        defpackage.y10 JhCgjQRTAOCT = wk0Var.JhCgjQRTAOCT();
        if (JhCgjQRTAOCT != null) {
            boolean z = this.Ns0WNyEWdPsk != JhCgjQRTAOCT;
            if (z || !K0gkXZrJwRZi().WDYagTQQm9ns) {
                j = 0;
                j2 = 9223372034707292159L;
            } else {
                defpackage.rc0 S0c5Wv6LbIVo = S0c5Wv6LbIVo();
                long jjTN4uUnoyEn = defpackage.m90.jjTN4uUnoyEn(S0c5Wv6LbIVo.fWTAfUmVKrZq(0L));
                long GcLuU6pT9wO9 = S0c5Wv6LbIVo.GcLuU6pT9wO9();
                j2 = jjTN4uUnoyEn;
                j = GcLuU6pT9wO9;
                z = (defpackage.l90.ZpBGe2uQfcn8(jjTN4uUnoyEn, K0gkXZrJwRZi().oh71FJcDz6S2) && defpackage.u90.ZpBGe2uQfcn8(GcLuU6pT9wO9, K0gkXZrJwRZi().QiMR8OkAhezm)) ? false : true;
            }
            if (z) {
                defpackage.ty0 ty0Var = this.fNwYGHIYeJcR;
                if (ty0Var != null) {
                    ty0Var.WDYagTQQm9ns = wk0Var;
                } else {
                    ty0Var = new defpackage.ty0(wk0Var, this);
                    this.fNwYGHIYeJcR = ty0Var;
                }
                Hx18F4M3RgD4(ty0Var, j2, j);
                this.Ns0WNyEWdPsk = wk0Var.JhCgjQRTAOCT();
                return;
            }
            return;
        }
        if (yn0Var != null) {
            java.lang.Object[] objArr = yn0Var.fWTAfUmVKrZq;
            long[] jArr = yn0Var.ZpBGe2uQfcn8;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j3 = jArr[i];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j3) < 128) {
                                ARgw6UjYb9W7((defpackage.zn0) objArr[(i << 3) + i3]);
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
            yn0Var.ZpBGe2uQfcn8();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void eSwlWMUpitz8(defpackage.jd0 jd0Var, defpackage.o50 o50Var) {
        char c;
        long j;
        long j2;
        long j3;
        defpackage.yn0 yn0Var;
        defpackage.yn0 yn0Var2;
        java.lang.Object QiMR8OkAhezm;
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
        defpackage.yn0 yn0Var3 = this.s0TASMVLSWD5;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (yn0Var3 != null) {
            java.lang.Object[] objArr = yn0Var3.fWTAfUmVKrZq;
            long[] jArr3 = yn0Var3.ZpBGe2uQfcn8;
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
                                defpackage.zn0 zn0Var = (defpackage.zn0) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                java.lang.Object[] objArr2 = zn0Var.giKS3J6vZuNy;
                                long[] jArr4 = zn0Var.ZpBGe2uQfcn8;
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
                                                    defpackage.jd0 jd0Var2 = (defpackage.jd0) ((defpackage.xu1) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (jd0Var2 != null) {
                                                        boolean KrtOTfE6jiS2 = jd0Var2.KrtOTfE6jiS2();
                                                        i4 = i8;
                                                        if (KrtOTfE6jiS2) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    zn0Var.h3m55N1URyyK(i14);
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
                yn0Var = this.s0TASMVLSWD5;
                if (yn0Var != null) {
                    long[] jArr5 = yn0Var.ZpBGe2uQfcn8;
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
                                        if (((defpackage.zn0) yn0Var.fWTAfUmVKrZq[i18]).QiMR8OkAhezm()) {
                                            yn0Var.fNwYGHIYeJcR(i18);
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
                yn0Var2 = this.s0TASMVLSWD5;
                if (yn0Var2 == null) {
                    yn0Var2 = new defpackage.yn0();
                    this.s0TASMVLSWD5 = yn0Var2;
                }
                QiMR8OkAhezm = yn0Var2.QiMR8OkAhezm(o50Var);
                if (QiMR8OkAhezm == null) {
                    QiMR8OkAhezm = new defpackage.zn0();
                    yn0Var2.h3m55N1URyyK(o50Var, QiMR8OkAhezm);
                }
                ((defpackage.zn0) QiMR8OkAhezm).Ns0WNyEWdPsk(new defpackage.xu1(jd0Var));
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 255;
        j3 = 128;
        yn0Var = this.s0TASMVLSWD5;
        if (yn0Var != null) {
        }
        yn0Var2 = this.s0TASMVLSWD5;
        if (yn0Var2 == null) {
        }
        QiMR8OkAhezm = yn0Var2.QiMR8OkAhezm(o50Var);
        if (QiMR8OkAhezm == null) {
        }
        ((defpackage.zn0) QiMR8OkAhezm).Ns0WNyEWdPsk(new defpackage.xu1(jd0Var));
    }

    @Override // defpackage.hm0
    public final void gUjdnLbkVAaA(boolean z) {
        defpackage.kj0 Wx2ec0FCRg9J = Wx2ec0FCRg9J();
        defpackage.jd0 ZEXjjCYihNTt = Wx2ec0FCRg9J != null ? Wx2ec0FCRg9J.ZEXjjCYihNTt() : null;
        if (defpackage.ma0.QiMR8OkAhezm(ZEXjjCYihNTt, ZEXjjCYihNTt())) {
            this.h3m55N1URyyK = z;
            return;
        }
        if ((ZEXjjCYihNTt != null ? ZEXjjCYihNTt.BXaznwstz2U0.JhCgjQRTAOCT : null) != defpackage.fd0.QiMR8OkAhezm) {
            if ((ZEXjjCYihNTt != null ? ZEXjjCYihNTt.BXaznwstz2U0.JhCgjQRTAOCT : null) != defpackage.fd0.P05cfTpS5W5L) {
                return;
            }
        }
        this.h3m55N1URyyK = z;
    }

    public abstract int mnkwqFSfsWTC(defpackage.VpXebusPOq9I vpXebusPOq9I);
}
