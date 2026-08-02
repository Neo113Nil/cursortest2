package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes9.dex */
public final class K implements Provider {
    public final /* synthetic */ Context a;
    public final /* synthetic */ M b;

    public K(M m, Context context) {
        this.b = m;
        this.a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.b.a.a(this.a);
    }
}
