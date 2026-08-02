package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setShadowLayer;

/* loaded from: classes5.dex */
class as implements setShadowLayer.initialize {
    private final at ThreeDS2Service;
    private final String initialize;

    public as(at atVar, String str) {
        this.ThreeDS2Service = atVar;
        this.initialize = str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setShadowLayer.initialize
    public void ThreeDS2ServiceInstance() {
        at.ThreeDS2ServiceInstance(this.ThreeDS2Service, this.initialize);
    }
}
