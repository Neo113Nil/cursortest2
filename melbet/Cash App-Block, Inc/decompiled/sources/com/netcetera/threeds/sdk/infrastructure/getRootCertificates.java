package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.SchemeInfo;

/* loaded from: classes5.dex */
class getRootCertificates implements setAcsTransactionID {
    private final SchemeInfo.get get;

    public getRootCertificates(SchemeInfo.get getVar) {
        this.get = getVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setAcsTransactionID
    public Object ThreeDS2ServiceInstance() {
        me amexConfiguration;
        amexConfiguration = SchemeInfo.amexConfiguration(this.get);
        return amexConfiguration;
    }
}
