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
public final class g0 implements pj {
    public static final g0 a = new g0();
    public static final List b = t75.c("invoice");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.j0 j0Var = (com.yandex.plus.core.graphql.j0) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        j0Var.getClass();
        r7fVar.Z("invoice");
        i0 i0Var = i0.a;
        tj tjVar = uj.a;
        com.yandex.plus.core.graphql.l0 l0Var = j0Var.a;
        r7fVar.j();
        i0Var.a(r7fVar, fx6Var, l0Var);
        r7fVar.p();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.l0 l0Var = null;
        while (a7fVar.z0(b) == 0) {
            i0 i0Var = i0.a;
            tj tjVar = uj.a;
            l0Var = (com.yandex.plus.core.graphql.l0) new qhj(i0Var, false).b(a7fVar, fx6Var);
        }
        l0Var.getClass();
        return new com.yandex.plus.core.graphql.j0(l0Var);
    }
}
