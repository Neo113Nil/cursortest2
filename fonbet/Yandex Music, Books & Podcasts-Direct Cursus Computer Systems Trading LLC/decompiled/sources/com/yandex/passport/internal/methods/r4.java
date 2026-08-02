package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class r4 extends v5 {
    public final k6 c;
    public final List d;
    public final c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(Bundle bundle) {
        super(w5.d1);
        bundle.getClass();
        c7 c7Var = c7.d;
        k6 k6Var = new k6(c7Var, (com.yandex.passport.api.impl.c) c7Var.e(bundle));
        this.c = k6Var;
        this.d = t75.c(k6Var);
        this.e = c.u;
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
