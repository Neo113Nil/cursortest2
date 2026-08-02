package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class w3 extends v5 {
    public final b c;
    public final List d;
    public final n e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(Bundle bundle) {
        super(w5.p);
        bundle.getClass();
        i iVar = i.h;
        b bVar = new b(iVar, (com.yandex.passport.internal.entities.h) iVar.e(bundle));
        this.c = bVar;
        this.d = t75.c(bVar);
        this.e = n.d;
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
