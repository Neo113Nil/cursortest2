package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class setAutofillHints implements getCornerRadius.get {
    private final getCornerRadius get;

    public setAutofillHints(getCornerRadius getcornerradius) {
        this.get = getcornerradius;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return getCornerRadius.encryptionPublicKey(this.get);
    }
}
