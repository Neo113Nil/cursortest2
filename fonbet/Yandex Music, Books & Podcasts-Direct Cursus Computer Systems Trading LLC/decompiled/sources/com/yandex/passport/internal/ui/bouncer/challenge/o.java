package com.yandex.passport.internal.ui.bouncer.challenge;

import defpackage.bfu;
import defpackage.gfu;
import defpackage.is6;

/* loaded from: classes4.dex */
public final class o implements gfu {
    public final m a;

    public o(m mVar) {
        mVar.getClass();
        this.a = mVar;
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        super.b(cls);
        throw null;
    }

    @Override // defpackage.gfu
    public final bfu c(Class cls, is6 is6Var) {
        is6Var.getClass();
        return new r(this.a);
    }
}
