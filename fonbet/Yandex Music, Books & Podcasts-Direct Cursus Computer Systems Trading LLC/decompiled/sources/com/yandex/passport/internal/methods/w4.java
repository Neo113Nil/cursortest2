package com.yandex.passport.internal.methods;

import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class w4 extends v5 {
    public final g6 c;
    public final List d;
    public final e6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(com.yandex.passport.api.z1 z1Var) {
        super(w5.J0);
        z1Var.getClass();
        g6 g6Var = new g6(e6.d, z1Var);
        this.c = g6Var;
        this.d = t75.c(g6Var);
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
