package com.yandex.passport.internal.usecase;

import defpackage.inr;
import defpackage.rhw;
import defpackage.z7o;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class b extends com.yandex.passport.common.domain.a {
    public final u b;
    public final com.yandex.passport.internal.core.accounts.f c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.yandex.passport.common.coroutine.a aVar, u uVar, com.yandex.passport.internal.core.accounts.f fVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        uVar.getClass();
        fVar.getClass();
        this.b = uVar;
        this.c = fVar;
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        Object A = com.yandex.passport.internal.ui.a.A(new inr((a) obj, this, (Continuation) null, 21));
        Throwable a = z7o.a(A);
        if (a == null) {
            return new z7o(A);
        }
        throw a;
    }
}
