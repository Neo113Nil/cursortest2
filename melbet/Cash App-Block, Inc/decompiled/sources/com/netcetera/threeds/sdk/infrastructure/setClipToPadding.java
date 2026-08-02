package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.api.exceptions.InvalidInputException;
import com.netcetera.threeds.sdk.api.exceptions.SDKAlreadyInitializedException;
import com.netcetera.threeds.sdk.api.exceptions.SDKNotInitializedException;
import com.netcetera.threeds.sdk.api.exceptions.SDKRuntimeException;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
class setClipToPadding implements setTooltipText {
    private static int ThreeDS2Service = 0;
    private static int initialize = 1;
    private final no ThreeDS2ServiceInstance = (no) nu.initialize(new Object[]{setClipToPadding.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private final setOnCapturedPointerListener getWarnings;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.setClipToPadding$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] ThreeDS2Service;
        private static int getWarnings = 0;
        private static int initialize = 1;

        static {
            int[] iArr = new int[setTextAlignment.values().length];
            ThreeDS2Service = iArr;
            try {
                iArr[setTextAlignment.ConfigurationBuilder.ordinal()] = 1;
                int i = initialize;
                int i2 = i ^ 73;
                int i3 = -(-((i & 73) << 1));
                getWarnings = ((i2 & i3) + (i3 | i2)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ThreeDS2Service[setTextAlignment.SchemeConfiguration.ordinal()] = 2;
                int i4 = initialize;
                int i5 = i4 & 53;
                int i6 = (i4 | 53) & (~i5);
                int i7 = i5 << 1;
                getWarnings = ((i6 ^ i7) + ((i6 & i7) << 1)) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ThreeDS2Service[setTextAlignment.apiKey.ordinal()] = 3;
                int i8 = getWarnings;
                initialize = ((((i8 ^ 51) | (i8 & 51)) << 1) - (((~i8) & 51) | (i8 & (-52)))) % 128;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ThreeDS2Service[setTextAlignment.restrictedParameters.ordinal()] = 4;
                int i9 = initialize;
                getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m$1((i9 & (-118)) | ((~i9) & 117), ~(-(-((i9 & 117) << 1))), 1, 128);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ThreeDS2Service[setTextAlignment.configureScheme.ordinal()] = 5;
                int i10 = getWarnings;
                initialize = SVG$Unit$EnumUnboxingLocalUtility.m(i10 ^ 68, (i10 & 68) << 1, -1, 128);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ThreeDS2Service[setTextAlignment.removeParam.ordinal()] = 6;
                int i11 = initialize;
                getWarnings = ((i11 ^ 83) + ((i11 & 83) << 1)) % 128;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ThreeDS2Service[setTextAlignment.SDKRuntimeException.ordinal()] = 7;
                getWarnings = (initialize + 67) % 128;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ThreeDS2Service[setTextAlignment.rootPublicKeyFromAssetCertificate.ordinal()] = 8;
                int i12 = initialize;
                int i13 = (i12 & (-34)) | ((~i12) & 33);
                int i14 = (i12 & 33) << 1;
                getWarnings = ((i13 ^ i14) + ((i14 & i13) << 1)) % 128;
            } catch (NoSuchFieldError unused8) {
            }
            int i15 = initialize;
            int i16 = (((i15 | 104) << 1) - (i15 ^ 104)) - 1;
            getWarnings = i16 % 128;
            if (i16 % 2 != 0) {
                throw null;
            }
        }
    }

    public setClipToPadding(setOnCapturedPointerListener setoncapturedpointerlistener) {
        this.getWarnings = setoncapturedpointerlistener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if ((r5 instanceof com.netcetera.threeds.sdk.api.exceptions.SDKNotInitializedException) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        if ((r5 instanceof com.netcetera.threeds.sdk.api.exceptions.SDKAlreadyInitializedException) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if ((r5 instanceof com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        r2 = r1 & 19;
        r1 = -(-(r1 | 19));
        r3 = (r2 ^ r1) + ((r1 & r2) << 1);
        com.netcetera.threeds.sdk.infrastructure.setClipToPadding.ThreeDS2Service = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        if ((r3 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        get((com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
    
        r4 = com.netcetera.threeds.sdk.infrastructure.setClipToPadding.ThreeDS2Service;
        r5 = r4 & 5;
        com.netcetera.threeds.sdk.infrastructure.setClipToPadding.initialize = (r5 + ((r4 ^ 5) | r5)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        get((com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        get(com.netcetera.threeds.sdk.infrastructure.setTextAlignment.getWarnings.initialize(r5));
        r4 = com.netcetera.threeds.sdk.infrastructure.setClipToPadding.ThreeDS2Service;
        r0 = r4 & 53;
        r5 = ((r4 ^ 53) | r0) << 1;
        r4 = -((r4 | 53) & (~r0));
        com.netcetera.threeds.sdk.infrastructure.setClipToPadding.initialize = (((r5 | r4) << 1) - (r4 ^ r5)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if ((r5 instanceof com.netcetera.threeds.sdk.api.exceptions.SDKNotInitializedException) == false) goto L15;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.setTooltipText
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void get(Throwable th) {
        int i = ThreeDS2Service;
        int i2 = (((i | 83) << 1) - (i ^ 83)) % 128;
        initialize = i2;
        if (!(th instanceof SDKRuntimeException)) {
            int i3 = i2 & 15;
            int i4 = (((~i3) & (i2 | 15)) - (~(i3 << 1))) - 1;
            ThreeDS2Service = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            if (!(th instanceof InvalidInputException)) {
                int i5 = ((i2 ^ 70) + ((i2 & 70) << 1)) - 1;
                ThreeDS2Service = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 25 / 0;
                }
            }
        }
        throw ((RuntimeException) th);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTooltipText
    public void get(setScrollCaptureCallback setscrollcapturecallback) {
        int i = ThreeDS2Service;
        int i2 = i & 51;
        initialize = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i ^ 51) | i2) << 1, ~(-((i | 51) & (~i2))), 1, 128);
        String ThreeDS2ServiceInstance = this.getWarnings.ThreeDS2ServiceInstance(setscrollcapturecallback);
        this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(ThreeDS2ServiceInstance, setscrollcapturecallback.getCause());
        switch (AnonymousClass3.ThreeDS2Service[setscrollcapturecallback.getWarnings().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                throw new InvalidInputException(ThreeDS2ServiceInstance, setscrollcapturecallback.getCause());
            case 7:
                throw new SDKNotInitializedException(ThreeDS2ServiceInstance, setscrollcapturecallback.getCause());
            case 8:
                throw new SDKAlreadyInitializedException(ThreeDS2ServiceInstance, setscrollcapturecallback.getCause());
            default:
                throw new SDKRuntimeException(ThreeDS2ServiceInstance, Integer.toString(setscrollcapturecallback.getWarnings().ThreeDS2Service()), setscrollcapturecallback.getCause());
        }
    }
}
