package x;

import java.util.ArrayList;
import java.util.Iterator;
import w.C5138c;
import w.C5139d;
import w.C5140e;

/* renamed from: x.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5165c extends AbstractC5178p {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f41704k;

    /* renamed from: l, reason: collision with root package name */
    public int f41705l;

    public C5165c(C5139d c5139d, int i) {
        super(c5139d);
        C5139d c5139d2;
        this.f41704k = new ArrayList();
        this.f41743f = i;
        C5139d c5139d3 = this.f41739b;
        C5139d m4 = c5139d3.m(i);
        while (true) {
            C5139d c5139d4 = m4;
            c5139d2 = c5139d3;
            c5139d3 = c5139d4;
            if (c5139d3 == null) {
                break;
            } else {
                m4 = c5139d3.m(this.f41743f);
            }
        }
        this.f41739b = c5139d2;
        int i6 = this.f41743f;
        Object obj = i6 == 0 ? c5139d2.f41506d : i6 == 1 ? c5139d2.f41508e : null;
        ArrayList arrayList = this.f41704k;
        arrayList.add(obj);
        C5139d l9 = c5139d2.l(this.f41743f);
        while (l9 != null) {
            int i9 = this.f41743f;
            arrayList.add(i9 == 0 ? l9.f41506d : i9 == 1 ? l9.f41508e : null);
            l9 = l9.l(this.f41743f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC5178p abstractC5178p = (AbstractC5178p) it.next();
            int i10 = this.f41743f;
            if (i10 == 0) {
                abstractC5178p.f41739b.f41502b = this;
            } else if (i10 == 1) {
                abstractC5178p.f41739b.f41504c = this;
            }
        }
        if (this.f41743f == 0 && ((C5140e) this.f41739b.f41494T).f41556v0 && arrayList.size() > 1) {
            this.f41739b = ((AbstractC5178p) arrayList.get(arrayList.size() - 1)).f41739b;
        }
        this.f41705l = this.f41743f == 0 ? this.f41739b.f41516i0 : this.f41739b.f41518j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0397, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // x.InterfaceC5166d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC5166d interfaceC5166d) {
        int i;
        int i6;
        boolean z3;
        float f3;
        int i9;
        int i10;
        int i11;
        int i12;
        float f9;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z6;
        int i21;
        C5168f c5168f = this.f41745h;
        if (c5168f.f41722j) {
            C5168f c5168f2 = this.i;
            if (c5168f2.f41722j) {
                C5139d c5139d = this.f41739b.f41494T;
                boolean z9 = c5139d instanceof C5140e ? ((C5140e) c5139d).f41556v0 : false;
                int i22 = c5168f2.f41720g - c5168f.f41720g;
                ArrayList arrayList = this.f41704k;
                int size = arrayList.size();
                int i23 = 0;
                while (true) {
                    i = -1;
                    i6 = 8;
                    if (i23 >= size) {
                        i23 = -1;
                        break;
                    } else if (((AbstractC5178p) arrayList.get(i23)).f41739b.f41513g0 != 8) {
                        break;
                    } else {
                        i23++;
                    }
                }
                int i24 = size - 1;
                int i25 = i24;
                while (true) {
                    if (i25 < 0) {
                        break;
                    }
                    if (((AbstractC5178p) arrayList.get(i25)).f41739b.f41513g0 != 8) {
                        i = i25;
                        break;
                    }
                    i25--;
                }
                int i26 = 0;
                while (i26 < 2) {
                    f3 = 0.0f;
                    int i27 = 0;
                    i11 = 0;
                    int i28 = 0;
                    int i29 = 0;
                    while (i27 < size) {
                        AbstractC5178p abstractC5178p = (AbstractC5178p) arrayList.get(i27);
                        C5139d c5139d2 = abstractC5178p.f41739b;
                        boolean z10 = z9;
                        if (c5139d2.f41513g0 == i6) {
                            i20 = i26;
                        } else {
                            i29++;
                            if (i27 > 0 && i27 >= i23) {
                                i11 += abstractC5178p.f41745h.f41719f;
                            }
                            C5169g c5169g = abstractC5178p.f41742e;
                            int i30 = c5169g.f41720g;
                            i20 = i26;
                            boolean z11 = abstractC5178p.f41741d != 3;
                            if (z11) {
                                int i31 = this.f41743f;
                                if (i31 == 0 && !c5139d2.f41506d.f41742e.f41722j) {
                                    return;
                                }
                                if (i31 == 1 && !c5139d2.f41508e.f41742e.f41722j) {
                                    return;
                                } else {
                                    z6 = z11;
                                }
                            } else {
                                z6 = z11;
                                if (abstractC5178p.f41738a == 1 && i20 == 0) {
                                    i21 = c5169g.f41725m;
                                    i28++;
                                } else if (c5169g.f41722j) {
                                    i21 = i30;
                                }
                                z6 = true;
                                if (z6) {
                                    i28++;
                                    float f10 = c5139d2.f41520k0[this.f41743f];
                                    if (f10 >= 0.0f) {
                                        f3 += f10;
                                    }
                                } else {
                                    i11 += i21;
                                }
                                if (i27 < i24 && i27 < i) {
                                    i11 += -abstractC5178p.i.f41719f;
                                }
                            }
                            i21 = i30;
                            if (z6) {
                            }
                            if (i27 < i24) {
                                i11 += -abstractC5178p.i.f41719f;
                            }
                        }
                        i27++;
                        z9 = z10;
                        i26 = i20;
                        i6 = 8;
                    }
                    z3 = z9;
                    int i32 = i26;
                    if (i11 < i22 || i28 == 0) {
                        i9 = i28;
                        i10 = i29;
                        break;
                    } else {
                        i26 = i32 + 1;
                        z9 = z3;
                        i6 = 8;
                    }
                }
                z3 = z9;
                f3 = 0.0f;
                i9 = 0;
                i10 = 0;
                i11 = 0;
                int i33 = c5168f.f41720g;
                if (z3) {
                    i33 = c5168f2.f41720g;
                }
                float f11 = 0.5f;
                if (i11 > i22) {
                    i33 = z3 ? i33 + ((int) (((i11 - i22) / 2.0f) + 0.5f)) : i33 - ((int) (((i11 - i22) / 2.0f) + 0.5f));
                }
                if (i9 > 0) {
                    float f12 = i22 - i11;
                    int i34 = (int) ((f12 / i9) + 0.5f);
                    int i35 = 0;
                    int i36 = 0;
                    while (i35 < size) {
                        float f13 = f11;
                        AbstractC5178p abstractC5178p2 = (AbstractC5178p) arrayList.get(i35);
                        int i37 = i33;
                        C5139d c5139d3 = abstractC5178p2.f41739b;
                        int i38 = i9;
                        float f14 = f12;
                        if (c5139d3.f41513g0 != 8 && abstractC5178p2.f41741d == 3) {
                            C5169g c5169g2 = abstractC5178p2.f41742e;
                            if (!c5169g2.f41722j) {
                                if (f3 > 0.0f) {
                                    i15 = (int) (((c5139d3.f41520k0[this.f41743f] * f14) / f3) + f13);
                                    i16 = i34;
                                } else {
                                    i15 = i34;
                                    i16 = i15;
                                }
                                if (this.f41743f == 0) {
                                    i17 = c5139d3.f41535v;
                                    i18 = c5139d3.f41534u;
                                } else {
                                    i17 = c5139d3.f41538y;
                                    i18 = c5139d3.f41537x;
                                }
                                i19 = i35;
                                int max = Math.max(i18, abstractC5178p2.f41738a == 1 ? Math.min(i15, c5169g2.f41725m) : i15);
                                if (i17 > 0) {
                                    max = Math.min(i17, max);
                                }
                                if (max != i15) {
                                    i36++;
                                    i15 = max;
                                }
                                c5169g2.d(i15);
                                i35 = i19 + 1;
                                i33 = i37;
                                f11 = f13;
                                i9 = i38;
                                f12 = f14;
                                i34 = i16;
                            }
                        }
                        i16 = i34;
                        i19 = i35;
                        i35 = i19 + 1;
                        i33 = i37;
                        f11 = f13;
                        i9 = i38;
                        f12 = f14;
                        i34 = i16;
                    }
                    i12 = i33;
                    f9 = f11;
                    int i39 = i9;
                    if (i36 > 0) {
                        i9 = i39 - i36;
                        i11 = 0;
                        for (int i40 = 0; i40 < size; i40++) {
                            AbstractC5178p abstractC5178p3 = (AbstractC5178p) arrayList.get(i40);
                            if (abstractC5178p3.f41739b.f41513g0 != 8) {
                                if (i40 > 0 && i40 >= i23) {
                                    i11 += abstractC5178p3.f41745h.f41719f;
                                }
                                i11 += abstractC5178p3.f41742e.f41720g;
                                if (i40 < i24 && i40 < i) {
                                    i11 += -abstractC5178p3.i.f41719f;
                                }
                            }
                        }
                    } else {
                        i9 = i39;
                    }
                    i14 = 2;
                    if (this.f41705l == 2 && i36 == 0) {
                        i13 = 0;
                        this.f41705l = 0;
                    } else {
                        i13 = 0;
                    }
                } else {
                    i12 = i33;
                    f9 = 0.5f;
                    i13 = 0;
                    i14 = 2;
                }
                if (i11 > i22) {
                    this.f41705l = i14;
                }
                if (i10 > 0 && i9 == 0 && i23 == i) {
                    this.f41705l = i14;
                }
                int i41 = this.f41705l;
                if (i41 == 1) {
                    int i42 = i10 > 1 ? (i22 - i11) / (i10 - 1) : i10 == 1 ? (i22 - i11) / 2 : i13;
                    if (i9 > 0) {
                        i42 = i13;
                    }
                    int i43 = i12;
                    for (int i44 = i13; i44 < size; i44++) {
                        AbstractC5178p abstractC5178p4 = (AbstractC5178p) arrayList.get(z3 ? size - (i44 + 1) : i44);
                        int i45 = abstractC5178p4.f41739b.f41513g0;
                        C5168f c5168f3 = abstractC5178p4.i;
                        C5168f c5168f4 = abstractC5178p4.f41745h;
                        if (i45 == 8) {
                            c5168f4.d(i43);
                            c5168f3.d(i43);
                        } else {
                            if (i44 > 0) {
                                i43 = z3 ? i43 - i42 : i43 + i42;
                            }
                            if (i44 > 0 && i44 >= i23) {
                                i43 = z3 ? i43 - c5168f4.f41719f : i43 + c5168f4.f41719f;
                            }
                            if (z3) {
                                c5168f3.d(i43);
                            } else {
                                c5168f4.d(i43);
                            }
                            C5169g c5169g3 = abstractC5178p4.f41742e;
                            int i46 = c5169g3.f41720g;
                            if (abstractC5178p4.f41741d == 3 && abstractC5178p4.f41738a == 1) {
                                i46 = c5169g3.f41725m;
                            }
                            i43 = z3 ? i43 - i46 : i43 + i46;
                            if (z3) {
                                c5168f4.d(i43);
                            } else {
                                c5168f3.d(i43);
                            }
                            abstractC5178p4.f41744g = true;
                            if (i44 < i24 && i44 < i) {
                                i43 = z3 ? i43 - (-c5168f3.f41719f) : i43 + (-c5168f3.f41719f);
                            }
                        }
                    }
                    return;
                }
                if (i41 == 0) {
                    int i47 = (i22 - i11) / (i10 + 1);
                    if (i9 > 0) {
                        i47 = i13;
                    }
                    int i48 = i12;
                    for (int i49 = i13; i49 < size; i49++) {
                        AbstractC5178p abstractC5178p5 = (AbstractC5178p) arrayList.get(z3 ? size - (i49 + 1) : i49);
                        int i50 = abstractC5178p5.f41739b.f41513g0;
                        C5168f c5168f5 = abstractC5178p5.i;
                        C5168f c5168f6 = abstractC5178p5.f41745h;
                        if (i50 == 8) {
                            c5168f6.d(i48);
                            c5168f5.d(i48);
                        } else {
                            int i51 = z3 ? i48 - i47 : i48 + i47;
                            if (i49 > 0 && i49 >= i23) {
                                i51 = z3 ? i51 - c5168f6.f41719f : i51 + c5168f6.f41719f;
                            }
                            if (z3) {
                                c5168f5.d(i51);
                            } else {
                                c5168f6.d(i51);
                            }
                            C5169g c5169g4 = abstractC5178p5.f41742e;
                            int i52 = c5169g4.f41720g;
                            if (abstractC5178p5.f41741d == 3 && abstractC5178p5.f41738a == 1) {
                                i52 = Math.min(i52, c5169g4.f41725m);
                            }
                            i48 = z3 ? i51 - i52 : i51 + i52;
                            if (z3) {
                                c5168f6.d(i48);
                            } else {
                                c5168f5.d(i48);
                            }
                            if (i49 < i24 && i49 < i) {
                                i48 = z3 ? i48 - (-c5168f5.f41719f) : i48 + (-c5168f5.f41719f);
                            }
                        }
                    }
                    return;
                }
                if (i41 == 2) {
                    float f15 = this.f41743f == 0 ? this.f41739b.f41507d0 : this.f41739b.f41509e0;
                    if (z3) {
                        f15 = 1.0f - f15;
                    }
                    int i53 = (int) (((i22 - i11) * f15) + f9);
                    if (i53 < 0 || i9 > 0) {
                        i53 = i13;
                    }
                    int i54 = z3 ? i12 - i53 : i12 + i53;
                    for (int i55 = i13; i55 < size; i55++) {
                        AbstractC5178p abstractC5178p6 = (AbstractC5178p) arrayList.get(z3 ? size - (i55 + 1) : i55);
                        int i56 = abstractC5178p6.f41739b.f41513g0;
                        C5168f c5168f7 = abstractC5178p6.i;
                        C5168f c5168f8 = abstractC5178p6.f41745h;
                        if (i56 == 8) {
                            c5168f8.d(i54);
                            c5168f7.d(i54);
                        } else {
                            if (i55 > 0 && i55 >= i23) {
                                i54 = z3 ? i54 - c5168f8.f41719f : i54 + c5168f8.f41719f;
                            }
                            if (z3) {
                                c5168f7.d(i54);
                            } else {
                                c5168f8.d(i54);
                            }
                            C5169g c5169g5 = abstractC5178p6.f41742e;
                            int i57 = c5169g5.f41720g;
                            if (abstractC5178p6.f41741d == 3 && abstractC5178p6.f41738a == 1) {
                                i57 = c5169g5.f41725m;
                            }
                            i54 += i57;
                            if (z3) {
                                c5168f8.d(i54);
                            } else {
                                c5168f7.d(i54);
                            }
                            if (i55 < i24 && i55 < i) {
                                i54 = z3 ? i54 - (-c5168f7.f41719f) : i54 + (-c5168f7.f41719f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // x.AbstractC5178p
    public final void d() {
        ArrayList arrayList = this.f41704k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC5178p) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C5139d c5139d = ((AbstractC5178p) arrayList.get(0)).f41739b;
        C5139d c5139d2 = ((AbstractC5178p) arrayList.get(size - 1)).f41739b;
        int i = this.f41743f;
        C5168f c5168f = this.i;
        C5168f c5168f2 = this.f41745h;
        if (i == 0) {
            C5138c c5138c = c5139d.f41484I;
            C5138c c5138c2 = c5139d2.f41485K;
            C5168f i6 = AbstractC5178p.i(c5138c, 0);
            int e9 = c5138c.e();
            C5139d m4 = m();
            if (m4 != null) {
                e9 = m4.f41484I.e();
            }
            if (i6 != null) {
                AbstractC5178p.b(c5168f2, i6, e9);
            }
            C5168f i9 = AbstractC5178p.i(c5138c2, 0);
            int e10 = c5138c2.e();
            C5139d n9 = n();
            if (n9 != null) {
                e10 = n9.f41485K.e();
            }
            if (i9 != null) {
                AbstractC5178p.b(c5168f, i9, -e10);
            }
        } else {
            C5138c c5138c3 = c5139d.J;
            C5138c c5138c4 = c5139d2.f41486L;
            C5168f i10 = AbstractC5178p.i(c5138c3, 1);
            int e11 = c5138c3.e();
            C5139d m9 = m();
            if (m9 != null) {
                e11 = m9.J.e();
            }
            if (i10 != null) {
                AbstractC5178p.b(c5168f2, i10, e11);
            }
            C5168f i11 = AbstractC5178p.i(c5138c4, 1);
            int e12 = c5138c4.e();
            C5139d n10 = n();
            if (n10 != null) {
                e12 = n10.f41486L.e();
            }
            if (i11 != null) {
                AbstractC5178p.b(c5168f, i11, -e12);
            }
        }
        c5168f2.f41714a = this;
        c5168f.f41714a = this;
    }

    @Override // x.AbstractC5178p
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f41704k;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC5178p) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // x.AbstractC5178p
    public final void f() {
        this.f41740c = null;
        Iterator it = this.f41704k.iterator();
        while (it.hasNext()) {
            ((AbstractC5178p) it.next()).f();
        }
    }

    @Override // x.AbstractC5178p
    public final long j() {
        ArrayList arrayList = this.f41704k;
        int size = arrayList.size();
        long j6 = 0;
        for (int i = 0; i < size; i++) {
            j6 = r5.i.f41719f + ((AbstractC5178p) arrayList.get(i)).j() + j6 + r5.f41745h.f41719f;
        }
        return j6;
    }

    @Override // x.AbstractC5178p
    public final boolean k() {
        ArrayList arrayList = this.f41704k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC5178p) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final C5139d m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f41704k;
            if (i >= arrayList.size()) {
                return null;
            }
            C5139d c5139d = ((AbstractC5178p) arrayList.get(i)).f41739b;
            if (c5139d.f41513g0 != 8) {
                return c5139d;
            }
            i++;
        }
    }

    public final C5139d n() {
        ArrayList arrayList = this.f41704k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C5139d c5139d = ((AbstractC5178p) arrayList.get(size)).f41739b;
            if (c5139d.f41513g0 != 8) {
                return c5139d;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f41743f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f41704k.iterator();
        while (it.hasNext()) {
            AbstractC5178p abstractC5178p = (AbstractC5178p) it.next();
            sb.append("<");
            sb.append(abstractC5178p);
            sb.append("> ");
        }
        return sb.toString();
    }
}
