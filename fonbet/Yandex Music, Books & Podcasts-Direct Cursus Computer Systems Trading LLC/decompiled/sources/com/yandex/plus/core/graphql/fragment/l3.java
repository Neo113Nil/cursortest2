package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r0o;
import defpackage.r7f;
import defpackage.t75;
import defpackage.xq0;
import defpackage.y2x;
import java.util.List;

/* loaded from: classes4.dex */
public final class l3 implements defpackage.pj {
    public static final l3 a = new l3();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        e3 e3Var = (e3) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        e3Var.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, e3Var.a);
        f3 f3Var = e3Var.b;
        if (f3Var != null) {
            m3.d(r7fVar, fx6Var, f3Var);
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        r0o r0oVar = fx6Var.a;
        f3 f3Var = null;
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
        }
        if (str == null) {
            xq0.q("__typename was not found");
            return null;
        }
        if (y2x.r(y2x.E("TextProperties"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            f3Var = m3.c(a7fVar, fx6Var);
        }
        return new e3(str, f3Var);
    }
}
