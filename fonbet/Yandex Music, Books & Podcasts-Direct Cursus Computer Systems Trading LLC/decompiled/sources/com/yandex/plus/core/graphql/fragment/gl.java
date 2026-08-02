package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import defpackage.vgj;
import java.util.List;

/* loaded from: classes4.dex */
public final class gl implements defpackage.pj {
    public static final gl a = new gl();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        bl blVar = (bl) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        blVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, blVar.a);
        List list = kg.a;
        jg jgVar = blVar.b;
        r7fVar.getClass();
        fx6Var.getClass();
        jgVar.getClass();
        r7fVar.Z("widgetId");
        vgj vgjVar = defpackage.uj.i;
        vgjVar.a(r7fVar, fx6Var, jgVar.a);
        r7fVar.Z("widgetGroupId");
        vgjVar.a(r7fVar, fx6Var, jgVar.b);
        r7fVar.Z("type");
        r7fVar.m0(jgVar.c.a);
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
        jg c = kg.c(a7fVar, fx6Var);
        str.getClass();
        return new bl(str, c);
    }
}
