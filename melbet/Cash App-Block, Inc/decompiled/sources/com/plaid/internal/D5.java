package com.plaid.internal;

import android.app.Application;
import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class D5 implements Factory {
    public final Factory a;

    public D5(C0266q5 c0266q5, Factory factory) {
        this.a = factory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.a.get();
        application.getClass();
        return new I5(application);
    }
}
