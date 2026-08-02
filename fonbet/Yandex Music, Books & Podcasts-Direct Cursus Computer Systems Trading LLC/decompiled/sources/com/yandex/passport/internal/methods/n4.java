package com.yandex.passport.internal.methods;

import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class n4 extends v5 {
    public final b c;
    public final k6 d;
    public final b e;
    public final List f;
    public final q6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(com.yandex.passport.api.impl.b bVar, String str, String str2) {
        super(w5.Q0);
        b bVar2 = new b(i.j, bVar);
        k6 k6Var = new k6(c.r, str);
        b bVar3 = new b(c.e, str2);
        this.c = bVar2;
        this.d = k6Var;
        this.e = bVar3;
        this.f = u75.h(bVar2, k6Var, bVar3);
        this.g = q6.d;
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final List a() {
        return this.f;
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final f b() {
        return this.g;
    }
}
