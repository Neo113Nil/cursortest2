package com.netcetera.threeds.sdk.infrastructure;

import java.security.PublicKey;

/* loaded from: classes5.dex */
public class setLocalePreferredLineHeightForMinimumUsed {
    private static int getWarnings = 0;
    private static int initialize = 1;
    private final String ThreeDS2Service;
    private final PublicKey ThreeDS2ServiceInstance;
    private final String get;

    public setLocalePreferredLineHeightForMinimumUsed(String str, String str2, PublicKey publicKey) {
        this.ThreeDS2Service = str;
        this.get = str2;
        this.ThreeDS2ServiceInstance = publicKey;
    }

    public String ThreeDS2Service() {
        int i = initialize;
        int i2 = (((i | 13) << 1) - (i ^ 13)) % 128;
        getWarnings = i2;
        String str = this.ThreeDS2Service;
        initialize = ((i2 & 5) + (i2 | 5)) % 128;
        return str;
    }

    public PublicKey ThreeDS2ServiceInstance() {
        int i = initialize;
        int i2 = (((i | 6) << 1) - (i ^ 6)) - 1;
        getWarnings = i2 % 128;
        int i3 = i2 % 2;
        PublicKey publicKey = this.ThreeDS2ServiceInstance;
        if (i3 != 0) {
            throw null;
        }
        int i4 = (i & (-12)) | ((~i) & 11);
        int i5 = -(-((i & 11) << 1));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        getWarnings = i6 % 128;
        if (i6 % 2 == 0) {
            return publicKey;
        }
        throw null;
    }
}
