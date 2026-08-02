package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class setHapticFeedbackEnabled implements getCornerRadius.initialize {
    public static final setHapticFeedbackEnabled get = new setHapticFeedbackEnabled();

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.initialize
    public ButtonCustomization initialize(Object obj) {
        return ButtonCustomization.get(((Boolean) obj).booleanValue());
    }
}
