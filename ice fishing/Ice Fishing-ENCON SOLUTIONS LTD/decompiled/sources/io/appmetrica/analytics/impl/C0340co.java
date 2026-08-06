package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.network.UserAgent;

/* renamed from: io.appmetrica.analytics.impl.co, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0340co {

    /* renamed from: a, reason: collision with root package name */
    public final String f5770a = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "8.0.0", "50147728");

    public final String a() {
        return this.f5770a;
    }
}
