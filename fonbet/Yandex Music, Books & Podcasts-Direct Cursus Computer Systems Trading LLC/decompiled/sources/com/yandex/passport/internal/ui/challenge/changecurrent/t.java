package com.yandex.passport.internal.ui.challenge.changecurrent;

import defpackage.aqd;
import defpackage.bfu;
import defpackage.eir;
import defpackage.ovn;
import defpackage.pcg;
import defpackage.xr7;

/* loaded from: classes4.dex */
public final class t extends bfu {
    public final xr7 k;
    public final eir l;

    public t(g0 g0Var) {
        g0Var.getClass();
        ovn ovnVar = g0Var.a;
        r rVar = new r(null, null, null, null, null);
        i iVar = g0Var.e;
        xr7 u = pcg.u(ovnVar, rVar, new aqd(new u[]{new u(iVar.a, iVar.c)}), new com.yandex.passport.internal.common.e(17, g0Var), f0.a);
        this.k = u;
        this.l = new eir(u);
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        this.k.b();
    }
}
