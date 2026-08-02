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
public final class d implements pj {
    public static final d a = new d();
    public static final List b = t75.c("collectUserContacts");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.e eVar = (com.yandex.plus.core.graphql.e) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        eVar.getClass();
        r7fVar.Z("collectUserContacts");
        c cVar = c.a;
        tj tjVar = uj.a;
        com.yandex.plus.core.graphql.d dVar = eVar.a;
        r7fVar.j();
        cVar.a(r7fVar, fx6Var, dVar);
        r7fVar.p();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.d dVar = null;
        while (a7fVar.z0(b) == 0) {
            c cVar = c.a;
            tj tjVar = uj.a;
            dVar = (com.yandex.plus.core.graphql.d) new qhj(cVar, false).b(a7fVar, fx6Var);
        }
        dVar.getClass();
        return new com.yandex.plus.core.graphql.e(dVar);
    }
}
