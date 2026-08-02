package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class m6 implements defpackage.pj {
    public static final m6 a = new m6();
    public static final List b = t75.c("actionType");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        g6 g6Var = (g6) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        g6Var.getClass();
        r7fVar.Z("actionType");
        r7fVar.m0(g6Var.a.a);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        com.yandex.plus.core.graphql.type.b bVar;
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.type.b bVar2 = null;
        while (a7fVar.z0(b) == 0) {
            String f0 = a7fVar.f0();
            f0.getClass();
            com.yandex.plus.core.graphql.type.b.b.getClass();
            com.yandex.plus.core.graphql.type.b[] values = com.yandex.plus.core.graphql.type.b.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    bVar = null;
                    break;
                }
                bVar = values[i];
                if (bVar.a.equals(f0)) {
                    break;
                }
                i++;
            }
            bVar2 = bVar == null ? com.yandex.plus.core.graphql.type.b.UNKNOWN__ : bVar;
        }
        bVar2.getClass();
        return new g6(bVar2);
    }
}
