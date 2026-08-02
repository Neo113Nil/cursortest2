package com.yandex.passport.internal.usecase;

import defpackage.rhw;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class x0 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.core.accounts.e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.e eVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        eVar.getClass();
        this.b = eVar;
    }

    @Override // androidx.core.app.n0
    public final Object s(Object obj, rhw rhwVar) {
        return new z7o(com.yandex.passport.internal.ui.a.A(new com.yandex.passport.internal.storage.a(this, (com.yandex.passport.common.core.f) obj, null, 28)));
    }
}
