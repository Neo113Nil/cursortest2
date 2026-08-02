package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* renamed from: io.appmetrica.analytics.screenshot.impl.s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1113s implements B {
    public final ClientContext a;
    public final C b;
    public volatile C1105j c;
    public final G d;

    public C1113s(ClientContext clientContext, C c) {
        this.a = clientContext;
        this.b = c;
        this.d = new G(clientContext, new C1111p(this));
    }

    @Override // io.appmetrica.analytics.screenshot.impl.B
    public final void a() {
        this.a.getActivityLifecycleRegistry().registerListener(new r(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }

    public final String b() {
        return "ContentObserverScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.B
    public final void a(C1106k c1106k) {
        this.c = c1106k != null ? c1106k.d : null;
        this.d.c = this.c;
    }
}
