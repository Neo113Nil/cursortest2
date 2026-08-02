package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class getTextColor implements getCornerRadius.get {
    private final getCornerRadius getWarnings;

    public getTextColor(getCornerRadius getcornerradius) {
        this.getWarnings = getcornerradius;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return getCornerRadius.getSchemeName(this.getWarnings);
    }
}
