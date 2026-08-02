package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class f0 extends v5 {
    public final b c;
    public final k6 d;
    public final List e;
    public final d6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Bundle bundle) {
        super(w5.K0);
        bundle.getClass();
        i iVar = i.j;
        com.yandex.passport.api.impl.b bVar = (com.yandex.passport.api.impl.b) iVar.e(bundle);
        c cVar = c.o;
        String c = cVar.c(bundle);
        b bVar2 = new b(iVar, bVar);
        k6 k6Var = new k6(cVar, c);
        this.c = bVar2;
        this.d = k6Var;
        this.e = u75.h(bVar2, k6Var);
        this.f = d6.d;
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final List a() {
        return this.e;
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final f b() {
        return this.f;
    }
}
