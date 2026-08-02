package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class yo implements defpackage.pj {
    public static final yo a = new yo();
    public static final List b = t75.c("name");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        mo moVar = (mo) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        moVar.getClass();
        r7fVar.Z("name");
        fx6Var.e(com.yandex.plus.core.graphql.type.z.f).a(r7fVar, fx6Var, moVar.a);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) fx6Var.e(com.yandex.plus.core.graphql.type.z.f).b(a7fVar, fx6Var);
        }
        str.getClass();
        return new mo(str);
    }
}
