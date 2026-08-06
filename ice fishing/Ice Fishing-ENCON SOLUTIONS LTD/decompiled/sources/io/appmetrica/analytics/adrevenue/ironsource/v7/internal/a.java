package io.appmetrica.analytics.adrevenue.ironsource.v7.internal;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class a implements AdRevenueCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IronSourceClientModuleEntryPoint f3526a;

    public a(IronSourceClientModuleEntryPoint ironSourceClientModuleEntryPoint) {
        this.f3526a = ironSourceClientModuleEntryPoint;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector
    public final boolean getEnabled() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.f3526a.f3525b;
        return atomicBoolean.get();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector
    public final String getSourceIdentifier() {
        return "ironsource";
    }
}
