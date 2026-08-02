package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class qk implements defpackage.pj {
    public static final qk a = new qk();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        xj xjVar = (xj) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        xjVar.getClass();
        r7fVar.Z("__typename");
        defpackage.tj tjVar = defpackage.uj.a;
        tjVar.a(r7fVar, fx6Var, xjVar.a);
        List list = wf.a;
        vf vfVar = xjVar.b;
        r7fVar.Z("image");
        tjVar.a(r7fVar, fx6Var, vfVar.a);
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
        vf c = wf.c(a7fVar, fx6Var);
        str.getClass();
        return new xj(str, c);
    }
}
