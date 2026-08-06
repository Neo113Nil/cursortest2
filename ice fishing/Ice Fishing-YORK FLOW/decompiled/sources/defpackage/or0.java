package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class or0 {
    public defpackage.mr0 GE9mJIPrb8gP;
    public defpackage.sr0 JhCgjQRTAOCT;
    public defpackage.ho0 P05cfTpS5W5L;
    public defpackage.ho0 QiMR8OkAhezm;
    public final defpackage.cj1 WDYagTQQm9ns;
    public final defpackage.jd0 ZpBGe2uQfcn8;
    public final defpackage.ho0 e6mdH7fiFuta;
    public final defpackage.l80 fWTAfUmVKrZq;
    public final defpackage.nr0 giKS3J6vZuNy;
    public defpackage.ul0 oh71FJcDz6S2;

    public or0(defpackage.jd0 jd0Var) {
        this.ZpBGe2uQfcn8 = jd0Var;
        defpackage.nr0 nr0Var = new defpackage.nr0();
        nr0Var.P05cfTpS5W5L = -1;
        this.giKS3J6vZuNy = nr0Var;
        defpackage.l80 l80Var = new defpackage.l80(jd0Var);
        this.fWTAfUmVKrZq = l80Var;
        this.JhCgjQRTAOCT = l80Var;
        defpackage.cj1 cj1Var = l80Var.z16KqenTjq8o;
        this.WDYagTQQm9ns = cj1Var;
        this.oh71FJcDz6S2 = cj1Var;
        this.e6mdH7fiFuta = new defpackage.ho0(new defpackage.vl0[16]);
    }

    public static void P05cfTpS5W5L(defpackage.tl0 tl0Var, defpackage.tl0 tl0Var2, defpackage.ul0 ul0Var) {
        if ((tl0Var instanceof defpackage.zl0) && (tl0Var2 instanceof defpackage.zl0)) {
            ul0Var.getClass();
            ((defpackage.zl0) tl0Var2).oh71FJcDz6S2(ul0Var);
            if (ul0Var.s0TASMVLSWD5) {
                defpackage.tr0.fWTAfUmVKrZq(ul0Var);
                return;
            } else {
                ul0Var.gUjdnLbkVAaA = true;
                return;
            }
        }
        if (!(ul0Var instanceof defpackage.l9)) {
            defpackage.e80.giKS3J6vZuNy("Unknown Modifier.Node type");
            return;
        }
        defpackage.l9 l9Var = (defpackage.l9) ul0Var;
        boolean z = l9Var.s0TASMVLSWD5;
        if (z) {
            if (!z) {
                defpackage.e80.giKS3J6vZuNy("unInitializeModifier called on unattached node");
            }
            if ((l9Var.QiMR8OkAhezm & 8) != 0) {
                ((defpackage.u) defpackage.la0.qjMheFZ0l9kA(l9Var)).blKFvluuDQOf();
            }
        }
        l9Var.BHfvd2J71qpO = tl0Var2;
        l9Var.QiMR8OkAhezm = defpackage.tr0.JhCgjQRTAOCT(tl0Var2);
        if (l9Var.s0TASMVLSWD5) {
            l9Var.YZh1E3mnTFwf(false);
        }
        if (ul0Var.s0TASMVLSWD5) {
            defpackage.tr0.fWTAfUmVKrZq(ul0Var);
        } else {
            ul0Var.gUjdnLbkVAaA = true;
        }
    }

    public static final void ZpBGe2uQfcn8(defpackage.or0 or0Var, defpackage.ul0 ul0Var, defpackage.sr0 sr0Var) {
        for (defpackage.ul0 ul0Var2 = ul0Var.e6mdH7fiFuta; ul0Var2 != null; ul0Var2 = ul0Var2.e6mdH7fiFuta) {
            if (ul0Var2 == or0Var.giKS3J6vZuNy) {
                defpackage.jd0 w7APNrr0aGRc = or0Var.ZpBGe2uQfcn8.w7APNrr0aGRc();
                sr0Var.w7APNrr0aGRc = w7APNrr0aGRc != null ? w7APNrr0aGRc.IBvW5fLsPuHy.fWTAfUmVKrZq : null;
                or0Var.JhCgjQRTAOCT = sr0Var;
                return;
            } else {
                if ((ul0Var2.QiMR8OkAhezm & 2) != 0) {
                    return;
                }
                ul0Var2.SJaTq1YjP6B8(sr0Var);
            }
        }
    }

    public static defpackage.ul0 fWTAfUmVKrZq(defpackage.ul0 ul0Var) {
        boolean z = ul0Var.s0TASMVLSWD5;
        if (z) {
            defpackage.on0 on0Var = defpackage.tr0.ZpBGe2uQfcn8;
            if (!z) {
                defpackage.e80.giKS3J6vZuNy("autoInvalidateRemovedNode called on unattached node");
            }
            defpackage.tr0.ZpBGe2uQfcn8(ul0Var, -1, 2);
            ul0Var.Ux2tdpxXtKdg();
            ul0Var.TlJvUa0ZXCBu();
        }
        defpackage.ul0 ul0Var2 = ul0Var.GE9mJIPrb8gP;
        defpackage.ul0 ul0Var3 = ul0Var.e6mdH7fiFuta;
        if (ul0Var2 != null) {
            ul0Var2.e6mdH7fiFuta = ul0Var3;
            ul0Var.GE9mJIPrb8gP = null;
        }
        if (ul0Var3 != null) {
            ul0Var3.GE9mJIPrb8gP = ul0Var2;
            ul0Var.e6mdH7fiFuta = null;
        }
        ul0Var3.getClass();
        return ul0Var3;
    }

    public static defpackage.ul0 giKS3J6vZuNy(defpackage.tl0 tl0Var, defpackage.ul0 ul0Var) {
        defpackage.ul0 ul0Var2;
        if (tl0Var instanceof defpackage.zl0) {
            ul0Var2 = ((defpackage.zl0) tl0Var).JhCgjQRTAOCT();
            ul0Var2.QiMR8OkAhezm = defpackage.tr0.oh71FJcDz6S2(ul0Var2);
        } else {
            defpackage.l9 l9Var = new defpackage.l9();
            l9Var.QiMR8OkAhezm = defpackage.tr0.JhCgjQRTAOCT(tl0Var);
            l9Var.BHfvd2J71qpO = tl0Var;
            new java.util.HashSet();
            ul0Var2 = l9Var;
        }
        if (ul0Var2.s0TASMVLSWD5) {
            defpackage.e80.giKS3J6vZuNy("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        ul0Var2.h3m55N1URyyK = true;
        defpackage.ul0 ul0Var3 = ul0Var.GE9mJIPrb8gP;
        if (ul0Var3 != null) {
            ul0Var3.e6mdH7fiFuta = ul0Var2;
            ul0Var2.GE9mJIPrb8gP = ul0Var3;
        }
        ul0Var.GE9mJIPrb8gP = ul0Var2;
        ul0Var2.e6mdH7fiFuta = ul0Var;
        return ul0Var2;
    }

    public final boolean JhCgjQRTAOCT(int i) {
        return (this.oh71FJcDz6S2.P05cfTpS5W5L & i) != 0;
    }

    public final void QiMR8OkAhezm() {
        defpackage.jd0 jd0Var;
        defpackage.cd0 cd0Var;
        defpackage.ul0 ul0Var = this.WDYagTQQm9ns.e6mdH7fiFuta;
        defpackage.sr0 sr0Var = this.fWTAfUmVKrZq;
        defpackage.ul0 ul0Var2 = ul0Var;
        while (true) {
            jd0Var = this.ZpBGe2uQfcn8;
            if (ul0Var2 == null) {
                break;
            }
            defpackage.ad0 fNwYGHIYeJcR = defpackage.la0.fNwYGHIYeJcR(ul0Var2);
            if (fNwYGHIYeJcR != null) {
                defpackage.sr0 sr0Var2 = ul0Var2.fNwYGHIYeJcR;
                if (sr0Var2 != null) {
                    defpackage.cd0 cd0Var2 = (defpackage.cd0) sr0Var2;
                    defpackage.ad0 ad0Var = cd0Var2.z16KqenTjq8o;
                    cd0Var2.r(fNwYGHIYeJcR);
                    cd0Var = cd0Var2;
                    if (ad0Var != ul0Var2) {
                        defpackage.nv0 nv0Var = cd0Var2.Wc0TdmRSwbbi;
                        cd0Var = cd0Var2;
                        if (nv0Var != null) {
                            ((defpackage.e40) nv0Var).fWTAfUmVKrZq();
                            cd0Var = cd0Var2;
                        }
                    }
                } else {
                    defpackage.cd0 cd0Var3 = new defpackage.cd0(jd0Var, fNwYGHIYeJcR);
                    ul0Var2.SJaTq1YjP6B8(cd0Var3);
                    cd0Var = cd0Var3;
                }
                sr0Var.w7APNrr0aGRc = cd0Var;
                cd0Var.ZVVdXbWmyCSK = sr0Var;
                sr0Var = cd0Var;
            } else {
                ul0Var2.SJaTq1YjP6B8(sr0Var);
            }
            ul0Var2 = ul0Var2.e6mdH7fiFuta;
        }
        defpackage.jd0 w7APNrr0aGRc = jd0Var.w7APNrr0aGRc();
        sr0Var.w7APNrr0aGRc = w7APNrr0aGRc != null ? w7APNrr0aGRc.IBvW5fLsPuHy.fWTAfUmVKrZq : null;
        this.JhCgjQRTAOCT = sr0Var;
    }

    public final void WDYagTQQm9ns() {
        for (defpackage.ul0 ul0Var = this.oh71FJcDz6S2; ul0Var != null; ul0Var = ul0Var.GE9mJIPrb8gP) {
            ul0Var.K0gkXZrJwRZi();
            if (ul0Var.h3m55N1URyyK) {
                defpackage.on0 on0Var = defpackage.tr0.ZpBGe2uQfcn8;
                if (!ul0Var.s0TASMVLSWD5) {
                    defpackage.e80.giKS3J6vZuNy("autoInvalidateInsertedNode called on unattached node");
                }
                defpackage.tr0.ZpBGe2uQfcn8(ul0Var, -1, 1);
            }
            if (ul0Var.gUjdnLbkVAaA) {
                defpackage.tr0.fWTAfUmVKrZq(ul0Var);
            }
            ul0Var.h3m55N1URyyK = false;
            ul0Var.gUjdnLbkVAaA = false;
        }
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
    
        if (r0.ZpBGe2uQfcn8(r14 - 1, r27 - 1) == false) goto L187;
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
    public final void oh71FJcDz6S2(int i, defpackage.ho0 ho0Var, defpackage.ho0 ho0Var2, defpackage.ul0 ul0Var, boolean z) {
        int i2;
        defpackage.ho0 ho0Var3;
        defpackage.ho0 ho0Var4;
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
        defpackage.mr0 mr0Var = this.GE9mJIPrb8gP;
        if (mr0Var == null) {
            i2 = i;
            ho0Var3 = ho0Var;
            ho0Var4 = ho0Var2;
            mr0Var = new defpackage.mr0(this, ul0Var, i2, ho0Var3, ho0Var4, z);
            this.GE9mJIPrb8gP = mr0Var;
        } else {
            i2 = i;
            ho0Var3 = ho0Var;
            ho0Var4 = ho0Var2;
            mr0Var.ZpBGe2uQfcn8 = ul0Var;
            mr0Var.giKS3J6vZuNy = i2;
            mr0Var.fWTAfUmVKrZq = ho0Var3;
            mr0Var.JhCgjQRTAOCT = ho0Var4;
            mr0Var.WDYagTQQm9ns = z;
        }
        defpackage.or0 or0Var = mr0Var.oh71FJcDz6S2;
        int i9 = ho0Var3.QiMR8OkAhezm - i2;
        int i10 = ho0Var4.QiMR8OkAhezm - i2;
        char c3 = 2;
        int i11 = ((i9 + i10) + 1) / 2;
        defpackage.v90 v90Var = new defpackage.v90(i11 * 3);
        defpackage.v90 v90Var2 = new defpackage.v90(i11 * 4);
        int i12 = 0;
        v90Var2.WDYagTQQm9ns(0, i9, 0, i10);
        int i13 = (i11 * 2) + 1;
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[5];
        while (true) {
            int i14 = v90Var2.giKS3J6vZuNy;
            if (i14 == 0) {
                break;
            }
            char c4 = c3;
            int[] iArr6 = v90Var2.ZpBGe2uQfcn8;
            int i15 = i12;
            int i16 = i14 - 1;
            v90Var2.giKS3J6vZuNy = i16;
            int i17 = iArr6[i16];
            int i18 = i14 - 2;
            v90Var2.giKS3J6vZuNy = i18;
            int i19 = iArr6[i18];
            int i20 = i14 - 3;
            v90Var2.giKS3J6vZuNy = i20;
            int i21 = iArr6[i20];
            int i22 = i14 - 4;
            v90Var2.giKS3J6vZuNy = i22;
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
                            while (i6 < i21 && i7 < i17 && mr0Var.ZpBGe2uQfcn8(i6, i7)) {
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
                        v90Var.JhCgjQRTAOCT(i42, i43, i45);
                    } else {
                        c2 = c;
                    }
                    v90Var2.WDYagTQQm9ns(i23, iArr2[i15], i19, iArr2[c2]);
                    v90Var2.WDYagTQQm9ns(iArr2[c4], i21, iArr2[3], i17);
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
        int i55 = v90Var.giKS3J6vZuNy;
        if (i55 % 3 != 0) {
            defpackage.e80.giKS3J6vZuNy("Array size not a multiple of 3");
        }
        if (i55 > 3) {
            i3 = i54;
            v90Var.oh71FJcDz6S2(i3, i55 - 3);
        } else {
            i3 = i54;
        }
        v90Var.JhCgjQRTAOCT(i9, i10, i3);
        int i56 = i3;
        int i57 = i56;
        int i58 = i57;
        while (i56 < v90Var.giKS3J6vZuNy) {
            int[] iArr8 = v90Var.ZpBGe2uQfcn8;
            int i59 = iArr8[i56];
            int i60 = iArr8[i56 + 2];
            int i61 = i59 - i60;
            int i62 = iArr8[i56 + 1] - i60;
            i56 += 3;
            while (i57 < i61) {
                defpackage.ul0 ul0Var2 = mr0Var.ZpBGe2uQfcn8.GE9mJIPrb8gP;
                ul0Var2.getClass();
                if ((ul0Var2.QiMR8OkAhezm & 2) != 0) {
                    defpackage.sr0 sr0Var = ul0Var2.fNwYGHIYeJcR;
                    sr0Var.getClass();
                    defpackage.sr0 sr0Var2 = sr0Var.w7APNrr0aGRc;
                    defpackage.sr0 sr0Var3 = sr0Var.ZVVdXbWmyCSK;
                    sr0Var3.getClass();
                    if (sr0Var2 != null) {
                        sr0Var2.ZVVdXbWmyCSK = sr0Var3;
                    }
                    sr0Var3.w7APNrr0aGRc = sr0Var2;
                    ZpBGe2uQfcn8(or0Var, mr0Var.ZpBGe2uQfcn8, sr0Var3);
                }
                mr0Var.ZpBGe2uQfcn8 = fWTAfUmVKrZq(ul0Var2);
                i57++;
            }
            while (i58 < i62) {
                defpackage.ul0 giKS3J6vZuNy = giKS3J6vZuNy((defpackage.tl0) mr0Var.JhCgjQRTAOCT.WDYagTQQm9ns[mr0Var.giKS3J6vZuNy + i58], mr0Var.ZpBGe2uQfcn8);
                mr0Var.ZpBGe2uQfcn8 = giKS3J6vZuNy;
                if (mr0Var.WDYagTQQm9ns) {
                    defpackage.ul0 ul0Var3 = giKS3J6vZuNy.GE9mJIPrb8gP;
                    ul0Var3.getClass();
                    defpackage.sr0 sr0Var4 = ul0Var3.fNwYGHIYeJcR;
                    sr0Var4.getClass();
                    defpackage.ad0 fNwYGHIYeJcR = defpackage.la0.fNwYGHIYeJcR(mr0Var.ZpBGe2uQfcn8);
                    if (fNwYGHIYeJcR != null) {
                        defpackage.cd0 cd0Var = new defpackage.cd0(or0Var.ZpBGe2uQfcn8, fNwYGHIYeJcR);
                        mr0Var.ZpBGe2uQfcn8.SJaTq1YjP6B8(cd0Var);
                        ZpBGe2uQfcn8(or0Var, mr0Var.ZpBGe2uQfcn8, cd0Var);
                        cd0Var.w7APNrr0aGRc = sr0Var4.w7APNrr0aGRc;
                        cd0Var.ZVVdXbWmyCSK = sr0Var4;
                        sr0Var4.w7APNrr0aGRc = cd0Var;
                    } else {
                        mr0Var.ZpBGe2uQfcn8.SJaTq1YjP6B8(sr0Var4);
                    }
                    mr0Var.ZpBGe2uQfcn8.S0c5Wv6LbIVo();
                    mr0Var.ZpBGe2uQfcn8.K0gkXZrJwRZi();
                    defpackage.ul0 ul0Var4 = mr0Var.ZpBGe2uQfcn8;
                    defpackage.on0 on0Var = defpackage.tr0.ZpBGe2uQfcn8;
                    if (!ul0Var4.s0TASMVLSWD5) {
                        defpackage.e80.giKS3J6vZuNy("autoInvalidateInsertedNode called on unattached node");
                    }
                    defpackage.tr0.ZpBGe2uQfcn8(ul0Var4, -1, 1);
                } else {
                    giKS3J6vZuNy.h3m55N1URyyK = true;
                }
                i58++;
            }
            while (true) {
                int i63 = i60 - 1;
                if (i60 > 0) {
                    defpackage.ul0 ul0Var5 = mr0Var.ZpBGe2uQfcn8.GE9mJIPrb8gP;
                    ul0Var5.getClass();
                    mr0Var.ZpBGe2uQfcn8 = ul0Var5;
                    defpackage.ho0 ho0Var5 = mr0Var.fWTAfUmVKrZq;
                    int i64 = mr0Var.giKS3J6vZuNy;
                    defpackage.tl0 tl0Var = (defpackage.tl0) ho0Var5.WDYagTQQm9ns[i64 + i57];
                    defpackage.tl0 tl0Var2 = (defpackage.tl0) mr0Var.JhCgjQRTAOCT.WDYagTQQm9ns[i64 + i58];
                    if (!defpackage.ma0.QiMR8OkAhezm(tl0Var, tl0Var2)) {
                        P05cfTpS5W5L(tl0Var, tl0Var2, mr0Var.ZpBGe2uQfcn8);
                    }
                    i57++;
                    i58++;
                    i60 = i63;
                }
            }
        }
        int i65 = i3;
        for (defpackage.ul0 ul0Var6 = this.WDYagTQQm9ns.e6mdH7fiFuta; ul0Var6 != null && ul0Var6 != this.giKS3J6vZuNy; ul0Var6 = ul0Var6.e6mdH7fiFuta) {
            i65 |= ul0Var6.QiMR8OkAhezm;
            ul0Var6.P05cfTpS5W5L = i65;
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        defpackage.ul0 ul0Var = this.oh71FJcDz6S2;
        defpackage.cj1 cj1Var = this.WDYagTQQm9ns;
        if (ul0Var != cj1Var) {
            while (true) {
                if (ul0Var == null || ul0Var == cj1Var) {
                    break;
                }
                sb.append(java.lang.String.valueOf(ul0Var));
                if (ul0Var.GE9mJIPrb8gP == cj1Var) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                ul0Var = ul0Var.GE9mJIPrb8gP;
            }
        } else {
            sb.append("]");
        }
        return sb.toString();
    }
}
