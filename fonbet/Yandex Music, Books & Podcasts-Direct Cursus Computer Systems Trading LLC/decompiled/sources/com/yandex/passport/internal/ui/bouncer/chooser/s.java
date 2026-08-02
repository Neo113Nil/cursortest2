package com.yandex.passport.internal.ui.bouncer.chooser;

import defpackage.aqd;
import defpackage.bfu;
import defpackage.gfu;
import defpackage.is6;
import defpackage.pcg;

/* loaded from: classes4.dex */
public final class s implements gfu {
    public final r a;

    public s(r rVar) {
        rVar.getClass();
        this.a = rVar;
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        w wVar = new w(null, null, null, null);
        r rVar = this.a;
        rVar.getClass();
        return new y(pcg.u(rVar.a, wVar, new aqd(new i[]{i.a}), new com.yandex.passport.internal.common.e(15, rVar), q.a));
    }

    @Override // defpackage.gfu
    public final bfu c(Class cls, is6 is6Var) {
        is6Var.getClass();
        return b(cls);
    }
}
