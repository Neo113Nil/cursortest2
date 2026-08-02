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
public final class j1 implements pj {
    public static final j1 a = new j1();
    public static final List b = u75.h("layout", "darkLayout");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.v1 v1Var = (com.yandex.plus.core.graphql.v1) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        v1Var.getClass();
        r7fVar.Z("layout");
        k1 k1Var = k1.a;
        tj tjVar = uj.a;
        com.yandex.plus.core.graphql.w1 w1Var = v1Var.a;
        boolean z = r7fVar instanceof fah;
        if (z) {
            r7fVar.j();
            k1Var.a(r7fVar, fx6Var, w1Var);
            r7fVar.p();
        } else {
            fah fahVar = new fah();
            fahVar.j();
            k1Var.a(fahVar, fx6Var, w1Var);
            fahVar.p();
            Object b2 = fahVar.b();
            b2.getClass();
            irf.V(r7fVar, b2);
        }
        r7fVar.Z("darkLayout");
        i1 i1Var = i1.a;
        com.yandex.plus.core.graphql.u1 u1Var = v1Var.b;
        if (z) {
            r7fVar.j();
            i1Var.a(r7fVar, fx6Var, u1Var);
            r7fVar.p();
            return;
        }
        fah fahVar2 = new fah();
        fahVar2.j();
        i1Var.a(fahVar2, fx6Var, u1Var);
        fahVar2.p();
        Object b3 = fahVar2.b();
        b3.getClass();
        irf.V(r7fVar, b3);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.w1 w1Var = null;
        com.yandex.plus.core.graphql.u1 u1Var = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                k1 k1Var = k1.a;
                tj tjVar = uj.a;
                w1Var = (com.yandex.plus.core.graphql.w1) new qhj(k1Var, true).b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    w1Var.getClass();
                    u1Var.getClass();
                    return new com.yandex.plus.core.graphql.v1(w1Var, u1Var);
                }
                i1 i1Var = i1.a;
                tj tjVar2 = uj.a;
                u1Var = (com.yandex.plus.core.graphql.u1) new qhj(i1Var, true).b(a7fVar, fx6Var);
            }
        }
    }
}
