package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class d0 extends v5 {
    public final b c;
    public final List d;
    public final d6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Bundle bundle) {
        super(w5.s);
        bundle.getClass();
        i iVar = i.h;
        b bVar = new b(iVar, (com.yandex.passport.internal.entities.h) iVar.e(bundle));
        this.c = bVar;
        this.d = t75.c(bVar);
        this.e = d6.d;
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
