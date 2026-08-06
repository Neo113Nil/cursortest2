package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* renamed from: io.appmetrica.analytics.screenshot.impl.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0955v implements T {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f7677a;

    /* renamed from: b, reason: collision with root package name */
    public final U f7678b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C0945k f7679c;

    /* renamed from: d, reason: collision with root package name */
    public final Z f7680d;

    public C0955v(ClientContext clientContext, U u2) {
        this.f7677a = clientContext;
        this.f7678b = u2;
        this.f7680d = new Z(clientContext, new C0952s(this));
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(C0947m c0947m) {
        this.f7679c = c0947m != null ? c0947m.f7666c : null;
        this.f7680d.f7627c = this.f7679c;
    }

    public final String b() {
        return "ContentObserverScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.f7677a.getActivityLifecycleRegistry().registerListener(new C0954u(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}
