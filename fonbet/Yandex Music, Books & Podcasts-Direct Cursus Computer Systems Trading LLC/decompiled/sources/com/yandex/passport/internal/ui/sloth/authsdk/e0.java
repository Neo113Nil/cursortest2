package com.yandex.passport.internal.ui.sloth.authsdk;

import defpackage.bfu;
import defpackage.eir;
import defpackage.ot0;
import defpackage.x97;
import defpackage.xr7;

/* loaded from: classes4.dex */
public final class e0 extends bfu {
    public final xr7 k;
    public final eir l;

    public e0(xr7 xr7Var) {
        this.k = xr7Var;
        this.l = new eir(xr7Var);
    }

    public final void a(d0 d0Var) {
        x97.y(ot0.F(this), null, null, new com.yandex.passport.internal.storage.a(this, d0Var, null, 17), 3);
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        this.k.b();
    }
}
