package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class t0 implements defpackage.pj {
    public static final t0 a = new t0();
    public static final List b = u75.h("color", SSDPDeviceDescriptionParser.TAG_LOCATION);

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        h0 h0Var = (h0) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        h0Var.getClass();
        r7fVar.Z("color");
        u0 u0Var = u0.a;
        defpackage.tj tjVar = defpackage.uj.a;
        i0 i0Var = h0Var.a;
        r7fVar.j();
        u0Var.a(r7fVar, fx6Var, i0Var);
        r7fVar.p();
        r7fVar.Z(SSDPDeviceDescriptionParser.TAG_LOCATION);
        defpackage.uj.c.a(r7fVar, fx6Var, Double.valueOf(h0Var.b));
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        i0 i0Var = null;
        Double d = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                u0 u0Var = u0.a;
                defpackage.tj tjVar = defpackage.uj.a;
                i0Var = (i0) new qhj(u0Var, false).b(a7fVar, fx6Var);
            } else {
                if (z0 != 1) {
                    i0Var.getClass();
                    d.getClass();
                    return new h0(i0Var, d.doubleValue());
                }
                d = (Double) defpackage.uj.c.b(a7fVar, fx6Var);
            }
        }
    }
}
