package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class hasAlgorithm implements getCornerRadius.get {
    private final getCornerRadius initialize;

    public hasAlgorithm(getCornerRadius getcornerradius) {
        this.initialize = getcornerradius;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return getCornerRadius.SDKAlreadyInitializedException(this.initialize);
    }
}
