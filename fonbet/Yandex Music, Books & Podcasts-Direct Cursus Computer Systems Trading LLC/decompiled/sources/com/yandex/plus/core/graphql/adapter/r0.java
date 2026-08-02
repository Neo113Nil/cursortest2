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
public final class r0 implements pj {
    public static final r0 a = new r0();
    public static final List b = u75.h("configuration", "darkConfiguration");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.x0 x0Var = (com.yandex.plus.core.graphql.x0) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        x0Var.getClass();
        r7fVar.Z("configuration");
        p0 p0Var = p0.a;
        tj tjVar = uj.a;
        com.yandex.plus.core.graphql.v0 v0Var = x0Var.a;
        boolean z = r7fVar instanceof fah;
        if (z) {
            r7fVar.j();
            p0Var.a(r7fVar, fx6Var, v0Var);
            r7fVar.p();
        } else {
            fah fahVar = new fah();
            fahVar.j();
            p0Var.a(fahVar, fx6Var, v0Var);
            fahVar.p();
            Object b2 = fahVar.b();
            b2.getClass();
            irf.V(r7fVar, b2);
        }
        r7fVar.Z("darkConfiguration");
        q0 q0Var = q0.a;
        com.yandex.plus.core.graphql.w0 w0Var = x0Var.b;
        if (z) {
            r7fVar.j();
            q0Var.a(r7fVar, fx6Var, w0Var);
            r7fVar.p();
            return;
        }
        fah fahVar2 = new fah();
        fahVar2.j();
        q0Var.a(fahVar2, fx6Var, w0Var);
        fahVar2.p();
        Object b3 = fahVar2.b();
        b3.getClass();
        irf.V(r7fVar, b3);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.v0 v0Var = null;
        com.yandex.plus.core.graphql.w0 w0Var = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                p0 p0Var = p0.a;
                tj tjVar = uj.a;
                v0Var = (com.yandex.plus.core.graphql.v0) new qhj(p0Var, true).b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    v0Var.getClass();
                    w0Var.getClass();
                    return new com.yandex.plus.core.graphql.x0(v0Var, w0Var);
                }
                q0 q0Var = q0.a;
                tj tjVar2 = uj.a;
                w0Var = (com.yandex.plus.core.graphql.w0) new qhj(q0Var, true).b(a7fVar, fx6Var);
            }
        }
    }
}
