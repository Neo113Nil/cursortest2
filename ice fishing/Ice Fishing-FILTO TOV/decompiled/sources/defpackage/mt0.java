package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class mt0 {
    public boolean AvO7iQsrTN;
    public boolean EljAMC1QTz;
    public final c GWasM1elztuh;
    public final d3 JFJ3QoxA;
    public boolean OOA6hdeuvCS;
    public final j91 X1lG3V04pd;
    public final x0 Yi7zF1RB1;
    public AiiPg05cpff encWxUiV2;
    public long mOu10nynGul;
    public final gg0 rQPn8YBR;
    public final ag0 xqGvceK5x;

    public mt0(c cVar) {
        this.GWasM1elztuh = cVar;
        x0 x0Var = new x0();
        x0Var.Yi7zF1RB1 = new long[192];
        x0Var.X1lG3V04pd = new long[192];
        this.Yi7zF1RB1 = x0Var;
        this.X1lG3V04pd = new j91();
        this.xqGvceK5x = new ag0();
        this.mOu10nynGul = -1L;
        this.JFJ3QoxA = new d3(9, this);
        this.rQPn8YBR = new gg0();
    }

    public static long OOA6hdeuvCS(g60 g60Var) {
        xj0 xj0Var = g60Var.A1EKNP6CxJ;
        bk0 bk0Var = xj0Var.xqGvceK5x;
        long j = 0;
        for (bk0 bk0Var2 = xj0Var.X1lG3V04pd; bk0Var2 != null && bk0Var2 != bk0Var; bk0Var2 = bk0Var2.Y6hRI1cF8) {
            if (X1lG3V04pd(bk0Var2)) {
                return 9223372034707292159L;
            }
            j = u20.X1lG3V04pd(j, bk0Var2.EXrPz3p7hFb);
        }
        return j;
    }

    public static boolean X1lG3V04pd(bk0 bk0Var) {
        fn0 fn0Var = bk0Var.VeqTn1PQw7;
        return (fn0Var == null || n4.uFEq9NpZ(((ry) fn0Var).Yi7zF1RB1())) ? false : true;
    }

    public static void encWxUiV2(g60 g60Var) {
        if (!g60Var.AvO7iQsrTN || X1lG3V04pd(g60Var.A1EKNP6CxJ.xqGvceK5x)) {
            return;
        }
        g60Var.AvO7iQsrTN = false;
        if (g60Var.mOu10nynGul) {
            g60Var.encWxUiV2 = OOA6hdeuvCS(g60Var);
            g60Var.mOu10nynGul = false;
        }
        if (u20.GWasM1elztuh(g60Var.encWxUiV2, 9223372034707292159L)) {
            return;
        }
        rg0 arNh8D4Z5gB = g60Var.arNh8D4Z5gB();
        Object[] objArr = arNh8D4Z5gB.OOA6hdeuvCS;
        int i = arNh8D4Z5gB.AvO7iQsrTN;
        for (int i2 = 0; i2 < i; i2++) {
            encWxUiV2((g60) objArr[i2]);
        }
    }

    public final void AvO7iQsrTN(g60 g60Var) {
        if (g60Var.rQPn8YBR) {
            int i = g60Var.EljAMC1QTz & 33554431;
            x0 x0Var = this.Yi7zF1RB1;
            long[] jArr = (long[]) x0Var.Yi7zF1RB1;
            int i2 = x0Var.GWasM1elztuh;
            int i3 = 0;
            while (true) {
                if (i3 >= jArr.length - 2 || i3 >= i2) {
                    break;
                }
                int i4 = i3 + 2;
                if ((((int) jArr[i4]) & 33554431) == i) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                    jArr[i4] = lt0.GWasM1elztuh;
                    break;
                }
                i3 += 3;
            }
            g60Var.rQPn8YBR = false;
            g60Var.JFJ3QoxA = true;
            this.OOA6hdeuvCS = true;
            this.AvO7iQsrTN = true;
        }
    }

    public final void EljAMC1QTz(g60 g60Var) {
        long j;
        boolean A1EKNP6CxJ = g60Var.A1EKNP6CxJ();
        xj0 xj0Var = g60Var.A1EKNP6CxJ;
        if (A1EKNP6CxJ && g60Var.JFJ3QoxA) {
            g60 cilMamHF = g60Var.cilMamHF();
            if (cilMamHF == null || cilMamHF.AvO7iQsrTN) {
                j = cilMamHF == null ? 0L : 9223372034707292159L;
            } else {
                if (cilMamHF.mOu10nynGul) {
                    cilMamHF.mOu10nynGul = false;
                    cilMamHF.encWxUiV2 = OOA6hdeuvCS(cilMamHF);
                }
                j = cilMamHF.encWxUiV2;
            }
            bk0 bk0Var = xj0Var.xqGvceK5x;
            if (u20.GWasM1elztuh(j, 9223372034707292159L) || X1lG3V04pd(bk0Var)) {
                xqGvceK5x(g60Var);
            } else if (g60Var.AvO7iQsrTN) {
                xqGvceK5x(g60Var);
                encWxUiV2(g60Var);
            } else {
                long X1lG3V04pd = u20.X1lG3V04pd(j, bk0Var.EXrPz3p7hFb);
                ad0 ad0Var = g60Var.MZhzXH72.WIEu4Ya2g8;
                int JFXS9W1rB5s4 = ad0Var.JFXS9W1rB5s4();
                int ZCWXqiC0 = ad0Var.ZCWXqiC0();
                int i = g60Var.EljAMC1QTz;
                boolean z = g60Var.rQPn8YBR;
                x0 x0Var = this.Yi7zF1RB1;
                long j2 = 4294967295L;
                if (!z) {
                    g60Var.rQPn8YBR = true;
                    boolean xqGvceK5x = xj0Var.xqGvceK5x(1024);
                    boolean xqGvceK5x2 = xj0Var.xqGvceK5x(16);
                    boolean GWasM1elztuh = this.X1lG3V04pd.GWasM1elztuh.GWasM1elztuh(i);
                    if (cilMamHF != null) {
                        int i2 = cilMamHF.EljAMC1QTz;
                        int i3 = (int) (X1lG3V04pd >> 32);
                        int i4 = (int) (X1lG3V04pd & 4294967295L);
                        int i5 = i & 33554431;
                        long[] jArr = (long[]) x0Var.Yi7zF1RB1;
                        int i6 = x0Var.GWasM1elztuh - 3;
                        while (true) {
                            if (i6 < 0) {
                                break;
                            }
                            if ((((int) jArr[i6 + 2]) & 33554431) == i2) {
                                long j3 = jArr[i6];
                                int i7 = ((int) (j3 >> 32)) + i3;
                                int i8 = ((int) j3) + i4;
                                x0Var.X1lG3V04pd(i5, i7, i8, i7 + JFXS9W1rB5s4, i8 + ZCWXqiC0, i2, xqGvceK5x, xqGvceK5x2, GWasM1elztuh, i6);
                                break;
                            }
                            i6 -= 3;
                        }
                    } else {
                        int i9 = (int) (X1lG3V04pd >> 32);
                        int i10 = (int) (X1lG3V04pd & 4294967295L);
                        x0Var.X1lG3V04pd(i, i9, i10, i9 + JFXS9W1rB5s4, i10 + ZCWXqiC0, (r22 & 32) != 0 ? -1 : 0, xqGvceK5x, xqGvceK5x2, GWasM1elztuh, -1);
                    }
                } else if (cilMamHF == null) {
                    int i11 = (int) (X1lG3V04pd >> 32);
                    int i12 = (int) (X1lG3V04pd & 4294967295L);
                    int i13 = JFXS9W1rB5s4 + i11;
                    int i14 = i12 + ZCWXqiC0;
                    int i15 = i & 33554431;
                    long[] jArr2 = (long[]) x0Var.Yi7zF1RB1;
                    int i16 = x0Var.GWasM1elztuh;
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
                                int i22 = lt0.Yi7zF1RB1;
                                x0Var.EljAMC1QTz(i20, i21, (j4 & (-1125899873288193L)) | (((i19 + 3) & 33554431) << 25));
                            }
                        } else {
                            i17 += 3;
                        }
                    }
                } else {
                    int i23 = cilMamHF.EljAMC1QTz;
                    int i24 = (int) (X1lG3V04pd >> 32);
                    int i25 = (int) (X1lG3V04pd & 4294967295L);
                    int i26 = i & 33554431;
                    long[] jArr3 = (long[]) x0Var.Yi7zF1RB1;
                    int i27 = x0Var.GWasM1elztuh;
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
                            int i31 = i29 + JFXS9W1rB5s4;
                            int i32 = i30 + ZCWXqiC0;
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
                                        int i39 = lt0.Yi7zF1RB1;
                                        x0Var.EljAMC1QTz(i37, i38, (j8 & (-1125899873288193L)) | (((i28 + 3) & 33554431) << 25));
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
            g60Var.JFJ3QoxA = false;
            this.OOA6hdeuvCS = true;
            mOu10nynGul();
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
    public final void GWasM1elztuh() {
        boolean z;
        long j;
        x0 x0Var;
        int i;
        long j2;
        long j3;
        int i2;
        long[] jArr;
        long j4;
        long j5;
        AiiPg05cpff aiiPg05cpff = this.encWxUiV2;
        if (aiiPg05cpff != null) {
            this.GWasM1elztuh.removeCallbacks(aiiPg05cpff);
            this.encWxUiV2 = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this.OOA6hdeuvCS;
        boolean z3 = z2 || this.EljAMC1QTz;
        x0 x0Var2 = this.Yi7zF1RB1;
        boolean z4 = true;
        j91 j91Var = this.X1lG3V04pd;
        if (z2) {
            this.OOA6hdeuvCS = false;
            ag0 ag0Var = this.xqGvceK5x;
            Object[] objArr = ag0Var.GWasM1elztuh;
            int i3 = ag0Var.Yi7zF1RB1;
            for (int i4 = 0; i4 < i3; i4++) {
                ((wu) objArr[i4]).GWasM1elztuh();
            }
            long[] jArr2 = (long[]) x0Var2.Yi7zF1RB1;
            int i5 = x0Var2.GWasM1elztuh;
            int i6 = 0;
            while (i6 < jArr2.length - 2 && i6 < i5) {
                long j6 = jArr2[i6 + 2];
                boolean z5 = z4;
                int i7 = i5;
                if ((((int) (j6 >> 60)) & 1) != 0) {
                    long j7 = jArr2[i6];
                    long j8 = jArr2[i6 + 1];
                    i91 i91Var = (i91) j91Var.GWasM1elztuh.Yi7zF1RB1(((int) j6) & 33554431);
                    while (i91Var != null) {
                        i91 i91Var2 = i91Var.xqGvceK5x;
                        boolean z6 = z3;
                        long j9 = i91Var.AvO7iQsrTN;
                        boolean z7 = (currentTimeMillis - j9 >= 0 || j9 == Long.MIN_VALUE) ? z5 : false;
                        i91Var.OOA6hdeuvCS = j7;
                        i91Var.EljAMC1QTz = j8;
                        if (z7) {
                            i91Var.AvO7iQsrTN = currentTimeMillis;
                            j4 = j7;
                            j5 = j8;
                            i91Var.GWasM1elztuh(j4, j5, j91Var.xqGvceK5x, j91Var.OOA6hdeuvCS, j91Var.AvO7iQsrTN);
                        } else {
                            j4 = j7;
                            j5 = j8;
                        }
                        i91Var = i91Var2;
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
            long[] jArr3 = (long[]) x0Var2.Yi7zF1RB1;
            int i8 = x0Var2.GWasM1elztuh;
            for (int i9 = 0; i9 < jArr3.length - 2 && i9 < i8; i9 += 3) {
                int i10 = i9 + 2;
                jArr3[i10] = jArr3[i10] & (-1152921504606846977L);
            }
        } else {
            z = z3;
            j = 0;
        }
        if (this.EljAMC1QTz) {
            this.EljAMC1QTz = false;
            long j10 = j91Var.xqGvceK5x;
            long j11 = j91Var.OOA6hdeuvCS;
            float[] fArr = j91Var.AvO7iQsrTN;
            rf0 rf0Var = j91Var.GWasM1elztuh;
            j2 = 128;
            Object[] objArr2 = rf0Var.X1lG3V04pd;
            long[] jArr4 = rf0Var.GWasM1elztuh;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i11 = 0;
                int i12 = 8;
                j3 = 255;
                while (true) {
                    long j12 = j10;
                    long j13 = jArr4[i11];
                    int i13 = i12;
                    x0Var = x0Var2;
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i11 - length)) >>> 31);
                        long j14 = j13;
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j14 & 255) < 128) {
                                i91 i91Var3 = (i91) objArr2[(i11 << 3) + i15];
                                while (i91Var3 != null) {
                                    j91Var.GWasM1elztuh(i91Var3, j12, j11, fArr, currentTimeMillis);
                                    i91Var3 = i91Var3.xqGvceK5x;
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
                    x0Var2 = x0Var;
                    jArr4 = jArr;
                }
                if (z) {
                    long j15 = j91Var.xqGvceK5x;
                    long j16 = j91Var.OOA6hdeuvCS;
                    float[] fArr2 = j91Var.AvO7iQsrTN;
                    i91 i91Var4 = j91Var.Yi7zF1RB1;
                    if (i91Var4 != null) {
                        while (i91Var4 != null) {
                            g60 eUH21U3apd = vc0.eUH21U3apd(i91Var4.Yi7zF1RB1);
                            i91Var4.OOA6hdeuvCS = ((c) j60.GWasM1elztuh(eUH21U3apd)).getRectManager().Yi7zF1RB1(eUH21U3apd);
                            ad0 ad0Var = eUH21U3apd.MZhzXH72.WIEu4Ya2g8;
                            i91Var4.EljAMC1QTz = ((ad0Var.OOA6hdeuvCS + ((int) (r12 >> 32))) << 32) | ((ad0Var.EljAMC1QTz + ((int) (r12 & 4294967295L))) & 4294967295L);
                            j91Var.GWasM1elztuh(i91Var4, j15, j16, fArr2, currentTimeMillis);
                            i91Var4 = i91Var4.xqGvceK5x;
                        }
                    }
                }
                if (this.AvO7iQsrTN) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    this.AvO7iQsrTN = false;
                    x0 x0Var3 = x0Var;
                    long[] jArr6 = (long[]) x0Var3.Yi7zF1RB1;
                    int i17 = x0Var3.GWasM1elztuh;
                    long[] jArr7 = (long[]) x0Var3.X1lG3V04pd;
                    int i18 = 0;
                    for (int i19 = 0; i19 < jArr6.length - 2 && i18 < jArr7.length - 2 && i19 < i17; i19 += 3) {
                        int i20 = i19 + 2;
                        if (jArr6[i20] != lt0.GWasM1elztuh) {
                            jArr7[i18] = jArr6[i19];
                            jArr7[i18 + 1] = jArr6[i19 + 1];
                            jArr7[i18 + 2] = jArr6[i20];
                            i18 += 3;
                        }
                    }
                    x0Var3.GWasM1elztuh = i18;
                    x0Var3.Yi7zF1RB1 = jArr7;
                    x0Var3.X1lG3V04pd = jArr6;
                }
                if (j91Var.X1lG3V04pd <= currentTimeMillis) {
                    rf0 rf0Var2 = j91Var.GWasM1elztuh;
                    Object[] objArr3 = rf0Var2.X1lG3V04pd;
                    long[] jArr8 = rf0Var2.GWasM1elztuh;
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
                                        for (i91 i91Var5 = (i91) objArr3[(i21 << 3) + i23]; i91Var5 != null; i91Var5 = i91Var5.xqGvceK5x) {
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
                    i91 i91Var6 = j91Var.Yi7zF1RB1;
                    if (i91Var6 != null) {
                        while (i91Var6 != null) {
                            i91Var6 = i91Var6.xqGvceK5x;
                        }
                    }
                    j91Var.X1lG3V04pd = -1L;
                }
                if (j91Var.X1lG3V04pd <= j) {
                    mOu10nynGul();
                    return;
                }
                return;
            }
            x0Var = x0Var2;
            i = 8;
        } else {
            x0Var = x0Var2;
            i = 8;
            j2 = 128;
        }
        j3 = 255;
        if (z) {
        }
        if (this.AvO7iQsrTN) {
        }
        if (j91Var.X1lG3V04pd <= currentTimeMillis) {
        }
        if (j91Var.X1lG3V04pd <= j) {
        }
    }

    public final long Yi7zF1RB1(g60 g60Var) {
        long j;
        int i = g60Var.EljAMC1QTz & 33554431;
        x0 x0Var = this.Yi7zF1RB1;
        long[] jArr = (long[]) x0Var.Yi7zF1RB1;
        int i2 = x0Var.GWasM1elztuh;
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

    public final void mOu10nynGul() {
        AiiPg05cpff aiiPg05cpff = this.encWxUiV2;
        boolean z = aiiPg05cpff != null;
        long j = this.X1lG3V04pd.X1lG3V04pd;
        if (j >= 0 || !z) {
            if (this.mOu10nynGul == j && z) {
                return;
            }
            c cVar = this.GWasM1elztuh;
            if (aiiPg05cpff != null) {
                cVar.removeCallbacks(aiiPg05cpff);
            }
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j, 16 + currentTimeMillis);
            this.mOu10nynGul = max;
            AiiPg05cpff aiiPg05cpff2 = new AiiPg05cpff(this.JFJ3QoxA, 0);
            cVar.postDelayed(aiiPg05cpff2, max - currentTimeMillis);
            this.encWxUiV2 = aiiPg05cpff2;
        }
    }

    public final void xqGvceK5x(g60 g60Var) {
        boolean z;
        boolean z2 = true;
        g60Var.AvO7iQsrTN = true;
        xj0 xj0Var = g60Var.A1EKNP6CxJ;
        bk0 bk0Var = xj0Var.xqGvceK5x;
        ad0 ad0Var = g60Var.MZhzXH72.WIEu4Ya2g8;
        int JFXS9W1rB5s4 = ad0Var.JFXS9W1rB5s4();
        float ZCWXqiC0 = ad0Var.ZCWXqiC0();
        gg0 gg0Var = this.rQPn8YBR;
        gg0Var.GWasM1elztuh = 0.0f;
        gg0Var.Yi7zF1RB1 = 0.0f;
        gg0Var.X1lG3V04pd = JFXS9W1rB5s4;
        gg0Var.xqGvceK5x = ZCWXqiC0;
        while (true) {
            if (bk0Var == null) {
                break;
            }
            g60 g60Var2 = bk0Var.mE4lRynR;
            if (bk0Var == g60Var2.A1EKNP6CxJ.xqGvceK5x && !g60Var2.AvO7iQsrTN) {
                if (!u20.GWasM1elztuh(Yi7zF1RB1(g60Var2), 9223372034707292159L)) {
                    gg0Var.X1lG3V04pd((Float.floatToRawIntBits((int) (r9 >> 32)) << 32) | (Float.floatToRawIntBits((int) (r9 & 4294967295L)) & 4294967295L));
                    break;
                }
            }
            fn0 fn0Var = bk0Var.VeqTn1PQw7;
            if (fn0Var != null) {
                float[] Yi7zF1RB1 = ((ry) fn0Var).Yi7zF1RB1();
                if (!n4.uFEq9NpZ(Yi7zF1RB1)) {
                    z50.WdrkLMV3xh(Yi7zF1RB1, gg0Var);
                }
            }
            long j = bk0Var.EXrPz3p7hFb;
            gg0Var.X1lG3V04pd((4294967295L & Float.floatToRawIntBits((int) (j & 4294967295L))) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
            bk0Var = bk0Var.Y6hRI1cF8;
        }
        int i = (int) gg0Var.GWasM1elztuh;
        int i2 = (int) gg0Var.Yi7zF1RB1;
        int i3 = (int) gg0Var.X1lG3V04pd;
        int i4 = (int) gg0Var.xqGvceK5x;
        int i5 = g60Var.EljAMC1QTz;
        boolean z3 = g60Var.rQPn8YBR;
        g60Var.rQPn8YBR = true;
        x0 x0Var = this.Yi7zF1RB1;
        if (z3) {
            int i6 = i5 & 33554431;
            long[] jArr = (long[]) x0Var.Yi7zF1RB1;
            int i7 = x0Var.GWasM1elztuh;
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
        g60 cilMamHF = g60Var.cilMamHF();
        x0Var.X1lG3V04pd(i5, i, i2, i3, i4, (r22 & 32) != 0 ? -1 : cilMamHF != null ? cilMamHF.EljAMC1QTz : -1, xj0Var.xqGvceK5x(1024), xj0Var.xqGvceK5x(16), this.X1lG3V04pd.GWasM1elztuh.GWasM1elztuh(i5), -1);
        g60Var.JFJ3QoxA = false;
        this.OOA6hdeuvCS = z;
        rg0 arNh8D4Z5gB = g60Var.arNh8D4Z5gB();
        Object[] objArr = arNh8D4Z5gB.OOA6hdeuvCS;
        int i10 = arNh8D4Z5gB.AvO7iQsrTN;
        for (int i11 = 0; i11 < i10; i11++) {
            g60 g60Var3 = (g60) objArr[i11];
            if (g60Var3.A1EKNP6CxJ()) {
                xqGvceK5x(g60Var3);
            }
        }
    }
}
