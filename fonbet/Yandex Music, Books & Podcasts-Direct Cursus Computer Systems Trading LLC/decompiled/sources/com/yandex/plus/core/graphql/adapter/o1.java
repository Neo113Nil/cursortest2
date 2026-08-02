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
public final class o1 implements pj {
    public static final o1 a = new o1();
    public static final List b = t75.c("plaque");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.c2 c2Var = (com.yandex.plus.core.graphql.c2) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        c2Var.getClass();
        r7fVar.Z("plaque");
        p1 p1Var = p1.a;
        tj tjVar = uj.a;
        qhj qhjVar = new qhj(p1Var, true);
        com.yandex.plus.core.graphql.d2 d2Var = c2Var.a;
        if (d2Var == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, d2Var);
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        Object b2;
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.d2 d2Var = null;
        while (a7fVar.z0(b) == 0) {
            p1 p1Var = p1.a;
            tj tjVar = uj.a;
            qhj qhjVar = new qhj(p1Var, true);
            if (a7fVar.peek() == 10) {
                a7fVar.w();
                b2 = null;
            } else {
                b2 = qhjVar.b(a7fVar, fx6Var);
            }
            d2Var = (com.yandex.plus.core.graphql.d2) b2;
        }
        return new com.yandex.plus.core.graphql.c2(d2Var);
    }
}
