package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.hd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0458hd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0613nd f6142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f6143b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f6144c;

    public C0458hd(C0613nd c0613nd, AdRevenue adRevenue, boolean z2) {
        this.f6142a = c0613nd;
        this.f6143b = adRevenue;
        this.f6144c = z2;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0613nd.a(this.f6142a).reportAdRevenue(this.f6143b, this.f6144c);
    }
}
