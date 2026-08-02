package com.plaid.internal;

import android.app.Application;
import android.content.res.Resources;
import dagger.internal.Factory;

/* renamed from: com.plaid.internal.p3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0255p3 implements Factory {
    public final Factory a;

    public C0255p3(C0147d3 c0147d3, Factory factory) {
        this.a = factory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.a.get();
        application.getClass();
        Resources resources = application.getResources();
        resources.getClass();
        return resources;
    }
}
