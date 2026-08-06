package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;

/* loaded from: classes.dex */
public final class K5 implements J5 {

    /* renamed from: a, reason: collision with root package name */
    public final C0476i5 f4625a;

    public K5(C0476i5 c0476i5) {
        this.f4625a = c0476i5;
    }

    @Override // io.appmetrica.analytics.impl.J5, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final C0476i5 getAdRevenueProcessorsHolder() {
        return this.f4625a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final ModuleAdRevenueProcessorsHolder getAdRevenueProcessorsHolder() {
        return this.f4625a;
    }
}
