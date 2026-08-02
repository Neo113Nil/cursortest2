package io.appmetrica.analytics.egress.impl;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;

/* loaded from: classes4.dex */
public final class m implements IExecutionPolicy {
    public final ServiceContext a;
    public final String b = "[EgressRestrictionPolicy]";

    public m(ServiceContext serviceContext) {
        this.a = serviceContext;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        return !this.a.getDataSendingRestrictionController().isRestrictedForSdk() && this.a.getNetworkContext().getExecutionPolicy().canBeExecuted();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final String description() {
        return this.b;
    }
}
