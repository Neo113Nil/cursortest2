package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
class getSDKReferenceNumber implements setAcsTransactionID {
    public static final getSDKReferenceNumber ThreeDS2ServiceInstance = new getSDKReferenceNumber();

    @Override // com.netcetera.threeds.sdk.infrastructure.setAcsTransactionID
    public Object ThreeDS2ServiceInstance() {
        setDividerPadding sDKInfo;
        sDKInfo = SchemeInfo.getSDKInfo();
        return sDKInfo;
    }
}
