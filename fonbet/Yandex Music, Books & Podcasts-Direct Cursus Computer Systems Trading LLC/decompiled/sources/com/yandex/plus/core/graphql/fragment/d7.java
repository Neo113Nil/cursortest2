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
public final class d7 implements defpackage.pj {
    public static final d7 a = new d7();
    public static final List b = u75.h("color", "colors", "imageUrl");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        x6 x6Var = (x6) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        x6Var.getClass();
        r7fVar.Z("color");
        defpackage.uj.a.a(r7fVar, fx6Var, x6Var.a);
        r7fVar.Z("colors");
        e7 e7Var = e7.a;
        y6 y6Var = x6Var.b;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            e7Var.a(r7fVar, fx6Var, y6Var);
            r7fVar.p();
        } else {
            fah fahVar = new fah();
            fahVar.j();
            e7Var.a(fahVar, fx6Var, y6Var);
            fahVar.p();
            Object b2 = fahVar.b();
            b2.getClass();
            irf.V(r7fVar, b2);
        }
        r7fVar.Z("imageUrl");
        defpackage.uj.i.a(r7fVar, fx6Var, x6Var.c);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        y6 y6Var = null;
        String str2 = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                e7 e7Var = e7.a;
                defpackage.tj tjVar = defpackage.uj.a;
                y6Var = (y6) new qhj(e7Var, true).b(a7fVar, fx6Var);
            } else {
                if (z0 != 2) {
                    str.getClass();
                    y6Var.getClass();
                    return new x6(str, y6Var, str2);
                }
                str2 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            }
        }
    }
}
