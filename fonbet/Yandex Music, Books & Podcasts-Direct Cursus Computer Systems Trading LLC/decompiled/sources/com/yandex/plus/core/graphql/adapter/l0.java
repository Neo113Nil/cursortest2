package com.yandex.plus.core.graphql.adapter;

import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.pj;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import defpackage.tj;
import defpackage.uj;
import java.util.List;

/* loaded from: classes4.dex */
public final class l0 implements pj {
    public static final l0 a = new l0();
    public static final List b = t75.c("externalCreate");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.p0 p0Var = (com.yandex.plus.core.graphql.p0) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        p0Var.getClass();
        r7fVar.Z("externalCreate");
        k0 k0Var = k0.a;
        tj tjVar = uj.a;
        com.yandex.plus.core.graphql.o0 o0Var = p0Var.a;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            k0Var.a(r7fVar, fx6Var, o0Var);
            r7fVar.p();
            return;
        }
        fah fahVar = new fah();
        fahVar.j();
        k0Var.a(fahVar, fx6Var, o0Var);
        fahVar.p();
        Object b2 = fahVar.b();
        b2.getClass();
        irf.V(r7fVar, b2);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.o0 o0Var = null;
        while (a7fVar.z0(b) == 0) {
            k0 k0Var = k0.a;
            tj tjVar = uj.a;
            o0Var = (com.yandex.plus.core.graphql.o0) new qhj(k0Var, true).b(a7fVar, fx6Var);
        }
        o0Var.getClass();
        return new com.yandex.plus.core.graphql.p0(o0Var);
    }
}
