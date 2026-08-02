package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.SchemeInfo;

/* loaded from: classes5.dex */
class getMessage implements setAcsTransactionID {
    private final SchemeInfo.get ThreeDS2Service;

    public getMessage(SchemeInfo.get getVar) {
        this.ThreeDS2Service = getVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setAcsTransactionID
    public Object ThreeDS2ServiceInstance() {
        setHorizontalGravity visaSchemeConfiguration;
        visaSchemeConfiguration = SchemeInfo.visaSchemeConfiguration(this.ThreeDS2Service);
        return visaSchemeConfiguration;
    }
}
