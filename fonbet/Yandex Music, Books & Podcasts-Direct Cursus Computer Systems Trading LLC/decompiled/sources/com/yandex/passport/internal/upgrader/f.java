package com.yandex.passport.internal.upgrader;

import androidx.core.app.n0;
import defpackage.rhw;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class f extends n0 {
    public final q b;
    public final com.yandex.passport.internal.core.accounts.e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.yandex.passport.common.coroutine.a aVar, q qVar, com.yandex.passport.internal.core.accounts.e eVar) {
        super((kotlinx.coroutines.a) ((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        qVar.getClass();
        eVar.getClass();
        this.b = qVar;
        this.c = eVar;
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        com.yandex.passport.internal.l e = this.c.a().e((com.yandex.passport.common.core.f) obj);
        if (e != null) {
            this.b.a(e, com.yandex.passport.api.o.a);
        }
        return Unit.a;
    }
}
