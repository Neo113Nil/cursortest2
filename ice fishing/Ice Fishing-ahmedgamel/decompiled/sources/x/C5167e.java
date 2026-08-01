package x;

import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import w.C5138c;
import w.C5139d;
import w.C5140e;

/* renamed from: x.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5167e {

    /* renamed from: a, reason: collision with root package name */
    public C5140e f41709a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f41710b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f41711c;

    /* renamed from: d, reason: collision with root package name */
    public C5140e f41712d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f41713e;

    /* renamed from: f, reason: collision with root package name */
    public z.f f41714f;

    /* renamed from: g, reason: collision with root package name */
    public C5164b f41715g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f41716h;

    public final void a(C5168f c5168f, int i, ArrayList arrayList, C5174l c5174l) {
        AbstractC5178p abstractC5178p = c5168f.f41720d;
        if (abstractC5178p.f41743c == null) {
            C5140e c5140e = this.f41709a;
            if (abstractC5178p == c5140e.f41509d || abstractC5178p == c5140e.f41511e) {
                return;
            }
            if (c5174l == null) {
                c5174l = new C5174l();
                c5174l.f41731a = null;
                c5174l.f41732b = new ArrayList();
                c5174l.f41731a = abstractC5178p;
                arrayList.add(c5174l);
            }
            abstractC5178p.f41743c = c5174l;
            c5174l.f41732b.add(abstractC5178p);
            C5168f c5168f2 = abstractC5178p.f41748h;
            Iterator it = c5168f2.f41726k.iterator();
            while (it.hasNext()) {
                InterfaceC5166d interfaceC5166d = (InterfaceC5166d) it.next();
                if (interfaceC5166d instanceof C5168f) {
                    a((C5168f) interfaceC5166d, i, arrayList, c5174l);
                }
            }
            C5168f c5168f3 = abstractC5178p.i;
            Iterator it2 = c5168f3.f41726k.iterator();
            while (it2.hasNext()) {
                InterfaceC5166d interfaceC5166d2 = (InterfaceC5166d) it2.next();
                if (interfaceC5166d2 instanceof C5168f) {
                    a((C5168f) interfaceC5166d2, i, arrayList, c5174l);
                }
            }
            if (i == 1 && (abstractC5178p instanceof C5175m)) {
                Iterator it3 = ((C5175m) abstractC5178p).f41733k.f41726k.iterator();
                while (it3.hasNext()) {
                    InterfaceC5166d interfaceC5166d3 = (InterfaceC5166d) it3.next();
                    if (interfaceC5166d3 instanceof C5168f) {
                        a((C5168f) interfaceC5166d3, i, arrayList, c5174l);
                    }
                }
            }
            Iterator it4 = c5168f2.f41727l.iterator();
            while (it4.hasNext()) {
                a((C5168f) it4.next(), i, arrayList, c5174l);
            }
            Iterator it5 = c5168f3.f41727l.iterator();
            while (it5.hasNext()) {
                a((C5168f) it5.next(), i, arrayList, c5174l);
            }
            if (i == 1 && (abstractC5178p instanceof C5175m)) {
                Iterator it6 = ((C5175m) abstractC5178p).f41733k.f41727l.iterator();
                while (it6.hasNext()) {
                    a((C5168f) it6.next(), i, arrayList, c5174l);
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
    public final void b(C5140e c5140e) {
        int i;
        int i6;
        float f3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Iterator it = c5140e.f41554q0.iterator();
        while (it.hasNext()) {
            C5139d c5139d = (C5139d) it.next();
            int[] iArr = c5139d.f41532p0;
            int i15 = iArr[0];
            int i16 = iArr[1];
            if (c5139d.f41516g0 == 8) {
                c5139d.f41503a = true;
            } else {
                float f9 = c5139d.f41539w;
                if (f9 < 1.0f && i15 == 3) {
                    c5139d.f41534r = 2;
                }
                float f10 = c5139d.f41542z;
                if (f10 < 1.0f && i16 == 3) {
                    c5139d.f41535s = 2;
                }
                if (c5139d.f41500W > 0.0f) {
                    if (i15 == 3 && (i16 == 2 || i16 == 1)) {
                        c5139d.f41534r = 3;
                    } else if (i16 == 3 && (i15 == 2 || i15 == 1)) {
                        c5139d.f41535s = 3;
                    } else if (i15 == 3 && i16 == 3) {
                        if (c5139d.f41534r == 0) {
                            c5139d.f41534r = 3;
                        }
                        if (c5139d.f41535s == 0) {
                            c5139d.f41535s = 3;
                        }
                    }
                }
                C5138c c5138c = c5139d.f41488K;
                C5138c c5138c2 = c5139d.f41487I;
                if (i15 == 3 && c5139d.f41534r == 1 && (c5138c2.f41476f == null || c5138c.f41476f == null)) {
                    i15 = 2;
                }
                C5138c c5138c3 = c5139d.f41489L;
                C5138c c5138c4 = c5139d.J;
                if (i16 == 3 && c5139d.f41535s == 1 && (c5138c4.f41476f == null || c5138c3.f41476f == null)) {
                    i16 = 2;
                }
                C5173k c5173k = c5139d.f41509d;
                c5173k.f41744d = i15;
                int i17 = c5139d.f41534r;
                c5173k.f41741a = i17;
                C5175m c5175m = c5139d.f41511e;
                c5175m.f41744d = i16;
                int i18 = c5139d.f41535s;
                c5175m.f41741a = i18;
                if ((i15 == 4 || i15 == 1 || i15 == 2) && (i16 == 4 || i16 == 1 || i16 == 2)) {
                    int i19 = i16;
                    int q8 = c5139d.q();
                    if (i15 == 4) {
                        q8 = (c5140e.q() - c5138c2.f41477g) - c5138c.f41477g;
                        i15 = 1;
                    }
                    int i20 = q8;
                    int k9 = c5139d.k();
                    if (i19 == 4) {
                        k9 = (c5140e.k() - c5138c4.f41477g) - c5138c3.f41477g;
                        i19 = 1;
                    }
                    f(i15, i20, i19, k9, c5139d);
                    c5139d.f41509d.f41745e.d(c5139d.q());
                    c5139d.f41511e.f41745e.d(c5139d.k());
                    c5139d.f41503a = true;
                } else {
                    int[] iArr2 = c5140e.f41532p0;
                    C5138c[] c5138cArr = c5139d.f41494Q;
                    if (i15 != 3) {
                        i = i15;
                        i6 = 2;
                        f3 = f10;
                        i9 = i16;
                    } else if (i16 != 2 && i16 != 1) {
                        i9 = i16;
                        i10 = 3;
                        i = i15;
                        i6 = 2;
                        f3 = f10;
                        if (i9 != i10) {
                        }
                        i13 = 1;
                        i14 = 3;
                        if (i12 != i14) {
                        }
                    } else if (i17 == 3) {
                        if (i16 == 2) {
                            f(2, 0, 2, 0, c5139d);
                        }
                        int k10 = c5139d.k();
                        f(1, (int) ((k10 * c5139d.f41500W) + 0.5f), 1, k10, c5139d);
                        c5139d.f41509d.f41745e.d(c5139d.q());
                        c5139d.f41511e.f41745e.d(c5139d.k());
                        c5139d.f41503a = true;
                    } else {
                        i = i15;
                        i6 = 2;
                        if (i17 == 1) {
                            f(2, 0, i16, 0, c5139d);
                            c5139d.f41509d.f41745e.f41728m = c5139d.q();
                        } else {
                            f3 = f10;
                            i9 = i16;
                            if (i17 == 2) {
                                int i21 = iArr2[0];
                                if (i21 == 1 || i21 == 4) {
                                    f(1, (int) ((f9 * c5140e.q()) + 0.5f), i9, c5139d.k(), c5139d);
                                    c5139d.f41509d.f41745e.d(c5139d.q());
                                    c5139d.f41511e.f41745e.d(c5139d.k());
                                    c5139d.f41503a = true;
                                }
                            } else if (c5138cArr[0].f41476f == null || c5138cArr[1].f41476f == null) {
                                f(2, 0, i9, 0, c5139d);
                                c5139d.f41509d.f41745e.d(c5139d.q());
                                c5139d.f41511e.f41745e.d(c5139d.k());
                                c5139d.f41503a = true;
                            }
                            if (i9 != i10) {
                                int i22 = i;
                                i11 = i6;
                                i12 = i22;
                            } else if (i != i6 && i != 1) {
                                int i23 = i;
                                i11 = i6;
                                i12 = i23;
                                i14 = i10;
                                i13 = 1;
                                if (i12 != i14) {
                                    if (i17 != i13) {
                                    }
                                    f(i11, 0, i11, 0, c5139d);
                                    c5139d.f41509d.f41745e.f41728m = c5139d.q();
                                    c5139d.f41511e.f41745e.f41728m = c5139d.k();
                                }
                            } else if (i18 == i10) {
                                if (i == i6) {
                                    f(i6, 0, i6, 0, c5139d);
                                }
                                int q9 = c5139d.q();
                                float f11 = c5139d.f41500W;
                                if (c5139d.f41501X == -1) {
                                    f11 = 1.0f / f11;
                                }
                                f(1, q9, 1, (int) ((q9 * f11) + 0.5f), c5139d);
                                c5139d.f41509d.f41745e.d(c5139d.q());
                                c5139d.f41511e.f41745e.d(c5139d.k());
                                c5139d.f41503a = true;
                            } else if (i18 == 1) {
                                f(i, 0, i6, 0, c5139d);
                                c5139d.f41511e.f41745e.f41728m = c5139d.k();
                            } else {
                                int i24 = i;
                                i11 = i6;
                                if (i18 == 2) {
                                    int i25 = iArr2[1];
                                    if (i25 == 1 || i25 == 4) {
                                        f(i24, c5139d.q(), 1, (int) ((f3 * c5140e.k()) + 0.5f), c5139d);
                                        c5139d.f41509d.f41745e.d(c5139d.q());
                                        c5139d.f41511e.f41745e.d(c5139d.k());
                                        c5139d.f41503a = true;
                                    } else {
                                        i12 = i24;
                                    }
                                } else {
                                    i12 = i24;
                                    if (c5138cArr[2].f41476f == null || c5138cArr[3].f41476f == null) {
                                        f(i11, 0, i9, 0, c5139d);
                                        c5139d.f41509d.f41745e.d(c5139d.q());
                                        c5139d.f41511e.f41745e.d(c5139d.k());
                                        c5139d.f41503a = true;
                                    }
                                }
                                if (i12 != i14 && i9 == i14) {
                                    if (i17 != i13 || i18 == i13) {
                                        f(i11, 0, i11, 0, c5139d);
                                        c5139d.f41509d.f41745e.f41728m = c5139d.q();
                                        c5139d.f41511e.f41745e.f41728m = c5139d.k();
                                    } else if (i18 == 2 && i17 == 2 && iArr2[0] == 1 && iArr2[i13] == 1) {
                                        f(1, (int) ((f9 * c5140e.q()) + 0.5f), 1, (int) ((f3 * c5140e.k()) + 0.5f), c5139d);
                                        c5139d.f41509d.f41745e.d(c5139d.q());
                                        c5139d.f41511e.f41745e.d(c5139d.k());
                                        c5139d.f41503a = true;
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
        ArrayList arrayList = this.f41713e;
        arrayList.clear();
        C5140e c5140e = this.f41712d;
        c5140e.f41509d.f();
        c5140e.f41511e.f();
        arrayList.add(c5140e.f41509d);
        arrayList.add(c5140e.f41511e);
        Iterator it = c5140e.f41554q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C5139d c5139d = (C5139d) it.next();
            if (c5139d instanceof w.h) {
                C5171i c5171i = new C5171i(c5139d);
                c5139d.f41509d.f();
                c5139d.f41511e.f();
                c5171i.f41746f = ((w.h) c5139d).f41620u0;
                arrayList.add(c5171i);
            } else {
                if (c5139d.x()) {
                    if (c5139d.f41505b == null) {
                        c5139d.f41505b = new C5165c(c5139d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c5139d.f41505b);
                } else {
                    arrayList.add(c5139d.f41509d);
                }
                if (c5139d.y()) {
                    if (c5139d.f41507c == null) {
                        c5139d.f41507c = new C5165c(c5139d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c5139d.f41507c);
                } else {
                    arrayList.add(c5139d.f41511e);
                }
                if (c5139d instanceof w.i) {
                    arrayList.add(new C5172j(c5139d));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC5178p) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC5178p abstractC5178p = (AbstractC5178p) it3.next();
            if (abstractC5178p.f41742b != c5140e) {
                abstractC5178p.d();
            }
        }
        ArrayList arrayList2 = this.f41716h;
        arrayList2.clear();
        C5140e c5140e2 = this.f41709a;
        e(c5140e2.f41509d, 0, arrayList2);
        e(c5140e2.f41511e, 1, arrayList2);
        this.f41710b = false;
    }

    public final int d(C5140e c5140e, int i) {
        ArrayList arrayList;
        int i6;
        int i9;
        long max;
        float f3;
        C5140e c5140e2 = c5140e;
        ArrayList arrayList2 = this.f41716h;
        int size = arrayList2.size();
        int i10 = 0;
        long j6 = 0;
        while (i10 < size) {
            AbstractC5178p abstractC5178p = ((C5174l) arrayList2.get(i10)).f41731a;
            if (!(abstractC5178p instanceof C5165c) ? !(i != 0 ? (abstractC5178p instanceof C5175m) : (abstractC5178p instanceof C5173k)) : ((C5165c) abstractC5178p).f41746f != i) {
                C5168f c5168f = (i == 0 ? c5140e2.f41509d : c5140e2.f41511e).f41748h;
                C5168f c5168f2 = (i == 0 ? c5140e2.f41509d : c5140e2.f41511e).i;
                boolean contains = abstractC5178p.f41748h.f41727l.contains(c5168f);
                C5168f c5168f3 = abstractC5178p.i;
                boolean contains2 = c5168f3.f41727l.contains(c5168f2);
                long j9 = abstractC5178p.j();
                C5168f c5168f4 = abstractC5178p.f41748h;
                if (contains && contains2) {
                    long b9 = C5174l.b(c5168f4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i6 = size;
                    long a9 = C5174l.a(c5168f3, 0L);
                    long j10 = b9 - j9;
                    int i11 = c5168f3.f41722f;
                    arrayList = arrayList3;
                    i9 = i10;
                    if (j10 >= (-i11)) {
                        j10 += i11;
                    }
                    long j11 = (-a9) - j9;
                    long j12 = c5168f4.f41722f;
                    long j13 = j11 - j12;
                    if (j13 >= j12) {
                        j13 -= j12;
                    }
                    C5139d c5139d = abstractC5178p.f41742b;
                    if (i == 0) {
                        f3 = c5139d.f41510d0;
                    } else if (i == 1) {
                        f3 = c5139d.f41512e0;
                    } else {
                        c5139d.getClass();
                        f3 = -1.0f;
                    }
                    float f9 = f3 > 0.0f ? (long) ((j10 / (1.0f - f3)) + (j13 / f3)) : 0L;
                    max = (c5168f4.f41722f + ((((long) ((f9 * f3) + 0.5f)) + j9) + ((long) AbstractC4404f.a(1.0f, f3, f9, 0.5f)))) - c5168f3.f41722f;
                } else {
                    arrayList = arrayList2;
                    i6 = size;
                    i9 = i10;
                    max = contains ? Math.max(C5174l.b(c5168f4, c5168f4.f41722f), c5168f4.f41722f + j9) : contains2 ? Math.max(-C5174l.a(c5168f3, c5168f3.f41722f), (-c5168f3.f41722f) + j9) : (abstractC5178p.j() + c5168f4.f41722f) - c5168f3.f41722f;
                }
            } else {
                arrayList = arrayList2;
                i6 = size;
                i9 = i10;
                max = 0;
            }
            j6 = Math.max(j6, max);
            i10 = i9 + 1;
            c5140e2 = c5140e;
            size = i6;
            arrayList2 = arrayList;
        }
        return (int) j6;
    }

    public final void e(AbstractC5178p abstractC5178p, int i, ArrayList arrayList) {
        C5168f c5168f;
        Iterator it = abstractC5178p.f41748h.f41726k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c5168f = abstractC5178p.i;
            if (!hasNext) {
                break;
            }
            InterfaceC5166d interfaceC5166d = (InterfaceC5166d) it.next();
            if (interfaceC5166d instanceof C5168f) {
                a((C5168f) interfaceC5166d, i, arrayList, null);
            } else if (interfaceC5166d instanceof AbstractC5178p) {
                a(((AbstractC5178p) interfaceC5166d).f41748h, i, arrayList, null);
            }
        }
        Iterator it2 = c5168f.f41726k.iterator();
        while (it2.hasNext()) {
            InterfaceC5166d interfaceC5166d2 = (InterfaceC5166d) it2.next();
            if (interfaceC5166d2 instanceof C5168f) {
                a((C5168f) interfaceC5166d2, i, arrayList, null);
            } else if (interfaceC5166d2 instanceof AbstractC5178p) {
                a(((AbstractC5178p) interfaceC5166d2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((C5175m) abstractC5178p).f41733k.f41726k.iterator();
            while (it3.hasNext()) {
                InterfaceC5166d interfaceC5166d3 = (InterfaceC5166d) it3.next();
                if (interfaceC5166d3 instanceof C5168f) {
                    a((C5168f) interfaceC5166d3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i6, int i9, int i10, C5139d c5139d) {
        C5164b c5164b = this.f41715g;
        c5164b.f41698a = i;
        c5164b.f41699b = i9;
        c5164b.f41700c = i6;
        c5164b.f41701d = i10;
        this.f41714f.b(c5139d, c5164b);
        c5139d.O(c5164b.f41702e);
        c5139d.L(c5164b.f41703f);
        c5139d.f41483E = c5164b.f41705h;
        c5139d.I(c5164b.f41704g);
    }

    public final void g() {
        C5163a c5163a;
        Iterator it = this.f41709a.f41554q0.iterator();
        while (it.hasNext()) {
            C5139d c5139d = (C5139d) it.next();
            if (!c5139d.f41503a) {
                int[] iArr = c5139d.f41532p0;
                boolean z3 = false;
                int i = iArr[0];
                int i6 = iArr[1];
                int i9 = c5139d.f41534r;
                int i10 = c5139d.f41535s;
                boolean z6 = i == 2 || (i == 3 && i9 == 1);
                if (i6 == 2 || (i6 == 3 && i10 == 1)) {
                    z3 = true;
                }
                C5169g c5169g = c5139d.f41509d.f41745e;
                boolean z9 = c5169g.f41725j;
                C5169g c5169g2 = c5139d.f41511e.f41745e;
                boolean z10 = c5169g2.f41725j;
                boolean z11 = z6;
                if (z9 && z10) {
                    f(1, c5169g.f41723g, 1, c5169g2.f41723g, c5139d);
                    c5139d.f41503a = true;
                } else if (z9 && z3) {
                    f(1, c5169g.f41723g, 2, c5169g2.f41723g, c5139d);
                    if (i6 == 3) {
                        c5139d.f41511e.f41745e.f41728m = c5139d.k();
                    } else {
                        c5139d.f41511e.f41745e.d(c5139d.k());
                        c5139d.f41503a = true;
                    }
                } else if (z10 && z11) {
                    f(2, c5169g.f41723g, 1, c5169g2.f41723g, c5139d);
                    if (i == 3) {
                        c5139d.f41509d.f41745e.f41728m = c5139d.q();
                    } else {
                        c5139d.f41509d.f41745e.d(c5139d.q());
                        c5139d.f41503a = true;
                    }
                }
                if (c5139d.f41503a && (c5163a = c5139d.f41511e.f41734l) != null) {
                    c5163a.d(c5139d.f41504a0);
                }
            }
        }
    }
}
