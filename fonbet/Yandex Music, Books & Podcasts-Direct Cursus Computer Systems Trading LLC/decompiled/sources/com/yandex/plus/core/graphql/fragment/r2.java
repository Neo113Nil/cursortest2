package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class r2 implements defpackage.pj {
    public static final r2 a = new r2();
    public static final List b = u75.h("timestamp", "totalPrice");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        q1 q1Var = (q1) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        q1Var.getClass();
        r7fVar.Z("timestamp");
        fx6Var.e(com.yandex.plus.core.graphql.type.z.a).a(r7fVar, fx6Var, Long.valueOf(q1Var.a));
        r7fVar.Z("totalPrice");
        v2 v2Var = v2.a;
        defpackage.tj tjVar = defpackage.uj.a;
        u1 u1Var = q1Var.b;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            v2Var.a(r7fVar, fx6Var, u1Var);
            r7fVar.p();
            return;
        }
        fah fahVar = new fah();
        fahVar.j();
        v2Var.a(fahVar, fx6Var, u1Var);
        fahVar.p();
        Object b2 = fahVar.b();
        b2.getClass();
        irf.V(r7fVar, b2);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        Long l = null;
        u1 u1Var = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                l = (Long) fx6Var.e(com.yandex.plus.core.graphql.type.z.a).b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    l.getClass();
                    long longValue = l.longValue();
                    u1Var.getClass();
                    return new q1(longValue, u1Var);
                }
                v2 v2Var = v2.a;
                defpackage.tj tjVar = defpackage.uj.a;
                u1Var = (u1) new qhj(v2Var, true).b(a7fVar, fx6Var);
            }
        }
    }
}
