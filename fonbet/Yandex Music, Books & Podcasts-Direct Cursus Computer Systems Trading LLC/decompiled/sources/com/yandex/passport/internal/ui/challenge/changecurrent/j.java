package com.yandex.passport.internal.ui.challenge.changecurrent;

import defpackage.b6;
import defpackage.bsh;

/* loaded from: classes4.dex */
public final class j extends com.yandex.passport.internal.ui.challenge.b0 {
    @Override // com.yandex.passport.internal.ui.challenge.b0
    public final bsh a(b6 b6Var) {
        com.yandex.passport.internal.ui.challenge.n nVar = (com.yandex.passport.internal.ui.challenge.n) b6Var;
        nVar.getClass();
        Object obj = com.yandex.passport.internal.di.a.a().createSetCurrentAccountComponent().challengeData(nVar).viewModel(this).build().getSessionProvider().get();
        obj.getClass();
        return (h) obj;
    }
}
