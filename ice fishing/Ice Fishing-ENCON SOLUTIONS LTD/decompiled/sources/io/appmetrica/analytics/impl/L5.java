package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes.dex */
public final class L5 extends BaseRequestConfig.DataSource {

    /* renamed from: a, reason: collision with root package name */
    public final C0415fm f4671a;

    /* renamed from: b, reason: collision with root package name */
    public final SdkEnvironmentProvider f4672b;

    public L5(C0415fm c0415fm, SdkEnvironmentProvider sdkEnvironmentProvider, PlatformIdentifiers platformIdentifiers, Object obj) {
        super(new SdkIdentifiers(c0415fm.c(), c0415fm.a(), c0415fm.b()), sdkEnvironmentProvider, platformIdentifiers, obj);
        this.f4671a = c0415fm;
        this.f4672b = sdkEnvironmentProvider;
    }
}
