package defpackage;

/* loaded from: classes.dex */
public final class ep0 {
    public defpackage.xl0 AARZUJiTa;
    public defpackage.xl0 EXtogiMhuM;
    public defpackage.ip0 F7NU4MC0GW;
    public final defpackage.ma0 IHQe1A4L2xu;
    public defpackage.cp0 SH1y5HwkJhh;
    public final defpackage.te1 adDC3e2L;
    public final defpackage.dp0 oh6vYeIP;
    public final defpackage.d60 r1MBDhnF;
    public final defpackage.xl0 riuEU0zW4;
    public defpackage.lj0 xiZrDbcSW0;

    public ep0(defpackage.ma0 ma0Var) {
        this.IHQe1A4L2xu = ma0Var;
        defpackage.dp0 dp0Var = new defpackage.dp0();
        dp0Var.EXtogiMhuM = -1;
        this.oh6vYeIP = dp0Var;
        defpackage.d60 d60Var = new defpackage.d60(ma0Var);
        this.r1MBDhnF = d60Var;
        this.F7NU4MC0GW = d60Var;
        defpackage.te1 te1Var = d60Var.EoOhNTTfIN7K;
        this.adDC3e2L = te1Var;
        this.xiZrDbcSW0 = te1Var;
        this.riuEU0zW4 = new defpackage.xl0(new defpackage.mj0[16]);
    }

    public static void EXtogiMhuM(defpackage.kj0 kj0Var, defpackage.kj0 kj0Var2, defpackage.lj0 lj0Var) {
        if ((kj0Var instanceof defpackage.qj0) && (kj0Var2 instanceof defpackage.qj0)) {
            lj0Var.getClass();
            ((defpackage.qj0) kj0Var2).adDC3e2L(lj0Var);
            if (lj0Var.kd6TUFXn) {
                defpackage.jp0.r1MBDhnF(lj0Var);
                return;
            } else {
                lj0Var.SyNS6RMn = true;
                return;
            }
        }
        if (!(lj0Var instanceof defpackage.u7)) {
            defpackage.x50.oh6vYeIP("Unknown Modifier.Node type");
            return;
        }
        defpackage.u7 u7Var = (defpackage.u7) lj0Var;
        boolean z = u7Var.kd6TUFXn;
        if (z) {
            if (!z) {
                defpackage.x50.oh6vYeIP("unInitializeModifier called on unattached node");
            }
            if ((u7Var.AARZUJiTa & 8) != 0) {
                ((defpackage.v0) defpackage.w70.frpfPPIgqM9O(u7Var)).C0U8sNJm();
            }
        }
        u7Var.EgCjBq0SZwJ = kj0Var2;
        u7Var.AARZUJiTa = defpackage.jp0.F7NU4MC0GW(kj0Var2);
        if (u7Var.kd6TUFXn) {
            u7Var.UVjEelCZ(false);
        }
        if (lj0Var.kd6TUFXn) {
            defpackage.jp0.r1MBDhnF(lj0Var);
        } else {
            lj0Var.SyNS6RMn = true;
        }
    }

    public static final void IHQe1A4L2xu(defpackage.ep0 ep0Var, defpackage.lj0 lj0Var, defpackage.ip0 ip0Var) {
        for (defpackage.lj0 lj0Var2 = lj0Var.riuEU0zW4; lj0Var2 != null; lj0Var2 = lj0Var2.riuEU0zW4) {
            if (lj0Var2 == ep0Var.oh6vYeIP) {
                defpackage.ma0 V7bD7b8KA = ep0Var.IHQe1A4L2xu.V7bD7b8KA();
                ip0Var.kNAkVymC = V7bD7b8KA != null ? V7bD7b8KA.yIx6ChFVk.r1MBDhnF : null;
                ep0Var.F7NU4MC0GW = ip0Var;
                return;
            } else {
                if ((lj0Var2.AARZUJiTa & 2) != 0) {
                    return;
                }
                lj0Var2.xWQVQvEdoGv(ip0Var);
            }
        }
    }

    public static defpackage.lj0 oh6vYeIP(defpackage.kj0 kj0Var, defpackage.lj0 lj0Var) {
        defpackage.lj0 lj0Var2;
        if (kj0Var instanceof defpackage.qj0) {
            lj0Var2 = ((defpackage.qj0) kj0Var).F7NU4MC0GW();
            lj0Var2.AARZUJiTa = defpackage.jp0.xiZrDbcSW0(lj0Var2);
        } else {
            defpackage.u7 u7Var = new defpackage.u7();
            u7Var.AARZUJiTa = defpackage.jp0.F7NU4MC0GW(kj0Var);
            u7Var.EgCjBq0SZwJ = kj0Var;
            new java.util.HashSet();
            lj0Var2 = u7Var;
        }
        if (lj0Var2.kd6TUFXn) {
            defpackage.x50.oh6vYeIP("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        lj0Var2.DFo87pBq1E5 = true;
        defpackage.lj0 lj0Var3 = lj0Var.SH1y5HwkJhh;
        if (lj0Var3 != null) {
            lj0Var3.riuEU0zW4 = lj0Var2;
            lj0Var2.SH1y5HwkJhh = lj0Var3;
        }
        lj0Var.SH1y5HwkJhh = lj0Var2;
        lj0Var2.riuEU0zW4 = lj0Var;
        return lj0Var2;
    }

    public static defpackage.lj0 r1MBDhnF(defpackage.lj0 lj0Var) {
        boolean z = lj0Var.kd6TUFXn;
        if (z) {
            defpackage.fl0 fl0Var = defpackage.jp0.IHQe1A4L2xu;
            if (!z) {
                defpackage.x50.oh6vYeIP("autoInvalidateRemovedNode called on unattached node");
            }
            defpackage.jp0.IHQe1A4L2xu(lj0Var, -1, 2);
            lj0Var.Ay906ovssqgN();
            lj0Var.k3hcgHS3MP();
        }
        defpackage.lj0 lj0Var2 = lj0Var.SH1y5HwkJhh;
        defpackage.lj0 lj0Var3 = lj0Var.riuEU0zW4;
        if (lj0Var2 != null) {
            lj0Var2.riuEU0zW4 = lj0Var3;
            lj0Var.SH1y5HwkJhh = null;
        }
        if (lj0Var3 != null) {
            lj0Var3.SH1y5HwkJhh = lj0Var2;
            lj0Var.riuEU0zW4 = null;
        }
        lj0Var3.getClass();
        return lj0Var3;
    }

    public final void AARZUJiTa() {
        defpackage.ma0 ma0Var;
        defpackage.fa0 fa0Var;
        defpackage.lj0 lj0Var = this.adDC3e2L.riuEU0zW4;
        defpackage.ip0 ip0Var = this.r1MBDhnF;
        defpackage.lj0 lj0Var2 = lj0Var;
        while (true) {
            ma0Var = this.IHQe1A4L2xu;
            if (lj0Var2 == null) {
                break;
            }
            defpackage.da0 JlrlGoKF = defpackage.w70.JlrlGoKF(lj0Var2);
            if (JlrlGoKF != null) {
                defpackage.ip0 ip0Var2 = lj0Var2.JlrlGoKF;
                if (ip0Var2 != null) {
                    defpackage.fa0 fa0Var2 = (defpackage.fa0) ip0Var2;
                    defpackage.da0 da0Var = fa0Var2.EoOhNTTfIN7K;
                    fa0Var2.t2LXIqmbaC5(JlrlGoKF);
                    fa0Var = fa0Var2;
                    if (da0Var != lj0Var2) {
                        defpackage.ss0 ss0Var = fa0Var2.hkbnNdmy;
                        fa0Var = fa0Var2;
                        if (ss0Var != null) {
                            ((defpackage.t20) ss0Var).r1MBDhnF();
                            fa0Var = fa0Var2;
                        }
                    }
                } else {
                    defpackage.fa0 fa0Var3 = new defpackage.fa0(ma0Var, JlrlGoKF);
                    lj0Var2.xWQVQvEdoGv(fa0Var3);
                    fa0Var = fa0Var3;
                }
                ip0Var.kNAkVymC = fa0Var;
                fa0Var.fnWB2E7cs = ip0Var;
                ip0Var = fa0Var;
            } else {
                lj0Var2.xWQVQvEdoGv(ip0Var);
            }
            lj0Var2 = lj0Var2.riuEU0zW4;
        }
        defpackage.ma0 V7bD7b8KA = ma0Var.V7bD7b8KA();
        ip0Var.kNAkVymC = V7bD7b8KA != null ? V7bD7b8KA.yIx6ChFVk.r1MBDhnF : null;
        this.F7NU4MC0GW = ip0Var;
    }

    public final boolean F7NU4MC0GW(int i) {
        return (this.xiZrDbcSW0.EXtogiMhuM & i) != 0;
    }

    public final void adDC3e2L() {
        for (defpackage.lj0 lj0Var = this.xiZrDbcSW0; lj0Var != null; lj0Var = lj0Var.SH1y5HwkJhh) {
            lj0Var.seT5W8IHOge();
            if (lj0Var.DFo87pBq1E5) {
                defpackage.fl0 fl0Var = defpackage.jp0.IHQe1A4L2xu;
                if (!lj0Var.kd6TUFXn) {
                    defpackage.x50.oh6vYeIP("autoInvalidateInsertedNode called on unattached node");
                }
                defpackage.jp0.IHQe1A4L2xu(lj0Var, -1, 1);
            }
            if (lj0Var.SyNS6RMn) {
                defpackage.jp0.r1MBDhnF(lj0Var);
            }
            lj0Var.DFo87pBq1E5 = false;
            lj0Var.SyNS6RMn = false;
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        defpackage.lj0 lj0Var = this.xiZrDbcSW0;
        defpackage.te1 te1Var = this.adDC3e2L;
        if (lj0Var != te1Var) {
            while (true) {
                if (lj0Var == null || lj0Var == te1Var) {
                    break;
                }
                sb.append(java.lang.String.valueOf(lj0Var));
                if (lj0Var.SH1y5HwkJhh == te1Var) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                lj0Var = lj0Var.SH1y5HwkJhh;
            }
        } else {
            sb.append("]");
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018f, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0194, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x019e, code lost:
    
        if (r14 <= r7) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a0, code lost:
    
        if (r11 <= r15) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a2, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ae, code lost:
    
        if (r0.IHQe1A4L2xu(r14 - 1, r27 - 1) == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b0, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bb, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bf, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c1, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c3, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c5, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cb, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01cd, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0262, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01b7, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0192, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x018b, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0179, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x016c, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0177, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0268, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0152, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ce, code lost:
    
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0148, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014e, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0150, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0154, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0155, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0157, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0159, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015b, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0169, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x016e, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0180, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0186, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0188, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018d, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void xiZrDbcSW0(int i, defpackage.xl0 xl0Var, defpackage.xl0 xl0Var2, defpackage.lj0 lj0Var, boolean z) {
        int i2;
        defpackage.xl0 xl0Var3;
        defpackage.xl0 xl0Var4;
        int i3;
        int[] iArr;
        int[] iArr2;
        char c;
        char c2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        defpackage.cp0 cp0Var = this.SH1y5HwkJhh;
        if (cp0Var == null) {
            i2 = i;
            xl0Var3 = xl0Var;
            xl0Var4 = xl0Var2;
            cp0Var = new defpackage.cp0(this, lj0Var, i2, xl0Var3, xl0Var4, z);
            this.SH1y5HwkJhh = cp0Var;
        } else {
            i2 = i;
            xl0Var3 = xl0Var;
            xl0Var4 = xl0Var2;
            cp0Var.IHQe1A4L2xu = lj0Var;
            cp0Var.oh6vYeIP = i2;
            cp0Var.r1MBDhnF = xl0Var3;
            cp0Var.F7NU4MC0GW = xl0Var4;
            cp0Var.adDC3e2L = z;
        }
        defpackage.ep0 ep0Var = cp0Var.xiZrDbcSW0;
        int i9 = xl0Var3.AARZUJiTa - i2;
        int i10 = xl0Var4.AARZUJiTa - i2;
        char c3 = 2;
        int i11 = ((i9 + i10) + 1) / 2;
        defpackage.k70 k70Var = new defpackage.k70(i11 * 3);
        defpackage.k70 k70Var2 = new defpackage.k70(i11 * 4);
        int i12 = 0;
        k70Var2.adDC3e2L(0, i9, 0, i10);
        int i13 = (i11 * 2) + 1;
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[5];
        while (true) {
            int i14 = k70Var2.oh6vYeIP;
            if (i14 == 0) {
                break;
            }
            char c4 = c3;
            int[] iArr6 = k70Var2.IHQe1A4L2xu;
            int i15 = i12;
            int i16 = i14 - 1;
            k70Var2.oh6vYeIP = i16;
            int i17 = iArr6[i16];
            int i18 = i14 - 2;
            k70Var2.oh6vYeIP = i18;
            int i19 = iArr6[i18];
            int i20 = i14 - 3;
            k70Var2.oh6vYeIP = i20;
            int i21 = iArr6[i20];
            int i22 = i14 - 4;
            k70Var2.oh6vYeIP = i22;
            int i23 = iArr6[i22];
            int i24 = i21 - i23;
            int i25 = i13;
            int i26 = i17 - i19;
            int[] iArr7 = iArr3;
            if (i24 >= 1 && i26 >= 1) {
                int i27 = 1;
                int i28 = ((i24 + i26) + 1) / 2;
                int i29 = i25 / 2;
                int i30 = i29 + 1;
                iArr7[i30] = i23;
                iArr4[i30] = i21;
                int i31 = i15;
                while (i31 < i28) {
                    int i32 = i24 - i26;
                    int i33 = i28;
                    iArr = iArr4;
                    int i34 = -i31;
                    int i35 = (java.lang.Math.abs(i32) & 1) == i27 ? 1 : i15;
                    int i36 = i34;
                    while (true) {
                        if (i36 > i31) {
                            break;
                        }
                        if (i36 != i34) {
                            if (i36 != i31) {
                                i4 = i36;
                                iArr2 = iArr5;
                            } else {
                                i4 = i36;
                                iArr2 = iArr5;
                            }
                            i5 = iArr7[(i4 - 1) + i29];
                            i6 = i5 + 1;
                            int i37 = ((i6 - i23) + i19) - i4;
                            int i38 = i37 - ((i31 == 0 ? 1 : i15) & (i6 != i5 ? 1 : i15));
                            int i39 = i5;
                            i7 = i37;
                            while (i6 < i21 && i7 < i17 && cp0Var.IHQe1A4L2xu(i6, i7)) {
                                i6++;
                                i7++;
                            }
                            iArr7[i29 + i4] = i6;
                            if (i35 == 0) {
                                int i40 = i7;
                                int i41 = i32 - i4;
                                i8 = i24;
                                if (i41 >= i34 + 1 && i41 <= i31 - 1 && iArr[i29 + i41] <= i6) {
                                    iArr2[i15] = i39;
                                    iArr2[1] = i38;
                                    iArr2[c4] = i6;
                                    iArr2[3] = i40;
                                    iArr2[4] = i15;
                                    c = 1;
                                    break;
                                }
                            } else {
                                i8 = i24;
                            }
                            i36 = i4 + 2;
                            iArr5 = iArr2;
                            i24 = i8;
                        } else {
                            i4 = i36;
                            iArr2 = iArr5;
                        }
                        i5 = iArr7[i4 + 1 + i29];
                        i6 = i5;
                        int i372 = ((i6 - i23) + i19) - i4;
                        int i382 = i372 - ((i31 == 0 ? 1 : i15) & (i6 != i5 ? 1 : i15));
                        int i392 = i5;
                        i7 = i372;
                        while (i6 < i21) {
                            i6++;
                            i7++;
                        }
                        iArr7[i29 + i4] = i6;
                        if (i35 == 0) {
                        }
                        i36 = i4 + 2;
                        iArr5 = iArr2;
                        i24 = i8;
                    }
                    if (java.lang.Math.min(iArr2[c4] - iArr2[i15], iArr2[3] - iArr2[c]) > 0) {
                        int i42 = iArr2[i15];
                        int i43 = iArr2[c];
                        int i44 = iArr2[3] - i43;
                        int i45 = iArr2[c4] - i42;
                        if (i44 != i45) {
                            i45 = java.lang.Math.min(i45, i44);
                            int i46 = iArr2[4];
                            int i47 = i46 != 0 ? 1 : i15;
                            int i48 = iArr2[3];
                            c2 = 1;
                            int i49 = iArr2[1];
                            int i50 = i48 - i49;
                            int i51 = iArr2[c4];
                            int i52 = iArr2[i15];
                            int i53 = i42 + (((i50 > i51 - i52 ? 1 : i15) | i47) ^ 1);
                            i43 += (((i48 - i49 > i51 - i52 ? 1 : i15) ^ 1) | (i46 != 0 ? 1 : i15)) ^ 1;
                            i42 = i53;
                        } else {
                            c2 = 1;
                        }
                        k70Var.F7NU4MC0GW(i42, i43, i45);
                    } else {
                        c2 = c;
                    }
                    k70Var2.adDC3e2L(i23, iArr2[i15], i19, iArr2[c2]);
                    k70Var2.adDC3e2L(iArr2[c4], i21, iArr2[3], i17);
                    c3 = c4;
                    i12 = i15;
                    i13 = i25;
                    iArr3 = iArr7;
                    iArr4 = iArr;
                    iArr5 = iArr2;
                }
            }
            iArr = iArr4;
            iArr2 = iArr5;
            c3 = c4;
            i12 = i15;
            i13 = i25;
            iArr3 = iArr7;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int i54 = i12;
        int i55 = k70Var.oh6vYeIP;
        if (i55 % 3 != 0) {
            defpackage.x50.oh6vYeIP("Array size not a multiple of 3");
        }
        if (i55 > 3) {
            i3 = i54;
            k70Var.xiZrDbcSW0(i3, i55 - 3);
        } else {
            i3 = i54;
        }
        k70Var.F7NU4MC0GW(i9, i10, i3);
        int i56 = i3;
        int i57 = i56;
        int i58 = i57;
        while (i56 < k70Var.oh6vYeIP) {
            int[] iArr8 = k70Var.IHQe1A4L2xu;
            int i59 = iArr8[i56];
            int i60 = iArr8[i56 + 2];
            int i61 = i59 - i60;
            int i62 = iArr8[i56 + 1] - i60;
            i56 += 3;
            while (i57 < i61) {
                defpackage.lj0 lj0Var2 = cp0Var.IHQe1A4L2xu.SH1y5HwkJhh;
                lj0Var2.getClass();
                if ((lj0Var2.AARZUJiTa & 2) != 0) {
                    defpackage.ip0 ip0Var = lj0Var2.JlrlGoKF;
                    ip0Var.getClass();
                    defpackage.ip0 ip0Var2 = ip0Var.kNAkVymC;
                    defpackage.ip0 ip0Var3 = ip0Var.fnWB2E7cs;
                    ip0Var3.getClass();
                    if (ip0Var2 != null) {
                        ip0Var2.fnWB2E7cs = ip0Var3;
                    }
                    ip0Var3.kNAkVymC = ip0Var2;
                    IHQe1A4L2xu(ep0Var, cp0Var.IHQe1A4L2xu, ip0Var3);
                }
                cp0Var.IHQe1A4L2xu = r1MBDhnF(lj0Var2);
                i57++;
            }
            while (i58 < i62) {
                defpackage.lj0 oh6vYeIP = oh6vYeIP((defpackage.kj0) cp0Var.F7NU4MC0GW.adDC3e2L[cp0Var.oh6vYeIP + i58], cp0Var.IHQe1A4L2xu);
                cp0Var.IHQe1A4L2xu = oh6vYeIP;
                if (cp0Var.adDC3e2L) {
                    defpackage.lj0 lj0Var3 = oh6vYeIP.SH1y5HwkJhh;
                    lj0Var3.getClass();
                    defpackage.ip0 ip0Var4 = lj0Var3.JlrlGoKF;
                    ip0Var4.getClass();
                    defpackage.da0 JlrlGoKF = defpackage.w70.JlrlGoKF(cp0Var.IHQe1A4L2xu);
                    if (JlrlGoKF != null) {
                        defpackage.fa0 fa0Var = new defpackage.fa0(ep0Var.IHQe1A4L2xu, JlrlGoKF);
                        cp0Var.IHQe1A4L2xu.xWQVQvEdoGv(fa0Var);
                        IHQe1A4L2xu(ep0Var, cp0Var.IHQe1A4L2xu, fa0Var);
                        fa0Var.kNAkVymC = ip0Var4.kNAkVymC;
                        fa0Var.fnWB2E7cs = ip0Var4;
                        ip0Var4.kNAkVymC = fa0Var;
                    } else {
                        cp0Var.IHQe1A4L2xu.xWQVQvEdoGv(ip0Var4);
                    }
                    cp0Var.IHQe1A4L2xu.flIYPhR0();
                    cp0Var.IHQe1A4L2xu.seT5W8IHOge();
                    defpackage.lj0 lj0Var4 = cp0Var.IHQe1A4L2xu;
                    defpackage.fl0 fl0Var = defpackage.jp0.IHQe1A4L2xu;
                    if (!lj0Var4.kd6TUFXn) {
                        defpackage.x50.oh6vYeIP("autoInvalidateInsertedNode called on unattached node");
                    }
                    defpackage.jp0.IHQe1A4L2xu(lj0Var4, -1, 1);
                } else {
                    oh6vYeIP.DFo87pBq1E5 = true;
                }
                i58++;
            }
            while (true) {
                int i63 = i60 - 1;
                if (i60 > 0) {
                    defpackage.lj0 lj0Var5 = cp0Var.IHQe1A4L2xu.SH1y5HwkJhh;
                    lj0Var5.getClass();
                    cp0Var.IHQe1A4L2xu = lj0Var5;
                    defpackage.xl0 xl0Var5 = cp0Var.r1MBDhnF;
                    int i64 = cp0Var.oh6vYeIP;
                    defpackage.kj0 kj0Var = (defpackage.kj0) xl0Var5.adDC3e2L[i64 + i57];
                    defpackage.kj0 kj0Var2 = (defpackage.kj0) cp0Var.F7NU4MC0GW.adDC3e2L[i64 + i58];
                    if (!defpackage.x70.QoRHpC4k(kj0Var, kj0Var2)) {
                        EXtogiMhuM(kj0Var, kj0Var2, cp0Var.IHQe1A4L2xu);
                    }
                    i57++;
                    i58++;
                    i60 = i63;
                }
            }
        }
        int i65 = i3;
        for (defpackage.lj0 lj0Var6 = this.adDC3e2L.riuEU0zW4; lj0Var6 != null && lj0Var6 != this.oh6vYeIP; lj0Var6 = lj0Var6.riuEU0zW4) {
            i65 |= lj0Var6.AARZUJiTa;
            lj0Var6.EXtogiMhuM = i65;
        }
    }
}
