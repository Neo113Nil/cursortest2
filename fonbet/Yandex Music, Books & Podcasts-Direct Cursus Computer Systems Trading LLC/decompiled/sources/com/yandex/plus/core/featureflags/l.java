package com.yandex.plus.core.featureflags;

/* loaded from: classes4.dex */
public final class l implements q, t {
    public final s a;
    public final String b;

    public l(s sVar, String str) {
        sVar.getClass();
        this.a = sVar;
        this.b = str;
    }

    @Override // com.yandex.plus.core.featureflags.q
    public final String getKey() {
        return this.b;
    }

    @Override // com.yandex.plus.core.featureflags.t
    public final Object read() {
        return this.a.c(this.b);
    }
}
