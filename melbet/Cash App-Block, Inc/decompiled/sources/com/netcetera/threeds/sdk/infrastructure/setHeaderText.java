package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class setHeaderText implements getCornerRadius.get {
    private final getCornerRadius getWarnings;

    public setHeaderText(getCornerRadius getcornerradius) {
        this.getWarnings = getcornerradius;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return getCornerRadius.getMessage(this.getWarnings);
    }
}
