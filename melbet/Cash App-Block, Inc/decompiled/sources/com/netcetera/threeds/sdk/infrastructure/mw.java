package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class mw {
    private static int getWarnings = 0;
    private static int initialize = 1;

    public boolean ThreeDS2ServiceInstance() {
        int i = initialize;
        int i2 = (i ^ 51) + ((i & 51) << 1);
        getWarnings = i2 % 128;
        boolean z = i2 % 2 != 0;
        int i3 = i & 121;
        int i4 = (i ^ 121) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        getWarnings = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }
}
