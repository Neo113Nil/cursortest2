package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.j8g;
import defpackage.r7f;
import defpackage.u75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class ph implements defpackage.pj {
    public static final ph a = new ph();
    public static final List b = u75.h("argName", "intSet", "stringSet");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        hh hhVar = (hh) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        hhVar.getClass();
        r7fVar.Z("argName");
        defpackage.tj tjVar = defpackage.uj.a;
        tjVar.a(r7fVar, fx6Var, hhVar.a);
        r7fVar.Z("intSet");
        j8g j8gVar = new j8g(defpackage.uj.b, 0);
        List list = hhVar.b;
        if (list == null) {
            r7fVar.B0();
        } else {
            j8gVar.e(r7fVar, fx6Var, list);
        }
        r7fVar.Z("stringSet");
        j8g j8gVar2 = new j8g(tjVar, 0);
        List list2 = hhVar.c;
        if (list2 == null) {
            r7fVar.B0();
        } else {
            j8gVar2.e(r7fVar, fx6Var, list2);
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                j8g j8gVar = new j8g(defpackage.uj.b, 0);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    arrayList = null;
                } else {
                    arrayList = j8gVar.c(a7fVar, fx6Var);
                }
            } else {
                if (z0 != 2) {
                    str.getClass();
                    return new hh(str, arrayList, arrayList2);
                }
                j8g j8gVar2 = new j8g(defpackage.uj.a, 0);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    arrayList2 = null;
                } else {
                    arrayList2 = j8gVar2.c(a7fVar, fx6Var);
                }
            }
        }
    }
}
