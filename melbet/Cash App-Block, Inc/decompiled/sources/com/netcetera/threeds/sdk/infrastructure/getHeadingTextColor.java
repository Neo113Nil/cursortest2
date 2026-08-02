package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class getHeadingTextColor implements getCornerRadius.get {
    private final getCornerRadius ThreeDS2Service;
    private final getCornerRadius.initialize initialize;

    public getHeadingTextColor(getCornerRadius getcornerradius, getCornerRadius.initialize initializeVar) {
        this.ThreeDS2Service = getcornerradius;
        this.initialize = initializeVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return getCornerRadius.ThreeDS2Service(this.ThreeDS2Service, this.initialize);
    }
}
