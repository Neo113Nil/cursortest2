package com.yandex.passport.internal.methods;

import com.yandex.passport.data.network.m8;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class b0 extends v5 {
    public final b c;
    public final k6 d;
    public final k6 e;
    public final List f;
    public final d6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.yandex.passport.api.impl.b bVar, String str, m8 m8Var) {
        super(w5.O0);
        b bVar2 = new b(i.j, bVar);
        k6 k6Var = new k6(c.r, str);
        k6 k6Var2 = new k6(r6.d, m8Var);
        this.c = bVar2;
        this.d = k6Var;
        this.e = k6Var2;
        this.f = u75.h(bVar2, k6Var, k6Var2);
        this.g = d6.d;
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
