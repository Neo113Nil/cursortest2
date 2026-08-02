package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class zf implements defpackage.pj {
    public static final zf a = new zf();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        sc scVar = (sc) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        scVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, scVar.a);
        List list = wh.a;
        uh uhVar = scVar.b;
        r7fVar.getClass();
        fx6Var.getClass();
        uhVar.getClass();
        r7fVar.Z("rootNodeId");
        defpackage.uj.b.a(r7fVar, fx6Var, Integer.valueOf(uhVar.a));
        r7fVar.Z("nodes");
        qhj qhjVar = new qhj(vh.a, true);
        ArrayList arrayList = uhVar.b;
        r7fVar.m();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qhjVar.a(r7fVar, fx6Var, it.next());
        }
        r7fVar.l();
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
        uh c = wh.c(a7fVar, fx6Var);
        str.getClass();
        return new sc(str, c);
    }
}
