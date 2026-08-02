package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.j8g;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class q4 implements defpackage.pj {
    public static final q4 a = new q4();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        m4 m4Var = (m4) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        m4Var.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, m4Var.a);
        List list = a5.a;
        z4 z4Var = m4Var.b;
        r7fVar.getClass();
        fx6Var.getClass();
        z4Var.getClass();
        r7fVar.Z("metaShortcuts");
        b5 b5Var = b5.a;
        defpackage.tj tjVar = defpackage.uj.a;
        j8g j8gVar = new j8g(new qhj(b5Var, true), 0);
        List list2 = z4Var.a;
        if (list2 == null) {
            r7fVar.B0();
        } else {
            j8gVar.e(r7fVar, fx6Var, list2);
        }
        r7fVar.Z("viewType");
        r7fVar.m0(z4Var.b.a);
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
        z4 c = a5.c(a7fVar, fx6Var);
        str.getClass();
        return new m4(str, c);
    }
}
