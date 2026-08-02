package com.yandex.passport.internal.usecase;

import com.yandex.passport.data.network.k7;
import defpackage.rhw;
import defpackage.z7o;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class d1 extends com.yandex.passport.common.domain.a {
    public final k7 b;
    public final com.yandex.passport.internal.core.accounts.e c;
    public final com.yandex.passport.internal.network.mappers.b d;
    public final com.yandex.passport.internal.report.reporters.z0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.yandex.passport.common.coroutine.a aVar, k7 k7Var, com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.report.reporters.z0 z0Var) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        aVar.getClass();
        k7Var.getClass();
        eVar.getClass();
        bVar.getClass();
        z0Var.getClass();
        this.b = k7Var;
        this.c = eVar;
        this.d = bVar;
        this.e = z0Var;
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        return new z7o(com.yandex.passport.internal.ui.a.A(new com.yandex.passport.internal.ui.sloth.q(this, (c1) obj, (Continuation) null, 16)));
    }
}
