package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class getDarkBorderColor implements getCornerRadius.get {
    private final getCornerRadius.initialize ThreeDS2Service;
    private final getCornerRadius ThreeDS2ServiceInstance;

    public getDarkBorderColor(getCornerRadius getcornerradius, getCornerRadius.initialize initializeVar) {
        this.ThreeDS2ServiceInstance = getcornerradius;
        this.ThreeDS2Service = initializeVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return (ButtonCustomization) getCornerRadius.ThreeDS2Service(new Object[]{this.ThreeDS2ServiceInstance, this.ThreeDS2Service}, -861066175, 861066191, (int) System.currentTimeMillis());
    }
}
