package com.yandex.passport.internal.ui.sloth.webauthn;

import defpackage.bfu;
import defpackage.eir;
import defpackage.ot0;
import defpackage.ss3;
import defpackage.v0r;
import defpackage.x97;
import defpackage.xr7;
import defpackage.zsd;

/* loaded from: classes4.dex */
public final class x extends bfu {
    public final xr7 k;
    public final eir l;
    public final ss3 m;

    public x(xr7 xr7Var) {
        this.k = xr7Var;
        this.l = new eir(xr7Var);
        this.m = zsd.I(new v0r(xr7Var, null, 11));
    }

    public final void a(w wVar) {
        x97.y(ot0.F(this), null, null, new com.yandex.passport.internal.storage.a(this, wVar, null, 22), 3);
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        this.k.b();
    }
}
