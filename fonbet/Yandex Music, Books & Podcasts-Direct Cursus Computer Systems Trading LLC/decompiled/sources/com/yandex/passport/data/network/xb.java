package com.yandex.passport.data.network;

import defpackage.itv;
import defpackage.rhw;

/* loaded from: classes4.dex */
public final class xb extends com.yandex.passport.data.network.core.b {
    public final tb f;
    public final com.yandex.passport.data.network.core.x g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.j0 j0Var, com.yandex.passport.internal.network.b bVar, tb tbVar, com.yandex.passport.common.core.a aVar2, com.yandex.passport.common.core.a aVar3, com.yandex.passport.data.network.core.x xVar) {
        super(aVar, bVar, j0Var, aVar2, aVar3);
        aVar.getClass();
        j0Var.getClass();
        bVar.getClass();
        tbVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        xVar.getClass();
        this.f = tbVar;
        this.g = xVar;
    }

    @Override // com.yandex.passport.data.network.core.b, androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        rb rbVar = (rb) obj;
        return this.g.g(new com.yandex.passport.data.network.core.v(rbVar, "TryAddPlusDeviceRequest", new itv(20, this, rbVar)), rhwVar);
    }

    @Override // com.yandex.passport.data.network.core.b
    public final com.yandex.passport.data.network.core.d u() {
        return this.f;
    }

    @Override // com.yandex.passport.data.network.core.b
    /* renamed from: v */
    public final Object x(Object obj, rhw rhwVar) {
        rb rbVar = (rb) obj;
        return this.g.g(new com.yandex.passport.data.network.core.v(rbVar, "TryAddPlusDeviceRequest", new itv(20, this, rbVar)), rhwVar);
    }
}
