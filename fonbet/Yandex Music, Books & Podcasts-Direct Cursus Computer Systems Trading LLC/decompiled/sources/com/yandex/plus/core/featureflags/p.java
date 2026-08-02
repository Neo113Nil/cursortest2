package com.yandex.plus.core.featureflags;

/* loaded from: classes4.dex */
public final class p implements q, t {
    public final s a;
    public final String b;

    public p(s sVar, String str) {
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
        return this.a.a(this.b);
    }
}
