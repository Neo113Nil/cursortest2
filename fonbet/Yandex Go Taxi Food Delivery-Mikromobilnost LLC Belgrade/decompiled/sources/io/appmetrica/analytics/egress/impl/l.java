package io.appmetrica.analytics.egress.impl;

import io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider;
import io.appmetrica.analytics.egress.internal.config.EgressConfig;

/* loaded from: classes4.dex */
public final class l {
    public final SslSocketFactoryProvider a;
    public final k b;
    public final EgressConfig c;

    public l(SslSocketFactoryProvider sslSocketFactoryProvider, k kVar, EgressConfig egressConfig) {
        this.a = sslSocketFactoryProvider;
        this.b = kVar;
        this.c = egressConfig;
    }
}
