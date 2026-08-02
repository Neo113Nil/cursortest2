package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class l1 implements defpackage.pj {
    public static final List a = t75.c("gradient");

    public static f1 c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        e1 e1Var = null;
        while (a7fVar.z0(a) == 0) {
            k1 k1Var = k1.a;
            defpackage.tj tjVar = defpackage.uj.a;
            e1Var = (e1) new qhj(k1Var, true).b(a7fVar, fx6Var);
        }
        e1Var.getClass();
        return new f1(e1Var);
    }

    public static void d(r7f r7fVar, fx6 fx6Var, f1 f1Var) {
        r7fVar.getClass();
        fx6Var.getClass();
        f1Var.getClass();
        r7fVar.Z("gradient");
        k1 k1Var = k1.a;
        defpackage.tj tjVar = defpackage.uj.a;
        e1 e1Var = f1Var.a;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            k1Var.a(r7fVar, fx6Var, e1Var);
            r7fVar.p();
            return;
        }
        fah fahVar = new fah();
        fahVar.j();
        k1Var.a(fahVar, fx6Var, e1Var);
        fahVar.p();
        Object b = fahVar.b();
        b.getClass();
        irf.V(r7fVar, b);
    }
}
