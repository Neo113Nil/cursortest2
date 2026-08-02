package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.SchemeInfo;

/* loaded from: classes5.dex */
class getSeverity implements setAcsTransactionID {
    private final SchemeInfo.get initialize;

    public getSeverity(SchemeInfo.get getVar) {
        this.initialize = getVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setAcsTransactionID
    public Object ThreeDS2ServiceInstance() {
        ja mastercardSchemeConfiguration;
        mastercardSchemeConfiguration = SchemeInfo.mastercardSchemeConfiguration(this.initialize);
        return mastercardSchemeConfiguration;
    }
}
