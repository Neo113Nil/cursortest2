package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.SchemeInfo;

/* loaded from: classes5.dex */
class getSDKEphemeralPublicKey implements setAcsTransactionID {
    private final SchemeInfo.get ThreeDS2Service;

    public getSDKEphemeralPublicKey(SchemeInfo.get getVar) {
        this.ThreeDS2Service = getVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setAcsTransactionID
    public Object ThreeDS2ServiceInstance() {
        setMax apiKey;
        apiKey = SchemeInfo.apiKey(this.ThreeDS2Service);
        return apiKey;
    }
}
