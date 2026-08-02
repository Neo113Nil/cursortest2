package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.network.UserAgent;

/* loaded from: classes9.dex */
public final class Ar {
    public final String a = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "8.2.0", BuildConfig.BUILD_NUMBER);

    public final String a() {
        return this.a;
    }
}
