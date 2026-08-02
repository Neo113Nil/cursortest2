package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext;

/* loaded from: classes9.dex */
public final class Nn implements ServiceModuleReporterComponentContext {
    public final C0660qn a;
    public final C0631pn b;

    public Nn(S5 s5, C0439j5 c0439j5) {
        this.a = new C0660qn(s5, null, 2, null);
        this.b = new C0631pn(c0439j5);
    }

    public final C0631pn a() {
        return this.b;
    }

    public final C0660qn b() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleConfig getConfig() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleReporter getReporter() {
        return this.a;
    }
}
