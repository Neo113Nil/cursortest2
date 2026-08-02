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
public final class be implements defpackage.pj {
    public static final be a = new be();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        xd xdVar = (xd) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        xdVar.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, xdVar.a);
        List list = ki.a;
        hi hiVar = xdVar.b;
        r7fVar.getClass();
        fx6Var.getClass();
        hiVar.getClass();
        r7fVar.Z("colors");
        ji jiVar = ji.a;
        defpackage.tj tjVar = defpackage.uj.a;
        ArrayList arrayList = hiVar.a;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            if (r7fVar instanceof fah) {
                r7fVar.j();
                jiVar.a(r7fVar, fx6Var, obj2);
                r7fVar.p();
            } else {
                fah fahVar = new fah();
                fahVar.j();
                jiVar.a(fahVar, fx6Var, obj2);
                fahVar.p();
                Object b2 = fahVar.b();
                b2.getClass();
                irf.V(r7fVar, b2);
            }
        }
        r7fVar.l();
        r7fVar.Z("centralPoint");
        ii iiVar = ii.a;
        fi fiVar = hiVar.b;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            iiVar.a(r7fVar, fx6Var, fiVar);
            r7fVar.p();
            return;
        }
        fah fahVar2 = new fah();
        fahVar2.j();
        iiVar.a(fahVar2, fx6Var, fiVar);
        fahVar2.p();
        Object b3 = fahVar2.b();
        b3.getClass();
        irf.V(r7fVar, b3);
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
        hi c = ki.c(a7fVar, fx6Var);
        str.getClass();
        return new xd(str, c);
    }
}
