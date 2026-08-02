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
public abstract class si implements defpackage.pj {
    public static final List a = u75.h("leftTopCorner", "rightTopCorner", "leftBottomCorner", "rightBottomCorner");

    public static pi c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        mi miVar = null;
        oi oiVar = null;
        li liVar = null;
        ni niVar = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                ri riVar = ri.a;
                defpackage.tj tjVar = defpackage.uj.a;
                miVar = (mi) new qhj(riVar, true).b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                ui uiVar = ui.a;
                defpackage.tj tjVar2 = defpackage.uj.a;
                oiVar = (oi) new qhj(uiVar, true).b(a7fVar, fx6Var);
            } else if (z0 == 2) {
                qi qiVar = qi.a;
                defpackage.tj tjVar3 = defpackage.uj.a;
                liVar = (li) new qhj(qiVar, true).b(a7fVar, fx6Var);
            } else {
                if (z0 != 3) {
                    miVar.getClass();
                    oiVar.getClass();
                    liVar.getClass();
                    niVar.getClass();
                    return new pi(miVar, oiVar, liVar, niVar);
                }
                ti tiVar = ti.a;
                defpackage.tj tjVar4 = defpackage.uj.a;
                niVar = (ni) new qhj(tiVar, true).b(a7fVar, fx6Var);
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, pi piVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        piVar.getClass();
        r7fVar.Z("leftTopCorner");
        ri riVar = ri.a;
        defpackage.tj tjVar = defpackage.uj.a;
        mi miVar = piVar.a;
        boolean z = r7fVar instanceof fah;
        if (z) {
            r7fVar.j();
            riVar.a(r7fVar, fx6Var, miVar);
            r7fVar.p();
        } else {
            fah fahVar = new fah();
            fahVar.j();
            riVar.a(fahVar, fx6Var, miVar);
            fahVar.p();
            Object b = fahVar.b();
            b.getClass();
            irf.V(r7fVar, b);
        }
        r7fVar.Z("rightTopCorner");
        ui uiVar = ui.a;
        oi oiVar = piVar.b;
        if (z) {
            r7fVar.j();
            uiVar.a(r7fVar, fx6Var, oiVar);
            r7fVar.p();
        } else {
            fah fahVar2 = new fah();
            fahVar2.j();
            uiVar.a(fahVar2, fx6Var, oiVar);
            fahVar2.p();
            Object b2 = fahVar2.b();
            b2.getClass();
            irf.V(r7fVar, b2);
        }
        r7fVar.Z("leftBottomCorner");
        qi qiVar = qi.a;
        li liVar = piVar.c;
        if (z) {
            r7fVar.j();
            qiVar.a(r7fVar, fx6Var, liVar);
            r7fVar.p();
        } else {
            fah fahVar3 = new fah();
            fahVar3.j();
            qiVar.a(fahVar3, fx6Var, liVar);
            fahVar3.p();
            Object b3 = fahVar3.b();
            b3.getClass();
            irf.V(r7fVar, b3);
        }
        r7fVar.Z("rightBottomCorner");
        ti tiVar = ti.a;
        ni niVar = piVar.d;
        if (z) {
            r7fVar.j();
            tiVar.a(r7fVar, fx6Var, niVar);
            r7fVar.p();
            return;
        }
        fah fahVar4 = new fah();
        fahVar4.j();
        tiVar.a(fahVar4, fx6Var, niVar);
        fahVar4.p();
        Object b4 = fahVar4.b();
        b4.getClass();
        irf.V(r7fVar, b4);
    }
}
