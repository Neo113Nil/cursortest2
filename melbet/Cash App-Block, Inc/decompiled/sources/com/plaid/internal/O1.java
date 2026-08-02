package com.plaid.internal;

import android.app.Application;
import dagger.internal.Factory;

/* loaded from: classes5.dex */
public final class O1 implements Factory {
    public final Factory a;
    public final W1 b;

    public O1(I1 i1, Factory factory, W1 w1) {
        this.a = factory;
        this.b = w1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.a.get();
        InterfaceC0178g7 interfaceC0178g7 = (InterfaceC0178g7) this.b.get();
        application.getClass();
        interfaceC0178g7.getClass();
        return new C0275r6(application.getApplicationContext(), interfaceC0178g7);
    }
}
