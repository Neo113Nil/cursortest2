package com.netcetera.threeds.sdk;

import com.netcetera.threeds.sdk.api.ThreeDS2Service;
import com.netcetera.threeds.sdk.infrastructure.getAcsRefNumber;
import com.netcetera.threeds.sdk.infrastructure.setThreeDSRequestorAppURL;

/* loaded from: classes5.dex */
public final class ThreeDS2ServiceInstance {
    private static int get = 1;
    private static int getWarnings;

    static {
        setThreeDSRequestorAppURL.initialize(new getAcsRefNumber());
        int i = get;
        int i2 = ((i | 101) << 1) - (i ^ 101);
        getWarnings = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 12 / 0;
        }
    }

    private ThreeDS2ServiceInstance() {
    }

    public static ThreeDS2Service get() {
        int i = getWarnings;
        int i2 = ((i ^ 29) | (i & 29)) << 1;
        int i3 = -(((~i) & 29) | (i & (-30)));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        get = i4 % 128;
        int i5 = i4 % 2;
        ThreeDS2Service threeDS2Service = (ThreeDS2Service) setThreeDSRequestorAppURL.initialize(ThreeDS2Service.class);
        if (i5 == 0) {
            throw null;
        }
        int i6 = get;
        int i7 = i6 & 13;
        int i8 = (i6 ^ 13) | i7;
        getWarnings = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
        return threeDS2Service;
    }
}
