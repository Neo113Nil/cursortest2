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
public final class u0 implements pj {
    public static final u0 a = new u0();
    public static final List b = t75.c("familyInvite");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.c1 c1Var = (com.yandex.plus.core.graphql.c1) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        c1Var.getClass();
        r7fVar.Z("familyInvite");
        v0 v0Var = v0.a;
        tj tjVar = uj.a;
        com.yandex.plus.core.graphql.d1 d1Var = c1Var.a;
        r7fVar.j();
        v0Var.a(r7fVar, fx6Var, d1Var);
        r7fVar.p();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.d1 d1Var = null;
        while (a7fVar.z0(b) == 0) {
            v0 v0Var = v0.a;
            tj tjVar = uj.a;
            d1Var = (com.yandex.plus.core.graphql.d1) new qhj(v0Var, false).b(a7fVar, fx6Var);
        }
        d1Var.getClass();
        return new com.yandex.plus.core.graphql.c1(d1Var);
    }
}
