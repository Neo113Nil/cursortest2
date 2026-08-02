package com.netcetera.threeds.sdk.infrastructure;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class setDivider {
    private static int ThreeDS2ServiceInitializationCallback = 0;
    private static int createTransaction = 1;
    private final setHeaderDividersEnabled ThreeDS2Service;
    private final String ThreeDS2ServiceInstance;
    private final String cleanup;
    private final String get;
    private final Map<String, String> getSDKInfo;
    private final String getSDKVersion;
    private final String getWarnings;
    private final String initialize;

    private setDivider(String str, String str2, String str3, String str4, setHeaderDividersEnabled setheaderdividersenabled, String str5, Map<String, String> map, String str6) {
        this.get = str;
        this.getWarnings = str2;
        this.initialize = str3;
        this.ThreeDS2ServiceInstance = str4;
        this.ThreeDS2Service = setheaderdividersenabled;
        this.cleanup = str5;
        this.getSDKInfo = map;
        this.getSDKVersion = str6;
    }

    public String ThreeDS2Service() {
        int i = createTransaction;
        int i2 = (i & (-70)) | ((~i) & 69);
        int i3 = -(-((i & 69) << 1));
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        ThreeDS2ServiceInitializationCallback = i4;
        String str = this.getWarnings;
        int i5 = i4 & 125;
        int i6 = -(-((i4 ^ 125) | i5));
        createTransaction = ((i5 & i6) + (i5 | i6)) % 128;
        return str;
    }

    public setHeaderDividersEnabled ThreeDS2ServiceInstance() {
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = (i ^ 113) + ((i & 113) << 1);
        createTransaction = i2 % 128;
        int i3 = i2 % 2;
        setHeaderDividersEnabled setheaderdividersenabled = this.ThreeDS2Service;
        if (i3 != 0) {
            return setheaderdividersenabled;
        }
        throw null;
    }

    public String cleanup() {
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = (i ^ 63) + ((i & 63) << 1);
        int i3 = i2 % 128;
        createTransaction = i3;
        int i4 = i2 % 2;
        String str = this.getSDKVersion;
        if (i4 == 0) {
            throw null;
        }
        ThreeDS2ServiceInitializationCallback = ((i3 & 43) + (i3 | 43)) % 128;
        return str;
    }

    public String createTransaction() {
        int i = createTransaction;
        int i2 = i ^ 11;
        int i3 = (((i & 11) | i2) << 1) - i2;
        ThreeDS2ServiceInitializationCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.cleanup;
        if (i4 == 0) {
            return str;
        }
        throw null;
    }

    public String get() {
        int i = createTransaction;
        int i2 = ((i & 36) + (i | 36)) - 1;
        ThreeDS2ServiceInitializationCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.initialize;
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    public Map<String, String> getSDKInfo() {
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = i ^ 17;
        int i3 = -(-((i & 17) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        createTransaction = i4 % 128;
        int i5 = i4 % 2;
        Map<String, String> map = this.getSDKInfo;
        if (i5 != 0) {
            return map;
        }
        throw null;
    }

    public String getWarnings() {
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = i & 77;
        int i3 = -(-((i ^ 77) | i2));
        int i4 = (i2 & i3) + (i2 | i3);
        createTransaction = i4 % 128;
        int i5 = i4 % 2;
        String str = this.get;
        if (i5 == 0) {
            int i6 = 70 / 0;
        }
        int i7 = i & 89;
        int i8 = (((i | 89) & (~i7)) - (~(i7 << 1))) - 1;
        createTransaction = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 77 / 0;
        }
        return str;
    }

    public String initialize() {
        int i = createTransaction;
        int i2 = ((i | 7) << 1) - (i ^ 7);
        ThreeDS2ServiceInitializationCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ThreeDS2ServiceInstance;
        if (i3 != 0) {
            throw null;
        }
        int i4 = ((i | 117) << 1) - (i ^ 117);
        ThreeDS2ServiceInitializationCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final class getWarnings {
        private static int ThreeDS2ServiceInitializationCallback = 1;
        private static int getSDKInfo;
        private String ThreeDS2Service;
        private String ThreeDS2ServiceInstance;
        private String cleanup;
        private String createTransaction;
        private setHeaderDividersEnabled get;
        private Map<String, String> getSDKVersion;
        private String getWarnings;
        private String initialize;

        public getWarnings ThreeDS2Service(String str) {
            int i = getSDKInfo;
            int i2 = (-2) - ((((i | 84) << 1) - (i ^ 84)) ^ (-1));
            ThreeDS2ServiceInitializationCallback = i2 % 128;
            if (i2 % 2 == 0) {
                this.initialize = str;
                int i3 = 1 / 0;
            } else {
                this.initialize = str;
            }
            int i4 = i & 115;
            int i5 = (i4 - (~((i ^ 115) | i4))) - 1;
            ThreeDS2ServiceInitializationCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 44 / 0;
            }
            return this;
        }

        public getWarnings ThreeDS2ServiceInstance(String str) {
            int i = getSDKInfo;
            int i2 = ((-2) - ((((i | 108) << 1) - (i ^ 108)) ^ (-1))) % 128;
            ThreeDS2ServiceInitializationCallback = i2;
            this.ThreeDS2Service = str;
            int i3 = i2 ^ 43;
            int i4 = (i2 & 43) << 1;
            int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
            getSDKInfo = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 6 / 0;
            }
            return this;
        }

        public getWarnings createTransaction(String str) {
            int i = getSDKInfo + 99;
            int i2 = i % 128;
            ThreeDS2ServiceInitializationCallback = i2;
            if (i % 2 == 0) {
                this.cleanup = str;
                int i3 = 0 / 0;
            } else {
                this.cleanup = str;
            }
            int i4 = i2 + 71;
            getSDKInfo = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 97 / 0;
            }
            return this;
        }

        public getWarnings get(String str) {
            int i = ThreeDS2ServiceInitializationCallback;
            int i2 = (i & (-112)) | ((~i) & 111);
            int i3 = (i & 111) << 1;
            int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
            getSDKInfo = i4 % 128;
            if (i4 % 2 == 0) {
                this.getWarnings = str;
                return this;
            }
            this.getWarnings = str;
            throw null;
        }

        public getWarnings getWarnings(String str) {
            int i = getSDKInfo;
            int i2 = (i ^ 125) + ((i & 125) << 1);
            ThreeDS2ServiceInitializationCallback = i2 % 128;
            if (i2 % 2 != 0) {
                this.createTransaction = str;
                return this;
            }
            this.createTransaction = str;
            throw null;
        }

        public getWarnings initialize(String str) {
            this.ThreeDS2ServiceInstance = str;
            this.getSDKVersion = new HashMap();
            int i = ThreeDS2ServiceInitializationCallback;
            getSDKInfo = ((i & 23) + (i | 23)) % 128;
            return this;
        }

        public getWarnings ThreeDS2ServiceInstance(setHeaderDividersEnabled setheaderdividersenabled) {
            int i = ThreeDS2ServiceInitializationCallback;
            int i2 = i & 121;
            int i3 = -(-((i ^ 121) | i2));
            int i4 = ((i2 & i3) + (i3 | i2)) % 128;
            getSDKInfo = i4;
            this.get = setheaderdividersenabled;
            int i5 = i4 & 109;
            ThreeDS2ServiceInitializationCallback = SVG$Unit$EnumUnboxingLocalUtility.m$1(i5, ~(-(-((i4 ^ 109) | i5))), 1, 128);
            return this;
        }

        public setDivider ThreeDS2Service() {
            setDivider setdivider = new setDivider(this.ThreeDS2ServiceInstance, this.initialize, this.getWarnings, this.ThreeDS2Service, this.get, this.createTransaction, this.getSDKVersion, this.cleanup);
            int i = getSDKInfo;
            int i2 = i & 117;
            int i3 = (i | 117) & (~i2);
            int i4 = -(-(i2 << 1));
            ThreeDS2ServiceInitializationCallback = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
            return setdivider;
        }
    }
}
