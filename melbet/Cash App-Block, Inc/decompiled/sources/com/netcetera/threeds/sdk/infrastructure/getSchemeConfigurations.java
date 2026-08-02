package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.SchemeInfo;

/* loaded from: classes5.dex */
class getSchemeConfigurations implements setAcsTransactionID {
    private final SchemeInfo.get initialize;

    public getSchemeConfigurations(SchemeInfo.get getVar) {
        this.initialize = getVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setAcsTransactionID
    public Object ThreeDS2ServiceInstance() {
        setRemoteViewsAdapter eftposConfiguration;
        eftposConfiguration = SchemeInfo.eftposConfiguration(this.initialize);
        return eftposConfiguration;
    }
}
