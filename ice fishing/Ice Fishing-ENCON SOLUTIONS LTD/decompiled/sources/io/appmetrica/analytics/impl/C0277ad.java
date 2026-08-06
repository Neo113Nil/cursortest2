package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;

/* renamed from: io.appmetrica.analytics.impl.ad, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0277ad implements ModuleServiceLifecycleController {

    /* renamed from: a, reason: collision with root package name */
    public final J1 f5565a;

    public C0277ad(J1 j12) {
        this.f5565a = j12;
    }

    public static final void a(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onFirstClientConnected();
    }

    public static final void b(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onAllClientsDisconnected();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController
    public final void registerObserver(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        this.f5565a.b(new Wo(0, moduleServiceLifecycleObserver));
        this.f5565a.a(new Wo(1, moduleServiceLifecycleObserver));
    }
}
