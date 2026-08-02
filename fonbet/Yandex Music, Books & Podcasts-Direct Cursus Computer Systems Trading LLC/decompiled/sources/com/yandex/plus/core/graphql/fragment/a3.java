package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.j8g;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class a3 implements defpackage.pj {
    public static final a3 a = new a3();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        w2 w2Var = (w2) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        w2Var.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, w2Var.a);
        List list = r3.a;
        q3 q3Var = w2Var.b;
        r7fVar.getClass();
        fx6Var.getClass();
        q3Var.getClass();
        r7fVar.Z("metaShortcuts");
        s3 s3Var = s3.a;
        defpackage.tj tjVar = defpackage.uj.a;
        j8g j8gVar = new j8g(new qhj(s3Var, true), 0);
        List list2 = q3Var.a;
        if (list2 == null) {
            r7fVar.B0();
        } else {
            j8gVar.e(r7fVar, fx6Var, list2);
        }
        r7fVar.Z("shortcuts");
        j8g j8gVar2 = new j8g(new qhj(t3.a, true), 0);
        List list3 = q3Var.b;
        if (list3 == null) {
            r7fVar.B0();
        } else {
            j8gVar2.e(r7fVar, fx6Var, list3);
        }
        r7fVar.Z("viewType");
        r7fVar.m0(q3Var.c.a);
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
        q3 c = r3.c(a7fVar, fx6Var);
        str.getClass();
        return new w2(str, c);
    }
}
