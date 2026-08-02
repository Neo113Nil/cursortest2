package com.yandex.plus.core.graphql.adapter;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.pj;
import defpackage.r7f;
import defpackage.tj;
import defpackage.u75;
import defpackage.uj;
import java.util.List;

/* loaded from: classes4.dex */
public final class t0 implements pj {
    public static final t0 a = new t0();
    public static final List b = u75.h("inviteId", "inviteUrl");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.a1 a1Var = (com.yandex.plus.core.graphql.a1) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        a1Var.getClass();
        r7fVar.Z("inviteId");
        tj tjVar = uj.a;
        tjVar.a(r7fVar, fx6Var, a1Var.a);
        r7fVar.Z("inviteUrl");
        tjVar.a(r7fVar, fx6Var, a1Var.b);
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
                    str2.getClass();
                    return new com.yandex.plus.core.graphql.a1(str, str2);
                }
                str2 = (String) uj.a.b(a7fVar, fx6Var);
            }
        }
    }
}
