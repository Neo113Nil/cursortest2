package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;

/* loaded from: classes5.dex */
public class ex implements setScrollCaptureHint.ThreeDS2ServiceInstance {
    private final com.netcetera.threeds.sdk.api.transaction.Transaction initialize;

    public ex(com.netcetera.threeds.sdk.api.transaction.Transaction transaction) {
        this.initialize = transaction;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2ServiceInstance
    public Object initialize() {
        return this.initialize.getAuthenticationRequestParameters();
    }
}
