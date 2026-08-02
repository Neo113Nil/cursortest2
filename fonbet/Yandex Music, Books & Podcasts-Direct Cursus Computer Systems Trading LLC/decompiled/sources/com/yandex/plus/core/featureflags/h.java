package com.yandex.plus.core.featureflags;

/* loaded from: classes4.dex */
public final class h extends k implements g {
    public final t a;
    public final t b;
    public final t c;
    public final t d;
    public final Boolean e;

    public h(y yVar, l lVar, l lVar2, Boolean bool, int i) {
        yVar = (i & 1) != 0 ? null : yVar;
        lVar = (i & 4) != 0 ? null : lVar;
        lVar2 = (i & 8) != 0 ? null : lVar2;
        bool = (i & 16) != 0 ? null : bool;
        this.a = yVar;
        this.b = null;
        this.c = lVar;
        this.d = lVar2;
        this.e = bool;
    }

    @Override // com.yandex.plus.core.featureflags.k
    public final t a() {
        return this.d;
    }

    @Override // com.yandex.plus.core.featureflags.k
    public final Object b() {
        return this.e;
    }

    @Override // com.yandex.plus.core.featureflags.k
    public final t c() {
        return this.c;
    }

    @Override // com.yandex.plus.core.featureflags.k
    public final t d() {
        return this.a;
    }

    @Override // com.yandex.plus.core.featureflags.k
    public final t f() {
        return this.b;
    }
}
