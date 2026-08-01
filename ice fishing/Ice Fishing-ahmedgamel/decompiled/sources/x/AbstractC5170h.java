package x;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import w.C5138c;
import w.C5139d;
import w.C5140e;

/* renamed from: x.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5170h {

    /* renamed from: a, reason: collision with root package name */
    public static final C5164b f41729a = new C5164b();

    public static boolean a(C5139d c5139d) {
        int[] iArr = c5139d.f41532p0;
        int i = iArr[0];
        int i6 = iArr[1];
        C5139d c5139d2 = c5139d.f41497T;
        C5140e c5140e = c5139d2 != null ? (C5140e) c5139d2 : null;
        if (c5140e != null) {
            int i9 = c5140e.f41532p0[0];
        }
        if (c5140e != null) {
            int i10 = c5140e.f41532p0[1];
        }
        boolean z3 = i == 1 || c5139d.A() || i == 2 || (i == 3 && c5139d.f41534r == 0 && c5139d.f41500W == 0.0f && c5139d.t(0)) || (i == 3 && c5139d.f41534r == 1 && c5139d.u(0, c5139d.q()));
        boolean z6 = i6 == 1 || c5139d.B() || i6 == 2 || (i6 == 3 && c5139d.f41535s == 0 && c5139d.f41500W == 0.0f && c5139d.t(1)) || (i6 == 3 && c5139d.f41535s == 1 && c5139d.u(1, c5139d.k()));
        return (c5139d.f41500W > 0.0f && (z3 || z6)) || (z3 && z6);
    }

    public static C5177o b(C5139d c5139d, int i, ArrayList arrayList, C5177o c5177o) {
        int i6;
        int i9 = i == 0 ? c5139d.f41528n0 : c5139d.f41530o0;
        if (i9 != -1 && (c5177o == null || i9 != c5177o.f41737b)) {
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                C5177o c5177o2 = (C5177o) arrayList.get(i10);
                if (c5177o2.f41737b == i9) {
                    if (c5177o != null) {
                        c5177o.c(i, c5177o2);
                        arrayList.remove(c5177o);
                    }
                    c5177o = c5177o2;
                } else {
                    i10++;
                }
            }
        } else if (i9 != -1) {
            return c5177o;
        }
        if (c5177o == null) {
            if (c5139d instanceof w.i) {
                w.i iVar = (w.i) c5139d;
                int i11 = 0;
                while (true) {
                    if (i11 >= iVar.f41623r0) {
                        i6 = -1;
                        break;
                    }
                    C5139d c5139d2 = iVar.f41622q0[i11];
                    if ((i == 0 && (i6 = c5139d2.f41528n0) != -1) || (i == 1 && (i6 = c5139d2.f41530o0) != -1)) {
                        break;
                    }
                    i11++;
                }
                if (i6 != -1) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            break;
                        }
                        C5177o c5177o3 = (C5177o) arrayList.get(i12);
                        if (c5177o3.f41737b == i6) {
                            c5177o = c5177o3;
                            break;
                        }
                        i12++;
                    }
                }
            }
            if (c5177o == null) {
                c5177o = new C5177o();
                c5177o.f41736a = new ArrayList();
                c5177o.f41739d = null;
                c5177o.f41740e = -1;
                int i13 = C5177o.f41735f;
                C5177o.f41735f = i13 + 1;
                c5177o.f41737b = i13;
                c5177o.f41738c = i;
            }
            arrayList.add(c5177o);
        }
        ArrayList arrayList2 = c5177o.f41736a;
        if (arrayList2.contains(c5139d)) {
            return c5177o;
        }
        arrayList2.add(c5139d);
        if (c5139d instanceof w.h) {
            w.h hVar = (w.h) c5139d;
            hVar.f41619t0.c(hVar.f41620u0 == 0 ? 1 : 0, arrayList, c5177o);
        }
        int i14 = c5177o.f41737b;
        if (i == 0) {
            c5139d.f41528n0 = i14;
            c5139d.f41487I.c(i, arrayList, c5177o);
            c5139d.f41488K.c(i, arrayList, c5177o);
        } else {
            c5139d.f41530o0 = i14;
            c5139d.J.c(i, arrayList, c5177o);
            c5139d.f41490M.c(i, arrayList, c5177o);
            c5139d.f41489L.c(i, arrayList, c5177o);
        }
        c5139d.f41493P.c(i, arrayList, c5177o);
        return c5177o;
    }

    public static void c(int i, C5139d c5139d, z.f fVar, boolean z3) {
        C5138c c5138c;
        C5138c c5138c2;
        char c9;
        C5138c c5138c3;
        C5138c c5138c4;
        if (c5139d.f41526m) {
            return;
        }
        if (!(c5139d instanceof C5140e) && c5139d.z() && a(c5139d)) {
            C5140e.V(c5139d, fVar, new C5164b());
        }
        C5138c i6 = c5139d.i(2);
        C5138c i9 = c5139d.i(4);
        int d2 = i6.d();
        int d9 = i9.d();
        HashSet hashSet = i6.f41471a;
        if (hashSet != null && i6.f41473c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C5138c c5138c5 = (C5138c) it.next();
                C5139d c5139d2 = c5138c5.f41474d;
                int i10 = i + 1;
                boolean a9 = a(c5139d2);
                if (c5139d2.z() && a9) {
                    c9 = 0;
                    C5140e.V(c5139d2, fVar, new C5164b());
                } else {
                    c9 = 0;
                }
                C5138c c5138c6 = c5139d2.f41487I;
                C5138c c5138c7 = c5139d2.f41488K;
                char c10 = ((c5138c5 == c5138c6 && (c5138c4 = c5138c7.f41476f) != null && c5138c4.f41473c) || (c5138c5 == c5138c7 && (c5138c3 = c5138c6.f41476f) != null && c5138c3.f41473c)) ? (char) 1 : c9;
                int i11 = c5139d2.f41532p0[c9];
                if (i11 != 3 || a9) {
                    if (!c5139d2.z()) {
                        if (c5138c5 == c5138c6 && c5138c7.f41476f == null) {
                            int e9 = c5138c6.e() + d2;
                            c5139d2.J(e9, c5139d2.q() + e9);
                            c(i10, c5139d2, fVar, z3);
                        } else if (c5138c5 == c5138c7 && c5138c6.f41476f == null) {
                            int e10 = d2 - c5138c7.e();
                            c5139d2.J(e10 - c5139d2.q(), e10);
                            c(i10, c5139d2, fVar, z3);
                        } else if (c10 != 0 && !c5139d2.x()) {
                            d(i10, c5139d2, fVar, z3);
                        }
                    }
                } else if (i11 == 3 && c5139d2.f41538v >= 0 && c5139d2.f41537u >= 0 && (c5139d2.f41516g0 == 8 || (c5139d2.f41534r == 0 && c5139d2.f41500W == 0.0f))) {
                    if (!c5139d2.x() && !c5139d2.f41484F && c10 != 0 && !c5139d2.x()) {
                        e(i10, c5139d, fVar, c5139d2, z3);
                    }
                }
            }
        }
        if (c5139d instanceof w.h) {
            return;
        }
        HashSet hashSet2 = i9.f41471a;
        if (hashSet2 != null && i9.f41473c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C5138c c5138c8 = (C5138c) it2.next();
                C5139d c5139d3 = c5138c8.f41474d;
                int i12 = i + 1;
                boolean a10 = a(c5139d3);
                if (c5139d3.z() && a10) {
                    C5140e.V(c5139d3, fVar, new C5164b());
                }
                C5138c c5138c9 = c5139d3.f41487I;
                C5138c c5138c10 = c5139d3.f41488K;
                boolean z6 = (c5138c8 == c5138c9 && (c5138c2 = c5138c10.f41476f) != null && c5138c2.f41473c) || (c5138c8 == c5138c10 && (c5138c = c5138c9.f41476f) != null && c5138c.f41473c);
                int i13 = c5139d3.f41532p0[0];
                if (i13 != 3 || a10) {
                    if (!c5139d3.z()) {
                        if (c5138c8 == c5138c9 && c5138c10.f41476f == null) {
                            int e11 = c5138c9.e() + d9;
                            c5139d3.J(e11, c5139d3.q() + e11);
                            c(i12, c5139d3, fVar, z3);
                        } else if (c5138c8 == c5138c10 && c5138c9.f41476f == null) {
                            int e12 = d9 - c5138c10.e();
                            c5139d3.J(e12 - c5139d3.q(), e12);
                            c(i12, c5139d3, fVar, z3);
                        } else if (z6 && !c5139d3.x()) {
                            d(i12, c5139d3, fVar, z3);
                        }
                    }
                } else if (i13 == 3 && c5139d3.f41538v >= 0 && c5139d3.f41537u >= 0) {
                    if (c5139d3.f41516g0 == 8 || (c5139d3.f41534r == 0 && c5139d3.f41500W == 0.0f)) {
                        if (!c5139d3.x() && !c5139d3.f41484F && z6 && !c5139d3.x()) {
                            e(i12, c5139d, fVar, c5139d3, z3);
                        }
                    }
                }
            }
        }
        c5139d.f41526m = true;
    }

    public static void d(int i, C5139d c5139d, z.f fVar, boolean z3) {
        float f3 = c5139d.f41510d0;
        C5138c c5138c = c5139d.f41487I;
        int d2 = c5138c.f41476f.d();
        C5138c c5138c2 = c5139d.f41488K;
        int d9 = c5138c2.f41476f.d();
        int e9 = c5138c.e() + d2;
        int e10 = d9 - c5138c2.e();
        if (d2 == d9) {
            f3 = 0.5f;
        } else {
            d2 = e9;
            d9 = e10;
        }
        int q8 = c5139d.q();
        int i6 = (d9 - d2) - q8;
        if (d2 > d9) {
            i6 = (d2 - d9) - q8;
        }
        int i9 = ((int) (i6 > 0 ? (f3 * i6) + 0.5f : f3 * i6)) + d2;
        int i10 = i9 + q8;
        if (d2 > d9) {
            i10 = i9 - q8;
        }
        c5139d.J(i9, i10);
        c(i + 1, c5139d, fVar, z3);
    }

    public static void e(int i, C5139d c5139d, z.f fVar, C5139d c5139d2, boolean z3) {
        float f3 = c5139d2.f41510d0;
        C5138c c5138c = c5139d2.f41487I;
        int e9 = c5138c.e() + c5138c.f41476f.d();
        C5138c c5138c2 = c5139d2.f41488K;
        int d2 = c5138c2.f41476f.d() - c5138c2.e();
        if (d2 >= e9) {
            int q8 = c5139d2.q();
            if (c5139d2.f41516g0 != 8) {
                int i6 = c5139d2.f41534r;
                if (i6 == 2) {
                    q8 = (int) (c5139d2.f41510d0 * 0.5f * (c5139d instanceof C5140e ? c5139d.q() : c5139d.f41497T.q()));
                } else if (i6 == 0) {
                    q8 = d2 - e9;
                }
                q8 = Math.max(c5139d2.f41537u, q8);
                int i9 = c5139d2.f41538v;
                if (i9 > 0) {
                    q8 = Math.min(i9, q8);
                }
            }
            int i10 = e9 + ((int) ((f3 * ((d2 - e9) - q8)) + 0.5f));
            c5139d2.J(i10, q8 + i10);
            c(i + 1, c5139d2, fVar, z3);
        }
    }

    public static void f(int i, C5139d c5139d, z.f fVar) {
        float f3 = c5139d.f41512e0;
        C5138c c5138c = c5139d.J;
        int d2 = c5138c.f41476f.d();
        C5138c c5138c2 = c5139d.f41489L;
        int d9 = c5138c2.f41476f.d();
        int e9 = c5138c.e() + d2;
        int e10 = d9 - c5138c2.e();
        if (d2 == d9) {
            f3 = 0.5f;
        } else {
            d2 = e9;
            d9 = e10;
        }
        int k9 = c5139d.k();
        int i6 = (d9 - d2) - k9;
        if (d2 > d9) {
            i6 = (d2 - d9) - k9;
        }
        int i9 = (int) (i6 > 0 ? (f3 * i6) + 0.5f : f3 * i6);
        int i10 = d2 + i9;
        int i11 = i10 + k9;
        if (d2 > d9) {
            i10 = d2 - i9;
            i11 = i10 - k9;
        }
        c5139d.K(i10, i11);
        i(i + 1, c5139d, fVar);
    }

    public static void g(int i, C5139d c5139d, z.f fVar, C5139d c5139d2) {
        float f3 = c5139d2.f41512e0;
        C5138c c5138c = c5139d2.J;
        int e9 = c5138c.e() + c5138c.f41476f.d();
        C5138c c5138c2 = c5139d2.f41489L;
        int d2 = c5138c2.f41476f.d() - c5138c2.e();
        if (d2 >= e9) {
            int k9 = c5139d2.k();
            if (c5139d2.f41516g0 != 8) {
                int i6 = c5139d2.f41535s;
                if (i6 == 2) {
                    k9 = (int) (f3 * 0.5f * (c5139d instanceof C5140e ? c5139d.k() : c5139d.f41497T.k()));
                } else if (i6 == 0) {
                    k9 = d2 - e9;
                }
                k9 = Math.max(c5139d2.f41540x, k9);
                int i9 = c5139d2.f41541y;
                if (i9 > 0) {
                    k9 = Math.min(i9, k9);
                }
            }
            int i10 = e9 + ((int) ((f3 * ((d2 - e9) - k9)) + 0.5f));
            c5139d2.K(i10, k9 + i10);
            i(i + 1, c5139d2, fVar);
        }
    }

    public static boolean h(int i, int i6, int i9, int i10) {
        return (i9 == 1 || i9 == 2 || (i9 == 4 && i != 2)) || (i10 == 1 || i10 == 2 || (i10 == 4 && i6 != 2));
    }

    public static void i(int i, C5139d c5139d, z.f fVar) {
        boolean z3;
        C5138c c5138c;
        C5138c c5138c2;
        C5138c c5138c3;
        C5138c c5138c4;
        if (c5139d.f41527n) {
            return;
        }
        if (!(c5139d instanceof C5140e) && c5139d.z() && a(c5139d)) {
            C5140e.V(c5139d, fVar, new C5164b());
        }
        C5138c i6 = c5139d.i(3);
        C5138c i9 = c5139d.i(5);
        int d2 = i6.d();
        int d9 = i9.d();
        HashSet hashSet = i6.f41471a;
        if (hashSet != null && i6.f41473c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C5138c c5138c5 = (C5138c) it.next();
                C5139d c5139d2 = c5138c5.f41474d;
                int i10 = i + 1;
                boolean a9 = a(c5139d2);
                if (c5139d2.z() && a9) {
                    C5140e.V(c5139d2, fVar, new C5164b());
                }
                C5138c c5138c6 = c5139d2.J;
                C5138c c5138c7 = c5139d2.f41489L;
                boolean z6 = (c5138c5 == c5138c6 && (c5138c4 = c5138c7.f41476f) != null && c5138c4.f41473c) || (c5138c5 == c5138c7 && (c5138c3 = c5138c6.f41476f) != null && c5138c3.f41473c);
                int i11 = c5139d2.f41532p0[1];
                if (i11 != 3 || a9) {
                    if (!c5139d2.z()) {
                        if (c5138c5 == c5138c6 && c5138c7.f41476f == null) {
                            int e9 = c5138c6.e() + d2;
                            c5139d2.K(e9, c5139d2.k() + e9);
                            i(i10, c5139d2, fVar);
                        } else if (c5138c5 == c5138c7 && c5138c6.f41476f == null) {
                            int e10 = d2 - c5138c7.e();
                            c5139d2.K(e10 - c5139d2.k(), e10);
                            i(i10, c5139d2, fVar);
                        } else if (z6 && !c5139d2.y()) {
                            f(i10, c5139d2, fVar);
                        }
                    }
                } else if (i11 == 3 && c5139d2.f41541y >= 0 && c5139d2.f41540x >= 0 && (c5139d2.f41516g0 == 8 || (c5139d2.f41535s == 0 && c5139d2.f41500W == 0.0f))) {
                    if (!c5139d2.y() && !c5139d2.f41484F && z6 && !c5139d2.y()) {
                        g(i10, c5139d, fVar, c5139d2);
                    }
                }
            }
        }
        boolean z9 = true;
        z9 = true;
        z9 = true;
        if (c5139d instanceof w.h) {
            return;
        }
        HashSet hashSet2 = i9.f41471a;
        if (hashSet2 != null && i9.f41473c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C5138c c5138c8 = (C5138c) it2.next();
                C5139d c5139d3 = c5138c8.f41474d;
                int i12 = i + 1;
                boolean a10 = a(c5139d3);
                if (c5139d3.z() && a10) {
                    C5140e.V(c5139d3, fVar, new C5164b());
                }
                C5138c c5138c9 = c5139d3.J;
                C5138c c5138c10 = c5139d3.f41489L;
                boolean z10 = (c5138c8 == c5138c9 && (c5138c2 = c5138c10.f41476f) != null && c5138c2.f41473c) || (c5138c8 == c5138c10 && (c5138c = c5138c9.f41476f) != null && c5138c.f41473c);
                int i13 = c5139d3.f41532p0[1];
                if (i13 != 3 || a10) {
                    if (!c5139d3.z()) {
                        if (c5138c8 == c5138c9 && c5138c10.f41476f == null) {
                            int e11 = c5138c9.e() + d9;
                            c5139d3.K(e11, c5139d3.k() + e11);
                            i(i12, c5139d3, fVar);
                        } else if (c5138c8 == c5138c10 && c5138c9.f41476f == null) {
                            int e12 = d9 - c5138c10.e();
                            c5139d3.K(e12 - c5139d3.k(), e12);
                            i(i12, c5139d3, fVar);
                        } else if (z10 && !c5139d3.y()) {
                            f(i12, c5139d3, fVar);
                        }
                    }
                } else if (i13 == 3 && c5139d3.f41541y >= 0 && c5139d3.f41540x >= 0 && (c5139d3.f41516g0 == 8 || (c5139d3.f41535s == 0 && c5139d3.f41500W == 0.0f))) {
                    if (!c5139d3.y() && !c5139d3.f41484F && z10 && !c5139d3.y()) {
                        g(i12, c5139d, fVar, c5139d3);
                    }
                }
            }
        }
        C5138c i14 = c5139d.i(6);
        if (i14.f41471a != null && i14.f41473c) {
            int d10 = i14.d();
            Iterator it3 = i14.f41471a.iterator();
            while (it3.hasNext()) {
                C5138c c5138c11 = (C5138c) it3.next();
                C5139d c5139d4 = c5138c11.f41474d;
                int i15 = i + 1;
                boolean a11 = a(c5139d4);
                if (c5139d4.z() && a11) {
                    C5140e.V(c5139d4, fVar, new C5164b());
                }
                if (c5139d4.f41532p0[z9 ? 1 : 0] != 3 || a11) {
                    if (!c5139d4.z()) {
                        C5138c c5138c12 = c5139d4.f41490M;
                        if (c5138c11 == c5138c12) {
                            int e13 = c5138c11.e() + d10;
                            if (c5139d4.f41483E) {
                                int i16 = e13 - c5139d4.f41504a0;
                                int i17 = c5139d4.f41499V + i16;
                                c5139d4.f41502Z = i16;
                                c5139d4.J.l(i16);
                                c5139d4.f41489L.l(i17);
                                c5138c12.l(e13);
                                z3 = z9 ? 1 : 0;
                                c5139d4.f41524l = z3;
                            } else {
                                z3 = z9 ? 1 : 0;
                            }
                            i(i15, c5139d4, fVar);
                            z9 = z3;
                        }
                    }
                }
                z3 = z9 ? 1 : 0;
                z9 = z3;
            }
        }
        c5139d.f41527n = z9;
    }
}
