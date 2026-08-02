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
public abstract class uf implements defpackage.pj {
    public static final List a = u75.h("url", "displayRules");

    public static rf c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        pf pfVar = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    str.getClass();
                    pfVar.getClass();
                    return new rf(str, pfVar);
                }
                sf sfVar = sf.a;
                defpackage.tj tjVar = defpackage.uj.a;
                pfVar = (pf) new qhj(sfVar, true).b(a7fVar, fx6Var);
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, rf rfVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        rfVar.getClass();
        r7fVar.Z("url");
        defpackage.uj.a.a(r7fVar, fx6Var, rfVar.a);
        r7fVar.Z("displayRules");
        sf sfVar = sf.a;
        pf pfVar = rfVar.b;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            sfVar.a(r7fVar, fx6Var, pfVar);
            r7fVar.p();
            return;
        }
        fah fahVar = new fah();
        fahVar.j();
        sfVar.a(fahVar, fx6Var, pfVar);
        fahVar.p();
        Object b = fahVar.b();
        b.getClass();
        irf.V(r7fVar, b);
    }
}
