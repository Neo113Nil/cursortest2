package com.yandex.passport.internal.social.esia;

import com.yandex.passport.data.network.m3;
import defpackage.bfu;
import defpackage.by7;
import defpackage.eir;
import defpackage.noo;
import defpackage.xr7;

/* loaded from: classes4.dex */
public final class n0 extends bfu {
    public final xr7 k;
    public final noo l;
    public final by7 m;

    public n0(xr7 xr7Var, noo nooVar) {
        this.k = xr7Var;
        this.l = nooVar;
        eir eirVar = new eir(xr7Var);
        this.m = new by7(new m3(1, eirVar, this), new m0(eirVar, eirVar, this, 0), 1);
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        this.k.b();
    }
}
