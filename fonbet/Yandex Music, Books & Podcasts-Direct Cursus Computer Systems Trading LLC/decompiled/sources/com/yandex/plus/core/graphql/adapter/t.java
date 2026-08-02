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
public final class t implements pj {
    public static final t a = new t();
    public static final List b = t75.c("legalText");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.v vVar = (com.yandex.plus.core.graphql.v) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        vVar.getClass();
        r7fVar.Z("legalText");
        i iVar = i.a;
        tj tjVar = uj.a;
        com.yandex.plus.core.graphql.k kVar = vVar.a;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            iVar.a(r7fVar, fx6Var, kVar);
            r7fVar.p();
            return;
        }
        fah fahVar = new fah();
        fahVar.j();
        iVar.a(fahVar, fx6Var, kVar);
        fahVar.p();
        Object b2 = fahVar.b();
        b2.getClass();
        irf.V(r7fVar, b2);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.k kVar = null;
        while (a7fVar.z0(b) == 0) {
            i iVar = i.a;
            tj tjVar = uj.a;
            kVar = (com.yandex.plus.core.graphql.k) new qhj(iVar, true).b(a7fVar, fx6Var);
        }
        kVar.getClass();
        return new com.yandex.plus.core.graphql.v(kVar);
    }
}
