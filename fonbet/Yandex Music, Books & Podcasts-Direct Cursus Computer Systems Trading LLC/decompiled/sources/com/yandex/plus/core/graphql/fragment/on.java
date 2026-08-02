package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class on implements defpackage.pj {
    public static final on a = new on();
    public static final List b = t75.c("color");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        hn hnVar = (hn) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        hnVar.getClass();
        r7fVar.Z("color");
        defpackage.uj.a.a(r7fVar, fx6Var, hnVar.a);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
        }
        str.getClass();
        return new hn(str);
    }
}
