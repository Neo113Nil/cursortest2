package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes.dex */
public final class M implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f4721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Gi f4722b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f4723c;

    public M(N n2, Context context, Gi gi) {
        this.f4723c = n2;
        this.f4721a = context;
        this.f4722b = gi;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return this.f4723c.f4789a.a(this.f4721a, this.f4722b);
    }
}
