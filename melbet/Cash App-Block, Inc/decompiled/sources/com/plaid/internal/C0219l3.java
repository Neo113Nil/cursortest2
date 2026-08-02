package com.plaid.internal;

import android.app.Application;
import dagger.internal.Factory;

/* renamed from: com.plaid.internal.l3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0219l3 implements Factory {
    public final Factory a;

    public C0219l3(C0147d3 c0147d3, Factory factory) {
        this.a = factory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.a.get();
        application.getClass();
        String a = N4.a.a(application);
        return a == null ? "" : a;
    }
}
