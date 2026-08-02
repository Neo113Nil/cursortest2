package w;

import java.util.ArrayList;
import u.C5047b;
import u.C5048c;
import u.C5051f;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f41403a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:162:0x028e, code lost:
    
        if (r8.f41253d == r6) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010c, code lost:
    
        if (r4.f41253d == r8) goto L75;
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
    public static void a(f fVar, C5048c c5048c, ArrayList arrayList, int i) {
        int i4;
        C5127b[] c5127bArr;
        int i6;
        int i9;
        float f2;
        float f9;
        boolean z6;
        C5130e c5130e;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        C5129d[] c5129dArr;
        int i10;
        C5127b[] c5127bArr2;
        C5130e c5130e2;
        C5048c c5048c2;
        C5051f c5051f;
        C5129d c5129d;
        C5051f c5051f2;
        C5130e c5130e3;
        int i11;
        C5129d c5129d2;
        C5051f c5051f3;
        C5130e c5130e4;
        C5130e c5130e5;
        int i12;
        C5129d c5129d3;
        int i13;
        C5129d[] c5129dArr2;
        C5129d c5129d4;
        C5051f c5051f4;
        C5051f c5051f5;
        int size;
        float f10;
        ArrayList arrayList2;
        int i14;
        float f11;
        C5130e c5130e6;
        int i15;
        float f12;
        C5127b[] c5127bArr3;
        boolean z13;
        int i16;
        C5130e c5130e7;
        int i17;
        int i18;
        int i19;
        C5129d c5129d5;
        C5130e c5130e8;
        f fVar2 = fVar;
        C5048c c5048c3 = c5048c;
        ArrayList arrayList3 = arrayList;
        if (i == 0) {
            i4 = fVar2.f41342z0;
            c5127bArr = fVar2.C0;
            i6 = 0;
        } else {
            i4 = fVar2.f41322A0;
            c5127bArr = fVar2.f41323B0;
            i6 = 2;
        }
        int i20 = i4;
        C5127b[] c5127bArr4 = c5127bArr;
        int i21 = 0;
        while (i21 < i20) {
            C5127b c5127b = c5127bArr4[i21];
            boolean z14 = c5127b.f41249q;
            C5130e c5130e9 = c5127b.f41234a;
            int i22 = 3;
            int i23 = 8;
            if (z14) {
                i9 = i21;
                f2 = 0.0f;
            } else {
                int i24 = c5127b.f41244l;
                int i25 = i24 * 2;
                C5130e c5130e10 = c5130e9;
                C5130e c5130e11 = c5130e10;
                boolean z15 = false;
                f2 = 0.0f;
                while (!z15) {
                    c5127b.i++;
                    c5130e10.m0[i24] = null;
                    c5130e10.f41304l0[i24] = null;
                    int i26 = c5130e10.f41295g0;
                    C5129d[] c5129dArr3 = c5130e10.f41273Q;
                    if (i26 != i23) {
                        c5130e10.j(i24);
                        c5129dArr3[i25].e();
                        int i27 = i25 + 1;
                        c5129dArr3[i27].e();
                        c5129dArr3[i25].e();
                        c5129dArr3[i27].e();
                        if (c5127b.f41235b == null) {
                            c5127b.f41235b = c5130e10;
                        }
                        c5127b.f41237d = c5130e10;
                        int i28 = c5130e10.f41311p0[i24];
                        if (i28 == i22) {
                            int i29 = c5130e10.f41315t[i24];
                            if (i29 == 0 || i29 == i22 || i29 == 2) {
                                c5127b.f41242j++;
                                float f13 = c5130e10.f41302k0[i24];
                                if (f13 > 0.0f) {
                                    i18 = i21;
                                    c5127b.f41243k += f13;
                                } else {
                                    i18 = i21;
                                }
                                i19 = i24;
                                if (c5130e10.f41295g0 != 8 && i28 == 3 && (i29 == 0 || i29 == 3)) {
                                    if (f13 < 0.0f) {
                                        c5127b.f41246n = true;
                                    } else {
                                        c5127b.f41247o = true;
                                    }
                                    if (c5127b.f41241h == null) {
                                        c5127b.f41241h = new ArrayList();
                                    }
                                    c5127b.f41241h.add(c5130e10);
                                }
                                if (c5127b.f41239f == null) {
                                    c5127b.f41239f = c5130e10;
                                }
                                C5130e c5130e12 = c5127b.f41240g;
                                if (c5130e12 != null) {
                                    c5130e12.f41304l0[i19] = c5130e10;
                                }
                                c5127b.f41240g = c5130e10;
                            } else {
                                i18 = i21;
                                i19 = i24;
                            }
                            if (i19 == 0) {
                                if (c5130e10.f41313r == 0 && c5130e10.f41316u == 0) {
                                    int i30 = c5130e10.f41317v;
                                }
                            } else if (c5130e10.f41314s == 0 && c5130e10.f41319x == 0) {
                                int i31 = c5130e10.f41320y;
                            }
                            if (c5130e11 != c5130e10) {
                                c5130e11.m0[i19] = c5130e10;
                            }
                            c5129d5 = c5129dArr3[i25 + 1].f41255f;
                            if (c5129d5 != null) {
                                c5130e8 = c5129d5.f41253d;
                                C5129d c5129d6 = c5130e8.f41273Q[i25].f41255f;
                                if (c5129d6 != null) {
                                }
                            }
                            c5130e8 = null;
                            if (c5130e8 != null) {
                                c5130e8 = c5130e10;
                                z15 = true;
                            }
                            c5130e11 = c5130e10;
                            i24 = i19;
                            i22 = 3;
                            i23 = 8;
                            c5130e10 = c5130e8;
                            i21 = i18;
                        }
                    }
                    i18 = i21;
                    i19 = i24;
                    if (c5130e11 != c5130e10) {
                    }
                    c5129d5 = c5129dArr3[i25 + 1].f41255f;
                    if (c5129d5 != null) {
                    }
                    c5130e8 = null;
                    if (c5130e8 != null) {
                    }
                    c5130e11 = c5130e10;
                    i24 = i19;
                    i22 = 3;
                    i23 = 8;
                    c5130e10 = c5130e8;
                    i21 = i18;
                }
                i9 = i21;
                int i32 = i24;
                C5130e c5130e13 = c5127b.f41235b;
                if (c5130e13 != null) {
                    c5130e13.f41273Q[i25].e();
                }
                C5130e c5130e14 = c5127b.f41237d;
                if (c5130e14 != null) {
                    c5130e14.f41273Q[i25 + 1].e();
                }
                c5127b.f41236c = c5130e10;
                if (i32 == 0 && c5127b.f41245m) {
                    c5127b.f41238e = c5130e10;
                } else {
                    c5127b.f41238e = c5130e9;
                }
                c5127b.f41248p = c5127b.f41247o && c5127b.f41246n;
            }
            c5127b.f41249q = true;
            if (arrayList3 == null || arrayList3.contains(c5130e9)) {
                C5130e c5130e15 = c5127b.f41236c;
                C5130e c5130e16 = c5127b.f41235b;
                C5130e c5130e17 = c5127b.f41237d;
                C5130e c5130e18 = c5127b.f41238e;
                float f14 = c5127b.f41243k;
                boolean z16 = fVar2.f41311p0[i] == 2;
                if (i == 0) {
                    int i33 = c5130e18.f41298i0;
                    boolean z17 = i33 == 0;
                    boolean z18 = i33 == 1;
                    z6 = i33 == 2;
                    z9 = z16;
                    z11 = z18;
                    z10 = z17;
                    z12 = false;
                    f9 = f14;
                    c5130e = c5130e9;
                } else {
                    int i34 = c5130e18.f41300j0;
                    boolean z19 = i34 == 0;
                    boolean z20 = i34 == 1;
                    f9 = f14;
                    z6 = i34 == 2;
                    c5130e = c5130e9;
                    z9 = z16;
                    z10 = z19;
                    z11 = z20;
                    z12 = false;
                }
                while (true) {
                    c5129dArr = fVar2.f41273Q;
                    if (z12) {
                        break;
                    }
                    C5129d c5129d7 = c5130e.f41273Q[i6];
                    int i35 = z6 ? 1 : 4;
                    int e9 = c5129d7.e();
                    boolean z21 = z12;
                    int[] iArr = c5130e.f41311p0;
                    boolean z22 = z6;
                    boolean z23 = iArr[i] == 3 && c5130e.f41315t[i] == 0;
                    C5129d c5129d8 = c5129d7.f41255f;
                    if (c5129d8 != null && c5130e != c5130e9) {
                        e9 = c5129d8.e() + e9;
                    }
                    int i36 = e9;
                    if (z22 && c5130e != c5130e9 && c5130e != c5130e16) {
                        i35 = 8;
                    }
                    boolean z24 = z23;
                    C5129d c5129d9 = c5129d7.f41255f;
                    if (c5129d9 != null) {
                        if (c5130e == c5130e16) {
                            i16 = i20;
                            c5048c3.f(c5129d7.i, c5129d9.i, i36, 6);
                        } else {
                            i16 = i20;
                            c5048c3.f(c5129d7.i, c5129d9.i, i36, 8);
                        }
                        if (z24 && !z22) {
                            i35 = 5;
                        }
                        c5048c3.e(c5129d7.i, c5129d7.f41255f.i, i36, (c5130e == c5130e16 && z22 && c5130e.f41275S[i]) ? 5 : i35);
                    } else {
                        i16 = i20;
                    }
                    C5129d[] c5129dArr4 = c5130e.f41273Q;
                    if (z9) {
                        if (c5130e.f41295g0 == 8 || iArr[i] != 3) {
                            i17 = 0;
                        } else {
                            i17 = 0;
                            c5048c3.f(c5129dArr4[i6 + 1].i, c5129dArr4[i6].i, 0, 5);
                        }
                        c5048c3.f(c5129dArr4[i6].i, c5129dArr[i6].i, i17, 8);
                    }
                    C5129d c5129d10 = c5129dArr4[i6 + 1].f41255f;
                    if (c5129d10 != null) {
                        c5130e7 = c5129d10.f41253d;
                        C5129d c5129d11 = c5130e7.f41273Q[i6].f41255f;
                        if (c5129d11 != null) {
                        }
                    }
                    c5130e7 = null;
                    if (c5130e7 != null) {
                        c5130e = c5130e7;
                        z12 = z21;
                    } else {
                        z12 = true;
                    }
                    z6 = z22;
                    i20 = i16;
                }
                boolean z25 = z6;
                i10 = i20;
                if (c5130e17 != null) {
                    int i37 = i6 + 1;
                    if (c5130e15.f41273Q[i37].f41255f != null) {
                        C5129d c5129d12 = c5130e17.f41273Q[i37];
                        if (c5130e17.f41311p0[i] == 3 && c5130e17.f41315t[i] == 0 && !z25) {
                            C5129d c5129d13 = c5129d12.f41255f;
                            if (c5129d13.f41253d == fVar2) {
                                c5048c3.e(c5129d12.i, c5129d13.i, -c5129d12.e(), 5);
                                c5048c3.g(c5129d12.i, c5130e15.f41273Q[i37].f41255f.i, -c5129d12.e(), 6);
                            }
                        }
                        if (z25) {
                            C5129d c5129d14 = c5129d12.f41255f;
                            if (c5129d14.f41253d == fVar2) {
                                c5048c3.e(c5129d12.i, c5129d14.i, -c5129d12.e(), 4);
                            }
                        }
                        c5048c3.g(c5129d12.i, c5130e15.f41273Q[i37].f41255f.i, -c5129d12.e(), 6);
                    }
                }
                if (z9) {
                    int i38 = i6 + 1;
                    C5051f c5051f6 = c5129dArr[i38].i;
                    C5129d c5129d15 = c5130e15.f41273Q[i38];
                    c5048c3.f(c5051f6, c5129d15.i, c5129d15.e(), 8);
                }
                ArrayList arrayList4 = c5127b.f41241h;
                if (arrayList4 != null && (size = arrayList4.size()) > 1) {
                    if (c5127b.f41246n && !c5127b.f41248p) {
                        f9 = c5127b.f41242j;
                    }
                    C5130e c5130e19 = null;
                    float f15 = f2;
                    int i39 = 0;
                    while (i39 < size) {
                        C5130e c5130e20 = (C5130e) arrayList4.get(i39);
                        float f16 = c5130e20.f41302k0[i];
                        C5129d[] c5129dArr5 = c5130e20.f41273Q;
                        if (f16 >= f2) {
                            f10 = f16;
                        } else if (c5127b.f41248p) {
                            arrayList2 = arrayList4;
                            i14 = size;
                            c5048c3.e(c5129dArr5[i6 + 1].i, c5129dArr5[i6].i, 0, 4);
                            z13 = false;
                            i15 = i39;
                            f12 = f2;
                            c5127bArr3 = c5127bArr4;
                            i39 = i15 + 1;
                            c5127bArr4 = c5127bArr3;
                            arrayList4 = arrayList2;
                            size = i14;
                            f2 = f12;
                        } else {
                            f10 = 1.0f;
                        }
                        arrayList2 = arrayList4;
                        i14 = size;
                        if (f10 == f2) {
                            z13 = false;
                            c5048c3.e(c5129dArr5[i6 + 1].i, c5129dArr5[i6].i, 0, 8);
                            i15 = i39;
                            f12 = f2;
                            c5127bArr3 = c5127bArr4;
                            i39 = i15 + 1;
                            c5127bArr4 = c5127bArr3;
                            arrayList4 = arrayList2;
                            size = i14;
                            f2 = f12;
                        } else {
                            if (c5130e19 != null) {
                                C5129d[] c5129dArr6 = c5130e19.f41273Q;
                                C5051f c5051f7 = c5129dArr6[i6].i;
                                int i40 = i6 + 1;
                                C5051f c5051f8 = c5129dArr6[i40].i;
                                f11 = f10;
                                C5051f c5051f9 = c5129dArr5[i6].i;
                                C5051f c5051f10 = c5129dArr5[i40].i;
                                c5130e6 = c5130e20;
                                C5047b l9 = c5048c3.l();
                                i15 = i39;
                                float f17 = f2;
                                l9.f40913b = f17;
                                f12 = f17;
                                if (f9 == f17 || f15 == f11) {
                                    c5127bArr3 = c5127bArr4;
                                    l9.f40915d.g(c5051f7, 1.0f);
                                    l9.f40915d.g(c5051f8, -1.0f);
                                    l9.f40915d.g(c5051f10, 1.0f);
                                    l9.f40915d.g(c5051f9, -1.0f);
                                } else {
                                    if (f15 == f12) {
                                        l9.f40915d.g(c5051f7, 1.0f);
                                        l9.f40915d.g(c5051f8, -1.0f);
                                    } else if (f10 == f2) {
                                        l9.f40915d.g(c5051f9, 1.0f);
                                        l9.f40915d.g(c5051f10, -1.0f);
                                    } else {
                                        float f18 = (f15 / f9) / (f11 / f9);
                                        c5127bArr3 = c5127bArr4;
                                        l9.f40915d.g(c5051f7, 1.0f);
                                        l9.f40915d.g(c5051f8, -1.0f);
                                        l9.f40915d.g(c5051f10, f18);
                                        l9.f40915d.g(c5051f9, -f18);
                                    }
                                    c5127bArr3 = c5127bArr4;
                                }
                                c5048c3.c(l9);
                            } else {
                                f11 = f10;
                                c5130e6 = c5130e20;
                                i15 = i39;
                                f12 = f2;
                                c5127bArr3 = c5127bArr4;
                            }
                            c5130e19 = c5130e6;
                            f15 = f11;
                            i39 = i15 + 1;
                            c5127bArr4 = c5127bArr3;
                            arrayList4 = arrayList2;
                            size = i14;
                            f2 = f12;
                        }
                    }
                }
                c5127bArr2 = c5127bArr4;
                if (c5130e16 == null || !(c5130e16 == c5130e17 || z25)) {
                    c5130e2 = c5130e17;
                    if (z10 && c5130e16 != null) {
                        int i41 = c5127b.f41242j;
                        boolean z26 = i41 > 0 && c5127b.i == i41;
                        C5130e c5130e21 = c5130e16;
                        C5130e c5130e22 = c5130e21;
                        while (c5130e21 != null) {
                            C5130e c5130e23 = c5130e21.m0[i];
                            while (true) {
                                if (c5130e23 == null) {
                                    i11 = 8;
                                    break;
                                }
                                i11 = 8;
                                if (c5130e23.f41295g0 != 8) {
                                    break;
                                } else {
                                    c5130e23 = c5130e23.m0[i];
                                }
                            }
                            if (c5130e23 != null || c5130e21 == c5130e2) {
                                C5129d[] c5129dArr7 = c5130e21.f41273Q;
                                C5129d c5129d16 = c5129dArr7[i6];
                                C5051f c5051f11 = c5129d16.i;
                                C5129d c5129d17 = c5129d16.f41255f;
                                C5051f c5051f12 = c5129d17 != null ? c5129d17.i : null;
                                if (c5130e22 != c5130e21) {
                                    c5051f12 = c5130e22.f41273Q[i6 + 1].i;
                                } else if (c5130e21 == c5130e16) {
                                    C5129d c5129d18 = c5130e9.f41273Q[i6].f41255f;
                                    c5051f12 = c5129d18 != null ? c5129d18.i : null;
                                }
                                int e10 = c5129d16.e();
                                int i42 = i6 + 1;
                                int e11 = c5129dArr7[i42].e();
                                if (c5130e23 != null) {
                                    c5129d2 = c5130e23.f41273Q[i6];
                                    c5051f3 = c5129d2.i;
                                } else {
                                    c5129d2 = c5130e15.f41273Q[i42].f41255f;
                                    c5051f3 = c5129d2 != null ? c5129d2.i : null;
                                }
                                C5051f c5051f13 = c5129dArr7[i42].i;
                                if (c5129d2 != null) {
                                    e11 += c5129d2.e();
                                }
                                int e12 = c5130e22.f41273Q[i42].e() + e10;
                                if (c5051f11 == null || c5051f12 == null || c5051f3 == null || c5051f13 == null) {
                                    c5130e4 = c5130e9;
                                    c5130e5 = c5130e22;
                                    i12 = 8;
                                } else {
                                    if (c5130e21 == c5130e16) {
                                        e12 = c5130e16.f41273Q[i6].e();
                                    }
                                    if (c5130e21 == c5130e2) {
                                        e11 = c5130e2.f41273Q[i42].e();
                                    }
                                    c5130e4 = c5130e9;
                                    c5130e5 = c5130e22;
                                    i12 = 8;
                                    c5048c.b(c5051f11, c5051f12, e12, 0.5f, c5051f3, c5051f13, e11, z26 ? 8 : 5);
                                }
                            } else {
                                c5130e4 = c5130e9;
                                c5130e5 = c5130e22;
                                i12 = i11;
                            }
                            if (c5130e21.f41295g0 != i12) {
                                c5130e5 = c5130e21;
                            }
                            c5130e21 = c5130e23;
                            c5130e22 = c5130e5;
                            c5130e9 = c5130e4;
                        }
                    } else if (z11 && c5130e16 != null) {
                        int i43 = c5127b.f41242j;
                        boolean z27 = i43 > 0 && c5127b.i == i43;
                        C5130e c5130e24 = c5130e16;
                        C5130e c5130e25 = c5130e24;
                        while (c5130e24 != null) {
                            C5130e c5130e26 = c5130e24.m0[i];
                            while (c5130e26 != null && c5130e26.f41295g0 == 8) {
                                c5130e26 = c5130e26.m0[i];
                            }
                            if (c5130e24 != c5130e16 && c5130e24 != c5130e2 && c5130e26 != null) {
                                if (c5130e26 == c5130e2) {
                                    c5130e26 = null;
                                }
                                C5129d[] c5129dArr8 = c5130e24.f41273Q;
                                C5129d c5129d19 = c5129dArr8[i6];
                                C5051f c5051f14 = c5129d19.i;
                                int i44 = i6 + 1;
                                C5051f c5051f15 = c5130e25.f41273Q[i44].i;
                                int e13 = c5129d19.e();
                                int e14 = c5129dArr8[i44].e();
                                if (c5130e26 != null) {
                                    c5129d = c5130e26.f41273Q[i6];
                                    c5051f2 = c5129d.i;
                                    C5129d c5129d20 = c5129d.f41255f;
                                    c5051f = c5129d20 != null ? c5129d20.i : null;
                                } else {
                                    C5129d c5129d21 = c5130e2.f41273Q[i6];
                                    C5051f c5051f16 = c5129d21 != null ? c5129d21.i : null;
                                    c5051f = c5129dArr8[i44].i;
                                    c5129d = c5129d21;
                                    c5051f2 = c5051f16;
                                }
                                if (c5129d != null) {
                                    e14 += c5129d.e();
                                }
                                int e15 = c5130e25.f41273Q[i44].e() + e13;
                                C5051f c5051f17 = c5051f2;
                                int i45 = e14;
                                C5051f c5051f18 = c5051f;
                                int i46 = z27 ? 8 : 4;
                                if (c5051f14 == null || c5051f15 == null || c5051f17 == null || c5051f18 == null) {
                                    c5130e3 = c5130e26;
                                } else {
                                    c5130e3 = c5130e26;
                                    c5048c.b(c5051f14, c5051f15, e15, 0.5f, c5051f17, c5051f18, i45, i46);
                                }
                                c5130e26 = c5130e3;
                            }
                            if (c5130e24.f41295g0 != 8) {
                                c5130e25 = c5130e24;
                            }
                            c5130e24 = c5130e26;
                        }
                        C5129d c5129d22 = c5130e16.f41273Q[i6];
                        C5129d c5129d23 = c5130e9.f41273Q[i6].f41255f;
                        int i47 = i6 + 1;
                        C5129d c5129d24 = c5130e2.f41273Q[i47];
                        C5129d c5129d25 = c5130e15.f41273Q[i47].f41255f;
                        if (c5129d23 != null) {
                            if (c5130e16 != c5130e2) {
                                c5048c.e(c5129d22.i, c5129d23.i, c5129d22.e(), 5);
                            } else if (c5129d25 != null) {
                                c5048c2 = c5048c;
                                c5048c2.b(c5129d22.i, c5129d23.i, c5129d22.e(), 0.5f, c5129d24.i, c5129d25.i, c5129d24.e(), 5);
                                if (c5129d25 != null && c5130e16 != c5130e2) {
                                    c5048c2.e(c5129d24.i, c5129d25.i, -c5129d24.e(), 5);
                                }
                                if ((!z10 || z11) && c5130e16 != null && c5130e16 != c5130e2) {
                                    C5129d[] c5129dArr9 = c5130e16.f41273Q;
                                    c5129d3 = c5129dArr9[i6];
                                    if (c5130e2 == null) {
                                        c5130e2 = c5130e16;
                                    }
                                    i13 = i6 + 1;
                                    c5129dArr2 = c5130e2.f41273Q;
                                    c5129d4 = c5129dArr2[i13];
                                    C5129d c5129d26 = c5129d3.f41255f;
                                    c5051f4 = c5129d26 != null ? c5129d26.i : null;
                                    C5129d c5129d27 = c5129d4.f41255f;
                                    c5051f5 = c5129d27 != null ? c5129d27.i : null;
                                    if (c5130e15 != c5130e2) {
                                        C5129d c5129d28 = c5130e15.f41273Q[i13].f41255f;
                                        c5051f5 = c5129d28 != null ? c5129d28.i : null;
                                    }
                                    if (c5130e16 == c5130e2) {
                                        c5129d4 = c5129dArr9[i13];
                                    }
                                    if (c5051f4 == null && c5051f5 != null) {
                                        c5048c2.b(c5129d3.i, c5051f4, c5129d3.e(), 0.5f, c5051f5, c5129d4.i, c5129dArr2[i13].e(), 5);
                                    }
                                }
                            }
                        }
                        c5048c2 = c5048c;
                        if (c5129d25 != null) {
                            c5048c2.e(c5129d24.i, c5129d25.i, -c5129d24.e(), 5);
                        }
                        if (!z10) {
                        }
                        C5129d[] c5129dArr92 = c5130e16.f41273Q;
                        c5129d3 = c5129dArr92[i6];
                        if (c5130e2 == null) {
                        }
                        i13 = i6 + 1;
                        c5129dArr2 = c5130e2.f41273Q;
                        c5129d4 = c5129dArr2[i13];
                        C5129d c5129d262 = c5129d3.f41255f;
                        if (c5129d262 != null) {
                        }
                        C5129d c5129d272 = c5129d4.f41255f;
                        if (c5129d272 != null) {
                        }
                        if (c5130e15 != c5130e2) {
                        }
                        if (c5130e16 == c5130e2) {
                        }
                        if (c5051f4 == null) {
                            c5048c2.b(c5129d3.i, c5051f4, c5129d3.e(), 0.5f, c5051f5, c5129d4.i, c5129dArr2[i13].e(), 5);
                        }
                    }
                } else {
                    C5129d c5129d29 = c5130e9.f41273Q[i6];
                    int i48 = i6 + 1;
                    C5129d c5129d30 = c5130e15.f41273Q[i48];
                    C5129d c5129d31 = c5129d29.f41255f;
                    C5051f c5051f19 = c5129d31 != null ? c5129d31.i : null;
                    C5129d c5129d32 = c5129d30.f41255f;
                    C5051f c5051f20 = c5129d32 != null ? c5129d32.i : null;
                    C5129d c5129d33 = c5130e16.f41273Q[i6];
                    if (c5130e17 != null) {
                        c5129d30 = c5130e17.f41273Q[i48];
                    }
                    if (c5051f19 == null || c5051f20 == null) {
                        c5130e2 = c5130e17;
                    } else {
                        float f19 = i == 0 ? c5130e18.f41289d0 : c5130e18.f41291e0;
                        int e16 = c5129d33.e();
                        int e17 = c5129d30.e();
                        C5051f c5051f21 = c5129d33.i;
                        C5051f c5051f22 = c5129d30.i;
                        C5051f c5051f23 = c5051f19;
                        c5130e2 = c5130e17;
                        c5048c3.b(c5051f21, c5051f23, e16, f19, c5051f20, c5051f22, e17, 7);
                    }
                }
                c5048c2 = c5048c;
                if (!z10) {
                }
                C5129d[] c5129dArr922 = c5130e16.f41273Q;
                c5129d3 = c5129dArr922[i6];
                if (c5130e2 == null) {
                }
                i13 = i6 + 1;
                c5129dArr2 = c5130e2.f41273Q;
                c5129d4 = c5129dArr2[i13];
                C5129d c5129d2622 = c5129d3.f41255f;
                if (c5129d2622 != null) {
                }
                C5129d c5129d2722 = c5129d4.f41255f;
                if (c5129d2722 != null) {
                }
                if (c5130e15 != c5130e2) {
                }
                if (c5130e16 == c5130e2) {
                }
                if (c5051f4 == null) {
                }
            } else {
                i10 = i20;
                c5127bArr2 = c5127bArr4;
            }
            i21 = i9 + 1;
            fVar2 = fVar;
            c5048c3 = c5048c;
            arrayList3 = arrayList;
            c5127bArr4 = c5127bArr2;
            i20 = i10;
        }
    }

    public static void b(f fVar, C5048c c5048c, C5130e c5130e) {
        c5130e.f41308o = -1;
        c5130e.f41310p = -1;
        int i = fVar.f41311p0[0];
        int[] iArr = c5130e.f41311p0;
        if (i != 2 && iArr[0] == 4) {
            C5129d c5129d = c5130e.f41266I;
            int i4 = c5129d.f41256g;
            int q8 = fVar.q();
            C5129d c5129d2 = c5130e.f41267K;
            int i6 = q8 - c5129d2.f41256g;
            c5129d.i = c5048c.k(c5129d);
            c5129d2.i = c5048c.k(c5129d2);
            c5048c.d(c5129d.i, i4);
            c5048c.d(c5129d2.i, i6);
            c5130e.f41308o = 2;
            c5130e.Y = i4;
            int i9 = i6 - i4;
            c5130e.f41277U = i9;
            int i10 = c5130e.f41285b0;
            if (i9 < i10) {
                c5130e.f41277U = i10;
            }
        }
        if (fVar.f41311p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        C5129d c5129d3 = c5130e.J;
        int i11 = c5129d3.f41256g;
        int k9 = fVar.k();
        C5129d c5129d4 = c5130e.f41268L;
        int i12 = k9 - c5129d4.f41256g;
        c5129d3.i = c5048c.k(c5129d3);
        c5129d4.i = c5048c.k(c5129d4);
        c5048c.d(c5129d3.i, i11);
        c5048c.d(c5129d4.i, i12);
        if (c5130e.f41283a0 > 0 || c5130e.f41295g0 == 8) {
            C5129d c5129d5 = c5130e.f41269M;
            C5051f k10 = c5048c.k(c5129d5);
            c5129d5.i = k10;
            c5048c.d(k10, c5130e.f41283a0 + i11);
        }
        c5130e.f41310p = 2;
        c5130e.f41281Z = i11;
        int i13 = i12 - i11;
        c5130e.f41278V = i13;
        int i14 = c5130e.f41287c0;
        if (i13 < i14) {
            c5130e.f41278V = i14;
        }
    }

    public static final boolean c(int i, int i4) {
        return (i & i4) == i4;
    }
}
