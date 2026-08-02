package io.appmetrica.analytics.impl;

import android.content.Intent;
import defpackage.w2d;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Ge implements ModuleServiceLifecycleController {
    public final C0536p2 a;

    public Ge(@NotNull C0536p2 c0536p2) {
        this.a = c0536p2;
    }

    public static final void a(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onFirstClientConnected();
    }

    public static final void b(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onAllClientsDisconnected();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController
    public final void registerObserver(@NotNull ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        this.a.b(new w2d(0, moduleServiceLifecycleObserver));
        this.a.a(new w2d(1, moduleServiceLifecycleObserver));
    }
}
