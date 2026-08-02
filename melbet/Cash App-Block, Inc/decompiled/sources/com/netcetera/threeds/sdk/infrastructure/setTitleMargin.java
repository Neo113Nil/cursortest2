package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class setTitleMargin implements setMarqueeRepeatLimit {
    private static int cleanup = 1;
    private static int getWarnings;
    private final String ThreeDS2Service;
    private final String ThreeDS2ServiceInstance;
    private final Boolean get;
    private final String initialize;

    public setTitleMargin(Boolean bool, String str, String str2, String str3) {
        this.get = bool;
        this.ThreeDS2Service = str;
        this.initialize = str2;
        this.ThreeDS2ServiceInstance = str3;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setMarqueeRepeatLimit
    public String ThreeDS2ServiceInstance() {
        int i = getWarnings;
        int i2 = i & 29;
        int i3 = (i | 29) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 & i4) + (i3 | i4);
        cleanup = i5 % 128;
        int i6 = i5 % 2;
        String str = this.ThreeDS2ServiceInstance;
        if (i6 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setMarqueeRepeatLimit
    public Boolean get() {
        int i = cleanup + 69;
        getWarnings = i % 128;
        int i2 = i % 2;
        Boolean bool = this.get;
        if (i2 != 0) {
            int i3 = 36 / 0;
        }
        return bool;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setMarqueeRepeatLimit
    public String getWarnings() {
        int i = cleanup;
        int i2 = ((i ^ 82) + ((i & 82) << 1)) - 1;
        getWarnings = i2 % 128;
        int i3 = i2 % 2;
        String str = this.initialize;
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setMarqueeRepeatLimit
    public String initialize() {
        int i = cleanup;
        int i2 = i & 33;
        int i3 = -(-((i ^ 33) | i2));
        int i4 = (i2 ^ i3) + ((i2 & i3) << 1);
        getWarnings = i4 % 128;
        int i5 = i4 % 2;
        String str = this.ThreeDS2Service;
        if (i5 != 0) {
            throw null;
        }
        getWarnings = ((i ^ 11) + ((i & 11) << 1)) % 128;
        return str;
    }
}
