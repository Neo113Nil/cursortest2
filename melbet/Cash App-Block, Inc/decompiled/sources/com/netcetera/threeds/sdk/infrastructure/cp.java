package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class cp implements compute {
    private static int ThreeDS2Service = 0;
    private static int initialize = 1;
    private compute ThreeDS2ServiceInstance;
    private computeIfPresent getWarnings;

    @Override // com.netcetera.threeds.sdk.infrastructure.compute
    public void ThreeDS2Service(replace replaceVar) {
        int i = ThreeDS2Service;
        int i2 = (((i ^ 61) | (i & 61)) << 1) - ((i & (-62)) | ((~i) & 61));
        int i3 = i2 % 128;
        initialize = i3;
        int i4 = i2 % 2;
        compute computeVar = this.ThreeDS2ServiceInstance;
        if (i4 == 0) {
            throw null;
        }
        if (computeVar != null) {
            computeIfPresent computeifpresent = this.getWarnings;
            if (computeifpresent != null) {
                int i5 = (((i3 & (-76)) | ((~i3) & 75)) - (~((i3 & 75) << 1))) - 1;
                ThreeDS2Service = i5 % 128;
                if (i5 % 2 != 0) {
                    computeifpresent.getWarnings(replaceVar);
                    throw null;
                }
                replaceVar = computeifpresent.getWarnings(replaceVar);
            } else {
                initialize = ((i & 33) + (i | 33)) % 128;
            }
            this.ThreeDS2ServiceInstance.ThreeDS2Service(replaceVar);
            int i6 = initialize;
            int i7 = i6 & 3;
            int i8 = (i6 ^ 3) | i7;
            ThreeDS2Service = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
        }
        int i9 = ThreeDS2Service;
        int i10 = ((i9 ^ 89) - (~(-(-((i9 & 89) << 1))))) - 1;
        initialize = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public void get(compute computeVar) {
        int i = ThreeDS2Service;
        int i2 = i & 61;
        int i3 = (i ^ 61) | i2;
        int i4 = (i2 & i3) + (i2 | i3);
        initialize = i4 % 128;
        if (i4 % 2 == 0) {
            this.ThreeDS2ServiceInstance = computeVar;
            throw null;
        }
        this.ThreeDS2ServiceInstance = computeVar;
        initialize = (((i | 107) << 1) - (i ^ 107)) % 128;
    }

    public void ThreeDS2Service() {
        int i = initialize;
        int i2 = (((i | 64) << 1) - (i ^ 64)) - 1;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 != 0) {
            this.getWarnings = null;
            int i3 = 18 / 0;
        } else {
            this.getWarnings = null;
        }
    }

    public void ThreeDS2Service(computeIfPresent computeifpresent) {
        int i = initialize;
        int i2 = (i | 77) << 1;
        int i3 = -(((~i) & 77) | (i & (-78)));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        ThreeDS2Service = i4 % 128;
        if (i4 % 2 != 0) {
            this.getWarnings = computeifpresent;
            int i5 = 80 / 0;
        } else {
            this.getWarnings = computeifpresent;
        }
    }
}
