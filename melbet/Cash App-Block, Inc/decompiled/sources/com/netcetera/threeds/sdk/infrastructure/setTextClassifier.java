package com.netcetera.threeds.sdk.infrastructure;

import android.util.Range;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.util.Map;

/* loaded from: classes5.dex */
class setTextClassifier implements setSafeBrowsingWhitelist {
    private static int createTransaction = 1;
    private static int getSDKInfo;
    private final String ThreeDS2Service;
    private final byte[] ThreeDS2ServiceInstance;
    private final Map<String, String> cleanup;
    private final int get;
    private final byte[] getWarnings;
    private final String initialize;

    public setTextClassifier(byte[] bArr, byte[] bArr2, int i, String str, String str2, Map<String, String> map) {
        this.ThreeDS2ServiceInstance = bArr;
        this.getWarnings = bArr2;
        this.get = i;
        this.ThreeDS2Service = str;
        this.initialize = str2;
        this.cleanup = map;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSafeBrowsingWhitelist
    public Map<String, String> ThreeDS2Service() {
        int i = getSDKInfo;
        int i2 = i & 117;
        int i3 = (i2 - (~(-(-((i ^ 117) | i2))))) - 1;
        createTransaction = i3 % 128;
        int i4 = i3 % 2;
        Map<String, String> map = this.cleanup;
        if (i4 == 0) {
            int i5 = 76 / 0;
        }
        return map;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSafeBrowsingWhitelist
    public int ThreeDS2ServiceInstance() {
        int i = getSDKInfo;
        int i2 = i & 5;
        int i3 = (((i ^ 5) | i2) << 1) - ((i | 5) & (~i2));
        int i4 = i3 % 128;
        createTransaction = i4;
        int i5 = i3 % 2;
        int i6 = this.get;
        if (i5 == 0) {
            throw null;
        }
        getSDKInfo = SVG$Unit$EnumUnboxingLocalUtility.m(i4 ^ 84, (i4 & 84) << 1, -1, 128);
        return i6;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSafeBrowsingWhitelist
    public String createTransaction() {
        int i = (getSDKInfo + 83) % 128;
        createTransaction = i;
        String str = this.initialize;
        int i2 = i + 63;
        getSDKInfo = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSafeBrowsingWhitelist
    public setVerticalScrollbarOverlay get() {
        setVerticalScrollbarOverlay setverticalscrollbaroverlay = new setVerticalScrollbarOverlay(this.ThreeDS2ServiceInstance);
        int i = getSDKInfo;
        createTransaction = SVG$Unit$EnumUnboxingLocalUtility.m$1((i & (-102)) | ((~i) & 101), ~((i & 101) << 1), 1, 128);
        return setverticalscrollbaroverlay;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSafeBrowsingWhitelist
    public setVerticalScrollbarOverlay getSDKVersion() {
        setVerticalScrollbarOverlay setverticalscrollbaroverlay = new setVerticalScrollbarOverlay(this.getWarnings);
        int i = createTransaction;
        getSDKInfo = SVG$Unit$EnumUnboxingLocalUtility.m(i & 70, i | 70, -1, 128);
        return setverticalscrollbaroverlay;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSafeBrowsingWhitelist
    public boolean getWarnings() {
        int i = getSDKInfo;
        int i2 = i | 7;
        int i3 = (i2 << 1) - ((~(i & 7)) & i2);
        createTransaction = i3 % 128;
        int i4 = i3 % 2;
        Range<Integer> range = setRendererPriorityPolicy.initialize;
        Integer valueOf = Integer.valueOf(this.get);
        if (i4 != 0) {
            return range.contains((Range<Integer>) valueOf);
        }
        range.contains((Range<Integer>) valueOf);
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSafeBrowsingWhitelist
    public String initialize() {
        int i = createTransaction;
        int i2 = ((((i ^ 25) | (i & 25)) << 1) - (~(-(((~i) & 25) | (i & (-26)))))) - 1;
        getSDKInfo = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ThreeDS2Service;
        if (i3 == 0) {
            return str;
        }
        throw null;
    }
}
