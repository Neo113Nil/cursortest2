package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setCacheColorHint;
import java.util.Date;
import java.util.List;

/* loaded from: classes5.dex */
public class setLayoutMode implements com.netcetera.threeds.sdk.api.info.SDKInfo {
    private static int ThreeDS2Service = 1;
    private static int getWarnings;
    private final List<com.netcetera.threeds.sdk.api.info.SchemeInfo> get;
    private final Date initialize;

    public setLayoutMode(List<com.netcetera.threeds.sdk.api.info.SchemeInfo> list, Date date) {
        this.get = list;
        this.initialize = date;
    }

    @Override // com.netcetera.threeds.sdk.api.info.SDKInfo
    public Date getLicenseExpiryDate() {
        int i = getWarnings;
        int i2 = ((i ^ 7) | (i & 7)) << 1;
        int i3 = -(((~i) & 7) | (i & (-8)));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        ThreeDS2Service = i4 % 128;
        int i5 = i4 % 2;
        Date date = this.initialize;
        if (i5 != 0) {
            return date;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.api.info.SDKInfo
    public List<com.netcetera.threeds.sdk.api.info.SchemeInfo> getSchemeConfigurations() {
        int i = getWarnings + 61;
        ThreeDS2Service = i % 128;
        int i2 = i % 2;
        List<com.netcetera.threeds.sdk.api.info.SchemeInfo> list = this.get;
        if (i2 != 0) {
            return list;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.api.info.SDKInfo
    public List<String> getSupportedProtocolVersions() {
        int i = getWarnings;
        int i2 = (i & 113) + (i | 113);
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 == 0) {
            setCacheColorHint.getWarnings.get();
            throw null;
        }
        List<String> list = setCacheColorHint.getWarnings.get();
        int i3 = ThreeDS2Service;
        int i4 = i3 & 9;
        int i5 = ((i3 ^ 9) | i4) << 1;
        int i6 = -((i3 | 9) & (~i4));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        getWarnings = i7 % 128;
        if (i7 % 2 == 0) {
            return list;
        }
        throw null;
    }
}
