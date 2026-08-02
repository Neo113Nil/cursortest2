package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class y0 implements defpackage.pj {
    public static final List a = u75.h("name", "fallback");

    public static l0 c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        k0 k0Var = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    str.getClass();
                    k0Var.getClass();
                    return new l0(str, k0Var);
                }
                x0 x0Var = x0.a;
                defpackage.tj tjVar = defpackage.uj.a;
                k0Var = (k0) new qhj(x0Var, false).b(a7fVar, fx6Var);
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, l0 l0Var) {
        r7fVar.getClass();
        fx6Var.getClass();
        l0Var.getClass();
        r7fVar.Z("name");
        defpackage.uj.a.a(r7fVar, fx6Var, l0Var.a);
        r7fVar.Z("fallback");
        x0 x0Var = x0.a;
        k0 k0Var = l0Var.b;
        r7fVar.j();
        x0Var.a(r7fVar, fx6Var, k0Var);
        r7fVar.p();
    }
}
