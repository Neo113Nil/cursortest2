package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class setHorizontalScrollbarTrackDrawable implements getCornerRadius.get {
    private final getCornerRadius.initialize ThreeDS2Service;
    private final getCornerRadius get;

    public setHorizontalScrollbarTrackDrawable(getCornerRadius getcornerradius, getCornerRadius.initialize initializeVar) {
        this.get = getcornerradius;
        this.ThreeDS2Service = initializeVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return getCornerRadius.getSchemeLogoDark(this.get, this.ThreeDS2Service);
    }
}
