package com.yandex.passport.internal.methods;

import defpackage.t75;
import java.util.List;

/* loaded from: classes4.dex */
public final class e3 extends v5 {
    public final b c;
    public final List d;
    public final a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(String str) {
        super(w5.a1);
        b bVar = new b(m.j, str);
        this.c = bVar;
        this.d = t75.c(bVar);
        this.e = a.e;
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
