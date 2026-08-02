package com.yandex.plus.core.graphql.adapter;

import com.yandex.plus.core.graphql.fragment.o4;
import com.yandex.plus.core.graphql.fragment.p4;
import com.yandex.plus.core.graphql.fragment.r4;
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
public final class q0 implements pj {
    public static final q0 a = new q0();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.w0 w0Var = (com.yandex.plus.core.graphql.w0) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        w0Var.getClass();
        r7fVar.Z("__typename");
        uj.a.a(r7fVar, fx6Var, w0Var.a);
        List list = p4.a;
        o4 o4Var = w0Var.b;
        r7fVar.getClass();
        fx6Var.getClass();
        o4Var.getClass();
        r7fVar.Z("sectionGroups");
        r4 r4Var = r4.a;
        tj tjVar = uj.a;
        ArrayList arrayList = o4Var.a;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            r7fVar.j();
            r4Var.a(r7fVar, fx6Var, obj2);
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
        o4 c = p4.c(a7fVar, fx6Var);
        str.getClass();
        return new com.yandex.plus.core.graphql.w0(str, c);
    }
}
