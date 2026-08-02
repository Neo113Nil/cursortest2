package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ha implements defpackage.pj {
    public static final List a = t75.c("__typename");

    public static ba c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(a) == 0) {
            str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
        }
        a7fVar.k();
        x9 c = y9.c(a7fVar, fx6Var);
        str.getClass();
        return new ba(str, c);
    }

    public static void d(r7f r7fVar, fx6 fx6Var, ba baVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        baVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, baVar.a);
        List list = y9.a;
        x9 x9Var = baVar.b;
        r7fVar.getClass();
        fx6Var.getClass();
        x9Var.getClass();
        r7fVar.Z("price");
        z9 z9Var = z9.a;
        defpackage.tj tjVar = defpackage.uj.a;
        w9 w9Var = x9Var.a;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            z9Var.a(r7fVar, fx6Var, w9Var);
            r7fVar.p();
        } else {
            fah fahVar = new fah();
            fahVar.j();
            z9Var.a(fahVar, fx6Var, w9Var);
            fahVar.p();
            Object b = fahVar.b();
            b.getClass();
            irf.V(r7fVar, b);
        }
        r7fVar.Z("until");
        defpackage.uj.g.a(r7fVar, fx6Var, x9Var.b);
    }
}
