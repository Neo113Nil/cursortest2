package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class c8 implements defpackage.pj {
    public static final c8 a = new c8();
    public static final List b = u75.h("x", "y");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        u7 u7Var = (u7) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        u7Var.getClass();
        r7fVar.Z("x");
        defpackage.tj tjVar = defpackage.uj.c;
        tjVar.a(r7fVar, fx6Var, Double.valueOf(u7Var.a));
        r7fVar.Z("y");
        tjVar.a(r7fVar, fx6Var, Double.valueOf(u7Var.b));
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
                    return new u7(doubleValue, d2.doubleValue());
                }
                d2 = (Double) defpackage.uj.c.b(a7fVar, fx6Var);
            }
        }
    }
}
