package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes.dex */
public final class L implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f4657b;

    public L(N n2, Context context) {
        this.f4657b = n2;
        this.f4656a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f4657b.f4789a.a(this.f4656a);
    }
}
