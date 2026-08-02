package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class getViewCustomization implements getCornerRadius.get {
    private final getCornerRadius.initialize get;
    private final getCornerRadius initialize;

    public getViewCustomization(getCornerRadius getcornerradius, getCornerRadius.initialize initializeVar) {
        this.initialize = getcornerradius;
        this.get = initializeVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return (ButtonCustomization) getCornerRadius.ThreeDS2Service(new Object[]{this.initialize, this.get}, -1767854263, 1767854263, (int) System.currentTimeMillis());
    }
}
