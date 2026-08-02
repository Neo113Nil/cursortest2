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
public final class j0 implements pj {
    public static final j0 a = new j0();
    public static final List b = t75.c("invoice");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.n0 n0Var = (com.yandex.plus.core.graphql.n0) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        n0Var.getClass();
        r7fVar.Z("invoice");
        l0 l0Var = l0.a;
        tj tjVar = uj.a;
        com.yandex.plus.core.graphql.p0 p0Var = n0Var.a;
        r7fVar.j();
        l0Var.a(r7fVar, fx6Var, p0Var);
        r7fVar.p();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.p0 p0Var = null;
        while (a7fVar.z0(b) == 0) {
            l0 l0Var = l0.a;
            tj tjVar = uj.a;
            p0Var = (com.yandex.plus.core.graphql.p0) new qhj(l0Var, false).b(a7fVar, fx6Var);
        }
        p0Var.getClass();
        return new com.yandex.plus.core.graphql.n0(p0Var);
    }
}
