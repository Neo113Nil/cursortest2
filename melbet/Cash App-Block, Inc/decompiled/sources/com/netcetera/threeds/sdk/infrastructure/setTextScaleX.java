package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class setTextScaleX {
    private static int ThreeDS2Service = 0;
    private static int ThreeDS2ServiceInstance = 1;

    public com.netcetera.threeds.sdk.api.ThreeDS2Service getWarnings() {
        int i = ThreeDS2ServiceInstance;
        ThreeDS2Service = ((i & 105) + (i | 105)) % 128;
        com.netcetera.threeds.sdk.api.ThreeDS2Service ThreeDS2Service2 = setTextLocale.ThreeDS2Service();
        int i2 = ThreeDS2Service + 81;
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            return ThreeDS2Service2;
        }
        throw null;
    }
}
