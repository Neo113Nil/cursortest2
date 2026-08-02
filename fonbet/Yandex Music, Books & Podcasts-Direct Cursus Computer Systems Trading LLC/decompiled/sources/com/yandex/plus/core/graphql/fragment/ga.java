package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class ga implements defpackage.pj {
    public static final List a = t75.c("__typename");

    public static aa c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(a) == 0) {
            str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
        }
        a7fVar.k();
        t9 c = u9.c(a7fVar, fx6Var);
        str.getClass();
        return new aa(str, c);
    }

    public static void d(r7f r7fVar, fx6 fx6Var, aa aaVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        aaVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, aaVar.a);
        List list = u9.a;
        t9 t9Var = aaVar.b;
        r7fVar.getClass();
        fx6Var.getClass();
        t9Var.getClass();
        r7fVar.Z("period");
        defpackage.uj.g.a(r7fVar, fx6Var, t9Var.a);
        r7fVar.Z("price");
        v9 v9Var = v9.a;
        s9 s9Var = t9Var.b;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            v9Var.a(r7fVar, fx6Var, s9Var);
            r7fVar.p();
        } else {
            fah fahVar = new fah();
            fahVar.j();
            v9Var.a(fahVar, fx6Var, s9Var);
            fahVar.p();
            Object b = fahVar.b();
            b.getClass();
            irf.V(r7fVar, b);
        }
        r7fVar.Z("repetitionCount");
        defpackage.uj.b.a(r7fVar, fx6Var, Integer.valueOf(t9Var.c));
    }
}
