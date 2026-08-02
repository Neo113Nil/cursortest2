package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;
import com.netcetera.threeds.sdk.infrastructure.setCacheColorHint;

/* loaded from: classes5.dex */
class setParameter implements getCornerRadius.get {
    private final getCornerRadius ThreeDS2Service;
    private final setCacheColorHint.getWarnings get;

    public setParameter(getCornerRadius getcornerradius, setCacheColorHint.getWarnings getwarnings) {
        this.ThreeDS2Service = getcornerradius;
        this.get = getwarnings;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return (ButtonCustomization) getCornerRadius.ThreeDS2Service(new Object[]{this.ThreeDS2Service, this.get}, -1837682490, 1837682554, (int) System.currentTimeMillis());
    }
}
