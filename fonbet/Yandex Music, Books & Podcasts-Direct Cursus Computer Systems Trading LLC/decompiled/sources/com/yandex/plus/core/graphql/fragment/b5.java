package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.j8g;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class b5 implements defpackage.pj {
    public static final b5 a = new b5();
    public static final List b = t75.c("__typename");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        y4 y4Var = (y4) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        y4Var.getClass();
        r7fVar.Z("__typename");
        defpackage.uj.a.a(r7fVar, fx6Var, y4Var.a);
        List list = p5.a;
        j5 j5Var = y4Var.b;
        r7fVar.getClass();
        fx6Var.getClass();
        j5Var.getClass();
        r7fVar.Z("textStyle");
        r5 r5Var = r5.a;
        defpackage.tj tjVar = defpackage.uj.a;
        qhj qhjVar = new qhj(r5Var, false);
        i5 i5Var = j5Var.a;
        if (i5Var == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, i5Var);
        }
        r7fVar.Z(C0479n3.g);
        qhj qhjVar2 = new qhj(l5.a, false);
        d5 d5Var = j5Var.b;
        if (d5Var == null) {
            r7fVar.B0();
        } else {
            qhjVar2.a(r7fVar, fx6Var, d5Var);
        }
        r7fVar.Z("commonOverlays");
        j8g j8gVar = new j8g(new qhj(o5.a, true), 0);
        List list2 = j5Var.c;
        if (list2 == null) {
            r7fVar.B0();
        } else {
            j8gVar.e(r7fVar, fx6Var, list2);
        }
        r7fVar.Z("actions");
        k5 k5Var = k5.a;
        ArrayList arrayList = j5Var.d;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            if (r7fVar instanceof fah) {
                r7fVar.j();
                k5Var.a(r7fVar, fx6Var, obj2);
                r7fVar.p();
            } else {
                fah fahVar = new fah();
                fahVar.j();
                k5Var.a(fahVar, fx6Var, obj2);
                fahVar.p();
                Object b2 = fahVar.b();
                b2.getClass();
                irf.V(r7fVar, b2);
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
            str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
        }
        a7fVar.k();
        j5 c = p5.c(a7fVar, fx6Var);
        str.getClass();
        return new y4(str, c);
    }
}
