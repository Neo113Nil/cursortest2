package x;

import com.google.android.gms.internal.ads.CL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import w.C5143c;
import w.C5144d;
import w.C5145e;

/* renamed from: x.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5188e {

    /* renamed from: a, reason: collision with root package name */
    public C5145e f41725a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f41726b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f41727c;

    /* renamed from: d, reason: collision with root package name */
    public C5145e f41728d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f41729e;

    /* renamed from: f, reason: collision with root package name */
    public z.f f41730f;

    /* renamed from: g, reason: collision with root package name */
    public C5185b f41731g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f41732h;

    public final void a(C5189f c5189f, int i, ArrayList arrayList, C5195l c5195l) {
        AbstractC5199p abstractC5199p = c5189f.f41736d;
        if (abstractC5199p.f41759c == null) {
            C5145e c5145e = this.f41725a;
            if (abstractC5199p == c5145e.f41444d || abstractC5199p == c5145e.f41446e) {
                return;
            }
            if (c5195l == null) {
                c5195l = new C5195l();
                c5195l.f41747a = null;
                c5195l.f41748b = new ArrayList();
                c5195l.f41747a = abstractC5199p;
                arrayList.add(c5195l);
            }
            abstractC5199p.f41759c = c5195l;
            c5195l.f41748b.add(abstractC5199p);
            C5189f c5189f2 = abstractC5199p.f41764h;
            Iterator it = c5189f2.f41742k.iterator();
            while (it.hasNext()) {
                InterfaceC5187d interfaceC5187d = (InterfaceC5187d) it.next();
                if (interfaceC5187d instanceof C5189f) {
                    a((C5189f) interfaceC5187d, i, arrayList, c5195l);
                }
            }
            C5189f c5189f3 = abstractC5199p.i;
            Iterator it2 = c5189f3.f41742k.iterator();
            while (it2.hasNext()) {
                InterfaceC5187d interfaceC5187d2 = (InterfaceC5187d) it2.next();
                if (interfaceC5187d2 instanceof C5189f) {
                    a((C5189f) interfaceC5187d2, i, arrayList, c5195l);
                }
            }
            if (i == 1 && (abstractC5199p instanceof C5196m)) {
                Iterator it3 = ((C5196m) abstractC5199p).f41749k.f41742k.iterator();
                while (it3.hasNext()) {
                    InterfaceC5187d interfaceC5187d3 = (InterfaceC5187d) it3.next();
                    if (interfaceC5187d3 instanceof C5189f) {
                        a((C5189f) interfaceC5187d3, i, arrayList, c5195l);
                    }
                }
            }
            Iterator it4 = c5189f2.f41743l.iterator();
            while (it4.hasNext()) {
                a((C5189f) it4.next(), i, arrayList, c5195l);
            }
            Iterator it5 = c5189f3.f41743l.iterator();
            while (it5.hasNext()) {
                a((C5189f) it5.next(), i, arrayList, c5195l);
            }
            if (i == 1 && (abstractC5199p instanceof C5196m)) {
                Iterator it6 = ((C5196m) abstractC5199p).f41749k.f41743l.iterator();
                while (it6.hasNext()) {
                    a((C5189f) it6.next(), i, arrayList, c5195l);
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
    public final void b(C5145e c5145e) {
        int i;
        int i4;
        float f6;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Iterator it = c5145e.f41489q0.iterator();
        while (it.hasNext()) {
            C5144d c5144d = (C5144d) it.next();
            int[] iArr = c5144d.f41467p0;
            int i15 = iArr[0];
            int i16 = iArr[1];
            if (c5144d.f41451g0 == 8) {
                c5144d.f41438a = true;
            } else {
                float f9 = c5144d.f41474w;
                if (f9 < 1.0f && i15 == 3) {
                    c5144d.f41469r = 2;
                }
                float f10 = c5144d.f41477z;
                if (f10 < 1.0f && i16 == 3) {
                    c5144d.f41470s = 2;
                }
                if (c5144d.f41435W > 0.0f) {
                    if (i15 == 3 && (i16 == 2 || i16 == 1)) {
                        c5144d.f41469r = 3;
                    } else if (i16 == 3 && (i15 == 2 || i15 == 1)) {
                        c5144d.f41470s = 3;
                    } else if (i15 == 3 && i16 == 3) {
                        if (c5144d.f41469r == 0) {
                            c5144d.f41469r = 3;
                        }
                        if (c5144d.f41470s == 0) {
                            c5144d.f41470s = 3;
                        }
                    }
                }
                C5143c c5143c = c5144d.f41423K;
                C5143c c5143c2 = c5144d.f41422I;
                if (i15 == 3 && c5144d.f41469r == 1 && (c5143c2.f41411f == null || c5143c.f41411f == null)) {
                    i15 = 2;
                }
                C5143c c5143c3 = c5144d.f41424L;
                C5143c c5143c4 = c5144d.J;
                if (i16 == 3 && c5144d.f41470s == 1 && (c5143c4.f41411f == null || c5143c3.f41411f == null)) {
                    i16 = 2;
                }
                C5194k c5194k = c5144d.f41444d;
                c5194k.f41760d = i15;
                int i17 = c5144d.f41469r;
                c5194k.f41757a = i17;
                C5196m c5196m = c5144d.f41446e;
                c5196m.f41760d = i16;
                int i18 = c5144d.f41470s;
                c5196m.f41757a = i18;
                if ((i15 == 4 || i15 == 1 || i15 == 2) && (i16 == 4 || i16 == 1 || i16 == 2)) {
                    int i19 = i16;
                    int q6 = c5144d.q();
                    if (i15 == 4) {
                        q6 = (c5145e.q() - c5143c2.f41412g) - c5143c.f41412g;
                        i15 = 1;
                    }
                    int i20 = q6;
                    int k6 = c5144d.k();
                    if (i19 == 4) {
                        k6 = (c5145e.k() - c5143c4.f41412g) - c5143c3.f41412g;
                        i19 = 1;
                    }
                    f(i15, i20, i19, k6, c5144d);
                    c5144d.f41444d.f41761e.d(c5144d.q());
                    c5144d.f41446e.f41761e.d(c5144d.k());
                    c5144d.f41438a = true;
                } else {
                    int[] iArr2 = c5145e.f41467p0;
                    C5143c[] c5143cArr = c5144d.f41429Q;
                    if (i15 != 3) {
                        i = i15;
                        i4 = 2;
                        f6 = f10;
                        i9 = i16;
                    } else if (i16 != 2 && i16 != 1) {
                        i9 = i16;
                        i10 = 3;
                        i = i15;
                        i4 = 2;
                        f6 = f10;
                        if (i9 != i10) {
                        }
                        i13 = 1;
                        i14 = 3;
                        if (i12 != i14) {
                        }
                    } else if (i17 == 3) {
                        if (i16 == 2) {
                            f(2, 0, 2, 0, c5144d);
                        }
                        int k9 = c5144d.k();
                        f(1, (int) ((k9 * c5144d.f41435W) + 0.5f), 1, k9, c5144d);
                        c5144d.f41444d.f41761e.d(c5144d.q());
                        c5144d.f41446e.f41761e.d(c5144d.k());
                        c5144d.f41438a = true;
                    } else {
                        i = i15;
                        i4 = 2;
                        if (i17 == 1) {
                            f(2, 0, i16, 0, c5144d);
                            c5144d.f41444d.f41761e.f41744m = c5144d.q();
                        } else {
                            f6 = f10;
                            i9 = i16;
                            if (i17 == 2) {
                                int i21 = iArr2[0];
                                if (i21 == 1 || i21 == 4) {
                                    f(1, (int) ((f9 * c5145e.q()) + 0.5f), i9, c5144d.k(), c5144d);
                                    c5144d.f41444d.f41761e.d(c5144d.q());
                                    c5144d.f41446e.f41761e.d(c5144d.k());
                                    c5144d.f41438a = true;
                                }
                            } else if (c5143cArr[0].f41411f == null || c5143cArr[1].f41411f == null) {
                                f(2, 0, i9, 0, c5144d);
                                c5144d.f41444d.f41761e.d(c5144d.q());
                                c5144d.f41446e.f41761e.d(c5144d.k());
                                c5144d.f41438a = true;
                            }
                            if (i9 != i10) {
                                int i22 = i;
                                i11 = i4;
                                i12 = i22;
                            } else if (i != i4 && i != 1) {
                                int i23 = i;
                                i11 = i4;
                                i12 = i23;
                                i14 = i10;
                                i13 = 1;
                                if (i12 != i14) {
                                    if (i17 != i13) {
                                    }
                                    f(i11, 0, i11, 0, c5144d);
                                    c5144d.f41444d.f41761e.f41744m = c5144d.q();
                                    c5144d.f41446e.f41761e.f41744m = c5144d.k();
                                }
                            } else if (i18 == i10) {
                                if (i == i4) {
                                    f(i4, 0, i4, 0, c5144d);
                                }
                                int q9 = c5144d.q();
                                float f11 = c5144d.f41435W;
                                if (c5144d.f41436X == -1) {
                                    f11 = 1.0f / f11;
                                }
                                f(1, q9, 1, (int) ((q9 * f11) + 0.5f), c5144d);
                                c5144d.f41444d.f41761e.d(c5144d.q());
                                c5144d.f41446e.f41761e.d(c5144d.k());
                                c5144d.f41438a = true;
                            } else if (i18 == 1) {
                                f(i, 0, i4, 0, c5144d);
                                c5144d.f41446e.f41761e.f41744m = c5144d.k();
                            } else {
                                int i24 = i;
                                i11 = i4;
                                if (i18 == 2) {
                                    int i25 = iArr2[1];
                                    if (i25 == 1 || i25 == 4) {
                                        f(i24, c5144d.q(), 1, (int) ((f6 * c5145e.k()) + 0.5f), c5144d);
                                        c5144d.f41444d.f41761e.d(c5144d.q());
                                        c5144d.f41446e.f41761e.d(c5144d.k());
                                        c5144d.f41438a = true;
                                    } else {
                                        i12 = i24;
                                    }
                                } else {
                                    i12 = i24;
                                    if (c5143cArr[2].f41411f == null || c5143cArr[3].f41411f == null) {
                                        f(i11, 0, i9, 0, c5144d);
                                        c5144d.f41444d.f41761e.d(c5144d.q());
                                        c5144d.f41446e.f41761e.d(c5144d.k());
                                        c5144d.f41438a = true;
                                    }
                                }
                                if (i12 != i14 && i9 == i14) {
                                    if (i17 != i13 || i18 == i13) {
                                        f(i11, 0, i11, 0, c5144d);
                                        c5144d.f41444d.f41761e.f41744m = c5144d.q();
                                        c5144d.f41446e.f41761e.f41744m = c5144d.k();
                                    } else if (i18 == 2 && i17 == 2 && iArr2[0] == 1 && iArr2[i13] == 1) {
                                        f(1, (int) ((f9 * c5145e.q()) + 0.5f), 1, (int) ((f6 * c5145e.k()) + 0.5f), c5144d);
                                        c5144d.f41444d.f41761e.d(c5144d.q());
                                        c5144d.f41446e.f41761e.d(c5144d.k());
                                        c5144d.f41438a = true;
                                    }
                                }
                            }
                            i13 = 1;
                            i14 = 3;
                            if (i12 != i14) {
                            }
                        }
                    }
                    i10 = 3;
                    if (i9 != i10) {
                    }
                    i13 = 1;
                    i14 = 3;
                    if (i12 != i14) {
                    }
                }
            }
        }
    }

    public final void c() {
        ArrayList arrayList = this.f41729e;
        arrayList.clear();
        C5145e c5145e = this.f41728d;
        c5145e.f41444d.f();
        c5145e.f41446e.f();
        arrayList.add(c5145e.f41444d);
        arrayList.add(c5145e.f41446e);
        Iterator it = c5145e.f41489q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C5144d c5144d = (C5144d) it.next();
            if (c5144d instanceof w.h) {
                C5192i c5192i = new C5192i(c5144d);
                c5144d.f41444d.f();
                c5144d.f41446e.f();
                c5192i.f41762f = ((w.h) c5144d).f41555u0;
                arrayList.add(c5192i);
            } else {
                if (c5144d.x()) {
                    if (c5144d.f41440b == null) {
                        c5144d.f41440b = new C5186c(c5144d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c5144d.f41440b);
                } else {
                    arrayList.add(c5144d.f41444d);
                }
                if (c5144d.y()) {
                    if (c5144d.f41442c == null) {
                        c5144d.f41442c = new C5186c(c5144d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c5144d.f41442c);
                } else {
                    arrayList.add(c5144d.f41446e);
                }
                if (c5144d instanceof w.i) {
                    arrayList.add(new C5193j(c5144d));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC5199p) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC5199p abstractC5199p = (AbstractC5199p) it3.next();
            if (abstractC5199p.f41758b != c5145e) {
                abstractC5199p.d();
            }
        }
        ArrayList arrayList2 = this.f41732h;
        arrayList2.clear();
        C5145e c5145e2 = this.f41725a;
        e(c5145e2.f41444d, 0, arrayList2);
        e(c5145e2.f41446e, 1, arrayList2);
        this.f41726b = false;
    }

    public final int d(C5145e c5145e, int i) {
        ArrayList arrayList;
        int i4;
        int i9;
        long max;
        float f6;
        C5145e c5145e2 = c5145e;
        ArrayList arrayList2 = this.f41732h;
        int size = arrayList2.size();
        int i10 = 0;
        long j9 = 0;
        while (i10 < size) {
            AbstractC5199p abstractC5199p = ((C5195l) arrayList2.get(i10)).f41747a;
            if (!(abstractC5199p instanceof C5186c) ? !(i != 0 ? (abstractC5199p instanceof C5196m) : (abstractC5199p instanceof C5194k)) : ((C5186c) abstractC5199p).f41762f != i) {
                C5189f c5189f = (i == 0 ? c5145e2.f41444d : c5145e2.f41446e).f41764h;
                C5189f c5189f2 = (i == 0 ? c5145e2.f41444d : c5145e2.f41446e).i;
                boolean contains = abstractC5199p.f41764h.f41743l.contains(c5189f);
                C5189f c5189f3 = abstractC5199p.i;
                boolean contains2 = c5189f3.f41743l.contains(c5189f2);
                long j10 = abstractC5199p.j();
                C5189f c5189f4 = abstractC5199p.f41764h;
                if (contains && contains2) {
                    long b9 = C5195l.b(c5189f4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i4 = size;
                    long a9 = C5195l.a(c5189f3, 0L);
                    long j11 = b9 - j10;
                    int i11 = c5189f3.f41738f;
                    arrayList = arrayList3;
                    i9 = i10;
                    if (j11 >= (-i11)) {
                        j11 += i11;
                    }
                    long j12 = (-a9) - j10;
                    long j13 = c5189f4.f41738f;
                    long j14 = j12 - j13;
                    if (j14 >= j13) {
                        j14 -= j13;
                    }
                    C5144d c5144d = abstractC5199p.f41758b;
                    if (i == 0) {
                        f6 = c5144d.f41445d0;
                    } else if (i == 1) {
                        f6 = c5144d.f41447e0;
                    } else {
                        c5144d.getClass();
                        f6 = -1.0f;
                    }
                    float f9 = f6 > 0.0f ? (long) ((j11 / (1.0f - f6)) + (j14 / f6)) : 0L;
                    max = (c5189f4.f41738f + ((((long) ((f9 * f6) + 0.5f)) + j10) + ((long) CL.a(1.0f, f6, f9, 0.5f)))) - c5189f3.f41738f;
                } else {
                    arrayList = arrayList2;
                    i4 = size;
                    i9 = i10;
                    max = contains ? Math.max(C5195l.b(c5189f4, c5189f4.f41738f), c5189f4.f41738f + j10) : contains2 ? Math.max(-C5195l.a(c5189f3, c5189f3.f41738f), (-c5189f3.f41738f) + j10) : (abstractC5199p.j() + c5189f4.f41738f) - c5189f3.f41738f;
                }
            } else {
                arrayList = arrayList2;
                i4 = size;
                i9 = i10;
                max = 0;
            }
            j9 = Math.max(j9, max);
            i10 = i9 + 1;
            c5145e2 = c5145e;
            size = i4;
            arrayList2 = arrayList;
        }
        return (int) j9;
    }

    public final void e(AbstractC5199p abstractC5199p, int i, ArrayList arrayList) {
        C5189f c5189f;
        Iterator it = abstractC5199p.f41764h.f41742k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c5189f = abstractC5199p.i;
            if (!hasNext) {
                break;
            }
            InterfaceC5187d interfaceC5187d = (InterfaceC5187d) it.next();
            if (interfaceC5187d instanceof C5189f) {
                a((C5189f) interfaceC5187d, i, arrayList, null);
            } else if (interfaceC5187d instanceof AbstractC5199p) {
                a(((AbstractC5199p) interfaceC5187d).f41764h, i, arrayList, null);
            }
        }
        Iterator it2 = c5189f.f41742k.iterator();
        while (it2.hasNext()) {
            InterfaceC5187d interfaceC5187d2 = (InterfaceC5187d) it2.next();
            if (interfaceC5187d2 instanceof C5189f) {
                a((C5189f) interfaceC5187d2, i, arrayList, null);
            } else if (interfaceC5187d2 instanceof AbstractC5199p) {
                a(((AbstractC5199p) interfaceC5187d2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((C5196m) abstractC5199p).f41749k.f41742k.iterator();
            while (it3.hasNext()) {
                InterfaceC5187d interfaceC5187d3 = (InterfaceC5187d) it3.next();
                if (interfaceC5187d3 instanceof C5189f) {
                    a((C5189f) interfaceC5187d3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i4, int i9, int i10, C5144d c5144d) {
        C5185b c5185b = this.f41731g;
        c5185b.f41714a = i;
        c5185b.f41715b = i9;
        c5185b.f41716c = i4;
        c5185b.f41717d = i10;
        this.f41730f.b(c5144d, c5185b);
        c5144d.O(c5185b.f41718e);
        c5144d.L(c5185b.f41719f);
        c5144d.f41418E = c5185b.f41721h;
        c5144d.I(c5185b.f41720g);
    }

    public final void g() {
        C5184a c5184a;
        Iterator it = this.f41725a.f41489q0.iterator();
        while (it.hasNext()) {
            C5144d c5144d = (C5144d) it.next();
            if (!c5144d.f41438a) {
                int[] iArr = c5144d.f41467p0;
                boolean z8 = false;
                int i = iArr[0];
                int i4 = iArr[1];
                int i9 = c5144d.f41469r;
                int i10 = c5144d.f41470s;
                boolean z9 = i == 2 || (i == 3 && i9 == 1);
                if (i4 == 2 || (i4 == 3 && i10 == 1)) {
                    z8 = true;
                }
                C5190g c5190g = c5144d.f41444d.f41761e;
                boolean z10 = c5190g.f41741j;
                C5190g c5190g2 = c5144d.f41446e.f41761e;
                boolean z11 = c5190g2.f41741j;
                boolean z12 = z9;
                if (z10 && z11) {
                    f(1, c5190g.f41739g, 1, c5190g2.f41739g, c5144d);
                    c5144d.f41438a = true;
                } else if (z10 && z8) {
                    f(1, c5190g.f41739g, 2, c5190g2.f41739g, c5144d);
                    if (i4 == 3) {
                        c5144d.f41446e.f41761e.f41744m = c5144d.k();
                    } else {
                        c5144d.f41446e.f41761e.d(c5144d.k());
                        c5144d.f41438a = true;
                    }
                } else if (z11 && z12) {
                    f(2, c5190g.f41739g, 1, c5190g2.f41739g, c5144d);
                    if (i == 3) {
                        c5144d.f41444d.f41761e.f41744m = c5144d.q();
                    } else {
                        c5144d.f41444d.f41761e.d(c5144d.q());
                        c5144d.f41438a = true;
                    }
                }
                if (c5144d.f41438a && (c5184a = c5144d.f41446e.f41750l) != null) {
                    c5184a.d(c5144d.f41439a0);
                }
            }
        }
    }
}
