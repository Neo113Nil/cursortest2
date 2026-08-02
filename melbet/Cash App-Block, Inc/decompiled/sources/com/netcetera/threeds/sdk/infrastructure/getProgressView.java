package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.SchemeInfo;

/* loaded from: classes5.dex */
class getProgressView implements setAcsTransactionID {
    private final SchemeInfo.get getWarnings;

    public getProgressView(SchemeInfo.get getVar) {
        this.getWarnings = getVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setAcsTransactionID
    public Object ThreeDS2ServiceInstance() {
        Object jcbConfiguration$fe7c8c5;
        jcbConfiguration$fe7c8c5 = SchemeInfo.jcbConfiguration$fe7c8c5(this.getWarnings);
        return jcbConfiguration$fe7c8c5;
    }
}
