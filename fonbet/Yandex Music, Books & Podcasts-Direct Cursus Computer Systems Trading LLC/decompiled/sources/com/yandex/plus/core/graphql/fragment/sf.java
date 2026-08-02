package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class sf implements defpackage.pj {
    public static final sf a = new sf();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        pf pfVar = (pf) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        pfVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, pfVar.a);
        List list = tf.a;
        qf qfVar = pfVar.b;
        r7fVar.Z("position");
        r7fVar.m0(qfVar.a.a);
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
        qf c = tf.c(a7fVar, fx6Var);
        str.getClass();
        return new pf(str, c);
    }
}
