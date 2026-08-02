package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class setTranslationY implements getCornerRadius.get {
    private final getCornerRadius.initialize ThreeDS2Service;
    private final getCornerRadius ThreeDS2ServiceInstance;

    public setTranslationY(getCornerRadius getcornerradius, getCornerRadius.initialize initializeVar) {
        this.ThreeDS2ServiceInstance = getcornerradius;
        this.ThreeDS2Service = initializeVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return getCornerRadius.getSDKInfo(this.ThreeDS2ServiceInstance, this.ThreeDS2Service);
    }
}
