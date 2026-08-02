package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class ff implements defpackage.pj {
    public static final ff a = new ff();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        we weVar = (we) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        weVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, weVar.a);
        List list = hl.a;
        dl dlVar = weVar.b;
        r7fVar.getClass();
        fx6Var.getClass();
        dlVar.getClass();
        r7fVar.Z("widgetsLevelId");
        defpackage.uj.a.a(r7fVar, fx6Var, dlVar.a);
        r7fVar.Z("contentDescription");
        qhj qhjVar = new qhj(el.a, true);
        zk zkVar = dlVar.b;
        if (zkVar == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, zkVar);
        }
        r7fVar.Z("elements");
        gl glVar = gl.a;
        ArrayList arrayList = dlVar.c;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            if (r7fVar instanceof fah) {
                r7fVar.j();
                glVar.a(r7fVar, fx6Var, obj2);
                r7fVar.p();
            } else {
                fah fahVar = new fah();
                fahVar.j();
                glVar.a(fahVar, fx6Var, obj2);
                fahVar.p();
                Object b2 = fahVar.b();
                b2.getClass();
                irf.V(r7fVar, b2);
            }
        }
        r7fVar.l();
        r7fVar.Z("displayRules");
        fl flVar = fl.a;
        al alVar = dlVar.d;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            flVar.a(r7fVar, fx6Var, alVar);
            r7fVar.p();
        } else {
            fah fahVar2 = new fah();
            fahVar2.j();
            flVar.a(fahVar2, fx6Var, alVar);
            fahVar2.p();
            Object b3 = fahVar2.b();
            b3.getClass();
            irf.V(r7fVar, b3);
        }
        r7fVar.Z("strictAction");
        qhj qhjVar2 = new qhj(il.a, true);
        cl clVar = dlVar.e;
        if (clVar == null) {
            r7fVar.B0();
        } else {
            qhjVar2.a(r7fVar, fx6Var, clVar);
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
        dl c = hl.c(a7fVar, fx6Var);
        str.getClass();
        return new we(str, c);
    }
}
