package com.yandex.passport.internal.methods;

import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class h0 extends v5 {
    public final k6 c;
    public final List d;
    public final d6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.yandex.passport.internal.entities.w wVar) {
        super(w5.J);
        k6 k6Var = new k6(b7.d, wVar);
        this.c = k6Var;
        this.d = t75.c(k6Var);
        this.e = d6.d;
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final List a() {
        return this.d;
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final f b() {
        return this.e;
    }
}
