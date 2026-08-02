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
public abstract class fa implements defpackage.pj {
    public static final List a = t75.c("__typename");

    public static ea c(a7f a7fVar, fx6 fx6Var) {
        aa aaVar;
        ba baVar;
        ca caVar;
        a7fVar.getClass();
        fx6Var.getClass();
        da daVar = null;
        String str = null;
        while (a7fVar.z0(a) == 0) {
            str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
        }
        if (str == null) {
            xq0.q("__typename was not found");
            return null;
        }
        jc3 E = y2x.E("IntroPlan");
        r0o r0oVar = fx6Var.a;
        if (y2x.r(E, r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            aaVar = ga.c(a7fVar, fx6Var);
        } else {
            aaVar = null;
        }
        if (y2x.r(y2x.E("IntroUntilPlan"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            baVar = ha.c(a7fVar, fx6Var);
        } else {
            baVar = null;
        }
        if (y2x.r(y2x.E("TrialPlan"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            caVar = ia.c(a7fVar, fx6Var);
        } else {
            caVar = null;
        }
        if (y2x.r(y2x.E("TrialUntilPlan"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            daVar = ja.c(a7fVar, fx6Var);
        }
        return new ea(str, aaVar, baVar, caVar, daVar);
    }

    public static void d(r7f r7fVar, fx6 fx6Var, ea eaVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        eaVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, eaVar.a);
        aa aaVar = eaVar.b;
        if (aaVar != null) {
            ga.d(r7fVar, fx6Var, aaVar);
        }
        ba baVar = eaVar.c;
        if (baVar != null) {
            ha.d(r7fVar, fx6Var, baVar);
        }
        ca caVar = eaVar.d;
        if (caVar != null) {
            ia.d(r7fVar, fx6Var, caVar);
        }
        da daVar = eaVar.e;
        if (daVar != null) {
            ja.d(r7fVar, fx6Var, daVar);
        }
    }
}
