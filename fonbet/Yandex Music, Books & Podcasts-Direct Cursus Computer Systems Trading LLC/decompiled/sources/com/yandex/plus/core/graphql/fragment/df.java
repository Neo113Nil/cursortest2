package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.j8g;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class df implements defpackage.pj {
    public static final df a = new df();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        ue ueVar = (ue) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        ueVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, ueVar.a);
        List list = rk.a;
        bk bkVar = ueVar.b;
        r7fVar.getClass();
        fx6Var.getClass();
        bkVar.getClass();
        r7fVar.Z("widgetId");
        defpackage.tj tjVar = defpackage.uj.a;
        tjVar.a(r7fVar, fx6Var, bkVar.a);
        r7fVar.Z("contentDescription");
        qhj qhjVar = new qhj(ok.a, true);
        vj vjVar = bkVar.b;
        if (vjVar == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, vjVar);
        }
        r7fVar.Z("templates");
        j8g j8gVar = new j8g(tjVar, 0);
        List list2 = bkVar.c;
        if (list2 == null) {
            r7fVar.B0();
        } else {
            j8gVar.e(r7fVar, fx6Var, list2);
        }
        r7fVar.Z("strictAction");
        qhj qhjVar2 = new qhj(sk.a, true);
        yj yjVar = bkVar.d;
        if (yjVar == null) {
            r7fVar.B0();
        } else {
            qhjVar2.a(r7fVar, fx6Var, yjVar);
        }
        r7fVar.Z("displayWidgetRules");
        pk pkVar = pk.a;
        wj wjVar = bkVar.e;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            pkVar.a(r7fVar, fx6Var, wjVar);
            r7fVar.p();
        } else {
            fah fahVar = new fah();
            fahVar.j();
            pkVar.a(fahVar, fx6Var, wjVar);
            fahVar.p();
            Object b2 = fahVar.b();
            b2.getClass();
            irf.V(r7fVar, b2);
        }
        r7fVar.Z("type");
        r7fVar.m0(bkVar.f.a);
        r7fVar.Z("textWidget");
        qhj qhjVar3 = new qhj(uk.a, true);
        ak akVar = bkVar.g;
        if (akVar == null) {
            r7fVar.B0();
        } else {
            qhjVar3.a(r7fVar, fx6Var, akVar);
        }
        r7fVar.Z("balanceWidget");
        qhj qhjVar4 = new qhj(mk.a, true);
        tj tjVar2 = bkVar.h;
        if (tjVar2 == null) {
            r7fVar.B0();
        } else {
            qhjVar4.a(r7fVar, fx6Var, tjVar2);
        }
        r7fVar.Z("buttonWidget");
        qhj qhjVar5 = new qhj(nk.a, true);
        uj ujVar = bkVar.i;
        if (ujVar == null) {
            r7fVar.B0();
        } else {
            qhjVar5.a(r7fVar, fx6Var, ujVar);
        }
        r7fVar.Z("switchWidget");
        qhj qhjVar6 = new qhj(tk.a, true);
        zj zjVar = bkVar.j;
        if (zjVar == null) {
            r7fVar.B0();
        } else {
            qhjVar6.a(r7fVar, fx6Var, zjVar);
        }
        r7fVar.Z("iconWidget");
        qhj qhjVar7 = new qhj(qk.a, true);
        xj xjVar = bkVar.k;
        if (xjVar == null) {
            r7fVar.B0();
        } else {
            qhjVar7.a(r7fVar, fx6Var, xjVar);
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
        bk c = rk.c(a7fVar, fx6Var);
        str.getClass();
        return new ue(str, c);
    }
}
