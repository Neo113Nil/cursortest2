package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class getService implements getCornerRadius.get {
    private final getCornerRadius initialize;

    public getService(getCornerRadius getcornerradius) {
        this.initialize = getcornerradius;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return getCornerRadius.ThreeDS2ServiceInitializationCallback(this.initialize);
    }
}
