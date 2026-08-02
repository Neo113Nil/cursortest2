package com.yandex.passport.internal.ui.sloth.authsdk;

import defpackage.bfu;
import defpackage.gfu;
import defpackage.is6;
import defpackage.pcg;

/* loaded from: classes4.dex */
public final class x implements gfu {
    public final w a;

    public x(w wVar) {
        wVar.getClass();
        this.a = wVar;
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        super.b(cls);
        throw null;
    }

    @Override // defpackage.gfu
    public final bfu c(Class cls, is6 is6Var) {
        is6Var.getClass();
        w wVar = this.a;
        return new e0(pcg.u(wVar.a, new y(null, null), null, new com.yandex.passport.internal.common.e(29, wVar), c.a));
    }
}
