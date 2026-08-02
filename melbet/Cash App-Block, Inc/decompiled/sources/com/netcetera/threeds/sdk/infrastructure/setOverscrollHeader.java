package com.netcetera.threeds.sdk.infrastructure;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import java.util.List;

/* loaded from: classes5.dex */
public class setOverscrollHeader {
    private static int cleanup = 0;
    private static int getSDKInfo = 1;
    private final String ThreeDS2Service;
    private final String ThreeDS2ServiceInitializationCallback;
    private final String ThreeDS2ServiceInstance;
    private final String createTransaction;
    private final List<String> get;
    private final List<String> getWarnings;
    private final String initialize;

    public setOverscrollHeader(String str, List<String> list, String str2, String str3, List<String> list2, String str4, String str5) {
        this.initialize = str;
        this.get = list;
        this.ThreeDS2Service = str2;
        this.ThreeDS2ServiceInstance = str3;
        this.getWarnings = list2;
        this.createTransaction = str4;
        this.ThreeDS2ServiceInitializationCallback = str5;
    }

    public String ThreeDS2Service() {
        int i = cleanup;
        int i2 = ((i ^ 19) + ((i & 19) << 1)) % 128;
        getSDKInfo = i2;
        String str = this.ThreeDS2ServiceInstance;
        int i3 = ((i2 ^ 11) | (i2 & 11)) << 1;
        int i4 = -(((~i2) & 11) | (i2 & (-12)));
        cleanup = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
        return str;
    }

    public String ThreeDS2ServiceInitializationCallback() {
        int i = getSDKInfo;
        int i2 = (i ^ 104) + ((i & 104) << 1);
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        cleanup = i3 % 128;
        int i4 = i3 % 2;
        String str = this.createTransaction;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i & 111;
        int i6 = (i5 - (~(-(-((i ^ 111) | i5))))) - 1;
        cleanup = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public List<String> ThreeDS2ServiceInstance() {
        int i = cleanup;
        List<String> list = this.getWarnings;
        getSDKInfo = Thread$State$EnumUnboxingLocalUtility.m(i ^ 62, (i & 62) << 1, 1, 128);
        return list;
    }

    public String get() {
        int i = cleanup;
        int i2 = (i ^ 61) + ((i & 61) << 1);
        getSDKInfo = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ThreeDS2Service;
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return str;
    }

    public String getSDKVersion() {
        int i = getSDKInfo;
        String str = this.ThreeDS2ServiceInitializationCallback;
        int i2 = i & 75;
        int i3 = i2 + ((i ^ 75) | i2);
        cleanup = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public List<String> getWarnings() {
        int i = cleanup;
        int i2 = i & 39;
        int i3 = ((i ^ 39) | i2) << 1;
        int i4 = -((~i2) & (i | 39));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        getSDKInfo = i5 % 128;
        int i6 = i5 % 2;
        List<String> list = this.get;
        if (i6 == 0) {
            throw null;
        }
        getSDKInfo = (i + 91) % 128;
        return list;
    }

    public String initialize() {
        int i = getSDKInfo;
        int i2 = i & 79;
        int i3 = (i2 - (~((i ^ 79) | i2))) - 1;
        cleanup = i3 % 128;
        int i4 = i3 % 2;
        String str = this.initialize;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i & 101;
        cleanup = (i5 + ((i ^ 101) | i5)) % 128;
        return str;
    }
}
