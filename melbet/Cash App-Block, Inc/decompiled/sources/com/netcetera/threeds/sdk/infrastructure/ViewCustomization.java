package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class ViewCustomization implements getCornerRadius.get {
    private final getCornerRadius.initialize ThreeDS2ServiceInstance;
    private final getCornerRadius initialize;

    public ViewCustomization(getCornerRadius getcornerradius, getCornerRadius.initialize initializeVar) {
        this.initialize = getcornerradius;
        this.ThreeDS2ServiceInstance = initializeVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return getCornerRadius.onError(this.initialize, this.ThreeDS2ServiceInstance);
    }
}
