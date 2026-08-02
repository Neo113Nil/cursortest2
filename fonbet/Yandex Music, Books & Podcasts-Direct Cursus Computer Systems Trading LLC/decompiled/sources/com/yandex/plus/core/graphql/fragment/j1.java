package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class j1 implements defpackage.pj {
    public static final List a = t75.c(Constants.KEY_VALUE);

    public static i1 c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        ArrayList arrayList = null;
        while (a7fVar.z0(a) == 0) {
            n1 n1Var = n1.a;
            defpackage.tj tjVar = defpackage.uj.a;
            qhj qhjVar = new qhj(n1Var, true);
            a7fVar.m();
            arrayList = new ArrayList();
            while (a7fVar.hasNext()) {
                arrayList.add(qhjVar.b(a7fVar, fx6Var));
            }
            a7fVar.l();
        }
        arrayList.getClass();
        return new i1(arrayList);
    }

    public static void d(r7f r7fVar, fx6 fx6Var, i1 i1Var) {
        r7fVar.getClass();
        fx6Var.getClass();
        i1Var.getClass();
        r7fVar.Z(Constants.KEY_VALUE);
        n1 n1Var = n1.a;
        defpackage.tj tjVar = defpackage.uj.a;
        ArrayList arrayList = i1Var.a;
        r7fVar.m();
        for (Object obj : arrayList) {
            if (r7fVar instanceof fah) {
                r7fVar.j();
                n1Var.a(r7fVar, fx6Var, obj);
                r7fVar.p();
            } else {
                fah fahVar = new fah();
                fahVar.j();
                n1Var.a(fahVar, fx6Var, obj);
                fahVar.p();
                Object b = fahVar.b();
                b.getClass();
                irf.V(r7fVar, b);
            }
        }
        r7fVar.l();
    }
}
