package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class ef implements defpackage.pj {
    public static final ef a = new ef();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        ve veVar = (ve) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        veVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, veVar.a);
        List list = jk.a;
        gk gkVar = veVar.b;
        r7fVar.getClass();
        fx6Var.getClass();
        gkVar.getClass();
        r7fVar.Z("widgetGroupId");
        defpackage.tj tjVar = defpackage.uj.a;
        tjVar.a(r7fVar, fx6Var, gkVar.a);
        r7fVar.Z("widgets");
        ArrayList arrayList = gkVar.b;
        r7fVar.m();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            tjVar.a(r7fVar, fx6Var, it.next());
        }
        r7fVar.l();
        r7fVar.Z("groupDisplayRules");
        ik ikVar = ik.a;
        dk dkVar = gkVar.c;
        boolean z = r7fVar instanceof fah;
        if (z) {
            r7fVar.j();
            ikVar.a(r7fVar, fx6Var, dkVar);
            r7fVar.p();
        } else {
            fah fahVar = new fah();
            fahVar.j();
            ikVar.a(fahVar, fx6Var, dkVar);
            fahVar.p();
            Object b2 = fahVar.b();
            b2.getClass();
            irf.V(r7fVar, b2);
        }
        r7fVar.Z("typedProperties");
        lk lkVar = lk.a;
        fk fkVar = gkVar.d;
        if (z) {
            r7fVar.j();
            lkVar.a(r7fVar, fx6Var, fkVar);
            r7fVar.p();
        } else {
            fah fahVar2 = new fah();
            fahVar2.j();
            lkVar.a(fahVar2, fx6Var, fkVar);
            fahVar2.p();
            Object b3 = fahVar2.b();
            b3.getClass();
            irf.V(r7fVar, b3);
        }
        r7fVar.Z("strictAction");
        qhj qhjVar = new qhj(kk.a, true);
        ek ekVar = gkVar.e;
        if (ekVar == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, ekVar);
        }
        r7fVar.Z("contentDescription");
        qhj qhjVar2 = new qhj(hk.a, true);
        ck ckVar = gkVar.f;
        if (ckVar == null) {
            r7fVar.B0();
        } else {
            qhjVar2.a(r7fVar, fx6Var, ckVar);
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
        }
        a7fVar.k();
        gk c = jk.c(a7fVar, fx6Var);
        str.getClass();
        return new ve(str, c);
    }
}
