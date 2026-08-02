package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.SchemeInfo;

/* loaded from: classes5.dex */
class getLicenseExpiryDate implements setAcsTransactionID {
    private final SchemeInfo.get initialize;

    public getLicenseExpiryDate(SchemeInfo.get getVar) {
        this.initialize = getVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setAcsTransactionID
    public Object ThreeDS2ServiceInstance() {
        setTag SchemeConfiguration;
        SchemeConfiguration = SchemeInfo.SchemeConfiguration(this.initialize);
        return SchemeConfiguration;
    }
}
