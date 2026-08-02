package com.yandex.plus.core.graphql.adapter;

import com.yandex.plus.core.graphql.fragment.b3;
import com.yandex.plus.core.graphql.fragment.y2;
import com.yandex.plus.core.graphql.fragment.z2;
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
public final class p0 implements pj {
    public static final p0 a = new p0();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.v0 v0Var = (com.yandex.plus.core.graphql.v0) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        v0Var.getClass();
        r7fVar.Z("__typename");
        uj.a.a(r7fVar, fx6Var, v0Var.a);
        List list = z2.a;
        y2 y2Var = v0Var.b;
        r7fVar.getClass();
        fx6Var.getClass();
        y2Var.getClass();
        r7fVar.Z("sectionGroups");
        b3 b3Var = b3.a;
        tj tjVar = uj.a;
        ArrayList arrayList = y2Var.a;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            r7fVar.j();
            b3Var.a(r7fVar, fx6Var, obj2);
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
        y2 c = z2.c(a7fVar, fx6Var);
        str.getClass();
        return new com.yandex.plus.core.graphql.v0(str, c);
    }
}
