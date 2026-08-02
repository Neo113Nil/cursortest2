package ru.yandex.taxi.maas.impl.ride;

import defpackage.bhx;
import defpackage.dpb;
import defpackage.e200;
import defpackage.f200;
import defpackage.g200;
import defpackage.h200;
import defpackage.h3y;
import defpackage.h55;
import defpackage.hxx;
import defpackage.j200;
import defpackage.jst;
import defpackage.m000;
import defpackage.m950;
import defpackage.p0u;
import defpackage.yvf0;

/* loaded from: classes5.dex */
public final class b extends h55 {
    public final ru.yandex.taxi.maas.impl.ride.common.a D;
    public final h3y E;
    public final yvf0 F;
    public final bhx G;

    public b(ru.yandex.taxi.maas.impl.ride.common.a aVar, h3y h3yVar, yvf0 yvf0Var, bhx bhxVar) {
        super(null);
        this.D = aVar;
        this.E = h3yVar;
        this.F = yvf0Var;
        this.G = bhxVar;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        e200 e200Var = (e200) obj;
        m000 m000Var = e200Var.a;
        int i = g200.a[m000Var.a.ordinal()];
        if (i == 1) {
            com.yandex.go.coroutines.b.g(o(), null, null, new MaasRideRouterImpl$onLaunchMaasFromMetro$1(this, m000Var, null), 3);
            return;
        }
        if (i == 2) {
            j(dpb.a);
            E((m950) this.G.get(), new j200(m000Var), new h200(this), hxx.a);
        } else {
            if (i != 3) {
                jst.e.r("passed not satisfying maas-ride deeplink", new IllegalArgumentException());
                return;
            }
            this.D.d(o(), e200Var.a, new f200(this, 0), new p0u(21));
        }
    }
}
