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
public final class f4 implements defpackage.pj {
    public static final f4 a = new f4();
    public static final List b = u75.h("color", "colors");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        w3 w3Var = (w3) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        w3Var.getClass();
        r7fVar.Z("color");
        defpackage.uj.a.a(r7fVar, fx6Var, w3Var.a);
        r7fVar.Z("colors");
        h4 h4Var = h4.a;
        y3 y3Var = w3Var.b;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            h4Var.a(r7fVar, fx6Var, y3Var);
            r7fVar.p();
            return;
        }
        fah fahVar = new fah();
        fahVar.j();
        h4Var.a(fahVar, fx6Var, y3Var);
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
        y3 y3Var = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    str.getClass();
                    y3Var.getClass();
                    return new w3(str, y3Var);
                }
                h4 h4Var = h4.a;
                defpackage.tj tjVar = defpackage.uj.a;
                y3Var = (y3) new qhj(h4Var, true).b(a7fVar, fx6Var);
            }
        }
    }
}
