package com.yandex.passport.data.network.token;

import com.yandex.passport.data.network.ac;
import defpackage.t9f;

/* loaded from: classes4.dex */
public final class n0 extends com.yandex.passport.data.network.core.o {
    public final ac i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.j0 j0Var, com.yandex.passport.internal.network.b bVar, i iVar, ac acVar, com.yandex.passport.data.network.core.s sVar) {
        super(aVar, bVar, j0Var, (com.yandex.passport.data.network.core.e) new com.yandex.passport.common.network.n(r0, com.yandex.passport.common.network.u.Companion.serializer()), (com.yandex.passport.data.network.core.f) iVar, sVar, "GetMasterTokenForwardByTrackRequest");
        aVar.getClass();
        j0Var.getClass();
        bVar.getClass();
        iVar.getClass();
        acVar.getClass();
        sVar.getClass();
        t9f serializer = m0.Companion.serializer();
        serializer.getClass();
        this.i = acVar;
    }

    @Override // com.yandex.passport.data.network.core.b
    public final com.yandex.passport.data.network.core.d u() {
        return this.i;
    }
}
