package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class setOnScrollChangeListener implements getCornerRadius.get {
    private final String ThreeDS2Service;

    public setOnScrollChangeListener(String str) {
        this.ThreeDS2Service = str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return getCornerRadius.ThreeDS2Service(this.ThreeDS2Service);
    }
}
