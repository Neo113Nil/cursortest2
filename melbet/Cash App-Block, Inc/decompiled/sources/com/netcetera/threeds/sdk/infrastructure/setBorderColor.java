package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class setBorderColor implements getCornerRadius.get {
    private final getCornerRadius ThreeDS2ServiceInstance;

    public setBorderColor(getCornerRadius getcornerradius) {
        this.ThreeDS2ServiceInstance = getcornerradius;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return getCornerRadius.getAcsRefNumber(this.ThreeDS2ServiceInstance);
    }
}
