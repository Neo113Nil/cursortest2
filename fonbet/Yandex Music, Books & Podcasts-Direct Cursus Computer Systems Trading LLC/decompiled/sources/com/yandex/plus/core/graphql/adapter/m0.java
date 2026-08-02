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
public final class m0 implements pj {
    public static final m0 a = new m0();
    public static final List b = t75.c("experiments");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.r0 r0Var = (com.yandex.plus.core.graphql.r0) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        r0Var.getClass();
        r7fVar.Z("experiments");
        n0 n0Var = n0.a;
        tj tjVar = uj.a;
        com.yandex.plus.core.graphql.s0 s0Var = r0Var.a;
        r7fVar.j();
        n0Var.a(r7fVar, fx6Var, s0Var);
        r7fVar.p();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.s0 s0Var = null;
        while (a7fVar.z0(b) == 0) {
            n0 n0Var = n0.a;
            tj tjVar = uj.a;
            s0Var = (com.yandex.plus.core.graphql.s0) new qhj(n0Var, false).b(a7fVar, fx6Var);
        }
        s0Var.getClass();
        return new com.yandex.plus.core.graphql.r0(s0Var);
    }
}
