package com.yandex.passport.internal.ui.router;

import defpackage.bfu;
import defpackage.gfu;
import defpackage.is6;

/* loaded from: classes4.dex */
public final class m implements gfu {
    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        return new q(com.yandex.passport.internal.di.a.a().getFlagRepository());
    }

    @Override // defpackage.gfu
    public final bfu c(Class cls, is6 is6Var) {
        is6Var.getClass();
        return b(cls);
    }
}
