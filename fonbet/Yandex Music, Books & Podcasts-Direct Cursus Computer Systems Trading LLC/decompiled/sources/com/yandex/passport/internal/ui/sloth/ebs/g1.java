package com.yandex.passport.internal.ui.sloth.ebs;

import com.yandex.passport.data.network.m3;
import defpackage.bfu;
import defpackage.by7;
import defpackage.eir;
import defpackage.noo;
import defpackage.ot0;
import defpackage.ss3;
import defpackage.v0r;
import defpackage.x97;
import defpackage.xr7;
import defpackage.zsd;

/* loaded from: classes4.dex */
public final class g1 extends bfu {
    public final xr7 k;
    public final com.yandex.passport.common.ebs.k l;
    public final noo m;
    public final by7 n;
    public final ss3 o;

    public g1(xr7 xr7Var, com.yandex.passport.common.ebs.k kVar, noo nooVar) {
        kVar.getClass();
        this.k = xr7Var;
        this.l = kVar;
        this.m = nooVar;
        eir eirVar = new eir(xr7Var);
        this.n = new by7(new m3(2, eirVar, this), new com.yandex.passport.internal.social.esia.m0(eirVar, eirVar, this, 1), 1);
        this.o = zsd.I(new v0r(xr7Var, null, 11));
    }

    public final void a(e1 e1Var) {
        x97.y(ot0.F(this), null, null, new com.yandex.passport.internal.storage.a(this, e1Var, null, 18), 3);
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        this.l.getClass();
        this.k.b();
    }
}
