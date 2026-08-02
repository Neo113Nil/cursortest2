package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class z4 extends v5 {
    public final b c;
    public final List d;
    public final j6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(Bundle bundle, String str) {
        super(w5.F);
        str.getClass();
        bundle.getClass();
        u uVar = new u(c.h, str);
        b bVar = new b(e6.f, bundle);
        this.c = bVar;
        this.d = u75.h(uVar, bVar);
        this.e = j6.d;
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
