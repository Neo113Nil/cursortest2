package com.plaid.internal;

import android.app.Application;
import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class O5 implements Factory {
    public final Factory a;

    public O5(Factory factory) {
        this.a = factory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new N5((Application) this.a.get());
    }
}
