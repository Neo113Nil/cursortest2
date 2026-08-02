package com.yandex.plus.core.graphql.adapter;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import defpackage.tj;
import defpackage.uj;
import java.util.List;

/* loaded from: classes4.dex */
public final class e1 implements pj {
    public static final e1 a = new e1();
    public static final List b = t75.c("agreement");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.o1 o1Var = (com.yandex.plus.core.graphql.o1) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        o1Var.getClass();
        r7fVar.Z("agreement");
        z0 z0Var = z0.a;
        tj tjVar = uj.a;
        qhj qhjVar = new qhj(z0Var, false);
        com.yandex.plus.core.graphql.j1 j1Var = o1Var.a;
        if (j1Var == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, j1Var);
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        Object b2;
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.j1 j1Var = null;
        while (a7fVar.z0(b) == 0) {
            z0 z0Var = z0.a;
            tj tjVar = uj.a;
            qhj qhjVar = new qhj(z0Var, false);
            if (a7fVar.peek() == 10) {
                a7fVar.w();
                b2 = null;
            } else {
                b2 = qhjVar.b(a7fVar, fx6Var);
            }
            j1Var = (com.yandex.plus.core.graphql.j1) b2;
        }
        return new com.yandex.plus.core.graphql.o1(j1Var);
    }
}
