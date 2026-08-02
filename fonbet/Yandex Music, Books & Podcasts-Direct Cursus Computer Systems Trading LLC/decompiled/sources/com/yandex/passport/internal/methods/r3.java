package com.yandex.passport.internal.methods;

import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class r3 extends v5 {
    public final g6 c;
    public final b d;
    public final List e;
    public final g f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(com.yandex.passport.api.z1 z1Var, String str) {
        super(w5.S0);
        str.getClass();
        g6 g6Var = new g6(e6.d, z1Var);
        b bVar = new b(c.i, str);
        this.c = g6Var;
        this.d = bVar;
        this.e = u75.h(g6Var, bVar);
        this.f = g.d;
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
