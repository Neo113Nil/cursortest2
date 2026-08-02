package com.yandex.passport.internal.methods;

import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class p5 extends v5 {
    public final k c;
    public final List d;
    public final d6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(com.yandex.passport.internal.properties.g gVar) {
        super(w5.u);
        k kVar = new k(i.e, gVar);
        this.c = kVar;
        this.d = t75.c(kVar);
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
