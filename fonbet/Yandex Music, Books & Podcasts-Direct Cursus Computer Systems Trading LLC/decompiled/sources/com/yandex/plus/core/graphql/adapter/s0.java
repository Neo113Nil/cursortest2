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
public final class s0 implements pj {
    public static final s0 a = new s0();
    public static final List b = t75.c("invite");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.z0 z0Var = (com.yandex.plus.core.graphql.z0) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        z0Var.getClass();
        r7fVar.Z("invite");
        t0 t0Var = t0.a;
        tj tjVar = uj.a;
        com.yandex.plus.core.graphql.a1 a1Var = z0Var.a;
        r7fVar.j();
        t0Var.a(r7fVar, fx6Var, a1Var);
        r7fVar.p();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.a1 a1Var = null;
        while (a7fVar.z0(b) == 0) {
            t0 t0Var = t0.a;
            tj tjVar = uj.a;
            a1Var = (com.yandex.plus.core.graphql.a1) new qhj(t0Var, false).b(a7fVar, fx6Var);
        }
        a1Var.getClass();
        return new com.yandex.plus.core.graphql.z0(a1Var);
    }
}
