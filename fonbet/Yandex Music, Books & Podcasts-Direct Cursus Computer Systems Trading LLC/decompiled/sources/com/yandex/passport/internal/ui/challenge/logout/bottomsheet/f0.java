package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.bfu;
import defpackage.eir;
import defpackage.ss3;
import defpackage.v0r;
import defpackage.xr7;
import defpackage.zsd;

/* loaded from: classes4.dex */
public final class f0 extends bfu {
    public final xr7 k;
    public final eir l;
    public final ss3 m;

    public f0(xr7 xr7Var) {
        this.k = xr7Var;
        this.l = new eir(xr7Var);
        this.m = zsd.I(new v0r(xr7Var, null, 11));
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        this.k.b();
    }
}
