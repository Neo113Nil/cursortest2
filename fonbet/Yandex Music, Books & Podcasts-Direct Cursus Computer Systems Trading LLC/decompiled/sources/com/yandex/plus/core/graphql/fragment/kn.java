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
public final class kn implements defpackage.pj {
    public static final kn a = new kn();
    public static final List b = u75.h("color", "colors", "imageUrl");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        en enVar = (en) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        enVar.getClass();
        r7fVar.Z("color");
        defpackage.uj.a.a(r7fVar, fx6Var, enVar.a);
        r7fVar.Z("colors");
        ln lnVar = ln.a;
        fn fnVar = enVar.b;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            lnVar.a(r7fVar, fx6Var, fnVar);
            r7fVar.p();
        } else {
            fah fahVar = new fah();
            fahVar.j();
            lnVar.a(fahVar, fx6Var, fnVar);
            fahVar.p();
            Object b2 = fahVar.b();
            b2.getClass();
            irf.V(r7fVar, b2);
        }
        r7fVar.Z("imageUrl");
        defpackage.uj.i.a(r7fVar, fx6Var, enVar.c);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        fn fnVar = null;
        String str2 = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                ln lnVar = ln.a;
                defpackage.tj tjVar = defpackage.uj.a;
                fnVar = (fn) new qhj(lnVar, true).b(a7fVar, fx6Var);
            } else {
                if (z0 != 2) {
                    str.getClass();
                    fnVar.getClass();
                    return new en(str, fnVar, str2);
                }
                str2 = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            }
        }
    }
}
