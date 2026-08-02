package com.squareup.cash.family.familyhub.backend.real;

import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes6.dex */
public final class RealDependentCustomerTokenRepository {
    public final StateFlowImpl _customerTokenFlow = FlowKt.MutableStateFlow(null);

    public final String getCustomerToken() {
        return (String) this._customerTokenFlow.getValue();
    }
}
