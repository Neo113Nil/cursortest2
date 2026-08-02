package com.yandex.plus.core.graphql.adapter;

import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.pj;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.tj;
import defpackage.u75;
import defpackage.uj;
import java.util.List;

/* loaded from: classes4.dex */
public final class e0 implements pj {
    public static final e0 a = new e0();
    public static final List b = u75.h("offer", "asset", "storePurchaseInfo");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.g0 g0Var = (com.yandex.plus.core.graphql.g0) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        g0Var.getClass();
        r7fVar.Z("offer");
        c0 c0Var = c0.a;
        tj tjVar = uj.a;
        com.yandex.plus.core.graphql.e0 e0Var = g0Var.a;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            c0Var.a(r7fVar, fx6Var, e0Var);
            r7fVar.p();
        } else {
            fah fahVar = new fah();
            fahVar.j();
            c0Var.a(fahVar, fx6Var, e0Var);
            fahVar.p();
            Object b2 = fahVar.b();
            b2.getClass();
            irf.V(r7fVar, b2);
        }
        r7fVar.Z("asset");
        z zVar = z.a;
        com.yandex.plus.core.graphql.b0 b0Var = g0Var.b;
        r7fVar.j();
        zVar.a(r7fVar, fx6Var, b0Var);
        r7fVar.p();
        r7fVar.Z("storePurchaseInfo");
        qhj qhjVar = new qhj(d0.a, true);
        com.yandex.plus.core.graphql.f0 f0Var = g0Var.c;
        if (f0Var == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, f0Var);
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        Object b2;
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.e0 e0Var = null;
        com.yandex.plus.core.graphql.b0 b0Var = null;
        com.yandex.plus.core.graphql.f0 f0Var = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                c0 c0Var = c0.a;
                tj tjVar = uj.a;
                e0Var = (com.yandex.plus.core.graphql.e0) new qhj(c0Var, true).b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                z zVar = z.a;
                tj tjVar2 = uj.a;
                b0Var = (com.yandex.plus.core.graphql.b0) new qhj(zVar, false).b(a7fVar, fx6Var);
            } else {
                if (z0 != 2) {
                    e0Var.getClass();
                    b0Var.getClass();
                    return new com.yandex.plus.core.graphql.g0(e0Var, b0Var, f0Var);
                }
                d0 d0Var = d0.a;
                tj tjVar3 = uj.a;
                qhj qhjVar = new qhj(d0Var, true);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    b2 = null;
                } else {
                    b2 = qhjVar.b(a7fVar, fx6Var);
                }
                f0Var = (com.yandex.plus.core.graphql.f0) b2;
            }
        }
    }
}
