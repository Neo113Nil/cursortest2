package com.netcetera.threeds.sdk.infrastructure;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
class setMapTrackballToArrowKeys implements setWebViewClient {
    private static int cleanup = 1;
    private static int get;
    private final String ThreeDS2Service;
    private final String ThreeDS2ServiceInstance;
    private final Map<String, String> getWarnings;
    private final String initialize;

    private setMapTrackballToArrowKeys(String str, String str2, String str3, Map<String, String> map) {
        this.ThreeDS2Service = str;
        this.ThreeDS2ServiceInstance = str2;
        this.initialize = str3;
        this.getWarnings = map;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setWebViewClient
    public String ThreeDS2Service() {
        int i = cleanup;
        int i2 = (((i | 104) << 1) - (i ^ 104)) - 1;
        int i3 = i2 % 128;
        get = i3;
        int i4 = i2 % 2;
        String str = this.initialize;
        if (i4 != 0) {
            throw null;
        }
        cleanup = (((i3 & (-114)) | ((~i3) & 113)) + ((i3 & 113) << 1)) % 128;
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setWebViewClient
    public setVerticalScrollbarOverlay ThreeDS2ServiceInstance() {
        setVerticalScrollbarOverlay setverticalscrollbaroverlay = new setVerticalScrollbarOverlay(this.ThreeDS2ServiceInstance.getBytes(StandardCharsets.UTF_8));
        int i = get;
        int i2 = ((i & 24) + (i | 24)) - 1;
        cleanup = i2 % 128;
        if (i2 % 2 != 0) {
            return setverticalscrollbaroverlay;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setWebViewClient
    public Map<String, String> getWarnings() {
        int i = get;
        Map<String, String> map = this.getWarnings;
        int i2 = ((i & 36) + (i | 36)) - 1;
        cleanup = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 29 / 0;
        }
        return map;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setWebViewClient
    public String initialize() {
        int i = (cleanup + 41) % 128;
        get = i;
        String str = this.ThreeDS2Service;
        int i2 = (i & 79) + (i | 79);
        cleanup = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 60 / 0;
        }
        return str;
    }

    public static class getWarnings {
        private static int ThreeDS2ServiceInitializationCallback = 1;
        private static int initialize;
        private final String ThreeDS2Service;
        private final String get;
        private String getWarnings = "";
        private final Map<String, String> ThreeDS2ServiceInstance = new HashMap();

        public getWarnings(String str, String str2) {
            this.ThreeDS2Service = str;
            this.get = str2;
        }

        public getWarnings ThreeDS2ServiceInstance(Map<String, String> map) {
            int i = ThreeDS2ServiceInitializationCallback;
            initialize = ((i ^ 101) + ((i & 101) << 1)) % 128;
            if (map != null) {
                initialize = ((((i ^ 103) | (i & 103)) << 1) - (((~i) & 103) | (i & (-104)))) % 128;
                if (map.size() > 0) {
                    int i2 = initialize;
                    int i3 = i2 & 73;
                    int i4 = -(-((i2 ^ 73) | i3));
                    ThreeDS2ServiceInitializationCallback = ((i3 ^ i4) + ((i4 & i3) << 1)) % 128;
                    int i5 = ThreeDS2ServiceInitializationCallback;
                    initialize = SVG$Unit$EnumUnboxingLocalUtility.m$1((i5 & (-92)) | ((~i5) & 91), ~((i5 & 91) << 1), 1, 128);
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        initialize = (ThreeDS2ServiceInitializationCallback + 27) % 128;
                        ThreeDS2ServiceInstance(entry.getKey(), entry.getValue());
                        int i6 = ThreeDS2ServiceInitializationCallback;
                        int i7 = i6 & 53;
                        initialize = (i7 + ((i6 ^ 53) | i7)) % 128;
                    }
                }
            }
            int i8 = ThreeDS2ServiceInitializationCallback;
            int i9 = (i8 & (-20)) | ((~i8) & 19);
            int i10 = -(-((i8 & 19) << 1));
            int i11 = (i9 & i10) + (i10 | i9);
            initialize = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 83 / 0;
            }
            return this;
        }

        public getWarnings getWarnings(String str) {
            int i = (ThreeDS2ServiceInitializationCallback + 119) % 128;
            initialize = i;
            this.getWarnings = str;
            int i2 = (i & (-8)) | ((~i) & 7);
            int i3 = (i & 7) << 1;
            int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
            ThreeDS2ServiceInitializationCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
        
            if (com.netcetera.threeds.sdk.infrastructure.oj.ThreeDS2ServiceInstance(r5, r6) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
        
            if (com.netcetera.threeds.sdk.infrastructure.oj.ThreeDS2ServiceInstance(r0) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
        
            r4.ThreeDS2ServiceInstance.put(r5, r6);
            r5 = com.netcetera.threeds.sdk.infrastructure.setMapTrackballToArrowKeys.getWarnings.initialize;
            r6 = r5 & 113;
            r5 = (r5 | 113) & (~r6);
            r6 = r6 << 1;
            com.netcetera.threeds.sdk.infrastructure.setMapTrackballToArrowKeys.getWarnings.ThreeDS2ServiceInitializationCallback = ((r5 & r6) + (r5 | r6)) % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public getWarnings ThreeDS2ServiceInstance(String str, String str2) {
            int i = ThreeDS2ServiceInitializationCallback;
            int i2 = i ^ 101;
            int i3 = (((i & 101) | i2) << 1) - i2;
            initialize = i3 % 128;
            if (i3 % 2 != 0) {
                CharSequence[] charSequenceArr = new CharSequence[3];
                charSequenceArr[0] = str;
                charSequenceArr[0] = str2;
            }
            int i4 = ThreeDS2ServiceInitializationCallback;
            initialize = (((i4 | 91) << 1) - (i4 ^ 91)) % 128;
            return this;
        }

        public setMapTrackballToArrowKeys ThreeDS2ServiceInstance() {
            setMapTrackballToArrowKeys setmaptrackballtoarrowkeys = new setMapTrackballToArrowKeys(this.ThreeDS2Service, this.getWarnings, this.get, this.ThreeDS2ServiceInstance);
            int i = initialize;
            int i2 = (i | 25) << 1;
            int i3 = -(((~i) & 25) | (i & (-26)));
            ThreeDS2ServiceInitializationCallback = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
            return setmaptrackballtoarrowkeys;
        }
    }
}
