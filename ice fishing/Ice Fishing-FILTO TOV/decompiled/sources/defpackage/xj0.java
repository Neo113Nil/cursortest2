package defpackage;

import java.util.HashSet;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class xj0 {
    public rg0 AvO7iQsrTN;
    public he0 EljAMC1QTz;
    public final g60 GWasM1elztuh;
    public vj0 JFJ3QoxA;
    public final q71 OOA6hdeuvCS;
    public final z10 X1lG3V04pd;
    public final wj0 Yi7zF1RB1;
    public rg0 encWxUiV2;
    public final rg0 mOu10nynGul;
    public bk0 xqGvceK5x;

    public xj0(g60 g60Var) {
        this.GWasM1elztuh = g60Var;
        wj0 wj0Var = new wj0();
        wj0Var.encWxUiV2 = -1;
        this.Yi7zF1RB1 = wj0Var;
        z10 z10Var = new z10(g60Var);
        this.X1lG3V04pd = z10Var;
        this.xqGvceK5x = z10Var;
        q71 q71Var = z10Var.J3Xc8BaqpN8;
        this.OOA6hdeuvCS = q71Var;
        this.EljAMC1QTz = q71Var;
        this.mOu10nynGul = new rg0(new ie0[16]);
    }

    public static final void GWasM1elztuh(xj0 xj0Var, he0 he0Var, bk0 bk0Var) {
        for (he0 he0Var2 = he0Var.mOu10nynGul; he0Var2 != null; he0Var2 = he0Var2.mOu10nynGul) {
            if (he0Var2 == xj0Var.Yi7zF1RB1) {
                g60 cilMamHF = xj0Var.GWasM1elztuh.cilMamHF();
                bk0Var.Y6hRI1cF8 = cilMamHF != null ? cilMamHF.A1EKNP6CxJ.X1lG3V04pd : null;
                xj0Var.xqGvceK5x = bk0Var;
                return;
            } else {
                if ((he0Var2.AvO7iQsrTN & 2) != 0) {
                    return;
                }
                he0Var2.xtv4Xm13vGi(bk0Var);
            }
        }
    }

    public static he0 X1lG3V04pd(he0 he0Var) {
        boolean z = he0Var.Mjvvu5DE;
        if (z) {
            zf0 zf0Var = ck0.GWasM1elztuh;
            if (!z) {
                t10.Yi7zF1RB1("autoInvalidateRemovedNode called on unattached node");
            }
            ck0.GWasM1elztuh(he0Var, -1, 2);
            he0Var.FhVkB11j();
            he0Var.vaTCmWUgXF();
        }
        he0 he0Var2 = he0Var.JFJ3QoxA;
        he0 he0Var3 = he0Var.mOu10nynGul;
        if (he0Var2 != null) {
            he0Var2.mOu10nynGul = he0Var3;
            he0Var.JFJ3QoxA = null;
        }
        if (he0Var3 != null) {
            he0Var3.JFJ3QoxA = he0Var2;
            he0Var.mOu10nynGul = null;
        }
        he0Var3.getClass();
        return he0Var3;
    }

    public static he0 Yi7zF1RB1(ge0 ge0Var, he0 he0Var) {
        he0 he0Var2;
        if (ge0Var instanceof me0) {
            he0Var2 = ((me0) ge0Var).xqGvceK5x();
            he0Var2.AvO7iQsrTN = ck0.EljAMC1QTz(he0Var2);
        } else {
            g6 g6Var = new g6();
            g6Var.AvO7iQsrTN = ck0.xqGvceK5x(ge0Var);
            g6Var.mE4lRynR = ge0Var;
            new HashSet();
            he0Var2 = g6Var;
        }
        if (he0Var2.Mjvvu5DE) {
            t10.Yi7zF1RB1("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        he0Var2.XnEVoBF0td1l = true;
        he0 he0Var3 = he0Var.JFJ3QoxA;
        if (he0Var3 != null) {
            he0Var3.mOu10nynGul = he0Var2;
            he0Var2.JFJ3QoxA = he0Var3;
        }
        he0Var.JFJ3QoxA = he0Var2;
        he0Var2.mOu10nynGul = he0Var;
        return he0Var2;
    }

    public static void encWxUiV2(ge0 ge0Var, ge0 ge0Var2, he0 he0Var) {
        if ((ge0Var instanceof me0) && (ge0Var2 instanceof me0)) {
            he0Var.getClass();
            ((me0) ge0Var2).OOA6hdeuvCS(he0Var);
            if (he0Var.Mjvvu5DE) {
                ck0.X1lG3V04pd(he0Var);
                return;
            } else {
                he0Var.uFEq9NpZ = true;
                return;
            }
        }
        if (!(he0Var instanceof g6)) {
            t10.Yi7zF1RB1("Unknown Modifier.Node type");
            return;
        }
        g6 g6Var = (g6) he0Var;
        boolean z = g6Var.Mjvvu5DE;
        if (z) {
            if (!z) {
                t10.Yi7zF1RB1("unInitializeModifier called on unattached node");
            }
            if ((g6Var.AvO7iQsrTN & 8) != 0) {
                ((c) vc0.A1EKNP6CxJ(g6Var)).pog2g9KITJA();
            }
        }
        g6Var.mE4lRynR = ge0Var2;
        g6Var.AvO7iQsrTN = ck0.xqGvceK5x(ge0Var2);
        if (g6Var.Mjvvu5DE) {
            g6Var.gqMuANyCes(false);
        }
        if (he0Var.Mjvvu5DE) {
            ck0.X1lG3V04pd(he0Var);
        } else {
            he0Var.uFEq9NpZ = true;
        }
    }

    public final void AvO7iQsrTN() {
        g60 g60Var;
        y50 y50Var;
        he0 he0Var = this.OOA6hdeuvCS.mOu10nynGul;
        bk0 bk0Var = this.X1lG3V04pd;
        he0 he0Var2 = he0Var;
        while (true) {
            g60Var = this.GWasM1elztuh;
            if (he0Var2 == null) {
                break;
            }
            w50 uFEq9NpZ = vc0.uFEq9NpZ(he0Var2);
            if (uFEq9NpZ != null) {
                bk0 bk0Var2 = he0Var2.E7jCp8Ls;
                if (bk0Var2 != null) {
                    y50 y50Var2 = (y50) bk0Var2;
                    w50 w50Var = y50Var2.J3Xc8BaqpN8;
                    y50Var2.mnHdw6496Bs(uFEq9NpZ);
                    y50Var = y50Var2;
                    if (w50Var != he0Var2) {
                        fn0 fn0Var = y50Var2.VeqTn1PQw7;
                        y50Var = y50Var2;
                        if (fn0Var != null) {
                            ((ry) fn0Var).X1lG3V04pd();
                            y50Var = y50Var2;
                        }
                    }
                } else {
                    y50 y50Var3 = new y50(g60Var, uFEq9NpZ);
                    he0Var2.xtv4Xm13vGi(y50Var3);
                    y50Var = y50Var3;
                }
                bk0Var.Y6hRI1cF8 = y50Var;
                y50Var.jivtDDk9H = bk0Var;
                bk0Var = y50Var;
            } else {
                he0Var2.xtv4Xm13vGi(bk0Var);
            }
            he0Var2 = he0Var2.mOu10nynGul;
        }
        g60 cilMamHF = g60Var.cilMamHF();
        bk0Var.Y6hRI1cF8 = cilMamHF != null ? cilMamHF.A1EKNP6CxJ.X1lG3V04pd : null;
        this.xqGvceK5x = bk0Var;
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
    
        if (r0.GWasM1elztuh(r14 - 1, r27 - 1) == false) goto L187;
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
    public final void EljAMC1QTz(int i, rg0 rg0Var, rg0 rg0Var2, he0 he0Var, boolean z) {
        int i2;
        rg0 rg0Var3;
        rg0 rg0Var4;
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
        vj0 vj0Var = this.JFJ3QoxA;
        if (vj0Var == null) {
            i2 = i;
            rg0Var3 = rg0Var;
            rg0Var4 = rg0Var2;
            vj0Var = new vj0(this, he0Var, i2, rg0Var3, rg0Var4, z);
            this.JFJ3QoxA = vj0Var;
        } else {
            i2 = i;
            rg0Var3 = rg0Var;
            rg0Var4 = rg0Var2;
            vj0Var.GWasM1elztuh = he0Var;
            vj0Var.Yi7zF1RB1 = i2;
            vj0Var.X1lG3V04pd = rg0Var3;
            vj0Var.xqGvceK5x = rg0Var4;
            vj0Var.OOA6hdeuvCS = z;
        }
        xj0 xj0Var = vj0Var.EljAMC1QTz;
        int i9 = rg0Var3.AvO7iQsrTN - i2;
        int i10 = rg0Var4.AvO7iQsrTN - i2;
        char c3 = 2;
        int i11 = ((i9 + i10) + 1) / 2;
        c30 c30Var = new c30(i11 * 3);
        c30 c30Var2 = new c30(i11 * 4);
        int i12 = 0;
        c30Var2.OOA6hdeuvCS(0, i9, 0, i10);
        int i13 = (i11 * 2) + 1;
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[5];
        while (true) {
            int i14 = c30Var2.Yi7zF1RB1;
            if (i14 == 0) {
                break;
            }
            char c4 = c3;
            int[] iArr6 = c30Var2.GWasM1elztuh;
            int i15 = i12;
            int i16 = i14 - 1;
            c30Var2.Yi7zF1RB1 = i16;
            int i17 = iArr6[i16];
            int i18 = i14 - 2;
            c30Var2.Yi7zF1RB1 = i18;
            int i19 = iArr6[i18];
            int i20 = i14 - 3;
            c30Var2.Yi7zF1RB1 = i20;
            int i21 = iArr6[i20];
            int i22 = i14 - 4;
            c30Var2.Yi7zF1RB1 = i22;
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
                    int i35 = (Math.abs(i32) & 1) == i27 ? 1 : i15;
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
                            while (i6 < i21 && i7 < i17 && vj0Var.GWasM1elztuh(i6, i7)) {
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
                    if (Math.min(iArr2[c4] - iArr2[i15], iArr2[3] - iArr2[c]) > 0) {
                        int i42 = iArr2[i15];
                        int i43 = iArr2[c];
                        int i44 = iArr2[3] - i43;
                        int i45 = iArr2[c4] - i42;
                        if (i44 != i45) {
                            i45 = Math.min(i45, i44);
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
                        c30Var.xqGvceK5x(i42, i43, i45);
                    } else {
                        c2 = c;
                    }
                    c30Var2.OOA6hdeuvCS(i23, iArr2[i15], i19, iArr2[c2]);
                    c30Var2.OOA6hdeuvCS(iArr2[c4], i21, iArr2[3], i17);
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
        int i55 = c30Var.Yi7zF1RB1;
        if (i55 % 3 != 0) {
            t10.Yi7zF1RB1("Array size not a multiple of 3");
        }
        if (i55 > 3) {
            i3 = i54;
            c30Var.EljAMC1QTz(i3, i55 - 3);
        } else {
            i3 = i54;
        }
        c30Var.xqGvceK5x(i9, i10, i3);
        int i56 = i3;
        int i57 = i56;
        int i58 = i57;
        while (i56 < c30Var.Yi7zF1RB1) {
            int[] iArr8 = c30Var.GWasM1elztuh;
            int i59 = iArr8[i56];
            int i60 = iArr8[i56 + 2];
            int i61 = i59 - i60;
            int i62 = iArr8[i56 + 1] - i60;
            i56 += 3;
            while (i57 < i61) {
                he0 he0Var2 = vj0Var.GWasM1elztuh.JFJ3QoxA;
                he0Var2.getClass();
                if ((he0Var2.AvO7iQsrTN & 2) != 0) {
                    bk0 bk0Var = he0Var2.E7jCp8Ls;
                    bk0Var.getClass();
                    bk0 bk0Var2 = bk0Var.Y6hRI1cF8;
                    bk0 bk0Var3 = bk0Var.jivtDDk9H;
                    bk0Var3.getClass();
                    if (bk0Var2 != null) {
                        bk0Var2.jivtDDk9H = bk0Var3;
                    }
                    bk0Var3.Y6hRI1cF8 = bk0Var2;
                    GWasM1elztuh(xj0Var, vj0Var.GWasM1elztuh, bk0Var3);
                }
                vj0Var.GWasM1elztuh = X1lG3V04pd(he0Var2);
                i57++;
            }
            while (i58 < i62) {
                he0 Yi7zF1RB1 = Yi7zF1RB1((ge0) vj0Var.xqGvceK5x.OOA6hdeuvCS[vj0Var.Yi7zF1RB1 + i58], vj0Var.GWasM1elztuh);
                vj0Var.GWasM1elztuh = Yi7zF1RB1;
                if (vj0Var.OOA6hdeuvCS) {
                    he0 he0Var3 = Yi7zF1RB1.JFJ3QoxA;
                    he0Var3.getClass();
                    bk0 bk0Var4 = he0Var3.E7jCp8Ls;
                    bk0Var4.getClass();
                    w50 uFEq9NpZ = vc0.uFEq9NpZ(vj0Var.GWasM1elztuh);
                    if (uFEq9NpZ != null) {
                        y50 y50Var = new y50(xj0Var.GWasM1elztuh, uFEq9NpZ);
                        vj0Var.GWasM1elztuh.xtv4Xm13vGi(y50Var);
                        GWasM1elztuh(xj0Var, vj0Var.GWasM1elztuh, y50Var);
                        y50Var.Y6hRI1cF8 = bk0Var4.Y6hRI1cF8;
                        y50Var.jivtDDk9H = bk0Var4;
                        bk0Var4.Y6hRI1cF8 = y50Var;
                    } else {
                        vj0Var.GWasM1elztuh.xtv4Xm13vGi(bk0Var4);
                    }
                    vj0Var.GWasM1elztuh.WkXHDbKiD();
                    vj0Var.GWasM1elztuh.kbVzROOfKK();
                    he0 he0Var4 = vj0Var.GWasM1elztuh;
                    zf0 zf0Var = ck0.GWasM1elztuh;
                    if (!he0Var4.Mjvvu5DE) {
                        t10.Yi7zF1RB1("autoInvalidateInsertedNode called on unattached node");
                    }
                    ck0.GWasM1elztuh(he0Var4, -1, 1);
                } else {
                    Yi7zF1RB1.XnEVoBF0td1l = true;
                }
                i58++;
            }
            while (true) {
                int i63 = i60 - 1;
                if (i60 > 0) {
                    he0 he0Var5 = vj0Var.GWasM1elztuh.JFJ3QoxA;
                    he0Var5.getClass();
                    vj0Var.GWasM1elztuh = he0Var5;
                    rg0 rg0Var5 = vj0Var.X1lG3V04pd;
                    int i64 = vj0Var.Yi7zF1RB1;
                    ge0 ge0Var = (ge0) rg0Var5.OOA6hdeuvCS[i64 + i57];
                    ge0 ge0Var2 = (ge0) vj0Var.xqGvceK5x.OOA6hdeuvCS[i64 + i58];
                    if (!o30.rQPn8YBR(ge0Var, ge0Var2)) {
                        encWxUiV2(ge0Var, ge0Var2, vj0Var.GWasM1elztuh);
                    }
                    i57++;
                    i58++;
                    i60 = i63;
                }
            }
        }
        int i65 = i3;
        for (he0 he0Var6 = this.OOA6hdeuvCS.mOu10nynGul; he0Var6 != null && he0Var6 != this.Yi7zF1RB1; he0Var6 = he0Var6.mOu10nynGul) {
            i65 |= he0Var6.AvO7iQsrTN;
            he0Var6.encWxUiV2 = i65;
        }
    }

    public final void OOA6hdeuvCS() {
        for (he0 he0Var = this.EljAMC1QTz; he0Var != null; he0Var = he0Var.JFJ3QoxA) {
            he0Var.kbVzROOfKK();
            if (he0Var.XnEVoBF0td1l) {
                zf0 zf0Var = ck0.GWasM1elztuh;
                if (!he0Var.Mjvvu5DE) {
                    t10.Yi7zF1RB1("autoInvalidateInsertedNode called on unattached node");
                }
                ck0.GWasM1elztuh(he0Var, -1, 1);
            }
            if (he0Var.uFEq9NpZ) {
                ck0.X1lG3V04pd(he0Var);
            }
            he0Var.XnEVoBF0td1l = false;
            he0Var.uFEq9NpZ = false;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        he0 he0Var = this.EljAMC1QTz;
        q71 q71Var = this.OOA6hdeuvCS;
        if (he0Var != q71Var) {
            while (true) {
                if (he0Var == null || he0Var == q71Var) {
                    break;
                }
                sb.append(String.valueOf(he0Var));
                if (he0Var.JFJ3QoxA == q71Var) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                he0Var = he0Var.JFJ3QoxA;
            }
        } else {
            sb.append("]");
        }
        return sb.toString();
    }

    public final boolean xqGvceK5x(int i) {
        return (this.EljAMC1QTz.encWxUiV2 & i) != 0;
    }
}
