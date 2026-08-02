package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.tlm;
import defpackage.u75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class a1 implements defpackage.pj {
    public static final List a = u75.h("angle", "relativeCenter", "relativeRadius", "colors");

    public static n0 c(a7f a7fVar, fx6 fx6Var) {
        Object b;
        a7fVar.getClass();
        fx6Var.getClass();
        Double d = null;
        p0 p0Var = null;
        q0 q0Var = null;
        ArrayList arrayList = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                d = (Double) defpackage.uj.c.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                c1 c1Var = c1.a;
                defpackage.tj tjVar = defpackage.uj.a;
                p0Var = (p0) new qhj(c1Var, false).b(a7fVar, fx6Var);
            } else if (z0 == 2) {
                d1 d1Var = d1.a;
                defpackage.tj tjVar2 = defpackage.uj.a;
                q0Var = (q0) new qhj(d1Var, false).b(a7fVar, fx6Var);
            } else {
                if (z0 != 3) {
                    d.getClass();
                    double doubleValue = d.doubleValue();
                    p0Var.getClass();
                    q0Var.getClass();
                    arrayList.getClass();
                    return new n0(doubleValue, p0Var, q0Var, arrayList);
                }
                t0 t0Var = t0.a;
                defpackage.tj tjVar3 = defpackage.uj.a;
                qhj qhjVar = new qhj(t0Var, false);
                arrayList = tlm.n(a7fVar);
                while (a7fVar.hasNext()) {
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        b = null;
                    } else {
                        b = qhjVar.b(a7fVar, fx6Var);
                    }
                    arrayList.add(b);
                }
                a7fVar.l();
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, n0 n0Var) {
        r7fVar.getClass();
        fx6Var.getClass();
        n0Var.getClass();
        r7fVar.Z("angle");
        defpackage.uj.c.a(r7fVar, fx6Var, Double.valueOf(n0Var.a));
        r7fVar.Z("relativeCenter");
        c1 c1Var = c1.a;
        p0 p0Var = n0Var.b;
        r7fVar.j();
        c1Var.a(r7fVar, fx6Var, p0Var);
        r7fVar.p();
        r7fVar.Z("relativeRadius");
        d1 d1Var = d1.a;
        q0 q0Var = n0Var.c;
        r7fVar.j();
        d1Var.a(r7fVar, fx6Var, q0Var);
        r7fVar.p();
        r7fVar.Z("colors");
        qhj qhjVar = new qhj(t0.a, false);
        ArrayList arrayList = n0Var.d;
        r7fVar.m();
        for (Object obj : arrayList) {
            if (obj == null) {
                r7fVar.B0();
            } else {
                qhjVar.a(r7fVar, fx6Var, obj);
            }
        }
        r7fVar.l();
    }
}
