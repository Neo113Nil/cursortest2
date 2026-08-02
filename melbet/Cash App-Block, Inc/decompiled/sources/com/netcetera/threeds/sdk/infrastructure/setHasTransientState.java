package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;

/* loaded from: classes5.dex */
class setHasTransientState implements getCornerRadius.initialize {
    public static final setHasTransientState ThreeDS2Service = new setHasTransientState();

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.initialize
    public ButtonCustomization initialize(Object obj) {
        return ButtonCustomization.initialize(((Boolean) obj).booleanValue());
    }
}
