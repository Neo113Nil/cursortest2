package io.appmetrica.analytics.egress.impl;

import defpackage.b6e;
import defpackage.phn;
import defpackage.pvw;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k {
    public final ServiceContext a;
    public final i b = new i();
    public final ApplicationStateProvider c;
    public a d;
    public h e;

    public k(ServiceContext serviceContext) {
        this.a = serviceContext;
        this.c = serviceContext.getApplicationStateProvider();
    }

    public final boolean a() {
        a aVar = this.d;
        if (aVar == null) {
            return false;
        }
        ApplicationState currentState = this.c.getCurrentState();
        if (aVar.a && aVar.b.length() > 0) {
            int i = j.a[currentState.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    b6e.s();
                    return false;
                }
                if (aVar.e) {
                }
            }
            return true;
        }
        return false;
    }

    public final synchronized void b(a aVar) {
        a aVar2;
        try {
            if (!Intrinsics.d(aVar, this.d)) {
                this.d = aVar;
                h hVar = this.e;
                if (hVar != null) {
                    hVar.d = true;
                    ICommonExecutor iCommonExecutor = hVar.a;
                    f fVar = hVar.c;
                    if (fVar == null) {
                        Intrinsics.j("periodicRunnable");
                        throw null;
                    }
                    iCommonExecutor.remove(fVar);
                }
                this.e = null;
                if (a() && this.e == null && (aVar2 = this.d) != null) {
                    i iVar = this.b;
                    ServiceContext serviceContext = this.a;
                    this.e = new h(aVar2, iVar.a, phn.a, serviceContext.getExecutorProvider().getSupportIOExecutor(), new m(serviceContext.getNetworkContext().getSslSocketFactoryProvider(), new l(aVar2, serviceContext.getSelfReporter()), aVar2), new n(serviceContext));
                }
            }
        } finally {
        }
    }

    public static final void a(k kVar, ApplicationState applicationState) {
        kVar.b();
    }

    public final synchronized void a(a aVar) {
        this.d = aVar;
        this.c.registerStickyObserver(new pvw(0, this));
        b();
    }

    public final synchronized void b() {
        a aVar;
        try {
            boolean z = this.e != null;
            if (a() == z) {
                return;
            }
            h hVar = this.e;
            if (!z) {
                if (hVar == null && (aVar = this.d) != null) {
                    i iVar = this.b;
                    ServiceContext serviceContext = this.a;
                    this.e = new h(aVar, iVar.a, phn.a, serviceContext.getExecutorProvider().getSupportIOExecutor(), new m(serviceContext.getNetworkContext().getSslSocketFactoryProvider(), new l(aVar, serviceContext.getSelfReporter()), aVar), new n(serviceContext));
                }
                return;
            }
            if (hVar != null) {
                hVar.d = true;
                ICommonExecutor iCommonExecutor = hVar.a;
                f fVar = hVar.c;
                if (fVar == null) {
                    Intrinsics.j("periodicRunnable");
                    throw null;
                }
                iCommonExecutor.remove(fVar);
            }
            this.e = null;
        } finally {
        }
    }
}
