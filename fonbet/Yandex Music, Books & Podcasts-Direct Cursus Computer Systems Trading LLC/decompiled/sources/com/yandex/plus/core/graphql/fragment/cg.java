package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.j8g;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class cg implements defpackage.pj {
    public static final cg a = new cg();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        vc vcVar = (vc) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        vcVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, vcVar.a);
        List list = ah.a;
        yg ygVar = vcVar.b;
        r7fVar.getClass();
        fx6Var.getClass();
        ygVar.getClass();
        r7fVar.Z("metrics");
        zg zgVar = zg.a;
        defpackage.tj tjVar = defpackage.uj.a;
        j8g j8gVar = new j8g(new qhj(zgVar, false), 0);
        List list2 = ygVar.a;
        if (list2 == null) {
            r7fVar.B0();
        } else {
            j8gVar.e(r7fVar, fx6Var, list2);
        }
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
        yg c = ah.c(a7fVar, fx6Var);
        str.getClass();
        return new vc(str, c);
    }
}
