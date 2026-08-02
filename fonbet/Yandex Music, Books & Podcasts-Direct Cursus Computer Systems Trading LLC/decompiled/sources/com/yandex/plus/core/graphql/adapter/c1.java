package com.yandex.plus.core.graphql.adapter;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.r0o;
import defpackage.r7f;
import defpackage.t75;
import defpackage.uj;
import defpackage.xq0;
import defpackage.y2x;
import java.util.List;

/* loaded from: classes4.dex */
public final class c1 implements pj {
    public static final c1 a = new c1();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.m1 m1Var = (com.yandex.plus.core.graphql.m1) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        m1Var.getClass();
        r7fVar.Z("__typename");
        uj.a.a(r7fVar, fx6Var, m1Var.a);
        com.yandex.plus.core.graphql.l1 l1Var = m1Var.b;
        if (l1Var != null) {
            b1.d(r7fVar, fx6Var, l1Var);
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        r0o r0oVar = fx6Var.a;
        com.yandex.plus.core.graphql.l1 l1Var = null;
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) uj.a.b(a7fVar, fx6Var);
        }
        if (str == null) {
            xq0.q("__typename was not found");
            return null;
        }
        if (y2x.r(y2x.E("DecoratedTextReferencePartHighlight"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            l1Var = b1.c(a7fVar, fx6Var);
        }
        return new com.yandex.plus.core.graphql.m1(str, l1Var);
    }
}
