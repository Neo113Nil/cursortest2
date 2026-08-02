package com.yandex.plus.core.graphql.adapter;

import com.yandex.plus.core.graphql.j2;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.r7f;
import defpackage.t75;
import defpackage.tj;
import defpackage.uj;
import java.util.List;

/* loaded from: classes4.dex */
public final class t1 implements pj {
    public static final t1 a = new t1();
    public static final List b = t75.c("plaqueClicked");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        j2 j2Var = (j2) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        j2Var.getClass();
        r7fVar.Z("plaqueClicked");
        com.yandex.plus.core.graphql.type.adapter.a aVar = com.yandex.plus.core.graphql.type.adapter.a.n;
        tj tjVar = uj.a;
        com.yandex.plus.core.graphql.type.b0 b0Var = j2Var.a;
        if (b0Var == null) {
            r7fVar.B0();
        } else {
            aVar.a(r7fVar, fx6Var, b0Var);
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        Object b2;
        a7fVar.getClass();
        fx6Var.getClass();
        com.yandex.plus.core.graphql.type.b0 b0Var = null;
        while (a7fVar.z0(b) == 0) {
            com.yandex.plus.core.graphql.type.adapter.a aVar = com.yandex.plus.core.graphql.type.adapter.a.n;
            tj tjVar = uj.a;
            if (a7fVar.peek() == 10) {
                a7fVar.w();
                b2 = null;
            } else {
                b2 = aVar.b(a7fVar, fx6Var);
            }
            b0Var = (com.yandex.plus.core.graphql.type.b0) b2;
        }
        return new j2(b0Var);
    }
}
