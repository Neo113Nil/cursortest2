package com.yandex.plus.core.graphql.adapter;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.r7f;
import defpackage.u75;
import defpackage.uj;
import java.util.List;

/* loaded from: classes4.dex */
public final class k implements pj {
    public static final k a = new k();
    public static final List b = u75.h("text", "badgeText");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.m mVar = (com.yandex.plus.core.graphql.m) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        mVar.getClass();
        r7fVar.Z("text");
        uj.a.a(r7fVar, fx6Var, mVar.a);
        r7fVar.Z("badgeText");
        uj.i.a(r7fVar, fx6Var, mVar.b);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        String str2 = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                str = (String) uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    str.getClass();
                    return new com.yandex.plus.core.graphql.m(str, str2);
                }
                str2 = (String) uj.i.b(a7fVar, fx6Var);
            }
        }
    }
}
