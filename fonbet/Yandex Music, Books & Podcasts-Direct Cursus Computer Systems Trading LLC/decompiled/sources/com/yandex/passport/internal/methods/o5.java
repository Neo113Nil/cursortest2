package com.yandex.passport.internal.methods;

import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class o5 extends v5 {
    public final g6 c;
    public final k6 d;
    public final b e;
    public final List f;
    public final com.yandex.passport.internal.flags.experiments.d g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(com.yandex.passport.api.z1 z1Var, String str, String str2) {
        super(w5.b1);
        str.getClass();
        str2.getClass();
        g6 g6Var = new g6(e6.d, z1Var);
        k6 k6Var = new k6(c.p, str);
        b bVar = new b(c.d, str2);
        this.c = g6Var;
        this.d = k6Var;
        this.e = bVar;
        this.f = u75.h(g6Var, k6Var, bVar);
        this.g = new com.yandex.passport.internal.flags.experiments.d("has_plus_device_added", 1, false);
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final List a() {
        return this.f;
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final f b() {
        return this.g;
    }
}
