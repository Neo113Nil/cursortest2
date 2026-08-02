package com.yandex.passport.internal.methods;

import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class o3 extends v5 {
    public final g6 c;
    public final m6 d;
    public final List e;
    public final y6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(com.yandex.passport.api.z1 z1Var, com.yandex.passport.internal.upgrader.p pVar) {
        super(w5.I0);
        g6 g6Var = new g6(e6.d, z1Var);
        m6 m6Var = new m6(n6.d, pVar);
        this.c = g6Var;
        this.d = m6Var;
        this.e = u75.h(g6Var, m6Var);
        this.f = y6.d;
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final List a() {
        return this.e;
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final f b() {
        return this.f;
    }
}
