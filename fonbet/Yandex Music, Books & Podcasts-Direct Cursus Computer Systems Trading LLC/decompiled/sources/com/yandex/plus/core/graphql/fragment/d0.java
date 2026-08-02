package com.yandex.plus.core.graphql.fragment;

import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
import defpackage.a7f;
import defpackage.fx6;
import defpackage.r7f;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class d0 implements defpackage.pj {
    public static final d0 a = new d0();
    public static final List b = u75.h("a", "hex", SSDPDeviceDescriptionParser.TAG_LOCATION);

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        x xVar = (x) obj;
        r7fVar.getClass();
        fx6Var.getClass();
        xVar.getClass();
        r7fVar.Z("a");
        defpackage.tj tjVar = defpackage.uj.c;
        tjVar.a(r7fVar, fx6Var, Double.valueOf(xVar.a));
        r7fVar.Z("hex");
        defpackage.uj.a.a(r7fVar, fx6Var, xVar.b);
        r7fVar.Z(SSDPDeviceDescriptionParser.TAG_LOCATION);
        tjVar.a(r7fVar, fx6Var, Double.valueOf(xVar.c));
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        Double d = null;
        Double d2 = null;
        String str = null;
        while (true) {
            int z0 = a7fVar.z0(b);
            if (z0 == 0) {
                d = (Double) defpackage.uj.c.b(a7fVar, fx6Var);
            } else if (z0 == 1) {
                str = (String) defpackage.uj.a.b(a7fVar, fx6Var);
                d2 = d2;
            } else {
                if (z0 != 2) {
                    Double d3 = d2;
                    d.getClass();
                    double doubleValue = d.doubleValue();
                    str.getClass();
                    d3.getClass();
                    return new x(doubleValue, str, d3.doubleValue());
                }
                d2 = (Double) defpackage.uj.c.b(a7fVar, fx6Var);
            }
        }
    }
}
