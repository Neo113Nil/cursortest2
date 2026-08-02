package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class t5 extends v5 {
    public final k6 c;
    public final List d;
    public final e6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(Bundle bundle) {
        super(w5.W0);
        bundle.getClass();
        x6 x6Var = x6.d;
        k6 k6Var = new k6(x6Var, (com.yandex.passport.internal.properties.i0) x6Var.e(bundle));
        this.c = k6Var;
        this.d = t75.c(k6Var);
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
