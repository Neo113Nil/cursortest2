package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
class setHorizontallyScrolling {
    private static int ThreeDS2ServiceInstance = 1;
    private static int get;
    private boolean getWarnings = false;

    public void ThreeDS2Service() {
        int i = get;
        this.getWarnings = false;
        int i2 = ((i | 28) << 1) - (i ^ 28);
        ThreeDS2ServiceInstance = ((i2 ^ (-1)) + (i2 << 1)) % 128;
    }

    public boolean get() {
        int i = get;
        boolean z = this.getWarnings;
        int i2 = i & 119;
        int i3 = -(-(i | 119));
        ThreeDS2ServiceInstance = ((i2 & i3) + (i3 | i2)) % 128;
        return z;
    }

    public void getWarnings() {
        int i = get;
        int i2 = i + 19;
        ThreeDS2ServiceInstance = i2 % 128;
        int i3 = i2 % 2;
        this.getWarnings = true;
        int i4 = i ^ 13;
        int i5 = ((i & 13) | i4) << 1;
        int i6 = -i4;
        ThreeDS2ServiceInstance = ((i5 & i6) + (i6 | i5)) % 128;
    }
}
