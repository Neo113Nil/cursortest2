package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.r7f;
import defpackage.t75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zd implements defpackage.pj {
    public static final zd a = new zd();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        wd wdVar = (wd) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        wdVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, wdVar.a);
        List list = rg.a;
        og ogVar = wdVar.b;
        r7fVar.getClass();
        fx6Var.getClass();
        ogVar.getClass();
        r7fVar.Z("colors");
        pg pgVar = pg.a;
        defpackage.tj tjVar = defpackage.uj.a;
        ArrayList arrayList = ogVar.a;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            if (r7fVar instanceof fah) {
                r7fVar.j();
                pgVar.a(r7fVar, fx6Var, obj2);
                r7fVar.p();
            } else {
                fah fahVar = new fah();
                fahVar.j();
                pgVar.a(fahVar, fx6Var, obj2);
                fahVar.p();
                Object b2 = fahVar.b();
                b2.getClass();
                irf.V(r7fVar, b2);
            }
        }
        r7fVar.l();
        r7fVar.Z("startPoint");
        sg sgVar = sg.a;
        ng ngVar = ogVar.b;
        boolean z = r7fVar instanceof fah;
        if (z) {
            r7fVar.j();
            sgVar.a(r7fVar, fx6Var, ngVar);
            r7fVar.p();
        } else {
            fah fahVar2 = new fah();
            fahVar2.j();
            sgVar.a(fahVar2, fx6Var, ngVar);
            fahVar2.p();
            Object b3 = fahVar2.b();
            b3.getClass();
            irf.V(r7fVar, b3);
        }
        r7fVar.Z("endPoint");
        qg qgVar = qg.a;
        mg mgVar = ogVar.c;
        if (z) {
            r7fVar.j();
            qgVar.a(r7fVar, fx6Var, mgVar);
            r7fVar.p();
            return;
        }
        fah fahVar3 = new fah();
        fahVar3.j();
        qgVar.a(fahVar3, fx6Var, mgVar);
        fahVar3.p();
        Object b4 = fahVar3.b();
        b4.getClass();
        irf.V(r7fVar, b4);
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
        og c = rg.c(a7fVar, fx6Var);
        str.getClass();
        return new wd(str, c);
    }
}
