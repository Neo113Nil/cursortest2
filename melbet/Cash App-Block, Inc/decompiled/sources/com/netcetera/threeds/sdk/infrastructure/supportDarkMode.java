package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class supportDarkMode implements getCornerRadius.get {
    private final getCornerRadius.initialize ThreeDS2ServiceInstance;
    private final getCornerRadius get;

    public supportDarkMode(getCornerRadius getcornerradius, getCornerRadius.initialize initializeVar) {
        this.get = getcornerradius;
        this.ThreeDS2ServiceInstance = initializeVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return (ButtonCustomization) getCornerRadius.ThreeDS2Service(new Object[]{this.get, this.ThreeDS2ServiceInstance}, 506657769, -506657738, (int) System.currentTimeMillis());
    }
}
