package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class oj implements defpackage.pj {
    public static final List a = t75.c("__typename");

    public static jj c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(a) == 0) {
            str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
        }
        a7fVar.k();
        de c = fe.c(a7fVar, fx6Var);
        str.getClass();
        return new jj(str, c);
    }

    public static void d(r7f r7fVar, fx6 fx6Var, jj jjVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        jjVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, jjVar.a);
        List list = fe.a;
        de deVar = jjVar.b;
        r7fVar.getClass();
        fx6Var.getClass();
        deVar.getClass();
        r7fVar.Z("metaColor");
        defpackage.uj.i.a(r7fVar, fx6Var, deVar.a);
        r7fVar.Z("items");
        qhj qhjVar = new qhj(ee.a, true);
        ArrayList arrayList = deVar.b;
        r7fVar.m();
        for (Object obj : arrayList) {
            if (obj == null) {
                r7fVar.B0();
            } else {
                qhjVar.a(r7fVar, fx6Var, obj);
            }
        }
        r7fVar.l();
    }
}
