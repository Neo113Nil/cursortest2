package x;

import com.google.android.gms.internal.ads.Wv;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import w.C5129d;
import w.C5130e;

/* renamed from: x.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5166e {

    /* renamed from: a, reason: collision with root package name */
    public w.f f41764a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f41765b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f41766c;

    /* renamed from: d, reason: collision with root package name */
    public w.f f41767d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f41768e;

    /* renamed from: f, reason: collision with root package name */
    public z.f f41769f;

    /* renamed from: g, reason: collision with root package name */
    public C5163b f41770g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f41771h;

    public final void a(C5167f c5167f, int i, ArrayList arrayList, C5173l c5173l) {
        AbstractC5177p abstractC5177p = c5167f.f41775d;
        if (abstractC5177p.f41798c == null) {
            w.f fVar = this.f41764a;
            if (abstractC5177p == fVar.f41288d || abstractC5177p == fVar.f41290e) {
                return;
            }
            if (c5173l == null) {
                c5173l = new C5173l();
                c5173l.f41786a = null;
                c5173l.f41787b = new ArrayList();
                c5173l.f41786a = abstractC5177p;
                arrayList.add(c5173l);
            }
            abstractC5177p.f41798c = c5173l;
            c5173l.f41787b.add(abstractC5177p);
            C5167f c5167f2 = abstractC5177p.f41803h;
            Iterator it = c5167f2.f41781k.iterator();
            while (it.hasNext()) {
                InterfaceC5165d interfaceC5165d = (InterfaceC5165d) it.next();
                if (interfaceC5165d instanceof C5167f) {
                    a((C5167f) interfaceC5165d, i, arrayList, c5173l);
                }
            }
            C5167f c5167f3 = abstractC5177p.i;
            Iterator it2 = c5167f3.f41781k.iterator();
            while (it2.hasNext()) {
                InterfaceC5165d interfaceC5165d2 = (InterfaceC5165d) it2.next();
                if (interfaceC5165d2 instanceof C5167f) {
                    a((C5167f) interfaceC5165d2, i, arrayList, c5173l);
                }
            }
            if (i == 1 && (abstractC5177p instanceof C5174m)) {
                Iterator it3 = ((C5174m) abstractC5177p).f41788k.f41781k.iterator();
                while (it3.hasNext()) {
                    InterfaceC5165d interfaceC5165d3 = (InterfaceC5165d) it3.next();
                    if (interfaceC5165d3 instanceof C5167f) {
                        a((C5167f) interfaceC5165d3, i, arrayList, c5173l);
                    }
                }
            }
            Iterator it4 = c5167f2.f41782l.iterator();
            while (it4.hasNext()) {
                a((C5167f) it4.next(), i, arrayList, c5173l);
            }
            Iterator it5 = c5167f3.f41782l.iterator();
            while (it5.hasNext()) {
                a((C5167f) it5.next(), i, arrayList, c5173l);
            }
            if (i == 1 && (abstractC5177p instanceof C5174m)) {
                Iterator it6 = ((C5174m) abstractC5177p).f41788k.f41782l.iterator();
                while (it6.hasNext()) {
                    a((C5167f) it6.next(), i, arrayList, c5173l);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x026a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(w.f fVar) {
        int i;
        int i4;
        float f2;
        int i6;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Iterator it = fVar.f41333q0.iterator();
        while (it.hasNext()) {
            C5130e c5130e = (C5130e) it.next();
            int[] iArr = c5130e.f41311p0;
            int i14 = iArr[0];
            int i15 = iArr[1];
            if (c5130e.f41295g0 == 8) {
                c5130e.f41282a = true;
            } else {
                float f9 = c5130e.f41318w;
                if (f9 < 1.0f && i14 == 3) {
                    c5130e.f41313r = 2;
                }
                float f10 = c5130e.f41321z;
                if (f10 < 1.0f && i15 == 3) {
                    c5130e.f41314s = 2;
                }
                if (c5130e.f41279W > 0.0f) {
                    if (i14 == 3 && (i15 == 2 || i15 == 1)) {
                        c5130e.f41313r = 3;
                    } else if (i15 == 3 && (i14 == 2 || i14 == 1)) {
                        c5130e.f41314s = 3;
                    } else if (i14 == 3 && i15 == 3) {
                        if (c5130e.f41313r == 0) {
                            c5130e.f41313r = 3;
                        }
                        if (c5130e.f41314s == 0) {
                            c5130e.f41314s = 3;
                        }
                    }
                }
                C5129d c5129d = c5130e.f41267K;
                C5129d c5129d2 = c5130e.f41266I;
                if (i14 == 3 && c5130e.f41313r == 1 && (c5129d2.f41255f == null || c5129d.f41255f == null)) {
                    i14 = 2;
                }
                C5129d c5129d3 = c5130e.f41268L;
                C5129d c5129d4 = c5130e.J;
                if (i15 == 3 && c5130e.f41314s == 1 && (c5129d4.f41255f == null || c5129d3.f41255f == null)) {
                    i15 = 2;
                }
                C5172k c5172k = c5130e.f41288d;
                c5172k.f41799d = i14;
                int i16 = c5130e.f41313r;
                c5172k.f41796a = i16;
                C5174m c5174m = c5130e.f41290e;
                c5174m.f41799d = i15;
                int i17 = c5130e.f41314s;
                c5174m.f41796a = i17;
                if ((i14 == 4 || i14 == 1 || i14 == 2) && (i15 == 4 || i15 == 1 || i15 == 2)) {
                    int i18 = i15;
                    int q8 = c5130e.q();
                    if (i14 == 4) {
                        q8 = (fVar.q() - c5129d2.f41256g) - c5129d.f41256g;
                        i14 = 1;
                    }
                    int i19 = q8;
                    int k9 = c5130e.k();
                    if (i18 == 4) {
                        k9 = (fVar.k() - c5129d4.f41256g) - c5129d3.f41256g;
                        i18 = 1;
                    }
                    f(i14, i19, i18, k9, c5130e);
                    c5130e.f41288d.f41800e.d(c5130e.q());
                    c5130e.f41290e.f41800e.d(c5130e.k());
                    c5130e.f41282a = true;
                } else {
                    int[] iArr2 = fVar.f41311p0;
                    C5129d[] c5129dArr = c5130e.f41273Q;
                    if (i14 != 3) {
                        i = i14;
                        i4 = 2;
                        f2 = f10;
                        i6 = i15;
                    } else if (i15 != 2 && i15 != 1) {
                        i6 = i15;
                        i9 = 3;
                        i = i14;
                        i4 = 2;
                        f2 = f10;
                        if (i6 != i9) {
                        }
                        i12 = 1;
                        i13 = 3;
                        if (i11 != i13) {
                        }
                    } else if (i16 == 3) {
                        if (i15 == 2) {
                            f(2, 0, 2, 0, c5130e);
                        }
                        int k10 = c5130e.k();
                        f(1, (int) ((k10 * c5130e.f41279W) + 0.5f), 1, k10, c5130e);
                        c5130e.f41288d.f41800e.d(c5130e.q());
                        c5130e.f41290e.f41800e.d(c5130e.k());
                        c5130e.f41282a = true;
                    } else {
                        i = i14;
                        i4 = 2;
                        if (i16 == 1) {
                            f(2, 0, i15, 0, c5130e);
                            c5130e.f41288d.f41800e.f41783m = c5130e.q();
                        } else {
                            f2 = f10;
                            i6 = i15;
                            if (i16 == 2) {
                                int i20 = iArr2[0];
                                if (i20 == 1 || i20 == 4) {
                                    f(1, (int) ((f9 * fVar.q()) + 0.5f), i6, c5130e.k(), c5130e);
                                    c5130e.f41288d.f41800e.d(c5130e.q());
                                    c5130e.f41290e.f41800e.d(c5130e.k());
                                    c5130e.f41282a = true;
                                }
                            } else if (c5129dArr[0].f41255f == null || c5129dArr[1].f41255f == null) {
                                f(2, 0, i6, 0, c5130e);
                                c5130e.f41288d.f41800e.d(c5130e.q());
                                c5130e.f41290e.f41800e.d(c5130e.k());
                                c5130e.f41282a = true;
                            }
                            if (i6 != i9) {
                                int i21 = i;
                                i10 = i4;
                                i11 = i21;
                            } else if (i != i4 && i != 1) {
                                int i22 = i;
                                i10 = i4;
                                i11 = i22;
                                i13 = i9;
                                i12 = 1;
                                if (i11 != i13) {
                                    if (i16 != i12) {
                                    }
                                    f(i10, 0, i10, 0, c5130e);
                                    c5130e.f41288d.f41800e.f41783m = c5130e.q();
                                    c5130e.f41290e.f41800e.f41783m = c5130e.k();
                                }
                            } else if (i17 == i9) {
                                if (i == i4) {
                                    f(i4, 0, i4, 0, c5130e);
                                }
                                int q9 = c5130e.q();
                                float f11 = c5130e.f41279W;
                                if (c5130e.f41280X == -1) {
                                    f11 = 1.0f / f11;
                                }
                                f(1, q9, 1, (int) ((q9 * f11) + 0.5f), c5130e);
                                c5130e.f41288d.f41800e.d(c5130e.q());
                                c5130e.f41290e.f41800e.d(c5130e.k());
                                c5130e.f41282a = true;
                            } else if (i17 == 1) {
                                f(i, 0, i4, 0, c5130e);
                                c5130e.f41290e.f41800e.f41783m = c5130e.k();
                            } else {
                                int i23 = i;
                                i10 = i4;
                                if (i17 == 2) {
                                    int i24 = iArr2[1];
                                    if (i24 == 1 || i24 == 4) {
                                        f(i23, c5130e.q(), 1, (int) ((f2 * fVar.k()) + 0.5f), c5130e);
                                        c5130e.f41288d.f41800e.d(c5130e.q());
                                        c5130e.f41290e.f41800e.d(c5130e.k());
                                        c5130e.f41282a = true;
                                    } else {
                                        i11 = i23;
                                    }
                                } else {
                                    i11 = i23;
                                    if (c5129dArr[2].f41255f == null || c5129dArr[3].f41255f == null) {
                                        f(i10, 0, i6, 0, c5130e);
                                        c5130e.f41288d.f41800e.d(c5130e.q());
                                        c5130e.f41290e.f41800e.d(c5130e.k());
                                        c5130e.f41282a = true;
                                    }
                                }
                                if (i11 != i13 && i6 == i13) {
                                    if (i16 != i12 || i17 == i12) {
                                        f(i10, 0, i10, 0, c5130e);
                                        c5130e.f41288d.f41800e.f41783m = c5130e.q();
                                        c5130e.f41290e.f41800e.f41783m = c5130e.k();
                                    } else if (i17 == 2 && i16 == 2 && iArr2[0] == 1 && iArr2[i12] == 1) {
                                        f(1, (int) ((f9 * fVar.q()) + 0.5f), 1, (int) ((f2 * fVar.k()) + 0.5f), c5130e);
                                        c5130e.f41288d.f41800e.d(c5130e.q());
                                        c5130e.f41290e.f41800e.d(c5130e.k());
                                        c5130e.f41282a = true;
                                    }
                                }
                            }
                            i12 = 1;
                            i13 = 3;
                            if (i11 != i13) {
                            }
                        }
                    }
                    i9 = 3;
                    if (i6 != i9) {
                    }
                    i12 = 1;
                    i13 = 3;
                    if (i11 != i13) {
                    }
                }
            }
        }
    }

    public final void c() {
        ArrayList arrayList = this.f41768e;
        arrayList.clear();
        w.f fVar = this.f41767d;
        fVar.f41288d.f();
        fVar.f41290e.f();
        arrayList.add(fVar.f41288d);
        arrayList.add(fVar.f41290e);
        Iterator it = fVar.f41333q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C5130e c5130e = (C5130e) it.next();
            if (c5130e instanceof w.i) {
                C5170i c5170i = new C5170i(c5130e);
                c5130e.f41288d.f();
                c5130e.f41290e.f();
                c5170i.f41801f = ((w.i) c5130e).f41399u0;
                arrayList.add(c5170i);
            } else {
                if (c5130e.x()) {
                    if (c5130e.f41284b == null) {
                        c5130e.f41284b = new C5164c(c5130e, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c5130e.f41284b);
                } else {
                    arrayList.add(c5130e.f41288d);
                }
                if (c5130e.y()) {
                    if (c5130e.f41286c == null) {
                        c5130e.f41286c = new C5164c(c5130e, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c5130e.f41286c);
                } else {
                    arrayList.add(c5130e.f41290e);
                }
                if (c5130e instanceof w.j) {
                    arrayList.add(new C5171j(c5130e));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC5177p) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC5177p abstractC5177p = (AbstractC5177p) it3.next();
            if (abstractC5177p.f41797b != fVar) {
                abstractC5177p.d();
            }
        }
        ArrayList arrayList2 = this.f41771h;
        arrayList2.clear();
        w.f fVar2 = this.f41764a;
        e(fVar2.f41288d, 0, arrayList2);
        e(fVar2.f41290e, 1, arrayList2);
        this.f41765b = false;
    }

    public final int d(w.f fVar, int i) {
        ArrayList arrayList;
        int i4;
        int i6;
        long max;
        float f2;
        w.f fVar2 = fVar;
        ArrayList arrayList2 = this.f41771h;
        int size = arrayList2.size();
        int i9 = 0;
        long j6 = 0;
        while (i9 < size) {
            AbstractC5177p abstractC5177p = ((C5173l) arrayList2.get(i9)).f41786a;
            if (!(abstractC5177p instanceof C5164c) ? !(i != 0 ? (abstractC5177p instanceof C5174m) : (abstractC5177p instanceof C5172k)) : ((C5164c) abstractC5177p).f41801f != i) {
                C5167f c5167f = (i == 0 ? fVar2.f41288d : fVar2.f41290e).f41803h;
                C5167f c5167f2 = (i == 0 ? fVar2.f41288d : fVar2.f41290e).i;
                boolean contains = abstractC5177p.f41803h.f41782l.contains(c5167f);
                C5167f c5167f3 = abstractC5177p.i;
                boolean contains2 = c5167f3.f41782l.contains(c5167f2);
                long j9 = abstractC5177p.j();
                C5167f c5167f4 = abstractC5177p.f41803h;
                if (contains && contains2) {
                    long b9 = C5173l.b(c5167f4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i4 = size;
                    long a9 = C5173l.a(c5167f3, 0L);
                    long j10 = b9 - j9;
                    int i10 = c5167f3.f41777f;
                    arrayList = arrayList3;
                    i6 = i9;
                    if (j10 >= (-i10)) {
                        j10 += i10;
                    }
                    long j11 = (-a9) - j9;
                    long j12 = c5167f4.f41777f;
                    long j13 = j11 - j12;
                    if (j13 >= j12) {
                        j13 -= j12;
                    }
                    C5130e c5130e = abstractC5177p.f41797b;
                    if (i == 0) {
                        f2 = c5130e.f41289d0;
                    } else if (i == 1) {
                        f2 = c5130e.f41291e0;
                    } else {
                        c5130e.getClass();
                        f2 = -1.0f;
                    }
                    float f9 = f2 > 0.0f ? (long) ((j10 / (1.0f - f2)) + (j13 / f2)) : 0L;
                    max = (c5167f4.f41777f + ((((long) ((f9 * f2) + 0.5f)) + j9) + ((long) Wv.a(1.0f, f2, f9, 0.5f)))) - c5167f3.f41777f;
                } else {
                    arrayList = arrayList2;
                    i4 = size;
                    i6 = i9;
                    max = contains ? Math.max(C5173l.b(c5167f4, c5167f4.f41777f), c5167f4.f41777f + j9) : contains2 ? Math.max(-C5173l.a(c5167f3, c5167f3.f41777f), (-c5167f3.f41777f) + j9) : (abstractC5177p.j() + c5167f4.f41777f) - c5167f3.f41777f;
                }
            } else {
                arrayList = arrayList2;
                i4 = size;
                i6 = i9;
                max = 0;
            }
            j6 = Math.max(j6, max);
            i9 = i6 + 1;
            fVar2 = fVar;
            size = i4;
            arrayList2 = arrayList;
        }
        return (int) j6;
    }

    public final void e(AbstractC5177p abstractC5177p, int i, ArrayList arrayList) {
        C5167f c5167f;
        Iterator it = abstractC5177p.f41803h.f41781k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c5167f = abstractC5177p.i;
            if (!hasNext) {
                break;
            }
            InterfaceC5165d interfaceC5165d = (InterfaceC5165d) it.next();
            if (interfaceC5165d instanceof C5167f) {
                a((C5167f) interfaceC5165d, i, arrayList, null);
            } else if (interfaceC5165d instanceof AbstractC5177p) {
                a(((AbstractC5177p) interfaceC5165d).f41803h, i, arrayList, null);
            }
        }
        Iterator it2 = c5167f.f41781k.iterator();
        while (it2.hasNext()) {
            InterfaceC5165d interfaceC5165d2 = (InterfaceC5165d) it2.next();
            if (interfaceC5165d2 instanceof C5167f) {
                a((C5167f) interfaceC5165d2, i, arrayList, null);
            } else if (interfaceC5165d2 instanceof AbstractC5177p) {
                a(((AbstractC5177p) interfaceC5165d2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((C5174m) abstractC5177p).f41788k.f41781k.iterator();
            while (it3.hasNext()) {
                InterfaceC5165d interfaceC5165d3 = (InterfaceC5165d) it3.next();
                if (interfaceC5165d3 instanceof C5167f) {
                    a((C5167f) interfaceC5165d3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i4, int i6, int i9, C5130e c5130e) {
        C5163b c5163b = this.f41770g;
        c5163b.f41753a = i;
        c5163b.f41754b = i6;
        c5163b.f41755c = i4;
        c5163b.f41756d = i9;
        this.f41769f.b(c5130e, c5163b);
        c5130e.O(c5163b.f41757e);
        c5130e.L(c5163b.f41758f);
        c5130e.f41262E = c5163b.f41760h;
        c5130e.I(c5163b.f41759g);
    }

    public final void g() {
        C5162a c5162a;
        Iterator it = this.f41764a.f41333q0.iterator();
        while (it.hasNext()) {
            C5130e c5130e = (C5130e) it.next();
            if (!c5130e.f41282a) {
                int[] iArr = c5130e.f41311p0;
                boolean z6 = false;
                int i = iArr[0];
                int i4 = iArr[1];
                int i6 = c5130e.f41313r;
                int i9 = c5130e.f41314s;
                boolean z9 = i == 2 || (i == 3 && i6 == 1);
                if (i4 == 2 || (i4 == 3 && i9 == 1)) {
                    z6 = true;
                }
                C5168g c5168g = c5130e.f41288d.f41800e;
                boolean z10 = c5168g.f41780j;
                C5168g c5168g2 = c5130e.f41290e.f41800e;
                boolean z11 = c5168g2.f41780j;
                boolean z12 = z9;
                if (z10 && z11) {
                    f(1, c5168g.f41778g, 1, c5168g2.f41778g, c5130e);
                    c5130e.f41282a = true;
                } else if (z10 && z6) {
                    f(1, c5168g.f41778g, 2, c5168g2.f41778g, c5130e);
                    if (i4 == 3) {
                        c5130e.f41290e.f41800e.f41783m = c5130e.k();
                    } else {
                        c5130e.f41290e.f41800e.d(c5130e.k());
                        c5130e.f41282a = true;
                    }
                } else if (z11 && z12) {
                    f(2, c5168g.f41778g, 1, c5168g2.f41778g, c5130e);
                    if (i == 3) {
                        c5130e.f41288d.f41800e.f41783m = c5130e.q();
                    } else {
                        c5130e.f41288d.f41800e.d(c5130e.q());
                        c5130e.f41282a = true;
                    }
                }
                if (c5130e.f41282a && (c5162a = c5130e.f41290e.f41789l) != null) {
                    c5162a.d(c5130e.f41283a0);
                }
            }
        }
    }
}
