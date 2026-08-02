package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class l5 implements defpackage.pj {
    public static final l5 a = new l5();
    public static final List b = u75.h("color", "colors");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        d5 d5Var = (d5) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        d5Var.getClass();
        r7fVar.Z("color");
        defpackage.uj.a.a(r7fVar, fx6Var, d5Var.a);
        r7fVar.Z("colors");
        n5 n5Var = n5.a;
        f5 f5Var = d5Var.b;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            n5Var.a(r7fVar, fx6Var, f5Var);
            r7fVar.p();
            return;
        }
        fah fahVar = new fah();
        fahVar.j();
        n5Var.a(fahVar, fx6Var, f5Var);
        fahVar.p();
        Object b2 = fahVar.b();
        b2.getClass();
        irf.V(r7fVar, b2);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        f5 f5Var = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    str.getClass();
                    f5Var.getClass();
                    return new d5(str, f5Var);
                }
                n5 n5Var = n5.a;
                defpackage.tj tjVar = defpackage.uj.a;
                f5Var = (f5) new qhj(n5Var, true).b(a7fVar, fx6Var);
            }
        }
    }
}
