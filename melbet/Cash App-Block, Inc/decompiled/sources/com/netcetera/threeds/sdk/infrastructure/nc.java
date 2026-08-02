package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class nc {
    private static int ThreeDS2ServiceInstance = 1;
    private static int getWarnings;
    private volatile boolean ThreeDS2Service = false;

    public boolean ThreeDS2ServiceInstance() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 39;
        int i3 = (i | 39) & (~i2);
        int i4 = i2 << 1;
        getWarnings = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
        boolean z = this.ThreeDS2Service;
        int i5 = ThreeDS2ServiceInstance;
        int i6 = i5 & 59;
        int i7 = (i5 | 59) & (~i6);
        int i8 = -(-(i6 << 1));
        getWarnings = ((i7 ^ i8) + ((i7 & i8) << 1)) % 128;
        return z;
    }

    public void getWarnings() {
        int i = getWarnings;
        ThreeDS2ServiceInstance = ((i & 31) + (i | 31)) % 128;
        this.ThreeDS2Service = false;
        int i2 = getWarnings;
        int i3 = ((i2 | 29) << 1) - (i2 ^ 29);
        ThreeDS2ServiceInstance = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public void initialize() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 109;
        int i3 = (i2 - (~((i ^ 109) | i2))) - 1;
        getWarnings = i3 % 128;
        if (i3 % 2 != 0) {
            this.ThreeDS2Service = false;
        } else {
            this.ThreeDS2Service = true;
        }
    }
}
