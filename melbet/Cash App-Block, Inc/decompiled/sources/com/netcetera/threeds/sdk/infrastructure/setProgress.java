package com.netcetera.threeds.sdk.infrastructure;

import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes5.dex */
public class setProgress {
    private static int cleanup = 1;
    private static int getSDKInfo;
    private final String ThreeDS2Service;
    private final String ThreeDS2ServiceInitializationCallback;
    private final String ThreeDS2ServiceInstance;
    private final Map<String, String> createTransaction;
    private final String get;
    private final String getWarnings;
    private final String initialize;

    private setProgress(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.initialize = str;
        this.get = str2;
        this.ThreeDS2ServiceInstance = str3;
        this.getWarnings = str4;
        this.ThreeDS2Service = str5;
        this.ThreeDS2ServiceInitializationCallback = str6;
        this.createTransaction = map;
    }

    public String ThreeDS2Service() {
        int i = cleanup;
        int i2 = ((i | 79) << 1) - (i ^ 79);
        getSDKInfo = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ThreeDS2ServiceInstance;
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        return str;
    }

    public String ThreeDS2ServiceInstance() {
        int i = cleanup;
        String str = this.initialize;
        int i2 = (i & (-10)) | ((~i) & 9);
        int i3 = (i & 9) << 1;
        getSDKInfo = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        return str;
    }

    public Map<String, String> cleanup() {
        int i = cleanup;
        int i2 = i & 31;
        int i3 = ((i ^ 31) | i2) << 1;
        int i4 = -((i | 31) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        int i6 = i5 % 128;
        getSDKInfo = i6;
        int i7 = i5 % 2;
        Map<String, String> map = this.createTransaction;
        if (i7 != 0) {
            int i8 = 56 / 0;
        }
        cleanup = SVG$Unit$EnumUnboxingLocalUtility.m$1((i6 | 13) << 1, ~(-(((~i6) & 13) | (i6 & (-14)))), 1, 128);
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        if (java.util.Objects.equals(r0, r7.get) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
    
        if (java.util.Objects.equals(r6.ThreeDS2ServiceInstance, r7.ThreeDS2ServiceInstance) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        r0 = com.netcetera.threeds.sdk.infrastructure.setProgress.cleanup;
        com.netcetera.threeds.sdk.infrastructure.setProgress.getSDKInfo = ((r0 & 53) + (r0 | 53)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00aa, code lost:
    
        if (java.util.Objects.equals(r6.ThreeDS2Service, r7.ThreeDS2Service) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        com.netcetera.threeds.sdk.infrastructure.setProgress.cleanup = (com.netcetera.threeds.sdk.infrastructure.setProgress.getSDKInfo + 15) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bb, code lost:
    
        if (java.util.Objects.equals(r6.ThreeDS2ServiceInitializationCallback, r7.ThreeDS2ServiceInitializationCallback) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bd, code lost:
    
        r6 = com.netcetera.threeds.sdk.infrastructure.setProgress.cleanup;
        r7 = r6 & 37;
        r7 = (r7 + ((r6 ^ 37) | r7)) % 128;
        com.netcetera.threeds.sdk.infrastructure.setProgress.getSDKInfo = r7;
        r6 = r7 & 43;
        com.netcetera.threeds.sdk.infrastructure.setProgress.cleanup = (r6 + ((r7 ^ 43) | r6)) % 128;
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (java.util.Objects.equals(r0, r7.get) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        int i = getSDKInfo;
        int i2 = i | 91;
        int i3 = i2 << 1;
        int i4 = -(i2 & (~(i & 91)));
        cleanup = ((i3 & i4) + (i4 | i3)) % 128;
        if (this == obj) {
            int i5 = i ^ 9;
            int i6 = -(-((i & 9) << 1));
            cleanup = ((i5 ^ i6) + ((i5 & i6) << 1)) % 128;
            return true;
        }
        boolean z = false;
        if (!(obj instanceof setProgress)) {
            int i7 = (i & (-112)) | ((~i) & 111);
            int i8 = -(-((i & 111) << 1));
            int i9 = ((i7 ^ i8) + ((i7 & i8) << 1)) % 128;
            cleanup = i9;
            int i10 = ((((i9 ^ 65) | (i9 & 65)) << 1) - (~(-((i9 & (-66)) | ((~i9) & 65))))) - 1;
            getSDKInfo = i10 % 128;
            if (i10 % 2 == 0) {
                return false;
            }
            throw null;
        }
        setProgress setprogress = (setProgress) obj;
        if (Objects.equals(this.initialize, setprogress.initialize)) {
            int i11 = getSDKInfo;
            int i12 = (i11 ^ 63) + ((i11 & 63) << 1);
            cleanup = i12 % 128;
            int i13 = i12 % 2;
            String str = this.get;
            if (i13 == 0) {
                int i14 = 17 / 0;
            }
            int i15 = cleanup;
            int i16 = i15 & 65;
            getSDKInfo = SVG$Unit$EnumUnboxingLocalUtility.m$1(i16, ~(-(-((i15 ^ 65) | i16))), 1, 128);
            return z;
        }
        int i17 = getSDKInfo;
        cleanup = ((i17 ^ 33) + ((i17 & 33) << 1)) % 128;
        int i152 = cleanup;
        int i162 = i152 & 65;
        getSDKInfo = SVG$Unit$EnumUnboxingLocalUtility.m$1(i162, ~(-(-((i152 ^ 65) | i162))), 1, 128);
        return z;
    }

    public String get() {
        int i = getSDKInfo;
        int i2 = i ^ 11;
        int i3 = (((i & 11) | i2) << 1) - i2;
        int i4 = i3 % 128;
        cleanup = i4;
        int i5 = i3 % 2;
        String str = this.ThreeDS2Service;
        if (i5 == 0) {
            int i6 = 80 / 0;
        }
        getSDKInfo = (i4 + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return str;
    }

    public String getSDKInfo() {
        int i = getSDKInfo;
        String str = this.ThreeDS2ServiceInitializationCallback;
        int i2 = i + 34;
        cleanup = ((i2 ^ (-1)) + (i2 << 1)) % 128;
        return str;
    }

    public String getWarnings() {
        int identityHashCode = System.identityHashCode(this);
        int i = ~identityHashCode;
        int i2 = (197290877 ^ i) | (197290877 & i);
        int i3 = i2 ^ (-1175134173);
        int i4 = i2 & (-1175134173);
        int i5 = -(-((~((i4 & i3) | (i3 ^ i4))) * (-783)));
        int i6 = ((-1232359086) | i5) << 1;
        int i7 = -((i5 & 1232359085) | ((-1232359086) & (~i5)));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        int i9 = (identityHashCode | i) & (~identityHashCode);
        int i10 = i9 & (-1175134173);
        int i11 = ~(((i9 | (-1175134173)) & (~i10)) | i10);
        int i12 = 197290877 & i11;
        int i13 = (i11 | 197290877) & (~i12);
        int i14 = -(-(((i13 & i12) | (i13 ^ i12)) * 783));
        int i15 = i8 & i14;
        int i16 = (i14 | i8) & (~i15);
        int i17 = i15 << 1;
        int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
        int identityHashCode2 = System.identityHashCode(this);
        int i19 = (1270562284 ^ identityHashCode2) | (1270562284 & identityHashCode2);
        int i20 = (i19 | (~i19)) & (~i19);
        int i21 = ((~i20) & (-1610563566)) | (i20 & 1610563565);
        int i22 = i20 & (-1610563566);
        int i23 = (i22 & i21) | (i21 ^ i22);
        int i24 = 1558125377 ^ identityHashCode2;
        int i25 = ~identityHashCode2;
        int i26 = 1558125377 & identityHashCode2;
        int i27 = (i24 & i26) | (i24 ^ i26);
        int i28 = (i27 | (~i27)) & (~i27);
        int i29 = i23 & i28;
        int i30 = (i23 | i28) & (~i29);
        int i31 = 2055812056 - (~(((i30 & i29) | (i30 ^ i29)) * (-754)));
        int i32 = (i31 ^ (-1)) + (i31 << 1);
        int i33 = ((-1610563566) & identityHashCode2) | (1610563565 & i25);
        int i34 = 1610563565 & identityHashCode2;
        int i35 = ~((i33 & i34) | (i33 ^ i34));
        int i36 = ~identityHashCode2;
        int i37 = ((-1270562285) & i36) | (i36 ^ (-1270562285));
        int i38 = ~((1558125377 & i37) | ((-1558125378) & i37) | ((~i37) & 1558125377));
        int i39 = ((i38 & i35) | (i35 ^ i38)) * (-754);
        int i40 = (((i32 | i39) << 1) - (~(-(((~i32) & i39) | ((~i39) & i32))))) - 1;
        int i41 = (identityHashCode2 | i25) & i36;
        int i42 = 1270562284 ^ i41;
        int i43 = i41 & 1270562284;
        int i44 = -(-(((i43 & i42) | (i42 ^ i43)) * 754));
        int i45 = ((i40 | i44) << 1) - (i44 ^ i40);
        String str = this.get;
        if (i18 <= i45) {
            return str;
        }
        throw null;
    }

    public int hashCode() {
        int i = cleanup;
        getSDKInfo = ((i ^ 25) + ((i & 25) << 1)) % 128;
        int hash = Objects.hash(this.initialize, this.get, this.ThreeDS2ServiceInstance, this.ThreeDS2Service, this.ThreeDS2ServiceInitializationCallback);
        int i2 = getSDKInfo;
        int i3 = ((i2 ^ 73) | (i2 & 73)) << 1;
        int i4 = -(((~i2) & 73) | (i2 & (-74)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        cleanup = i5 % 128;
        if (i5 % 2 != 0) {
            return hash;
        }
        throw null;
    }

    public String initialize() {
        int i = getSDKInfo;
        int i2 = ((i ^ 20) + ((i & 20) << 1)) - 1;
        cleanup = i2 % 128;
        int i3 = i2 % 2;
        String str = this.getWarnings;
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
        return str;
    }

    public static final class get {
        private static int ThreeDS2ServiceInitializationCallback = 1;
        private static int getSDKInfo;
        private String ThreeDS2Service;
        private String ThreeDS2ServiceInstance;
        private String cleanup;
        private String get;
        private String getSDKVersion;
        private final Map<String, String> getWarnings = new HashMap();
        private String initialize;

        public get ThreeDS2Service(String str) {
            int i = ThreeDS2ServiceInitializationCallback;
            int i2 = (i & (-110)) | ((~i) & 109);
            int i3 = (i & 109) << 1;
            int i4 = ((i2 & i3) + (i3 | i2)) % 128;
            getSDKInfo = i4;
            this.get = str;
            int i5 = i4 & 11;
            int i6 = ((i4 ^ 11) | i5) << 1;
            int i7 = -((~i5) & (i4 | 11));
            ThreeDS2ServiceInitializationCallback = ((i6 & i7) + (i6 | i7)) % 128;
            return this;
        }

        public get ThreeDS2ServiceInitializationCallback(String str) {
            int i = ThreeDS2ServiceInitializationCallback;
            int i2 = i + 11;
            getSDKInfo = i2 % 128;
            if (i2 % 2 != 0) {
                this.cleanup = str;
                int i3 = 83 / 0;
            } else {
                this.cleanup = str;
            }
            int i4 = i + 98;
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            getSDKInfo = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public get ThreeDS2ServiceInstance(String str) {
            int i = getSDKInfo;
            this.ThreeDS2Service = str;
            int i2 = ((i & (-26)) | ((~i) & 25)) + ((i & 25) << 1);
            ThreeDS2ServiceInitializationCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public setProgress get() {
            setProgress setprogress = new setProgress((String) oj.getWarnings(this.initialize, ""), (String) oj.getWarnings(this.ThreeDS2ServiceInstance, ""), (String) oj.getWarnings(this.get, ""), (String) oj.getWarnings(this.ThreeDS2Service, ""), (String) oj.getWarnings(this.getSDKVersion, ""), (String) oj.getWarnings(this.cleanup, ""), this.getWarnings);
            int i = ThreeDS2ServiceInitializationCallback;
            int i2 = i & 3;
            getSDKInfo = SVG$Unit$EnumUnboxingLocalUtility.m$1(i2, ~((i ^ 3) | i2), 1, 128);
            return setprogress;
        }

        public get getWarnings(Map<String, String> map) {
            int i = getSDKInfo;
            int i2 = i | 107;
            int i3 = ((i2 << 1) - (~(-((~(i & 107)) & i2)))) - 1;
            ThreeDS2ServiceInitializationCallback = i3 % 128;
            int i4 = i3 % 2;
            Map<String, String> map2 = this.getWarnings;
            if (i4 != 0) {
                map2.putAll(map);
                return this;
            }
            map2.putAll(map);
            throw null;
        }

        public get initialize(String str) {
            int i = getSDKInfo;
            int i2 = i & 87;
            int i3 = (i2 + ((i ^ 87) | i2)) % 128;
            ThreeDS2ServiceInitializationCallback = i3;
            this.getSDKVersion = str;
            int i4 = ((i3 | 40) << 1) - (i3 ^ 40);
            int i5 = (i4 ^ (-1)) + (i4 << 1);
            getSDKInfo = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public get getWarnings(String str) {
            int i = getSDKInfo;
            int i2 = (((i & (-108)) | ((~i) & 107)) + ((i & 107) << 1)) % 128;
            ThreeDS2ServiceInitializationCallback = i2;
            this.initialize = str;
            getSDKInfo = ((i2 & 101) + (i2 | 101)) % 128;
            return this;
        }

        public get get(String str) {
            int i = ThreeDS2ServiceInitializationCallback;
            int i2 = (((i & (-64)) | ((~i) & 63)) - (~(-(-((i & 63) << 1))))) - 1;
            getSDKInfo = i2 % 128;
            if (i2 % 2 != 0) {
                this.ThreeDS2ServiceInstance = str;
                int i3 = 81 / 0;
            } else {
                this.ThreeDS2ServiceInstance = str;
            }
            getSDKInfo = (((i | 75) << 1) - (i ^ 75)) % 128;
            return this;
        }
    }
}
