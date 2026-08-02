package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.jc3;
import defpackage.qhj;
import defpackage.r0o;
import defpackage.u75;
import defpackage.xq0;
import defpackage.y2x;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class y7 implements defpackage.pj {
    public static final List a = u75.h("__typename", "colors");

    public static w7 c(a7f a7fVar, fx6 fx6Var) {
        s7 s7Var;
        a7fVar.getClass();
        fx6Var.getClass();
        t7 t7Var = null;
        String str = null;
        ArrayList arrayList = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    break;
                }
                x7 x7Var = x7.a;
                defpackage.tj tjVar = defpackage.uj.a;
                qhj qhjVar = new qhj(x7Var, false);
                a7fVar.m();
                arrayList = new ArrayList();
                while (a7fVar.hasNext()) {
                    arrayList.add(qhjVar.b(a7fVar, fx6Var));
                }
                a7fVar.l();
            }
        }
        if (str == null) {
            xq0.q("__typename was not found");
            return null;
        }
        jc3 E = y2x.E("LinearGradient");
        r0o r0oVar = fx6Var.a;
        if (y2x.r(E, r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            s7Var = a8.c(a7fVar, fx6Var);
        } else {
            s7Var = null;
        }
        if (y2x.r(y2x.E("RadialGradient"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            t7Var = b8.c(a7fVar, fx6Var);
        }
        arrayList.getClass();
        return new w7(str, arrayList, s7Var, t7Var);
    }
}
