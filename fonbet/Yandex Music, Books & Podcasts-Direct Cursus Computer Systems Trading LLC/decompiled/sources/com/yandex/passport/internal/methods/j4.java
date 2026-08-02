package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class j4 extends v5 {
    public final b c;
    public final k6 d;
    public final List e;
    public final f6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(Bundle bundle) {
        super(w5.N0);
        bundle.getClass();
        i iVar = i.j;
        com.yandex.passport.api.impl.b bVar = (com.yandex.passport.api.impl.b) iVar.e(bundle);
        m mVar = m.k;
        mVar.getClass();
        String string = bundle.getString(mVar.b, null);
        b bVar2 = new b(iVar, bVar);
        k6 k6Var = new k6(mVar, string);
        this.c = bVar2;
        this.d = k6Var;
        this.e = u75.h(bVar2, k6Var);
        this.f = f6.d;
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
