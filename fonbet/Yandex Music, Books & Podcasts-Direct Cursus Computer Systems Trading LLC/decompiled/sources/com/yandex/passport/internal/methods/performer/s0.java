package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.r4;
import com.yandex.passport.internal.methods.v5;
import defpackage.b8b;

/* loaded from: classes4.dex */
public final class s0 implements z0 {
    public final com.yandex.passport.internal.account.a a;
    public final com.yandex.passport.internal.network.d b;
    public final com.yandex.passport.internal.usecase.e0 c;
    public final com.yandex.passport.common.ui.lang.b d;
    public final com.yandex.passport.internal.sloth.z e;

    public s0(com.yandex.passport.internal.account.a aVar, com.yandex.passport.internal.network.d dVar, com.yandex.passport.internal.usecase.e0 e0Var, com.yandex.passport.common.ui.lang.b bVar, com.yandex.passport.internal.sloth.z zVar) {
        aVar.getClass();
        dVar.getClass();
        e0Var.getClass();
        bVar.getClass();
        zVar.getClass();
        this.a = aVar;
        this.b = dVar;
        this.c = e0Var;
        this.d = bVar;
        this.e = zVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        return com.yandex.passport.internal.ui.a.z(new b8b((r4) v5Var, this, null));
    }
}
