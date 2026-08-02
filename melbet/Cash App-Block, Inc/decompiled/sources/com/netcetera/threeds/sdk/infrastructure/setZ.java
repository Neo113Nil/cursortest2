package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class setZ implements getCornerRadius.get {
    private final getCornerRadius ThreeDS2ServiceInstance;
    private final getCornerRadius.initialize get;

    public setZ(getCornerRadius getcornerradius, getCornerRadius.initialize initializeVar) {
        this.ThreeDS2ServiceInstance = getcornerradius;
        this.get = initializeVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return getCornerRadius.cbConfiguration(this.ThreeDS2ServiceInstance, this.get);
    }
}
