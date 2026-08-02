package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class d1 implements defpackage.pj {
    public static final d1 a = new d1();
    public static final List b = u75.h("x", "y");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        q0 q0Var = (q0) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        q0Var.getClass();
        r7fVar.Z("x");
        defpackage.tj tjVar = defpackage.uj.c;
        tjVar.a(r7fVar, fx6Var, Double.valueOf(q0Var.a));
        r7fVar.Z("y");
        tjVar.a(r7fVar, fx6Var, Double.valueOf(q0Var.b));
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        Double d = null;
        Double d2 = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                d = (Double) defpackage.uj.c.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    d.getClass();
                    double doubleValue = d.doubleValue();
                    d2.getClass();
                    return new q0(doubleValue, d2.doubleValue());
                }
                d2 = (Double) defpackage.uj.c.b(a7fVar, fx6Var);
            }
        }
    }
}
