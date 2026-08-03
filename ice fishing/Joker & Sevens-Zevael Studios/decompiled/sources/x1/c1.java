package x1;

import java.util.HashSet;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f7986a;

    /* renamed from: b, reason: collision with root package name */
    public final b1 f7987b;

    /* renamed from: c, reason: collision with root package name */
    public final s f7988c;

    /* renamed from: d, reason: collision with root package name */
    public f1 f7989d;

    /* renamed from: e, reason: collision with root package name */
    public final w1 f7990e;

    /* renamed from: f, reason: collision with root package name */
    public y0.m f7991f;

    /* renamed from: g, reason: collision with root package name */
    public o0.e f7992g;

    /* renamed from: h, reason: collision with root package name */
    public o0.e f7993h;

    /* renamed from: i, reason: collision with root package name */
    public final o0.e f7994i;

    /* renamed from: j, reason: collision with root package name */
    public a1 f7995j;

    public c1(g0 g0Var) {
        this.f7986a = g0Var;
        b1 b1Var = new b1();
        b1Var.f8446j = -1;
        this.f7987b = b1Var;
        s sVar = new s(g0Var);
        this.f7988c = sVar;
        this.f7989d = sVar;
        w1 w1Var = sVar.T;
        this.f7990e = w1Var;
        this.f7991f = w1Var;
        this.f7994i = new o0.e(new y0.n[16]);
    }

    public static final void a(c1 c1Var, y0.m mVar, f1 f1Var) {
        for (y0.m mVar2 = mVar.f8447k; mVar2 != null; mVar2 = mVar2.f8447k) {
            if (mVar2 == c1Var.f7987b) {
                g0 s10 = c1Var.f7986a.s();
                f1Var.f8035w = s10 != null ? s10.I.f7988c : null;
                c1Var.f7989d = f1Var;
                return;
            } else {
                if ((mVar2.f8445i & 2) != 0) {
                    return;
                }
                mVar2.q0(f1Var);
            }
        }
    }

    public static y0.m b(y0.l lVar, y0.m mVar) {
        y0.m mVar2;
        if (lVar instanceof y0) {
            mVar2 = ((y0) lVar).f();
            mVar2.f8445i = g1.f(mVar2);
        } else {
            c cVar = new c();
            cVar.f8445i = g1.d(lVar);
            cVar.f7977u = lVar;
            cVar.f7979w = new HashSet();
            mVar2 = cVar;
        }
        if (mVar2.f8456t) {
            u1.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        mVar2.f8451o = true;
        y0.m mVar3 = mVar.f8448l;
        if (mVar3 != null) {
            mVar3.f8447k = mVar2;
            mVar2.f8448l = mVar3;
        }
        mVar.f8448l = mVar2;
        mVar2.f8447k = mVar;
        return mVar2;
    }

    public static y0.m c(y0.m mVar) {
        boolean z10 = mVar.f8456t;
        if (z10) {
            s.z zVar = g1.f8061a;
            if (!z10) {
                u1.a.b("autoInvalidateRemovedNode called on unattached node");
            }
            g1.a(mVar, -1, 2);
            mVar.o0();
            mVar.i0();
        }
        y0.m mVar2 = mVar.f8448l;
        y0.m mVar3 = mVar.f8447k;
        if (mVar2 != null) {
            mVar2.f8447k = mVar3;
            mVar.f8448l = null;
        }
        if (mVar3 != null) {
            mVar3.f8448l = mVar2;
            mVar.f8447k = null;
        }
        pc.j.b(mVar3);
        return mVar3;
    }

    public static void h(y0.l lVar, y0.l lVar2, y0.m mVar) {
        if ((lVar instanceof y0) && (lVar2 instanceof y0)) {
            pc.j.c(mVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((y0) lVar2).g(mVar);
            if (mVar.f8456t) {
                g1.c(mVar);
                return;
            } else {
                mVar.f8452p = true;
                return;
            }
        }
        if (!(mVar instanceof c)) {
            u1.a.b("Unknown Modifier.Node type");
            return;
        }
        c cVar = (c) mVar;
        if (cVar.f8456t) {
            cVar.s0();
        }
        cVar.f7977u = lVar2;
        cVar.f8445i = g1.d(lVar2);
        if (cVar.f8456t) {
            cVar.r0(false);
        }
        if (mVar.f8456t) {
            g1.c(mVar);
        } else {
            mVar.f8452p = true;
        }
    }

    public final boolean d(int i10) {
        return (i10 & this.f7991f.f8446j) != 0;
    }

    public final void e() {
        for (y0.m mVar = this.f7991f; mVar != null; mVar = mVar.f8448l) {
            mVar.n0();
            if (mVar.f8451o) {
                s.z zVar = g1.f8061a;
                if (!mVar.f8456t) {
                    u1.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                g1.a(mVar, -1, 1);
            }
            if (mVar.f8452p) {
                g1.c(mVar);
            }
            mVar.f8451o = false;
            mVar.f8452p = false;
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
    
        if (r0.a(r14 - 1, r27 - 1) == false) goto L187;
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
    public final void f(int i10, o0.e eVar, o0.e eVar2, y0.m mVar, boolean z10) {
        int i11;
        o0.e eVar3;
        o0.e eVar4;
        int i12;
        int[] iArr;
        int[] iArr2;
        char c3;
        char c7;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        a1 a1Var = this.f7995j;
        if (a1Var == null) {
            i11 = i10;
            eVar3 = eVar;
            eVar4 = eVar2;
            a1Var = new a1(this, mVar, i11, eVar3, eVar4, z10);
            this.f7995j = a1Var;
        } else {
            i11 = i10;
            eVar3 = eVar;
            eVar4 = eVar2;
            a1Var.f7969a = mVar;
            a1Var.f7970b = i11;
            a1Var.f7971c = eVar3;
            a1Var.f7972d = eVar4;
            a1Var.f7973e = z10;
        }
        c1 c1Var = a1Var.f7974f;
        int i18 = eVar3.f5136i - i11;
        int i19 = eVar4.f5136i - i11;
        char c10 = 2;
        int i20 = ((i18 + i19) + 1) / 2;
        m0.r0 r0Var = new m0.r0(i20 * 3);
        m0.r0 r0Var2 = new m0.r0(i20 * 4);
        int i21 = 0;
        r0Var2.e(0, i18, 0, i19);
        int i22 = (i20 * 2) + 1;
        int[] iArr3 = new int[i22];
        int[] iArr4 = new int[i22];
        int[] iArr5 = new int[5];
        while (true) {
            int i23 = r0Var2.f4748b;
            if (i23 == 0) {
                break;
            }
            char c11 = c10;
            int[] iArr6 = r0Var2.f4747a;
            int i24 = i21;
            int i25 = i23 - 1;
            r0Var2.f4748b = i25;
            int i26 = iArr6[i25];
            int i27 = i23 - 2;
            r0Var2.f4748b = i27;
            int i28 = iArr6[i27];
            int i29 = i23 - 3;
            r0Var2.f4748b = i29;
            int i30 = iArr6[i29];
            int i31 = i23 - 4;
            r0Var2.f4748b = i31;
            int i32 = iArr6[i31];
            int i33 = i30 - i32;
            int i34 = i22;
            int i35 = i26 - i28;
            int[] iArr7 = iArr3;
            if (i33 >= 1 && i35 >= 1) {
                int i36 = 1;
                int i37 = ((i33 + i35) + 1) / 2;
                int i38 = i34 / 2;
                int i39 = i38 + 1;
                iArr7[i39] = i32;
                iArr4[i39] = i30;
                int i40 = i24;
                while (i40 < i37) {
                    int i41 = i33 - i35;
                    int i42 = i37;
                    iArr = iArr4;
                    int i43 = -i40;
                    int i44 = (Math.abs(i41) & 1) == i36 ? 1 : i24;
                    int i45 = i43;
                    while (true) {
                        if (i45 > i40) {
                            break;
                        }
                        if (i45 != i43) {
                            if (i45 != i40) {
                                i13 = i45;
                                iArr2 = iArr5;
                            } else {
                                i13 = i45;
                                iArr2 = iArr5;
                            }
                            i14 = iArr7[(i13 - 1) + i38];
                            i15 = i14 + 1;
                            int i46 = ((i15 - i32) + i28) - i13;
                            int i47 = i46 - ((i40 == 0 ? 1 : i24) & (i15 != i14 ? 1 : i24));
                            int i48 = i14;
                            i16 = i46;
                            while (i15 < i30 && i16 < i26 && a1Var.a(i15, i16)) {
                                i15++;
                                i16++;
                            }
                            iArr7[i38 + i13] = i15;
                            if (i44 == 0) {
                                int i49 = i16;
                                int i50 = i41 - i13;
                                i17 = i33;
                                if (i50 >= i43 + 1 && i50 <= i40 - 1 && iArr[i38 + i50] <= i15) {
                                    iArr2[i24] = i48;
                                    iArr2[1] = i47;
                                    iArr2[c11] = i15;
                                    iArr2[3] = i49;
                                    iArr2[4] = i24;
                                    c3 = 1;
                                    break;
                                }
                            } else {
                                i17 = i33;
                            }
                            i45 = i13 + 2;
                            iArr5 = iArr2;
                            i33 = i17;
                        } else {
                            i13 = i45;
                            iArr2 = iArr5;
                        }
                        i14 = iArr7[i13 + 1 + i38];
                        i15 = i14;
                        int i462 = ((i15 - i32) + i28) - i13;
                        int i472 = i462 - ((i40 == 0 ? 1 : i24) & (i15 != i14 ? 1 : i24));
                        int i482 = i14;
                        i16 = i462;
                        while (i15 < i30) {
                            i15++;
                            i16++;
                        }
                        iArr7[i38 + i13] = i15;
                        if (i44 == 0) {
                        }
                        i45 = i13 + 2;
                        iArr5 = iArr2;
                        i33 = i17;
                    }
                    if (Math.min(iArr2[c11] - iArr2[i24], iArr2[3] - iArr2[c3]) > 0) {
                        int i51 = iArr2[i24];
                        int i52 = iArr2[c3];
                        int i53 = iArr2[3] - i52;
                        int i54 = iArr2[c11] - i51;
                        if (i53 != i54) {
                            i54 = Math.min(i54, i53);
                            int i55 = iArr2[4];
                            int i56 = i55 != 0 ? 1 : i24;
                            int i57 = iArr2[3];
                            c7 = 1;
                            int i58 = iArr2[1];
                            int i59 = i57 - i58;
                            int i60 = iArr2[c11];
                            int i61 = iArr2[i24];
                            int i62 = i51 + (((i59 > i60 - i61 ? 1 : i24) | i56) ^ 1);
                            i52 += (((i57 - i58 > i60 - i61 ? 1 : i24) ^ 1) | (i55 != 0 ? 1 : i24)) ^ 1;
                            i51 = i62;
                        } else {
                            c7 = 1;
                        }
                        r0Var.d(i51, i52, i54);
                    } else {
                        c7 = c3;
                    }
                    r0Var2.e(i32, iArr2[i24], i28, iArr2[c7]);
                    r0Var2.e(iArr2[c11], i30, iArr2[3], i26);
                    c10 = c11;
                    i21 = i24;
                    i22 = i34;
                    iArr3 = iArr7;
                    iArr4 = iArr;
                    iArr5 = iArr2;
                }
            }
            iArr = iArr4;
            iArr2 = iArr5;
            c10 = c11;
            i21 = i24;
            i22 = i34;
            iArr3 = iArr7;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int i63 = i21;
        int i64 = r0Var.f4748b;
        if (i64 % 3 != 0) {
            u1.a.b("Array size not a multiple of 3");
        }
        if (i64 > 3) {
            i12 = i63;
            r0Var.f(i12, i64 - 3);
        } else {
            i12 = i63;
        }
        r0Var.d(i18, i19, i12);
        int i65 = i12;
        int i66 = i65;
        int i67 = i66;
        while (i65 < r0Var.f4748b) {
            int[] iArr8 = r0Var.f4747a;
            int i68 = iArr8[i65];
            int i69 = iArr8[i65 + 2];
            int i70 = i68 - i69;
            int i71 = iArr8[i65 + 1] - i69;
            i65 += 3;
            while (i66 < i70) {
                y0.m mVar2 = a1Var.f7969a.f8448l;
                pc.j.b(mVar2);
                if ((mVar2.f8445i & 2) != 0) {
                    f1 f1Var = mVar2.f8450n;
                    pc.j.b(f1Var);
                    f1 f1Var2 = f1Var.f8035w;
                    f1 f1Var3 = f1Var.f8034v;
                    pc.j.b(f1Var3);
                    if (f1Var2 != null) {
                        f1Var2.f8034v = f1Var3;
                    }
                    f1Var3.f8035w = f1Var2;
                    a(c1Var, a1Var.f7969a, f1Var3);
                }
                a1Var.f7969a = c(mVar2);
                i66++;
            }
            while (i67 < i71) {
                y0.m b2 = b((y0.l) a1Var.f7972d.f5134g[a1Var.f7970b + i67], a1Var.f7969a);
                a1Var.f7969a = b2;
                if (a1Var.f7973e) {
                    y0.m mVar3 = b2.f8448l;
                    pc.j.b(mVar3);
                    f1 f1Var4 = mVar3.f8450n;
                    pc.j.b(f1Var4);
                    w g8 = f.g(a1Var.f7969a);
                    if (g8 != null) {
                        y yVar = new y(c1Var.f7986a, g8);
                        a1Var.f7969a.q0(yVar);
                        a(c1Var, a1Var.f7969a, yVar);
                        yVar.f8035w = f1Var4.f8035w;
                        yVar.f8034v = f1Var4;
                        f1Var4.f8035w = yVar;
                    } else {
                        a1Var.f7969a.q0(f1Var4);
                    }
                    a1Var.f7969a.h0();
                    a1Var.f7969a.n0();
                    y0.m mVar4 = a1Var.f7969a;
                    s.z zVar = g1.f8061a;
                    if (!mVar4.f8456t) {
                        u1.a.b("autoInvalidateInsertedNode called on unattached node");
                    }
                    g1.a(mVar4, -1, 1);
                } else {
                    b2.f8451o = true;
                }
                i67++;
            }
            while (true) {
                int i72 = i69 - 1;
                if (i69 > 0) {
                    y0.m mVar5 = a1Var.f7969a.f8448l;
                    pc.j.b(mVar5);
                    a1Var.f7969a = mVar5;
                    o0.e eVar5 = a1Var.f7971c;
                    int i73 = a1Var.f7970b;
                    y0.l lVar = (y0.l) eVar5.f5134g[i73 + i66];
                    y0.l lVar2 = (y0.l) a1Var.f7972d.f5134g[i73 + i67];
                    if (!pc.j.a(lVar, lVar2)) {
                        h(lVar, lVar2, a1Var.f7969a);
                    }
                    i66++;
                    i67++;
                    i69 = i72;
                }
            }
        }
        int i74 = i12;
        for (y0.m mVar6 = this.f7990e.f8447k; mVar6 != null && mVar6 != this.f7987b; mVar6 = mVar6.f8447k) {
            i74 |= mVar6.f8445i;
            mVar6.f8446j = i74;
        }
    }

    public final void g() {
        g0 g0Var;
        y yVar;
        y0.m mVar = this.f7990e.f8447k;
        f1 f1Var = this.f7988c;
        y0.m mVar2 = mVar;
        while (true) {
            g0Var = this.f7986a;
            if (mVar2 == null) {
                break;
            }
            w g8 = f.g(mVar2);
            if (g8 != null) {
                f1 f1Var2 = mVar2.f8450n;
                if (f1Var2 != null) {
                    y yVar2 = (y) f1Var2;
                    w wVar = yVar2.T;
                    yVar2.Z0(g8);
                    yVar = yVar2;
                    if (wVar != mVar2) {
                        l1 l1Var = yVar2.O;
                        yVar = yVar2;
                        if (l1Var != null) {
                            ((y1.f1) l1Var).invalidate();
                            yVar = yVar2;
                        }
                    }
                } else {
                    y yVar3 = new y(g0Var, g8);
                    mVar2.q0(yVar3);
                    yVar = yVar3;
                }
                f1Var.f8035w = yVar;
                yVar.f8034v = f1Var;
                f1Var = yVar;
            } else {
                mVar2.q0(f1Var);
            }
            mVar2 = mVar2.f8447k;
        }
        g0 s10 = g0Var.s();
        f1Var.f8035w = s10 != null ? s10.I.f7988c : null;
        this.f7989d = f1Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        y0.m mVar = this.f7991f;
        w1 w1Var = this.f7990e;
        if (mVar != w1Var) {
            while (true) {
                if (mVar == null || mVar == w1Var) {
                    break;
                }
                sb.append(String.valueOf(mVar));
                if (mVar.f8448l == w1Var) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                mVar = mVar.f8448l;
            }
        } else {
            sb.append("]");
        }
        String sb2 = sb.toString();
        pc.j.d(sb2, "toString(...)");
        return sb2;
    }
}
