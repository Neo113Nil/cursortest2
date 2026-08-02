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
public final class g implements pj {
    public static final g a = new g();
    public static final List b = t75.c("compositeOfferCheckoutInfo");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.i iVar = (com.yandex.plus.core.graphql.i) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        iVar.getClass();
        r7fVar.Z("compositeOfferCheckoutInfo");
        f fVar = f.a;
        tj tjVar = uj.a;
        com.yandex.plus.core.graphql.h hVar = iVar.a;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            fVar.a(r7fVar, fx6Var, hVar);
            r7fVar.p();
            return;
        }
        fah fahVar = new fah();
        fahVar.j();
        fVar.a(fahVar, fx6Var, hVar);
        fahVar.p();
        Object b2 = fahVar.b();
        b2.getClass();
        irf.V(r7fVar, b2);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.h hVar = null;
        while (a7fVar.z0(b) == 0) {
            f fVar = f.a;
            tj tjVar = uj.a;
            hVar = (com.yandex.plus.core.graphql.h) new qhj(fVar, true).b(a7fVar, fx6Var);
        }
        hVar.getClass();
        return new com.yandex.plus.core.graphql.i(hVar);
    }
}
