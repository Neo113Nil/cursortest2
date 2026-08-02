package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setPopupTheme;

/* loaded from: classes5.dex */
public class setSubtitleTextAppearance implements setPopupTheme.ThreeDS2ServiceInstance {
    private static int ThreeDS2ServiceInstance = 0;
    private static int getWarnings = 1;
    private final String ThreeDS2Service;
    private final String get;
    private final String initialize;

    public setSubtitleTextAppearance(String str, String str2, String str3) {
        this.initialize = str;
        this.get = str2;
        this.ThreeDS2Service = str3;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPopupTheme.ThreeDS2ServiceInstance
    public String ThreeDS2ServiceInitializationCallback() {
        int i = ThreeDS2ServiceInstance;
        String str = this.get;
        int i2 = i & 63;
        int i3 = -(-((i ^ 63) | i2));
        getWarnings = ((i2 & i3) + (i3 | i2)) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPopupTheme.ThreeDS2ServiceInstance
    public String getSDKVersion() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 111;
        int i3 = -(-((i ^ 111) | i2));
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        getWarnings = i4;
        String str = this.initialize;
        int i5 = i4 & 15;
        int i6 = -(-(i4 | 15));
        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
        ThreeDS2ServiceInstance = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 97 / 0;
        }
        return str;
    }
}
