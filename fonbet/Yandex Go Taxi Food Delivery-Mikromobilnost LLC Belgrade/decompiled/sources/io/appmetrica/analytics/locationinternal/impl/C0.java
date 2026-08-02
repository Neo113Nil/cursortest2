package io.appmetrica.analytics.locationinternal.impl;

import defpackage.scc;
import ru.yandex.common.startup.StartupRequest;

/* loaded from: classes9.dex */
public final class C0 {
    public static A0 a(p2 p2Var) {
        G0 g0 = new G0(new y2(), new B2());
        r2 r2Var = p2Var.c;
        h2 h2Var = new h2(g0, r2Var.b, r2Var.a, StartupRequest.PARAM_WIFI);
        G0 g02 = new G0(new C0986t(), new C0995w());
        r2 r2Var2 = p2Var.b;
        h2 h2Var2 = new h2(g02, r2Var2.b, r2Var2.a, "cell");
        return new A0(h2Var, h2Var2, p2Var.a ? new W(scc.g(h2Var, h2Var2)) : new C0934c0());
    }
}
