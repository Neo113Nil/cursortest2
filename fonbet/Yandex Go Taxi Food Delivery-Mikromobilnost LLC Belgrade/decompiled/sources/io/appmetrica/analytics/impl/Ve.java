package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.impl.Ve;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;

/* loaded from: classes9.dex */
public final class Ve implements ModuleServiceLifecycleController {
    public final C0610p2 a;

    public Ve(C0610p2 c0610p2) {
        this.a = c0610p2;
    }

    public static final void a(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onFirstClientConnected();
    }

    public static final void b(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onAllClientsDisconnected();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController
    public final void registerObserver(final ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        final int i = 0;
        this.a.b(new InterfaceC0581o2() { // from class: s431
            @Override // io.appmetrica.analytics.impl.InterfaceC0581o2
            public final void a(Intent intent) {
                int i2 = i;
                ModuleServiceLifecycleObserver moduleServiceLifecycleObserver2 = moduleServiceLifecycleObserver;
                switch (i2) {
                    case 0:
                        Ve.a(moduleServiceLifecycleObserver2, intent);
                        break;
                    default:
                        Ve.b(moduleServiceLifecycleObserver2, intent);
                        break;
                }
            }
        });
        final int i2 = 1;
        this.a.a(new InterfaceC0581o2() { // from class: s431
            @Override // io.appmetrica.analytics.impl.InterfaceC0581o2
            public final void a(Intent intent) {
                int i22 = i2;
                ModuleServiceLifecycleObserver moduleServiceLifecycleObserver2 = moduleServiceLifecycleObserver;
                switch (i22) {
                    case 0:
                        Ve.a(moduleServiceLifecycleObserver2, intent);
                        break;
                    default:
                        Ve.b(moduleServiceLifecycleObserver2, intent);
                        break;
                }
            }
        });
    }
}
