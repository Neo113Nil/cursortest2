package x;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import z.C0384f;

/* renamed from: x.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0373h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0367b f4695a = new C0367b();

    public static boolean a(w.d dVar) {
        int[] iArr = dVar.f4575p0;
        int i = iArr[0];
        int i2 = iArr[1];
        w.d dVar2 = dVar.f4540T;
        w.e eVar = dVar2 != null ? (w.e) dVar2 : null;
        if (eVar != null) {
            int i3 = eVar.f4575p0[0];
        }
        if (eVar != null) {
            int i4 = eVar.f4575p0[1];
        }
        boolean z2 = i == 1 || dVar.A() || i == 2 || (i == 3 && dVar.f4577r == 0 && dVar.f4543W == RecyclerView.f2111C0 && dVar.t(0)) || (i == 3 && dVar.f4577r == 1 && dVar.u(0, dVar.q()));
        boolean z3 = i2 == 1 || dVar.B() || i2 == 2 || (i2 == 3 && dVar.f4578s == 0 && dVar.f4543W == RecyclerView.f2111C0 && dVar.t(1)) || (i2 == 3 && dVar.f4578s == 1 && dVar.u(1, dVar.k()));
        if (dVar.f4543W <= RecyclerView.f2111C0 || !(z2 || z3)) {
            return z2 && z3;
        }
        return true;
    }

    public static n b(w.d dVar, int i, ArrayList arrayList, n nVar) {
        int i2;
        int i3 = i == 0 ? dVar.f4571n0 : dVar.f4573o0;
        if (i3 != -1 && (nVar == null || i3 != nVar.f4703b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                n nVar2 = (n) arrayList.get(i4);
                if (nVar2.f4703b == i3) {
                    if (nVar != null) {
                        nVar.c(i, nVar2);
                        arrayList.remove(nVar);
                    }
                    nVar = nVar2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return nVar;
        }
        if (nVar == null) {
            if (dVar instanceof w.i) {
                w.i iVar = (w.i) dVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= iVar.f4659r0) {
                        i2 = -1;
                        break;
                    }
                    w.d dVar2 = iVar.f4658q0[i5];
                    if ((i == 0 && (i2 = dVar2.f4571n0) != -1) || (i == 1 && (i2 = dVar2.f4573o0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        n nVar3 = (n) arrayList.get(i6);
                        if (nVar3.f4703b == i2) {
                            nVar = nVar3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (nVar == null) {
                nVar = new n();
                nVar.f4702a = new ArrayList();
                nVar.f4705d = null;
                nVar.e = -1;
                int i7 = n.f4701f;
                n.f4701f = i7 + 1;
                nVar.f4703b = i7;
                nVar.f4704c = i;
            }
            arrayList.add(nVar);
        }
        ArrayList arrayList2 = nVar.f4702a;
        if (!arrayList2.contains(dVar)) {
            arrayList2.add(dVar);
            if (dVar instanceof w.h) {
                w.h hVar = (w.h) dVar;
                hVar.f4655t0.c(hVar.f4656u0 == 0 ? 1 : 0, arrayList, nVar);
            }
            int i8 = nVar.f4703b;
            if (i == 0) {
                dVar.f4571n0 = i8;
                dVar.f4530I.c(i, arrayList, nVar);
                dVar.f4531K.c(i, arrayList, nVar);
            } else {
                dVar.f4573o0 = i8;
                dVar.J.c(i, arrayList, nVar);
                dVar.f4533M.c(i, arrayList, nVar);
                dVar.f4532L.c(i, arrayList, nVar);
            }
            dVar.f4536P.c(i, arrayList, nVar);
        }
        return nVar;
    }

    public static void c(int i, w.d dVar, C0384f c0384f, boolean z2) {
        w.c cVar;
        w.c cVar2;
        w.c cVar3;
        w.c cVar4;
        if (dVar.f4568m) {
            return;
        }
        if (!(dVar instanceof w.e) && dVar.z() && a(dVar)) {
            w.e.V(dVar, c0384f, new C0367b());
        }
        w.c i2 = dVar.i(2);
        w.c i3 = dVar.i(4);
        int d2 = i2.d();
        int d3 = i3.d();
        HashSet hashSet = i2.f4515a;
        char c2 = 0;
        if (hashSet != null && i2.f4517c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                w.c cVar5 = (w.c) it.next();
                w.d dVar2 = cVar5.f4518d;
                int i4 = i + 1;
                boolean a2 = a(dVar2);
                if (dVar2.z() && a2) {
                    w.e.V(dVar2, c0384f, new C0367b());
                }
                w.c cVar6 = dVar2.f4530I;
                w.c cVar7 = dVar2.f4531K;
                char c3 = ((cVar5 == cVar6 && (cVar4 = cVar7.f4519f) != null && cVar4.f4517c) || (cVar5 == cVar7 && (cVar3 = cVar6.f4519f) != null && cVar3.f4517c)) ? (char) 1 : c2;
                int i5 = dVar2.f4575p0[c2];
                if (i5 != 3 || a2) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f4519f == null) {
                            int e = cVar6.e() + d2;
                            dVar2.J(e, dVar2.q() + e);
                            c(i4, dVar2, c0384f, z2);
                        } else if (cVar5 == cVar7 && cVar6.f4519f == null) {
                            int e2 = d2 - cVar7.e();
                            dVar2.J(e2 - dVar2.q(), e2);
                            c(i4, dVar2, c0384f, z2);
                        } else if (c3 != 0 && !dVar2.x()) {
                            d(i4, dVar2, c0384f, z2);
                        }
                    }
                } else if (i5 == 3 && dVar2.f4581v >= 0 && dVar2.f4580u >= 0 && ((dVar2.f4559g0 == 8 || (dVar2.f4577r == 0 && dVar2.f4543W == RecyclerView.f2111C0)) && !dVar2.x() && !dVar2.f4527F && c3 != 0 && !dVar2.x())) {
                    e(i4, dVar, c0384f, dVar2, z2);
                }
                c2 = 0;
            }
        }
        if (dVar instanceof w.h) {
            return;
        }
        HashSet hashSet2 = i3.f4515a;
        if (hashSet2 != null && i3.f4517c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                w.c cVar8 = (w.c) it2.next();
                w.d dVar3 = cVar8.f4518d;
                int i6 = i + 1;
                boolean a3 = a(dVar3);
                if (dVar3.z() && a3) {
                    w.e.V(dVar3, c0384f, new C0367b());
                }
                w.c cVar9 = dVar3.f4530I;
                w.c cVar10 = dVar3.f4531K;
                boolean z3 = (cVar8 == cVar9 && (cVar2 = cVar10.f4519f) != null && cVar2.f4517c) || (cVar8 == cVar10 && (cVar = cVar9.f4519f) != null && cVar.f4517c);
                int i7 = dVar3.f4575p0[0];
                if (i7 != 3 || a3) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f4519f == null) {
                            int e3 = cVar9.e() + d3;
                            dVar3.J(e3, dVar3.q() + e3);
                            c(i6, dVar3, c0384f, z2);
                        } else if (cVar8 == cVar10 && cVar9.f4519f == null) {
                            int e4 = d3 - cVar10.e();
                            dVar3.J(e4 - dVar3.q(), e4);
                            c(i6, dVar3, c0384f, z2);
                        } else if (z3 && !dVar3.x()) {
                            d(i6, dVar3, c0384f, z2);
                        }
                    }
                } else if (i7 == 3 && dVar3.f4581v >= 0 && dVar3.f4580u >= 0) {
                    if (dVar3.f4559g0 != 8) {
                        if (dVar3.f4577r == 0) {
                            if (dVar3.f4543W == RecyclerView.f2111C0) {
                            }
                        }
                    }
                    if (!dVar3.x() && !dVar3.f4527F && z3 && !dVar3.x()) {
                        e(i6, dVar, c0384f, dVar3, z2);
                    }
                }
            }
        }
        dVar.f4568m = true;
    }

    public static void d(int i, w.d dVar, C0384f c0384f, boolean z2) {
        float f2 = dVar.f4554d0;
        w.c cVar = dVar.f4530I;
        int d2 = cVar.f4519f.d();
        w.c cVar2 = dVar.f4531K;
        int d3 = cVar2.f4519f.d();
        int e = cVar.e() + d2;
        int e2 = d3 - cVar2.e();
        if (d2 == d3) {
            f2 = 0.5f;
        } else {
            d2 = e;
            d3 = e2;
        }
        int q2 = dVar.q();
        int i2 = (d3 - d2) - q2;
        if (d2 > d3) {
            i2 = (d2 - d3) - q2;
        }
        int i3 = ((int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2)) + d2;
        int i4 = i3 + q2;
        if (d2 > d3) {
            i4 = i3 - q2;
        }
        dVar.J(i3, i4);
        c(i + 1, dVar, c0384f, z2);
    }

    public static void e(int i, w.d dVar, C0384f c0384f, w.d dVar2, boolean z2) {
        float f2 = dVar2.f4554d0;
        w.c cVar = dVar2.f4530I;
        int e = cVar.e() + cVar.f4519f.d();
        w.c cVar2 = dVar2.f4531K;
        int d2 = cVar2.f4519f.d() - cVar2.e();
        if (d2 >= e) {
            int q2 = dVar2.q();
            if (dVar2.f4559g0 != 8) {
                int i2 = dVar2.f4577r;
                if (i2 == 2) {
                    q2 = (int) (dVar2.f4554d0 * 0.5f * (dVar instanceof w.e ? dVar.q() : dVar.f4540T.q()));
                } else if (i2 == 0) {
                    q2 = d2 - e;
                }
                q2 = Math.max(dVar2.f4580u, q2);
                int i3 = dVar2.f4581v;
                if (i3 > 0) {
                    q2 = Math.min(i3, q2);
                }
            }
            int i4 = e + ((int) ((f2 * ((d2 - e) - q2)) + 0.5f));
            dVar2.J(i4, q2 + i4);
            c(i + 1, dVar2, c0384f, z2);
        }
    }

    public static void f(int i, w.d dVar, C0384f c0384f) {
        float f2 = dVar.f4555e0;
        w.c cVar = dVar.J;
        int d2 = cVar.f4519f.d();
        w.c cVar2 = dVar.f4532L;
        int d3 = cVar2.f4519f.d();
        int e = cVar.e() + d2;
        int e2 = d3 - cVar2.e();
        if (d2 == d3) {
            f2 = 0.5f;
        } else {
            d2 = e;
            d3 = e2;
        }
        int k2 = dVar.k();
        int i2 = (d3 - d2) - k2;
        if (d2 > d3) {
            i2 = (d2 - d3) - k2;
        }
        int i3 = (int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2);
        int i4 = d2 + i3;
        int i5 = i4 + k2;
        if (d2 > d3) {
            i4 = d2 - i3;
            i5 = i4 - k2;
        }
        dVar.K(i4, i5);
        i(i + 1, dVar, c0384f);
    }

    public static void g(int i, w.d dVar, C0384f c0384f, w.d dVar2) {
        float f2 = dVar2.f4555e0;
        w.c cVar = dVar2.J;
        int e = cVar.e() + cVar.f4519f.d();
        w.c cVar2 = dVar2.f4532L;
        int d2 = cVar2.f4519f.d() - cVar2.e();
        if (d2 >= e) {
            int k2 = dVar2.k();
            if (dVar2.f4559g0 != 8) {
                int i2 = dVar2.f4578s;
                if (i2 == 2) {
                    k2 = (int) (f2 * 0.5f * (dVar instanceof w.e ? dVar.k() : dVar.f4540T.k()));
                } else if (i2 == 0) {
                    k2 = d2 - e;
                }
                k2 = Math.max(dVar2.f4583x, k2);
                int i3 = dVar2.f4584y;
                if (i3 > 0) {
                    k2 = Math.min(i3, k2);
                }
            }
            int i4 = e + ((int) ((f2 * ((d2 - e) - k2)) + 0.5f));
            dVar2.K(i4, k2 + i4);
            i(i + 1, dVar2, c0384f);
        }
    }

    public static boolean h(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static void i(int i, w.d dVar, C0384f c0384f) {
        w.c cVar;
        w.c cVar2;
        w.c cVar3;
        w.c cVar4;
        w.c cVar5;
        if (dVar.f4570n) {
            return;
        }
        if (!(dVar instanceof w.e) && dVar.z() && a(dVar)) {
            w.e.V(dVar, c0384f, new C0367b());
        }
        w.c i2 = dVar.i(3);
        w.c i3 = dVar.i(5);
        int d2 = i2.d();
        int d3 = i3.d();
        HashSet hashSet = i2.f4515a;
        if (hashSet != null && i2.f4517c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                w.c cVar6 = (w.c) it.next();
                w.d dVar2 = cVar6.f4518d;
                int i4 = i + 1;
                boolean a2 = a(dVar2);
                if (dVar2.z() && a2) {
                    w.e.V(dVar2, c0384f, new C0367b());
                }
                w.c cVar7 = dVar2.J;
                w.c cVar8 = dVar2.f4532L;
                boolean z2 = (cVar6 == cVar7 && (cVar5 = cVar8.f4519f) != null && cVar5.f4517c) || (cVar6 == cVar8 && (cVar4 = cVar7.f4519f) != null && cVar4.f4517c);
                int i5 = dVar2.f4575p0[1];
                if (i5 != 3 || a2) {
                    if (!dVar2.z()) {
                        if (cVar6 == cVar7 && cVar8.f4519f == null) {
                            int e = cVar7.e() + d2;
                            dVar2.K(e, dVar2.k() + e);
                            i(i4, dVar2, c0384f);
                        } else if (cVar6 == cVar8 && cVar7.f4519f == null) {
                            int e2 = d2 - cVar8.e();
                            dVar2.K(e2 - dVar2.k(), e2);
                            i(i4, dVar2, c0384f);
                        } else if (z2 && !dVar2.y()) {
                            f(i4, dVar2, c0384f);
                        }
                    }
                } else if (i5 == 3 && dVar2.f4584y >= 0 && dVar2.f4583x >= 0 && (dVar2.f4559g0 == 8 || (dVar2.f4578s == 0 && dVar2.f4543W == RecyclerView.f2111C0))) {
                    if (!dVar2.y() && !dVar2.f4527F && z2 && !dVar2.y()) {
                        g(i4, dVar, c0384f, dVar2);
                    }
                }
            }
        }
        if (dVar instanceof w.h) {
            return;
        }
        HashSet hashSet2 = i3.f4515a;
        if (hashSet2 != null && i3.f4517c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                w.c cVar9 = (w.c) it2.next();
                w.d dVar3 = cVar9.f4518d;
                int i6 = i + 1;
                boolean a3 = a(dVar3);
                if (dVar3.z() && a3) {
                    w.e.V(dVar3, c0384f, new C0367b());
                }
                w.c cVar10 = dVar3.J;
                w.c cVar11 = dVar3.f4532L;
                boolean z3 = (cVar9 == cVar10 && (cVar3 = cVar11.f4519f) != null && cVar3.f4517c) || (cVar9 == cVar11 && (cVar2 = cVar10.f4519f) != null && cVar2.f4517c);
                int i7 = dVar3.f4575p0[1];
                if (i7 != 3 || a3) {
                    if (!dVar3.z()) {
                        if (cVar9 == cVar10 && cVar11.f4519f == null) {
                            int e3 = cVar10.e() + d3;
                            dVar3.K(e3, dVar3.k() + e3);
                            i(i6, dVar3, c0384f);
                        } else if (cVar9 == cVar11 && cVar10.f4519f == null) {
                            int e4 = d3 - cVar11.e();
                            dVar3.K(e4 - dVar3.k(), e4);
                            i(i6, dVar3, c0384f);
                        } else if (z3 && !dVar3.y()) {
                            f(i6, dVar3, c0384f);
                        }
                    }
                } else if (i7 == 3 && dVar3.f4584y >= 0 && dVar3.f4583x >= 0) {
                    if (dVar3.f4559g0 != 8) {
                        if (dVar3.f4578s == 0) {
                            if (dVar3.f4543W == RecyclerView.f2111C0) {
                            }
                        }
                    }
                    if (!dVar3.y() && !dVar3.f4527F && z3 && !dVar3.y()) {
                        g(i6, dVar, c0384f, dVar3);
                    }
                }
            }
        }
        w.c i8 = dVar.i(6);
        if (i8.f4515a != null && i8.f4517c) {
            int d4 = i8.d();
            Iterator it3 = i8.f4515a.iterator();
            while (it3.hasNext()) {
                w.c cVar12 = (w.c) it3.next();
                w.d dVar4 = cVar12.f4518d;
                int i9 = i + 1;
                boolean a4 = a(dVar4);
                if (dVar4.z() && a4) {
                    w.e.V(dVar4, c0384f, new C0367b());
                }
                if (dVar4.f4575p0[1] != 3 || a4) {
                    if (!dVar4.z() && cVar12 == (cVar = dVar4.f4533M)) {
                        int e5 = cVar12.e() + d4;
                        if (dVar4.f4526E) {
                            int i10 = e5 - dVar4.f4548a0;
                            int i11 = dVar4.f4542V + i10;
                            dVar4.f4546Z = i10;
                            dVar4.J.l(i10);
                            dVar4.f4532L.l(i11);
                            cVar.l(e5);
                            dVar4.f4566l = true;
                        }
                        i(i9, dVar4, c0384f);
                    }
                }
            }
        }
        dVar.f4570n = true;
    }
}
