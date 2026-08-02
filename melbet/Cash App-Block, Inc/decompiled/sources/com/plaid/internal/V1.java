package com.plaid.internal;

import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class V1 implements Factory {
    public final C0101b2 a;

    public V1(I1 i1, C0101b2 c0101b2) {
        this.a = c0101b2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        O7 o7 = (O7) this.a.get();
        o7.getClass();
        return o7;
    }
}
