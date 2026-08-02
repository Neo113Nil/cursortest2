package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class t3 extends v5 {
    public final q c;
    public final List d;
    public final e6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(Bundle bundle) {
        super(w5.b);
        bundle.getClass();
        r rVar = r.d;
        q qVar = new q(rVar, (com.yandex.passport.internal.entities.k) rVar.e(bundle));
        this.c = qVar;
        this.d = t75.c(qVar);
        this.e = e6.c;
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
