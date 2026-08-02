package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class p implements defpackage.pj {
    public static final p a = new p();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        m mVar = (m) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        mVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, mVar.a);
        List list = s.a;
        r rVar = mVar.b;
        r7fVar.getClass();
        fx6Var.getClass();
        rVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, rVar.a);
        q qVar = rVar.b;
        if (qVar != null) {
            t.d(r7fVar, fx6Var, qVar);
        }
        List list2 = dp.a;
        bp bpVar = mVar.c;
        r7fVar.getClass();
        fx6Var.getClass();
        bpVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, bpVar.a);
        ap apVar = bpVar.b;
        if (apVar != null) {
            cp.d(r7fVar, fx6Var, apVar);
        }
        List list3 = io.a;
        go goVar = mVar.d;
        r7fVar.getClass();
        fx6Var.getClass();
        goVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, goVar.a);
        eo eoVar = goVar.b;
        if (eoVar != null) {
            ho.d(r7fVar, fx6Var, eoVar);
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
        r c = s.c(a7fVar, fx6Var);
        a7fVar.k();
        bp c2 = dp.c(a7fVar, fx6Var);
        a7fVar.k();
        go c3 = io.c(a7fVar, fx6Var);
        str.getClass();
        return new m(str, c, c2, c3);
    }
}
