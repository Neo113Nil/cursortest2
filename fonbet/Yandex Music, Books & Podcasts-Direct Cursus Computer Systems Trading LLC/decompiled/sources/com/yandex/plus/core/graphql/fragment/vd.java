package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class vd implements defpackage.pj {
    public static final List a = u75.h("color", "opacity", "position");

    public static ud c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        Integer num = null;
        Double d = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                num = (Integer) defpackage.uj.k.b(a7fVar, fx6Var);
            } else {
                if (z0 != 2) {
                    str.getClass();
                    d.getClass();
                    return new ud(str, num, d.doubleValue());
                }
                d = (Double) defpackage.uj.c.b(a7fVar, fx6Var);
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, ud udVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        udVar.getClass();
        r7fVar.Z("color");
        defpackage.uj.a.a(r7fVar, fx6Var, udVar.a);
        r7fVar.Z("opacity");
        defpackage.uj.k.a(r7fVar, fx6Var, udVar.b);
        r7fVar.Z("position");
        defpackage.uj.c.a(r7fVar, fx6Var, Double.valueOf(udVar.c));
    }
}
