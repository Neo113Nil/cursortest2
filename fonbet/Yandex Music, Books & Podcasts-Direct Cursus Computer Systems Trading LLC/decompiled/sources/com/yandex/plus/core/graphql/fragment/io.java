package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r0o;
import defpackage.t75;
import defpackage.xq0;
import defpackage.y2x;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class io implements defpackage.pj {
    public static final List a = t75.c("__typename");

    public static go c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        r0o r0oVar = fx6Var.a;
        eo eoVar = null;
        String str = null;
        while (a7fVar.z0(a) == 0) {
            str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
        }
        if (str == null) {
            xq0.q("__typename was not found");
            return null;
        }
        if (y2x.r(y2x.E("StyledTextProperties"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            eoVar = ho.c(a7fVar, fx6Var);
        }
        return new go(str, eoVar);
    }
}
