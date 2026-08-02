package com.plaid.internal;

import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class B3 implements Factory {
    public final C0272r3 a;
    public final C0174g3 b;

    public B3(C0272r3 c0272r3, C0174g3 c0174g3) {
        this.a = c0272r3;
        this.b = c0174g3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C0326x3((i8) this.a.get(), (A3) this.b.get());
    }
}
