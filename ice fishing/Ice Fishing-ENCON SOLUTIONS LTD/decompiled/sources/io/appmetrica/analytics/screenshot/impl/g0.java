package io.appmetrica.analytics.screenshot.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;

/* loaded from: classes.dex */
public final class g0 implements T {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f7641a;

    /* renamed from: b, reason: collision with root package name */
    public final U f7642b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f7643c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f7644d;

    /* renamed from: e, reason: collision with root package name */
    public volatile C0948n f7645e;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f7646f = new d0(this);

    public g0(ClientContext clientContext, U u2) {
        this.f7641a = clientContext;
        this.f7642b = u2;
        this.f7643c = clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler();
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(C0947m c0947m) {
        this.f7645e = c0947m != null ? c0947m.f7665b : null;
    }

    public final String b() {
        return "ServiceScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        this.f7641a.getActivityLifecycleRegistry().registerListener(new f0(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }
}
