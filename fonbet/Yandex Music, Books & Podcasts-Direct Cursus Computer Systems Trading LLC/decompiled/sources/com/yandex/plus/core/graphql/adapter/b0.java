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
public final class b0 implements pj {
    public static final b0 a = new b0();
    public static final List b = t75.c("upsaleComposites");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.d0 d0Var = (com.yandex.plus.core.graphql.d0) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        d0Var.getClass();
        r7fVar.Z("upsaleComposites");
        f0 f0Var = f0.a;
        tj tjVar = uj.a;
        com.yandex.plus.core.graphql.h0 h0Var = d0Var.a;
        r7fVar.j();
        f0Var.a(r7fVar, fx6Var, h0Var);
        r7fVar.p();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.h0 h0Var = null;
        while (a7fVar.z0(b) == 0) {
            f0 f0Var = f0.a;
            tj tjVar = uj.a;
            h0Var = (com.yandex.plus.core.graphql.h0) new qhj(f0Var, false).b(a7fVar, fx6Var);
        }
        h0Var.getClass();
        return new com.yandex.plus.core.graphql.d0(h0Var);
    }
}
