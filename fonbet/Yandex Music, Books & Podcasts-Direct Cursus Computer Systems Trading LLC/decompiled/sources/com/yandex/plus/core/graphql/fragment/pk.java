package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.r7f;
import defpackage.t75;
import defpackage.vgj;
import java.util.List;

/* loaded from: classes4.dex */
public final class pk implements defpackage.pj {
    public static final pk a = new pk();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        wj wjVar = (wj) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        wjVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, wjVar.a);
        List list = yk.a;
        wk wkVar = wjVar.b;
        r7fVar.getClass();
        fx6Var.getClass();
        wkVar.getClass();
        r7fVar.Z("displayRules");
        xk xkVar = xk.a;
        defpackage.tj tjVar = defpackage.uj.a;
        vk vkVar = wkVar.a;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            xkVar.a(r7fVar, fx6Var, vkVar);
            r7fVar.p();
        } else {
            fah fahVar = new fah();
            fahVar.j();
            xkVar.a(fahVar, fx6Var, vkVar);
            fahVar.p();
            Object b2 = fahVar.b();
            b2.getClass();
            irf.V(r7fVar, b2);
        }
        r7fVar.Z("opacity");
        vgj vgjVar = defpackage.uj.k;
        vgjVar.a(r7fVar, fx6Var, wkVar.b);
        r7fVar.Z("horizontalRule");
        com.yandex.plus.core.graphql.type.adapter.a aVar = com.yandex.plus.core.graphql.type.adapter.a.i;
        com.yandex.plus.core.graphql.type.t tVar = wkVar.c;
        if (tVar == null) {
            r7fVar.B0();
        } else {
            aVar.a(r7fVar, fx6Var, tVar);
        }
        r7fVar.Z("verticalRule");
        com.yandex.plus.core.graphql.type.adapter.a aVar2 = com.yandex.plus.core.graphql.type.adapter.a.D;
        com.yandex.plus.core.graphql.type.z0 z0Var = wkVar.d;
        if (z0Var == null) {
            r7fVar.B0();
        } else {
            aVar2.a(r7fVar, fx6Var, z0Var);
        }
        r7fVar.Z("widthFix");
        vgjVar.a(r7fVar, fx6Var, wkVar.e);
        r7fVar.Z("widthType");
        r7fVar.m0(wkVar.f.a);
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
        wk c = yk.c(a7fVar, fx6Var);
        str.getClass();
        return new wj(str, c);
    }
}
