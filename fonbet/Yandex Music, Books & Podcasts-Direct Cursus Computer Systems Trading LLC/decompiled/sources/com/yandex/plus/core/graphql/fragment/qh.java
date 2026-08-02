package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class qh implements defpackage.pj {
    public static final qh a = new qh();
    public static final List b = t75.c("nodeId");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        ih ihVar = (ih) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        ihVar.getClass();
        r7fVar.Z("nodeId");
        defpackage.uj.b.a(r7fVar, fx6Var, Integer.valueOf(ihVar.a));
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        Integer num = null;
        while (a7fVar.z0(b) == 0) {
            num = (Integer) defpackage.uj.b.b(a7fVar, fx6Var);
        }
        num.getClass();
        return new ih(num.intValue());
    }
}
