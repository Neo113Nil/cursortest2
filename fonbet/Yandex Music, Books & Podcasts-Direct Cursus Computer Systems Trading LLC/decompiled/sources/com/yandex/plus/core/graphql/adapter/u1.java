package com.yandex.plus.core.graphql.adapter;

import com.yandex.plus.core.graphql.l2;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class u1 implements pj {
    public static final u1 a = new u1();
    public static final List b = t75.c("plaqueSeen");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        l2 l2Var = (l2) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        l2Var.getClass();
        r7fVar.Z("plaqueSeen");
        r7fVar.m0(l2Var.a.a);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        com.yandex.plus.core.graphql.type.d0 d0Var;
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.type.d0 d0Var2 = null;
        while (a7fVar.z0(b) == 0) {
            String f0 = a7fVar.f0();
            f0.getClass();
            com.yandex.plus.core.graphql.type.d0.b.getClass();
            com.yandex.plus.core.graphql.type.d0[] values = com.yandex.plus.core.graphql.type.d0.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    d0Var = null;
                    break;
                }
                d0Var = values[i];
                if (d0Var.a.equals(f0)) {
                    break;
                }
                i++;
            }
            d0Var2 = d0Var == null ? com.yandex.plus.core.graphql.type.d0.UNKNOWN__ : d0Var;
        }
        d0Var2.getClass();
        return new l2(d0Var2);
    }
}
