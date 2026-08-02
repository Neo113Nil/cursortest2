package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class p4 extends v5 {
    public final b c;
    public final b d;
    public final List e;
    public final x f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(Bundle bundle) {
        super(w5.H0);
        bundle.getClass();
        i iVar = i.j;
        com.yandex.passport.api.impl.b bVar = (com.yandex.passport.api.impl.b) iVar.e(bundle);
        c cVar = c.m;
        String c = cVar.c(bundle);
        b bVar2 = new b(iVar, bVar);
        b bVar3 = new b(cVar, c);
        this.c = bVar2;
        this.d = bVar3;
        this.e = u75.h(bVar2, bVar3);
        this.f = x.d;
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
