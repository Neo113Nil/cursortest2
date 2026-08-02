package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class setOnContextClickListener implements getCornerRadius.get {
    private final getCornerRadius ThreeDS2ServiceInstance;
    private final getCornerRadius.initialize initialize;

    public setOnContextClickListener(getCornerRadius getcornerradius, getCornerRadius.initialize initializeVar) {
        this.ThreeDS2ServiceInstance = getcornerradius;
        this.initialize = initializeVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return getCornerRadius.ThreeDS2ServiceInitializationCallback(this.ThreeDS2ServiceInstance, this.initialize);
    }
}
