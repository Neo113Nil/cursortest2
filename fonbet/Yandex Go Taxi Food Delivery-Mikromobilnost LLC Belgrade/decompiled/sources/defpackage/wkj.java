package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.g;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class wkj {
    public static final zd5 a = new zd5();

    public static boolean a(ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.U;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[1];
        ConstraintWidget constraintWidget2 = constraintWidget.V;
        d dVar = constraintWidget2 != null ? (d) constraintWidget2 : null;
        if (dVar != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dVar.U[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (dVar != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = dVar.U[1];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.FIXED;
        boolean z = dimensionBehaviour3 == dimensionBehaviour9 || constraintWidget.C() || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour3 == (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.r == 0 && constraintWidget.Y == 0.0f && constraintWidget.v(0)) || (dimensionBehaviour3 == dimensionBehaviour2 && constraintWidget.r == 1 && constraintWidget.w(0, constraintWidget.s()));
        boolean z2 = dimensionBehaviour4 == dimensionBehaviour9 || constraintWidget.D() || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour4 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.s == 0 && constraintWidget.Y == 0.0f && constraintWidget.v(1)) || (dimensionBehaviour4 == dimensionBehaviour && constraintWidget.s == 1 && constraintWidget.w(1, constraintWidget.m()));
        return (constraintWidget.Y > 0.0f && (z || z2)) || (z && z2);
    }

    public static void b(int i, ae5 ae5Var, ConstraintWidget constraintWidget, boolean z) {
        b7e b7eVar;
        b7e b7eVar2;
        char c;
        b7e b7eVar3;
        b7e b7eVar4;
        if (constraintWidget.m) {
            return;
        }
        if (!(constraintWidget instanceof d) && constraintWidget.B() && a(constraintWidget)) {
            d.X(constraintWidget, ae5Var, new zd5());
        }
        b7e k = constraintWidget.k(ConstraintAnchor$Type.LEFT);
        b7e k2 = constraintWidget.k(ConstraintAnchor$Type.RIGHT);
        int d = k.d();
        int d2 = k2.d();
        HashSet hashSet = k.a;
        if (hashSet != null && k.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                b7e b7eVar5 = (b7e) it.next();
                ConstraintWidget constraintWidget2 = b7eVar5.d;
                int i2 = i + 1;
                boolean a2 = a(constraintWidget2);
                b7e b7eVar6 = constraintWidget2.J;
                b7e b7eVar7 = constraintWidget2.L;
                if (constraintWidget2.B() && a2) {
                    c = 0;
                    d.X(constraintWidget2, ae5Var, new zd5());
                } else {
                    c = 0;
                }
                char c2 = ((b7eVar5 == b7eVar6 && (b7eVar4 = b7eVar7.f) != null && b7eVar4.c) || (b7eVar5 == b7eVar7 && (b7eVar3 = b7eVar6.f) != null && b7eVar3.c)) ? (char) 1 : c;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget2.U[c];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour != dimensionBehaviour2 || a2) {
                    if (!constraintWidget2.B()) {
                        if (b7eVar5 == b7eVar6 && b7eVar7.f == null) {
                            int e = b7eVar6.e() + d;
                            constraintWidget2.L(e, constraintWidget2.s() + e);
                            b(i2, ae5Var, constraintWidget2, z);
                        } else if (b7eVar5 == b7eVar7 && b7eVar6.f == null) {
                            int e2 = d - b7eVar7.e();
                            constraintWidget2.L(e2 - constraintWidget2.s(), e2);
                            b(i2, ae5Var, constraintWidget2, z);
                        } else if (c2 != 0 && !constraintWidget2.z()) {
                            c(i2, ae5Var, constraintWidget2, z);
                        }
                    }
                } else if (dimensionBehaviour == dimensionBehaviour2 && constraintWidget2.v >= 0 && constraintWidget2.u >= 0 && (constraintWidget2.i0 == 8 || (constraintWidget2.r == 0 && constraintWidget2.Y == 0.0f))) {
                    if (!constraintWidget2.z() && !constraintWidget2.G && c2 != 0 && !constraintWidget2.z()) {
                        d(i2, constraintWidget, ae5Var, constraintWidget2, z);
                    }
                }
            }
        }
        if (constraintWidget instanceof g) {
            return;
        }
        HashSet hashSet2 = k2.a;
        if (hashSet2 != null && k2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                b7e b7eVar8 = (b7e) it2.next();
                ConstraintWidget constraintWidget3 = b7eVar8.d;
                int i3 = i + 1;
                boolean a3 = a(constraintWidget3);
                b7e b7eVar9 = constraintWidget3.J;
                b7e b7eVar10 = constraintWidget3.L;
                if (constraintWidget3.B() && a3) {
                    d.X(constraintWidget3, ae5Var, new zd5());
                }
                boolean z2 = (b7eVar8 == b7eVar9 && (b7eVar2 = b7eVar10.f) != null && b7eVar2.c) || (b7eVar8 == b7eVar10 && (b7eVar = b7eVar9.f) != null && b7eVar.c);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget3.U[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour3 != dimensionBehaviour4 || a3) {
                    if (!constraintWidget3.B()) {
                        if (b7eVar8 == b7eVar9 && b7eVar10.f == null) {
                            int e3 = b7eVar9.e() + d2;
                            constraintWidget3.L(e3, constraintWidget3.s() + e3);
                            b(i3, ae5Var, constraintWidget3, z);
                        } else if (b7eVar8 == b7eVar10 && b7eVar9.f == null) {
                            int e4 = d2 - b7eVar10.e();
                            constraintWidget3.L(e4 - constraintWidget3.s(), e4);
                            b(i3, ae5Var, constraintWidget3, z);
                        } else if (z2 && !constraintWidget3.z()) {
                            c(i3, ae5Var, constraintWidget3, z);
                        }
                    }
                } else if (dimensionBehaviour3 == dimensionBehaviour4 && constraintWidget3.v >= 0 && constraintWidget3.u >= 0) {
                    if (constraintWidget3.i0 == 8 || (constraintWidget3.r == 0 && constraintWidget3.Y == 0.0f)) {
                        if (!constraintWidget3.z() && !constraintWidget3.G && z2 && !constraintWidget3.z()) {
                            d(i3, constraintWidget, ae5Var, constraintWidget3, z);
                        }
                    }
                }
            }
        }
        constraintWidget.m = true;
    }

    public static void c(int i, ae5 ae5Var, ConstraintWidget constraintWidget, boolean z) {
        float f = constraintWidget.f0;
        b7e b7eVar = constraintWidget.J;
        int d = b7eVar.f.d();
        b7e b7eVar2 = constraintWidget.L;
        int d2 = b7eVar2.f.d();
        int e = b7eVar.e() + d;
        int e2 = d2 - b7eVar2.e();
        if (d == d2) {
            f = 0.5f;
        } else {
            d = e;
            d2 = e2;
        }
        int s = constraintWidget.s();
        int i2 = (d2 - d) - s;
        if (d > d2) {
            i2 = (d - d2) - s;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + d;
        int i4 = i3 + s;
        if (d > d2) {
            i4 = i3 - s;
        }
        constraintWidget.L(i3, i4);
        b(i + 1, ae5Var, constraintWidget, z);
    }

    public static void d(int i, ConstraintWidget constraintWidget, ae5 ae5Var, ConstraintWidget constraintWidget2, boolean z) {
        float f = constraintWidget2.f0;
        b7e b7eVar = constraintWidget2.J;
        int e = b7eVar.e() + b7eVar.f.d();
        b7e b7eVar2 = constraintWidget2.L;
        int d = b7eVar2.f.d() - b7eVar2.e();
        if (d >= e) {
            int s = constraintWidget2.s();
            if (constraintWidget2.i0 != 8) {
                int i2 = constraintWidget2.r;
                if (i2 == 2) {
                    s = (int) (constraintWidget2.f0 * 0.5f * (constraintWidget instanceof d ? constraintWidget.s() : constraintWidget.V.s()));
                } else if (i2 == 0) {
                    s = d - e;
                }
                s = Math.max(constraintWidget2.u, s);
                int i3 = constraintWidget2.v;
                if (i3 > 0) {
                    s = Math.min(i3, s);
                }
            }
            int i4 = e + ((int) ((f * ((d - e) - s)) + 0.5f));
            constraintWidget2.L(i4, s + i4);
            b(i + 1, ae5Var, constraintWidget2, z);
        }
    }

    public static void e(int i, ae5 ae5Var, ConstraintWidget constraintWidget) {
        float f = constraintWidget.g0;
        b7e b7eVar = constraintWidget.K;
        int d = b7eVar.f.d();
        b7e b7eVar2 = constraintWidget.M;
        int d2 = b7eVar2.f.d();
        int e = b7eVar.e() + d;
        int e2 = d2 - b7eVar2.e();
        if (d == d2) {
            f = 0.5f;
        } else {
            d = e;
            d2 = e2;
        }
        int m = constraintWidget.m();
        int i2 = (d2 - d) - m;
        if (d > d2) {
            i2 = (d - d2) - m;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = d + i3;
        int i5 = i4 + m;
        if (d > d2) {
            i4 = d - i3;
            i5 = i4 - m;
        }
        constraintWidget.M(i4, i5);
        g(i + 1, ae5Var, constraintWidget);
    }

    public static void f(int i, ConstraintWidget constraintWidget, ae5 ae5Var, ConstraintWidget constraintWidget2) {
        float f = constraintWidget2.g0;
        b7e b7eVar = constraintWidget2.K;
        int e = b7eVar.e() + b7eVar.f.d();
        b7e b7eVar2 = constraintWidget2.M;
        int d = b7eVar2.f.d() - b7eVar2.e();
        if (d >= e) {
            int m = constraintWidget2.m();
            if (constraintWidget2.i0 != 8) {
                int i2 = constraintWidget2.s;
                if (i2 == 2) {
                    m = (int) (f * 0.5f * (constraintWidget instanceof d ? constraintWidget.m() : constraintWidget.V.m()));
                } else if (i2 == 0) {
                    m = d - e;
                }
                m = Math.max(constraintWidget2.x, m);
                int i3 = constraintWidget2.y;
                if (i3 > 0) {
                    m = Math.min(i3, m);
                }
            }
            int i4 = e + ((int) ((f * ((d - e) - m)) + 0.5f));
            constraintWidget2.M(i4, m + i4);
            g(i + 1, ae5Var, constraintWidget2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g(int i, ae5 ae5Var, ConstraintWidget constraintWidget) {
        char c;
        char c2;
        b7e b7eVar;
        b7e b7eVar2;
        float f;
        b7e b7eVar3;
        b7e b7eVar4;
        if (constraintWidget.n) {
            return;
        }
        if (!(constraintWidget instanceof d) && constraintWidget.B() && a(constraintWidget)) {
            d.X(constraintWidget, ae5Var, new zd5());
        }
        b7e k = constraintWidget.k(ConstraintAnchor$Type.TOP);
        b7e k2 = constraintWidget.k(ConstraintAnchor$Type.BOTTOM);
        int d = k.d();
        int d2 = k2.d();
        HashSet hashSet = k.a;
        char c3 = 1;
        if (hashSet != null && k.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                b7e b7eVar5 = (b7e) it.next();
                ConstraintWidget constraintWidget2 = b7eVar5.d;
                int i2 = i + 1;
                boolean a2 = a(constraintWidget2);
                b7e b7eVar6 = constraintWidget2.K;
                b7e b7eVar7 = constraintWidget2.M;
                if (constraintWidget2.B() && a2) {
                    f = 0.0f;
                    d.X(constraintWidget2, ae5Var, new zd5());
                } else {
                    f = 0.0f;
                }
                char c4 = ((b7eVar5 == b7eVar6 && (b7eVar4 = b7eVar7.f) != null && b7eVar4.c) || (b7eVar5 == b7eVar7 && (b7eVar3 = b7eVar6.f) != null && b7eVar3.c)) ? c3 : (char) 0;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget2.U[c3];
                char c5 = c3;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour != dimensionBehaviour2 || a2) {
                    if (!constraintWidget2.B()) {
                        if (b7eVar5 == b7eVar6 && b7eVar7.f == null) {
                            int e = b7eVar6.e() + d;
                            constraintWidget2.M(e, constraintWidget2.m() + e);
                            g(i2, ae5Var, constraintWidget2);
                        } else if (b7eVar5 == b7eVar7 && b7eVar6.f == null) {
                            int e2 = d - b7eVar7.e();
                            constraintWidget2.M(e2 - constraintWidget2.m(), e2);
                            g(i2, ae5Var, constraintWidget2);
                        } else if (c4 != 0 && !constraintWidget2.A()) {
                            e(i2, ae5Var, constraintWidget2);
                        }
                    }
                } else if (dimensionBehaviour == dimensionBehaviour2 && constraintWidget2.y >= 0 && constraintWidget2.x >= 0 && ((constraintWidget2.i0 == 8 || (constraintWidget2.s == 0 && constraintWidget2.Y == f)) && !constraintWidget2.A() && !constraintWidget2.G && c4 != 0 && !constraintWidget2.A())) {
                    f(i2, constraintWidget, ae5Var, constraintWidget2);
                }
                c3 = c5;
            }
        }
        char c6 = c3;
        if (constraintWidget instanceof g) {
            return;
        }
        HashSet hashSet2 = k2.a;
        if (hashSet2 != null && k2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                b7e b7eVar8 = (b7e) it2.next();
                ConstraintWidget constraintWidget3 = b7eVar8.d;
                int i3 = i + 1;
                boolean a3 = a(constraintWidget3);
                b7e b7eVar9 = constraintWidget3.K;
                b7e b7eVar10 = constraintWidget3.M;
                if (constraintWidget3.B() && a3) {
                    d.X(constraintWidget3, ae5Var, new zd5());
                }
                boolean z = ((b7eVar8 == b7eVar9 && (b7eVar2 = b7eVar10.f) != null && b7eVar2.c) || (b7eVar8 == b7eVar10 && (b7eVar = b7eVar9.f) != null && b7eVar.c)) ? c6 == true ? 1 : 0 : false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget3.U[c6 == true ? 1 : 0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour3 != dimensionBehaviour4 || a3) {
                    if (!constraintWidget3.B()) {
                        if (b7eVar8 == b7eVar9 && b7eVar10.f == null) {
                            int e3 = b7eVar9.e() + d2;
                            constraintWidget3.M(e3, constraintWidget3.m() + e3);
                            g(i3, ae5Var, constraintWidget3);
                        } else if (b7eVar8 == b7eVar10 && b7eVar9.f == null) {
                            int e4 = d2 - b7eVar10.e();
                            constraintWidget3.M(e4 - constraintWidget3.m(), e4);
                            g(i3, ae5Var, constraintWidget3);
                        } else if (z && !constraintWidget3.A()) {
                            e(i3, ae5Var, constraintWidget3);
                        }
                    }
                } else if (dimensionBehaviour3 == dimensionBehaviour4 && constraintWidget3.y >= 0 && constraintWidget3.x >= 0 && (constraintWidget3.i0 == 8 || (constraintWidget3.s == 0 && constraintWidget3.Y == 0.0f))) {
                    if (!constraintWidget3.A() && !constraintWidget3.G && z && !constraintWidget3.A()) {
                        f(i3, constraintWidget, ae5Var, constraintWidget3);
                    }
                }
            }
        }
        b7e k3 = constraintWidget.k(ConstraintAnchor$Type.BASELINE);
        if (k3.a != null && k3.c) {
            int d3 = k3.d();
            Iterator it3 = k3.a.iterator();
            while (it3.hasNext()) {
                b7e b7eVar11 = (b7e) it3.next();
                ConstraintWidget constraintWidget4 = b7eVar11.d;
                int i4 = i + 1;
                boolean a4 = a(constraintWidget4);
                b7e b7eVar12 = constraintWidget4.N;
                if (constraintWidget4.B() && a4) {
                    d.X(constraintWidget4, ae5Var, new zd5());
                }
                if (constraintWidget4.U[c6 == true ? 1 : 0] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || a4) {
                    if (!constraintWidget4.B()) {
                        if (b7eVar11 == b7eVar12) {
                            int e5 = b7eVar11.e() + d3;
                            if (constraintWidget4.E) {
                                int i5 = e5 - constraintWidget4.c0;
                                int i6 = constraintWidget4.X + i5;
                                constraintWidget4.b0 = i5;
                                constraintWidget4.K.l(i5);
                                constraintWidget4.M.l(i6);
                                b7eVar12.l(e5);
                                boolean z2 = c6 == true ? 1 : 0;
                                constraintWidget4.l = z2;
                                c = z2;
                            } else {
                                c = c6 == true ? 1 : 0;
                            }
                            g(i4, ae5Var, constraintWidget4);
                            c2 = c;
                            c6 = c2;
                        }
                    }
                }
                c2 = c6 == true ? 1 : 0;
                c6 = c2;
            }
        }
        constraintWidget.n = c6;
    }
}
