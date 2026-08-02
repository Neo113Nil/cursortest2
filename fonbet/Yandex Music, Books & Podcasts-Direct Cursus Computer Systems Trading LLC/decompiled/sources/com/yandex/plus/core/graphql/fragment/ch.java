package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ch implements defpackage.pj {
    public static final List a = u75.h("x", "y");

    public static bh c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        Double d = null;
        Double d2 = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                d = (Double) defpackage.uj.c.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    d.getClass();
                    double doubleValue = d.doubleValue();
                    d2.getClass();
                    return new bh(doubleValue, d2.doubleValue());
                }
                d2 = (Double) defpackage.uj.c.b(a7fVar, fx6Var);
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, bh bhVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        bhVar.getClass();
        r7fVar.Z("x");
        defpackage.tj tjVar = defpackage.uj.c;
        tjVar.a(r7fVar, fx6Var, Double.valueOf(bhVar.a));
        r7fVar.Z("y");
        tjVar.a(r7fVar, fx6Var, Double.valueOf(bhVar.b));
    }
}
