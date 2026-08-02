package com.yandex.passport.internal.usecase.ui;

/* loaded from: classes4.dex */
public final class g extends com.yandex.passport.common.domain.e {
    public long e;
    public com.yandex.passport.common.domain.b f;
    public int g;

    @Override // com.yandex.passport.common.domain.e
    public final boolean A(Throwable th) {
        return !(th instanceof com.yandex.passport.common.exception.a);
    }

    @Override // com.yandex.passport.common.domain.e
    public final long w() {
        return this.e;
    }

    @Override // com.yandex.passport.common.domain.e
    public final int x() {
        return this.g;
    }

    @Override // com.yandex.passport.common.domain.e
    public final com.yandex.passport.common.domain.b y() {
        return this.f;
    }
}
