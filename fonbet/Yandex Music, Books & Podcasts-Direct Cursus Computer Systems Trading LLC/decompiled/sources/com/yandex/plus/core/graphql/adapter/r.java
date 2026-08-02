package com.yandex.plus.core.graphql.adapter;

import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
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
public final class r implements pj {
    public static final r a = new r();
    public static final List b = u75.h("groups", "mainPaymentMethodId", "pos", "trustServiceToken", "paymentButtons", "promoBadges", "promoLegalInfo");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.t tVar = (com.yandex.plus.core.graphql.t) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        tVar.getClass();
        r7fVar.Z("groups");
        h hVar = h.a;
        tj tjVar = uj.a;
        ArrayList arrayList = tVar.a;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            r7fVar.j();
            hVar.a(r7fVar, fx6Var, obj2);
            r7fVar.p();
        }
        r7fVar.l();
        r7fVar.Z("mainPaymentMethodId");
        vgj vgjVar = uj.i;
        vgjVar.a(r7fVar, fx6Var, tVar.b);
        r7fVar.Z("pos");
        vgjVar.a(r7fVar, fx6Var, tVar.c);
        r7fVar.Z("trustServiceToken");
        vgjVar.a(r7fVar, fx6Var, tVar.d);
        r7fVar.Z("paymentButtons");
        q qVar = q.a;
        ArrayList arrayList2 = tVar.e;
        r7fVar.m();
        for (Object obj3 : arrayList2) {
            if (r7fVar instanceof fah) {
                r7fVar.j();
                qVar.a(r7fVar, fx6Var, obj3);
                r7fVar.p();
            } else {
                fah fahVar = new fah();
                fahVar.j();
                qVar.a(fahVar, fx6Var, obj3);
                fahVar.p();
                Object b2 = fahVar.b();
                b2.getClass();
                irf.V(r7fVar, b2);
            }
        }
        r7fVar.l();
        r7fVar.Z("promoBadges");
        j8g j8gVar = new j8g(new vgj(new qhj(s.a, true)), 0);
        List list = tVar.f;
        if (list == null) {
            r7fVar.B0();
        } else {
            j8gVar.e(r7fVar, fx6Var, list);
        }
        r7fVar.Z("promoLegalInfo");
        qhj qhjVar = new qhj(t.a, false);
        com.yandex.plus.core.graphql.v vVar = tVar.g;
        if (vVar == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, vVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        r2.getClass();
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        return new com.yandex.plus.core.graphql.t(r2, r3, r4, r5, r6, r7, r8);
     */
    @Override // defpackage.pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        Object obj;
        a7fVar.getClass();
        fx6Var.getClass();
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        com.yandex.plus.core.graphql.v vVar = null;
        while (true) {
            switch (a7fVar.z0(b)) {
                case 0:
                    h hVar = h.a;
                    tj tjVar = uj.a;
                    qhj qhjVar = new qhj(hVar, false);
                    a7fVar.m();
                    ArrayList arrayList4 = new ArrayList();
                    while (a7fVar.hasNext()) {
                        arrayList4.add(qhjVar.b(a7fVar, fx6Var));
                    }
                    a7fVar.l();
                    arrayList = arrayList4;
                    break;
                case 1:
                    str = (String) uj.i.b(a7fVar, fx6Var);
                    break;
                case 2:
                    str2 = (String) uj.i.b(a7fVar, fx6Var);
                    break;
                case 3:
                    str3 = (String) uj.i.b(a7fVar, fx6Var);
                    break;
                case 4:
                    q qVar = q.a;
                    tj tjVar2 = uj.a;
                    qhj qhjVar2 = new qhj(qVar, true);
                    a7fVar.m();
                    ArrayList arrayList5 = new ArrayList();
                    while (a7fVar.hasNext()) {
                        arrayList5.add(qhjVar2.b(a7fVar, fx6Var));
                    }
                    a7fVar.l();
                    arrayList2 = arrayList5;
                    break;
                case 5:
                    s sVar = s.a;
                    tj tjVar3 = uj.a;
                    j8g j8gVar = new j8g(new vgj(new qhj(sVar, true)), 0);
                    if (a7fVar.peek() != 10) {
                        arrayList3 = j8gVar.c(a7fVar, fx6Var);
                        break;
                    } else {
                        a7fVar.w();
                        arrayList3 = null;
                        break;
                    }
                case 6:
                    t tVar = t.a;
                    tj tjVar4 = uj.a;
                    qhj qhjVar3 = new qhj(tVar, false);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj = null;
                    } else {
                        obj = qhjVar3.b(a7fVar, fx6Var);
                    }
                    vVar = (com.yandex.plus.core.graphql.v) obj;
                    break;
            }
        }
    }
}
