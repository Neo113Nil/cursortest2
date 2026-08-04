package com.gamericefishpro.space.k3;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final boolean[] a = new boolean[3];

    /* JADX WARN: Code duplicated, block: B:188:0x0292  */
    /* JADX WARN: Code duplicated, block: B:205:0x02db  */
    /* JADX WARN: Code duplicated, block: B:207:0x02de  */
    /* JADX WARN: Code duplicated, block: B:209:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:232:0x0376  */
    /* JADX WARN: Code duplicated, block: B:234:0x0392  */
    /* JADX WARN: Code duplicated, block: B:236:0x0397  */
    /* JADX WARN: Code duplicated, block: B:240:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:251:0x042b  */
    /* JADX WARN: Code duplicated, block: B:406:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:409:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:410:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:413:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:414:0x06be  */
    /* JADX WARN: Code duplicated, block: B:416:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:418:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:421:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:423:0x06d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:433:0x06f2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x0114  */
    public static void a(e eVar, com.gamericefishpro.space.i3.c cVar, ArrayList arrayList, int i) {
        int i2;
        b[] bVarArr;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        int i5;
        d dVar;
        com.gamericefishpro.space.i3.c cVar2;
        com.gamericefishpro.space.i3.f fVar;
        c cVar3;
        com.gamericefishpro.space.i3.f fVar2;
        d dVar2;
        int i6;
        c cVar4;
        com.gamericefishpro.space.i3.f fVar3;
        d dVar3;
        int i7;
        c[] cVarArr;
        int i8;
        c cVar5;
        c cVar6;
        com.gamericefishpro.space.i3.f fVar4;
        c cVar7;
        com.gamericefishpro.space.i3.f fVar5;
        int size;
        ArrayList arrayList2;
        int i9;
        float f;
        com.gamericefishpro.space.i3.f fVar6;
        com.gamericefishpro.space.i3.f fVar7;
        com.gamericefishpro.space.i3.f fVar8;
        com.gamericefishpro.space.i3.f fVar9;
        com.gamericefishpro.space.i3.b bVarL;
        float f2;
        c cVar8;
        d dVar4;
        int i10;
        int i11;
        d dVar5;
        e eVar2 = eVar;
        if (i == 0) {
            i2 = eVar2.y0;
            bVarArr = eVar2.B0;
            i3 = 0;
        } else {
            i2 = eVar2.z0;
            bVarArr = eVar2.A0;
            i3 = 2;
        }
        int i12 = i2;
        b[] bVarArr2 = bVarArr;
        int i13 = 0;
        while (i13 < i12) {
            b bVar = bVarArr2[i13];
            boolean z4 = bVar.q;
            d dVar6 = bVar.a;
            c[] cVarArr2 = dVar6.P;
            int i14 = 3;
            int i15 = 8;
            float f3 = 0.0f;
            if (z4) {
                i4 = i13;
            } else {
                int i16 = bVar.l;
                int i17 = i16 * 2;
                d dVar7 = dVar6;
                d dVar8 = dVar7;
                boolean z5 = false;
                while (!z5) {
                    bVar.i++;
                    d[] dVarArr = dVar7.l0;
                    c[] cVarArr3 = dVar7.P;
                    dVarArr[i16] = null;
                    dVar7.k0[i16] = null;
                    if (dVar7.f0 != i15) {
                        dVar7.j(i16);
                        cVarArr3[i17].e();
                        int i18 = i17 + 1;
                        cVarArr3[i18].e();
                        cVarArr3[i17].e();
                        cVarArr3[i18].e();
                        if (bVar.b == null) {
                            bVar.b = dVar7;
                        }
                        bVar.d = dVar7;
                        int i19 = dVar7.o0[i16];
                        if (i19 == i14) {
                            int i20 = dVar7.s[i16];
                            if (i20 == 0 || i20 == i14 || i20 == 2) {
                                bVar.j++;
                                float f4 = dVar7.j0[i16];
                                if (f4 > 0.0f) {
                                    bVar.k += f4;
                                }
                                i11 = i16;
                                if (dVar7.f0 != 8 && i19 == 3 && (i20 == 0 || i20 == 3)) {
                                    if (f4 < 0.0f) {
                                        bVar.n = true;
                                    } else {
                                        bVar.o = true;
                                    }
                                    if (bVar.h == null) {
                                        bVar.h = new ArrayList();
                                    }
                                    bVar.h.add(dVar7);
                                }
                                if (bVar.f == null) {
                                    bVar.f = dVar7;
                                }
                                d dVar9 = bVar.g;
                                if (dVar9 != null) {
                                    dVar9.k0[i11] = dVar7;
                                }
                                bVar.g = dVar7;
                            } else {
                                i13 = i13;
                                i11 = i16;
                            }
                            if (i11 == 0) {
                                if (dVar7.q == 0 && dVar7.t == 0) {
                                    int i21 = dVar7.u;
                                }
                            } else if (dVar7.r == 0 && dVar7.w == 0) {
                                int i22 = dVar7.x;
                            }
                        } else {
                            i13 = i13;
                            i11 = i16;
                        }
                    } else {
                        i13 = i13;
                        i11 = i16;
                    }
                    d dVar10 = dVar8;
                    if (dVar10 != dVar7) {
                        dVar10.l0[i11] = dVar7;
                    }
                    c cVar9 = cVarArr3[i17 + 1].f;
                    if (cVar9 != null) {
                        dVar5 = cVar9.d;
                        c cVar10 = dVar5.P[i17].f;
                        if (cVar10 == null || cVar10.d != dVar7) {
                            dVar5 = null;
                        }
                    } else {
                        dVar5 = null;
                    }
                    if (dVar5 == null) {
                        dVar5 = dVar7;
                        z5 = true;
                    }
                    dVar8 = dVar7;
                    i16 = i11;
                    i14 = 3;
                    i15 = 8;
                    dVar7 = dVar5;
                    i13 = i13;
                }
                i4 = i13;
                int i23 = i16;
                d dVar11 = bVar.b;
                if (dVar11 != null) {
                    dVar11.P[i17].e();
                }
                d dVar12 = bVar.d;
                if (dVar12 != null) {
                    dVar12.P[i17 + 1].e();
                }
                bVar.c = dVar7;
                if (i23 == 0 && bVar.m) {
                    bVar.e = dVar7;
                } else {
                    bVar.e = dVar6;
                }
                bVar.p = bVar.o && bVar.n;
            }
            bVar.q = true;
            if (arrayList == 0 || arrayList.contains(dVar6)) {
                d dVar13 = bVar.c;
                d dVar14 = bVar.b;
                d dVar15 = bVar.d;
                d dVar16 = bVar.e;
                float f5 = bVar.k;
                int[] iArr = eVar2.o0;
                c[] cVarArr4 = eVar2.P;
                boolean z6 = iArr[i] == 2;
                if (i == 0) {
                    int i24 = dVar16.h0;
                    boolean z7 = i24 == 0;
                    boolean z8 = i24 == 1;
                    z = i24 == 2;
                    z3 = z8;
                    z2 = z7;
                } else {
                    int i25 = dVar16.i0;
                    boolean z9 = i25 == 0;
                    boolean z10 = i25 == 1;
                    z = i25 == 2;
                    z2 = z9;
                    z3 = z10;
                }
                boolean z11 = false;
                while (!z11) {
                    c[] cVarArr5 = dVar6.P;
                    int[] iArr2 = dVar6.o0;
                    c cVar11 = cVarArr5[i3];
                    int i26 = z ? 1 : 4;
                    int iE = cVar11.e();
                    boolean z12 = z6;
                    boolean z13 = z;
                    boolean z14 = iArr2[i] == 3 && dVar6.s[i] == 0;
                    c cVar12 = cVar11.f;
                    if (cVar12 != null && dVar6 != dVar6) {
                        iE = cVar12.e() + iE;
                    }
                    int i27 = iE;
                    if (z13 && dVar6 != dVar6 && dVar6 != dVar14) {
                        i26 = 8;
                    }
                    d dVar17 = dVar6;
                    c cVar13 = cVar11.f;
                    if (cVar13 != null) {
                        if (dVar6 == dVar14) {
                            cVar.f(cVar11.i, cVar13.i, i27, 6);
                        } else {
                            cVar.f(cVar11.i, cVar13.i, i27, 8);
                        }
                        if (z14 && !z13) {
                            i26 = 5;
                        }
                        cVar.e(cVar11.i, cVar11.f.i, i27, (dVar6 == dVar14 && z13 && dVar6.R[i]) ? 5 : i26);
                    }
                    if (z12) {
                        if (dVar6.f0 == 8 || iArr2[i] != 3) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                            cVar.f(cVarArr5[i3 + 1].i, cVarArr5[i3].i, 0, 5);
                        }
                        cVar.f(cVarArr5[i3].i, cVarArr4[i3].i, i10, 8);
                    }
                    c cVar14 = cVarArr5[i3 + 1].f;
                    if (cVar14 != null) {
                        dVar4 = cVar14.d;
                        c cVar15 = dVar4.P[i3].f;
                        if (cVar15 == null || cVar15.d != dVar6) {
                            dVar4 = null;
                        }
                    } else {
                        dVar4 = null;
                    }
                    if (dVar4 != null) {
                        dVar6 = dVar4;
                    } else {
                        z11 = true;
                    }
                    dVar6 = dVar17;
                    z6 = z12;
                    z = z13;
                }
                boolean z15 = z6;
                boolean z16 = z;
                if (dVar15 != null) {
                    int i28 = i3 + 1;
                    if (dVar13.P[i28].f != null) {
                        c cVar16 = dVar15.P[i28];
                        if (dVar15.o0[i] == 3 && dVar15.s[i] == 0 && !z16) {
                            c cVar17 = cVar16.f;
                            if (cVar17.d == eVar2) {
                                cVar.e(cVar16.i, cVar17.i, -cVar16.e(), 5);
                            } else if (z16) {
                                cVar8 = cVar16.f;
                                if (cVar8.d == eVar2) {
                                    cVar.e(cVar16.i, cVar8.i, -cVar16.e(), 4);
                                }
                            }
                        } else if (z16) {
                            cVar8 = cVar16.f;
                            if (cVar8.d == eVar2) {
                                cVar.e(cVar16.i, cVar8.i, -cVar16.e(), 4);
                            }
                        }
                        cVar.g(cVar16.i, dVar13.P[i28].f.i, -cVar16.e(), 6);
                    }
                }
                if (z15) {
                    int i29 = i3 + 1;
                    com.gamericefishpro.space.i3.f fVar10 = cVarArr4[i29].i;
                    c cVar18 = dVar13.P[i29];
                    cVar.f(fVar10, cVar18.i, cVar18.e(), 8);
                }
                ArrayList arrayList3 = bVar.h;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    if (bVar.n && !bVar.p) {
                        f5 = bVar.j;
                    }
                    d dVar18 = null;
                    float f6 = 0.0f;
                    int i30 = 0;
                    while (i30 < size) {
                        d dVar19 = (d) arrayList3.get(i30);
                        float[] fArr = dVar19.j0;
                        c[] cVarArr6 = dVar19.P;
                        float f7 = fArr[i];
                        if (f7 >= f3) {
                            arrayList2 = arrayList3;
                            i9 = size;
                            if (f7 == f3) {
                                cVar.e(cVarArr6[i3 + 1].i, cVarArr6[i3].i, 0, 8);
                                i30 = i30;
                                f = f3;
                                f6 = f6;
                                i12 = i12;
                            } else {
                                float f8 = f6;
                                if (dVar18 != null) {
                                    c[] cVarArr7 = dVar18.P;
                                    fVar6 = cVarArr7[i3].i;
                                    int i31 = i3 + 1;
                                    fVar7 = cVarArr7[i31].i;
                                    fVar8 = cVarArr6[i3].i;
                                    fVar9 = cVarArr6[i31].i;
                                    bVarL = cVar.l();
                                    f2 = f3;
                                    bVarL.b = f2;
                                    f = f2;
                                    if (f5 != f2 || f8 == f7) {
                                        bVarL.d.g(fVar6, 1.0f);
                                        bVarL.d.g(fVar7, -1.0f);
                                        bVarL.d.g(fVar9, 1.0f);
                                        bVarL.d.g(fVar8, -1.0f);
                                    } else if (f8 == f) {
                                        bVarL.d.g(fVar6, 1.0f);
                                        bVarL.d.g(fVar7, -1.0f);
                                    } else if (f7 == f3) {
                                        bVarL.d.g(fVar8, 1.0f);
                                        bVarL.d.g(fVar9, -1.0f);
                                    } else {
                                        float f9 = (f8 / f5) / (f7 / f5);
                                        bVarL.d.g(fVar6, 1.0f);
                                        bVarL.d.g(fVar7, -1.0f);
                                        bVarL.d.g(fVar9, f9);
                                        bVarL.d.g(fVar8, -f9);
                                    }
                                    cVar.c(bVarL);
                                } else {
                                    i30 = i30;
                                    f = f3;
                                    i12 = i12;
                                }
                                f6 = f7;
                                dVar18 = dVar19;
                            }
                        } else {
                            if (bVar.p) {
                                arrayList2 = arrayList3;
                                i9 = size;
                                cVar.e(cVarArr6[i3 + 1].i, cVarArr6[i3].i, 0, 4);
                            } else {
                                f7 = 1.0f;
                                arrayList2 = arrayList3;
                                i9 = size;
                                if (f7 == f3) {
                                    cVar.e(cVarArr6[i3 + 1].i, cVarArr6[i3].i, 0, 8);
                                } else {
                                    float f10 = f6;
                                    if (dVar18 != null) {
                                        c[] cVarArr8 = dVar18.P;
                                        fVar6 = cVarArr8[i3].i;
                                        int i32 = i3 + 1;
                                        fVar7 = cVarArr8[i32].i;
                                        fVar8 = cVarArr6[i3].i;
                                        fVar9 = cVarArr6[i32].i;
                                        bVarL = cVar.l();
                                        f2 = f3;
                                        bVarL.b = f2;
                                        f = f2;
                                        if (f5 != f2) {
                                            bVarL.d.g(fVar6, 1.0f);
                                            bVarL.d.g(fVar7, -1.0f);
                                            bVarL.d.g(fVar9, 1.0f);
                                            bVarL.d.g(fVar8, -1.0f);
                                        } else {
                                            bVarL.d.g(fVar6, 1.0f);
                                            bVarL.d.g(fVar7, -1.0f);
                                            bVarL.d.g(fVar9, 1.0f);
                                            bVarL.d.g(fVar8, -1.0f);
                                        }
                                        cVar.c(bVarL);
                                    } else {
                                        i30 = i30;
                                        f = f3;
                                        i12 = i12;
                                    }
                                    f6 = f7;
                                    dVar18 = dVar19;
                                }
                            }
                            i30 = i30;
                            f = f3;
                            f6 = f6;
                            i12 = i12;
                        }
                        i30++;
                        i12 = i12;
                        arrayList3 = arrayList2;
                        size = i9;
                        f3 = f;
                    }
                }
                i5 = i12;
                if (dVar14 == null || !(dVar14 == dVar15 || z16)) {
                    dVar = dVar15;
                    if (!z2 || dVar14 == null) {
                        int i33 = 8;
                        if (z3 && dVar14 != null) {
                            int i34 = bVar.j;
                            boolean z17 = i34 > 0 && bVar.i == i34;
                            d dVar20 = dVar14;
                            d dVar21 = dVar20;
                            while (dVar21 != null) {
                                c[] cVarArr9 = dVar21.P;
                                d dVar22 = dVar21.l0[i];
                                while (dVar22 != null && dVar22.f0 == i33) {
                                    dVar22 = dVar22.l0[i];
                                }
                                if (dVar21 == dVar14 || dVar21 == dVar || dVar22 == null) {
                                    dVar20 = dVar20;
                                } else {
                                    if (dVar22 == dVar) {
                                        dVar22 = null;
                                    }
                                    c cVar19 = cVarArr9[i3];
                                    com.gamericefishpro.space.i3.f fVar11 = cVar19.i;
                                    int i35 = i3 + 1;
                                    com.gamericefishpro.space.i3.f fVar12 = dVar20.P[i35].i;
                                    int iE2 = cVar19.e();
                                    int iE3 = cVarArr9[i35].e();
                                    if (dVar22 != null) {
                                        cVar3 = dVar22.P[i3];
                                        fVar2 = cVar3.i;
                                        c cVar20 = cVar3.f;
                                        fVar = cVar20 != null ? cVar20.i : null;
                                    } else {
                                        c cVar21 = dVar.P[i3];
                                        com.gamericefishpro.space.i3.f fVar13 = cVar21 != null ? cVar21.i : null;
                                        fVar = cVarArr9[i35].i;
                                        cVar3 = cVar21;
                                        fVar2 = fVar13;
                                    }
                                    if (cVar3 != null) {
                                        iE3 += cVar3.e();
                                    }
                                    int iE4 = iE2 + dVar20.P[i35].e();
                                    d dVar23 = dVar22;
                                    com.gamericefishpro.space.i3.f fVar14 = fVar2;
                                    int i36 = z17 ? 8 : 4;
                                    if (fVar11 == null || fVar12 == null || fVar14 == null || fVar == null) {
                                        dVar2 = dVar23;
                                    } else {
                                        dVar2 = dVar23;
                                        cVar.b(fVar11, fVar12, iE4, 0.5f, fVar14, fVar, iE3, i36);
                                    }
                                    dVar22 = dVar2;
                                }
                                if (dVar21.f0 != 8) {
                                    dVar20 = dVar21;
                                }
                                dVar21 = dVar22;
                                dVar20 = dVar20;
                                i33 = 8;
                            }
                            cVar2 = cVar;
                            c cVar22 = dVar14.P[i3];
                            c cVar23 = cVarArr2[i3].f;
                            int i37 = i3 + 1;
                            c cVar24 = dVar.P[i37];
                            c cVar25 = dVar13.P[i37].f;
                            if (cVar23 != null) {
                                if (dVar14 != dVar) {
                                    cVar2.e(cVar22.i, cVar23.i, cVar22.e(), 5);
                                } else if (cVar25 != null) {
                                    cVar2.b(cVar22.i, cVar23.i, cVar22.e(), 0.5f, cVar24.i, cVar25.i, cVar24.e(), 5);
                                }
                            }
                            if (cVar25 != null && dVar14 != dVar) {
                                cVar2.e(cVar24.i, cVar25.i, -cVar24.e(), 5);
                            }
                        }
                        if ((z2 || z3) && dVar14 != null && dVar14 != dVar) {
                            cVarArr = dVar14.P;
                            c cVar26 = cVarArr[i3];
                            if (dVar == null) {
                                dVar = dVar14;
                            }
                            c[] cVarArr10 = dVar.P;
                            i8 = i3 + 1;
                            cVar5 = cVarArr10[i8];
                            cVar6 = cVar26.f;
                            if (cVar6 != null) {
                                fVar4 = cVar6.i;
                            } else {
                                fVar4 = null;
                            }
                            cVar7 = cVar5.f;
                            if (cVar7 != null) {
                                fVar5 = cVar7.i;
                            } else {
                                fVar5 = null;
                            }
                            if (dVar13 != dVar) {
                                c cVar27 = dVar13.P[i8].f;
                                fVar5 = cVar27 != null ? cVar27.i : null;
                            }
                            if (dVar14 == dVar) {
                                cVar5 = cVarArr[i8];
                            }
                            if (fVar4 == null && fVar5 != null) {
                                cVar2.b(cVar26.i, fVar4, cVar26.e(), 0.5f, fVar5, cVar5.i, cVarArr10[i8].e(), 5);
                            }
                        }
                    } else {
                        int i38 = bVar.j;
                        boolean z18 = i38 > 0 && bVar.i == i38;
                        d dVar24 = dVar14;
                        d dVar25 = dVar24;
                        while (dVar24 != null) {
                            c[] cVarArr11 = dVar24.P;
                            d dVar26 = dVar24.l0[i];
                            while (true) {
                                if (dVar26 == null) {
                                    i6 = 8;
                                    break;
                                }
                                i6 = 8;
                                if (dVar26.f0 != 8) {
                                    break;
                                } else {
                                    dVar26 = dVar26.l0[i];
                                }
                            }
                            if (dVar26 != null || dVar24 == dVar) {
                                c cVar28 = cVarArr11[i3];
                                com.gamericefishpro.space.i3.f fVar15 = cVar28.i;
                                c cVar29 = cVar28.f;
                                com.gamericefishpro.space.i3.f fVar16 = cVar29 != null ? cVar29.i : null;
                                if (dVar25 != dVar24) {
                                    fVar16 = dVar25.P[i3 + 1].i;
                                } else if (dVar24 == dVar14) {
                                    c cVar30 = cVarArr2[i3].f;
                                    fVar16 = cVar30 != null ? cVar30.i : null;
                                }
                                int iE5 = cVar28.e();
                                int i39 = i3 + 1;
                                int iE6 = cVarArr11[i39].e();
                                if (dVar26 != null) {
                                    cVar4 = dVar26.P[i3];
                                    fVar3 = cVar4.i;
                                } else {
                                    cVar4 = dVar13.P[i39].f;
                                    fVar3 = cVar4 != null ? cVar4.i : null;
                                }
                                com.gamericefishpro.space.i3.f fVar17 = cVarArr11[i39].i;
                                if (cVar4 != null) {
                                    iE6 += cVar4.e();
                                }
                                int iE7 = dVar25.P[i39].e() + iE5;
                                if (fVar15 == null || fVar16 == null || fVar3 == null || fVar17 == null) {
                                    dVar3 = dVar26;
                                    i7 = 8;
                                } else {
                                    if (dVar24 == dVar14) {
                                        iE7 = dVar14.P[i3].e();
                                    }
                                    if (dVar24 == dVar) {
                                        iE6 = dVar.P[i39].e();
                                    }
                                    dVar3 = dVar26;
                                    i7 = 8;
                                    cVar.b(fVar15, fVar16, iE7, 0.5f, fVar3, fVar17, iE6, z18 ? 8 : 5);
                                }
                            } else {
                                dVar3 = dVar26;
                                i7 = i6;
                            }
                            if (dVar24.f0 != i7) {
                                dVar25 = dVar24;
                            }
                            dVar24 = dVar3;
                            dVar25 = dVar25;
                            cVarArr2 = cVarArr2;
                        }
                    }
                } else {
                    c cVar31 = cVarArr2[i3];
                    int i40 = i3 + 1;
                    c cVar32 = dVar13.P[i40];
                    c cVar33 = cVar31.f;
                    com.gamericefishpro.space.i3.f fVar18 = cVar33 != null ? cVar33.i : null;
                    c cVar34 = cVar32.f;
                    com.gamericefishpro.space.i3.f fVar19 = cVar34 != null ? cVar34.i : null;
                    c cVar35 = dVar14.P[i3];
                    if (dVar15 != null) {
                        cVar32 = dVar15.P[i40];
                    }
                    if (fVar18 == null || fVar19 == null) {
                        dVar = dVar15;
                    } else {
                        float f11 = i == 0 ? dVar16.c0 : dVar16.d0;
                        int iE8 = cVar35.e();
                        int iE9 = cVar32.e();
                        com.gamericefishpro.space.i3.f fVar20 = cVar35.i;
                        com.gamericefishpro.space.i3.f fVar21 = cVar32.i;
                        com.gamericefishpro.space.i3.f fVar22 = fVar18;
                        dVar = dVar15;
                        cVar.b(fVar20, fVar22, iE8, f11, fVar19, fVar21, iE9, 7);
                    }
                }
                cVar2 = cVar;
                if (z2) {
                    cVarArr = dVar14.P;
                    c cVar210 = cVarArr[i3];
                    if (dVar == null) {
                        dVar = dVar14;
                    }
                    c[] cVarArr12 = dVar.P;
                    i8 = i3 + 1;
                    cVar5 = cVarArr12[i8];
                    cVar6 = cVar210.f;
                    if (cVar6 != null) {
                        fVar4 = cVar6.i;
                    } else {
                        fVar4 = null;
                    }
                    cVar7 = cVar5.f;
                    if (cVar7 != null) {
                        fVar5 = cVar7.i;
                    } else {
                        fVar5 = null;
                    }
                    if (dVar13 != dVar) {
                        c cVar211 = dVar13.P[i8].f;
                        fVar5 = cVar211 != null ? cVar211.i : null;
                    }
                    if (dVar14 == dVar) {
                        cVar5 = cVarArr[i8];
                    }
                    if (fVar4 == null) {
                    }
                } else {
                    cVarArr = dVar14.P;
                    c cVar212 = cVarArr[i3];
                    if (dVar == null) {
                        dVar = dVar14;
                    }
                    c[] cVarArr13 = dVar.P;
                    i8 = i3 + 1;
                    cVar5 = cVarArr13[i8];
                    cVar6 = cVar212.f;
                    if (cVar6 != null) {
                        fVar4 = cVar6.i;
                    } else {
                        fVar4 = null;
                    }
                    cVar7 = cVar5.f;
                    if (cVar7 != null) {
                        fVar5 = cVar7.i;
                    } else {
                        fVar5 = null;
                    }
                    if (dVar13 != dVar) {
                        c cVar213 = dVar13.P[i8].f;
                        fVar5 = cVar213 != null ? cVar213.i : null;
                    }
                    if (dVar14 == dVar) {
                        cVar5 = cVarArr[i8];
                    }
                    if (fVar4 == null) {
                    }
                }
            } else {
                i5 = i12;
            }
            i13 = i4 + 1;
            eVar2 = eVar;
            i12 = i5;
        }
    }

    public static void b(e eVar, com.gamericefishpro.space.i3.c cVar, d dVar) {
        dVar.n = -1;
        c cVar2 = dVar.L;
        int[] iArr = dVar.o0;
        c cVar3 = dVar.K;
        c cVar4 = dVar.I;
        c cVar5 = dVar.J;
        c cVar6 = dVar.H;
        dVar.o = -1;
        int[] iArr2 = eVar.o0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i = cVar6.g;
            int iN = eVar.n() - cVar5.g;
            cVar6.i = cVar.k(cVar6);
            cVar5.i = cVar.k(cVar5);
            cVar.d(cVar6.i, i);
            cVar.d(cVar5.i, iN);
            dVar.n = 2;
            dVar.X = i;
            int i2 = iN - i;
            dVar.T = i2;
            int i3 = dVar.a0;
            if (i2 < i3) {
                dVar.T = i3;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i4 = cVar4.g;
        int iK = eVar.k() - cVar3.g;
        cVar4.i = cVar.k(cVar4);
        cVar3.i = cVar.k(cVar3);
        cVar.d(cVar4.i, i4);
        cVar.d(cVar3.i, iK);
        if (dVar.Z > 0 || dVar.f0 == 8) {
            com.gamericefishpro.space.i3.f fVarK = cVar.k(cVar2);
            cVar2.i = fVarK;
            cVar.d(fVarK, dVar.Z + i4);
        }
        dVar.o = 2;
        dVar.Y = i4;
        int i5 = iK - i4;
        dVar.U = i5;
        int i6 = dVar.b0;
        if (i5 < i6) {
            dVar.U = i6;
        }
    }

    public static final boolean c(int i, int i2) {
        return (i & i2) == i2;
    }
}
