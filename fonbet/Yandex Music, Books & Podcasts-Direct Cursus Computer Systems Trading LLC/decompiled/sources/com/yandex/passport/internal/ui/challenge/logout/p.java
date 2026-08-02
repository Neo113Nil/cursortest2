package com.yandex.passport.internal.ui.challenge.logout;

import defpackage.aqd;
import defpackage.bfu;
import defpackage.eir;
import defpackage.pcg;
import defpackage.xr7;

/* loaded from: classes4.dex */
public final class p extends bfu {
    public final xr7 k;
    public final eir l;

    public p(e0 e0Var) {
        e0Var.getClass();
        xr7 u = pcg.u(e0Var.a, new n(null, null, null, null), new aqd(new u[]{new u(e0Var.f, e0Var.g, e0Var.h)}), new com.yandex.passport.internal.common.e(20, e0Var), d0.a);
        this.k = u;
        this.l = new eir(u);
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        this.k.b();
    }
}
