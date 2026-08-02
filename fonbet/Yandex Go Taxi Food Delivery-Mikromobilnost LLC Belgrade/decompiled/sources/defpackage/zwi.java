package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.a;
import androidx.constraintlayout.core.widgets.analyzer.c;
import androidx.constraintlayout.core.widgets.analyzer.e;
import androidx.constraintlayout.core.widgets.analyzer.g;
import androidx.constraintlayout.core.widgets.analyzer.h;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.widget.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zwi {
    public d a;
    public boolean b;
    public boolean c;
    public d d;
    public ArrayList e;
    public ae5 f;
    public zd5 g;
    public ArrayList h;

    public final void a(a aVar, int i, ArrayList arrayList, rkl0 rkl0Var) {
        h hVar = aVar.d;
        rkl0 rkl0Var2 = hVar.c;
        a aVar2 = hVar.i;
        a aVar3 = hVar.h;
        if (rkl0Var2 == null) {
            d dVar = this.a;
            if (hVar == dVar.d || hVar == dVar.e) {
                return;
            }
            if (rkl0Var == null) {
                rkl0Var = new rkl0(hVar);
                arrayList.add(rkl0Var);
            }
            hVar.c = rkl0Var;
            rkl0Var.a(hVar);
            Iterator it = aVar3.k.iterator();
            while (it.hasNext()) {
                xwi xwiVar = (xwi) it.next();
                if (xwiVar instanceof a) {
                    a((a) xwiVar, i, arrayList, rkl0Var);
                }
            }
            Iterator it2 = aVar2.k.iterator();
            while (it2.hasNext()) {
                xwi xwiVar2 = (xwi) it2.next();
                if (xwiVar2 instanceof a) {
                    a((a) xwiVar2, i, arrayList, rkl0Var);
                }
            }
            if (i == 1 && (hVar instanceof g)) {
                Iterator it3 = ((g) hVar).k.k.iterator();
                while (it3.hasNext()) {
                    xwi xwiVar3 = (xwi) it3.next();
                    if (xwiVar3 instanceof a) {
                        a((a) xwiVar3, i, arrayList, rkl0Var);
                    }
                }
            }
            Iterator it4 = aVar3.l.iterator();
            while (it4.hasNext()) {
                a((a) it4.next(), i, arrayList, rkl0Var);
            }
            Iterator it5 = aVar2.l.iterator();
            while (it5.hasNext()) {
                a((a) it5.next(), i, arrayList, rkl0Var);
            }
            if (i == 1 && (hVar instanceof g)) {
                Iterator it6 = ((g) hVar).k.l.iterator();
                while (it6.hasNext()) {
                    a((a) it6.next(), i, arrayList, rkl0Var);
                }
            }
        }
    }

    public final void b(d dVar) {
        char c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        Iterator it = dVar.u0.iterator();
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.U;
            b7e[] b7eVarArr = constraintWidget.R;
            b7e b7eVar = constraintWidget.M;
            b7e b7eVar2 = constraintWidget.K;
            b7e b7eVar3 = constraintWidget.L;
            b7e b7eVar4 = constraintWidget.J;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr[1];
            if (constraintWidget.i0 == 8) {
                constraintWidget.a = true;
            } else {
                float f = constraintWidget.w;
                if (f < 1.0f && dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.r = 2;
                }
                float f2 = constraintWidget.z;
                if (f2 < 1.0f) {
                    c = 0;
                    if (dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.s = 2;
                    }
                } else {
                    c = 0;
                }
                if (constraintWidget.Y > 0.0f) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour5 == dimensionBehaviour7 && (dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.r = 3;
                    } else if (dimensionBehaviour6 == dimensionBehaviour7 && (dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.s = 3;
                    } else if (dimensionBehaviour5 == dimensionBehaviour7 && dimensionBehaviour6 == dimensionBehaviour7) {
                        if (constraintWidget.r == 0) {
                            constraintWidget.r = 3;
                        }
                        if (constraintWidget.s == 0) {
                            constraintWidget.s = 3;
                        }
                    }
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour5 == dimensionBehaviour8 && constraintWidget.r == 1 && (b7eVar4.f == null || b7eVar3.f == null)) {
                    dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                if (dimensionBehaviour6 == dimensionBehaviour8 && constraintWidget.s == 1 && (b7eVar2.f == null || b7eVar.f == null)) {
                    dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                e eVar = constraintWidget.d;
                eVar.d = dimensionBehaviour5;
                int i = constraintWidget.r;
                eVar.a = i;
                g gVar = constraintWidget.e;
                gVar.d = dimensionBehaviour6;
                int i2 = constraintWidget.s;
                gVar.a = i2;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                Iterator it2 = it;
                if ((dimensionBehaviour5 == dimensionBehaviour9 || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour6 == dimensionBehaviour9 || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = dimensionBehaviour6;
                    int s = constraintWidget.s();
                    if (dimensionBehaviour5 == dimensionBehaviour9) {
                        s = (dVar.s() - b7eVar4.g) - b7eVar3.g;
                        dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    int m = constraintWidget.m();
                    if (dimensionBehaviour10 == dimensionBehaviour9) {
                        m = (dVar.m() - b7eVar2.g) - b7eVar.g;
                        dimensionBehaviour10 = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    f(constraintWidget, dimensionBehaviour5, s, dimensionBehaviour10, m);
                    constraintWidget.d.e.d(constraintWidget.s());
                    constraintWidget.e.e.d(constraintWidget.m());
                    constraintWidget.a = true;
                } else {
                    if (dimensionBehaviour5 != dimensionBehaviour8 || (dimensionBehaviour6 != (dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && dimensionBehaviour6 != ConstraintWidget.DimensionBehaviour.FIXED)) {
                        dimensionBehaviour = dimensionBehaviour6;
                    } else if (i == 3) {
                        if (dimensionBehaviour6 == dimensionBehaviour4) {
                            f(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour4, 0);
                        }
                        int m2 = constraintWidget.m();
                        int i3 = (int) ((m2 * constraintWidget.Y) + 0.5f);
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = ConstraintWidget.DimensionBehaviour.FIXED;
                        f(constraintWidget, dimensionBehaviour11, i3, dimensionBehaviour11, m2);
                        constraintWidget.d.e.d(constraintWidget.s());
                        constraintWidget.e.e.d(constraintWidget.m());
                        constraintWidget.a = true;
                    } else if (i == 1) {
                        f(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour6, 0);
                        constraintWidget.d.e.m = constraintWidget.s();
                    } else {
                        dimensionBehaviour = dimensionBehaviour6;
                        if (i == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = dVar.U[c];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour12 == dimensionBehaviour13 || dimensionBehaviour12 == dimensionBehaviour9) {
                                f(constraintWidget, dimensionBehaviour13, (int) ((f * dVar.s()) + 0.5f), dimensionBehaviour, constraintWidget.m());
                                constraintWidget.d.e.d(constraintWidget.s());
                                constraintWidget.e.e.d(constraintWidget.m());
                                constraintWidget.a = true;
                            }
                        } else if (b7eVarArr[c].f == null || b7eVarArr[1].f == null) {
                            f(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour, 0);
                            constraintWidget.d.e.d(constraintWidget.s());
                            constraintWidget.e.e.d(constraintWidget.m());
                            constraintWidget.a = true;
                        }
                    }
                    if (dimensionBehaviour != dimensionBehaviour8 || (dimensionBehaviour5 != (dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && dimensionBehaviour5 != ConstraintWidget.DimensionBehaviour.FIXED)) {
                        dimensionBehaviour2 = dimensionBehaviour;
                    } else if (i2 == 3) {
                        if (dimensionBehaviour5 == dimensionBehaviour3) {
                            f(constraintWidget, dimensionBehaviour3, 0, dimensionBehaviour3, 0);
                        }
                        int s2 = constraintWidget.s();
                        float f3 = constraintWidget.Y;
                        if (constraintWidget.Z == -1) {
                            f3 = 1.0f / f3;
                        }
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = ConstraintWidget.DimensionBehaviour.FIXED;
                        f(constraintWidget, dimensionBehaviour14, s2, dimensionBehaviour14, (int) ((s2 * f3) + 0.5f));
                        constraintWidget.d.e.d(constraintWidget.s());
                        constraintWidget.e.e.d(constraintWidget.m());
                        constraintWidget.a = true;
                    } else if (i2 == 1) {
                        f(constraintWidget, dimensionBehaviour5, 0, dimensionBehaviour3, 0);
                        constraintWidget.e.e.m = constraintWidget.m();
                    } else {
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = dimensionBehaviour5;
                        if (i2 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = dVar.U[1];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = dimensionBehaviour;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour16 == dimensionBehaviour18 || dimensionBehaviour16 == dimensionBehaviour9) {
                                f(constraintWidget, dimensionBehaviour15, constraintWidget.s(), dimensionBehaviour18, (int) ((f2 * dVar.m()) + 0.5f));
                                constraintWidget.d.e.d(constraintWidget.s());
                                constraintWidget.e.e.d(constraintWidget.m());
                                constraintWidget.a = true;
                            } else {
                                dimensionBehaviour2 = dimensionBehaviour17;
                                dimensionBehaviour5 = dimensionBehaviour15;
                            }
                        } else {
                            dimensionBehaviour5 = dimensionBehaviour15;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour19 = dimensionBehaviour;
                            if (b7eVarArr[2].f == null || b7eVarArr[3].f == null) {
                                f(constraintWidget, dimensionBehaviour3, 0, dimensionBehaviour19, 0);
                                constraintWidget.d.e.d(constraintWidget.s());
                                constraintWidget.e.e.d(constraintWidget.m());
                                constraintWidget.a = true;
                            } else {
                                dimensionBehaviour2 = dimensionBehaviour19;
                            }
                        }
                    }
                    if (dimensionBehaviour5 == dimensionBehaviour8 && dimensionBehaviour2 == dimensionBehaviour8) {
                        if (i == 1 || i2 == 1) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour20 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            f(constraintWidget, dimensionBehaviour20, 0, dimensionBehaviour20, 0);
                            constraintWidget.d.e.m = constraintWidget.s();
                            constraintWidget.e.e.m = constraintWidget.m();
                        } else if (i2 == 2 && i == 2) {
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = dVar.U;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour21 = dimensionBehaviourArr2[c];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour22 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour21 == dimensionBehaviour22 && dimensionBehaviourArr2[1] == dimensionBehaviour22) {
                                f(constraintWidget, dimensionBehaviour22, (int) ((f * dVar.s()) + 0.5f), dimensionBehaviour22, (int) ((f2 * dVar.m()) + 0.5f));
                                constraintWidget.d.e.d(constraintWidget.s());
                                constraintWidget.e.e.d(constraintWidget.m());
                                constraintWidget.a = true;
                            }
                        }
                    }
                }
                it = it2;
            }
        }
    }

    public final void c() {
        d dVar = this.a;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.e;
        arrayList2.clear();
        d dVar2 = this.d;
        dVar2.d.f();
        dVar2.e.f();
        arrayList2.add(dVar2.d);
        arrayList2.add(dVar2.e);
        Iterator it = dVar2.u0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.g) {
                arrayList2.add(new o4u((androidx.constraintlayout.core.widgets.g) constraintWidget));
            } else {
                if (constraintWidget.z()) {
                    if (constraintWidget.b == null) {
                        constraintWidget.b = new n89(constraintWidget, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.b);
                } else {
                    arrayList2.add(constraintWidget.d);
                }
                if (constraintWidget.A()) {
                    if (constraintWidget.c == null) {
                        constraintWidget.c = new n89(constraintWidget, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.c);
                } else {
                    arrayList2.add(constraintWidget.e);
                }
                if (constraintWidget instanceof nfu) {
                    arrayList2.add(new c(constraintWidget));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((h) it2.next()).f();
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            h hVar = (h) it3.next();
            if (hVar.b != dVar2) {
                hVar.d();
            }
        }
        arrayList.clear();
        e(dVar.d, 0, arrayList);
        e(dVar.e, 1, arrayList);
        this.b = false;
    }

    public final int d(d dVar, int i) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, ((rkl0) arrayList.get(i2)).b(dVar, i));
        }
        return (int) j;
    }

    public final void e(h hVar, int i, ArrayList arrayList) {
        a aVar = hVar.h;
        a aVar2 = hVar.i;
        Iterator it = aVar.k.iterator();
        while (it.hasNext()) {
            xwi xwiVar = (xwi) it.next();
            if (xwiVar instanceof a) {
                a((a) xwiVar, i, arrayList, null);
            } else if (xwiVar instanceof h) {
                a(((h) xwiVar).h, i, arrayList, null);
            }
        }
        Iterator it2 = aVar2.k.iterator();
        while (it2.hasNext()) {
            xwi xwiVar2 = (xwi) it2.next();
            if (xwiVar2 instanceof a) {
                a((a) xwiVar2, i, arrayList, null);
            } else if (xwiVar2 instanceof h) {
                a(((h) xwiVar2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((g) hVar).k.k.iterator();
            while (it3.hasNext()) {
                xwi xwiVar3 = (xwi) it3.next();
                if (xwiVar3 instanceof a) {
                    a((a) xwiVar3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        zd5 zd5Var = this.g;
        zd5Var.a = dimensionBehaviour;
        zd5Var.b = dimensionBehaviour2;
        zd5Var.c = i;
        zd5Var.d = i2;
        ((b) this.f).b(constraintWidget, zd5Var);
        constraintWidget.Q(zd5Var.e);
        constraintWidget.N(zd5Var.f);
        constraintWidget.E = zd5Var.h;
        constraintWidget.K(zd5Var.g);
    }

    public final void g() {
        zwi zwiVar;
        sd5 sd5Var;
        Iterator it = this.a.u0.iterator();
        while (it.hasNext()) {
            ConstraintWidget constraintWidget = (ConstraintWidget) it.next();
            if (!constraintWidget.a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.U;
                boolean z = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i = constraintWidget.r;
                int i2 = constraintWidget.s;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z2 = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i == 1);
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                androidx.constraintlayout.core.widgets.analyzer.b bVar = constraintWidget.d.e;
                boolean z3 = bVar.j;
                androidx.constraintlayout.core.widgets.analyzer.b bVar2 = constraintWidget.e.e;
                boolean z4 = bVar2.j;
                if (z3 && z4) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    zwiVar = this;
                    zwiVar.f(constraintWidget, dimensionBehaviour4, bVar.g, dimensionBehaviour4, bVar2.g);
                    constraintWidget.a = true;
                } else if (z3 && z) {
                    zwiVar = this;
                    zwiVar.f(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, bVar.g, dimensionBehaviour3, bVar2.g);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    g gVar = constraintWidget.e;
                    if (dimensionBehaviour2 == dimensionBehaviour5) {
                        gVar.e.m = constraintWidget.m();
                    } else {
                        gVar.e.d(constraintWidget.m());
                        constraintWidget.a = true;
                    }
                } else {
                    zwiVar = this;
                    if (z4 && z2) {
                        zwiVar.f(constraintWidget, dimensionBehaviour3, bVar.g, ConstraintWidget.DimensionBehaviour.FIXED, bVar2.g);
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        e eVar = constraintWidget.d;
                        if (dimensionBehaviour == dimensionBehaviour6) {
                            eVar.e.m = constraintWidget.s();
                        } else {
                            eVar.e.d(constraintWidget.s());
                            constraintWidget.a = true;
                        }
                    }
                }
                if (constraintWidget.a && (sd5Var = constraintWidget.e.l) != null) {
                    sd5Var.d(constraintWidget.c0);
                }
                this = zwiVar;
            }
        }
    }
}
