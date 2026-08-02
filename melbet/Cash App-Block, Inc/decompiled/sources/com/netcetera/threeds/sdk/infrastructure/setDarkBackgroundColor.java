package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class setDarkBackgroundColor implements getCornerRadius.get {
    private final getCornerRadius get;
    private final getCornerRadius.initialize initialize;

    public setDarkBackgroundColor(getCornerRadius getcornerradius, getCornerRadius.initialize initializeVar) {
        this.get = getcornerradius;
        this.initialize = initializeVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return getCornerRadius.restrictedParameters(this.get, this.initialize);
    }
}
