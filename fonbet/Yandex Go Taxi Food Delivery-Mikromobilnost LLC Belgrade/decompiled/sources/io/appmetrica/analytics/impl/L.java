package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes9.dex */
public final class L implements Provider {
    public final /* synthetic */ Context a;
    public final /* synthetic */ InterfaceC0918zl b;
    public final /* synthetic */ M c;

    public L(M m, Context context, InterfaceC0918zl interfaceC0918zl) {
        this.c = m;
        this.a = context;
        this.b = interfaceC0918zl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.c.a.a(this.a, this.b);
    }
}
