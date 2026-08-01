package x;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import z.C0384f;

/* renamed from: x.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0370e {

    /* renamed from: a, reason: collision with root package name */
    public w.e f4678a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4679b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4680c;

    /* renamed from: d, reason: collision with root package name */
    public w.e f4681d;
    public ArrayList e;

    /* renamed from: f, reason: collision with root package name */
    public C0384f f4682f;

    /* renamed from: g, reason: collision with root package name */
    public C0367b f4683g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f4684h;

    public final void a(C0371f c0371f, int i, ArrayList arrayList, l lVar) {
        o oVar = c0371f.f4688d;
        if (oVar.f4708c == null) {
            w.e eVar = this.f4678a;
            if (oVar == eVar.f4553d || oVar == eVar.e) {
                return;
            }
            if (lVar == null) {
                lVar = new l();
                lVar.f4697a = null;
                lVar.f4698b = new ArrayList();
                lVar.f4697a = oVar;
                arrayList.add(lVar);
            }
            oVar.f4708c = lVar;
            lVar.f4698b.add(oVar);
            C0371f c0371f2 = oVar.f4712h;
            Iterator it = c0371f2.f4692k.iterator();
            while (it.hasNext()) {
                InterfaceC0369d interfaceC0369d = (InterfaceC0369d) it.next();
                if (interfaceC0369d instanceof C0371f) {
                    a((C0371f) interfaceC0369d, i, arrayList, lVar);
                }
            }
            C0371f c0371f3 = oVar.i;
            Iterator it2 = c0371f3.f4692k.iterator();
            while (it2.hasNext()) {
                InterfaceC0369d interfaceC0369d2 = (InterfaceC0369d) it2.next();
                if (interfaceC0369d2 instanceof C0371f) {
                    a((C0371f) interfaceC0369d2, i, arrayList, lVar);
                }
            }
            if (i == 1 && (oVar instanceof m)) {
                Iterator it3 = ((m) oVar).f4699k.f4692k.iterator();
                while (it3.hasNext()) {
                    InterfaceC0369d interfaceC0369d3 = (InterfaceC0369d) it3.next();
                    if (interfaceC0369d3 instanceof C0371f) {
                        a((C0371f) interfaceC0369d3, i, arrayList, lVar);
                    }
                }
            }
            Iterator it4 = c0371f2.f4693l.iterator();
            while (it4.hasNext()) {
                a((C0371f) it4.next(), i, arrayList, lVar);
            }
            Iterator it5 = c0371f3.f4693l.iterator();
            while (it5.hasNext()) {
                a((C0371f) it5.next(), i, arrayList, lVar);
            }
            if (i == 1 && (oVar instanceof m)) {
                Iterator it6 = ((m) oVar).f4699k.f4693l.iterator();
                while (it6.hasNext()) {
                    a((C0371f) it6.next(), i, arrayList, lVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(w.e eVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Iterator it = eVar.f4597q0.iterator();
        while (it.hasNext()) {
            w.d dVar = (w.d) it.next();
            int[] iArr = dVar.f4575p0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            if (dVar.f4559g0 == 8) {
                dVar.f4547a = true;
            } else {
                float f2 = dVar.f4582w;
                if (f2 < 1.0f && i7 == 3) {
                    dVar.f4577r = 2;
                }
                float f3 = dVar.f4585z;
                if (f3 < 1.0f && i8 == 3) {
                    dVar.f4578s = 2;
                }
                if (dVar.f4543W > RecyclerView.f2111C0) {
                    if (i7 == 3 && (i8 == 2 || i8 == 1)) {
                        dVar.f4577r = 3;
                    } else if (i8 == 3 && (i7 == 2 || i7 == 1)) {
                        dVar.f4578s = 3;
                    } else if (i7 == 3 && i8 == 3) {
                        if (dVar.f4577r == 0) {
                            dVar.f4577r = 3;
                        }
                        if (dVar.f4578s == 0) {
                            dVar.f4578s = 3;
                        }
                    }
                }
                w.c cVar = dVar.f4531K;
                w.c cVar2 = dVar.f4530I;
                if (i7 == 3 && dVar.f4577r == 1 && (cVar2.f4519f == null || cVar.f4519f == null)) {
                    i7 = 2;
                }
                w.c cVar3 = dVar.f4532L;
                w.c cVar4 = dVar.J;
                int i9 = (i8 == 3 && dVar.f4578s == 1 && (cVar4.f4519f == null || cVar3.f4519f == null)) ? 2 : i8;
                k kVar = dVar.f4553d;
                kVar.f4709d = i7;
                int i10 = dVar.f4577r;
                kVar.f4706a = i10;
                m mVar = dVar.e;
                mVar.f4709d = i9;
                int i11 = dVar.f4578s;
                mVar.f4706a = i11;
                if ((i7 == 4 || i7 == 1 || i7 == 2) && (i9 == 4 || i9 == 1 || i9 == 2)) {
                    int q2 = dVar.q();
                    if (i7 == 4) {
                        i = (eVar.q() - cVar2.f4520g) - cVar.f4520g;
                        i7 = 1;
                    } else {
                        i = q2;
                    }
                    int k2 = dVar.k();
                    if (i9 == 4) {
                        i2 = (eVar.k() - cVar4.f4520g) - cVar3.f4520g;
                        i3 = 1;
                    } else {
                        i2 = k2;
                        i3 = i9;
                    }
                    f(i7, i, i3, i2, dVar);
                    dVar.f4553d.e.d(dVar.q());
                    dVar.e.e.d(dVar.k());
                    dVar.f4547a = true;
                } else {
                    int[] iArr2 = eVar.f4575p0;
                    w.c[] cVarArr = dVar.f4537Q;
                    if (i7 != 3 || (i9 != 2 && i9 != 1)) {
                        i4 = 3;
                    } else if (i10 == 3) {
                        if (i9 == 2) {
                            f(2, 0, 2, 0, dVar);
                        }
                        int k3 = dVar.k();
                        f(1, (int) ((k3 * dVar.f4543W) + 0.5f), 1, k3, dVar);
                        dVar.f4553d.e.d(dVar.q());
                        dVar.e.e.d(dVar.k());
                        dVar.f4547a = true;
                    } else if (i10 == 1) {
                        f(2, 0, i9, 0, dVar);
                        dVar.f4553d.e.f4694m = dVar.q();
                    } else if (i10 == 2) {
                        int i12 = iArr2[0];
                        if (i12 == 1 || i12 == 4) {
                            f(1, (int) ((f2 * eVar.q()) + 0.5f), i9, dVar.k(), dVar);
                            dVar.f4553d.e.d(dVar.q());
                            dVar.e.e.d(dVar.k());
                            dVar.f4547a = true;
                        } else {
                            i4 = 3;
                        }
                    } else if (cVarArr[0].f4519f == null || cVarArr[1].f4519f == null) {
                        f(2, 0, i9, 0, dVar);
                        dVar.f4553d.e.d(dVar.q());
                        dVar.e.e.d(dVar.k());
                        dVar.f4547a = true;
                    } else {
                        i4 = 3;
                    }
                    if (i9 == i4) {
                        if (i7 != 2 && i7 != 1) {
                            i6 = i4;
                            i5 = 1;
                            if (i7 != i6) {
                                if (i10 != i5) {
                                }
                                f(2, 0, 2, 0, dVar);
                                dVar.f4553d.e.f4694m = dVar.q();
                                dVar.e.e.f4694m = dVar.k();
                            }
                        } else if (i11 == i4) {
                            if (i7 == 2) {
                                f(2, 0, 2, 0, dVar);
                            }
                            int q3 = dVar.q();
                            float f4 = dVar.f4543W;
                            if (dVar.f4544X == -1) {
                                f4 = 1.0f / f4;
                            }
                            f(1, q3, 1, (int) ((q3 * f4) + 0.5f), dVar);
                            dVar.f4553d.e.d(dVar.q());
                            dVar.e.e.d(dVar.k());
                            dVar.f4547a = true;
                        } else if (i11 == 1) {
                            f(i7, 0, 2, 0, dVar);
                            dVar.e.e.f4694m = dVar.k();
                        } else {
                            if (i11 == 2) {
                                int i13 = iArr2[1];
                                if (i13 == 1 || i13 == 4) {
                                    f(i7, dVar.q(), 1, (int) ((f3 * eVar.k()) + 0.5f), dVar);
                                    dVar.f4553d.e.d(dVar.q());
                                    dVar.e.e.d(dVar.k());
                                    dVar.f4547a = true;
                                }
                            } else if (cVarArr[2].f4519f == null || cVarArr[3].f4519f == null) {
                                f(2, 0, i9, 0, dVar);
                                dVar.f4553d.e.d(dVar.q());
                                dVar.e.e.d(dVar.k());
                                dVar.f4547a = true;
                            }
                            if (i7 != i6 && i9 == i6) {
                                if (i10 != i5 || i11 == i5) {
                                    f(2, 0, 2, 0, dVar);
                                    dVar.f4553d.e.f4694m = dVar.q();
                                    dVar.e.e.f4694m = dVar.k();
                                } else if (i11 == 2 && i10 == 2 && iArr2[0] == 1 && iArr2[i5] == 1) {
                                    f(1, (int) ((f2 * eVar.q()) + 0.5f), 1, (int) ((f3 * eVar.k()) + 0.5f), dVar);
                                    dVar.f4553d.e.d(dVar.q());
                                    dVar.e.e.d(dVar.k());
                                    dVar.f4547a = true;
                                }
                            }
                        }
                    }
                    i5 = 1;
                    i6 = 3;
                    if (i7 != i6) {
                    }
                }
            }
        }
    }

    public final void c() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        w.e eVar = this.f4681d;
        eVar.f4553d.f();
        eVar.e.f();
        arrayList.add(eVar.f4553d);
        arrayList.add(eVar.e);
        Iterator it = eVar.f4597q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            w.d dVar = (w.d) it.next();
            if (dVar instanceof w.h) {
                C0374i c0374i = new C0374i(dVar);
                dVar.f4553d.f();
                dVar.e.f();
                c0374i.f4710f = ((w.h) dVar).f4656u0;
                arrayList.add(c0374i);
            } else {
                if (dVar.x()) {
                    if (dVar.f4549b == null) {
                        dVar.f4549b = new C0368c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f4549b);
                } else {
                    arrayList.add(dVar.f4553d);
                }
                if (dVar.y()) {
                    if (dVar.f4551c == null) {
                        dVar.f4551c = new C0368c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f4551c);
                } else {
                    arrayList.add(dVar.e);
                }
                if (dVar instanceof w.i) {
                    arrayList.add(new C0375j(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((o) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            o oVar = (o) it3.next();
            if (oVar.f4707b != eVar) {
                oVar.d();
            }
        }
        ArrayList arrayList2 = this.f4684h;
        arrayList2.clear();
        w.e eVar2 = this.f4678a;
        e(eVar2.f4553d, 0, arrayList2);
        e(eVar2.e, 1, arrayList2);
        this.f4679b = false;
    }

    public final int d(w.e eVar, int i) {
        ArrayList arrayList;
        int i2;
        int i3;
        long max;
        float f2;
        w.e eVar2 = eVar;
        ArrayList arrayList2 = this.f4684h;
        int size = arrayList2.size();
        int i4 = 0;
        long j = 0;
        while (i4 < size) {
            o oVar = ((l) arrayList2.get(i4)).f4697a;
            if (!(oVar instanceof C0368c) ? !(i != 0 ? (oVar instanceof m) : (oVar instanceof k)) : ((C0368c) oVar).f4710f != i) {
                C0371f c0371f = (i == 0 ? eVar2.f4553d : eVar2.e).f4712h;
                C0371f c0371f2 = (i == 0 ? eVar2.f4553d : eVar2.e).i;
                boolean contains = oVar.f4712h.f4693l.contains(c0371f);
                C0371f c0371f3 = oVar.i;
                boolean contains2 = c0371f3.f4693l.contains(c0371f2);
                long j2 = oVar.j();
                C0371f c0371f4 = oVar.f4712h;
                if (contains && contains2) {
                    long b2 = l.b(c0371f4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long a2 = l.a(c0371f3, 0L);
                    long j3 = b2 - j2;
                    int i5 = c0371f3.f4689f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j3 >= (-i5)) {
                        j3 += i5;
                    }
                    long j4 = (-a2) - j2;
                    long j5 = c0371f4.f4689f;
                    long j6 = j4 - j5;
                    if (j6 >= j5) {
                        j6 -= j5;
                    }
                    w.d dVar = oVar.f4707b;
                    if (i == 0) {
                        f2 = dVar.f4554d0;
                    } else if (i == 1) {
                        f2 = dVar.f4555e0;
                    } else {
                        dVar.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = f2 > RecyclerView.f2111C0 ? (long) ((j3 / (1.0f - f2)) + (j6 / f2)) : 0L;
                    max = (c0371f4.f4689f + ((((long) ((f3 * f2) + 0.5f)) + j2) + ((long) (((1.0f - f2) * f3) + 0.5f)))) - c0371f3.f4689f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    max = contains ? Math.max(l.b(c0371f4, c0371f4.f4689f), c0371f4.f4689f + j2) : contains2 ? Math.max(-l.a(c0371f3, c0371f3.f4689f), (-c0371f3.f4689f) + j2) : (oVar.j() + c0371f4.f4689f) - c0371f3.f4689f;
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                max = 0;
            }
            j = Math.max(j, max);
            i4 = i3 + 1;
            eVar2 = eVar;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) j;
    }

    public final void e(o oVar, int i, ArrayList arrayList) {
        C0371f c0371f;
        Iterator it = oVar.f4712h.f4692k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c0371f = oVar.i;
            if (!hasNext) {
                break;
            }
            InterfaceC0369d interfaceC0369d = (InterfaceC0369d) it.next();
            if (interfaceC0369d instanceof C0371f) {
                a((C0371f) interfaceC0369d, i, arrayList, null);
            } else if (interfaceC0369d instanceof o) {
                a(((o) interfaceC0369d).f4712h, i, arrayList, null);
            }
        }
        Iterator it2 = c0371f.f4692k.iterator();
        while (it2.hasNext()) {
            InterfaceC0369d interfaceC0369d2 = (InterfaceC0369d) it2.next();
            if (interfaceC0369d2 instanceof C0371f) {
                a((C0371f) interfaceC0369d2, i, arrayList, null);
            } else if (interfaceC0369d2 instanceof o) {
                a(((o) interfaceC0369d2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((m) oVar).f4699k.f4692k.iterator();
            while (it3.hasNext()) {
                InterfaceC0369d interfaceC0369d3 = (InterfaceC0369d) it3.next();
                if (interfaceC0369d3 instanceof C0371f) {
                    a((C0371f) interfaceC0369d3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, w.d dVar) {
        C0367b c0367b = this.f4683g;
        c0367b.f4669a = i;
        c0367b.f4670b = i3;
        c0367b.f4671c = i2;
        c0367b.f4672d = i4;
        this.f4682f.b(dVar, c0367b);
        dVar.O(c0367b.e);
        dVar.L(c0367b.f4673f);
        dVar.f4526E = c0367b.f4675h;
        dVar.I(c0367b.f4674g);
    }

    public final void g() {
        C0366a c0366a;
        Iterator it = this.f4678a.f4597q0.iterator();
        while (it.hasNext()) {
            w.d dVar = (w.d) it.next();
            if (!dVar.f4547a) {
                int[] iArr = dVar.f4575p0;
                boolean z2 = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = dVar.f4577r;
                int i4 = dVar.f4578s;
                boolean z3 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z2 = true;
                }
                C0372g c0372g = dVar.f4553d.e;
                boolean z4 = c0372g.j;
                C0372g c0372g2 = dVar.e.e;
                boolean z5 = c0372g2.j;
                if (z4 && z5) {
                    f(1, c0372g.f4690g, 1, c0372g2.f4690g, dVar);
                    dVar.f4547a = true;
                } else if (z4 && z2) {
                    f(1, c0372g.f4690g, 2, c0372g2.f4690g, dVar);
                    if (i2 == 3) {
                        dVar.e.e.f4694m = dVar.k();
                    } else {
                        dVar.e.e.d(dVar.k());
                        dVar.f4547a = true;
                    }
                } else if (z5 && z3) {
                    f(2, c0372g.f4690g, 1, c0372g2.f4690g, dVar);
                    if (i == 3) {
                        dVar.f4553d.e.f4694m = dVar.q();
                    } else {
                        dVar.f4553d.e.d(dVar.q());
                        dVar.f4547a = true;
                    }
                }
                if (dVar.f4547a && (c0366a = dVar.e.f4700l) != null) {
                    c0366a.d(dVar.f4548a0);
                }
            }
        }
    }
}
