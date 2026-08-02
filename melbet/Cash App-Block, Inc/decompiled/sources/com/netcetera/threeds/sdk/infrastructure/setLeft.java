package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class setLeft implements getCornerRadius.get {
    private final getCornerRadius ThreeDS2ServiceInstance;
    private final getCornerRadius.initialize get;

    public setLeft(getCornerRadius getcornerradius, getCornerRadius.initialize initializeVar) {
        this.ThreeDS2ServiceInstance = getcornerradius;
        this.get = initializeVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return (ButtonCustomization) getCornerRadius.ThreeDS2Service(new Object[]{this.ThreeDS2ServiceInstance, this.get}, -1730495776, 1730495786, (int) System.currentTimeMillis());
    }
}
