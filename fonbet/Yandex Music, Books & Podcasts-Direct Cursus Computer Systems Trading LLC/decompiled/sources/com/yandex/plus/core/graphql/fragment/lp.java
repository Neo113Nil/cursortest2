package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.jc3;
import defpackage.r0o;
import defpackage.t75;
import defpackage.xq0;
import defpackage.y2x;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class lp implements defpackage.pj {
    public static final List a = t75.c("__typename");

    public static hp c(a7f a7fVar, fx6 fx6Var) {
        gp gpVar;
        fp fpVar;
        a7fVar.getClass();
        fx6Var.getClass();
        ep epVar = null;
        String str = null;
        while (a7fVar.z0(a) == 0) {
            str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
        }
        if (str == null) {
            xq0.q("__typename was not found");
            return null;
        }
        jc3 E = y2x.E("RowCrossWidgetGroupProperties");
        r0o r0oVar = fx6Var.a;
        if (y2x.r(E, r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            gpVar = kp.c(a7fVar, fx6Var);
        } else {
            gpVar = null;
        }
        if (y2x.r(y2x.E("ColumnCrossWidgetGroupProperties"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            fpVar = jp.c(a7fVar, fx6Var);
        } else {
            fpVar = null;
        }
        if (y2x.r(y2x.E("BoxCrossWidgetGroupProperties"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            epVar = ip.c(a7fVar, fx6Var);
        }
        return new hp(str, gpVar, fpVar, epVar);
    }
}
