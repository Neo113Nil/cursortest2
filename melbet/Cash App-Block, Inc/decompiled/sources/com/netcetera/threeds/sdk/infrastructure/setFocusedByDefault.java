package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class setFocusedByDefault implements getCornerRadius.get {
    public static final setFocusedByDefault get = new setFocusedByDefault();

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return getCornerRadius.setOnApplyWindowInsetsListener();
    }
}
