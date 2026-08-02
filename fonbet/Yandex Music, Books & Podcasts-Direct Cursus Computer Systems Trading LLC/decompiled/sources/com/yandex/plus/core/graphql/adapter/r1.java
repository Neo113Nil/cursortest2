package com.yandex.plus.core.graphql.adapter;

import com.yandex.plus.core.graphql.fragment.l6;
import com.yandex.plus.core.graphql.fragment.q6;
import com.yandex.plus.core.graphql.fragment.r6;
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
public final class r1 implements pj {
    public static final r1 a = new r1();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.g2 g2Var = (com.yandex.plus.core.graphql.g2) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        g2Var.getClass();
        r7fVar.Z("__typename");
        uj.a.a(r7fVar, fx6Var, g2Var.a);
        List list = q6.a;
        l6 l6Var = g2Var.b;
        r7fVar.getClass();
        fx6Var.getClass();
        l6Var.getClass();
        r7fVar.Z("popups");
        r6 r6Var = r6.a;
        tj tjVar = uj.a;
        ArrayList arrayList = l6Var.a;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            r7fVar.j();
            r6Var.a(r7fVar, fx6Var, obj2);
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
        l6 c = q6.c(a7fVar, fx6Var);
        str.getClass();
        return new com.yandex.plus.core.graphql.g2(str, c);
    }
}
