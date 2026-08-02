package com.yandex.passport.internal.methods;

import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class y4 extends v5 {
    public final k6 c;
    public final k6 d;
    public final List e;
    public final e6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(com.yandex.passport.api.v2 v2Var, String str) {
        super(w5.G);
        v2Var.getClass();
        k6 k6Var = new k6(l6.d, v2Var);
        k6 k6Var2 = new k6(m.m, str);
        this.c = k6Var;
        this.d = k6Var2;
        this.e = u75.h(k6Var, k6Var2);
        this.f = e6.i;
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
