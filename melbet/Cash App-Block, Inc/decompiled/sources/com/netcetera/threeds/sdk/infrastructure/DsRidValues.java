package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class DsRidValues implements getCornerRadius.get {
    private final getCornerRadius ThreeDS2Service;
    private final getCornerRadius.initialize getWarnings;

    public DsRidValues(getCornerRadius getcornerradius, getCornerRadius.initialize initializeVar) {
        this.ThreeDS2Service = getcornerradius;
        this.getWarnings = initializeVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return getCornerRadius.unionSchemeConfiguration(this.ThreeDS2Service, this.getWarnings);
    }
}
