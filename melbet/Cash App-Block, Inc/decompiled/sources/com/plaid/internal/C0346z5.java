package com.plaid.internal;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.plaid.internal.z5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0346z5 implements Factory {
    public final C0266q5 a;
    public final Provider b;

    public C0346z5(C0266q5 c0266q5, Provider provider) {
        this.a = c0266q5;
        this.b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C0266q5 c0266q5 = this.a;
        H5 h5 = (H5) this.b.get();
        c0266q5.getClass();
        h5.getClass();
        return new W4(h5);
    }
}
