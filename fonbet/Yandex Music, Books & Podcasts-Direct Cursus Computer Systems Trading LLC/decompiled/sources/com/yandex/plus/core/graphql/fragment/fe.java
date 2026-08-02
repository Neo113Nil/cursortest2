package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.tlm;
import defpackage.u75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class fe implements defpackage.pj {
    public static final List a = u75.h("metaColor", "items");

    public static de c(a7f a7fVar, fx6 fx6Var) {
        Object b;
        a7fVar.getClass();
        fx6Var.getClass();
        String str = null;
        ArrayList arrayList = null;
        while (true) {
            int z0 = a7fVar.z0(a);
            if (z0 == 0) {
                str = (String) defpackage.uj.i.b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    arrayList.getClass();
                    return new de(str, arrayList);
                }
                ee eeVar = ee.a;
                defpackage.tj tjVar = defpackage.uj.a;
                qhj qhjVar = new qhj(eeVar, true);
                arrayList = tlm.n(a7fVar);
                while (a7fVar.hasNext()) {
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        b = null;
                    } else {
                        b = qhjVar.b(a7fVar, fx6Var);
                    }
                    arrayList.add(b);
                }
                a7fVar.l();
            }
        }
    }
}
