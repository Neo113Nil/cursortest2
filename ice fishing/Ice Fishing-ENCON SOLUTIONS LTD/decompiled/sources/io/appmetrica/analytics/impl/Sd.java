package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext;

/* loaded from: classes.dex */
public final class Sd implements ServiceNetworkContext {

    /* renamed from: a, reason: collision with root package name */
    public final C0398f5 f5055a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5056b = new C0340co().a();

    /* renamed from: c, reason: collision with root package name */
    public final C0750sl f5057c = new C0750sl();

    public Sd(Context context) {
        this.f5055a = new C0398f5(new C0657p5(context), new C0670pi(C0610na.k().h()));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final IExecutionPolicy getExecutionPolicy() {
        return this.f5055a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final SimpleNetworkApi getNetworkApi() {
        return this.f5057c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final SslSocketFactoryProvider getSslSocketFactoryProvider() {
        return C0610na.f6575I.z();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final String getUserAgent() {
        return this.f5056b;
    }
}
