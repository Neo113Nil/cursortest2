package x;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import w.C5143c;
import w.C5144d;
import w.C5145e;

/* renamed from: x.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5191h {

    /* renamed from: a, reason: collision with root package name */
    public static final C5185b f41745a = new C5185b();

    public static boolean a(C5144d c5144d) {
        int[] iArr = c5144d.f41467p0;
        int i = iArr[0];
        int i4 = iArr[1];
        C5144d c5144d2 = c5144d.f41432T;
        C5145e c5145e = c5144d2 != null ? (C5145e) c5144d2 : null;
        if (c5145e != null) {
            int i9 = c5145e.f41467p0[0];
        }
        if (c5145e != null) {
            int i10 = c5145e.f41467p0[1];
        }
        boolean z8 = i == 1 || c5144d.A() || i == 2 || (i == 3 && c5144d.f41469r == 0 && c5144d.f41435W == 0.0f && c5144d.t(0)) || (i == 3 && c5144d.f41469r == 1 && c5144d.u(0, c5144d.q()));
        boolean z9 = i4 == 1 || c5144d.B() || i4 == 2 || (i4 == 3 && c5144d.f41470s == 0 && c5144d.f41435W == 0.0f && c5144d.t(1)) || (i4 == 3 && c5144d.f41470s == 1 && c5144d.u(1, c5144d.k()));
        return (c5144d.f41435W > 0.0f && (z8 || z9)) || (z8 && z9);
    }

    public static C5198o b(C5144d c5144d, int i, ArrayList arrayList, C5198o c5198o) {
        int i4;
        int i9 = i == 0 ? c5144d.f41463n0 : c5144d.f41465o0;
        if (i9 != -1 && (c5198o == null || i9 != c5198o.f41753b)) {
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                C5198o c5198o2 = (C5198o) arrayList.get(i10);
                if (c5198o2.f41753b == i9) {
                    if (c5198o != null) {
                        c5198o.c(i, c5198o2);
                        arrayList.remove(c5198o);
                    }
                    c5198o = c5198o2;
                } else {
                    i10++;
                }
            }
        } else if (i9 != -1) {
            return c5198o;
        }
        if (c5198o == null) {
            if (c5144d instanceof w.i) {
                w.i iVar = (w.i) c5144d;
                int i11 = 0;
                while (true) {
                    if (i11 >= iVar.f41558r0) {
                        i4 = -1;
                        break;
                    }
                    C5144d c5144d2 = iVar.f41557q0[i11];
                    if ((i == 0 && (i4 = c5144d2.f41463n0) != -1) || (i == 1 && (i4 = c5144d2.f41465o0) != -1)) {
                        break;
                    }
                    i11++;
                }
                if (i4 != -1) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            break;
                        }
                        C5198o c5198o3 = (C5198o) arrayList.get(i12);
                        if (c5198o3.f41753b == i4) {
                            c5198o = c5198o3;
                            break;
                        }
                        i12++;
                    }
                }
            }
            if (c5198o == null) {
                c5198o = new C5198o();
                c5198o.f41752a = new ArrayList();
                c5198o.f41755d = null;
                c5198o.f41756e = -1;
                int i13 = C5198o.f41751f;
                C5198o.f41751f = i13 + 1;
                c5198o.f41753b = i13;
                c5198o.f41754c = i;
            }
            arrayList.add(c5198o);
        }
        ArrayList arrayList2 = c5198o.f41752a;
        if (arrayList2.contains(c5144d)) {
            return c5198o;
        }
        arrayList2.add(c5144d);
        if (c5144d instanceof w.h) {
            w.h hVar = (w.h) c5144d;
            hVar.f41554t0.c(hVar.f41555u0 == 0 ? 1 : 0, arrayList, c5198o);
        }
        int i14 = c5198o.f41753b;
        if (i == 0) {
            c5144d.f41463n0 = i14;
            c5144d.f41422I.c(i, arrayList, c5198o);
            c5144d.f41423K.c(i, arrayList, c5198o);
        } else {
            c5144d.f41465o0 = i14;
            c5144d.J.c(i, arrayList, c5198o);
            c5144d.f41425M.c(i, arrayList, c5198o);
            c5144d.f41424L.c(i, arrayList, c5198o);
        }
        c5144d.f41428P.c(i, arrayList, c5198o);
        return c5198o;
    }

    public static void c(int i, C5144d c5144d, z.f fVar, boolean z8) {
        C5143c c5143c;
        C5143c c5143c2;
        char c4;
        C5143c c5143c3;
        C5143c c5143c4;
        if (c5144d.f41461m) {
            return;
        }
        if (!(c5144d instanceof C5145e) && c5144d.z() && a(c5144d)) {
            C5145e.V(c5144d, fVar, new C5185b());
        }
        C5143c i4 = c5144d.i(2);
        C5143c i9 = c5144d.i(4);
        int d2 = i4.d();
        int d3 = i9.d();
        HashSet hashSet = i4.f41406a;
        if (hashSet != null && i4.f41408c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C5143c c5143c5 = (C5143c) it.next();
                C5144d c5144d2 = c5143c5.f41409d;
                int i10 = i + 1;
                boolean a9 = a(c5144d2);
                if (c5144d2.z() && a9) {
                    c4 = 0;
                    C5145e.V(c5144d2, fVar, new C5185b());
                } else {
                    c4 = 0;
                }
                C5143c c5143c6 = c5144d2.f41422I;
                C5143c c5143c7 = c5144d2.f41423K;
                char c9 = ((c5143c5 == c5143c6 && (c5143c4 = c5143c7.f41411f) != null && c5143c4.f41408c) || (c5143c5 == c5143c7 && (c5143c3 = c5143c6.f41411f) != null && c5143c3.f41408c)) ? (char) 1 : c4;
                int i11 = c5144d2.f41467p0[c4];
                if (i11 != 3 || a9) {
                    if (!c5144d2.z()) {
                        if (c5143c5 == c5143c6 && c5143c7.f41411f == null) {
                            int e6 = c5143c6.e() + d2;
                            c5144d2.J(e6, c5144d2.q() + e6);
                            c(i10, c5144d2, fVar, z8);
                        } else if (c5143c5 == c5143c7 && c5143c6.f41411f == null) {
                            int e9 = d2 - c5143c7.e();
                            c5144d2.J(e9 - c5144d2.q(), e9);
                            c(i10, c5144d2, fVar, z8);
                        } else if (c9 != 0 && !c5144d2.x()) {
                            d(i10, c5144d2, fVar, z8);
                        }
                    }
                } else if (i11 == 3 && c5144d2.f41473v >= 0 && c5144d2.f41472u >= 0 && (c5144d2.f41451g0 == 8 || (c5144d2.f41469r == 0 && c5144d2.f41435W == 0.0f))) {
                    if (!c5144d2.x() && !c5144d2.f41419F && c9 != 0 && !c5144d2.x()) {
                        e(i10, c5144d, fVar, c5144d2, z8);
                    }
                }
            }
        }
        if (c5144d instanceof w.h) {
            return;
        }
        HashSet hashSet2 = i9.f41406a;
        if (hashSet2 != null && i9.f41408c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C5143c c5143c8 = (C5143c) it2.next();
                C5144d c5144d3 = c5143c8.f41409d;
                int i12 = i + 1;
                boolean a10 = a(c5144d3);
                if (c5144d3.z() && a10) {
                    C5145e.V(c5144d3, fVar, new C5185b());
                }
                C5143c c5143c9 = c5144d3.f41422I;
                C5143c c5143c10 = c5144d3.f41423K;
                boolean z9 = (c5143c8 == c5143c9 && (c5143c2 = c5143c10.f41411f) != null && c5143c2.f41408c) || (c5143c8 == c5143c10 && (c5143c = c5143c9.f41411f) != null && c5143c.f41408c);
                int i13 = c5144d3.f41467p0[0];
                if (i13 != 3 || a10) {
                    if (!c5144d3.z()) {
                        if (c5143c8 == c5143c9 && c5143c10.f41411f == null) {
                            int e10 = c5143c9.e() + d3;
                            c5144d3.J(e10, c5144d3.q() + e10);
                            c(i12, c5144d3, fVar, z8);
                        } else if (c5143c8 == c5143c10 && c5143c9.f41411f == null) {
                            int e11 = d3 - c5143c10.e();
                            c5144d3.J(e11 - c5144d3.q(), e11);
                            c(i12, c5144d3, fVar, z8);
                        } else if (z9 && !c5144d3.x()) {
                            d(i12, c5144d3, fVar, z8);
                        }
                    }
                } else if (i13 == 3 && c5144d3.f41473v >= 0 && c5144d3.f41472u >= 0) {
                    if (c5144d3.f41451g0 == 8 || (c5144d3.f41469r == 0 && c5144d3.f41435W == 0.0f)) {
                        if (!c5144d3.x() && !c5144d3.f41419F && z9 && !c5144d3.x()) {
                            e(i12, c5144d, fVar, c5144d3, z8);
                        }
                    }
                }
            }
        }
        c5144d.f41461m = true;
    }

    public static void d(int i, C5144d c5144d, z.f fVar, boolean z8) {
        float f6 = c5144d.f41445d0;
        C5143c c5143c = c5144d.f41422I;
        int d2 = c5143c.f41411f.d();
        C5143c c5143c2 = c5144d.f41423K;
        int d3 = c5143c2.f41411f.d();
        int e6 = c5143c.e() + d2;
        int e9 = d3 - c5143c2.e();
        if (d2 == d3) {
            f6 = 0.5f;
        } else {
            d2 = e6;
            d3 = e9;
        }
        int q6 = c5144d.q();
        int i4 = (d3 - d2) - q6;
        if (d2 > d3) {
            i4 = (d2 - d3) - q6;
        }
        int i9 = ((int) (i4 > 0 ? (f6 * i4) + 0.5f : f6 * i4)) + d2;
        int i10 = i9 + q6;
        if (d2 > d3) {
            i10 = i9 - q6;
        }
        c5144d.J(i9, i10);
        c(i + 1, c5144d, fVar, z8);
    }

    public static void e(int i, C5144d c5144d, z.f fVar, C5144d c5144d2, boolean z8) {
        float f6 = c5144d2.f41445d0;
        C5143c c5143c = c5144d2.f41422I;
        int e6 = c5143c.e() + c5143c.f41411f.d();
        C5143c c5143c2 = c5144d2.f41423K;
        int d2 = c5143c2.f41411f.d() - c5143c2.e();
        if (d2 >= e6) {
            int q6 = c5144d2.q();
            if (c5144d2.f41451g0 != 8) {
                int i4 = c5144d2.f41469r;
                if (i4 == 2) {
                    q6 = (int) (c5144d2.f41445d0 * 0.5f * (c5144d instanceof C5145e ? c5144d.q() : c5144d.f41432T.q()));
                } else if (i4 == 0) {
                    q6 = d2 - e6;
                }
                q6 = Math.max(c5144d2.f41472u, q6);
                int i9 = c5144d2.f41473v;
                if (i9 > 0) {
                    q6 = Math.min(i9, q6);
                }
            }
            int i10 = e6 + ((int) ((f6 * ((d2 - e6) - q6)) + 0.5f));
            c5144d2.J(i10, q6 + i10);
            c(i + 1, c5144d2, fVar, z8);
        }
    }

    public static void f(int i, C5144d c5144d, z.f fVar) {
        float f6 = c5144d.f41447e0;
        C5143c c5143c = c5144d.J;
        int d2 = c5143c.f41411f.d();
        C5143c c5143c2 = c5144d.f41424L;
        int d3 = c5143c2.f41411f.d();
        int e6 = c5143c.e() + d2;
        int e9 = d3 - c5143c2.e();
        if (d2 == d3) {
            f6 = 0.5f;
        } else {
            d2 = e6;
            d3 = e9;
        }
        int k6 = c5144d.k();
        int i4 = (d3 - d2) - k6;
        if (d2 > d3) {
            i4 = (d2 - d3) - k6;
        }
        int i9 = (int) (i4 > 0 ? (f6 * i4) + 0.5f : f6 * i4);
        int i10 = d2 + i9;
        int i11 = i10 + k6;
        if (d2 > d3) {
            i10 = d2 - i9;
            i11 = i10 - k6;
        }
        c5144d.K(i10, i11);
        i(i + 1, c5144d, fVar);
    }

    public static void g(int i, C5144d c5144d, z.f fVar, C5144d c5144d2) {
        float f6 = c5144d2.f41447e0;
        C5143c c5143c = c5144d2.J;
        int e6 = c5143c.e() + c5143c.f41411f.d();
        C5143c c5143c2 = c5144d2.f41424L;
        int d2 = c5143c2.f41411f.d() - c5143c2.e();
        if (d2 >= e6) {
            int k6 = c5144d2.k();
            if (c5144d2.f41451g0 != 8) {
                int i4 = c5144d2.f41470s;
                if (i4 == 2) {
                    k6 = (int) (f6 * 0.5f * (c5144d instanceof C5145e ? c5144d.k() : c5144d.f41432T.k()));
                } else if (i4 == 0) {
                    k6 = d2 - e6;
                }
                k6 = Math.max(c5144d2.f41475x, k6);
                int i9 = c5144d2.f41476y;
                if (i9 > 0) {
                    k6 = Math.min(i9, k6);
                }
            }
            int i10 = e6 + ((int) ((f6 * ((d2 - e6) - k6)) + 0.5f));
            c5144d2.K(i10, k6 + i10);
            i(i + 1, c5144d2, fVar);
        }
    }

    public static boolean h(int i, int i4, int i9, int i10) {
        return (i9 == 1 || i9 == 2 || (i9 == 4 && i != 2)) || (i10 == 1 || i10 == 2 || (i10 == 4 && i4 != 2));
    }

    public static void i(int i, C5144d c5144d, z.f fVar) {
        boolean z8;
        C5143c c5143c;
        C5143c c5143c2;
        C5143c c5143c3;
        C5143c c5143c4;
        if (c5144d.f41462n) {
            return;
        }
        if (!(c5144d instanceof C5145e) && c5144d.z() && a(c5144d)) {
            C5145e.V(c5144d, fVar, new C5185b());
        }
        C5143c i4 = c5144d.i(3);
        C5143c i9 = c5144d.i(5);
        int d2 = i4.d();
        int d3 = i9.d();
        HashSet hashSet = i4.f41406a;
        if (hashSet != null && i4.f41408c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C5143c c5143c5 = (C5143c) it.next();
                C5144d c5144d2 = c5143c5.f41409d;
                int i10 = i + 1;
                boolean a9 = a(c5144d2);
                if (c5144d2.z() && a9) {
                    C5145e.V(c5144d2, fVar, new C5185b());
                }
                C5143c c5143c6 = c5144d2.J;
                C5143c c5143c7 = c5144d2.f41424L;
                boolean z9 = (c5143c5 == c5143c6 && (c5143c4 = c5143c7.f41411f) != null && c5143c4.f41408c) || (c5143c5 == c5143c7 && (c5143c3 = c5143c6.f41411f) != null && c5143c3.f41408c);
                int i11 = c5144d2.f41467p0[1];
                if (i11 != 3 || a9) {
                    if (!c5144d2.z()) {
                        if (c5143c5 == c5143c6 && c5143c7.f41411f == null) {
                            int e6 = c5143c6.e() + d2;
                            c5144d2.K(e6, c5144d2.k() + e6);
                            i(i10, c5144d2, fVar);
                        } else if (c5143c5 == c5143c7 && c5143c6.f41411f == null) {
                            int e9 = d2 - c5143c7.e();
                            c5144d2.K(e9 - c5144d2.k(), e9);
                            i(i10, c5144d2, fVar);
                        } else if (z9 && !c5144d2.y()) {
                            f(i10, c5144d2, fVar);
                        }
                    }
                } else if (i11 == 3 && c5144d2.f41476y >= 0 && c5144d2.f41475x >= 0 && (c5144d2.f41451g0 == 8 || (c5144d2.f41470s == 0 && c5144d2.f41435W == 0.0f))) {
                    if (!c5144d2.y() && !c5144d2.f41419F && z9 && !c5144d2.y()) {
                        g(i10, c5144d, fVar, c5144d2);
                    }
                }
            }
        }
        boolean z10 = true;
        z10 = true;
        z10 = true;
        if (c5144d instanceof w.h) {
            return;
        }
        HashSet hashSet2 = i9.f41406a;
        if (hashSet2 != null && i9.f41408c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C5143c c5143c8 = (C5143c) it2.next();
                C5144d c5144d3 = c5143c8.f41409d;
                int i12 = i + 1;
                boolean a10 = a(c5144d3);
                if (c5144d3.z() && a10) {
                    C5145e.V(c5144d3, fVar, new C5185b());
                }
                C5143c c5143c9 = c5144d3.J;
                C5143c c5143c10 = c5144d3.f41424L;
                boolean z11 = (c5143c8 == c5143c9 && (c5143c2 = c5143c10.f41411f) != null && c5143c2.f41408c) || (c5143c8 == c5143c10 && (c5143c = c5143c9.f41411f) != null && c5143c.f41408c);
                int i13 = c5144d3.f41467p0[1];
                if (i13 != 3 || a10) {
                    if (!c5144d3.z()) {
                        if (c5143c8 == c5143c9 && c5143c10.f41411f == null) {
                            int e10 = c5143c9.e() + d3;
                            c5144d3.K(e10, c5144d3.k() + e10);
                            i(i12, c5144d3, fVar);
                        } else if (c5143c8 == c5143c10 && c5143c9.f41411f == null) {
                            int e11 = d3 - c5143c10.e();
                            c5144d3.K(e11 - c5144d3.k(), e11);
                            i(i12, c5144d3, fVar);
                        } else if (z11 && !c5144d3.y()) {
                            f(i12, c5144d3, fVar);
                        }
                    }
                } else if (i13 == 3 && c5144d3.f41476y >= 0 && c5144d3.f41475x >= 0 && (c5144d3.f41451g0 == 8 || (c5144d3.f41470s == 0 && c5144d3.f41435W == 0.0f))) {
                    if (!c5144d3.y() && !c5144d3.f41419F && z11 && !c5144d3.y()) {
                        g(i12, c5144d, fVar, c5144d3);
                    }
                }
            }
        }
        C5143c i14 = c5144d.i(6);
        if (i14.f41406a != null && i14.f41408c) {
            int d9 = i14.d();
            Iterator it3 = i14.f41406a.iterator();
            while (it3.hasNext()) {
                C5143c c5143c11 = (C5143c) it3.next();
                C5144d c5144d4 = c5143c11.f41409d;
                int i15 = i + 1;
                boolean a11 = a(c5144d4);
                if (c5144d4.z() && a11) {
                    C5145e.V(c5144d4, fVar, new C5185b());
                }
                if (c5144d4.f41467p0[z10 ? 1 : 0] != 3 || a11) {
                    if (!c5144d4.z()) {
                        C5143c c5143c12 = c5144d4.f41425M;
                        if (c5143c11 == c5143c12) {
                            int e12 = c5143c11.e() + d9;
                            if (c5144d4.f41418E) {
                                int i16 = e12 - c5144d4.f41439a0;
                                int i17 = c5144d4.f41434V + i16;
                                c5144d4.f41437Z = i16;
                                c5144d4.J.l(i16);
                                c5144d4.f41424L.l(i17);
                                c5143c12.l(e12);
                                z8 = z10 ? 1 : 0;
                                c5144d4.f41459l = z8;
                            } else {
                                z8 = z10 ? 1 : 0;
                            }
                            i(i15, c5144d4, fVar);
                            z10 = z8;
                        }
                    }
                }
                z8 = z10 ? 1 : 0;
                z10 = z8;
            }
        }
        c5144d.f41462n = z10;
    }
}
