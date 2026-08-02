package com.yandex.plus.core.graphql.adapter;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.op;
import defpackage.pj;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class v implements pj {
    public static final v a = new v();
    public static final List b = u75.h("initStartMessageTimeoutMillis", "loadMessageTimeoutMillis");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.x xVar = (com.yandex.plus.core.graphql.x) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        xVar.getClass();
        r7fVar.Z("initStartMessageTimeoutMillis");
        op opVar = com.yandex.plus.core.graphql.type.z.a;
        fx6Var.e(opVar).a(r7fVar, fx6Var, Long.valueOf(xVar.a));
        r7fVar.Z("loadMessageTimeoutMillis");
        fx6Var.e(opVar).a(r7fVar, fx6Var, Long.valueOf(xVar.b));
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        op opVar = com.yandex.plus.core.graphql.type.z.a;
        a7fVar.getClass();
        fx6Var.getClass();
        Long l = null;
        Long l2 = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                l = (Long) fx6Var.e(opVar).b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    l.getClass();
                    long longValue = l.longValue();
                    l2.getClass();
                    return new com.yandex.plus.core.graphql.x(longValue, l2.longValue());
                }
                l2 = (Long) fx6Var.e(opVar).b(a7fVar, fx6Var);
            }
        }
    }
}
