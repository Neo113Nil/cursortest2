package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.a;

/* loaded from: classes3.dex */
public final class tje {
    public final pje a;
    public final hkq b;
    public final dje c;
    public final n2k d;
    public final es6 e;
    public int f;
    public int g;
    public float h;
    public float i;
    public float j;
    public int k;
    public int l;
    public int m;
    public float n;

    public tje(pje pjeVar, hkq hkqVar, dje djeVar, n2k n2kVar) {
        this.a = pjeVar;
        this.b = hkqVar;
        this.c = djeVar;
        this.d = n2kVar;
        es6 es6Var = new es6();
        es6Var.c = this;
        es6Var.a = new ArrayList();
        es6Var.b = new ArrayList();
        this.e = es6Var;
        this.h = pjeVar.c.j0().A();
        this.j = 1.0f;
    }

    public final void a(int i, float f) {
        float f2;
        boolean z;
        float f3;
        float f4;
        float f5;
        Throwable th;
        int i2;
        sje sjeVar;
        float f6;
        float f7;
        Throwable th2;
        int i3;
        es6 es6Var = this.e;
        ArrayList arrayList = (ArrayList) es6Var.a;
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) es6Var.b;
        arrayList2.clear();
        tje tjeVar = (tje) es6Var.c;
        int i4 = tjeVar.f;
        n2k n2kVar = tjeVar.d;
        if (i4 <= 0) {
            return;
        }
        a H = wyf.H(n2kVar, 0, i4);
        int i5 = H.a;
        Iterator it = H.iterator();
        while (true) {
            f2 = 0.0f;
            z = true;
            f3 = 2.0f;
            f4 = 1.0f;
            if (!it.hasNext()) {
                break;
            }
            int nextInt = ((rpe) it).nextInt();
            dje djeVar = tjeVar.c;
            weo c = djeVar.c(nextInt);
            float f8 = tjeVar.j;
            weo weoVar = c;
            if (f8 != 1.0f) {
                boolean z2 = c instanceof mje;
                weoVar = c;
                if (z2) {
                    mje mjeVar = (mje) c;
                    mje W = mje.W(mjeVar, mjeVar.i * f8, 0.0f, 6);
                    djeVar.j(W.i);
                    weoVar = W;
                }
            }
            weo weoVar2 = weoVar;
            arrayList.add(new sje(nextInt, nextInt == i, nextInt == i5 ? weoVar2.A() / 2.0f : ((sje) CollectionsKt.Y(arrayList)).c + tjeVar.i, weoVar2, 1.0f));
        }
        int size = arrayList.size();
        int i6 = tjeVar.g;
        int i7 = tjeVar.k;
        if (size <= i6) {
            sje sjeVar2 = (sje) CollectionsKt.Y(arrayList);
            f5 = (i7 / 2.0f) - (((sjeVar2.d.A() / 2.0f) + sjeVar2.c) / 2);
        } else {
            float f9 = i7 / 2.0f;
            if (wyf.N(n2kVar)) {
                f5 = (tjeVar.i * f) + (f9 - (i == -1 ? 0.0f : ((sje) arrayList.get((arrayList.size() - 1) - i)).c));
            } else {
                f5 = (f9 - (i == -1 ? 0.0f : ((sje) arrayList.get(i)).c)) - (tjeVar.i * f);
            }
            if (tjeVar.g % 2 == 0) {
                f5 += tjeVar.i / 2;
            }
        }
        ArrayList arrayList3 = new ArrayList(v75.o(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (true) {
            th = null;
            if (!it2.hasNext()) {
                break;
            }
            sje sjeVar3 = (sje) it2.next();
            arrayList3.add(sje.a(sjeVar3, sjeVar3.c + f5, null, 0.0f, 27));
        }
        ArrayList arrayList4 = new ArrayList(arrayList3);
        if (arrayList4.size() > tjeVar.g) {
            fq4 fq4Var = new fq4(0.0f, tjeVar.k);
            sje sjeVar4 = (sje) CollectionsKt.Q(arrayList4);
            if (fq4Var.b(Float.valueOf(sjeVar4.c - (sjeVar4.d.A() / 2.0f)))) {
                sje sjeVar5 = (sje) CollectionsKt.Q(arrayList4);
                float f10 = -(sjeVar5.c - (sjeVar5.d.A() / 2.0f));
                Iterator it3 = arrayList4.iterator();
                int i8 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        u75.n();
                        throw null;
                    }
                    sje sjeVar6 = (sje) next;
                    arrayList4.set(i8, sje.a(sjeVar6, sjeVar6.c + f10, null, 0.0f, 27));
                    i8 = i9;
                }
            } else {
                sje sjeVar7 = (sje) CollectionsKt.Y(arrayList4);
                if (fq4Var.b(Float.valueOf((sjeVar7.d.A() / 2.0f) + sjeVar7.c))) {
                    float f11 = tjeVar.k;
                    sje sjeVar8 = (sje) CollectionsKt.Y(arrayList4);
                    float A = f11 - ((sjeVar8.d.A() / 2.0f) + sjeVar8.c);
                    Iterator it4 = arrayList4.iterator();
                    int i10 = 0;
                    while (it4.hasNext()) {
                        Object next2 = it4.next();
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            u75.n();
                            throw null;
                        }
                        sje sjeVar9 = (sje) next2;
                        arrayList4.set(i10, sje.a(sjeVar9, sjeVar9.c + A, null, 0.0f, 27));
                        i10 = i11;
                        z = z;
                    }
                }
            }
            boolean z3 = z;
            z75.z(arrayList4, new kma(19, fq4Var));
            if (!arrayList4.isEmpty()) {
                float f12 = tjeVar.n;
                wdp wdpVar = tjeVar.a.d;
                boolean z4 = (tjeVar.g != 3 || (((f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1)) != 0 || ((i3 = tjeVar.m) != 0 && i3 != tjeVar.f + (-1))) ? false : z3)) ? false : z3;
                Iterator it5 = arrayList4.iterator();
                int i12 = 0;
                while (it5.hasNext()) {
                    Object next3 = it5.next();
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        Throwable th3 = th;
                        u75.n();
                        throw th3;
                    }
                    sje sjeVar10 = (sje) next3;
                    if (z4 && (i12 == 0 || i12 == arrayList4.size() - 1)) {
                        f6 = f3;
                        f7 = f4;
                        th2 = th;
                    } else {
                        float f13 = sjeVar10.c;
                        f6 = f3;
                        float f14 = tjeVar.i + f2;
                        if (f13 > f14) {
                            float f15 = tjeVar.k - f13;
                            f13 = f15 > f14 ? f14 : f15;
                        }
                        float c2 = f13 > f14 ? f4 : yhn.c(f13 / (f14 - f2), f2, f4);
                        int i14 = sjeVar10.a;
                        if (i14 == 0 || i14 == tjeVar.f - 1 || sjeVar10.b) {
                            f7 = f4;
                            th2 = null;
                            sjeVar10 = sje.a(sjeVar10, f2, null, c2, 15);
                        } else {
                            weo weoVar3 = sjeVar10.d;
                            float A2 = weoVar3.A() * c2;
                            f7 = f4;
                            if (A2 <= wdpVar.j0().A()) {
                                sjeVar10 = sje.a(sjeVar10, f2, wdpVar.j0(), c2, 7);
                            } else if (A2 < weoVar3.A()) {
                                if (weoVar3 instanceof mje) {
                                    mje mjeVar2 = (mje) weoVar3;
                                    sjeVar10 = sje.a(sjeVar10, 0.0f, mje.W(mjeVar2, A2, (A2 / mjeVar2.i) * mjeVar2.j, 4), c2, 7);
                                } else if (!(weoVar3 instanceof lje)) {
                                    b6e.s();
                                    return;
                                } else {
                                    sjeVar10 = sje.a(sjeVar10, f2, new lje((weoVar3.A() * c2) / f6), c2, 7);
                                }
                            }
                            th2 = null;
                        }
                        arrayList4.set(i12, sjeVar10);
                    }
                    th = th2;
                    i12 = i13;
                    f3 = f6;
                    f4 = f7;
                    f2 = 0.0f;
                }
                float f16 = f4;
                Iterator it6 = arrayList4.iterator();
                int i15 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i15 = -1;
                        break;
                    } else if (((sje) it6.next()).e == f16) {
                        break;
                    } else {
                        i15++;
                    }
                }
                Integer valueOf = Integer.valueOf(i15);
                if (i15 < 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    ListIterator listIterator = arrayList4.listIterator(arrayList4.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            i2 = -1;
                            break;
                        } else if (((sje) listIterator.previous()).e == f16) {
                            i2 = listIterator.nextIndex();
                            break;
                        }
                    }
                    Integer valueOf2 = Integer.valueOf(i2);
                    if (i2 < 0) {
                        valueOf2 = null;
                    }
                    if (valueOf2 != null) {
                        int i16 = intValue - 1;
                        int intValue2 = valueOf2.intValue() + 1;
                        Iterator it7 = arrayList4.iterator();
                        int i17 = 0;
                        while (it7.hasNext()) {
                            Object next4 = it7.next();
                            int i18 = i17 + 1;
                            if (i17 < 0) {
                                u75.n();
                                throw null;
                            }
                            sje sjeVar11 = (sje) next4;
                            if (i17 < i16) {
                                sje sjeVar12 = (sje) CollectionsKt.S(arrayList4, i16);
                                if (sjeVar12 != null) {
                                    arrayList4.set(i17, sje.a(sjeVar11, sjeVar11.c - (tjeVar.i * (f16 - sjeVar12.e)), null, 0.0f, 27));
                                }
                                i17 = i18;
                            }
                            if (i17 > intValue2 && (sjeVar = (sje) CollectionsKt.S(arrayList4, intValue2)) != null) {
                                arrayList4.set(i17, sje.a(sjeVar11, sjeVar11.c + (tjeVar.i * (f16 - sjeVar.e)), null, 0.0f, 27));
                                i17 = i18;
                            }
                            i17 = i18;
                        }
                    }
                }
            }
        }
        arrayList2.addAll(arrayList4);
    }

    public final void b() {
        int i;
        kje kjeVar = this.a.e;
        if (kjeVar instanceof ije) {
            i = (int) (this.k / ((ije) kjeVar).a);
        } else {
            if (!(kjeVar instanceof jje)) {
                b6e.s();
                return;
            }
            i = ((jje) kjeVar).b;
        }
        int i2 = this.f;
        if (i > i2) {
            i = i2;
        }
        this.g = i;
    }

    public final void c(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return;
        }
        this.k = i;
        this.l = i2;
        b();
        pje pjeVar = this.a;
        kje kjeVar = pjeVar.e;
        if (kjeVar instanceof ije) {
            this.i = ((ije) kjeVar).a;
            this.j = 1.0f;
        } else if (kjeVar instanceof jje) {
            float f = this.k;
            float f2 = ((jje) kjeVar).a;
            float f3 = (f + f2) / this.g;
            this.i = f3;
            this.j = (f3 - f2) / pjeVar.b.j0().A();
        }
        this.c.g(this.i);
        this.h = i2 / 2.0f;
        a(this.m, this.n);
    }
}
