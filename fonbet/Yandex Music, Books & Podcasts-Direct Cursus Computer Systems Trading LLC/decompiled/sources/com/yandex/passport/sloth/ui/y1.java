package com.yandex.passport.sloth.ui;

import defpackage.bfu;
import defpackage.eir;
import defpackage.ot0;
import defpackage.ss3;
import defpackage.v0r;
import defpackage.x97;
import defpackage.xr7;
import defpackage.zsd;

/* loaded from: classes4.dex */
public final class y1 extends bfu {
    public final xr7 k;
    public final eir l;
    public final ss3 m;

    public y1(xr7 xr7Var) {
        this.k = xr7Var;
        this.l = new eir(xr7Var);
        this.m = zsd.I(new v0r(xr7Var, null, 11));
    }

    public final void a(x1 x1Var) {
        x97.y(ot0.F(this), null, null, new q(this, x1Var, null, 3), 3);
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        this.k.b();
    }
}
