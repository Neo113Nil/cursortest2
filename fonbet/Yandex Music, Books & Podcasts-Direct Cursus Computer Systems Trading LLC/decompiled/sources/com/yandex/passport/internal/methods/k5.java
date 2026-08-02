package com.yandex.passport.internal.methods;

import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class k5 extends v5 {
    public final b c;
    public final List d;
    public final e6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(com.yandex.passport.api.z1 z1Var) {
        super(w5.i);
        b bVar = new b(e6.e, z1Var);
        this.c = bVar;
        this.d = t75.c(bVar);
        this.e = e6.i;
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
