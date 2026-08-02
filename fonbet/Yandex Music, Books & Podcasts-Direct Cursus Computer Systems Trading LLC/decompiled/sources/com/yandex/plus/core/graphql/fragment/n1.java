package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.jc3;
import defpackage.r0o;
import defpackage.r7f;
import defpackage.t75;
import defpackage.xq0;
import defpackage.y2x;
import java.util.List;

/* loaded from: classes4.dex */
public final class n1 implements defpackage.pj {
    public static final n1 a = new n1();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        h1 h1Var = (h1) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        h1Var.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, h1Var.a);
        f1 f1Var = h1Var.b;
        if (f1Var != null) {
            l1.d(r7fVar, fx6Var, f1Var);
        }
        g1 g1Var = h1Var.c;
        if (g1Var != null) {
            m1.d(r7fVar, fx6Var, g1Var);
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        f1 f1Var;
        a7fVar.getClass();
        fx6Var.getClass();
        g1 g1Var = null;
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
        }
        if (str == null) {
            xq0.q("__typename was not found");
            return null;
        }
        jc3 E = y2x.E("GradientColor");
        r0o r0oVar = fx6Var.a;
        if (y2x.r(E, r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            f1Var = l1.c(a7fVar, fx6Var);
        } else {
            f1Var = null;
        }
        if (y2x.r(y2x.E("HexColor"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            g1Var = m1.c(a7fVar, fx6Var);
        }
        return new h1(str, f1Var, g1Var);
    }
}
