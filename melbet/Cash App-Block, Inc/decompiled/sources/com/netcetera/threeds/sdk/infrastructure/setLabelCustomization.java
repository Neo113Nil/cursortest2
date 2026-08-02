package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class setLabelCustomization implements getCornerRadius.get {
    private final getCornerRadius ThreeDS2Service;
    private final getCornerRadius.initialize initialize;

    public setLabelCustomization(getCornerRadius getcornerradius, getCornerRadius.initialize initializeVar) {
        this.ThreeDS2Service = getcornerradius;
        this.initialize = initializeVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return getCornerRadius.get(this.ThreeDS2Service, this.initialize);
    }
}
