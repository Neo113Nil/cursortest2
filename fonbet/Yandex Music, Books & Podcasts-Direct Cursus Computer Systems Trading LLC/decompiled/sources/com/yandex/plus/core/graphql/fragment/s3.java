package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class s3 implements defpackage.pj {
    public static final s3 a = new s3();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        o3 o3Var = (o3) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        o3Var.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, o3Var.a);
        List list = j4.a;
        j4.d(r7fVar, fx6Var, o3Var.b);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
        }
        a7fVar.k();
        c4 c = j4.c(a7fVar, fx6Var);
        str.getClass();
        return new o3(c, str);
    }
}
