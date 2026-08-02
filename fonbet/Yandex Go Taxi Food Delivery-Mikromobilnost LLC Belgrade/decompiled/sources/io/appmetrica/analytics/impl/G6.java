package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes9.dex */
public final class G6 extends BaseRequestConfig.DataSource {
    public final Bp a;
    public final SdkEnvironmentProvider b;

    public G6(Bp bp, SdkEnvironmentProvider sdkEnvironmentProvider, PlatformIdentifiers platformIdentifiers, Object obj) {
        super(new SdkIdentifiers(bp.c(), bp.a(), bp.b()), sdkEnvironmentProvider, platformIdentifiers, obj);
        this.a = bp;
        this.b = sdkEnvironmentProvider;
    }
}
