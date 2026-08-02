package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.screenshot.impl.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0953v implements T {
    public final ClientContext a;
    public final U b;
    public volatile C0943k c;
    public final Z d;

    public C0953v(@NotNull ClientContext clientContext, @NotNull U u) {
        this.a = clientContext;
        this.b = u;
        this.d = new Z(clientContext, new C0950s(this));
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.a.getActivityLifecycleRegistry().registerListener(new C0952u(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }

    @NotNull
    public final String b() {
        return "ContentObserverScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(C0945m c0945m) {
        this.c = c0945m != null ? c0945m.c : null;
        this.d.c = this.c;
    }
}
