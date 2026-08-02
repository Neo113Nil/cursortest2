package com.yandex.plus.core.graphql.adapter;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class a implements pj {
    public static final a a = new a();
    public static final List b = t75.c("status");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.a aVar = (com.yandex.plus.core.graphql.a) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        aVar.getClass();
        r7fVar.Z("status");
        r7fVar.m0(aVar.a.a);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        com.yandex.plus.core.graphql.type.d dVar;
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.type.d dVar2 = null;
        while (a7fVar.z0(b) == 0) {
            String f0 = a7fVar.f0();
            f0.getClass();
            com.yandex.plus.core.graphql.type.d.b.getClass();
            com.yandex.plus.core.graphql.type.d[] values = com.yandex.plus.core.graphql.type.d.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    dVar = null;
                    break;
                }
                dVar = values[i];
                if (dVar.a.equals(f0)) {
                    break;
                }
                i++;
            }
            dVar2 = dVar == null ? com.yandex.plus.core.graphql.type.d.UNKNOWN__ : dVar;
        }
        dVar2.getClass();
        return new com.yandex.plus.core.graphql.a(dVar2);
    }
}
