package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class a0 extends v5 {
    public final b c;
    public final b d;
    public final b e;
    public final List f;
    public final d6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Bundle bundle) {
        super(w5.w0);
        bundle.getClass();
        i iVar = i.j;
        com.yandex.passport.api.impl.b bVar = (com.yandex.passport.api.impl.b) iVar.e(bundle);
        c cVar = c.k;
        String c = cVar.c(bundle);
        d dVar = d.c;
        List d = dVar.d(bundle);
        b bVar2 = new b(iVar, bVar);
        b bVar3 = new b(cVar, c);
        b bVar4 = new b(dVar, d);
        this.c = bVar2;
        this.d = bVar3;
        this.e = bVar4;
        this.f = u75.h(bVar2, bVar3, bVar4);
        this.g = d6.d;
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
