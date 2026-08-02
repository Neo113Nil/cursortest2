package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class setKeepScreenOn implements getCornerRadius.get {
    private final getCornerRadius ThreeDS2ServiceInstance;

    public setKeepScreenOn(getCornerRadius getcornerradius) {
        this.ThreeDS2ServiceInstance = getcornerradius;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return (ButtonCustomization) getCornerRadius.ThreeDS2Service(new Object[]{this.ThreeDS2ServiceInstance}, 2028093512, -2028093507, (int) System.currentTimeMillis());
    }
}
