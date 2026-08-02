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
public final class b3 implements defpackage.pj {
    public static final b3 a = new b3();
    public static final List b = t75.c("sections");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        x2 x2Var = (x2) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        x2Var.getClass();
        r7fVar.Z("sections");
        a3 a3Var = a3.a;
        defpackage.tj tjVar = defpackage.uj.a;
        ArrayList arrayList = x2Var.a;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            if (r7fVar instanceof fah) {
                r7fVar.j();
                a3Var.a(r7fVar, fx6Var, obj2);
                r7fVar.p();
            } else {
                fah fahVar = new fah();
                fahVar.j();
                a3Var.a(fahVar, fx6Var, obj2);
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
            a3 a3Var = a3.a;
            defpackage.tj tjVar = defpackage.uj.a;
            qhj qhjVar = new qhj(a3Var, true);
            a7fVar.m();
            arrayList = new ArrayList();
            while (a7fVar.hasNext()) {
                arrayList.add(qhjVar.b(a7fVar, fx6Var));
            }
            a7fVar.l();
        }
        arrayList.getClass();
        return new x2(arrayList);
    }
}
