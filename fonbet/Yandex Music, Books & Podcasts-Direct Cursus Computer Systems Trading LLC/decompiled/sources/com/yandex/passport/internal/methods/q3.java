package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class q3 extends v5 {
    public final k6 c;
    public final List d;
    public final x e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(Bundle bundle) {
        super(w5.G0);
        bundle.getClass();
        u6 u6Var = u6.d;
        k6 k6Var = new k6(u6Var, (com.yandex.passport.internal.properties.h0) u6Var.e(bundle));
        this.c = k6Var;
        this.d = t75.c(k6Var);
        this.e = x.d;
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
