package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class ToolbarCustomization implements getCornerRadius.get {
    private final getCornerRadius.initialize get;
    private final getCornerRadius getWarnings;

    public ToolbarCustomization(getCornerRadius getcornerradius, getCornerRadius.initialize initializeVar) {
        this.getWarnings = getcornerradius;
        this.get = initializeVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return getCornerRadius.visaSchemeConfiguration(this.getWarnings, this.get);
    }
}
