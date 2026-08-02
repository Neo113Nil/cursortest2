package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class k3 extends v5 {
    public final b c;
    public final List d;
    public final d6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(Bundle bundle) {
        super(w5.f);
        bundle.getClass();
        c cVar = c.j;
        b bVar = new b(cVar, cVar.c(bundle));
        this.c = bVar;
        this.d = t75.c(bVar);
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
