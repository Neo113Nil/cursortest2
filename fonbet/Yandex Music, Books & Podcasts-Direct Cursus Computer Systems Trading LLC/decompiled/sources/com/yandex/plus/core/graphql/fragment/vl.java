package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.j8g;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.tlm;
import defpackage.u75;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class vl implements defpackage.pj {
    public static final vl a = new vl();
    public static final List b = u75.h("textColor", C0479n3.g, "commonOverlays", "buttons");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        ol olVar = (ol) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        olVar.getClass();
        r7fVar.Z("textColor");
        defpackage.uj.i.a(r7fVar, fx6Var, olVar.a);
        r7fVar.Z(C0479n3.g);
        qhj qhjVar = new qhj(sl.a, false);
        ll llVar = olVar.b;
        if (llVar == null) {
            r7fVar.B0();
        } else {
            qhjVar.a(r7fVar, fx6Var, llVar);
        }
        r7fVar.Z("commonOverlays");
        j8g j8gVar = new j8g(new qhj(ul.a, true), 0);
        List list = olVar.c;
        if (list == null) {
            r7fVar.B0();
        } else {
            j8gVar.e(r7fVar, fx6Var, list);
        }
        r7fVar.Z("buttons");
        qhj qhjVar2 = new qhj(tl.a, false);
        ArrayList arrayList = olVar.d;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            if (obj2 == null) {
                r7fVar.B0();
            } else {
                qhjVar2.a(r7fVar, fx6Var, obj2);
            }
        }
        r7fVar.l();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        Object b2;
        Object b3;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        ll llVar = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                str = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                sl slVar = sl.a;
                defpackage.tj tjVar = defpackage.uj.a;
                qhj qhjVar = new qhj(slVar, false);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    b3 = null;
                } else {
                    b3 = qhjVar.b(a7fVar, fx6Var);
                }
                llVar = (ll) b3;
            } else if (z0 == 2) {
                ul ulVar = ul.a;
                defpackage.tj tjVar2 = defpackage.uj.a;
                j8g j8gVar = new j8g(new qhj(ulVar, true), 0);
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    arrayList = null;
                } else {
                    arrayList = j8gVar.c(a7fVar, fx6Var);
                }
            } else {
                if (z0 != 3) {
                    arrayList2.getClass();
                    return new ol(str, llVar, arrayList, arrayList2);
                }
                tl tlVar = tl.a;
                defpackage.tj tjVar3 = defpackage.uj.a;
                qhj qhjVar2 = new qhj(tlVar, false);
                arrayList2 = tlm.n(a7fVar);
                while (a7fVar.hasNext()) {
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        b2 = null;
                    } else {
                        b2 = qhjVar2.b(a7fVar, fx6Var);
                    }
                    arrayList2.add(b2);
                }
                a7fVar.l();
            }
        }
    }
}
