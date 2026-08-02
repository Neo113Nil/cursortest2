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
public abstract class z0 implements defpackage.pj {
    public static final List a = u75.h("angle", "colors");

    public static m0 c(a7f a7fVar, fx6 fx6Var) {
        Object b;
        a7fVar.getClass();
        fx6Var.getClass();
        Double d = null;
        ArrayList arrayList = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                d = (Double) defpackage.uj.c.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    d.getClass();
                    double doubleValue = d.doubleValue();
                    arrayList.getClass();
                    return new m0(doubleValue, arrayList);
                }
                v0 v0Var = v0.a;
                defpackage.tj tjVar = defpackage.uj.a;
                qhj qhjVar = new qhj(v0Var, false);
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

    public static void d(r7f r7fVar, fx6 fx6Var, m0 m0Var) {
        r7fVar.getClass();
        fx6Var.getClass();
        m0Var.getClass();
        r7fVar.Z("angle");
        defpackage.uj.c.a(r7fVar, fx6Var, Double.valueOf(m0Var.a));
        r7fVar.Z("colors");
        qhj qhjVar = new qhj(v0.a, false);
        ArrayList arrayList = m0Var.b;
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
