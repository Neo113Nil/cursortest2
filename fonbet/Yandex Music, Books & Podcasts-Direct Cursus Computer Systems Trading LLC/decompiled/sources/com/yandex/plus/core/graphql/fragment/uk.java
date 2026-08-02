package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class uk implements defpackage.pj {
    public static final uk a = new uk();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        ak akVar = (ak) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        akVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, akVar.a);
        List list = hj.a;
        fj fjVar = akVar.b;
        r7fVar.getClass();
        fx6Var.getClass();
        fjVar.getClass();
        r7fVar.Z("text");
        ij ijVar = ij.a;
        defpackage.tj tjVar = defpackage.uj.a;
        ej ejVar = fjVar.a;
        r7fVar.j();
        ijVar.a(r7fVar, fx6Var, ejVar);
        r7fVar.p();
        r7fVar.Z("lineHeight");
        defpackage.uj.k.a(r7fVar, fx6Var, fjVar.b);
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
        fj c = hj.c(a7fVar, fx6Var);
        str.getClass();
        return new ak(str, c);
    }
}
