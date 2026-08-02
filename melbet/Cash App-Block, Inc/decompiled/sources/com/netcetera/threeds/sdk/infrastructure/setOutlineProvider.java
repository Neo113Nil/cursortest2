package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class setOutlineProvider implements getCornerRadius.get {
    private final getCornerRadius initialize;

    public setOutlineProvider(getCornerRadius getcornerradius) {
        this.initialize = getcornerradius;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return getCornerRadius.getCertPrefix(this.initialize);
    }
}
