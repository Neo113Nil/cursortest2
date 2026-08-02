package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.t75;
import defpackage.tlm;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class nd implements defpackage.pj {
    public static final nd a = new nd();
    public static final List b = t75.c("items");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        fd fdVar = (fd) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        fdVar.getClass();
        r7fVar.Z("items");
        kd kdVar = kd.a;
        defpackage.tj tjVar = defpackage.uj.a;
        qhj qhjVar = new qhj(kdVar, true);
        ArrayList arrayList = fdVar.a;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            if (obj2 == null) {
                r7fVar.B0();
            } else {
                qhjVar.a(r7fVar, fx6Var, obj2);
            }
        }
        r7fVar.l();
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        Object b2;
        a7fVar.getClass();
        fx6Var.getClass();
        ArrayList arrayList = null;
        while (a7fVar.z0(b) == 0) {
            kd kdVar = kd.a;
            defpackage.tj tjVar = defpackage.uj.a;
            qhj qhjVar = new qhj(kdVar, true);
            arrayList = tlm.n(a7fVar);
            while (a7fVar.hasNext()) {
                if (a7fVar.peek() == 10) {
                    a7fVar.w();
                    b2 = null;
                } else {
                    b2 = qhjVar.b(a7fVar, fx6Var);
                }
                arrayList.add(b2);
            }
            a7fVar.l();
        }
        arrayList.getClass();
        return new fd(arrayList);
    }
}
