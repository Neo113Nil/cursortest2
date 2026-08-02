package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class UiCustomizationButtonType implements getCornerRadius.get {
    private final getCornerRadius initialize;

    public UiCustomizationButtonType(getCornerRadius getcornerradius) {
        this.initialize = getcornerradius;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return getCornerRadius.ids(this.initialize);
    }
}
