package com.yandex.passport.internal.methods;

import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class s3 extends v5 {
    public final h c;
    public final List d;
    public final c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(com.yandex.passport.internal.properties.e eVar) {
        super(w5.o);
        h hVar = new h(i.d, eVar);
        this.c = hVar;
        this.d = t75.c(hVar);
        this.e = c.s;
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final List a() {
        return this.d;
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final f b() {
        return this.e;
    }

    public final com.yandex.passport.internal.properties.e d() {
        return (com.yandex.passport.internal.properties.e) this.c.c;
    }
}
