package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
import defpackage.a7f;
import defpackage.fah;
import defpackage.fx6;
import defpackage.irf;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class x7 implements defpackage.pj {
    public static final x7 a = new x7();
    public static final List b = u75.h("hexColor", SSDPDeviceDescriptionParser.TAG_LOCATION);

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        q7 q7Var = (q7) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        q7Var.getClass();
        r7fVar.Z("hexColor");
        z7 z7Var = z7.a;
        defpackage.tj tjVar = defpackage.uj.a;
        r7 r7Var = q7Var.a;
        if (r7fVar instanceof fah) {
            r7fVar.j();
            z7Var.a(r7fVar, fx6Var, r7Var);
            r7fVar.p();
        } else {
            fah fahVar = new fah();
            fahVar.j();
            z7Var.a(fahVar, fx6Var, r7Var);
            fahVar.p();
            Object b2 = fahVar.b();
            b2.getClass();
            irf.V(r7fVar, b2);
        }
        r7fVar.Z(SSDPDeviceDescriptionParser.TAG_LOCATION);
        defpackage.uj.c.a(r7fVar, fx6Var, Double.valueOf(q7Var.b));
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        r7 r7Var = null;
        Double d = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                z7 z7Var = z7.a;
                defpackage.tj tjVar = defpackage.uj.a;
                r7Var = (r7) new qhj(z7Var, true).b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    r7Var.getClass();
                    d.getClass();
                    return new q7(r7Var, d.doubleValue());
                }
                d = (Double) defpackage.uj.c.b(a7fVar, fx6Var);
            }
        }
    }
}
