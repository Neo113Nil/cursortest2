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
public final class x0 implements pj {
    public static final x0 a = new x0();
    public static final List b = t75.c("externalInvoice");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.g1 g1Var = (com.yandex.plus.core.graphql.g1) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        g1Var.getClass();
        r7fVar.Z("externalInvoice");
        y0 y0Var = y0.a;
        tj tjVar = uj.a;
        com.yandex.plus.core.graphql.h1 h1Var = g1Var.a;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            y0Var.a(r7fVar, fx6Var, h1Var);
            r7fVar.p();
            return;
        }
        fah fahVar = new fah();
        fahVar.j();
        y0Var.a(fahVar, fx6Var, h1Var);
        fahVar.p();
        Object b2 = fahVar.b();
        b2.getClass();
        irf.V(r7fVar, b2);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.h1 h1Var = null;
        while (a7fVar.z0(b) == 0) {
            y0 y0Var = y0.a;
            tj tjVar = uj.a;
            h1Var = (com.yandex.plus.core.graphql.h1) new qhj(y0Var, true).b(a7fVar, fx6Var);
        }
        h1Var.getClass();
        return new com.yandex.plus.core.graphql.g1(h1Var);
    }
}
