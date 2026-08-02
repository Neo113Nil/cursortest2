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
public final class a1 implements pj {
    public static final a1 a = new a1();
    public static final List b = t75.c("voluntaryMailingAdsAgreement");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.k1 k1Var = (com.yandex.plus.core.graphql.k1) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        k1Var.getClass();
        r7fVar.Z("voluntaryMailingAdsAgreement");
        e1 e1Var = e1.a;
        tj tjVar = uj.a;
        com.yandex.plus.core.graphql.o1 o1Var = k1Var.a;
        r7fVar.j();
        e1Var.a(r7fVar, fx6Var, o1Var);
        r7fVar.p();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.o1 o1Var = null;
        while (a7fVar.z0(b) == 0) {
            e1 e1Var = e1.a;
            tj tjVar = uj.a;
            o1Var = (com.yandex.plus.core.graphql.o1) new qhj(e1Var, false).b(a7fVar, fx6Var);
        }
        o1Var.getClass();
        return new com.yandex.plus.core.graphql.k1(o1Var);
    }
}
