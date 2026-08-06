package io.appmetrica.analytics.coreutils.internal.services;

import R1.d;
import h1.C0237g;
import h1.InterfaceC0233c;
import io.appmetrica.analytics.coreutils.impl.l;

/* loaded from: classes.dex */
public final class UtilityServiceProvider {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0233c f3865a = d.y(new l(this));

    /* renamed from: b, reason: collision with root package name */
    private final WaitForActivationDelayBarrier f3866b = new WaitForActivationDelayBarrier();

    public final WaitForActivationDelayBarrier getActivationBarrier() {
        return this.f3866b;
    }

    public final FirstExecutionConditionServiceImpl getFirstExecutionService() {
        return (FirstExecutionConditionServiceImpl) ((C0237g) this.f3865a).a();
    }

    public final void initAsync() {
        this.f3866b.activate();
    }

    public final void updateConfiguration(UtilityServiceConfiguration utilityServiceConfiguration) {
        getFirstExecutionService().updateConfig(utilityServiceConfiguration);
    }
}
