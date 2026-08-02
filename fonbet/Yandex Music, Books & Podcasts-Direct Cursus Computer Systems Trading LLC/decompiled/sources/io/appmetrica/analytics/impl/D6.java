package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes5.dex */
public final class D6 extends BaseRequestConfig.DataSource {

    @NonNull
    public final C0385jp a;

    @NonNull
    public final SdkEnvironmentProvider b;

    public D6(@NonNull C0385jp c0385jp, @NonNull SdkEnvironmentProvider sdkEnvironmentProvider, @NonNull PlatformIdentifiers platformIdentifiers, Object obj) {
        super(new SdkIdentifiers(c0385jp.c(), c0385jp.a(), c0385jp.b()), sdkEnvironmentProvider, platformIdentifiers, obj);
        this.a = c0385jp;
        this.b = sdkEnvironmentProvider;
    }
}
