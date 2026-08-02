package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class b8 implements defpackage.pj {
    public static final List a = u75.h("relativeCenter", "relativeRadius");

    public static t7 c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        u7 u7Var = null;
        v7 v7Var = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                c8 c8Var = c8.a;
                defpackage.tj tjVar = defpackage.uj.a;
                u7Var = (u7) new qhj(c8Var, false).b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    u7Var.getClass();
                    v7Var.getClass();
                    return new t7(u7Var, v7Var);
                }
                d8 d8Var = d8.a;
                defpackage.tj tjVar2 = defpackage.uj.a;
                v7Var = (v7) new qhj(d8Var, false).b(a7fVar, fx6Var);
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, t7 t7Var) {
        r7fVar.getClass();
        fx6Var.getClass();
        t7Var.getClass();
        r7fVar.Z("relativeCenter");
        c8 c8Var = c8.a;
        defpackage.tj tjVar = defpackage.uj.a;
        u7 u7Var = t7Var.a;
        r7fVar.j();
        c8Var.a(r7fVar, fx6Var, u7Var);
        r7fVar.p();
        r7fVar.Z("relativeRadius");
        d8 d8Var = d8.a;
        v7 v7Var = t7Var.b;
        r7fVar.j();
        d8Var.a(r7fVar, fx6Var, v7Var);
        r7fVar.p();
    }
}
