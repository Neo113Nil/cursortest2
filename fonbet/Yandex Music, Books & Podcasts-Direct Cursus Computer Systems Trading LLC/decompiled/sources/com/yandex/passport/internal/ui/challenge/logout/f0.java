package com.yandex.passport.internal.ui.challenge.logout;

import defpackage.b6;
import defpackage.bsh;

/* loaded from: classes4.dex */
public final class f0 extends com.yandex.passport.internal.ui.challenge.b0 {
    public d l = d.b;

    @Override // com.yandex.passport.internal.ui.challenge.b0
    public final bsh a(b6 b6Var) {
        com.yandex.passport.internal.ui.challenge.o oVar = (com.yandex.passport.internal.ui.challenge.o) b6Var;
        oVar.getClass();
        Object obj = com.yandex.passport.internal.di.a.a().createLogoutComponent().challengeData(oVar).behaviour(this.l).viewModel(this).build().getSessionProvider().get();
        obj.getClass();
        return (s) obj;
    }
}
