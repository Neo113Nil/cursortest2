package com.yandex.passport.internal.ui.sloth.plusdevices;

import defpackage.aqd;
import defpackage.bfu;
import defpackage.gfu;
import defpackage.is6;
import defpackage.pcg;

/* loaded from: classes4.dex */
public final class g0 implements gfu {
    public final e0 a;

    public g0(e0 e0Var) {
        e0Var.getClass();
        this.a = e0Var;
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        super.b(cls);
        throw null;
    }

    @Override // defpackage.gfu
    public final bfu c(Class cls, is6 is6Var) {
        is6Var.getClass();
        e0 e0Var = this.a;
        return new n0(pcg.u(e0Var.a, new h0(null, null), new aqd(new x[]{e0Var.b.e ? u.a : new w(true)}), new com.yandex.passport.internal.ui.sloth.authsdk.h0(7, e0Var), d0.a));
    }
}
