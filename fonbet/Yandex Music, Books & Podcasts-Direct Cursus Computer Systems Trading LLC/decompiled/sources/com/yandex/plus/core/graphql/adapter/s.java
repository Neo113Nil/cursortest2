package com.yandex.plus.core.graphql.adapter;

import com.yandex.plus.core.graphql.fragment.ac;
import com.yandex.plus.core.graphql.fragment.bc;
import com.yandex.plus.core.graphql.fragment.cc;
import com.yandex.plus.core.graphql.fragment.fc;
import com.yandex.plus.core.graphql.fragment.ic;
import com.yandex.plus.core.graphql.fragment.jc;
import com.yandex.plus.core.graphql.fragment.kc;
import com.yandex.plus.core.graphql.fragment.lc;
import com.yandex.plus.core.graphql.fragment.oc;
import com.yandex.plus.core.graphql.fragment.rc;
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
public final class s implements pj {
    public static final s a = new s();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.u uVar = (com.yandex.plus.core.graphql.u) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        uVar.getClass();
        r7fVar.Z("__typename");
        uj.a.a(r7fVar, fx6Var, uVar.a);
        List list = rc.a;
        ic icVar = uVar.b;
        r7fVar.getClass();
        fx6Var.getClass();
        icVar.getClass();
        r7fVar.Z("benefitTitle");
        lc lcVar = lc.a;
        tj tjVar = uj.a;
        cc ccVar = icVar.a;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            lcVar.a(r7fVar, fx6Var, ccVar);
            r7fVar.p();
        } else {
            fah fahVar = new fah();
            fahVar.j();
            lcVar.a(fahVar, fx6Var, ccVar);
            fahVar.p();
            Object b2 = fahVar.b();
            b2.getClass();
            irf.V(r7fVar, b2);
        }
        r7fVar.Z("additionalTitle");
        qhj qhjVar = new qhj(jc.a, true);
        ac acVar = icVar.b;
        if (acVar == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, acVar);
        }
        r7fVar.Z("iconImage");
        qhj qhjVar2 = new qhj(oc.a, false);
        fc fcVar = icVar.c;
        if (fcVar == null) {
            r7fVar.B0();
        } else {
            qhjVar2.a(r7fVar, fx6Var, fcVar);
        }
        r7fVar.Z("backgroundColor");
        kc kcVar = kc.a;
        bc bcVar = icVar.d;
        r7fVar.j();
        kcVar.a(r7fVar, fx6Var, bcVar);
        r7fVar.p();
        r7fVar.Z("paymentMethodId");
        uj.i.a(r7fVar, fx6Var, icVar.e);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) uj.a.b(a7fVar, fx6Var);
        }
        a7fVar.k();
        ic c = rc.c(a7fVar, fx6Var);
        str.getClass();
        return new com.yandex.plus.core.graphql.u(str, c);
    }
}
