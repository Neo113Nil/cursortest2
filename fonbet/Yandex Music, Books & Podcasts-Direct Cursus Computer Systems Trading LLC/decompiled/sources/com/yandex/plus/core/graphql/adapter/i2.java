package com.yandex.plus.core.graphql.adapter;

import com.yandex.plus.core.graphql.d3;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class i2 implements pj {
    public static final i2 a = new i2();
    public static final List b = t75.c("status");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        d3 d3Var = (d3) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        d3Var.getClass();
        r7fVar.Z("status");
        r7fVar.m0(d3Var.a.a);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        com.yandex.plus.core.graphql.type.y0 y0Var;
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.type.y0 y0Var2 = null;
        while (a7fVar.z0(b) == 0) {
            String f0 = a7fVar.f0();
            f0.getClass();
            com.yandex.plus.core.graphql.type.y0.b.getClass();
            com.yandex.plus.core.graphql.type.y0[] values = com.yandex.plus.core.graphql.type.y0.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    y0Var = null;
                    break;
                }
                y0Var = values[i];
                if (y0Var.a.equals(f0)) {
                    break;
                }
                i++;
            }
            y0Var2 = y0Var == null ? com.yandex.plus.core.graphql.type.y0.UNKNOWN__ : y0Var;
        }
        y0Var2.getClass();
        return new d3(y0Var2);
    }
}
