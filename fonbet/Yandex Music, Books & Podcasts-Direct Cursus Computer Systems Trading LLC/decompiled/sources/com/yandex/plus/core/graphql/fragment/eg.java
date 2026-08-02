package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import defpackage.vgj;
import java.util.List;

/* loaded from: classes4.dex */
public final class eg implements defpackage.pj {
    public static final eg a = new eg();
    public static final List b = u75.h("showAfter", "closeAfter");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        xc xcVar = (xc) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        xcVar.getClass();
        r7fVar.Z("showAfter");
        vgj vgjVar = defpackage.uj.k;
        vgjVar.a(r7fVar, fx6Var, xcVar.a);
        r7fVar.Z("closeAfter");
        vgjVar.a(r7fVar, fx6Var, xcVar.b);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        Integer num = null;
        Integer num2 = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                num = (Integer) defpackage.uj.k.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    return new xc(num, num2);
                }
                num2 = (Integer) defpackage.uj.k.b(a7fVar, fx6Var);
            }
        }
    }
}
