package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.j8g;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import defpackage.vgj;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class c0 implements defpackage.pj {
    public static final List a = u75.h("backgroundColor", "backgroundGradientsTv");

    public static a0 c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        ArrayList arrayList = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    return new a0(str, arrayList);
                }
                b0 b0Var = b0.a;
                defpackage.tj tjVar = defpackage.uj.a;
                j8g j8gVar = new j8g(new vgj(new qhj(b0Var, false)), 0);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    arrayList = null;
                } else {
                    arrayList = j8gVar.c(a7fVar, fx6Var);
                }
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, a0 a0Var) {
        r7fVar.getClass();
        fx6Var.getClass();
        a0Var.getClass();
        r7fVar.Z("backgroundColor");
        defpackage.uj.i.a(r7fVar, fx6Var, a0Var.a);
        r7fVar.Z("backgroundGradientsTv");
        j8g j8gVar = new j8g(new vgj(new qhj(b0.a, false)), 0);
        List list = a0Var.b;
        if (list == null) {
            r7fVar.B0();
        } else {
            j8gVar.e(r7fVar, fx6Var, list);
        }
    }
}
