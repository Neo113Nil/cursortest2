package com.plaid.internal;

import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class H2 implements Factory {

    public static final class a {
        public static final H2 a = new H2();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new G2();
    }
}
