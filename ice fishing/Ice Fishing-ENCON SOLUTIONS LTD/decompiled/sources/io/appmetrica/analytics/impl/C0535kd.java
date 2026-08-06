package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.kd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0535kd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0613nd f6372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6373b;

    public C0535kd(C0613nd c0613nd, boolean z2) {
        this.f6372a = c0613nd;
        this.f6373b = z2;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0613nd.a(this.f6372a).a(this.f6373b, false);
    }
}
