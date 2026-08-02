package com.plaid.internal;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.plaid.internal.u5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0301u5 implements Factory {
    public final C0266q5 a;
    public final Provider b;

    public C0301u5(C0266q5 c0266q5, Provider provider) {
        this.a = c0266q5;
        this.b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C0266q5 c0266q5 = this.a;
        AbstractC0145d1 abstractC0145d1 = (AbstractC0145d1) this.b.get();
        c0266q5.getClass();
        abstractC0145d1.getClass();
        return new C0100b1(abstractC0145d1);
    }
}
