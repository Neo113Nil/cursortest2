package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider;

/* renamed from: io.appmetrica.analytics.impl.wa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0843wa implements HostRetryInfoProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Ze f7106a;

    /* renamed from: b, reason: collision with root package name */
    public final Td f7107b;

    public C0843wa(Ze ze, Td td) {
        this.f7106a = ze;
        this.f7107b = td;
    }

    public final Td a() {
        return this.f7107b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final long getLastAttemptTimeSeconds() {
        return this.f7106a.a(this.f7107b, 0L);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final int getNextSendAttemptNumber() {
        return this.f7106a.a(this.f7107b, 1);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveLastAttemptTimeSeconds(long j2) {
        this.f7106a.b(this.f7107b, j2).b();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveNextSendAttemptNumber(int i2) {
        this.f7106a.b(this.f7107b, i2).b();
    }
}
