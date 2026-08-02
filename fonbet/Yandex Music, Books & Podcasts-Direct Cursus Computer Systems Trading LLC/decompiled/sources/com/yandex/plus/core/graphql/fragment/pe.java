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
public abstract class pe implements defpackage.pj {
    public static final List a = u75.h("count", "displayRules");

    public static me c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        Integer num = null;
        ke keVar = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                num = (Integer) defpackage.uj.b.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    num.getClass();
                    int intValue = num.intValue();
                    keVar.getClass();
                    return new me(intValue, keVar);
                }
                ne neVar = ne.a;
                defpackage.tj tjVar = defpackage.uj.a;
                keVar = (ke) new qhj(neVar, true).b(a7fVar, fx6Var);
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, me meVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        meVar.getClass();
        r7fVar.Z("count");
        defpackage.uj.b.a(r7fVar, fx6Var, Integer.valueOf(meVar.a));
        r7fVar.Z("displayRules");
        ne neVar = ne.a;
        ke keVar = meVar.b;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            neVar.a(r7fVar, fx6Var, keVar);
            r7fVar.p();
            return;
        }
        fah fahVar = new fah();
        fahVar.j();
        neVar.a(fahVar, fx6Var, keVar);
        fahVar.p();
        Object b = fahVar.b();
        b.getClass();
        irf.V(r7fVar, b);
    }
}
