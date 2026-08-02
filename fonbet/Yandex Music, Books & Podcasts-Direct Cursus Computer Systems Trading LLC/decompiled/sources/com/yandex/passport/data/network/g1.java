package com.yandex.passport.data.network;

import defpackage.itv;
import defpackage.rhw;
import defpackage.t9f;

/* loaded from: classes4.dex */
public final class g1 extends com.yandex.passport.data.network.core.b {
    public final c1 f;
    public final com.yandex.passport.data.network.core.x g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g1(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.j0 j0Var, com.yandex.passport.internal.network.b bVar, c1 c1Var, com.yandex.passport.data.network.core.x xVar) {
        super(aVar, bVar, j0Var, new com.yandex.passport.common.network.n(r0, com.yandex.passport.common.network.u.Companion.serializer()), new com.yandex.passport.common.core.a(27));
        aVar.getClass();
        j0Var.getClass();
        bVar.getClass();
        c1Var.getClass();
        xVar.getClass();
        t9f serializer = f1.Companion.serializer();
        serializer.getClass();
        this.f = c1Var;
        this.g = xVar;
    }

    @Override // com.yandex.passport.data.network.core.b, androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        a1 a1Var = (a1) obj;
        return this.g.g(new com.yandex.passport.data.network.core.v(a1Var, "CompleteStatusRequest", new itv(17, this, a1Var)), rhwVar);
    }

    @Override // com.yandex.passport.data.network.core.b
    public final com.yandex.passport.data.network.core.d u() {
        return this.f;
    }

    @Override // com.yandex.passport.data.network.core.b
    /* renamed from: v */
    public final Object x(Object obj, rhw rhwVar) {
        a1 a1Var = (a1) obj;
        return this.g.g(new com.yandex.passport.data.network.core.v(a1Var, "CompleteStatusRequest", new itv(17, this, a1Var)), rhwVar);
    }
}
