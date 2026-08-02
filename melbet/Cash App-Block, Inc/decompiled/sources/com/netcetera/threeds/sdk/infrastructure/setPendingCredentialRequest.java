package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class setPendingCredentialRequest implements getCornerRadius.get {
    private final getCornerRadius ThreeDS2ServiceInstance;

    public setPendingCredentialRequest(getCornerRadius getcornerradius) {
        this.ThreeDS2ServiceInstance = getcornerradius;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return getCornerRadius.SDKNotInitializedException(this.ThreeDS2ServiceInstance);
    }
}
