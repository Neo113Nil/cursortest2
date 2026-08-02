package com.yandex.plus.core.graphql.adapter;

import com.yandex.plus.core.graphql.fragment.u5;
import com.yandex.plus.core.graphql.fragment.v5;
import com.yandex.plus.core.graphql.fragment.x5;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.r7f;
import defpackage.t75;
import defpackage.tj;
import defpackage.uj;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class i1 implements pj {
    public static final i1 a = new i1();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.u1 u1Var = (com.yandex.plus.core.graphql.u1) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        u1Var.getClass();
        r7fVar.Z("__typename");
        uj.a.a(r7fVar, fx6Var, u1Var.a);
        List list = v5.a;
        u5 u5Var = u1Var.b;
        r7fVar.getClass();
        fx6Var.getClass();
        u5Var.getClass();
        r7fVar.Z("sectionGroups");
        x5 x5Var = x5.a;
        tj tjVar = uj.a;
        ArrayList arrayList = u5Var.a;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            r7fVar.j();
            x5Var.a(r7fVar, fx6Var, obj2);
            r7fVar.p();
        }
        r7fVar.l();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) uj.a.b(a7fVar, fx6Var);
        }
        a7fVar.k();
        u5 c = v5.c(a7fVar, fx6Var);
        str.getClass();
        return new com.yandex.plus.core.graphql.u1(str, c);
    }
}
