package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class getToolbarCustomization implements getCornerRadius.get {
    private final getCornerRadius ThreeDS2Service;

    public getToolbarCustomization(getCornerRadius getcornerradius) {
        this.ThreeDS2Service = getcornerradius;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return (ButtonCustomization) getCornerRadius.ThreeDS2Service(new Object[]{this.ThreeDS2Service}, 2067171400, -2067171379, (int) System.currentTimeMillis());
    }
}
