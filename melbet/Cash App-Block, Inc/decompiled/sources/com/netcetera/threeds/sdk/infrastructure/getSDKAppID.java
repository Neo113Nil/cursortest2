package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.SchemeInfo;

/* loaded from: classes5.dex */
class getSDKAppID implements setAcsTransactionID {
    private final SchemeInfo.get get;

    public getSDKAppID(SchemeInfo.get getVar) {
        this.get = getVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setAcsTransactionID
    public Object ThreeDS2ServiceInstance() {
        setMinHeight ConfigurationBuilder;
        ConfigurationBuilder = SchemeInfo.ConfigurationBuilder(this.get);
        return ConfigurationBuilder;
    }
}
