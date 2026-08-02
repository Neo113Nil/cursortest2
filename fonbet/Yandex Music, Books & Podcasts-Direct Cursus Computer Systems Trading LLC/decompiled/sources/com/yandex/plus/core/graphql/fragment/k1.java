package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class k1 implements defpackage.pj {
    public static final k1 a = new k1();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        e1 e1Var = (e1) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        e1Var.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, e1Var.a);
        List list = y7.a;
        w7 w7Var = e1Var.b;
        r7fVar.getClass();
        fx6Var.getClass();
        w7Var.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, w7Var.a);
        r7fVar.Z("colors");
        x7 x7Var = x7.a;
        ArrayList arrayList = w7Var.b;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            r7fVar.j();
            x7Var.a(r7fVar, fx6Var, obj2);
            r7fVar.p();
        }
        r7fVar.l();
        s7 s7Var = w7Var.c;
        if (s7Var != null) {
            List list2 = a8.a;
            r7fVar.Z("angle");
            defpackage.uj.c.a(r7fVar, fx6Var, Double.valueOf(s7Var.a));
        }
        t7 t7Var = w7Var.d;
        if (t7Var != null) {
            b8.d(r7fVar, fx6Var, t7Var);
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
        }
        a7fVar.k();
        w7 c = y7.c(a7fVar, fx6Var);
        str.getClass();
        return new e1(str, c);
    }
}
