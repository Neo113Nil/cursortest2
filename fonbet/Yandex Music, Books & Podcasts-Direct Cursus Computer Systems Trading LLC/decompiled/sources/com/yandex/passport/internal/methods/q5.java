package com.yandex.passport.internal.methods;

import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class q5 extends v5 {
    public final g6 c;
    public final b d;
    public final b e;
    public final List f;
    public final e6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(com.yandex.passport.api.z1 z1Var, String str, boolean z) {
        super(w5.R0);
        str.getClass();
        g6 g6Var = new g6(e6.d, z1Var);
        b bVar = new b(c.i, str);
        b bVar2 = new b(a.i, Boolean.valueOf(z));
        this.c = g6Var;
        this.d = bVar;
        this.e = bVar2;
        this.f = u75.h(g6Var, bVar, bVar2);
        this.g = e6.i;
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
