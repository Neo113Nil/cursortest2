package com.yandex.passport.internal.ui.bouncer.chooser;

import defpackage.bfu;
import defpackage.eir;
import defpackage.xr7;

/* loaded from: classes4.dex */
public final class y extends bfu {
    public final xr7 k;
    public final eir l;

    public y(xr7 xr7Var) {
        this.k = xr7Var;
        this.l = new eir(xr7Var);
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        this.k.b();
    }
}
