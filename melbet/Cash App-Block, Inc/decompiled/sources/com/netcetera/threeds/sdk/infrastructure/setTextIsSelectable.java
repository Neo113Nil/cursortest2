package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class setTextIsSelectable {
    private static int ThreeDS2Service = 1;
    private static int getWarnings;
    private final String ThreeDS2ServiceInstance;
    private final String initialize;

    public setTextIsSelectable(String str, String str2) {
        this.ThreeDS2ServiceInstance = str;
        this.initialize = str2;
    }

    public String get() {
        int i = ThreeDS2Service;
        int i2 = (i & (-50)) | ((~i) & 49);
        int i3 = (i & 49) << 1;
        int i4 = (i2 & i3) + (i3 | i2);
        getWarnings = i4 % 128;
        int i5 = i4 % 2;
        String str = this.initialize;
        if (i5 == 0) {
            return str;
        }
        throw null;
    }

    public String getWarnings() {
        int i = ThreeDS2Service;
        int i2 = (i ^ 76) + ((i & 76) << 1);
        int i3 = ((i2 ^ (-1)) + (i2 << 1)) % 128;
        getWarnings = i3;
        String str = this.ThreeDS2ServiceInstance;
        ThreeDS2Service = ((i3 ^ 37) + ((i3 & 37) << 1)) % 128;
        return str;
    }
}
