package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.mk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0594mk {

    /* renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f6533a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6534b;

    public C0594mk() {
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        this.f6533a = systemTimeProvider;
        this.f6534b = systemTimeProvider.currentTimeMillis();
    }
}
