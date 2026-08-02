package com.yandex.plus.core.graphql.adapter;

import com.yandex.plus.core.graphql.fragment.j2;
import com.yandex.plus.core.graphql.fragment.k2;
import com.yandex.plus.core.graphql.fragment.l2;
import com.yandex.plus.core.graphql.fragment.m2;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.j8g;
import defpackage.pj;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.tj;
import defpackage.u75;
import defpackage.uj;
import defpackage.vgj;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class f implements pj {
    public static final f a = new f();
    public static final List b = u75.h("__typename", "checkoutAdditionalOffers", "paymentMethods");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.h hVar = (com.yandex.plus.core.graphql.h) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        hVar.getClass();
        r7fVar.Z("__typename");
        uj.a.a(r7fVar, fx6Var, hVar.a);
        r7fVar.Z("checkoutAdditionalOffers");
        e eVar = e.a;
        com.yandex.plus.core.graphql.g gVar = hVar.b;
        r7fVar.j();
        eVar.a(r7fVar, fx6Var, gVar);
        r7fVar.p();
        r7fVar.Z("paymentMethods");
        qhj qhjVar = new qhj(r.a, false);
        com.yandex.plus.core.graphql.t tVar = hVar.c;
        if (tVar == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, tVar);
        }
        List list = com.yandex.plus.core.graphql.fragment.f2.a;
        com.yandex.plus.core.graphql.fragment.e2 e2Var = hVar.d;
        r7fVar.getClass();
        fx6Var.getClass();
        e2Var.getClass();
        r7fVar.Z("tariffOffer");
        m2 m2Var = m2.a;
        tj tjVar = uj.a;
        qhj qhjVar2 = new qhj(m2Var, true);
        com.yandex.plus.core.graphql.fragment.c2 c2Var = e2Var.a;
        if (c2Var == null) {
            r7fVar.B0();
        } else {
            qhjVar2.a(r7fVar, fx6Var, c2Var);
        }
        r7fVar.Z("optionOffers");
        j8g j8gVar = new j8g(new vgj(new qhj(j2.a, true)), 0);
        List list2 = e2Var.b;
        if (list2 == null) {
            r7fVar.B0();
        } else {
            j8gVar.e(r7fVar, fx6Var, list2);
        }
        r7fVar.Z("legalInfo");
        qhj qhjVar3 = new qhj(com.yandex.plus.core.graphql.fragment.h2.a, true);
        com.yandex.plus.core.graphql.fragment.x1 x1Var = e2Var.c;
        if (x1Var == null) {
            r7fVar.B0();
        } else {
            qhjVar3.a(r7fVar, fx6Var, x1Var);
        }
        r7fVar.Z("paymentText");
        k2 k2Var = k2.a;
        com.yandex.plus.core.graphql.fragment.a2 a2Var = e2Var.d;
        r7fVar.j();
        k2Var.a(r7fVar, fx6Var, a2Var);
        r7fVar.p();
        r7fVar.Z("successScreen");
        l2 l2Var = l2.a;
        com.yandex.plus.core.graphql.fragment.b2 b2Var = e2Var.e;
        r7fVar.j();
        l2Var.a(r7fVar, fx6Var, b2Var);
        r7fVar.p();
        r7fVar.Z("invoices");
        qhj qhjVar4 = new qhj(com.yandex.plus.core.graphql.fragment.g2.a, false);
        ArrayList arrayList = e2Var.f;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            if (obj2 == null) {
                r7fVar.B0();
            } else {
                qhjVar4.a(r7fVar, fx6Var, obj2);
            }
        }
        r7fVar.l();
        r7fVar.Z("silentInvoiceAvailable");
        uj.l.a(r7fVar, fx6Var, e2Var.g);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        Object b2;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        com.yandex.plus.core.graphql.g gVar = null;
        com.yandex.plus.core.graphql.t tVar = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                str = (String) uj.a.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                e eVar = e.a;
                tj tjVar = uj.a;
                gVar = (com.yandex.plus.core.graphql.g) new qhj(eVar, false).b(a7fVar, fx6Var);
            } else {
                if (z0 != 2) {
                    a7fVar.k();
                    com.yandex.plus.core.graphql.fragment.e2 c = com.yandex.plus.core.graphql.fragment.f2.c(a7fVar, fx6Var);
                    str.getClass();
                    gVar.getClass();
                    return new com.yandex.plus.core.graphql.h(str, gVar, tVar, c);
                }
                r rVar = r.a;
                tj tjVar2 = uj.a;
                qhj qhjVar = new qhj(rVar, false);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    b2 = null;
                } else {
                    b2 = qhjVar.b(a7fVar, fx6Var);
                }
                tVar = (com.yandex.plus.core.graphql.t) b2;
            }
        }
    }
}
