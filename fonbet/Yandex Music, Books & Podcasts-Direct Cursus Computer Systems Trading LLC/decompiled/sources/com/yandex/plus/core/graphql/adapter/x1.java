package com.yandex.plus.core.graphql.adapter;

import com.yandex.plus.core.graphql.o2;
import com.yandex.plus.core.graphql.p2;
import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.pj;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import defpackage.tj;
import defpackage.uj;
import java.util.List;

/* loaded from: classes4.dex */
public final class x1 implements pj {
    public static final x1 a = new x1();
    public static final List b = t75.c("externalStart");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        p2 p2Var = (p2) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        p2Var.getClass();
        r7fVar.Z("externalStart");
        w1 w1Var = w1.a;
        tj tjVar = uj.a;
        o2 o2Var = p2Var.a;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            w1Var.a(r7fVar, fx6Var, o2Var);
            r7fVar.p();
            return;
        }
        fah fahVar = new fah();
        fahVar.j();
        w1Var.a(fahVar, fx6Var, o2Var);
        fahVar.p();
        Object b2 = fahVar.b();
        b2.getClass();
        irf.V(r7fVar, b2);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        o2 o2Var = null;
        while (a7fVar.z0(b) == 0) {
            w1 w1Var = w1.a;
            tj tjVar = uj.a;
            o2Var = (o2) new qhj(w1Var, true).b(a7fVar, fx6Var);
        }
        o2Var.getClass();
        return new p2(o2Var);
    }
}
