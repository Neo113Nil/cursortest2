package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class nk implements defpackage.pj {
    public static final nk a = new nk();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        uj ujVar = (uj) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        ujVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, ujVar.a);
        List list = sd.a;
        qd qdVar = ujVar.b;
        r7fVar.Z("text");
        td tdVar = td.a;
        pd pdVar = qdVar.a;
        r7fVar.j();
        tdVar.a(r7fVar, fx6Var, pdVar);
        r7fVar.p();
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
        qd c = sd.c(a7fVar, fx6Var);
        str.getClass();
        return new uj(str, c);
    }
}
