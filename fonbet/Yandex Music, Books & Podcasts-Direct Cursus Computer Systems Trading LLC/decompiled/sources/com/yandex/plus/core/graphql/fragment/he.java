package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.j8g;
import defpackage.r7f;
import defpackage.u75;
import defpackage.vgj;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class he implements defpackage.pj {
    public static final List a = u75.h("text", "templates", "actionText", "accessibilityEnabled");

    public static ge c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        Boolean bool = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                j8g j8gVar = new j8g(defpackage.uj.a, 0);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    arrayList = null;
                } else {
                    arrayList = j8gVar.c(a7fVar, fx6Var);
                }
            } else if (z0 == 2) {
                str2 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            } else {
                if (z0 != 3) {
                    return new ge(str, arrayList, str2, bool);
                }
                bool = (Boolean) defpackage.uj.l.b(a7fVar, fx6Var);
            }
        }
    }

    public static void d(r7f r7fVar, fx6 fx6Var, ge geVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        geVar.getClass();
        r7fVar.Z("text");
        vgj vgjVar = defpackage.uj.i;
        vgjVar.a(r7fVar, fx6Var, geVar.a);
        r7fVar.Z("templates");
        j8g j8gVar = new j8g(defpackage.uj.a, 0);
        List list = geVar.b;
        if (list == null) {
            r7fVar.B0();
        } else {
            j8gVar.e(r7fVar, fx6Var, list);
        }
        r7fVar.Z("actionText");
        vgjVar.a(r7fVar, fx6Var, geVar.c);
        r7fVar.Z("accessibilityEnabled");
        defpackage.uj.l.a(r7fVar, fx6Var, geVar.d);
    }
}
