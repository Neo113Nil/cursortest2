package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.SchemeInfo;

/* loaded from: classes5.dex */
class getDeviceData implements setAcsTransactionID {
    private final SchemeInfo.get ThreeDS2Service;

    public getDeviceData(SchemeInfo.get getVar) {
        this.ThreeDS2Service = getVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setAcsTransactionID
    public Object ThreeDS2ServiceInstance() {
        setFillViewport removeParam;
        removeParam = SchemeInfo.removeParam(this.ThreeDS2Service);
        return removeParam;
    }
}
