package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.mn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0470mn {
    public final SystemTimeProvider a;
    public final long b;

    public C0470mn() {
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        this.a = systemTimeProvider;
        this.b = systemTimeProvider.currentTimeMillis();
    }
}
