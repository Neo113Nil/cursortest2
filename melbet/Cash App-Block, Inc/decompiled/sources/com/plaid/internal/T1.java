package com.plaid.internal;

import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class T1 implements Factory {
    public final Z1 a;

    public T1(I1 i1, Z1 z1) {
        this.a = z1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        E7 e7 = (E7) this.a.get();
        e7.getClass();
        return e7;
    }
}
