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
public abstract class w0 implements defpackage.pj {
    public static final List a = t75.c("__typename");

    public static r0 c(a7f a7fVar, fx6 fx6Var) {
        o0 o0Var;
        l0 l0Var;
        m0 m0Var;
        a7fVar.getClass();
        fx6Var.getClass();
        n0 n0Var = null;
        String str = null;
        while (a7fVar.z0(a) == 0) {
            str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
        }
        if (str == null) {
            xq0.q("__typename was not found");
            return null;
        }
        jc3 E = y2x.E("CheckoutRgbaColor");
        r0o r0oVar = fx6Var.a;
        if (y2x.r(E, r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            o0Var = b1.c(a7fVar, fx6Var);
        } else {
            o0Var = null;
        }
        if (y2x.r(y2x.E("CheckoutDesignColor"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            l0Var = y0.c(a7fVar, fx6Var);
        } else {
            l0Var = null;
        }
        if (y2x.r(y2x.E("CheckoutLinearGradientColor"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            m0Var = z0.c(a7fVar, fx6Var);
        } else {
            m0Var = null;
        }
        if (y2x.r(y2x.E("CheckoutRadialGradientColor"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            n0Var = a1.c(a7fVar, fx6Var);
        }
        return new r0(str, o0Var, l0Var, m0Var, n0Var);
    }

    public static void d(r7f r7fVar, fx6 fx6Var, r0 r0Var) {
        r7fVar.getClass();
        fx6Var.getClass();
        r0Var.getClass();
        r7fVar.Z("__typename");
        defpackage.tj tjVar = defpackage.uj.a;
        tjVar.a(r7fVar, fx6Var, r0Var.a);
        o0 o0Var = r0Var.b;
        if (o0Var != null) {
            List list = b1.a;
            r7fVar.Z("rgba");
            tjVar.a(r7fVar, fx6Var, o0Var.a);
        }
        l0 l0Var = r0Var.c;
        if (l0Var != null) {
            y0.d(r7fVar, fx6Var, l0Var);
        }
        m0 m0Var = r0Var.d;
        if (m0Var != null) {
            z0.d(r7fVar, fx6Var, m0Var);
        }
        n0 n0Var = r0Var.e;
        if (n0Var != null) {
            a1.d(r7fVar, fx6Var, n0Var);
        }
    }
}
