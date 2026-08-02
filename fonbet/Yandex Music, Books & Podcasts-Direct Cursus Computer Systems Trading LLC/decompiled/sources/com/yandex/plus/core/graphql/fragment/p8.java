package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class p8 implements defpackage.pj {
    public static final List a = u75.h("a", "hex");

    public static o8 c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        Double d = null;
        String str = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                d = (Double) defpackage.uj.c.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    d.getClass();
                    double doubleValue = d.doubleValue();
                    str.getClass();
                    return new o8(doubleValue, str);
                }
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, o8 o8Var) {
        r7fVar.getClass();
        fx6Var.getClass();
        o8Var.getClass();
        r7fVar.Z("a");
        defpackage.uj.c.a(r7fVar, fx6Var, Double.valueOf(o8Var.a));
        r7fVar.Z("hex");
        defpackage.uj.a.a(r7fVar, fx6Var, o8Var.b);
    }
}
