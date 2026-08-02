package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class getPrivateKey implements getCornerRadius.get {
    private final getCornerRadius initialize;

    public getPrivateKey(getCornerRadius getcornerradius) {
        this.initialize = getcornerradius;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return (ButtonCustomization) getCornerRadius.ThreeDS2Service(new Object[]{this.initialize}, -565106321, 565106389, (int) System.currentTimeMillis());
    }
}
