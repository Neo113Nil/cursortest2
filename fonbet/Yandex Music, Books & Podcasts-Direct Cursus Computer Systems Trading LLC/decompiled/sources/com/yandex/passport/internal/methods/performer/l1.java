package com.yandex.passport.internal.methods.performer;

import android.content.Context;
import com.yandex.passport.internal.methods.l5;
import com.yandex.passport.internal.methods.v5;

/* loaded from: classes4.dex */
public final class l1 implements z0 {
    public final Context a;
    public final com.yandex.passport.internal.usecase.vpn.e b;
    public final com.yandex.passport.internal.config.n c;

    public l1(Context context, com.yandex.passport.internal.usecase.vpn.e eVar, com.yandex.passport.internal.config.n nVar) {
        context.getClass();
        eVar.getClass();
        nVar.getClass();
        this.a = context;
        this.b = eVar;
        this.c = nVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        return com.yandex.passport.internal.ui.a.z(new b(this, (l5) v5Var, null, 24));
    }
}
