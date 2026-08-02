package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.SchemeInfo;

/* loaded from: classes5.dex */
class TransactionBridgingMessageExtensionVersion implements setAcsTransactionID {
    private final SchemeInfo.get ThreeDS2Service;

    public TransactionBridgingMessageExtensionVersion(SchemeInfo.get getVar) {
        this.ThreeDS2Service = getVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setAcsTransactionID
    public Object ThreeDS2ServiceInstance() {
        ProgressView dinersSchemeConfiguration;
        dinersSchemeConfiguration = SchemeInfo.dinersSchemeConfiguration(this.ThreeDS2Service);
        return dinersSchemeConfiguration;
    }
}
