package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;

/* renamed from: io.appmetrica.analytics.impl.pi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0670pi implements IExecutionPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final DataSendingRestrictionController f6749a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6750b = "data restriction based";

    public C0670pi(DataSendingRestrictionController dataSendingRestrictionController) {
        this.f6749a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        return !this.f6749a.isRestrictedForSdk();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final String description() {
        return this.f6750b;
    }
}
