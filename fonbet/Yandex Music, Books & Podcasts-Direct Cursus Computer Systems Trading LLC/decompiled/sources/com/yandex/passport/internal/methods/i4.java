package com.yandex.passport.internal.methods;

import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class i4 extends v5 {
    public final b c;
    public final List d;
    public final m e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(com.yandex.passport.internal.push.h0 h0Var) {
        super(w5.X0);
        h0Var.getClass();
        b bVar = new b(i6.d, h0Var);
        this.c = bVar;
        this.d = t75.c(bVar);
        this.e = m.i;
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
