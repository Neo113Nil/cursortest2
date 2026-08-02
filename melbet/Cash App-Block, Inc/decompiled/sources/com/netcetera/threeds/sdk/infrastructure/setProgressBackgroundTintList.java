package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes5.dex */
public class setProgressBackgroundTintList {
    private static int configureScheme = 0;
    private static int restrictedParameters = 1;
    private final List<String> ConfigParameters;
    private final Map<String, String> ConfigurationBuilder;
    private final String ThreeDS2Service;
    private final String ThreeDS2ServiceInitializationCallback;
    private final String ThreeDS2ServiceInstance;
    private final String addParam;
    private final String apiKey;
    private final String cleanup;
    private final String createTransaction;
    private final String get;
    private final String getParamValue;
    private final String getSDKInfo;
    private final String getSDKVersion;
    private final String getWarnings;
    private final String initialize;
    private final String onCompleted;
    private final String onError;
    private final String removeParam;

    private setProgressBackgroundTintList(String str, String str2, String str3, List<String> list, String str4, String str5, String str6, String str7, String str8, String str9, Map<String, String> map, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        this.getWarnings = str;
        this.get = str2;
        this.getSDKVersion = str3;
        this.ConfigParameters = list;
        this.onError = str4;
        this.onCompleted = str5;
        this.getParamValue = str6;
        this.addParam = str7;
        this.apiKey = str8;
        this.removeParam = str9;
        this.ConfigurationBuilder = map;
        this.ThreeDS2Service = str10;
        this.ThreeDS2ServiceInstance = str11;
        this.initialize = str12;
        this.getSDKInfo = str13;
        this.ThreeDS2ServiceInitializationCallback = str14;
        this.createTransaction = str15;
        this.cleanup = str16;
    }

    public String ConfigParameters() {
        int i = restrictedParameters;
        String str = this.onError;
        int i2 = i & 53;
        int i3 = -(-((i ^ 53) | i2));
        configureScheme = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        return str;
    }

    public String ConfigurationBuilder() {
        int i = configureScheme;
        int i2 = i & 121;
        int i3 = (i ^ 121) | i2;
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        restrictedParameters = i4;
        String str = this.apiKey;
        int i5 = i4 & 57;
        configureScheme = (i5 + ((i4 ^ 57) | i5)) % 128;
        return str;
    }

    public String ThreeDS2Service() {
        int i = configureScheme;
        int i2 = (((i & (-2)) | ((~i) & 1)) + ((i & 1) << 1)) % 128;
        restrictedParameters = i2;
        String str = this.getSDKInfo;
        int i3 = i2 + 23;
        configureScheme = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String ThreeDS2ServiceInitializationCallback() {
        System.identityHashCode(this);
        System.identityHashCode(this);
        String str = this.getSDKVersion;
        int i = restrictedParameters;
        int i2 = i & 63;
        int i3 = (i2 - (~((i ^ 63) | i2))) - 1;
        configureScheme = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 14 / 0;
        }
        return str;
    }

    public String ThreeDS2ServiceInstance() {
        int i = configureScheme + 109;
        restrictedParameters = i % 128;
        int i2 = i % 2;
        String str = this.ThreeDS2ServiceInitializationCallback;
        if (i2 != 0) {
            return str;
        }
        throw null;
    }

    public List<String> addParam() {
        int i = configureScheme;
        int i2 = ((i | 23) << 1) - (i ^ 23);
        restrictedParameters = i2 % 128;
        int i3 = i2 % 2;
        List<String> list = this.ConfigParameters;
        if (i3 == 0) {
            throw null;
        }
        int i4 = (i & 96) + (i | 96);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        restrictedParameters = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
        return list;
    }

    public Map<String, String> apiKey() {
        int i = configureScheme;
        int i2 = i & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i3 = i | EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = i4 % 128;
        restrictedParameters = i5;
        int i6 = i4 % 2;
        Map<String, String> map = this.ConfigurationBuilder;
        if (i6 == 0) {
            int i7 = 80 / 0;
        }
        int i8 = ((i5 & 38) + (i5 | 38)) - 1;
        configureScheme = i8 % 128;
        if (i8 % 2 == 0) {
            return map;
        }
        throw null;
    }

    public String cleanup() {
        int i = restrictedParameters;
        int i2 = i & 93;
        int i3 = (i2 + ((i ^ 93) | i2)) % 128;
        configureScheme = i3;
        String str = this.getWarnings;
        int i4 = i3 & 81;
        int i5 = ((i3 ^ 81) | i4) << 1;
        int i6 = -((i3 | 81) & (~i4));
        int i7 = (i5 & i6) + (i5 | i6);
        restrictedParameters = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 5 / 0;
        }
        return str;
    }

    public String createTransaction() {
        int i = restrictedParameters;
        int i2 = i & 111;
        int i3 = (i ^ 111) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = i4 % 128;
        configureScheme = i5;
        int i6 = i4 % 2;
        String str = this.createTransaction;
        if (i6 != 0) {
            throw null;
        }
        restrictedParameters = (i5 + 71) % 128;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0148, code lost:
    
        if (java.util.Objects.equals(r0, r8.ThreeDS2ServiceInstance) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0153, code lost:
    
        r0 = com.netcetera.threeds.sdk.infrastructure.setProgressBackgroundTintList.configureScheme;
        r1 = r0 & 31;
        r0 = -(-((r0 ^ 31) | r1));
        r5 = ((r1 | r0) << 1) - (r0 ^ r1);
        com.netcetera.threeds.sdk.infrastructure.setProgressBackgroundTintList.restrictedParameters = r5 % 128;
        r5 = r5 % 2;
        r0 = r7.initialize;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0169, code lost:
    
        if (r5 != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x016b, code lost:
    
        r1 = 94 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0174, code lost:
    
        if (java.util.Objects.equals(r0, r8.initialize) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x017f, code lost:
    
        r0 = com.netcetera.threeds.sdk.infrastructure.setProgressBackgroundTintList.configureScheme;
        r1 = (r0 | 121) << 1;
        r0 = -(((~r0) & 121) | (r0 & (-122)));
        r5 = (r1 & r0) + (r0 | r1);
        com.netcetera.threeds.sdk.infrastructure.setProgressBackgroundTintList.restrictedParameters = r5 % 128;
        r5 = r5 % 2;
        r0 = r7.getSDKInfo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0197, code lost:
    
        if (r5 == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x019f, code lost:
    
        if (java.util.Objects.equals(r0, r8.getSDKInfo) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01a9, code lost:
    
        if (java.util.Objects.equals(r7.ThreeDS2ServiceInitializationCallback, r8.ThreeDS2ServiceInitializationCallback) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01ab, code lost:
    
        com.netcetera.threeds.sdk.infrastructure.setProgressBackgroundTintList.restrictedParameters = (com.netcetera.threeds.sdk.infrastructure.setProgressBackgroundTintList.configureScheme + 19) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01bb, code lost:
    
        if (java.util.Objects.equals(r7.createTransaction, r8.createTransaction) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01bd, code lost:
    
        r0 = (-2) - ((com.netcetera.threeds.sdk.infrastructure.setProgressBackgroundTintList.configureScheme + 36) ^ (-1));
        com.netcetera.threeds.sdk.infrastructure.setProgressBackgroundTintList.restrictedParameters = r0 % 128;
        r0 = r0 % 2;
        r7 = r7.cleanup;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01cd, code lost:
    
        if (r0 == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01d5, code lost:
    
        if (java.util.Objects.equals(r7, r8.cleanup) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01d7, code lost:
    
        r7 = com.netcetera.threeds.sdk.infrastructure.setProgressBackgroundTintList.restrictedParameters;
        com.netcetera.threeds.sdk.infrastructure.setProgressBackgroundTintList.configureScheme = (((r7 | 83) << 1) - (r7 ^ 83)) % 128;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e5, code lost:
    
        java.util.Objects.equals(r7, r8.cleanup);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ea, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01eb, code lost:
    
        java.util.Objects.equals(r0, r8.getSDKInfo);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01f0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017d, code lost:
    
        if (java.util.Objects.equals(r0, r8.initialize) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0151, code lost:
    
        if (java.util.Objects.equals(r0, r8.ThreeDS2ServiceInstance) != false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        int i;
        int i2 = restrictedParameters;
        int i3 = i2 & 55;
        int i4 = -(-(i2 | 55));
        configureScheme = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
        if (this == obj) {
            configureScheme = ((((i2 ^ 43) | (i2 & 43)) << 1) - ((i2 & (-44)) | ((~i2) & 43))) % 128;
            return true;
        }
        if (!(obj instanceof setProgressBackgroundTintList)) {
            int i5 = i2 | 121;
            int i6 = ((i5 << 1) - (i5 & (~(i2 & 121)))) % 128;
            configureScheme = i6;
            int i7 = i6 & 57;
            int i8 = (i6 | 57) & (~i7);
            int i9 = -(-(i7 << 1));
            restrictedParameters = ((i8 & i9) + (i9 | i8)) % 128;
            return false;
        }
        setProgressBackgroundTintList setprogressbackgroundtintlist = (setProgressBackgroundTintList) obj;
        if (Objects.equals(this.getWarnings, setprogressbackgroundtintlist.getWarnings)) {
            int i10 = restrictedParameters;
            int i11 = i10 & 11;
            int i12 = -(-((i10 ^ 11) | i11));
            configureScheme = ((i11 ^ i12) + ((i12 & i11) << 1)) % 128;
            if (Objects.equals(this.getSDKVersion, setprogressbackgroundtintlist.getSDKVersion)) {
                int i13 = configureScheme;
                int i14 = (i13 & 65) + (i13 | 65);
                restrictedParameters = i14 % 128;
                int i15 = i14 % 2;
                List<String> list = this.ConfigParameters;
                if (i15 == 0) {
                    Objects.equals(list, setprogressbackgroundtintlist.ConfigParameters);
                    throw null;
                }
                if (Objects.equals(list, setprogressbackgroundtintlist.ConfigParameters)) {
                    int i16 = restrictedParameters;
                    int i17 = (i16 & (-18)) | ((~i16) & 17);
                    int i18 = (i16 & 17) << 1;
                    int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                    configureScheme = i19 % 128;
                    int i20 = i19 % 2;
                    String str = this.onError;
                    if (i20 != 0) {
                        Objects.equals(str, setprogressbackgroundtintlist.onError);
                        throw null;
                    }
                    if (Objects.equals(str, setprogressbackgroundtintlist.onError) && Objects.equals(this.onCompleted, setprogressbackgroundtintlist.onCompleted)) {
                        int i21 = restrictedParameters;
                        int i22 = (i21 ^ 75) + ((i21 & 75) << 1);
                        configureScheme = i22 % 128;
                        int i23 = i22 % 2;
                        String str2 = this.getParamValue;
                        if (i23 != 0) {
                            Objects.equals(str2, setprogressbackgroundtintlist.getParamValue);
                            throw null;
                        }
                        if (Objects.equals(str2, setprogressbackgroundtintlist.getParamValue) && Objects.equals(this.addParam, setprogressbackgroundtintlist.addParam)) {
                            int i24 = restrictedParameters;
                            configureScheme = (((i24 | 57) << 1) - (i24 ^ 57)) % 128;
                            if (Objects.equals(this.apiKey, setprogressbackgroundtintlist.apiKey)) {
                                int i25 = restrictedParameters;
                                int i26 = ((i25 | 93) << 1) - (i25 ^ 93);
                                configureScheme = i26 % 128;
                                int i27 = i26 % 2;
                                String str3 = this.removeParam;
                                if (i27 != 0) {
                                    Objects.equals(str3, setprogressbackgroundtintlist.removeParam);
                                    throw null;
                                }
                                if (Objects.equals(str3, setprogressbackgroundtintlist.removeParam)) {
                                    int i28 = restrictedParameters;
                                    configureScheme = ((((i28 ^ 63) | (i28 & 63)) << 1) - (((~i28) & 63) | (i28 & (-64)))) % 128;
                                    if (Objects.equals(this.ThreeDS2Service, setprogressbackgroundtintlist.ThreeDS2Service)) {
                                        int i29 = configureScheme;
                                        int i30 = (i29 | 113) << 1;
                                        int i31 = -(i29 ^ 113);
                                        int i32 = (i30 & i31) + (i31 | i30);
                                        restrictedParameters = i32 % 128;
                                        int i33 = i32 % 2;
                                        String str4 = this.ThreeDS2ServiceInstance;
                                        if (i33 == 0) {
                                            int i34 = 6 / 0;
                                        }
                                        int i35 = configureScheme;
                                        int i36 = i35 ^ 27;
                                        int i37 = -(-((i35 & 27) << 1));
                                        i = ((i36 | i37) << 1) - (i37 ^ i36);
                                        restrictedParameters = i % 128;
                                        if (i % 2 == 0) {
                                            int i38 = 23 / 0;
                                        }
                                        return r7;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i39 = restrictedParameters;
        int i40 = i39 & 93;
        int i41 = (i39 ^ 93) | i40;
        configureScheme = ((i40 & i41) + (i41 | i40)) % 128;
        boolean z = false;
        int i352 = configureScheme;
        int i362 = i352 ^ 27;
        int i372 = -(-((i352 & 27) << 1));
        i = ((i362 | i372) << 1) - (i372 ^ i362);
        restrictedParameters = i % 128;
        if (i % 2 == 0) {
        }
        return z;
    }

    public String get() {
        int i = restrictedParameters;
        int i2 = i & 19;
        int i3 = (i2 + ((i ^ 19) | i2)) % 128;
        configureScheme = i3;
        String str = this.ThreeDS2ServiceInstance;
        int i4 = ((i3 | 50) << 1) - (i3 ^ 50);
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        restrictedParameters = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return str;
    }

    public String getParamValue() {
        int i = (-2) - ((configureScheme + 48) ^ (-1));
        restrictedParameters = i % 128;
        int i2 = i % 2;
        String str = this.getParamValue;
        if (i2 != 0) {
            return str;
        }
        throw null;
    }

    public String getSDKInfo() {
        int i = configureScheme;
        String str = this.cleanup;
        int i2 = (i ^ 93) + ((i & 93) << 1);
        restrictedParameters = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 15 / 0;
        }
        return str;
    }

    public String getSDKVersion() {
        int i = configureScheme;
        int i2 = (i & 71) + (i | 71);
        int i3 = i2 % 128;
        restrictedParameters = i3;
        int i4 = i2 % 2;
        String str = this.get;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 & 113;
        configureScheme = SVG$Unit$EnumUnboxingLocalUtility.m$1(i5, ~((i3 ^ 113) | i5), 1, 128);
        return str;
    }

    public String getWarnings() {
        int i = restrictedParameters;
        int i2 = ((i ^ 75) - (~(-(-((i & 75) << 1))))) - 1;
        int i3 = i2 % 128;
        configureScheme = i3;
        int i4 = i2 % 2;
        String str = this.initialize;
        if (i4 != 0) {
            int i5 = 89 / 0;
        }
        int i6 = (i3 | 65) << 1;
        int i7 = -(((~i3) & 65) | (i3 & (-66)));
        restrictedParameters = ((i6 & i7) + (i7 | i6)) % 128;
        return str;
    }

    public int hashCode() {
        int i = configureScheme;
        restrictedParameters = ((((i | 86) << 1) - (i ^ 86)) - 1) % 128;
        int hash = Objects.hash(this.getWarnings, this.getSDKVersion, this.ConfigParameters, this.onError, this.onCompleted, this.getParamValue, this.addParam, this.apiKey, this.removeParam, this.ThreeDS2Service, this.ThreeDS2ServiceInstance, this.initialize, this.getSDKInfo, this.ThreeDS2ServiceInitializationCallback, this.createTransaction, this.cleanup);
        int i2 = configureScheme;
        int i3 = i2 & 107;
        int i4 = (i2 ^ 107) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        restrictedParameters = i5 % 128;
        if (i5 % 2 != 0) {
            return hash;
        }
        throw null;
    }

    public String initialize() {
        int i = configureScheme;
        int i2 = i & 103;
        int i3 = (i | 103) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        int i6 = i5 % 128;
        restrictedParameters = i6;
        int i7 = i5 % 2;
        String str = this.ThreeDS2Service;
        if (i7 == 0) {
            throw null;
        }
        int i8 = (i6 & (-94)) | ((~i6) & 93);
        int i9 = -(-((i6 & 93) << 1));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        configureScheme = i10 % 128;
        if (i10 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String onCompleted() {
        int i = restrictedParameters + 19;
        configureScheme = i % 128;
        int i2 = i % 2;
        String str = this.onCompleted;
        if (i2 != 0) {
            int i3 = 86 / 0;
        }
        return str;
    }

    public String onError() {
        int i = configureScheme;
        int i2 = i & 115;
        int i3 = ((i ^ 115) | i2) << 1;
        int i4 = -((i | 115) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        restrictedParameters = i5 % 128;
        int i6 = i5 % 2;
        String str = this.addParam;
        if (i6 != 0) {
            return str;
        }
        throw null;
    }

    public String restrictedParameters() {
        int i = restrictedParameters;
        int i2 = ((((i ^ 103) | (i & 103)) << 1) - (((~i) & 103) | (i & (-104)))) % 128;
        configureScheme = i2;
        String str = this.removeParam;
        int i3 = ((i2 ^ 69) - (~((i2 & 69) << 1))) - 1;
        restrictedParameters = i3 % 128;
        if (i3 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class getWarnings {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static long apiKey;
        private static int removeParam;
        private static int visaSchemeConfiguration;
        private String ConfigParameters;
        private String ConfigurationBuilder;
        private final Map<String, String> ThreeDS2Service;
        private String ThreeDS2ServiceInitializationCallback;
        private String ThreeDS2ServiceInstance;
        private String addParam;
        private String cleanup;
        private String configureScheme;
        private List<String> createTransaction;
        private final String get;
        private String getParamValue;
        private String getSDKInfo;
        private String getSDKVersion;
        private final String getWarnings;
        private final String initialize;
        private String onCompleted;
        private String onError;
        private String restrictedParameters;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            removeParam = 0;
            visaSchemeConfiguration = 1;
            apiKey = -7506238066325322465L;
        }

        public getWarnings(String str, String str2) {
            this.get = str;
            this.initialize = str2;
            Object[] objArr = new Object[1];
            a("挟䠌捞發䆸\ue859㙮ꅻ\ue39c楂띺", KeyEvent.keyCodeFromString("") + 1, objArr);
            this.getWarnings = ((String) objArr[0]).intern();
            this.ThreeDS2Service = new HashMap();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0025, code lost:
        
            com.netcetera.threeds.sdk.infrastructure.setProgressBackgroundTintList.getWarnings.$10 = (r3 + 5) % 128;
            r3 = r16.toCharArray();
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0023, code lost:
        
            if (r16 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
        
            if (r16 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:
        
            r3 = r16;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(String str, int i, Object[] objArr) {
            char[] charArray;
            int i2 = $11;
            int i3 = i2 + 33;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 74 / 0;
            }
            onCompleted oncompleted = new onCompleted();
            char[] initialize = onCompleted.initialize(apiKey ^ (-2776494906517314268L), charArray, i);
            oncompleted.initialize = 4;
            while (true) {
                int i5 = oncompleted.initialize;
                if (i5 >= initialize.length) {
                    objArr[0] = new String(initialize, 4, initialize.length - 4);
                    return;
                }
                int i6 = i5 - 4;
                oncompleted.ThreeDS2Service = i6;
                try {
                    Object[] objArr2 = {Long.valueOf(initialize[i5] ^ initialize[i5 % 4]), Long.valueOf(i6), Long.valueOf(apiKey)};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-1242395160);
                    if (obj == null) {
                        Class cls = (Class) removeParam.initialize(48 - (Process.myTid() >> 22), (char) (27780 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 2440 - Process.getGidForName(""));
                        Object[] objArr3 = new Object[1];
                        b((byte) -1, (byte) 0, 0, objArr3);
                        String str2 = (String) objArr3[0];
                        Class cls2 = Long.TYPE;
                        obj = cls.getMethod(str2, cls2, cls2, cls2);
                        map.put(-1242395160, obj);
                    }
                    initialize[i5] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    Object[] objArr4 = {oncompleted, oncompleted};
                    Object obj2 = map.get(1526822639);
                    if (obj2 == null) {
                        obj2 = ((Class) removeParam.initialize(66 - Color.blue(0), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 14235 - View.getDefaultSize(0, 0))).getMethod("s", Object.class, Object.class);
                        map.put(1526822639, obj2);
                    }
                    ((Method) obj2).invoke(null, objArr4);
                    $11 = ($10 + 57) % 128;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(byte b, byte b2, int i, Object[] objArr) {
            int i2;
            int i3 = b + 4;
            int i4 = b2 * 3;
            byte[] bArr = $$a;
            int i5 = 112 - (i * 2);
            byte[] bArr2 = new byte[i4 + 1];
            if (bArr == null) {
                int i6 = i3;
                byte[] bArr3 = bArr;
                int i7 = 0;
                int i8 = i4;
                int i9 = (-i3) + i8;
                int i10 = i6;
                i5 = i9;
                i3 = i10;
                bArr = bArr3;
                i2 = i7;
                int i11 = i3 + 1;
                bArr2[i2] = (byte) i5;
                i7 = i2 + 1;
                if (i2 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i12 = i5;
                i6 = i11;
                i3 = bArr[i11];
                bArr3 = bArr;
                i8 = i12;
                int i92 = (-i3) + i8;
                int i102 = i6;
                i5 = i92;
                i3 = i102;
                bArr = bArr3;
                i2 = i7;
                int i112 = i3 + 1;
                bArr2[i2] = (byte) i5;
                i7 = i2 + 1;
                if (i2 == i4) {
                }
            } else {
                i2 = 0;
                int i1122 = i3 + 1;
                bArr2[i2] = (byte) i5;
                i7 = i2 + 1;
                if (i2 == i4) {
                }
            }
        }

        public static void init$0() {
            $$a = new byte[]{98, 4, -35, -97};
            $$b = 102;
        }

        public getWarnings ConfigParameters(String str) {
            int i = removeParam;
            int i2 = i + 29;
            visaSchemeConfiguration = i2 % 128;
            if (i2 % 2 == 0) {
                this.restrictedParameters = str;
                throw null;
            }
            this.restrictedParameters = str;
            int i3 = i + 49;
            visaSchemeConfiguration = i3 % 128;
            if (i3 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public getWarnings ThreeDS2Service(String str) {
            int i = visaSchemeConfiguration + 95;
            int i2 = i % 128;
            removeParam = i2;
            if (i % 2 != 0) {
                this.cleanup = str;
                int i3 = 19 / 0;
            } else {
                this.cleanup = str;
            }
            visaSchemeConfiguration = (i2 + 125) % 128;
            return this;
        }

        public getWarnings ThreeDS2ServiceInitializationCallback(String str) {
            int i = removeParam;
            this.onCompleted = str;
            visaSchemeConfiguration = (i + 45) % 128;
            return this;
        }

        public setProgressBackgroundTintList ThreeDS2ServiceInstance() {
            setProgressBackgroundTintList setprogressbackgroundtintlist = new setProgressBackgroundTintList((String) oj.getWarnings(this.get, ""), (String) oj.getWarnings(this.initialize, ""), (String) oj.getWarnings(this.ThreeDS2ServiceInitializationCallback, ""), (List) og.ThreeDS2Service(this.createTransaction, new ArrayList()), (String) oj.getWarnings(this.getSDKVersion, ""), (String) oj.getWarnings(this.cleanup, ""), (String) oj.getWarnings(this.getSDKInfo, ""), (String) oj.getWarnings(this.getParamValue, ""), (String) oj.getWarnings(this.ConfigParameters, ""), (String) oj.getWarnings(this.addParam, ""), (Map) og.ThreeDS2Service(this.ThreeDS2Service, new HashMap()), (String) oj.getWarnings(this.onCompleted, ""), (String) oj.getWarnings(this.getWarnings, ""), (String) oj.getWarnings(this.onError, ""), (String) oj.getWarnings(this.restrictedParameters, ""), (String) oj.getWarnings(this.configureScheme, ""), (String) oj.getWarnings(this.ConfigurationBuilder, ""), (String) oj.getWarnings(this.ThreeDS2ServiceInstance, ""));
            int i = removeParam + 79;
            visaSchemeConfiguration = i % 128;
            if (i % 2 != 0) {
                return setprogressbackgroundtintlist;
            }
            throw null;
        }

        public getWarnings addParam(String str) {
            int i = (visaSchemeConfiguration + 35) % 128;
            removeParam = i;
            this.configureScheme = str;
            visaSchemeConfiguration = (i + 125) % 128;
            return this;
        }

        public getWarnings cleanup(String str) {
            int i = removeParam;
            this.getParamValue = str;
            visaSchemeConfiguration = (i + 69) % 128;
            return this;
        }

        public getWarnings createTransaction(String str) {
            int i = removeParam + 99;
            int i2 = i % 128;
            visaSchemeConfiguration = i2;
            if (i % 2 == 0) {
                this.addParam = str;
                throw null;
            }
            this.addParam = str;
            int i3 = i2 + 113;
            removeParam = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 52 / 0;
            }
            return this;
        }

        public getWarnings get(String str) {
            int i = removeParam + 35;
            visaSchemeConfiguration = i % 128;
            if (i % 2 != 0) {
                this.ThreeDS2ServiceInitializationCallback = str;
                return this;
            }
            this.ThreeDS2ServiceInitializationCallback = str;
            throw null;
        }

        public getWarnings getParamValue(String str) {
            int i = visaSchemeConfiguration + 43;
            int i2 = i % 128;
            removeParam = i2;
            if (i % 2 != 0) {
                this.ConfigurationBuilder = str;
                throw null;
            }
            this.ConfigurationBuilder = str;
            int i3 = i2 + 105;
            visaSchemeConfiguration = i3 % 128;
            if (i3 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public getWarnings getSDKInfo(String str) {
            int i = (removeParam + 113) % 128;
            visaSchemeConfiguration = i;
            this.onError = str;
            int i2 = i + 95;
            removeParam = i2 % 128;
            if (i2 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public getWarnings getSDKVersion(String str) {
            int i = visaSchemeConfiguration;
            this.ConfigParameters = str;
            int i2 = i + 55;
            removeParam = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 81 / 0;
            }
            return this;
        }

        public getWarnings getWarnings(String str) {
            int i = removeParam;
            int i2 = i + 45;
            visaSchemeConfiguration = i2 % 128;
            if (i2 % 2 == 0) {
                this.getSDKVersion = str;
                throw null;
            }
            this.getSDKVersion = str;
            int i3 = i + 53;
            visaSchemeConfiguration = i3 % 128;
            if (i3 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public getWarnings initialize(String str) {
            int i = removeParam + 3;
            visaSchemeConfiguration = i % 128;
            int i2 = i % 2;
            List<String> list = this.createTransaction;
            if (i2 == 0) {
                throw null;
            }
            if (list == null) {
                this.createTransaction = new ArrayList();
                visaSchemeConfiguration = (removeParam + 113) % 128;
            }
            this.createTransaction.add(str);
            return this;
        }

        public getWarnings onError(String str) {
            int i = removeParam + 107;
            visaSchemeConfiguration = i % 128;
            if (i % 2 != 0) {
                this.ThreeDS2ServiceInstance = str;
                return this;
            }
            this.ThreeDS2ServiceInstance = str;
            int i2 = 21 / 0;
            return this;
        }

        public getWarnings ThreeDS2ServiceInstance(Map<String, String> map) {
            removeParam = (visaSchemeConfiguration + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            this.ThreeDS2Service.putAll(map);
            int i = visaSchemeConfiguration + 69;
            removeParam = i % 128;
            if (i % 2 == 0) {
                return this;
            }
            throw null;
        }

        public getWarnings ThreeDS2ServiceInstance(String str) {
            int i = visaSchemeConfiguration + 97;
            removeParam = i % 128;
            if (i % 2 == 0) {
                this.getSDKInfo = str;
                return this;
            }
            this.getSDKInfo = str;
            throw null;
        }
    }
}
