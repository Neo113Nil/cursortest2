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
public abstract class sj implements defpackage.pj {
    public static final List a = t75.c("__typename");

    public static nj c(a7f a7fVar, fx6 fx6Var) {
        mj mjVar;
        lj ljVar;
        kj kjVar;
        a7fVar.getClass();
        fx6Var.getClass();
        jj jjVar = null;
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
            mjVar = rj.c(a7fVar, fx6Var);
        } else {
            mjVar = null;
        }
        if (y2x.r(y2x.E("TaxiATLinkProperty"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            ljVar = qj.c(a7fVar, fx6Var);
        } else {
            ljVar = null;
        }
        if (y2x.r(y2x.E("TaxiATImageProperty"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            kjVar = pj.c(a7fVar, fx6Var);
        } else {
            kjVar = null;
        }
        if (y2x.r(y2x.E("TaxiATContainer"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            jjVar = oj.c(a7fVar, fx6Var);
        }
        return new nj(str, mjVar, ljVar, kjVar, jjVar);
    }

    public static void d(r7f r7fVar, fx6 fx6Var, nj njVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        njVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, njVar.a);
        mj mjVar = njVar.b;
        if (mjVar != null) {
            rj.d(r7fVar, fx6Var, mjVar);
        }
        lj ljVar = njVar.c;
        if (ljVar != null) {
            qj.d(r7fVar, fx6Var, ljVar);
        }
        kj kjVar = njVar.d;
        if (kjVar != null) {
            pj.d(r7fVar, fx6Var, kjVar);
        }
        jj jjVar = njVar.e;
        if (jjVar != null) {
            oj.d(r7fVar, fx6Var, jjVar);
        }
    }
}
