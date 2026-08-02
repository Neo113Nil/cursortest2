package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class setTitleMarginTop {
    private static int ThreeDS2ServiceInstance = 0;
    private static int getWarnings = 1;
    private final boolean ThreeDS2Service;
    private final nq get;

    public setTitleMarginTop(nq nqVar, boolean z) {
        this.get = nqVar;
        this.ThreeDS2Service = z;
    }

    public boolean ThreeDS2Service() {
        int i = ThreeDS2ServiceInstance;
        boolean z = this.ThreeDS2Service;
        int i2 = ((i & 11) - (~(i | 11))) - 1;
        getWarnings = i2 % 128;
        if (i2 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public nq ThreeDS2ServiceInstance() {
        int i = getWarnings;
        int i2 = ((i & 60) + (i | 60)) - 1;
        ThreeDS2ServiceInstance = i2 % 128;
        int i3 = i2 % 2;
        nq nqVar = this.get;
        if (i3 == 0) {
            return nqVar;
        }
        throw null;
    }
}
