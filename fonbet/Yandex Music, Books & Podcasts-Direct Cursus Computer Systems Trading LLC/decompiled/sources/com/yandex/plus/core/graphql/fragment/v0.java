package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class v0 implements defpackage.pj {
    public static final v0 a = new v0();
    public static final List b = u75.h("color", SSDPDeviceDescriptionParser.TAG_LOCATION);

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        j0 j0Var = (j0) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        j0Var.getClass();
        r7fVar.Z("color");
        s0 s0Var = s0.a;
        defpackage.tj tjVar = defpackage.uj.a;
        g0 g0Var = j0Var.a;
        r7fVar.j();
        s0Var.a(r7fVar, fx6Var, g0Var);
        r7fVar.p();
        r7fVar.Z(SSDPDeviceDescriptionParser.TAG_LOCATION);
        defpackage.uj.c.a(r7fVar, fx6Var, Double.valueOf(j0Var.b));
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        g0 g0Var = null;
        Double d = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                s0 s0Var = s0.a;
                defpackage.tj tjVar = defpackage.uj.a;
                g0Var = (g0) new qhj(s0Var, false).b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    g0Var.getClass();
                    d.getClass();
                    return new j0(g0Var, d.doubleValue());
                }
                d = (Double) defpackage.uj.c.b(a7fVar, fx6Var);
            }
        }
    }
}
