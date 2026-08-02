package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;

/* renamed from: io.appmetrica.analytics.impl.mo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0545mo {
    public Long a;
    public int b;
    public final TimeProvider c;

    public C0545mo() {
        this(new SystemTimeProvider());
    }

    public C0545mo(SystemTimeProvider systemTimeProvider) {
        this.c = systemTimeProvider;
    }
}
