package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setPopupTheme;

/* loaded from: classes5.dex */
public class setTitleMarginEnd implements setPopupTheme.initialize {
    private static int ThreeDS2ServiceInstance = 0;
    private static int initialize = 1;
    private final String ThreeDS2Service;
    private final String get;
    private final String getWarnings;

    public setTitleMarginEnd(String str, String str2, String str3) {
        this.getWarnings = str;
        this.ThreeDS2Service = str2;
        this.get = str3;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPopupTheme.initialize
    public String ThreeDS2Service() {
        int i = initialize;
        int i2 = ((i | 96) << 1) - (i ^ 96);
        int i3 = ((i2 ^ (-1)) + (i2 << 1)) % 128;
        ThreeDS2ServiceInstance = i3;
        String str = this.getWarnings;
        initialize = (i3 + 25) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPopupTheme.initialize
    public String ThreeDS2ServiceInstance() {
        int i = initialize;
        int i2 = (((i | 13) << 1) - (i ^ 13)) % 128;
        ThreeDS2ServiceInstance = i2;
        String str = this.ThreeDS2Service;
        int i3 = i2 & 77;
        int i4 = -(-((i2 ^ 77) | i3));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        initialize = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPopupTheme.initialize
    public String get() {
        int i = (-2) - ((ThreeDS2ServiceInstance + 6) ^ (-1));
        initialize = i % 128;
        int i2 = i % 2;
        String str = this.get;
        if (i2 == 0) {
            int i3 = 38 / 0;
        }
        return str;
    }
}
