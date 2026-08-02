package com.netcetera.threeds.sdk.infrastructure;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class setAnimationCacheEnabled {
    private static int ThreeDS2ServiceInstance = 0;
    private static final Map<setTextAlignment, clear> getWarnings;
    private static int initialize = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(setTextAlignment.getId, clear.ThreeDS2Service);
        hashMap.put(setTextAlignment.getSDKAppID, clear.ThreeDS2ServiceInstance);
        hashMap.put(setTextAlignment.getSDKEphemeralPublicKey, clear.initialize);
        hashMap.put(setTextAlignment.getSDKTransactionID, clear.get);
        hashMap.put(setTextAlignment.getSDKReferenceNumber, clear.cleanup);
        hashMap.put(setTextAlignment.Transaction, clear.createTransaction);
        hashMap.put(setTextAlignment.getMessageVersion, clear.getSDKVersion);
        hashMap.put(setTextAlignment.useBridgingExtension, clear.getSDKInfo);
        hashMap.put(setTextAlignment.getAuthenticationRequestParameters, clear.onCompleted);
        getWarnings = Collections.unmodifiableMap(hashMap);
        int i = initialize;
        int i2 = (((i | 75) << 1) - (~(-(i ^ 75)))) - 1;
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public clear initialize(setTextAlignment settextalignment) {
        int i = ThreeDS2ServiceInstance;
        int i2 = ((i & (-78)) | ((~i) & 77)) + ((i & 77) << 1);
        initialize = i2 % 128;
        int i3 = i2 % 2;
        clear clearVar = getWarnings.get(settextalignment);
        if (i3 == 0) {
            throw null;
        }
        int i4 = ThreeDS2ServiceInstance;
        int i5 = i4 & 125;
        int i6 = (i4 ^ 125) | i5;
        initialize = ((i5 & i6) + (i6 | i5)) % 128;
        return clearVar;
    }
}
