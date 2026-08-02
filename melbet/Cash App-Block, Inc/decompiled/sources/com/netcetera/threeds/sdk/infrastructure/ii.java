package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class ii {
    private static int ThreeDS2Service = 1;
    private static int getWarnings;
    private boolean ThreeDS2ServiceInstance = false;

    public boolean ThreeDS2Service() {
        int i = ThreeDS2Service;
        int i2 = (i & 56) + (i | 56);
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        int i4 = i3 % 128;
        getWarnings = i4;
        int i5 = i3 % 2;
        boolean z = this.ThreeDS2ServiceInstance;
        if (i5 != 0) {
            int i6 = 72 / 0;
        }
        int i7 = i4 + 21;
        ThreeDS2Service = i7 % 128;
        if (i7 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public void getWarnings() {
        int i = getWarnings;
        int i2 = (-2) - ((((i | 80) << 1) - (i ^ 80)) ^ (-1));
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 == 0) {
            this.ThreeDS2ServiceInstance = false;
        } else {
            this.ThreeDS2ServiceInstance = true;
        }
    }
}
