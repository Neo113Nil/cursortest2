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
public final class g2 implements defpackage.pj {
    public static final g2 a = new g2();
    public static final List b = u75.h("totalPrice", "timestamp", "maxPoints");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        w1 w1Var = (w1) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        w1Var.getClass();
        r7fVar.Z("totalPrice");
        n2 n2Var = n2.a;
        defpackage.tj tjVar = defpackage.uj.a;
        d2 d2Var = w1Var.a;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            n2Var.a(r7fVar, fx6Var, d2Var);
            r7fVar.p();
        } else {
            fah fahVar = new fah();
            fahVar.j();
            n2Var.a(fahVar, fx6Var, d2Var);
            fahVar.p();
            Object b2 = fahVar.b();
            b2.getClass();
            irf.V(r7fVar, b2);
        }
        r7fVar.Z("timestamp");
        fx6Var.e(com.yandex.plus.core.graphql.type.z.a).a(r7fVar, fx6Var, Long.valueOf(w1Var.b));
        r7fVar.Z("maxPoints");
        qhj qhjVar = new qhj(i2.a, true);
        y1 y1Var = w1Var.c;
        if (y1Var == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, y1Var);
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        Object b2;
        a7fVar.getClass();
        fx6Var.getClass();
        d2 d2Var = null;
        Long l = null;
        y1 y1Var = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                n2 n2Var = n2.a;
                defpackage.tj tjVar = defpackage.uj.a;
                d2Var = (d2) new qhj(n2Var, true).b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                l = (Long) fx6Var.e(com.yandex.plus.core.graphql.type.z.a).b(a7fVar, fx6Var);
            } else {
                if (z0 != 2) {
                    d2Var.getClass();
                    l.getClass();
                    return new w1(d2Var, l.longValue(), y1Var);
                }
                i2 i2Var = i2.a;
                defpackage.tj tjVar2 = defpackage.uj.a;
                qhj qhjVar = new qhj(i2Var, true);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    b2 = null;
                } else {
                    b2 = qhjVar.b(a7fVar, fx6Var);
                }
                y1Var = (y1) b2;
            }
        }
    }
}
