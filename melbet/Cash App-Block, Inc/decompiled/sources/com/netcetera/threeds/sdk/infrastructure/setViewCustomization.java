package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class setViewCustomization implements getCornerRadius.get {
    private final getCornerRadius.initialize ThreeDS2ServiceInstance;
    private final getCornerRadius get;

    public setViewCustomization(getCornerRadius getcornerradius, getCornerRadius.initialize initializeVar) {
        this.get = getcornerradius;
        this.ThreeDS2ServiceInstance = initializeVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return getCornerRadius.mastercardSchemeConfiguration(this.get, this.ThreeDS2ServiceInstance);
    }
}
