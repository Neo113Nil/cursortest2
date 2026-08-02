package io.appmetrica.analytics.egress.impl;

import defpackage.jl40;
import defpackage.w511;
import defpackage.wh71;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.egress.internal.config.EgressConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import kotlin.random.Random;

/* loaded from: classes9.dex */
public final class j {
    public final ServiceContext a;
    public final h b = new h();
    public final ApplicationStateProvider c;
    public EgressConfig d;
    public g e;

    public j(ServiceContext serviceContext) {
        this.a = serviceContext;
        this.c = serviceContext.getApplicationStateProvider();
    }

    public final boolean a() {
        EgressConfig egressConfig = this.d;
        if (egressConfig == null) {
            return false;
        }
        ApplicationState currentState = this.c.getCurrentState();
        if (egressConfig.getEnabled() && egressConfig.getUrl().length() > 0) {
            int i = i.a[currentState.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    w511.b();
                    return false;
                }
                if (egressConfig.isBackgroundAllowed()) {
                }
            }
            return true;
        }
        return false;
    }

    public final synchronized void b(EgressConfig egressConfig) {
        EgressConfig egressConfig2;
        try {
            if (!jl40.l(egressConfig, this.d)) {
                this.d = egressConfig;
                g gVar = this.e;
                if (gVar != null) {
                    gVar.d = true;
                    ICommonExecutor iCommonExecutor = gVar.a;
                    e eVar = gVar.c;
                    if (eVar == null) {
                        eVar = null;
                    }
                    iCommonExecutor.remove(eVar);
                }
                this.e = null;
                if (a() && this.e == null && (egressConfig2 = this.d) != null) {
                    h hVar = this.b;
                    ServiceContext serviceContext = this.a;
                    this.e = new g(egressConfig2, hVar.a, Random.a, serviceContext.getExecutorProvider().getSupportIOExecutor(), new l(serviceContext.getNetworkContext().getSslSocketFactoryProvider(), new k(egressConfig2, serviceContext.getSelfReporter()), egressConfig2), new m(serviceContext));
                }
            }
        } finally {
        }
    }

    public static final void a(j jVar, ApplicationState applicationState) {
        jVar.b();
    }

    public final synchronized void a(EgressConfig egressConfig) {
        this.d = egressConfig;
        this.c.registerStickyObserver(new wh71(0, this));
        b();
    }

    public final synchronized void b() {
        EgressConfig egressConfig;
        try {
            boolean z = this.e != null;
            if (a() == z) {
                return;
            }
            g gVar = this.e;
            if (!z) {
                if (gVar == null && (egressConfig = this.d) != null) {
                    h hVar = this.b;
                    ServiceContext serviceContext = this.a;
                    this.e = new g(egressConfig, hVar.a, Random.a, serviceContext.getExecutorProvider().getSupportIOExecutor(), new l(serviceContext.getNetworkContext().getSslSocketFactoryProvider(), new k(egressConfig, serviceContext.getSelfReporter()), egressConfig), new m(serviceContext));
                }
                return;
            }
            if (gVar != null) {
                gVar.d = true;
                ICommonExecutor iCommonExecutor = gVar.a;
                e eVar = gVar.c;
                if (eVar == null) {
                    eVar = null;
                }
                iCommonExecutor.remove(eVar);
            }
            this.e = null;
        } finally {
        }
    }
}
