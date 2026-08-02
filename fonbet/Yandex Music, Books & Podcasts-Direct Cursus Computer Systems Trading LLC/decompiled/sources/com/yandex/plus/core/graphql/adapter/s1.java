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
public final class s1 implements pj {
    public static final s1 a = new s1();
    public static final List b = u75.h("configuration", "darkConfiguration");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.h2 h2Var = (com.yandex.plus.core.graphql.h2) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        h2Var.getClass();
        r7fVar.Z("configuration");
        q1 q1Var = q1.a;
        tj tjVar = uj.a;
        com.yandex.plus.core.graphql.f2 f2Var = h2Var.a;
        boolean z = r7fVar instanceof fah;
        if (z) {
            r7fVar.j();
            q1Var.a(r7fVar, fx6Var, f2Var);
            r7fVar.p();
        } else {
            fah fahVar = new fah();
            fahVar.j();
            q1Var.a(fahVar, fx6Var, f2Var);
            fahVar.p();
            Object b2 = fahVar.b();
            b2.getClass();
            irf.V(r7fVar, b2);
        }
        r7fVar.Z("darkConfiguration");
        r1 r1Var = r1.a;
        com.yandex.plus.core.graphql.g2 g2Var = h2Var.b;
        if (z) {
            r7fVar.j();
            r1Var.a(r7fVar, fx6Var, g2Var);
            r7fVar.p();
            return;
        }
        fah fahVar2 = new fah();
        fahVar2.j();
        r1Var.a(fahVar2, fx6Var, g2Var);
        fahVar2.p();
        Object b3 = fahVar2.b();
        b3.getClass();
        irf.V(r7fVar, b3);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.f2 f2Var = null;
        com.yandex.plus.core.graphql.g2 g2Var = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                q1 q1Var = q1.a;
                tj tjVar = uj.a;
                f2Var = (com.yandex.plus.core.graphql.f2) new qhj(q1Var, true).b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    f2Var.getClass();
                    g2Var.getClass();
                    return new com.yandex.plus.core.graphql.h2(f2Var, g2Var);
                }
                r1 r1Var = r1.a;
                tj tjVar2 = uj.a;
                g2Var = (com.yandex.plus.core.graphql.g2) new qhj(r1Var, true).b(a7fVar, fx6Var);
            }
        }
    }
}
