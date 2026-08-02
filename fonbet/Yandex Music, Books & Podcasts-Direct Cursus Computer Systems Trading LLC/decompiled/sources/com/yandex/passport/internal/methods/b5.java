package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class b5 extends v5 {
    public final w6 c;
    public final List d;
    public final e6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(Bundle bundle) {
        super(w5.z);
        bundle.getClass();
        w6 w6Var = new w6(e6.h, e6.c(bundle));
        this.c = w6Var;
        this.d = t75.c(w6Var);
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
