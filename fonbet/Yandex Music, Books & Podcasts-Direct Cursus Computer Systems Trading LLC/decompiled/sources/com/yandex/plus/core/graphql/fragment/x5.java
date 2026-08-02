package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class x5 implements defpackage.pj {
    public static final x5 a = new x5();
    public static final List b = t75.c("sections");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        t5 t5Var = (t5) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        t5Var.getClass();
        r7fVar.Z("sections");
        w5 w5Var = w5.a;
        defpackage.tj tjVar = defpackage.uj.a;
        ArrayList arrayList = t5Var.a;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            if (r7fVar instanceof fah) {
                r7fVar.j();
                w5Var.a(r7fVar, fx6Var, obj2);
                r7fVar.p();
            } else {
                fah fahVar = new fah();
                fahVar.j();
                w5Var.a(fahVar, fx6Var, obj2);
                fahVar.p();
                Object b2 = fahVar.b();
                b2.getClass();
                irf.V(r7fVar, b2);
            }
        }
        r7fVar.l();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        ArrayList arrayList = null;
        while (a7fVar.z0(b) == 0) {
            w5 w5Var = w5.a;
            defpackage.tj tjVar = defpackage.uj.a;
            qhj qhjVar = new qhj(w5Var, true);
            a7fVar.m();
            arrayList = new ArrayList();
            while (a7fVar.hasNext()) {
                arrayList.add(qhjVar.b(a7fVar, fx6Var));
            }
            a7fVar.l();
        }
        arrayList.getClass();
        return new t5(arrayList);
    }
}
