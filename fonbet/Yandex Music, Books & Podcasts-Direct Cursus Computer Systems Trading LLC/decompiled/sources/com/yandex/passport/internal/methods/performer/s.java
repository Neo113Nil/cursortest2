package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.p3;
import com.yandex.passport.internal.methods.v5;

/* loaded from: classes4.dex */
public final class s implements z0 {
    public final com.yandex.passport.internal.core.accounts.e a;
    public final com.yandex.passport.internal.filter.l b;

    public s(com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.filter.l lVar) {
        eVar.getClass();
        lVar.getClass();
        this.a = eVar;
        this.b = lVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        return com.yandex.passport.internal.ui.a.z(new b(this, (p3) v5Var, null, 9));
    }
}
