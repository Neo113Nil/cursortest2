package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.t3;
import com.yandex.passport.internal.methods.v5;
import defpackage.ocu;

/* loaded from: classes4.dex */
public final class v implements z0 {
    public final com.yandex.passport.internal.core.accounts.e a;
    public final com.yandex.passport.internal.filter.l b;
    public final com.yandex.passport.internal.usecase.b1 c;
    public final com.yandex.passport.internal.flags.i d;

    public v(com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.filter.l lVar, com.yandex.passport.internal.usecase.b1 b1Var, com.yandex.passport.internal.flags.i iVar) {
        eVar.getClass();
        lVar.getClass();
        b1Var.getClass();
        iVar.getClass();
        this.a = eVar;
        this.b = lVar;
        this.c = b1Var;
        this.d = iVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        return com.yandex.passport.internal.ui.a.z(new ocu(this, (t3) v5Var, null));
    }
}
