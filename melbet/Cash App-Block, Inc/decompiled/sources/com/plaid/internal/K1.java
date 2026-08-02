package com.plaid.internal;

import android.app.Application;
import dagger.internal.Factory;
import java.io.File;

/* loaded from: classes5.dex */
public final class K1 implements Factory {
    public final Factory a;

    public K1(I1 i1, Factory factory) {
        this.a = factory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.a.get();
        application.getClass();
        File cacheDir = application.getCacheDir();
        cacheDir.getClass();
        return new C0194i5(cacheDir, "plaid-sdk/images");
    }
}
