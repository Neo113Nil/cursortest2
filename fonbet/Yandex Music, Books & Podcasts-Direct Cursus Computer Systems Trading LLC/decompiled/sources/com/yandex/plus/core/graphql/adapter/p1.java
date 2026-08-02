package com.yandex.plus.core.graphql.adapter;

import com.yandex.plus.core.graphql.fragment.af;
import com.yandex.plus.core.graphql.fragment.bf;
import com.yandex.plus.core.graphql.fragment.cf;
import com.yandex.plus.core.graphql.fragment.df;
import com.yandex.plus.core.graphql.fragment.ef;
import com.yandex.plus.core.graphql.fragment.ff;
import com.yandex.plus.core.graphql.fragment.xe;
import com.yandex.plus.core.graphql.fragment.ye;
import com.yandex.plus.core.graphql.fragment.ze;
import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.j8g;
import defpackage.pj;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import defpackage.tj;
import defpackage.uj;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class p1 implements pj {
    public static final p1 a = new p1();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        com.yandex.plus.core.graphql.d2 d2Var = (com.yandex.plus.core.graphql.d2) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        d2Var.getClass();
        r7fVar.Z("__typename");
        uj.a.a(r7fVar, fx6Var, d2Var.a);
        List list = bf.a;
        xe xeVar = d2Var.b;
        r7fVar.getClass();
        fx6Var.getClass();
        xeVar.getClass();
        r7fVar.Z("widgets");
        df dfVar = df.a;
        tj tjVar = uj.a;
        ArrayList arrayList = xeVar.a;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            if (r7fVar instanceof fah) {
                r7fVar.j();
                dfVar.a(r7fVar, fx6Var, obj2);
                r7fVar.p();
            } else {
                fah fahVar = new fah();
                fahVar.j();
                dfVar.a(fahVar, fx6Var, obj2);
                fahVar.p();
                Object b2 = fahVar.b();
                b2.getClass();
                irf.V(r7fVar, b2);
            }
        }
        r7fVar.l();
        r7fVar.Z("widgetGroups");
        j8g j8gVar = new j8g(new qhj(ef.a, true), 0);
        List list2 = xeVar.b;
        if (list2 == null) {
            r7fVar.B0();
        } else {
            j8gVar.e(r7fVar, fx6Var, list2);
        }
        r7fVar.Z("widgetsLevels");
        ff ffVar = ff.a;
        ArrayList arrayList2 = xeVar.c;
        r7fVar.m();
        for (Object obj3 : arrayList2) {
            if (r7fVar instanceof fah) {
                r7fVar.j();
                ffVar.a(r7fVar, fx6Var, obj3);
                r7fVar.p();
            } else {
                fah fahVar2 = new fah();
                fahVar2.j();
                ffVar.a(fahVar2, fx6Var, obj3);
                fahVar2.p();
                Object b3 = fahVar2.b();
                b3.getClass();
                irf.V(r7fVar, b3);
            }
        }
        r7fVar.l();
        r7fVar.Z("plaques");
        af afVar = af.a;
        ArrayList arrayList3 = xeVar.d;
        r7fVar.m();
        for (Object obj4 : arrayList3) {
            if (r7fVar instanceof fah) {
                r7fVar.j();
                afVar.a(r7fVar, fx6Var, obj4);
                r7fVar.p();
            } else {
                fah fahVar3 = new fah();
                fahVar3.j();
                afVar.a(fahVar3, fx6Var, obj4);
                fahVar3.p();
                Object b4 = fahVar3.b();
                b4.getClass();
                irf.V(r7fVar, b4);
            }
        }
        r7fVar.l();
        r7fVar.Z("prefetchPlaqueList");
        cf cfVar = cf.a;
        ArrayList arrayList4 = xeVar.e;
        r7fVar.m();
        for (Object obj5 : arrayList4) {
            if (r7fVar instanceof fah) {
                r7fVar.j();
                cfVar.a(r7fVar, fx6Var, obj5);
                r7fVar.p();
            } else {
                fah fahVar4 = new fah();
                fahVar4.j();
                cfVar.a(fahVar4, fx6Var, obj5);
                fahVar4.p();
                Object b5 = fahVar4.b();
                b5.getClass();
                irf.V(r7fVar, b5);
            }
        }
        r7fVar.l();
        r7fVar.Z("defaultPlaqueList");
        ye yeVar = ye.a;
        ArrayList arrayList5 = xeVar.f;
        r7fVar.m();
        for (Object obj6 : arrayList5) {
            if (r7fVar instanceof fah) {
                r7fVar.j();
                yeVar.a(r7fVar, fx6Var, obj6);
                r7fVar.p();
            } else {
                fah fahVar5 = new fah();
                fahVar5.j();
                yeVar.a(fahVar5, fx6Var, obj6);
                fahVar5.p();
                Object b6 = fahVar5.b();
                b6.getClass();
                irf.V(r7fVar, b6);
            }
        }
        r7fVar.l();
        r7fVar.Z("fallbackPlaqueList");
        ze zeVar = ze.a;
        ArrayList arrayList6 = xeVar.g;
        r7fVar.m();
        for (Object obj7 : arrayList6) {
            if (r7fVar instanceof fah) {
                r7fVar.j();
                zeVar.a(r7fVar, fx6Var, obj7);
                r7fVar.p();
            } else {
                fah fahVar6 = new fah();
                fahVar6.j();
                zeVar.a(fahVar6, fx6Var, obj7);
                fahVar6.p();
                Object b7 = fahVar6.b();
                b7.getClass();
                irf.V(r7fVar, b7);
            }
        }
        r7fVar.l();
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
        xe c = bf.c(a7fVar, fx6Var);
        str.getClass();
        return new com.yandex.plus.core.graphql.d2(str, c);
    }
}
