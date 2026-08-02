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
public final class kc implements defpackage.pj {
    public static final kc a = new kc();
    public static final List b = u75.h("light", "dark");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        bc bcVar = (bc) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        bcVar.getClass();
        r7fVar.Z("light");
        pc pcVar = pc.a;
        defpackage.tj tjVar = defpackage.uj.a;
        gc gcVar = bcVar.a;
        boolean z = r7fVar instanceof fah;
        if (z) {
            r7fVar.j();
            pcVar.a(r7fVar, fx6Var, gcVar);
            r7fVar.p();
        } else {
            fah fahVar = new fah();
            fahVar.j();
            pcVar.a(fahVar, fx6Var, gcVar);
            fahVar.p();
            Object b2 = fahVar.b();
            b2.getClass();
            irf.V(r7fVar, b2);
        }
        r7fVar.Z("dark");
        mc mcVar = mc.a;
        dc dcVar = bcVar.b;
        if (z) {
            r7fVar.j();
            mcVar.a(r7fVar, fx6Var, dcVar);
            r7fVar.p();
            return;
        }
        fah fahVar2 = new fah();
        fahVar2.j();
        mcVar.a(fahVar2, fx6Var, dcVar);
        fahVar2.p();
        Object b3 = fahVar2.b();
        b3.getClass();
        irf.V(r7fVar, b3);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        gc gcVar = null;
        dc dcVar = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                pc pcVar = pc.a;
                defpackage.tj tjVar = defpackage.uj.a;
                gcVar = (gc) new qhj(pcVar, true).b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    gcVar.getClass();
                    dcVar.getClass();
                    return new bc(gcVar, dcVar);
                }
                mc mcVar = mc.a;
                defpackage.tj tjVar2 = defpackage.uj.a;
                dcVar = (dc) new qhj(mcVar, true).b(a7fVar, fx6Var);
            }
        }
    }
}
