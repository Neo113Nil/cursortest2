package com.plaid.internal;

import android.app.Application;
import android.content.Context;
import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class Y1 implements Factory {
    public final Factory a;

    public Y1(I1 i1, Factory factory) {
        this.a = factory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.a.get();
        application.getClass();
        Context applicationContext = application.getApplicationContext();
        applicationContext.getClass();
        applicationContext.getClass();
        return new N(new L(applicationContext, new J()));
    }
}
