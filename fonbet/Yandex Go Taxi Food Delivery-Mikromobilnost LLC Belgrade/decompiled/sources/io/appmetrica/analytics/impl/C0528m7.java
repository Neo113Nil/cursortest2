package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.m7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0528m7 implements InterfaceC0913zg {
    public final SystemTimeProvider a = new SystemTimeProvider();

    public final long a(W0 w0) {
        long j = w0.e;
        return j > 0 ? j : this.a.currentTimeMillis();
    }
}
