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
public final class f1 implements pj {
    public static final f1 a = new f1();
    public static final List b = t75.c("externalCompositeOffers");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.q1 q1Var = (com.yandex.plus.core.graphql.q1) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        q1Var.getClass();
        r7fVar.Z("externalCompositeOffers");
        g1 g1Var = g1.a;
        tj tjVar = uj.a;
        com.yandex.plus.core.graphql.r1 r1Var = q1Var.a;
        r7fVar.j();
        g1Var.a(r7fVar, fx6Var, r1Var);
        r7fVar.p();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.r1 r1Var = null;
        while (a7fVar.z0(b) == 0) {
            g1 g1Var = g1.a;
            tj tjVar = uj.a;
            r1Var = (com.yandex.plus.core.graphql.r1) new qhj(g1Var, false).b(a7fVar, fx6Var);
        }
        r1Var.getClass();
        return new com.yandex.plus.core.graphql.q1(r1Var);
    }
}
