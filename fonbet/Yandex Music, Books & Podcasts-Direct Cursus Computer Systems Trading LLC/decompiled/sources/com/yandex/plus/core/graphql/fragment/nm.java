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
public final class nm implements defpackage.pj {
    public static final nm a = new nm();
    public static final List b = u75.h("light", "dark");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        bm bmVar = (bm) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        bmVar.getClass();
        r7fVar.Z("light");
        sm smVar = sm.a;
        defpackage.tj tjVar = defpackage.uj.a;
        gm gmVar = bmVar.a;
        boolean z = r7fVar instanceof fah;
        if (z) {
            r7fVar.j();
            smVar.a(r7fVar, fx6Var, gmVar);
            r7fVar.p();
        } else {
            fah fahVar = new fah();
            fahVar.j();
            smVar.a(fahVar, fx6Var, gmVar);
            fahVar.p();
            Object b2 = fahVar.b();
            b2.getClass();
            irf.V(r7fVar, b2);
        }
        r7fVar.Z("dark");
        pm pmVar = pm.a;
        dm dmVar = bmVar.b;
        if (z) {
            r7fVar.j();
            pmVar.a(r7fVar, fx6Var, dmVar);
            r7fVar.p();
            return;
        }
        fah fahVar2 = new fah();
        fahVar2.j();
        pmVar.a(fahVar2, fx6Var, dmVar);
        fahVar2.p();
        Object b3 = fahVar2.b();
        b3.getClass();
        irf.V(r7fVar, b3);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        gm gmVar = null;
        dm dmVar = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                sm smVar = sm.a;
                defpackage.tj tjVar = defpackage.uj.a;
                gmVar = (gm) new qhj(smVar, true).b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    gmVar.getClass();
                    dmVar.getClass();
                    return new bm(gmVar, dmVar);
                }
                pm pmVar = pm.a;
                defpackage.tj tjVar2 = defpackage.uj.a;
                dmVar = (dm) new qhj(pmVar, true).b(a7fVar, fx6Var);
            }
        }
    }
}
