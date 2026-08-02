package x;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import w.C5129d;
import w.C5130e;

/* renamed from: x.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5169h {

    /* renamed from: a, reason: collision with root package name */
    public static final C5163b f41784a = new C5163b();

    public static boolean a(C5130e c5130e) {
        int[] iArr = c5130e.f41311p0;
        int i = iArr[0];
        int i4 = iArr[1];
        C5130e c5130e2 = c5130e.f41276T;
        w.f fVar = c5130e2 != null ? (w.f) c5130e2 : null;
        if (fVar != null) {
            int i6 = fVar.f41311p0[0];
        }
        if (fVar != null) {
            int i9 = fVar.f41311p0[1];
        }
        boolean z6 = i == 1 || c5130e.A() || i == 2 || (i == 3 && c5130e.f41313r == 0 && c5130e.f41279W == 0.0f && c5130e.t(0)) || (i == 3 && c5130e.f41313r == 1 && c5130e.u(0, c5130e.q()));
        boolean z9 = i4 == 1 || c5130e.B() || i4 == 2 || (i4 == 3 && c5130e.f41314s == 0 && c5130e.f41279W == 0.0f && c5130e.t(1)) || (i4 == 3 && c5130e.f41314s == 1 && c5130e.u(1, c5130e.k()));
        return (c5130e.f41279W > 0.0f && (z6 || z9)) || (z6 && z9);
    }

    public static C5176o b(C5130e c5130e, int i, ArrayList arrayList, C5176o c5176o) {
        int i4;
        int i6 = i == 0 ? c5130e.f41307n0 : c5130e.f41309o0;
        if (i6 != -1 && (c5176o == null || i6 != c5176o.f41792b)) {
            int i9 = 0;
            while (true) {
                if (i9 >= arrayList.size()) {
                    break;
                }
                C5176o c5176o2 = (C5176o) arrayList.get(i9);
                if (c5176o2.f41792b == i6) {
                    if (c5176o != null) {
                        c5176o.c(i, c5176o2);
                        arrayList.remove(c5176o);
                    }
                    c5176o = c5176o2;
                } else {
                    i9++;
                }
            }
        } else if (i6 != -1) {
            return c5176o;
        }
        if (c5176o == null) {
            if (c5130e instanceof w.j) {
                w.j jVar = (w.j) c5130e;
                int i10 = 0;
                while (true) {
                    if (i10 >= jVar.f41402r0) {
                        i4 = -1;
                        break;
                    }
                    C5130e c5130e2 = jVar.f41401q0[i10];
                    if ((i == 0 && (i4 = c5130e2.f41307n0) != -1) || (i == 1 && (i4 = c5130e2.f41309o0) != -1)) {
                        break;
                    }
                    i10++;
                }
                if (i4 != -1) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        }
                        C5176o c5176o3 = (C5176o) arrayList.get(i11);
                        if (c5176o3.f41792b == i4) {
                            c5176o = c5176o3;
                            break;
                        }
                        i11++;
                    }
                }
            }
            if (c5176o == null) {
                c5176o = new C5176o();
                c5176o.f41791a = new ArrayList();
                c5176o.f41794d = null;
                c5176o.f41795e = -1;
                int i12 = C5176o.f41790f;
                C5176o.f41790f = i12 + 1;
                c5176o.f41792b = i12;
                c5176o.f41793c = i;
            }
            arrayList.add(c5176o);
        }
        ArrayList arrayList2 = c5176o.f41791a;
        if (arrayList2.contains(c5130e)) {
            return c5176o;
        }
        arrayList2.add(c5130e);
        if (c5130e instanceof w.i) {
            w.i iVar = (w.i) c5130e;
            iVar.f41398t0.c(iVar.f41399u0 == 0 ? 1 : 0, arrayList, c5176o);
        }
        int i13 = c5176o.f41792b;
        if (i == 0) {
            c5130e.f41307n0 = i13;
            c5130e.f41266I.c(i, arrayList, c5176o);
            c5130e.f41267K.c(i, arrayList, c5176o);
        } else {
            c5130e.f41309o0 = i13;
            c5130e.J.c(i, arrayList, c5176o);
            c5130e.f41269M.c(i, arrayList, c5176o);
            c5130e.f41268L.c(i, arrayList, c5176o);
        }
        c5130e.f41272P.c(i, arrayList, c5176o);
        return c5176o;
    }

    public static void c(int i, C5130e c5130e, z.f fVar, boolean z6) {
        C5129d c5129d;
        C5129d c5129d2;
        char c9;
        C5129d c5129d3;
        C5129d c5129d4;
        if (c5130e.f41305m) {
            return;
        }
        if (!(c5130e instanceof w.f) && c5130e.z() && a(c5130e)) {
            w.f.V(c5130e, fVar, new C5163b());
        }
        C5129d i4 = c5130e.i(2);
        C5129d i6 = c5130e.i(4);
        int d9 = i4.d();
        int d10 = i6.d();
        HashSet hashSet = i4.f41250a;
        if (hashSet != null && i4.f41252c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C5129d c5129d5 = (C5129d) it.next();
                C5130e c5130e2 = c5129d5.f41253d;
                int i9 = i + 1;
                boolean a9 = a(c5130e2);
                if (c5130e2.z() && a9) {
                    c9 = 0;
                    w.f.V(c5130e2, fVar, new C5163b());
                } else {
                    c9 = 0;
                }
                C5129d c5129d6 = c5130e2.f41266I;
                C5129d c5129d7 = c5130e2.f41267K;
                char c10 = ((c5129d5 == c5129d6 && (c5129d4 = c5129d7.f41255f) != null && c5129d4.f41252c) || (c5129d5 == c5129d7 && (c5129d3 = c5129d6.f41255f) != null && c5129d3.f41252c)) ? (char) 1 : c9;
                int i10 = c5130e2.f41311p0[c9];
                if (i10 != 3 || a9) {
                    if (!c5130e2.z()) {
                        if (c5129d5 == c5129d6 && c5129d7.f41255f == null) {
                            int e9 = c5129d6.e() + d9;
                            c5130e2.J(e9, c5130e2.q() + e9);
                            c(i9, c5130e2, fVar, z6);
                        } else if (c5129d5 == c5129d7 && c5129d6.f41255f == null) {
                            int e10 = d9 - c5129d7.e();
                            c5130e2.J(e10 - c5130e2.q(), e10);
                            c(i9, c5130e2, fVar, z6);
                        } else if (c10 != 0 && !c5130e2.x()) {
                            d(i9, c5130e2, fVar, z6);
                        }
                    }
                } else if (i10 == 3 && c5130e2.f41317v >= 0 && c5130e2.f41316u >= 0 && (c5130e2.f41295g0 == 8 || (c5130e2.f41313r == 0 && c5130e2.f41279W == 0.0f))) {
                    if (!c5130e2.x() && !c5130e2.f41263F && c10 != 0 && !c5130e2.x()) {
                        e(i9, c5130e, fVar, c5130e2, z6);
                    }
                }
            }
        }
        if (c5130e instanceof w.i) {
            return;
        }
        HashSet hashSet2 = i6.f41250a;
        if (hashSet2 != null && i6.f41252c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C5129d c5129d8 = (C5129d) it2.next();
                C5130e c5130e3 = c5129d8.f41253d;
                int i11 = i + 1;
                boolean a10 = a(c5130e3);
                if (c5130e3.z() && a10) {
                    w.f.V(c5130e3, fVar, new C5163b());
                }
                C5129d c5129d9 = c5130e3.f41266I;
                C5129d c5129d10 = c5130e3.f41267K;
                boolean z9 = (c5129d8 == c5129d9 && (c5129d2 = c5129d10.f41255f) != null && c5129d2.f41252c) || (c5129d8 == c5129d10 && (c5129d = c5129d9.f41255f) != null && c5129d.f41252c);
                int i12 = c5130e3.f41311p0[0];
                if (i12 != 3 || a10) {
                    if (!c5130e3.z()) {
                        if (c5129d8 == c5129d9 && c5129d10.f41255f == null) {
                            int e11 = c5129d9.e() + d10;
                            c5130e3.J(e11, c5130e3.q() + e11);
                            c(i11, c5130e3, fVar, z6);
                        } else if (c5129d8 == c5129d10 && c5129d9.f41255f == null) {
                            int e12 = d10 - c5129d10.e();
                            c5130e3.J(e12 - c5130e3.q(), e12);
                            c(i11, c5130e3, fVar, z6);
                        } else if (z9 && !c5130e3.x()) {
                            d(i11, c5130e3, fVar, z6);
                        }
                    }
                } else if (i12 == 3 && c5130e3.f41317v >= 0 && c5130e3.f41316u >= 0) {
                    if (c5130e3.f41295g0 == 8 || (c5130e3.f41313r == 0 && c5130e3.f41279W == 0.0f)) {
                        if (!c5130e3.x() && !c5130e3.f41263F && z9 && !c5130e3.x()) {
                            e(i11, c5130e, fVar, c5130e3, z6);
                        }
                    }
                }
            }
        }
        c5130e.f41305m = true;
    }

    public static void d(int i, C5130e c5130e, z.f fVar, boolean z6) {
        float f2 = c5130e.f41289d0;
        C5129d c5129d = c5130e.f41266I;
        int d9 = c5129d.f41255f.d();
        C5129d c5129d2 = c5130e.f41267K;
        int d10 = c5129d2.f41255f.d();
        int e9 = c5129d.e() + d9;
        int e10 = d10 - c5129d2.e();
        if (d9 == d10) {
            f2 = 0.5f;
        } else {
            d9 = e9;
            d10 = e10;
        }
        int q8 = c5130e.q();
        int i4 = (d10 - d9) - q8;
        if (d9 > d10) {
            i4 = (d9 - d10) - q8;
        }
        int i6 = ((int) (i4 > 0 ? (f2 * i4) + 0.5f : f2 * i4)) + d9;
        int i9 = i6 + q8;
        if (d9 > d10) {
            i9 = i6 - q8;
        }
        c5130e.J(i6, i9);
        c(i + 1, c5130e, fVar, z6);
    }

    public static void e(int i, C5130e c5130e, z.f fVar, C5130e c5130e2, boolean z6) {
        float f2 = c5130e2.f41289d0;
        C5129d c5129d = c5130e2.f41266I;
        int e9 = c5129d.e() + c5129d.f41255f.d();
        C5129d c5129d2 = c5130e2.f41267K;
        int d9 = c5129d2.f41255f.d() - c5129d2.e();
        if (d9 >= e9) {
            int q8 = c5130e2.q();
            if (c5130e2.f41295g0 != 8) {
                int i4 = c5130e2.f41313r;
                if (i4 == 2) {
                    q8 = (int) (c5130e2.f41289d0 * 0.5f * (c5130e instanceof w.f ? c5130e.q() : c5130e.f41276T.q()));
                } else if (i4 == 0) {
                    q8 = d9 - e9;
                }
                q8 = Math.max(c5130e2.f41316u, q8);
                int i6 = c5130e2.f41317v;
                if (i6 > 0) {
                    q8 = Math.min(i6, q8);
                }
            }
            int i9 = e9 + ((int) ((f2 * ((d9 - e9) - q8)) + 0.5f));
            c5130e2.J(i9, q8 + i9);
            c(i + 1, c5130e2, fVar, z6);
        }
    }

    public static void f(int i, C5130e c5130e, z.f fVar) {
        float f2 = c5130e.f41291e0;
        C5129d c5129d = c5130e.J;
        int d9 = c5129d.f41255f.d();
        C5129d c5129d2 = c5130e.f41268L;
        int d10 = c5129d2.f41255f.d();
        int e9 = c5129d.e() + d9;
        int e10 = d10 - c5129d2.e();
        if (d9 == d10) {
            f2 = 0.5f;
        } else {
            d9 = e9;
            d10 = e10;
        }
        int k9 = c5130e.k();
        int i4 = (d10 - d9) - k9;
        if (d9 > d10) {
            i4 = (d9 - d10) - k9;
        }
        int i6 = (int) (i4 > 0 ? (f2 * i4) + 0.5f : f2 * i4);
        int i9 = d9 + i6;
        int i10 = i9 + k9;
        if (d9 > d10) {
            i9 = d9 - i6;
            i10 = i9 - k9;
        }
        c5130e.K(i9, i10);
        i(i + 1, c5130e, fVar);
    }

    public static void g(int i, C5130e c5130e, z.f fVar, C5130e c5130e2) {
        float f2 = c5130e2.f41291e0;
        C5129d c5129d = c5130e2.J;
        int e9 = c5129d.e() + c5129d.f41255f.d();
        C5129d c5129d2 = c5130e2.f41268L;
        int d9 = c5129d2.f41255f.d() - c5129d2.e();
        if (d9 >= e9) {
            int k9 = c5130e2.k();
            if (c5130e2.f41295g0 != 8) {
                int i4 = c5130e2.f41314s;
                if (i4 == 2) {
                    k9 = (int) (f2 * 0.5f * (c5130e instanceof w.f ? c5130e.k() : c5130e.f41276T.k()));
                } else if (i4 == 0) {
                    k9 = d9 - e9;
                }
                k9 = Math.max(c5130e2.f41319x, k9);
                int i6 = c5130e2.f41320y;
                if (i6 > 0) {
                    k9 = Math.min(i6, k9);
                }
            }
            int i9 = e9 + ((int) ((f2 * ((d9 - e9) - k9)) + 0.5f));
            c5130e2.K(i9, k9 + i9);
            i(i + 1, c5130e2, fVar);
        }
    }

    public static boolean h(int i, int i4, int i6, int i9) {
        return (i6 == 1 || i6 == 2 || (i6 == 4 && i != 2)) || (i9 == 1 || i9 == 2 || (i9 == 4 && i4 != 2));
    }

    public static void i(int i, C5130e c5130e, z.f fVar) {
        boolean z6;
        C5129d c5129d;
        C5129d c5129d2;
        C5129d c5129d3;
        C5129d c5129d4;
        if (c5130e.f41306n) {
            return;
        }
        if (!(c5130e instanceof w.f) && c5130e.z() && a(c5130e)) {
            w.f.V(c5130e, fVar, new C5163b());
        }
        C5129d i4 = c5130e.i(3);
        C5129d i6 = c5130e.i(5);
        int d9 = i4.d();
        int d10 = i6.d();
        HashSet hashSet = i4.f41250a;
        if (hashSet != null && i4.f41252c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C5129d c5129d5 = (C5129d) it.next();
                C5130e c5130e2 = c5129d5.f41253d;
                int i9 = i + 1;
                boolean a9 = a(c5130e2);
                if (c5130e2.z() && a9) {
                    w.f.V(c5130e2, fVar, new C5163b());
                }
                C5129d c5129d6 = c5130e2.J;
                C5129d c5129d7 = c5130e2.f41268L;
                boolean z9 = (c5129d5 == c5129d6 && (c5129d4 = c5129d7.f41255f) != null && c5129d4.f41252c) || (c5129d5 == c5129d7 && (c5129d3 = c5129d6.f41255f) != null && c5129d3.f41252c);
                int i10 = c5130e2.f41311p0[1];
                if (i10 != 3 || a9) {
                    if (!c5130e2.z()) {
                        if (c5129d5 == c5129d6 && c5129d7.f41255f == null) {
                            int e9 = c5129d6.e() + d9;
                            c5130e2.K(e9, c5130e2.k() + e9);
                            i(i9, c5130e2, fVar);
                        } else if (c5129d5 == c5129d7 && c5129d6.f41255f == null) {
                            int e10 = d9 - c5129d7.e();
                            c5130e2.K(e10 - c5130e2.k(), e10);
                            i(i9, c5130e2, fVar);
                        } else if (z9 && !c5130e2.y()) {
                            f(i9, c5130e2, fVar);
                        }
                    }
                } else if (i10 == 3 && c5130e2.f41320y >= 0 && c5130e2.f41319x >= 0 && (c5130e2.f41295g0 == 8 || (c5130e2.f41314s == 0 && c5130e2.f41279W == 0.0f))) {
                    if (!c5130e2.y() && !c5130e2.f41263F && z9 && !c5130e2.y()) {
                        g(i9, c5130e, fVar, c5130e2);
                    }
                }
            }
        }
        boolean z10 = true;
        z10 = true;
        z10 = true;
        if (c5130e instanceof w.i) {
            return;
        }
        HashSet hashSet2 = i6.f41250a;
        if (hashSet2 != null && i6.f41252c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C5129d c5129d8 = (C5129d) it2.next();
                C5130e c5130e3 = c5129d8.f41253d;
                int i11 = i + 1;
                boolean a10 = a(c5130e3);
                if (c5130e3.z() && a10) {
                    w.f.V(c5130e3, fVar, new C5163b());
                }
                C5129d c5129d9 = c5130e3.J;
                C5129d c5129d10 = c5130e3.f41268L;
                boolean z11 = (c5129d8 == c5129d9 && (c5129d2 = c5129d10.f41255f) != null && c5129d2.f41252c) || (c5129d8 == c5129d10 && (c5129d = c5129d9.f41255f) != null && c5129d.f41252c);
                int i12 = c5130e3.f41311p0[1];
                if (i12 != 3 || a10) {
                    if (!c5130e3.z()) {
                        if (c5129d8 == c5129d9 && c5129d10.f41255f == null) {
                            int e11 = c5129d9.e() + d10;
                            c5130e3.K(e11, c5130e3.k() + e11);
                            i(i11, c5130e3, fVar);
                        } else if (c5129d8 == c5129d10 && c5129d9.f41255f == null) {
                            int e12 = d10 - c5129d10.e();
                            c5130e3.K(e12 - c5130e3.k(), e12);
                            i(i11, c5130e3, fVar);
                        } else if (z11 && !c5130e3.y()) {
                            f(i11, c5130e3, fVar);
                        }
                    }
                } else if (i12 == 3 && c5130e3.f41320y >= 0 && c5130e3.f41319x >= 0 && (c5130e3.f41295g0 == 8 || (c5130e3.f41314s == 0 && c5130e3.f41279W == 0.0f))) {
                    if (!c5130e3.y() && !c5130e3.f41263F && z11 && !c5130e3.y()) {
                        g(i11, c5130e, fVar, c5130e3);
                    }
                }
            }
        }
        C5129d i13 = c5130e.i(6);
        if (i13.f41250a != null && i13.f41252c) {
            int d11 = i13.d();
            Iterator it3 = i13.f41250a.iterator();
            while (it3.hasNext()) {
                C5129d c5129d11 = (C5129d) it3.next();
                C5130e c5130e4 = c5129d11.f41253d;
                int i14 = i + 1;
                boolean a11 = a(c5130e4);
                if (c5130e4.z() && a11) {
                    w.f.V(c5130e4, fVar, new C5163b());
                }
                if (c5130e4.f41311p0[z10 ? 1 : 0] != 3 || a11) {
                    if (!c5130e4.z()) {
                        C5129d c5129d12 = c5130e4.f41269M;
                        if (c5129d11 == c5129d12) {
                            int e13 = c5129d11.e() + d11;
                            if (c5130e4.f41262E) {
                                int i15 = e13 - c5130e4.f41283a0;
                                int i16 = c5130e4.f41278V + i15;
                                c5130e4.f41281Z = i15;
                                c5130e4.J.l(i15);
                                c5130e4.f41268L.l(i16);
                                c5129d12.l(e13);
                                z6 = z10 ? 1 : 0;
                                c5130e4.f41303l = z6;
                            } else {
                                z6 = z10 ? 1 : 0;
                            }
                            i(i14, c5130e4, fVar);
                            z10 = z6;
                        }
                    }
                }
                z6 = z10 ? 1 : 0;
                z10 = z6;
            }
        }
        c5130e.f41306n = z10;
    }
}
