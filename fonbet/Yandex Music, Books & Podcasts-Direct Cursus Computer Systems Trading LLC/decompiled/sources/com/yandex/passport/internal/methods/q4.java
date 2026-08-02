package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class q4 extends v5 {
    public final b c;
    public final List d;
    public final e6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(Bundle bundle) {
        super(w5.g);
        bundle.getClass();
        c cVar = c.l;
        b bVar = new b(cVar, cVar.c(bundle));
        this.c = bVar;
        this.d = t75.c(bVar);
        this.e = e6.d;
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
