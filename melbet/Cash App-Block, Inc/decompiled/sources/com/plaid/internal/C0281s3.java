package com.plaid.internal;

import dagger.internal.Factory;

/* renamed from: com.plaid.internal.s3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0281s3 implements Factory {
    public final C0192i3 a;

    public C0281s3(C0147d3 c0147d3, C0192i3 c0192i3) {
        this.a = c0192i3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C0273r4 c0273r4 = (C0273r4) this.a.get();
        c0273r4.getClass();
        return c0273r4;
    }
}
