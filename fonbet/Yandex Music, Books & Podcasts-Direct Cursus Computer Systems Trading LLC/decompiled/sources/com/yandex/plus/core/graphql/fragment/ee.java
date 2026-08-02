package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class ee implements defpackage.pj {
    public static final ee a = new ee();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        ce ceVar = (ce) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        ceVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, ceVar.a);
        List list = ei.a;
        ai aiVar = ceVar.b;
        r7fVar.getClass();
        fx6Var.getClass();
        aiVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, aiVar.a);
        zh zhVar = aiVar.b;
        if (zhVar != null) {
            di.d(r7fVar, fx6Var, zhVar);
        }
        yh yhVar = aiVar.c;
        if (yhVar != null) {
            ci.d(r7fVar, fx6Var, yhVar);
        }
        xh xhVar = aiVar.d;
        if (xhVar != null) {
            bi.d(r7fVar, fx6Var, xhVar);
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
        ai c = ei.c(a7fVar, fx6Var);
        str.getClass();
        return new ce(str, c);
    }
}
