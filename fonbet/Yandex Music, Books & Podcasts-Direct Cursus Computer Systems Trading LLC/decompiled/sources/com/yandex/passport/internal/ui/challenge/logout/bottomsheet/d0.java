package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.aqd;
import defpackage.bfu;
import defpackage.gfu;
import defpackage.is6;
import defpackage.pcg;

/* loaded from: classes4.dex */
public final class d0 implements gfu {
    public final b0 a;

    public d0(b0 b0Var) {
        b0Var.getClass();
        this.a = b0Var;
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        e0 e0Var = new e0(null, null);
        b0 b0Var = this.a;
        b0Var.getClass();
        return new f0(pcg.u(b0Var.a, e0Var, new aqd(new v[]{v.a}), new com.yandex.passport.internal.common.e(22, b0Var), a0.b));
    }

    @Override // defpackage.gfu
    public final bfu c(Class cls, is6 is6Var) {
        is6Var.getClass();
        return b(cls);
    }
}
