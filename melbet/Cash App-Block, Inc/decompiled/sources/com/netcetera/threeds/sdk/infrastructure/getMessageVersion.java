package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.SchemeInfo;

/* loaded from: classes5.dex */
class getMessageVersion implements setAcsTransactionID {
    private final SchemeInfo.get get;

    public getMessageVersion(SchemeInfo.get getVar) {
        this.get = getVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setAcsTransactionID
    public Object ThreeDS2ServiceInstance() {
        setProgressTintMode restrictedParameters;
        restrictedParameters = SchemeInfo.restrictedParameters(this.get);
        return restrictedParameters;
    }
}
