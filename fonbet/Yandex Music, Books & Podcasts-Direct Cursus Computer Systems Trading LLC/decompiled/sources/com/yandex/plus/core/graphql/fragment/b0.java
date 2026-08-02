package com.yandex.plus.core.graphql.fragment;

import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.tlm;
import defpackage.u75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class b0 implements defpackage.pj {
    public static final b0 a = new b0();
    public static final List b = u75.h("angle", "colors", "relativeCenter", "relativeRadius", "type");

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        w wVar = (w) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        wVar.getClass();
        r7fVar.Z("angle");
        defpackage.uj.c.a(r7fVar, fx6Var, Double.valueOf(wVar.a));
        r7fVar.Z("colors");
        qhj qhjVar = new qhj(d0.a, false);
        ArrayList arrayList = wVar.b;
        r7fVar.m();
        for (Object obj2 : arrayList) {
            if (obj2 == null) {
                r7fVar.B0();
            } else {
                qhjVar.a(r7fVar, fx6Var, obj2);
            }
        }
        r7fVar.l();
        r7fVar.Z("relativeCenter");
        qhj qhjVar2 = new qhj(e0.a, false);
        y yVar = wVar.c;
        if (yVar == null) {
            r7fVar.B0();
        } else {
            qhjVar2.a(r7fVar, fx6Var, yVar);
        }
        r7fVar.Z("relativeRadius");
        qhj qhjVar3 = new qhj(f0.a, false);
        z zVar = wVar.d;
        if (zVar == null) {
            r7fVar.B0();
        } else {
            qhjVar3.a(r7fVar, fx6Var, zVar);
        }
        r7fVar.Z("type");
        r7fVar.m0(wVar.e.a);
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        com.yandex.plus.core.graphql.type.c cVar;
        Object obj;
        Object obj2;
        Object b2;
        a7fVar.getClass();
        fx6Var.getClass();
        Double d = null;
        ArrayList arrayList = null;
        y yVar = null;
        z zVar = null;
        com.yandex.plus.core.graphql.type.c cVar2 = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 != 0) {
                int i = 0;
                if (z0 == 1) {
                    d0 d0Var = d0.a;
                    defpackage.tj tjVar = defpackage.uj.a;
                    qhj qhjVar = new qhj(d0Var, false);
                    ArrayList n = tlm.n(a7fVar);
                    while (a7fVar.hasNext()) {
                        if (a7fVar.peek() == 10) {
                            a7fVar.w();
                            b2 = null;
                        } else {
                            b2 = qhjVar.b(a7fVar, fx6Var);
                        }
                        n.add(b2);
                    }
                    a7fVar.l();
                    arrayList = n;
                } else if (z0 == 2) {
                    e0 e0Var = e0.a;
                    defpackage.tj tjVar2 = defpackage.uj.a;
                    qhj qhjVar2 = new qhj(e0Var, false);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj2 = null;
                    } else {
                        obj2 = qhjVar2.b(a7fVar, fx6Var);
                    }
                    yVar = (y) obj2;
                } else if (z0 == 3) {
                    f0 f0Var = f0.a;
                    defpackage.tj tjVar3 = defpackage.uj.a;
                    qhj qhjVar3 = new qhj(f0Var, false);
                    if (a7fVar.peek() == 10) {
                        a7fVar.w();
                        obj = null;
                    } else {
                        obj = qhjVar3.b(a7fVar, fx6Var);
                    }
                    zVar = (z) obj;
                } else {
                    if (z0 != 4) {
                        d.getClass();
                        double doubleValue = d.doubleValue();
                        arrayList.getClass();
                        cVar2.getClass();
                        return new w(doubleValue, arrayList, yVar, zVar, cVar2);
                    }
                    String f0 = a7fVar.f0();
                    f0.getClass();
                    com.yandex.plus.core.graphql.type.c.b.getClass();
                    com.yandex.plus.core.graphql.type.c[] values = com.yandex.plus.core.graphql.type.c.values();
                    int length = values.length;
                    while (true) {
                        if (i >= length) {
                            cVar = null;
                            break;
                        }
                        cVar = values[i];
                        if (cVar.a.equals(f0)) {
                            break;
                        }
                        i++;
                    }
                    cVar2 = cVar == null ? com.yandex.plus.core.graphql.type.c.UNKNOWN__ : cVar;
                }
            } else {
                d = (Double) defpackage.uj.c.b(a7fVar, fx6Var);
            }
        }
    }
}
