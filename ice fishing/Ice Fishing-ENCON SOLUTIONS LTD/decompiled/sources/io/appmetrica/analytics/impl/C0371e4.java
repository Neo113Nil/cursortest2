package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.e4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371e4 {

    /* renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f5863a;

    public C0371e4() {
        this(new SystemTimeProvider());
    }

    public final void a() {
        this.f5863a.elapsedRealtime();
    }

    public C0371e4(SystemTimeProvider systemTimeProvider) {
        this.f5863a = systemTimeProvider;
    }
}
