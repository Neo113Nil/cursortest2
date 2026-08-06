package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;

/* loaded from: classes.dex */
public abstract class e implements ModuleAdRevenueProcessor {

    /* renamed from: a, reason: collision with root package name */
    protected final b f3514a;

    /* renamed from: b, reason: collision with root package name */
    public final ClientContext f3515b;

    public e(b bVar, ClientContext clientContext) {
        this.f3514a = bVar;
        this.f3515b = clientContext;
    }

    public final void a(ModuleAdRevenue moduleAdRevenue) {
        this.f3515b.getInternalClientModuleFacade().reportAdRevenue(moduleAdRevenue);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from AdMob was reported", new Object[0]);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final String getDescription() {
        return "AdMob";
    }
}
