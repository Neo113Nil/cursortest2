package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class g0 extends v5 {
    public final k6 c;
    public final List d;
    public final d6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Bundle bundle) {
        super(w5.C0);
        bundle.getClass();
        s6 s6Var = s6.d;
        k6 k6Var = new k6(s6Var, (com.yandex.passport.internal.entities.t) s6Var.e(bundle));
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
