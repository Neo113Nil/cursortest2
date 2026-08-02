package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;

/* loaded from: classes5.dex */
public class setCompoundDrawablesRelativeWithIntrinsicBounds implements setScrollCaptureHint.ThreeDS2ServiceInstance {
    private final com.netcetera.threeds.sdk.api.ThreeDS2Service initialize;

    public setCompoundDrawablesRelativeWithIntrinsicBounds(com.netcetera.threeds.sdk.api.ThreeDS2Service threeDS2Service) {
        this.initialize = threeDS2Service;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2ServiceInstance
    public Object initialize() {
        return this.initialize.getWarnings();
    }
}
