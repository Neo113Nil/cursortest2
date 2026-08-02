package com.yandex.passport.internal.ui.challenge.vpn;

import defpackage.aqd;
import defpackage.bfu;
import defpackage.eir;
import defpackage.ot0;
import defpackage.ovn;
import defpackage.pcg;
import defpackage.x97;
import defpackage.xr7;

/* loaded from: classes4.dex */
public final class y extends bfu {
    public final xr7 k;
    public final eir l;

    public y(com.yandex.passport.internal.flags.experiments.p pVar, String str) {
        pVar.getClass();
        str.getClass();
        xr7 u = pcg.u(new ovn(), new q(true, null, null, false), new aqd(new f[]{new f(str)}), new com.yandex.passport.internal.common.e(23, pVar), n.a);
        this.k = u;
        this.l = new eir(u);
    }

    public final void a(x xVar) {
        xVar.getClass();
        x97.y(ot0.F(this), null, null, new com.yandex.passport.internal.storage.a(this, xVar, null, 13), 3);
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        this.k.b();
    }
}
