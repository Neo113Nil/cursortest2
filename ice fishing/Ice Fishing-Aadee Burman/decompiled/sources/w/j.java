package w;

import java.util.ArrayList;
import u.C5046b;
import u.C5047c;
import u.C5050f;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f41621a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:162:0x028e, code lost:
    
        if (r8.f41471d == r6) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010c, code lost:
    
        if (r4.f41471d == r8) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0695 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x06ec A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(C5140e c5140e, C5047c c5047c, ArrayList arrayList, int i) {
        int i6;
        C5137b[] c5137bArr;
        int i9;
        int i10;
        float f3;
        float f9;
        boolean z3;
        C5139d c5139d;
        boolean z6;
        boolean z9;
        boolean z10;
        boolean z11;
        C5138c[] c5138cArr;
        int i11;
        C5137b[] c5137bArr2;
        C5139d c5139d2;
        C5047c c5047c2;
        C5050f c5050f;
        C5138c c5138c;
        C5050f c5050f2;
        C5139d c5139d3;
        int i12;
        C5138c c5138c2;
        C5050f c5050f3;
        C5139d c5139d4;
        C5139d c5139d5;
        int i13;
        C5138c c5138c3;
        int i14;
        C5138c[] c5138cArr2;
        C5138c c5138c4;
        C5050f c5050f4;
        C5050f c5050f5;
        int size;
        float f10;
        ArrayList arrayList2;
        int i15;
        float f11;
        C5139d c5139d6;
        int i16;
        float f12;
        C5137b[] c5137bArr3;
        boolean z12;
        int i17;
        C5139d c5139d7;
        int i18;
        int i19;
        int i20;
        C5138c c5138c5;
        C5139d c5139d8;
        C5140e c5140e2 = c5140e;
        C5047c c5047c3 = c5047c;
        ArrayList arrayList3 = arrayList;
        if (i == 0) {
            i6 = c5140e2.f41560z0;
            c5137bArr = c5140e2.C0;
            i9 = 0;
        } else {
            i6 = c5140e2.f41540A0;
            c5137bArr = c5140e2.f41541B0;
            i9 = 2;
        }
        int i21 = i6;
        C5137b[] c5137bArr4 = c5137bArr;
        int i22 = 0;
        while (i22 < i21) {
            C5137b c5137b = c5137bArr4[i22];
            boolean z13 = c5137b.f41467q;
            C5139d c5139d9 = c5137b.f41452a;
            int i23 = 3;
            int i24 = 8;
            if (z13) {
                i10 = i22;
                f3 = 0.0f;
            } else {
                int i25 = c5137b.f41462l;
                int i26 = i25 * 2;
                C5139d c5139d10 = c5139d9;
                C5139d c5139d11 = c5139d10;
                boolean z14 = false;
                f3 = 0.0f;
                while (!z14) {
                    c5137b.i++;
                    c5139d10.m0[i25] = null;
                    c5139d10.f41522l0[i25] = null;
                    int i27 = c5139d10.f41513g0;
                    C5138c[] c5138cArr3 = c5139d10.f41491Q;
                    if (i27 != i24) {
                        c5139d10.j(i25);
                        c5138cArr3[i26].e();
                        int i28 = i26 + 1;
                        c5138cArr3[i28].e();
                        c5138cArr3[i26].e();
                        c5138cArr3[i28].e();
                        if (c5137b.f41453b == null) {
                            c5137b.f41453b = c5139d10;
                        }
                        c5137b.f41455d = c5139d10;
                        int i29 = c5139d10.f41529p0[i25];
                        if (i29 == i23) {
                            int i30 = c5139d10.f41533t[i25];
                            if (i30 == 0 || i30 == i23 || i30 == 2) {
                                c5137b.f41460j++;
                                float f13 = c5139d10.f41520k0[i25];
                                if (f13 > 0.0f) {
                                    i19 = i22;
                                    c5137b.f41461k += f13;
                                } else {
                                    i19 = i22;
                                }
                                i20 = i25;
                                if (c5139d10.f41513g0 != 8 && i29 == 3 && (i30 == 0 || i30 == 3)) {
                                    if (f13 < 0.0f) {
                                        c5137b.f41464n = true;
                                    } else {
                                        c5137b.f41465o = true;
                                    }
                                    if (c5137b.f41459h == null) {
                                        c5137b.f41459h = new ArrayList();
                                    }
                                    c5137b.f41459h.add(c5139d10);
                                }
                                if (c5137b.f41457f == null) {
                                    c5137b.f41457f = c5139d10;
                                }
                                C5139d c5139d12 = c5137b.f41458g;
                                if (c5139d12 != null) {
                                    c5139d12.f41522l0[i20] = c5139d10;
                                }
                                c5137b.f41458g = c5139d10;
                            } else {
                                i19 = i22;
                                i20 = i25;
                            }
                            if (i20 == 0) {
                                if (c5139d10.f41531r == 0 && c5139d10.f41534u == 0) {
                                    int i31 = c5139d10.f41535v;
                                }
                            } else if (c5139d10.f41532s == 0 && c5139d10.f41537x == 0) {
                                int i32 = c5139d10.f41538y;
                            }
                            if (c5139d11 != c5139d10) {
                                c5139d11.m0[i20] = c5139d10;
                            }
                            c5138c5 = c5138cArr3[i26 + 1].f41473f;
                            if (c5138c5 != null) {
                                c5139d8 = c5138c5.f41471d;
                                C5138c c5138c6 = c5139d8.f41491Q[i26].f41473f;
                                if (c5138c6 != null) {
                                }
                            }
                            c5139d8 = null;
                            if (c5139d8 != null) {
                                c5139d8 = c5139d10;
                                z14 = true;
                            }
                            c5139d11 = c5139d10;
                            i25 = i20;
                            i23 = 3;
                            i24 = 8;
                            c5139d10 = c5139d8;
                            i22 = i19;
                        }
                    }
                    i19 = i22;
                    i20 = i25;
                    if (c5139d11 != c5139d10) {
                    }
                    c5138c5 = c5138cArr3[i26 + 1].f41473f;
                    if (c5138c5 != null) {
                    }
                    c5139d8 = null;
                    if (c5139d8 != null) {
                    }
                    c5139d11 = c5139d10;
                    i25 = i20;
                    i23 = 3;
                    i24 = 8;
                    c5139d10 = c5139d8;
                    i22 = i19;
                }
                i10 = i22;
                int i33 = i25;
                C5139d c5139d13 = c5137b.f41453b;
                if (c5139d13 != null) {
                    c5139d13.f41491Q[i26].e();
                }
                C5139d c5139d14 = c5137b.f41455d;
                if (c5139d14 != null) {
                    c5139d14.f41491Q[i26 + 1].e();
                }
                c5137b.f41454c = c5139d10;
                if (i33 == 0 && c5137b.f41463m) {
                    c5137b.f41456e = c5139d10;
                } else {
                    c5137b.f41456e = c5139d9;
                }
                c5137b.f41466p = c5137b.f41465o && c5137b.f41464n;
            }
            c5137b.f41467q = true;
            if (arrayList3 == null || arrayList3.contains(c5139d9)) {
                C5139d c5139d15 = c5137b.f41454c;
                C5139d c5139d16 = c5137b.f41453b;
                C5139d c5139d17 = c5137b.f41455d;
                C5139d c5139d18 = c5137b.f41456e;
                float f14 = c5137b.f41461k;
                boolean z15 = c5140e2.f41529p0[i] == 2;
                if (i == 0) {
                    int i34 = c5139d18.f41516i0;
                    boolean z16 = i34 == 0;
                    boolean z17 = i34 == 1;
                    z3 = i34 == 2;
                    z6 = z15;
                    z10 = z17;
                    z9 = z16;
                    z11 = false;
                    f9 = f14;
                    c5139d = c5139d9;
                } else {
                    int i35 = c5139d18.f41518j0;
                    boolean z18 = i35 == 0;
                    boolean z19 = i35 == 1;
                    f9 = f14;
                    z3 = i35 == 2;
                    c5139d = c5139d9;
                    z6 = z15;
                    z9 = z18;
                    z10 = z19;
                    z11 = false;
                }
                while (true) {
                    c5138cArr = c5140e2.f41491Q;
                    if (z11) {
                        break;
                    }
                    C5138c c5138c7 = c5139d.f41491Q[i9];
                    int i36 = z3 ? 1 : 4;
                    int e9 = c5138c7.e();
                    boolean z20 = z11;
                    int[] iArr = c5139d.f41529p0;
                    boolean z21 = z3;
                    boolean z22 = iArr[i] == 3 && c5139d.f41533t[i] == 0;
                    C5138c c5138c8 = c5138c7.f41473f;
                    if (c5138c8 != null && c5139d != c5139d9) {
                        e9 = c5138c8.e() + e9;
                    }
                    int i37 = e9;
                    if (z21 && c5139d != c5139d9 && c5139d != c5139d16) {
                        i36 = 8;
                    }
                    boolean z23 = z22;
                    C5138c c5138c9 = c5138c7.f41473f;
                    if (c5138c9 != null) {
                        if (c5139d == c5139d16) {
                            i17 = i21;
                            c5047c3.f(c5138c7.i, c5138c9.i, i37, 6);
                        } else {
                            i17 = i21;
                            c5047c3.f(c5138c7.i, c5138c9.i, i37, 8);
                        }
                        if (z23 && !z21) {
                            i36 = 5;
                        }
                        c5047c3.e(c5138c7.i, c5138c7.f41473f.i, i37, (c5139d == c5139d16 && z21 && c5139d.f41493S[i]) ? 5 : i36);
                    } else {
                        i17 = i21;
                    }
                    C5138c[] c5138cArr4 = c5139d.f41491Q;
                    if (z6) {
                        if (c5139d.f41513g0 == 8 || iArr[i] != 3) {
                            i18 = 0;
                        } else {
                            i18 = 0;
                            c5047c3.f(c5138cArr4[i9 + 1].i, c5138cArr4[i9].i, 0, 5);
                        }
                        c5047c3.f(c5138cArr4[i9].i, c5138cArr[i9].i, i18, 8);
                    }
                    C5138c c5138c10 = c5138cArr4[i9 + 1].f41473f;
                    if (c5138c10 != null) {
                        c5139d7 = c5138c10.f41471d;
                        C5138c c5138c11 = c5139d7.f41491Q[i9].f41473f;
                        if (c5138c11 != null) {
                        }
                    }
                    c5139d7 = null;
                    if (c5139d7 != null) {
                        c5139d = c5139d7;
                        z11 = z20;
                    } else {
                        z11 = true;
                    }
                    z3 = z21;
                    i21 = i17;
                }
                boolean z24 = z3;
                i11 = i21;
                if (c5139d17 != null) {
                    int i38 = i9 + 1;
                    if (c5139d15.f41491Q[i38].f41473f != null) {
                        C5138c c5138c12 = c5139d17.f41491Q[i38];
                        if (c5139d17.f41529p0[i] == 3 && c5139d17.f41533t[i] == 0 && !z24) {
                            C5138c c5138c13 = c5138c12.f41473f;
                            if (c5138c13.f41471d == c5140e2) {
                                c5047c3.e(c5138c12.i, c5138c13.i, -c5138c12.e(), 5);
                                c5047c3.g(c5138c12.i, c5139d15.f41491Q[i38].f41473f.i, -c5138c12.e(), 6);
                            }
                        }
                        if (z24) {
                            C5138c c5138c14 = c5138c12.f41473f;
                            if (c5138c14.f41471d == c5140e2) {
                                c5047c3.e(c5138c12.i, c5138c14.i, -c5138c12.e(), 4);
                            }
                        }
                        c5047c3.g(c5138c12.i, c5139d15.f41491Q[i38].f41473f.i, -c5138c12.e(), 6);
                    }
                }
                if (z6) {
                    int i39 = i9 + 1;
                    C5050f c5050f6 = c5138cArr[i39].i;
                    C5138c c5138c15 = c5139d15.f41491Q[i39];
                    c5047c3.f(c5050f6, c5138c15.i, c5138c15.e(), 8);
                }
                ArrayList arrayList4 = c5137b.f41459h;
                if (arrayList4 != null && (size = arrayList4.size()) > 1) {
                    if (c5137b.f41464n && !c5137b.f41466p) {
                        f9 = c5137b.f41460j;
                    }
                    C5139d c5139d19 = null;
                    float f15 = f3;
                    int i40 = 0;
                    while (i40 < size) {
                        C5139d c5139d20 = (C5139d) arrayList4.get(i40);
                        float f16 = c5139d20.f41520k0[i];
                        C5138c[] c5138cArr5 = c5139d20.f41491Q;
                        if (f16 >= f3) {
                            f10 = f16;
                        } else if (c5137b.f41466p) {
                            arrayList2 = arrayList4;
                            i15 = size;
                            c5047c3.e(c5138cArr5[i9 + 1].i, c5138cArr5[i9].i, 0, 4);
                            z12 = false;
                            i16 = i40;
                            f12 = f3;
                            c5137bArr3 = c5137bArr4;
                            i40 = i16 + 1;
                            c5137bArr4 = c5137bArr3;
                            arrayList4 = arrayList2;
                            size = i15;
                            f3 = f12;
                        } else {
                            f10 = 1.0f;
                        }
                        arrayList2 = arrayList4;
                        i15 = size;
                        if (f10 == f3) {
                            z12 = false;
                            c5047c3.e(c5138cArr5[i9 + 1].i, c5138cArr5[i9].i, 0, 8);
                            i16 = i40;
                            f12 = f3;
                            c5137bArr3 = c5137bArr4;
                            i40 = i16 + 1;
                            c5137bArr4 = c5137bArr3;
                            arrayList4 = arrayList2;
                            size = i15;
                            f3 = f12;
                        } else {
                            if (c5139d19 != null) {
                                C5138c[] c5138cArr6 = c5139d19.f41491Q;
                                C5050f c5050f7 = c5138cArr6[i9].i;
                                int i41 = i9 + 1;
                                C5050f c5050f8 = c5138cArr6[i41].i;
                                f11 = f10;
                                C5050f c5050f9 = c5138cArr5[i9].i;
                                C5050f c5050f10 = c5138cArr5[i41].i;
                                c5139d6 = c5139d20;
                                C5046b l9 = c5047c3.l();
                                i16 = i40;
                                float f17 = f3;
                                l9.f40948b = f17;
                                f12 = f17;
                                if (f9 == f17 || f15 == f11) {
                                    c5137bArr3 = c5137bArr4;
                                    l9.f40950d.g(c5050f7, 1.0f);
                                    l9.f40950d.g(c5050f8, -1.0f);
                                    l9.f40950d.g(c5050f10, 1.0f);
                                    l9.f40950d.g(c5050f9, -1.0f);
                                } else {
                                    if (f15 == f12) {
                                        l9.f40950d.g(c5050f7, 1.0f);
                                        l9.f40950d.g(c5050f8, -1.0f);
                                    } else if (f10 == f3) {
                                        l9.f40950d.g(c5050f9, 1.0f);
                                        l9.f40950d.g(c5050f10, -1.0f);
                                    } else {
                                        float f18 = (f15 / f9) / (f11 / f9);
                                        c5137bArr3 = c5137bArr4;
                                        l9.f40950d.g(c5050f7, 1.0f);
                                        l9.f40950d.g(c5050f8, -1.0f);
                                        l9.f40950d.g(c5050f10, f18);
                                        l9.f40950d.g(c5050f9, -f18);
                                    }
                                    c5137bArr3 = c5137bArr4;
                                }
                                c5047c3.c(l9);
                            } else {
                                f11 = f10;
                                c5139d6 = c5139d20;
                                i16 = i40;
                                f12 = f3;
                                c5137bArr3 = c5137bArr4;
                            }
                            c5139d19 = c5139d6;
                            f15 = f11;
                            i40 = i16 + 1;
                            c5137bArr4 = c5137bArr3;
                            arrayList4 = arrayList2;
                            size = i15;
                            f3 = f12;
                        }
                    }
                }
                c5137bArr2 = c5137bArr4;
                if (c5139d16 == null || !(c5139d16 == c5139d17 || z24)) {
                    c5139d2 = c5139d17;
                    if (z9 && c5139d16 != null) {
                        int i42 = c5137b.f41460j;
                        boolean z25 = i42 > 0 && c5137b.i == i42;
                        C5139d c5139d21 = c5139d16;
                        C5139d c5139d22 = c5139d21;
                        while (c5139d21 != null) {
                            C5139d c5139d23 = c5139d21.m0[i];
                            while (true) {
                                if (c5139d23 == null) {
                                    i12 = 8;
                                    break;
                                }
                                i12 = 8;
                                if (c5139d23.f41513g0 != 8) {
                                    break;
                                } else {
                                    c5139d23 = c5139d23.m0[i];
                                }
                            }
                            if (c5139d23 != null || c5139d21 == c5139d2) {
                                C5138c[] c5138cArr7 = c5139d21.f41491Q;
                                C5138c c5138c16 = c5138cArr7[i9];
                                C5050f c5050f11 = c5138c16.i;
                                C5138c c5138c17 = c5138c16.f41473f;
                                C5050f c5050f12 = c5138c17 != null ? c5138c17.i : null;
                                if (c5139d22 != c5139d21) {
                                    c5050f12 = c5139d22.f41491Q[i9 + 1].i;
                                } else if (c5139d21 == c5139d16) {
                                    C5138c c5138c18 = c5139d9.f41491Q[i9].f41473f;
                                    c5050f12 = c5138c18 != null ? c5138c18.i : null;
                                }
                                int e10 = c5138c16.e();
                                int i43 = i9 + 1;
                                int e11 = c5138cArr7[i43].e();
                                if (c5139d23 != null) {
                                    c5138c2 = c5139d23.f41491Q[i9];
                                    c5050f3 = c5138c2.i;
                                } else {
                                    c5138c2 = c5139d15.f41491Q[i43].f41473f;
                                    c5050f3 = c5138c2 != null ? c5138c2.i : null;
                                }
                                C5050f c5050f13 = c5138cArr7[i43].i;
                                if (c5138c2 != null) {
                                    e11 += c5138c2.e();
                                }
                                int e12 = c5139d22.f41491Q[i43].e() + e10;
                                if (c5050f11 == null || c5050f12 == null || c5050f3 == null || c5050f13 == null) {
                                    c5139d4 = c5139d9;
                                    c5139d5 = c5139d22;
                                    i13 = 8;
                                } else {
                                    if (c5139d21 == c5139d16) {
                                        e12 = c5139d16.f41491Q[i9].e();
                                    }
                                    if (c5139d21 == c5139d2) {
                                        e11 = c5139d2.f41491Q[i43].e();
                                    }
                                    c5139d4 = c5139d9;
                                    c5139d5 = c5139d22;
                                    i13 = 8;
                                    c5047c.b(c5050f11, c5050f12, e12, 0.5f, c5050f3, c5050f13, e11, z25 ? 8 : 5);
                                }
                            } else {
                                c5139d4 = c5139d9;
                                c5139d5 = c5139d22;
                                i13 = i12;
                            }
                            if (c5139d21.f41513g0 != i13) {
                                c5139d5 = c5139d21;
                            }
                            c5139d21 = c5139d23;
                            c5139d22 = c5139d5;
                            c5139d9 = c5139d4;
                        }
                    } else if (z10 && c5139d16 != null) {
                        int i44 = c5137b.f41460j;
                        boolean z26 = i44 > 0 && c5137b.i == i44;
                        C5139d c5139d24 = c5139d16;
                        C5139d c5139d25 = c5139d24;
                        while (c5139d24 != null) {
                            C5139d c5139d26 = c5139d24.m0[i];
                            while (c5139d26 != null && c5139d26.f41513g0 == 8) {
                                c5139d26 = c5139d26.m0[i];
                            }
                            if (c5139d24 != c5139d16 && c5139d24 != c5139d2 && c5139d26 != null) {
                                if (c5139d26 == c5139d2) {
                                    c5139d26 = null;
                                }
                                C5138c[] c5138cArr8 = c5139d24.f41491Q;
                                C5138c c5138c19 = c5138cArr8[i9];
                                C5050f c5050f14 = c5138c19.i;
                                int i45 = i9 + 1;
                                C5050f c5050f15 = c5139d25.f41491Q[i45].i;
                                int e13 = c5138c19.e();
                                int e14 = c5138cArr8[i45].e();
                                if (c5139d26 != null) {
                                    c5138c = c5139d26.f41491Q[i9];
                                    c5050f2 = c5138c.i;
                                    C5138c c5138c20 = c5138c.f41473f;
                                    c5050f = c5138c20 != null ? c5138c20.i : null;
                                } else {
                                    C5138c c5138c21 = c5139d2.f41491Q[i9];
                                    C5050f c5050f16 = c5138c21 != null ? c5138c21.i : null;
                                    c5050f = c5138cArr8[i45].i;
                                    c5138c = c5138c21;
                                    c5050f2 = c5050f16;
                                }
                                if (c5138c != null) {
                                    e14 += c5138c.e();
                                }
                                int e15 = c5139d25.f41491Q[i45].e() + e13;
                                C5050f c5050f17 = c5050f2;
                                int i46 = e14;
                                C5050f c5050f18 = c5050f;
                                int i47 = z26 ? 8 : 4;
                                if (c5050f14 == null || c5050f15 == null || c5050f17 == null || c5050f18 == null) {
                                    c5139d3 = c5139d26;
                                } else {
                                    c5139d3 = c5139d26;
                                    c5047c.b(c5050f14, c5050f15, e15, 0.5f, c5050f17, c5050f18, i46, i47);
                                }
                                c5139d26 = c5139d3;
                            }
                            if (c5139d24.f41513g0 != 8) {
                                c5139d25 = c5139d24;
                            }
                            c5139d24 = c5139d26;
                        }
                        C5138c c5138c22 = c5139d16.f41491Q[i9];
                        C5138c c5138c23 = c5139d9.f41491Q[i9].f41473f;
                        int i48 = i9 + 1;
                        C5138c c5138c24 = c5139d2.f41491Q[i48];
                        C5138c c5138c25 = c5139d15.f41491Q[i48].f41473f;
                        if (c5138c23 != null) {
                            if (c5139d16 != c5139d2) {
                                c5047c.e(c5138c22.i, c5138c23.i, c5138c22.e(), 5);
                            } else if (c5138c25 != null) {
                                c5047c2 = c5047c;
                                c5047c2.b(c5138c22.i, c5138c23.i, c5138c22.e(), 0.5f, c5138c24.i, c5138c25.i, c5138c24.e(), 5);
                                if (c5138c25 != null && c5139d16 != c5139d2) {
                                    c5047c2.e(c5138c24.i, c5138c25.i, -c5138c24.e(), 5);
                                }
                                if ((!z9 || z10) && c5139d16 != null && c5139d16 != c5139d2) {
                                    C5138c[] c5138cArr9 = c5139d16.f41491Q;
                                    c5138c3 = c5138cArr9[i9];
                                    if (c5139d2 == null) {
                                        c5139d2 = c5139d16;
                                    }
                                    i14 = i9 + 1;
                                    c5138cArr2 = c5139d2.f41491Q;
                                    c5138c4 = c5138cArr2[i14];
                                    C5138c c5138c26 = c5138c3.f41473f;
                                    c5050f4 = c5138c26 != null ? c5138c26.i : null;
                                    C5138c c5138c27 = c5138c4.f41473f;
                                    c5050f5 = c5138c27 != null ? c5138c27.i : null;
                                    if (c5139d15 != c5139d2) {
                                        C5138c c5138c28 = c5139d15.f41491Q[i14].f41473f;
                                        c5050f5 = c5138c28 != null ? c5138c28.i : null;
                                    }
                                    if (c5139d16 == c5139d2) {
                                        c5138c4 = c5138cArr9[i14];
                                    }
                                    if (c5050f4 == null && c5050f5 != null) {
                                        c5047c2.b(c5138c3.i, c5050f4, c5138c3.e(), 0.5f, c5050f5, c5138c4.i, c5138cArr2[i14].e(), 5);
                                    }
                                }
                            }
                        }
                        c5047c2 = c5047c;
                        if (c5138c25 != null) {
                            c5047c2.e(c5138c24.i, c5138c25.i, -c5138c24.e(), 5);
                        }
                        if (!z9) {
                        }
                        C5138c[] c5138cArr92 = c5139d16.f41491Q;
                        c5138c3 = c5138cArr92[i9];
                        if (c5139d2 == null) {
                        }
                        i14 = i9 + 1;
                        c5138cArr2 = c5139d2.f41491Q;
                        c5138c4 = c5138cArr2[i14];
                        C5138c c5138c262 = c5138c3.f41473f;
                        if (c5138c262 != null) {
                        }
                        C5138c c5138c272 = c5138c4.f41473f;
                        if (c5138c272 != null) {
                        }
                        if (c5139d15 != c5139d2) {
                        }
                        if (c5139d16 == c5139d2) {
                        }
                        if (c5050f4 == null) {
                            c5047c2.b(c5138c3.i, c5050f4, c5138c3.e(), 0.5f, c5050f5, c5138c4.i, c5138cArr2[i14].e(), 5);
                        }
                    }
                } else {
                    C5138c c5138c29 = c5139d9.f41491Q[i9];
                    int i49 = i9 + 1;
                    C5138c c5138c30 = c5139d15.f41491Q[i49];
                    C5138c c5138c31 = c5138c29.f41473f;
                    C5050f c5050f19 = c5138c31 != null ? c5138c31.i : null;
                    C5138c c5138c32 = c5138c30.f41473f;
                    C5050f c5050f20 = c5138c32 != null ? c5138c32.i : null;
                    C5138c c5138c33 = c5139d16.f41491Q[i9];
                    if (c5139d17 != null) {
                        c5138c30 = c5139d17.f41491Q[i49];
                    }
                    if (c5050f19 == null || c5050f20 == null) {
                        c5139d2 = c5139d17;
                    } else {
                        float f19 = i == 0 ? c5139d18.f41507d0 : c5139d18.f41509e0;
                        int e16 = c5138c33.e();
                        int e17 = c5138c30.e();
                        C5050f c5050f21 = c5138c33.i;
                        C5050f c5050f22 = c5138c30.i;
                        C5050f c5050f23 = c5050f19;
                        c5139d2 = c5139d17;
                        c5047c3.b(c5050f21, c5050f23, e16, f19, c5050f20, c5050f22, e17, 7);
                    }
                }
                c5047c2 = c5047c;
                if (!z9) {
                }
                C5138c[] c5138cArr922 = c5139d16.f41491Q;
                c5138c3 = c5138cArr922[i9];
                if (c5139d2 == null) {
                }
                i14 = i9 + 1;
                c5138cArr2 = c5139d2.f41491Q;
                c5138c4 = c5138cArr2[i14];
                C5138c c5138c2622 = c5138c3.f41473f;
                if (c5138c2622 != null) {
                }
                C5138c c5138c2722 = c5138c4.f41473f;
                if (c5138c2722 != null) {
                }
                if (c5139d15 != c5139d2) {
                }
                if (c5139d16 == c5139d2) {
                }
                if (c5050f4 == null) {
                }
            } else {
                i11 = i21;
                c5137bArr2 = c5137bArr4;
            }
            i22 = i10 + 1;
            c5140e2 = c5140e;
            c5047c3 = c5047c;
            arrayList3 = arrayList;
            c5137bArr4 = c5137bArr2;
            i21 = i11;
        }
    }

    public static void b(C5140e c5140e, C5047c c5047c, C5139d c5139d) {
        c5139d.f41526o = -1;
        c5139d.f41528p = -1;
        int i = c5140e.f41529p0[0];
        int[] iArr = c5139d.f41529p0;
        if (i != 2 && iArr[0] == 4) {
            C5138c c5138c = c5139d.f41484I;
            int i6 = c5138c.f41474g;
            int q8 = c5140e.q();
            C5138c c5138c2 = c5139d.f41485K;
            int i9 = q8 - c5138c2.f41474g;
            c5138c.i = c5047c.k(c5138c);
            c5138c2.i = c5047c.k(c5138c2);
            c5047c.d(c5138c.i, i6);
            c5047c.d(c5138c2.i, i9);
            c5139d.f41526o = 2;
            c5139d.Y = i6;
            int i10 = i9 - i6;
            c5139d.f41495U = i10;
            int i11 = c5139d.f41503b0;
            if (i10 < i11) {
                c5139d.f41495U = i11;
            }
        }
        if (c5140e.f41529p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        C5138c c5138c3 = c5139d.J;
        int i12 = c5138c3.f41474g;
        int k9 = c5140e.k();
        C5138c c5138c4 = c5139d.f41486L;
        int i13 = k9 - c5138c4.f41474g;
        c5138c3.i = c5047c.k(c5138c3);
        c5138c4.i = c5047c.k(c5138c4);
        c5047c.d(c5138c3.i, i12);
        c5047c.d(c5138c4.i, i13);
        if (c5139d.f41501a0 > 0 || c5139d.f41513g0 == 8) {
            C5138c c5138c5 = c5139d.f41487M;
            C5050f k10 = c5047c.k(c5138c5);
            c5138c5.i = k10;
            c5047c.d(k10, c5139d.f41501a0 + i12);
        }
        c5139d.f41528p = 2;
        c5139d.f41499Z = i12;
        int i14 = i13 - i12;
        c5139d.f41496V = i14;
        int i15 = c5139d.f41505c0;
        if (i14 < i15) {
            c5139d.f41496V = i15;
        }
    }

    public static final boolean c(int i, int i6) {
        return (i & i6) == i6;
    }
}
