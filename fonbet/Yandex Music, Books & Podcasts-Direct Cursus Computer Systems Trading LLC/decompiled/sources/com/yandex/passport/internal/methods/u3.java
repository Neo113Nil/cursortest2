package com.yandex.passport.internal.methods;

import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class u3 extends v5 {
    public final b c;
    public final List d;
    public final com.yandex.passport.internal.flags.experiments.d e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(s sVar) {
        super(w5.f1);
        b bVar = new b(t.d, sVar);
        this.c = bVar;
        this.d = t75.c(bVar);
        this.e = new com.yandex.passport.internal.flags.experiments.d("is_flag_enabled", 1, false);
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
