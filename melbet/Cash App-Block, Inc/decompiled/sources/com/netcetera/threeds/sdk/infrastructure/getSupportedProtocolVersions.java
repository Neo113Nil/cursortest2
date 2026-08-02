package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.SchemeInfo;

/* loaded from: classes5.dex */
class getSupportedProtocolVersions implements setAcsTransactionID {
    private final SchemeInfo.get get;

    public getSupportedProtocolVersions(SchemeInfo.get getVar) {
        this.get = getVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setAcsTransactionID
    public Object ThreeDS2ServiceInstance() {
        setWeightSum cbConfiguration;
        cbConfiguration = SchemeInfo.cbConfiguration(this.get);
        return cbConfiguration;
    }
}
