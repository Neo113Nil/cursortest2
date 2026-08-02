package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.SchemeInfo;

/* loaded from: classes5.dex */
class getAuthenticationRequestParameters implements setAcsTransactionID {
    private final SchemeInfo.get get;

    public getAuthenticationRequestParameters(SchemeInfo.get getVar) {
        this.get = getVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setAcsTransactionID
    public Object ThreeDS2ServiceInstance() {
        setOnItemClickListener unionSchemeConfiguration$1b61746c;
        unionSchemeConfiguration$1b61746c = SchemeInfo.unionSchemeConfiguration$1b61746c(this.get);
        return unionSchemeConfiguration$1b61746c;
    }
}
