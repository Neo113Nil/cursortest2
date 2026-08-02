package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes9.dex */
public final class Y4 {
    public Long a;
    public final SystemTimeProvider b;

    public Y4() {
        this(new SystemTimeProvider());
    }

    public final void a() {
        this.a = Long.valueOf(this.b.elapsedRealtime());
    }

    public Y4(SystemTimeProvider systemTimeProvider) {
        this.b = systemTimeProvider;
    }
}
