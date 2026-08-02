package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class c0 extends v5 {
    public final b c;
    public final b d;
    public final List e;
    public final d6 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Bundle bundle) {
        super(w5.r);
        bundle.getClass();
        n nVar = n.d;
        com.yandex.passport.internal.entities.f fVar = (com.yandex.passport.internal.entities.f) nVar.e(bundle);
        o oVar = o.d;
        com.yandex.passport.internal.credentials.e eVar = (com.yandex.passport.internal.credentials.e) oVar.e(bundle);
        b bVar = new b(nVar, fVar);
        b bVar2 = new b(oVar, eVar);
        this.c = bVar;
        this.d = bVar2;
        this.e = u75.h(bVar, bVar2);
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
