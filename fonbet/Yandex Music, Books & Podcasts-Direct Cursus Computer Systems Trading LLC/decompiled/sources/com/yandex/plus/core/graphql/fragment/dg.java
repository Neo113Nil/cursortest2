package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.jc3;
import defpackage.r0o;
import defpackage.r7f;
import defpackage.t75;
import defpackage.xq0;
import defpackage.y2x;
import java.util.List;

/* loaded from: classes4.dex */
public final class dg implements defpackage.pj {
    public static final dg a = new dg();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        wc wcVar = (wc) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        wcVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, wcVar.a);
        rf rfVar = wcVar.b;
        if (rfVar != null) {
            uf.d(r7fVar, fx6Var, rfVar);
        }
        me meVar = wcVar.c;
        if (meVar != null) {
            pe.d(r7fVar, fx6Var, meVar);
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        rf rfVar;
        a7fVar.getClass();
        fx6Var.getClass();
        me meVar = null;
        String str = null;
        while (a7fVar.z0(b) == 0) {
            str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
        }
        if (str == null) {
            xq0.q("__typename was not found");
            return null;
        }
        jc3 E = y2x.E("IconPlaqueNotification");
        r0o r0oVar = fx6Var.a;
        if (y2x.r(E, r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            rfVar = uf.c(a7fVar, fx6Var);
        } else {
            rfVar = null;
        }
        if (y2x.r(y2x.E("CounterPlaqueNotification"), r0oVar.h(), str, r0oVar)) {
            a7fVar.k();
            meVar = pe.c(a7fVar, fx6Var);
        }
        return new wc(str, rfVar, meVar);
    }
}
