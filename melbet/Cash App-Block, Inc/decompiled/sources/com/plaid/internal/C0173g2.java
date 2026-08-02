package com.plaid.internal;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.plaid.internal.g2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0173g2 implements Factory {
    public final C0101b2 a;
    public final Provider b;

    public C0173g2(I1 i1, C0101b2 c0101b2, Provider provider) {
        this.a = c0101b2;
        this.b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        O7 o7 = (O7) this.a.get();
        L7 l7 = (L7) this.b.get();
        o7.getClass();
        l7.getClass();
        return o7;
    }
}
