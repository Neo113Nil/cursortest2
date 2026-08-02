package x;

import java.util.ArrayList;
import java.util.Iterator;
import w.C5129d;
import w.C5130e;

/* renamed from: x.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5164c extends AbstractC5177p {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f41762k;

    /* renamed from: l, reason: collision with root package name */
    public int f41763l;

    public C5164c(C5130e c5130e, int i) {
        super(c5130e);
        C5130e c5130e2;
        this.f41762k = new ArrayList();
        this.f41801f = i;
        C5130e c5130e3 = this.f41797b;
        C5130e m9 = c5130e3.m(i);
        while (true) {
            C5130e c5130e4 = m9;
            c5130e2 = c5130e3;
            c5130e3 = c5130e4;
            if (c5130e3 == null) {
                break;
            } else {
                m9 = c5130e3.m(this.f41801f);
            }
        }
        this.f41797b = c5130e2;
        int i4 = this.f41801f;
        Object obj = i4 == 0 ? c5130e2.f41288d : i4 == 1 ? c5130e2.f41290e : null;
        ArrayList arrayList = this.f41762k;
        arrayList.add(obj);
        C5130e l9 = c5130e2.l(this.f41801f);
        while (l9 != null) {
            int i6 = this.f41801f;
            arrayList.add(i6 == 0 ? l9.f41288d : i6 == 1 ? l9.f41290e : null);
            l9 = l9.l(this.f41801f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC5177p abstractC5177p = (AbstractC5177p) it.next();
            int i9 = this.f41801f;
            if (i9 == 0) {
                abstractC5177p.f41797b.f41284b = this;
            } else if (i9 == 1) {
                abstractC5177p.f41797b.f41286c = this;
            }
        }
        if (this.f41801f == 0 && ((w.f) this.f41797b.f41276T).f41338v0 && arrayList.size() > 1) {
            this.f41797b = ((AbstractC5177p) arrayList.get(arrayList.size() - 1)).f41797b;
        }
        this.f41763l = this.f41801f == 0 ? this.f41797b.f41298i0 : this.f41797b.f41300j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0397, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // x.InterfaceC5165d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC5165d interfaceC5165d) {
        int i;
        int i4;
        boolean z6;
        float f2;
        int i6;
        int i9;
        int i10;
        int i11;
        float f9;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z9;
        int i20;
        C5167f c5167f = this.f41803h;
        if (c5167f.f41780j) {
            C5167f c5167f2 = this.i;
            if (c5167f2.f41780j) {
                C5130e c5130e = this.f41797b.f41276T;
                boolean z10 = c5130e instanceof w.f ? ((w.f) c5130e).f41338v0 : false;
                int i21 = c5167f2.f41778g - c5167f.f41778g;
                ArrayList arrayList = this.f41762k;
                int size = arrayList.size();
                int i22 = 0;
                while (true) {
                    i = -1;
                    i4 = 8;
                    if (i22 >= size) {
                        i22 = -1;
                        break;
                    } else if (((AbstractC5177p) arrayList.get(i22)).f41797b.f41295g0 != 8) {
                        break;
                    } else {
                        i22++;
                    }
                }
                int i23 = size - 1;
                int i24 = i23;
                while (true) {
                    if (i24 < 0) {
                        break;
                    }
                    if (((AbstractC5177p) arrayList.get(i24)).f41797b.f41295g0 != 8) {
                        i = i24;
                        break;
                    }
                    i24--;
                }
                int i25 = 0;
                while (i25 < 2) {
                    f2 = 0.0f;
                    int i26 = 0;
                    i10 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    while (i26 < size) {
                        AbstractC5177p abstractC5177p = (AbstractC5177p) arrayList.get(i26);
                        C5130e c5130e2 = abstractC5177p.f41797b;
                        boolean z11 = z10;
                        if (c5130e2.f41295g0 == i4) {
                            i19 = i25;
                        } else {
                            i28++;
                            if (i26 > 0 && i26 >= i22) {
                                i10 += abstractC5177p.f41803h.f41777f;
                            }
                            C5168g c5168g = abstractC5177p.f41800e;
                            int i29 = c5168g.f41778g;
                            i19 = i25;
                            boolean z12 = abstractC5177p.f41799d != 3;
                            if (z12) {
                                int i30 = this.f41801f;
                                if (i30 == 0 && !c5130e2.f41288d.f41800e.f41780j) {
                                    return;
                                }
                                if (i30 == 1 && !c5130e2.f41290e.f41800e.f41780j) {
                                    return;
                                } else {
                                    z9 = z12;
                                }
                            } else {
                                z9 = z12;
                                if (abstractC5177p.f41796a == 1 && i19 == 0) {
                                    i20 = c5168g.f41783m;
                                    i27++;
                                } else if (c5168g.f41780j) {
                                    i20 = i29;
                                }
                                z9 = true;
                                if (z9) {
                                    i27++;
                                    float f10 = c5130e2.f41302k0[this.f41801f];
                                    if (f10 >= 0.0f) {
                                        f2 += f10;
                                    }
                                } else {
                                    i10 += i20;
                                }
                                if (i26 < i23 && i26 < i) {
                                    i10 += -abstractC5177p.i.f41777f;
                                }
                            }
                            i20 = i29;
                            if (z9) {
                            }
                            if (i26 < i23) {
                                i10 += -abstractC5177p.i.f41777f;
                            }
                        }
                        i26++;
                        z10 = z11;
                        i25 = i19;
                        i4 = 8;
                    }
                    z6 = z10;
                    int i31 = i25;
                    if (i10 < i21 || i27 == 0) {
                        i6 = i27;
                        i9 = i28;
                        break;
                    } else {
                        i25 = i31 + 1;
                        z10 = z6;
                        i4 = 8;
                    }
                }
                z6 = z10;
                f2 = 0.0f;
                i6 = 0;
                i9 = 0;
                i10 = 0;
                int i32 = c5167f.f41778g;
                if (z6) {
                    i32 = c5167f2.f41778g;
                }
                float f11 = 0.5f;
                if (i10 > i21) {
                    i32 = z6 ? i32 + ((int) (((i10 - i21) / 2.0f) + 0.5f)) : i32 - ((int) (((i10 - i21) / 2.0f) + 0.5f));
                }
                if (i6 > 0) {
                    float f12 = i21 - i10;
                    int i33 = (int) ((f12 / i6) + 0.5f);
                    int i34 = 0;
                    int i35 = 0;
                    while (i34 < size) {
                        float f13 = f11;
                        AbstractC5177p abstractC5177p2 = (AbstractC5177p) arrayList.get(i34);
                        int i36 = i32;
                        C5130e c5130e3 = abstractC5177p2.f41797b;
                        int i37 = i6;
                        float f14 = f12;
                        if (c5130e3.f41295g0 != 8 && abstractC5177p2.f41799d == 3) {
                            C5168g c5168g2 = abstractC5177p2.f41800e;
                            if (!c5168g2.f41780j) {
                                if (f2 > 0.0f) {
                                    i14 = (int) (((c5130e3.f41302k0[this.f41801f] * f14) / f2) + f13);
                                    i15 = i33;
                                } else {
                                    i14 = i33;
                                    i15 = i14;
                                }
                                if (this.f41801f == 0) {
                                    i16 = c5130e3.f41317v;
                                    i17 = c5130e3.f41316u;
                                } else {
                                    i16 = c5130e3.f41320y;
                                    i17 = c5130e3.f41319x;
                                }
                                i18 = i34;
                                int max = Math.max(i17, abstractC5177p2.f41796a == 1 ? Math.min(i14, c5168g2.f41783m) : i14);
                                if (i16 > 0) {
                                    max = Math.min(i16, max);
                                }
                                if (max != i14) {
                                    i35++;
                                    i14 = max;
                                }
                                c5168g2.d(i14);
                                i34 = i18 + 1;
                                i32 = i36;
                                f11 = f13;
                                i6 = i37;
                                f12 = f14;
                                i33 = i15;
                            }
                        }
                        i15 = i33;
                        i18 = i34;
                        i34 = i18 + 1;
                        i32 = i36;
                        f11 = f13;
                        i6 = i37;
                        f12 = f14;
                        i33 = i15;
                    }
                    i11 = i32;
                    f9 = f11;
                    int i38 = i6;
                    if (i35 > 0) {
                        i6 = i38 - i35;
                        i10 = 0;
                        for (int i39 = 0; i39 < size; i39++) {
                            AbstractC5177p abstractC5177p3 = (AbstractC5177p) arrayList.get(i39);
                            if (abstractC5177p3.f41797b.f41295g0 != 8) {
                                if (i39 > 0 && i39 >= i22) {
                                    i10 += abstractC5177p3.f41803h.f41777f;
                                }
                                i10 += abstractC5177p3.f41800e.f41778g;
                                if (i39 < i23 && i39 < i) {
                                    i10 += -abstractC5177p3.i.f41777f;
                                }
                            }
                        }
                    } else {
                        i6 = i38;
                    }
                    i13 = 2;
                    if (this.f41763l == 2 && i35 == 0) {
                        i12 = 0;
                        this.f41763l = 0;
                    } else {
                        i12 = 0;
                    }
                } else {
                    i11 = i32;
                    f9 = 0.5f;
                    i12 = 0;
                    i13 = 2;
                }
                if (i10 > i21) {
                    this.f41763l = i13;
                }
                if (i9 > 0 && i6 == 0 && i22 == i) {
                    this.f41763l = i13;
                }
                int i40 = this.f41763l;
                if (i40 == 1) {
                    int i41 = i9 > 1 ? (i21 - i10) / (i9 - 1) : i9 == 1 ? (i21 - i10) / 2 : i12;
                    if (i6 > 0) {
                        i41 = i12;
                    }
                    int i42 = i11;
                    for (int i43 = i12; i43 < size; i43++) {
                        AbstractC5177p abstractC5177p4 = (AbstractC5177p) arrayList.get(z6 ? size - (i43 + 1) : i43);
                        int i44 = abstractC5177p4.f41797b.f41295g0;
                        C5167f c5167f3 = abstractC5177p4.i;
                        C5167f c5167f4 = abstractC5177p4.f41803h;
                        if (i44 == 8) {
                            c5167f4.d(i42);
                            c5167f3.d(i42);
                        } else {
                            if (i43 > 0) {
                                i42 = z6 ? i42 - i41 : i42 + i41;
                            }
                            if (i43 > 0 && i43 >= i22) {
                                i42 = z6 ? i42 - c5167f4.f41777f : i42 + c5167f4.f41777f;
                            }
                            if (z6) {
                                c5167f3.d(i42);
                            } else {
                                c5167f4.d(i42);
                            }
                            C5168g c5168g3 = abstractC5177p4.f41800e;
                            int i45 = c5168g3.f41778g;
                            if (abstractC5177p4.f41799d == 3 && abstractC5177p4.f41796a == 1) {
                                i45 = c5168g3.f41783m;
                            }
                            i42 = z6 ? i42 - i45 : i42 + i45;
                            if (z6) {
                                c5167f4.d(i42);
                            } else {
                                c5167f3.d(i42);
                            }
                            abstractC5177p4.f41802g = true;
                            if (i43 < i23 && i43 < i) {
                                i42 = z6 ? i42 - (-c5167f3.f41777f) : i42 + (-c5167f3.f41777f);
                            }
                        }
                    }
                    return;
                }
                if (i40 == 0) {
                    int i46 = (i21 - i10) / (i9 + 1);
                    if (i6 > 0) {
                        i46 = i12;
                    }
                    int i47 = i11;
                    for (int i48 = i12; i48 < size; i48++) {
                        AbstractC5177p abstractC5177p5 = (AbstractC5177p) arrayList.get(z6 ? size - (i48 + 1) : i48);
                        int i49 = abstractC5177p5.f41797b.f41295g0;
                        C5167f c5167f5 = abstractC5177p5.i;
                        C5167f c5167f6 = abstractC5177p5.f41803h;
                        if (i49 == 8) {
                            c5167f6.d(i47);
                            c5167f5.d(i47);
                        } else {
                            int i50 = z6 ? i47 - i46 : i47 + i46;
                            if (i48 > 0 && i48 >= i22) {
                                i50 = z6 ? i50 - c5167f6.f41777f : i50 + c5167f6.f41777f;
                            }
                            if (z6) {
                                c5167f5.d(i50);
                            } else {
                                c5167f6.d(i50);
                            }
                            C5168g c5168g4 = abstractC5177p5.f41800e;
                            int i51 = c5168g4.f41778g;
                            if (abstractC5177p5.f41799d == 3 && abstractC5177p5.f41796a == 1) {
                                i51 = Math.min(i51, c5168g4.f41783m);
                            }
                            i47 = z6 ? i50 - i51 : i50 + i51;
                            if (z6) {
                                c5167f6.d(i47);
                            } else {
                                c5167f5.d(i47);
                            }
                            if (i48 < i23 && i48 < i) {
                                i47 = z6 ? i47 - (-c5167f5.f41777f) : i47 + (-c5167f5.f41777f);
                            }
                        }
                    }
                    return;
                }
                if (i40 == 2) {
                    float f15 = this.f41801f == 0 ? this.f41797b.f41289d0 : this.f41797b.f41291e0;
                    if (z6) {
                        f15 = 1.0f - f15;
                    }
                    int i52 = (int) (((i21 - i10) * f15) + f9);
                    if (i52 < 0 || i6 > 0) {
                        i52 = i12;
                    }
                    int i53 = z6 ? i11 - i52 : i11 + i52;
                    for (int i54 = i12; i54 < size; i54++) {
                        AbstractC5177p abstractC5177p6 = (AbstractC5177p) arrayList.get(z6 ? size - (i54 + 1) : i54);
                        int i55 = abstractC5177p6.f41797b.f41295g0;
                        C5167f c5167f7 = abstractC5177p6.i;
                        C5167f c5167f8 = abstractC5177p6.f41803h;
                        if (i55 == 8) {
                            c5167f8.d(i53);
                            c5167f7.d(i53);
                        } else {
                            if (i54 > 0 && i54 >= i22) {
                                i53 = z6 ? i53 - c5167f8.f41777f : i53 + c5167f8.f41777f;
                            }
                            if (z6) {
                                c5167f7.d(i53);
                            } else {
                                c5167f8.d(i53);
                            }
                            C5168g c5168g5 = abstractC5177p6.f41800e;
                            int i56 = c5168g5.f41778g;
                            if (abstractC5177p6.f41799d == 3 && abstractC5177p6.f41796a == 1) {
                                i56 = c5168g5.f41783m;
                            }
                            i53 += i56;
                            if (z6) {
                                c5167f8.d(i53);
                            } else {
                                c5167f7.d(i53);
                            }
                            if (i54 < i23 && i54 < i) {
                                i53 = z6 ? i53 - (-c5167f7.f41777f) : i53 + (-c5167f7.f41777f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // x.AbstractC5177p
    public final void d() {
        ArrayList arrayList = this.f41762k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC5177p) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C5130e c5130e = ((AbstractC5177p) arrayList.get(0)).f41797b;
        C5130e c5130e2 = ((AbstractC5177p) arrayList.get(size - 1)).f41797b;
        int i = this.f41801f;
        C5167f c5167f = this.i;
        C5167f c5167f2 = this.f41803h;
        if (i == 0) {
            C5129d c5129d = c5130e.f41266I;
            C5129d c5129d2 = c5130e2.f41267K;
            C5167f i4 = AbstractC5177p.i(c5129d, 0);
            int e9 = c5129d.e();
            C5130e m9 = m();
            if (m9 != null) {
                e9 = m9.f41266I.e();
            }
            if (i4 != null) {
                AbstractC5177p.b(c5167f2, i4, e9);
            }
            C5167f i6 = AbstractC5177p.i(c5129d2, 0);
            int e10 = c5129d2.e();
            C5130e n9 = n();
            if (n9 != null) {
                e10 = n9.f41267K.e();
            }
            if (i6 != null) {
                AbstractC5177p.b(c5167f, i6, -e10);
            }
        } else {
            C5129d c5129d3 = c5130e.J;
            C5129d c5129d4 = c5130e2.f41268L;
            C5167f i9 = AbstractC5177p.i(c5129d3, 1);
            int e11 = c5129d3.e();
            C5130e m10 = m();
            if (m10 != null) {
                e11 = m10.J.e();
            }
            if (i9 != null) {
                AbstractC5177p.b(c5167f2, i9, e11);
            }
            C5167f i10 = AbstractC5177p.i(c5129d4, 1);
            int e12 = c5129d4.e();
            C5130e n10 = n();
            if (n10 != null) {
                e12 = n10.f41268L.e();
            }
            if (i10 != null) {
                AbstractC5177p.b(c5167f, i10, -e12);
            }
        }
        c5167f2.f41772a = this;
        c5167f.f41772a = this;
    }

    @Override // x.AbstractC5177p
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f41762k;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC5177p) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // x.AbstractC5177p
    public final void f() {
        this.f41798c = null;
        Iterator it = this.f41762k.iterator();
        while (it.hasNext()) {
            ((AbstractC5177p) it.next()).f();
        }
    }

    @Override // x.AbstractC5177p
    public final long j() {
        ArrayList arrayList = this.f41762k;
        int size = arrayList.size();
        long j6 = 0;
        for (int i = 0; i < size; i++) {
            j6 = r5.i.f41777f + ((AbstractC5177p) arrayList.get(i)).j() + j6 + r5.f41803h.f41777f;
        }
        return j6;
    }

    @Override // x.AbstractC5177p
    public final boolean k() {
        ArrayList arrayList = this.f41762k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC5177p) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final C5130e m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f41762k;
            if (i >= arrayList.size()) {
                return null;
            }
            C5130e c5130e = ((AbstractC5177p) arrayList.get(i)).f41797b;
            if (c5130e.f41295g0 != 8) {
                return c5130e;
            }
            i++;
        }
    }

    public final C5130e n() {
        ArrayList arrayList = this.f41762k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C5130e c5130e = ((AbstractC5177p) arrayList.get(size)).f41797b;
            if (c5130e.f41295g0 != 8) {
                return c5130e;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f41801f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f41762k.iterator();
        while (it.hasNext()) {
            AbstractC5177p abstractC5177p = (AbstractC5177p) it.next();
            sb.append("<");
            sb.append(abstractC5177p);
            sb.append("> ");
        }
        return sb.toString();
    }
}
