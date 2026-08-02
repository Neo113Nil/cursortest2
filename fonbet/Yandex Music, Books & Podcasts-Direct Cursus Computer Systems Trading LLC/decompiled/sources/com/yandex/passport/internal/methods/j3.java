package com.yandex.passport.internal.methods;

import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class j3 extends v5 {
    public final b c;
    public final List d;
    public final i e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(boolean z) {
        super(w5.H);
        b bVar = new b(a.f, Boolean.valueOf(z));
        this.c = bVar;
        this.d = t75.c(bVar);
        this.e = i.m;
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
