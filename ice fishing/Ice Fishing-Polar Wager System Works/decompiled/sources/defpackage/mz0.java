package defpackage;

/* loaded from: classes.dex */
public final class mz0 {
    public boolean AARZUJiTa;
    public defpackage.h0 EXtogiMhuM;
    public final defpackage.gl0 F7NU4MC0GW;
    public final defpackage.v0 IHQe1A4L2xu;
    public final defpackage.s4 SH1y5HwkJhh;
    public boolean adDC3e2L;
    public final defpackage.ml0 ez2rX8ReCYw;
    public final defpackage.p2 oh6vYeIP;
    public final defpackage.sg1 r1MBDhnF;
    public long riuEU0zW4;
    public boolean xiZrDbcSW0;

    public mz0(defpackage.v0 v0Var) {
        this.IHQe1A4L2xu = v0Var;
        defpackage.p2 p2Var = new defpackage.p2();
        p2Var.oh6vYeIP = new long[192];
        p2Var.r1MBDhnF = new long[192];
        this.oh6vYeIP = p2Var;
        this.r1MBDhnF = new defpackage.sg1();
        this.F7NU4MC0GW = new defpackage.gl0();
        this.riuEU0zW4 = -1L;
        this.SH1y5HwkJhh = new defpackage.s4(11, this);
        this.ez2rX8ReCYw = new defpackage.ml0();
    }

    public static void EXtogiMhuM(defpackage.ma0 ma0Var) {
        if (!ma0Var.AARZUJiTa || r1MBDhnF(ma0Var.yIx6ChFVk.F7NU4MC0GW)) {
            return;
        }
        ma0Var.AARZUJiTa = false;
        if (ma0Var.riuEU0zW4) {
            ma0Var.EXtogiMhuM = adDC3e2L(ma0Var);
            ma0Var.riuEU0zW4 = false;
        }
        if (defpackage.z60.IHQe1A4L2xu(ma0Var.EXtogiMhuM, 9223372034707292159L)) {
            return;
        }
        defpackage.xl0 QQUzIjv3iOC5 = ma0Var.QQUzIjv3iOC5();
        java.lang.Object[] objArr = QQUzIjv3iOC5.adDC3e2L;
        int i = QQUzIjv3iOC5.AARZUJiTa;
        for (int i2 = 0; i2 < i; i2++) {
            EXtogiMhuM((defpackage.ma0) objArr[i2]);
        }
    }

    public static long adDC3e2L(defpackage.ma0 ma0Var) {
        defpackage.ep0 ep0Var = ma0Var.yIx6ChFVk;
        defpackage.ip0 ip0Var = ep0Var.F7NU4MC0GW;
        long j = 0;
        for (defpackage.ip0 ip0Var2 = ep0Var.r1MBDhnF; ip0Var2 != null && ip0Var2 != ip0Var; ip0Var2 = ip0Var2.kNAkVymC) {
            if (r1MBDhnF(ip0Var2)) {
                return 9223372034707292159L;
            }
            j = defpackage.z60.r1MBDhnF(j, ip0Var2.v5iciZok);
        }
        return j;
    }

    public static boolean r1MBDhnF(defpackage.ip0 ip0Var) {
        defpackage.ss0 ss0Var = ip0Var.hkbnNdmy;
        return (ss0Var == null || defpackage.l80.V7bD7b8KA(((defpackage.t20) ss0Var).oh6vYeIP())) ? false : true;
    }

    public final void AARZUJiTa(defpackage.ma0 ma0Var) {
        if (ma0Var.ez2rX8ReCYw) {
            int i = ma0Var.xiZrDbcSW0 & 33554431;
            defpackage.p2 p2Var = this.oh6vYeIP;
            long[] jArr = (long[]) p2Var.oh6vYeIP;
            int i2 = p2Var.IHQe1A4L2xu;
            int i3 = 0;
            while (true) {
                if (i3 >= jArr.length - 2 || i3 >= i2) {
                    break;
                }
                int i4 = i3 + 2;
                if ((((int) jArr[i4]) & 33554431) == i) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                    jArr[i4] = defpackage.lz0.IHQe1A4L2xu;
                    break;
                }
                i3 += 3;
            }
            ma0Var.ez2rX8ReCYw = false;
            ma0Var.SH1y5HwkJhh = true;
            this.adDC3e2L = true;
            this.AARZUJiTa = true;
        }
    }

    public final void F7NU4MC0GW(defpackage.ma0 ma0Var) {
        boolean z;
        boolean z2 = true;
        ma0Var.AARZUJiTa = true;
        defpackage.ep0 ep0Var = ma0Var.yIx6ChFVk;
        defpackage.ip0 ip0Var = ep0Var.F7NU4MC0GW;
        defpackage.hi0 hi0Var = ma0Var.wll2JLbTBC2.QoRHpC4k;
        int nVhUznk1t = hi0Var.nVhUznk1t();
        float QUKZkWRtw6 = hi0Var.QUKZkWRtw6();
        defpackage.ml0 ml0Var = this.ez2rX8ReCYw;
        ml0Var.IHQe1A4L2xu = 0.0f;
        ml0Var.oh6vYeIP = 0.0f;
        ml0Var.r1MBDhnF = nVhUznk1t;
        ml0Var.F7NU4MC0GW = QUKZkWRtw6;
        while (true) {
            if (ip0Var == null) {
                break;
            }
            defpackage.ma0 ma0Var2 = ip0Var.EgCjBq0SZwJ;
            if (ip0Var == ma0Var2.yIx6ChFVk.F7NU4MC0GW && !ma0Var2.AARZUJiTa) {
                if (!defpackage.z60.IHQe1A4L2xu(oh6vYeIP(ma0Var2), 9223372034707292159L)) {
                    ml0Var.r1MBDhnF((java.lang.Float.floatToRawIntBits((int) (r9 >> 32)) << 32) | (java.lang.Float.floatToRawIntBits((int) (r9 & 4294967295L)) & 4294967295L));
                    break;
                }
            }
            defpackage.ss0 ss0Var = ip0Var.hkbnNdmy;
            if (ss0Var != null) {
                float[] oh6vYeIP = ((defpackage.t20) ss0Var).oh6vYeIP();
                if (!defpackage.l80.V7bD7b8KA(oh6vYeIP)) {
                    defpackage.c80.UsuH8pd5P(oh6vYeIP, ml0Var);
                }
            }
            long j = ip0Var.v5iciZok;
            ml0Var.r1MBDhnF((4294967295L & java.lang.Float.floatToRawIntBits((int) (j & 4294967295L))) | (java.lang.Float.floatToRawIntBits((int) (j >> 32)) << 32));
            ip0Var = ip0Var.kNAkVymC;
        }
        int i = (int) ml0Var.IHQe1A4L2xu;
        int i2 = (int) ml0Var.oh6vYeIP;
        int i3 = (int) ml0Var.r1MBDhnF;
        int i4 = (int) ml0Var.F7NU4MC0GW;
        int i5 = ma0Var.xiZrDbcSW0;
        boolean z3 = ma0Var.ez2rX8ReCYw;
        ma0Var.ez2rX8ReCYw = true;
        defpackage.p2 p2Var = this.oh6vYeIP;
        if (z3) {
            int i6 = i5 & 33554431;
            long[] jArr = (long[]) p2Var.oh6vYeIP;
            int i7 = p2Var.IHQe1A4L2xu;
            int i8 = 0;
            while (i8 < jArr.length - 2 && i8 < i7) {
                int i9 = i8 + 2;
                long j2 = jArr[i9];
                z = z2;
                if ((((int) j2) & 33554431) == i6) {
                    jArr[i8] = (i << 32) | (i2 & 4294967295L);
                    jArr[i8 + 1] = (i3 << 32) | (i4 & 4294967295L);
                    jArr[i9] = (((j2 >> 63) & 1) << 60) | j2;
                    break;
                }
                i8 += 3;
                z2 = z;
            }
        }
        z = z2;
        defpackage.ma0 V7bD7b8KA = ma0Var.V7bD7b8KA();
        p2Var.F7NU4MC0GW(i5, i, i2, i3, i4, (r22 & 32) != 0 ? -1 : V7bD7b8KA != null ? V7bD7b8KA.xiZrDbcSW0 : -1, ep0Var.F7NU4MC0GW(1024), ep0Var.F7NU4MC0GW(16), this.r1MBDhnF.IHQe1A4L2xu.IHQe1A4L2xu(i5), -1);
        ma0Var.SH1y5HwkJhh = false;
        this.adDC3e2L = z;
        defpackage.xl0 QQUzIjv3iOC5 = ma0Var.QQUzIjv3iOC5();
        java.lang.Object[] objArr = QQUzIjv3iOC5.adDC3e2L;
        int i10 = QQUzIjv3iOC5.AARZUJiTa;
        for (int i11 = 0; i11 < i10; i11++) {
            defpackage.ma0 ma0Var3 = (defpackage.ma0) objArr[i11];
            if (ma0Var3.yIx6ChFVk()) {
                F7NU4MC0GW(ma0Var3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IHQe1A4L2xu() {
        boolean z;
        long j;
        defpackage.p2 p2Var;
        int i;
        long j2;
        long j3;
        int i2;
        long[] jArr;
        long j4;
        long j5;
        defpackage.h0 h0Var = this.EXtogiMhuM;
        if (h0Var != null) {
            this.IHQe1A4L2xu.removeCallbacks(h0Var);
            this.EXtogiMhuM = null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z2 = this.adDC3e2L;
        boolean z3 = z2 || this.xiZrDbcSW0;
        defpackage.p2 p2Var2 = this.oh6vYeIP;
        boolean z4 = true;
        defpackage.sg1 sg1Var = this.r1MBDhnF;
        if (z2) {
            this.adDC3e2L = false;
            defpackage.gl0 gl0Var = this.F7NU4MC0GW;
            java.lang.Object[] objArr = gl0Var.IHQe1A4L2xu;
            int i3 = gl0Var.oh6vYeIP;
            for (int i4 = 0; i4 < i3; i4++) {
                ((defpackage.vz) objArr[i4]).IHQe1A4L2xu();
            }
            long[] jArr2 = (long[]) p2Var2.oh6vYeIP;
            int i5 = p2Var2.IHQe1A4L2xu;
            int i6 = 0;
            while (i6 < jArr2.length - 2 && i6 < i5) {
                long j6 = jArr2[i6 + 2];
                boolean z5 = z4;
                int i7 = i5;
                if ((((int) (j6 >> 60)) & 1) != 0) {
                    long j7 = jArr2[i6];
                    long j8 = jArr2[i6 + 1];
                    defpackage.rg1 rg1Var = (defpackage.rg1) sg1Var.IHQe1A4L2xu.oh6vYeIP(((int) j6) & 33554431);
                    while (rg1Var != null) {
                        defpackage.rg1 rg1Var2 = rg1Var.F7NU4MC0GW;
                        boolean z6 = z3;
                        long j9 = rg1Var.AARZUJiTa;
                        boolean z7 = (currentTimeMillis - j9 >= 0 || j9 == Long.MIN_VALUE) ? z5 : false;
                        rg1Var.adDC3e2L = j7;
                        rg1Var.xiZrDbcSW0 = j8;
                        if (z7) {
                            rg1Var.AARZUJiTa = currentTimeMillis;
                            j4 = j7;
                            j5 = j8;
                            rg1Var.IHQe1A4L2xu(j4, j5, sg1Var.F7NU4MC0GW, sg1Var.adDC3e2L, sg1Var.AARZUJiTa);
                        } else {
                            j4 = j7;
                            j5 = j8;
                        }
                        rg1Var = rg1Var2;
                        j7 = j4;
                        j8 = j5;
                        z3 = z6;
                    }
                }
                i6 += 3;
                z4 = z5;
                i5 = i7;
                z3 = z3;
            }
            z = z3;
            j = 0;
            long[] jArr3 = (long[]) p2Var2.oh6vYeIP;
            int i8 = p2Var2.IHQe1A4L2xu;
            for (int i9 = 0; i9 < jArr3.length - 2 && i9 < i8; i9 += 3) {
                int i10 = i9 + 2;
                jArr3[i10] = jArr3[i10] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.xiZrDbcSW0) {
            this.xiZrDbcSW0 = false;
            long j10 = sg1Var.F7NU4MC0GW;
            long j11 = sg1Var.adDC3e2L;
            float[] fArr = sg1Var.AARZUJiTa;
            defpackage.xk0 xk0Var = sg1Var.IHQe1A4L2xu;
            j2 = 128;
            java.lang.Object[] objArr2 = xk0Var.r1MBDhnF;
            long[] jArr4 = xk0Var.IHQe1A4L2xu;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i11 = 0;
                int i12 = 8;
                j3 = 255;
                while (true) {
                    long j12 = j10;
                    long j13 = jArr4[i11];
                    int i13 = i12;
                    p2Var = p2Var2;
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i11 - length)) >>> 31);
                        long j14 = j13;
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j14 & 255) < 128) {
                                defpackage.rg1 rg1Var3 = (defpackage.rg1) objArr2[(i11 << 3) + i15];
                                while (rg1Var3 != null) {
                                    sg1Var.IHQe1A4L2xu(rg1Var3, j12, j11, fArr, currentTimeMillis);
                                    rg1Var3 = rg1Var3.F7NU4MC0GW;
                                    i13 = i13;
                                    jArr4 = jArr4;
                                }
                            }
                            long[] jArr5 = jArr4;
                            int i16 = i13;
                            j14 >>= i16;
                            i15++;
                            j12 = j12;
                            i13 = i16;
                            jArr4 = jArr5;
                        }
                        jArr = jArr4;
                        i = i13;
                        j10 = j12;
                        if (i14 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i13;
                        j10 = j12;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    i12 = i;
                    p2Var2 = p2Var;
                    jArr4 = jArr;
                }
                if (z) {
                    long j15 = sg1Var.F7NU4MC0GW;
                    long j16 = sg1Var.adDC3e2L;
                    float[] fArr2 = sg1Var.AARZUJiTa;
                    defpackage.rg1 rg1Var4 = sg1Var.oh6vYeIP;
                    if (rg1Var4 != null) {
                        while (rg1Var4 != null) {
                            defpackage.ma0 D2vUnMij = defpackage.w70.D2vUnMij(rg1Var4.oh6vYeIP);
                            rg1Var4.adDC3e2L = ((defpackage.v0) defpackage.pa0.IHQe1A4L2xu(D2vUnMij)).getRectManager().oh6vYeIP(D2vUnMij);
                            defpackage.hi0 hi0Var = D2vUnMij.wll2JLbTBC2.QoRHpC4k;
                            rg1Var4.xiZrDbcSW0 = ((hi0Var.adDC3e2L + ((int) (r12 >> 32))) << 32) | ((hi0Var.xiZrDbcSW0 + ((int) (r12 & 4294967295L))) & 4294967295L);
                            sg1Var.IHQe1A4L2xu(rg1Var4, j15, j16, fArr2, currentTimeMillis);
                            rg1Var4 = rg1Var4.F7NU4MC0GW;
                        }
                    }
                }
                if (this.AARZUJiTa) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    this.AARZUJiTa = false;
                    defpackage.p2 p2Var3 = p2Var;
                    long[] jArr6 = (long[]) p2Var3.oh6vYeIP;
                    int i17 = p2Var3.IHQe1A4L2xu;
                    long[] jArr7 = (long[]) p2Var3.r1MBDhnF;
                    int i18 = 0;
                    for (int i19 = 0; i19 < jArr6.length - 2 && i18 < jArr7.length - 2 && i19 < i17; i19 += 3) {
                        int i20 = i19 + 2;
                        if (jArr6[i20] != defpackage.lz0.IHQe1A4L2xu) {
                            jArr7[i18] = jArr6[i19];
                            jArr7[i18 + 1] = jArr6[i19 + 1];
                            jArr7[i18 + 2] = jArr6[i20];
                            i18 += 3;
                        }
                    }
                    p2Var3.IHQe1A4L2xu = i18;
                    p2Var3.oh6vYeIP = jArr7;
                    p2Var3.r1MBDhnF = jArr6;
                }
                if (sg1Var.r1MBDhnF <= currentTimeMillis) {
                    defpackage.xk0 xk0Var2 = sg1Var.IHQe1A4L2xu;
                    java.lang.Object[] objArr3 = xk0Var2.r1MBDhnF;
                    long[] jArr8 = xk0Var2.IHQe1A4L2xu;
                    int length2 = jArr8.length - 2;
                    if (length2 >= 0) {
                        int i21 = i2;
                        while (true) {
                            long j17 = jArr8[i21];
                            if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                long j18 = j17;
                                for (int i23 = i2; i23 < i22; i23++) {
                                    if ((j18 & j3) < j2) {
                                        for (defpackage.rg1 rg1Var5 = (defpackage.rg1) objArr3[(i21 << 3) + i23]; rg1Var5 != null; rg1Var5 = rg1Var5.F7NU4MC0GW) {
                                        }
                                    }
                                    j18 >>= i;
                                }
                                if (i22 != i) {
                                    break;
                                }
                            }
                            if (i21 == length2) {
                                break;
                            } else {
                                i21++;
                            }
                        }
                    }
                    defpackage.rg1 rg1Var6 = sg1Var.oh6vYeIP;
                    if (rg1Var6 != null) {
                        while (rg1Var6 != null) {
                            rg1Var6 = rg1Var6.F7NU4MC0GW;
                        }
                    }
                    sg1Var.r1MBDhnF = -1L;
                }
                if (sg1Var.r1MBDhnF <= j) {
                    riuEU0zW4();
                    return;
                }
                return;
            }
            p2Var = p2Var2;
            i = 8;
        } else {
            p2Var = p2Var2;
            i = 8;
            j2 = 128;
        }
        j3 = 255;
        if (z) {
        }
        if (this.AARZUJiTa) {
        }
        if (sg1Var.r1MBDhnF <= currentTimeMillis) {
        }
        if (sg1Var.r1MBDhnF <= j) {
        }
    }

    public final long oh6vYeIP(defpackage.ma0 ma0Var) {
        long j;
        int i = ma0Var.xiZrDbcSW0 & 33554431;
        defpackage.p2 p2Var = this.oh6vYeIP;
        long[] jArr = (long[]) p2Var.oh6vYeIP;
        int i2 = p2Var.IHQe1A4L2xu;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & 33554431) == i) {
                j = jArr[i3];
                break;
            }
        }
        j = Long.MAX_VALUE;
        if (j == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((int) j) & 4294967295L) | (((int) (j >> 32)) << 32);
    }

    public final void riuEU0zW4() {
        defpackage.h0 h0Var = this.EXtogiMhuM;
        boolean z = h0Var != null;
        long j = this.r1MBDhnF.r1MBDhnF;
        if (j >= 0 || !z) {
            if (this.riuEU0zW4 == j && z) {
                return;
            }
            defpackage.v0 v0Var = this.IHQe1A4L2xu;
            if (h0Var != null) {
                v0Var.removeCallbacks(h0Var);
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long max = java.lang.Math.max(j, 16 + currentTimeMillis);
            this.riuEU0zW4 = max;
            defpackage.h0 h0Var2 = new defpackage.h0(0, this.SH1y5HwkJhh);
            v0Var.postDelayed(h0Var2, max - currentTimeMillis);
            this.EXtogiMhuM = h0Var2;
        }
    }

    public final void xiZrDbcSW0(defpackage.ma0 ma0Var) {
        long j;
        boolean yIx6ChFVk = ma0Var.yIx6ChFVk();
        defpackage.ep0 ep0Var = ma0Var.yIx6ChFVk;
        if (yIx6ChFVk && ma0Var.SH1y5HwkJhh) {
            defpackage.ma0 V7bD7b8KA = ma0Var.V7bD7b8KA();
            if (V7bD7b8KA == null || V7bD7b8KA.AARZUJiTa) {
                j = V7bD7b8KA == null ? 0L : 9223372034707292159L;
            } else {
                if (V7bD7b8KA.riuEU0zW4) {
                    V7bD7b8KA.riuEU0zW4 = false;
                    V7bD7b8KA.EXtogiMhuM = adDC3e2L(V7bD7b8KA);
                }
                j = V7bD7b8KA.EXtogiMhuM;
            }
            defpackage.ip0 ip0Var = ep0Var.F7NU4MC0GW;
            if (defpackage.z60.IHQe1A4L2xu(j, 9223372034707292159L) || r1MBDhnF(ip0Var)) {
                F7NU4MC0GW(ma0Var);
            } else if (ma0Var.AARZUJiTa) {
                F7NU4MC0GW(ma0Var);
                EXtogiMhuM(ma0Var);
            } else {
                long r1MBDhnF = defpackage.z60.r1MBDhnF(j, ip0Var.v5iciZok);
                defpackage.hi0 hi0Var = ma0Var.wll2JLbTBC2.QoRHpC4k;
                int nVhUznk1t = hi0Var.nVhUznk1t();
                int QUKZkWRtw6 = hi0Var.QUKZkWRtw6();
                int i = ma0Var.xiZrDbcSW0;
                boolean z = ma0Var.ez2rX8ReCYw;
                defpackage.p2 p2Var = this.oh6vYeIP;
                long j2 = 4294967295L;
                if (!z) {
                    ma0Var.ez2rX8ReCYw = true;
                    boolean F7NU4MC0GW = ep0Var.F7NU4MC0GW(1024);
                    boolean F7NU4MC0GW2 = ep0Var.F7NU4MC0GW(16);
                    boolean IHQe1A4L2xu = this.r1MBDhnF.IHQe1A4L2xu.IHQe1A4L2xu(i);
                    if (V7bD7b8KA != null) {
                        int i2 = V7bD7b8KA.xiZrDbcSW0;
                        int i3 = (int) (r1MBDhnF >> 32);
                        int i4 = (int) (r1MBDhnF & 4294967295L);
                        int i5 = i & 33554431;
                        long[] jArr = (long[]) p2Var.oh6vYeIP;
                        int i6 = p2Var.IHQe1A4L2xu - 3;
                        while (true) {
                            if (i6 < 0) {
                                break;
                            }
                            if ((((int) jArr[i6 + 2]) & 33554431) == i2) {
                                long j3 = jArr[i6];
                                int i7 = ((int) (j3 >> 32)) + i3;
                                int i8 = ((int) j3) + i4;
                                p2Var.F7NU4MC0GW(i5, i7, i8, i7 + nVhUznk1t, i8 + QUKZkWRtw6, i2, F7NU4MC0GW, F7NU4MC0GW2, IHQe1A4L2xu, i6);
                                break;
                            }
                            i6 -= 3;
                        }
                    } else {
                        int i9 = (int) (r1MBDhnF >> 32);
                        int i10 = (int) (r1MBDhnF & 4294967295L);
                        p2Var.F7NU4MC0GW(i, i9, i10, i9 + nVhUznk1t, i10 + QUKZkWRtw6, (r22 & 32) != 0 ? -1 : 0, F7NU4MC0GW, F7NU4MC0GW2, IHQe1A4L2xu, -1);
                    }
                } else if (V7bD7b8KA == null) {
                    int i11 = (int) (r1MBDhnF >> 32);
                    int i12 = (int) (r1MBDhnF & 4294967295L);
                    int i13 = nVhUznk1t + i11;
                    int i14 = i12 + QUKZkWRtw6;
                    int i15 = i & 33554431;
                    long[] jArr2 = (long[]) p2Var.oh6vYeIP;
                    int i16 = p2Var.IHQe1A4L2xu;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= jArr2.length - 2 || i17 >= i16) {
                            break;
                        }
                        int i18 = i17 + 2;
                        long j4 = jArr2[i18];
                        if ((((int) j4) & 33554431) == i15) {
                            long j5 = jArr2[i17];
                            int i19 = i17;
                            jArr2[i19] = (i11 << 32) | (i12 & 4294967295L);
                            jArr2[i19 + 1] = (i13 << 32) | (i14 & 4294967295L);
                            jArr2[i18] = (((j4 >> 63) & 1) << 60) | j4;
                            int i20 = i11 - ((int) (j5 >> 32));
                            int i21 = i12 - ((int) j5);
                            if ((i20 != 0) | (i21 != 0)) {
                                int i22 = defpackage.lz0.oh6vYeIP;
                                p2Var.AARZUJiTa(i20, i21, (j4 & (-1125899873288193L)) | (((i19 + 3) & 33554431) << 25));
                            }
                        } else {
                            i17 += 3;
                        }
                    }
                } else {
                    int i23 = V7bD7b8KA.xiZrDbcSW0;
                    int i24 = (int) (r1MBDhnF >> 32);
                    int i25 = (int) (r1MBDhnF & 4294967295L);
                    int i26 = i & 33554431;
                    long[] jArr3 = (long[]) p2Var.oh6vYeIP;
                    int i27 = p2Var.IHQe1A4L2xu;
                    int i28 = 0;
                    while (true) {
                        if (i28 >= jArr3.length - 2 || i28 >= i27) {
                            break;
                        }
                        long j6 = j2;
                        if ((((int) jArr3[i28 + 2]) & 33554431) == i23) {
                            long j7 = jArr3[i28];
                            int i29 = ((int) (j7 >> 32)) + i24;
                            int i30 = ((int) j7) + i25;
                            int i31 = i29 + nVhUznk1t;
                            int i32 = i30 + QUKZkWRtw6;
                            i28 += 3;
                            while (i28 < jArr3.length - 2 && i28 < i27) {
                                int i33 = i28 + 2;
                                int i34 = i23;
                                int i35 = i24;
                                long j8 = jArr3[i33];
                                int i36 = i25;
                                if ((((int) j8) & 33554431) == i26) {
                                    long j9 = jArr3[i28];
                                    long[] jArr4 = jArr3;
                                    int i37 = i29 - ((int) (j9 >> 32));
                                    int i38 = i30 - ((int) j9);
                                    jArr4[i28] = (i30 & j6) | (i29 << 32);
                                    jArr4[i28 + 1] = (i31 << 32) | (i32 & j6);
                                    jArr4[i33] = j8 | (((j8 >> 63) & 1) << 60);
                                    if (i37 != 0 || i38 != 0) {
                                        int i39 = defpackage.lz0.oh6vYeIP;
                                        p2Var.AARZUJiTa(i37, i38, (j8 & (-1125899873288193L)) | (((i28 + 3) & 33554431) << 25));
                                    }
                                } else {
                                    i28 += 3;
                                    i23 = i34;
                                    i24 = i35;
                                    i25 = i36;
                                }
                            }
                        }
                        i28 += 3;
                        jArr3 = jArr3;
                        j2 = j6;
                        i23 = i23;
                        i24 = i24;
                        i25 = i25;
                    }
                }
            }
            ma0Var.SH1y5HwkJhh = false;
            this.adDC3e2L = true;
            riuEU0zW4();
        }
    }
}
