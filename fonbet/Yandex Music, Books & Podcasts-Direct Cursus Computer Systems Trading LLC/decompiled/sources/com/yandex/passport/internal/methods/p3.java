package com.yandex.passport.internal.methods;

import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class p3 extends v5 {
    public final q c;
    public final List d;
    public final e6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(com.yandex.passport.internal.entities.k kVar) {
        super(w5.c);
        q qVar = new q(r.d, kVar);
        this.c = qVar;
        this.d = t75.c(qVar);
        this.e = e6.b;
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
