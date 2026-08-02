package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.bfu;
import defpackage.eir;
import defpackage.ot0;
import defpackage.ss3;
import defpackage.v0r;
import defpackage.x97;
import defpackage.xr7;
import defpackage.zsd;

/* loaded from: classes4.dex */
public final class h0 extends bfu {
    public final xr7 k;
    public final eir l;
    public final ss3 m;

    public h0(xr7 xr7Var) {
        this.k = xr7Var;
        this.l = new eir(xr7Var);
        this.m = zsd.I(new v0r(xr7Var, null, 11));
    }

    public final void a(g0 g0Var) {
        x97.y(ot0.F(this), null, null, new com.yandex.passport.internal.storage.a(this, g0Var, null, 26), 3);
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        this.k.b();
    }
}
