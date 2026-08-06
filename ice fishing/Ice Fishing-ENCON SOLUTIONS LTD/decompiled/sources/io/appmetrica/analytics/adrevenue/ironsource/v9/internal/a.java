package io.appmetrica.analytics.adrevenue.ironsource.v9.internal;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class a implements AdRevenueCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IronSourceV9ClientModuleEntryPoint f3531a;

    public a(IronSourceV9ClientModuleEntryPoint ironSourceV9ClientModuleEntryPoint) {
        this.f3531a = ironSourceV9ClientModuleEntryPoint;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector
    public final boolean getEnabled() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.f3531a.f3530b;
        return atomicBoolean.get();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector
    public final String getSourceIdentifier() {
        return "ironsource";
    }
}
