package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.g4;
import com.yandex.passport.internal.methods.v5;
import defpackage.x97;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class i0 implements z0 {
    public final com.yandex.passport.internal.usecase.d1 a;
    public final com.yandex.passport.data.network.token.i b;

    public i0(com.yandex.passport.internal.usecase.d1 d1Var, com.yandex.passport.data.network.token.i iVar) {
        d1Var.getClass();
        this.a = d1Var;
        this.b = iVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        return ((z7o) x97.D(kotlin.coroutines.g.a, new b(this, (g4) v5Var, null, 15))).a;
    }
}
