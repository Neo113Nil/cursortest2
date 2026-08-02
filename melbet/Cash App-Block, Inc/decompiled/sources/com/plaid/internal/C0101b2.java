package com.plaid.internal;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.plaid.internal.b2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0101b2 implements Factory {
    public final I1 a;
    public final Provider b;

    public C0101b2(I1 i1, Provider provider) {
        this.a = i1;
        this.b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I1 i1 = this.a;
        T3 t3 = (T3) this.b.get();
        i1.getClass();
        t3.getClass();
        return new O7(t3);
    }
}
