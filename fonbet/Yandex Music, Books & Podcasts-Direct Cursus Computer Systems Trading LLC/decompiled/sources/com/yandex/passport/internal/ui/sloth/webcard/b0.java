package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.bfu;
import defpackage.gfu;
import defpackage.is6;
import defpackage.pcg;

/* loaded from: classes4.dex */
public final class b0 implements gfu {
    public final x a;

    public b0(x xVar) {
        xVar.getClass();
        this.a = xVar;
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        super.b(cls);
        throw null;
    }

    @Override // defpackage.gfu
    public final bfu c(Class cls, is6 is6Var) {
        is6Var.getClass();
        x xVar = this.a;
        return new h0(pcg.u(xVar.a, new c0(null, null, null), new n(xVar.b), new com.yandex.passport.internal.ui.sloth.authsdk.h0(11, xVar), w.a));
    }
}
