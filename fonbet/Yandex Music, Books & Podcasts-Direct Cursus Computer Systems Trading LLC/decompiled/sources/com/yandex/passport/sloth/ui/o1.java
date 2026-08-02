package com.yandex.passport.sloth.ui;

import defpackage.bfu;
import defpackage.gfu;
import defpackage.is6;
import defpackage.ovn;
import defpackage.pcg;

/* loaded from: classes4.dex */
public final class o1 implements gfu {
    public final com.yandex.passport.internal.core.accounts.h a;

    public o1(com.yandex.passport.internal.core.accounts.h hVar) {
        this.a = hVar;
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        super.b(cls);
        throw null;
    }

    @Override // defpackage.gfu
    public final bfu c(Class cls, is6 is6Var) {
        is6Var.getClass();
        p1 p1Var = new p1(false, com.yandex.passport.sloth.ui.error.e.f);
        com.yandex.passport.internal.core.accounts.h hVar = this.a;
        return new y1(pcg.u((ovn) hVar.b, p1Var, new com.yandex.passport.internal.ui.sloth.webcard.n((a1) hVar.c), new com.yandex.passport.internal.ui.sloth.authsdk.h0(19, hVar), l0.a));
    }
}
