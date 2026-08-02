package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes9.dex */
public final class En {
    public final SystemTimeProvider a;
    public final long b;

    public En() {
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        this.a = systemTimeProvider;
        this.b = systemTimeProvider.currentTimeMillis();
    }
}
