package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class oc implements defpackage.pj {
    public static final oc a = new oc();
    public static final List b = u75.h("light", "dark");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        fc fcVar = (fc) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        fcVar.getClass();
        r7fVar.Z("light");
        qc qcVar = qc.a;
        defpackage.tj tjVar = defpackage.uj.a;
        hc hcVar = fcVar.a;
        r7fVar.j();
        qcVar.a(r7fVar, fx6Var, hcVar);
        r7fVar.p();
        r7fVar.Z("dark");
        nc ncVar = nc.a;
        ec ecVar = fcVar.b;
        r7fVar.j();
        ncVar.a(r7fVar, fx6Var, ecVar);
        r7fVar.p();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        hc hcVar = null;
        ec ecVar = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                qc qcVar = qc.a;
                defpackage.tj tjVar = defpackage.uj.a;
                hcVar = (hc) new qhj(qcVar, false).b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    hcVar.getClass();
                    ecVar.getClass();
                    return new fc(hcVar, ecVar);
                }
                nc ncVar = nc.a;
                defpackage.tj tjVar2 = defpackage.uj.a;
                ecVar = (ec) new qhj(ncVar, false).b(a7fVar, fx6Var);
            }
        }
    }
}
