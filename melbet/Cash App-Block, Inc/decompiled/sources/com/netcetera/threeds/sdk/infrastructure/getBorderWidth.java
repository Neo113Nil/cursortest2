package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class getBorderWidth implements getCornerRadius.get {
    private final getCornerRadius ThreeDS2Service;

    public getBorderWidth(getCornerRadius getcornerradius) {
        this.ThreeDS2Service = getcornerradius;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return getCornerRadius.logoDark(this.ThreeDS2Service);
    }
}
