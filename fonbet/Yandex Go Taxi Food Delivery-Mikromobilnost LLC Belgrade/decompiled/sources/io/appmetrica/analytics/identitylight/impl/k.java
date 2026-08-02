package io.appmetrica.analytics.identitylight.impl;

import defpackage.jl40;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.identitylight.internal.IdentityLightModuleEntryPoint;
import io.appmetrica.analytics.identitylight.internal.config.IdentityLightConfig;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;

/* loaded from: classes9.dex */
public final class k {
    public IdentityLightConfig a;
    public final long b = 10000;
    public final IHandlerExecutor c;
    public final SystemTimeProvider d;
    public final long e;
    public final l f;
    public j g;

    public k(ServiceContext serviceContext, IdentityLightConfig identityLightConfig) {
        this.a = identityLightConfig;
        this.c = serviceContext.getExecutorProvider().getModuleExecutor();
        ModulePreferences modulePreferences = serviceContext.getServiceStorageProvider().modulePreferences(IdentityLightModuleEntryPoint.ID);
        this.d = new SystemTimeProvider();
        this.e = modulePreferences.getLong("last_send_time", 0L);
        this.f = new l(serviceContext);
        synchronized (this) {
            a(this.a);
        }
    }

    public final void a(IdentityLightConfig identityLightConfig) {
        if (identityLightConfig == null || !identityLightConfig.getCom.yandex.messaging.core.net.entities.BackendConfig.Restrictions.ENABLED java.lang.String()) {
            j jVar = this.g;
            if (jVar != null) {
                this.c.remove(jVar);
                this.g = null;
                return;
            }
            return;
        }
        j jVar2 = this.g;
        if (jVar2 != null) {
            this.c.remove(jVar2);
            this.g = null;
        }
        j jVar3 = new j(this, identityLightConfig);
        this.c.executeDelayed(jVar3, Math.max(identityLightConfig.getMinInterval() - (this.d.currentTimeMillis() - this.e), this.b));
        this.g = jVar3;
    }

    public final synchronized void b(IdentityLightConfig identityLightConfig) {
        if (!jl40.l(this.a, identityLightConfig)) {
            this.a = identityLightConfig;
            a(identityLightConfig);
        }
    }
}
