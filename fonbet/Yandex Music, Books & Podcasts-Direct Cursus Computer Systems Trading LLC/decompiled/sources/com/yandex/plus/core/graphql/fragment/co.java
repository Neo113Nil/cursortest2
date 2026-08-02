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
public abstract class co implements defpackage.pj {
    public static final List a = t75.c("__typename");

    public static xn c(a7f a7fVar, fx6 fx6Var) {
        tn tnVar;
        vn vnVar;
        a7fVar.getClass();
        fx6Var.getClass();
        un unVar = null;
        String str = null;
        while (a7fVar.z0(a) == 0) {
            str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
        }
        if (str == null) {
            xq0.q("__typename was not found");
            return null;
        }
        jc3 E = y2x.E("DeeplinkCrossAction");
        r0o r0oVar = fx6Var.a;
        if (y2x.r(E, r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            tnVar = yn.c(a7fVar, fx6Var);
        } else {
            tnVar = null;
        }
        if (y2x.r(y2x.E("ServiceSpecificCrossAction"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            vnVar = ao.c(a7fVar, fx6Var);
        } else {
            vnVar = null;
        }
        if (y2x.r(y2x.E("JustInteractCrossAction"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            unVar = zn.c(a7fVar, fx6Var);
        }
        return new xn(str, tnVar, vnVar, unVar);
    }

    public static void d(r7f r7fVar, fx6 fx6Var, xn xnVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        xnVar.getClass();
        r7fVar.Z("__typename");
        defpackage.tj tjVar = defpackage.uj.a;
        tjVar.a(r7fVar, fx6Var, xnVar.a);
        tn tnVar = xnVar.b;
        if (tnVar != null) {
            List list = yn.a;
            r7fVar.Z("deeplink");
            tjVar.a(r7fVar, fx6Var, tnVar.a);
        }
        vn vnVar = xnVar.c;
        if (vnVar != null) {
            ao.d(r7fVar, fx6Var, vnVar);
        }
        un unVar = xnVar.d;
        if (unVar != null) {
            List list2 = zn.a;
            r7fVar.Z("__typename");
            tjVar.a(r7fVar, fx6Var, unVar.a);
        }
    }
}
