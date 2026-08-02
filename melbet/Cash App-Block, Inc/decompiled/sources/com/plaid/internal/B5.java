package com.plaid.internal;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class B5 implements Factory {
    public final Provider a;

    public B5(C0266q5 c0266q5, Provider provider) {
        this.a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I5 i5 = (I5) this.a.get();
        i5.getClass();
        E5 a = E5.c.a(i5.a());
        Preconditions.checkNotNullFromProvides(a);
        return a;
    }
}
