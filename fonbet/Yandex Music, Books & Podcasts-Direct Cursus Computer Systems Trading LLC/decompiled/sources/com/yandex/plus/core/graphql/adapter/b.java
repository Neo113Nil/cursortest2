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
public final class b implements pj {
    public static final b a = new b();
    public static final List b = t75.c("changeVoluntaryAgreementStatus");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.b bVar = (com.yandex.plus.core.graphql.b) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        bVar.getClass();
        r7fVar.Z("changeVoluntaryAgreementStatus");
        a aVar = a.a;
        tj tjVar = uj.a;
        com.yandex.plus.core.graphql.a aVar2 = bVar.a;
        r7fVar.j();
        aVar.a(r7fVar, fx6Var, aVar2);
        r7fVar.p();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.a aVar = null;
        while (a7fVar.z0(b) == 0) {
            a aVar2 = a.a;
            tj tjVar = uj.a;
            aVar = (com.yandex.plus.core.graphql.a) new qhj(aVar2, false).b(a7fVar, fx6Var);
        }
        aVar.getClass();
        return new com.yandex.plus.core.graphql.b(aVar);
    }
}
