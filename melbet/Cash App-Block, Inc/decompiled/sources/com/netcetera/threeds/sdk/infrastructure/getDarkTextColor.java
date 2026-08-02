package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class getDarkTextColor implements getCornerRadius.get {
    private final getCornerRadius get;

    public getDarkTextColor(getCornerRadius getcornerradius) {
        this.get = getcornerradius;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return getCornerRadius.cleanup(this.get);
    }
}
