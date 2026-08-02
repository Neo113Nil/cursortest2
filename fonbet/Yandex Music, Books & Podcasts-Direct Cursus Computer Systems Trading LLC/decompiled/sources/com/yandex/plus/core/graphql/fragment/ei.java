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
public abstract class ei implements defpackage.pj {
    public static final List a = t75.c("__typename");

    public static ai c(a7f a7fVar, fx6 fx6Var) {
        zh zhVar;
        yh yhVar;
        a7fVar.getClass();
        fx6Var.getClass();
        xh xhVar = null;
        String str = null;
        while (a7fVar.z0(a) == 0) {
            str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
        }
        if (str == null) {
            xq0.q("__typename was not found");
            return null;
        }
        jc3 E = y2x.E("TaxiATTextProperty");
        r0o r0oVar = fx6Var.a;
        if (y2x.r(E, r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            zhVar = di.c(a7fVar, fx6Var);
        } else {
            zhVar = null;
        }
        if (y2x.r(y2x.E("TaxiATLinkProperty"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            yhVar = ci.c(a7fVar, fx6Var);
        } else {
            yhVar = null;
        }
        if (y2x.r(y2x.E("TaxiATImageProperty"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            xhVar = bi.c(a7fVar, fx6Var);
        }
        return new ai(str, zhVar, yhVar, xhVar);
    }
}
