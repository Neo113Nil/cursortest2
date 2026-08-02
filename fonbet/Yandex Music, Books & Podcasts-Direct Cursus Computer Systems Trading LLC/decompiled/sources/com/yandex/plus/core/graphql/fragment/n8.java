package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class n8 implements defpackage.pj {
    public static final n8 a = new n8();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        h8 h8Var = (h8) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        h8Var.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, h8Var.a);
        List list = tp.a;
        pp ppVar = h8Var.b;
        r7fVar.getClass();
        fx6Var.getClass();
        ppVar.getClass();
        r7fVar.Z("__typename");
        defpackage.tj tjVar = defpackage.uj.a;
        tjVar.a(r7fVar, fx6Var, ppVar.a);
        mp mpVar = ppVar.b;
        if (mpVar != null) {
            List list2 = qp.a;
            r7fVar.Z("__typename");
            tjVar.a(r7fVar, fx6Var, mpVar.a);
        }
        np npVar = ppVar.c;
        if (npVar != null) {
            List list3 = rp.a;
            r7fVar.Z("__typename");
            tjVar.a(r7fVar, fx6Var, npVar.a);
        }
        op opVar = ppVar.d;
        if (opVar != null) {
            List list4 = sp.a;
            r7fVar.Z("fix");
            defpackage.uj.b.a(r7fVar, fx6Var, Integer.valueOf(opVar.a));
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
        pp c = tp.c(a7fVar, fx6Var);
        str.getClass();
        return new h8(str, c);
    }
}
