package com.yandex.passport.internal.ui.bouncer.challenge;

import defpackage.aqd;
import defpackage.bfu;
import defpackage.eir;
import defpackage.pcg;
import defpackage.xr7;

/* loaded from: classes4.dex */
public final class r extends bfu {
    public final xr7 k;
    public final eir l;

    public r(m mVar) {
        mVar.getClass();
        xr7 u = pcg.u(mVar.a, new p(null, null), new aqd(new f[]{f.a}), new com.yandex.passport.internal.common.e(13, mVar), l.a);
        this.k = u;
        this.l = new eir(u);
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        this.k.b();
    }
}
