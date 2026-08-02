package com.netcetera.threeds.sdk.infrastructure;

import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.util.Objects;
import org.slf4j.helpers.MessageFormatter;

/* loaded from: classes5.dex */
public final class setScrollCaptureCallback extends RuntimeException {
    private static int ThreeDS2ServiceInstance = 0;
    private static int initialize = 1;
    private final setTextAlignment getWarnings;

    private setScrollCaptureCallback(setTextAlignment settextalignment, String str, Throwable th) {
        super(str, th);
        this.getWarnings = (setTextAlignment) og.ThreeDS2Service(settextalignment, setTextAlignment.getWarnings);
    }

    public static initialize ThreeDS2Service(setTextAlignment settextalignment) {
        return (initialize) getWarnings(new Object[]{settextalignment}, -1667499669, 1667499669, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        initialize initializeVar = new initialize((setTextAlignment) objArr[0]);
        int currentTimeMillis = (int) System.currentTimeMillis();
        int i = (-39710210) & currentTimeMillis;
        int i2 = ~(((-39710210) ^ currentTimeMillis) | i);
        int i3 = 291512877 & i2;
        int i4 = (i2 | 291512877) & (~i3);
        int i5 = -(-(((i4 & i3) | (i4 ^ i3)) * (-220)));
        int i6 = ((1597266616 ^ i5) - (~((i5 & 1597266616) << 1))) - 1;
        int i7 = (currentTimeMillis & 39710209) | ((-39710210) & (~currentTimeMillis));
        int i8 = ~((i7 & i) | (i7 ^ i));
        int i9 = ((~i8) & 4203009) | ((-4203010) & i8);
        int i10 = i8 & 4203009;
        int i11 = -(-(((i10 & i9) | (i9 ^ i10)) * EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
        int i12 = i6 & i11;
        int i13 = i12 + ((i11 ^ i6) | i12);
        int i14 = ((i13 ^ 1150139112) | (i13 & 1150139112)) << 1;
        int i15 = -((1150139112 & (~i13)) | ((-1150139113) & i13));
        int i16 = (i14 & i15) + (i15 | i14);
        int currentTimeMillis2 = (int) System.currentTimeMillis();
        int i17 = ~currentTimeMillis2;
        int i18 = (i17 | currentTimeMillis2) & i17;
        int i19 = (-687964673) & i18;
        int i20 = (i18 | (-687964673)) & (~i19);
        int i21 = (i20 & i19) | (i20 ^ i19);
        int i22 = ~i21;
        int i23 = (i21 | i22) & i22;
        int i24 = ((-1375732066) & currentTimeMillis2) | ((-1375732066) ^ currentTimeMillis2);
        int i25 = ~i24;
        int i26 = (i24 | i25) & i25;
        int i27 = ((i23 & i26) | (i23 ^ i26)) * (-272);
        int i28 = 721638462 ^ i27;
        int i29 = ((i27 & 721638462) | i28) << 1;
        int i30 = -i28;
        int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
        int i32 = 1391349219 & currentTimeMillis2;
        int i33 = (1391349219 | currentTimeMillis2) & (~i32);
        int i34 = ~((i33 & i32) | (i33 ^ i32));
        int i35 = (-2079313892) & i34;
        int i36 = (i34 | (-2079313892)) & (~i35);
        int i37 = (((i36 & i35) | (i36 ^ i35)) * (-272)) + i31;
        int i38 = ~((currentTimeMillis2 & (-1391349220)) | (i17 & (-1391349220)) | i32);
        int i39 = ((~i38) & 703581826) | ((-703581827) & i38);
        int i40 = i38 & 703581826;
        int i41 = ((i40 & i39) | (i39 ^ i40)) * EnumC0170g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE;
        if (i16 <= (i37 ^ i41) + ((i41 & i37) << 1)) {
            int i42 = 40 / 0;
        }
        return initializeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.class != r6.getClass()) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r5.getWarnings != ((com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback) r6).getWarnings) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.ThreeDS2ServiceInstance = (com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.initialize + 41) % 128;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        r5 = com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.ThreeDS2ServiceInstance;
        r2 = r5 & 99;
        com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.initialize = ((((r5 ^ 99) | r2) << 1) - ((r5 | 99) & (~r2))) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        r5 = com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.initialize;
        r6 = r5 & 51;
        r5 = -(-(r5 | 51));
        com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.ThreeDS2ServiceInstance = (((r6 | r5) << 1) - (r5 ^ r6)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback.class != r6.getClass()) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        int i = initialize;
        int i2 = i + 19;
        int i3 = i2 % 128;
        ThreeDS2ServiceInstance = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = ((i & 4) + (i | 4)) - 1;
            ThreeDS2ServiceInstance = i4 % 128;
            if (i4 % 2 == 0) {
                return true;
            }
            throw null;
        }
        boolean z = false;
        if (obj != null) {
            int i5 = ((i3 & 80) + (i3 | 80)) - 1;
            initialize = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 55 / 0;
            }
        }
        ThreeDS2ServiceInstance = (initialize + 117) % 128;
        return false;
    }

    public setTextAlignment getWarnings() {
        int i = initialize;
        int i2 = ((i & 38) + (i | 38)) - 1;
        ThreeDS2ServiceInstance = i2 % 128;
        int i3 = i2 % 2;
        setTextAlignment settextalignment = this.getWarnings;
        if (i3 != 0) {
            throw null;
        }
        ThreeDS2ServiceInstance = ((i & 73) + (i | 73)) % 128;
        return settextalignment;
    }

    public int hashCode() {
        int hash;
        int i = ThreeDS2ServiceInstance;
        int i2 = (i ^ 111) + ((i & 111) << 1);
        initialize = i2 % 128;
        int i3 = i2 % 2;
        setTextAlignment settextalignment = this.getWarnings;
        if (i3 == 0) {
            Object[] objArr = new Object[0];
            objArr[1] = settextalignment;
            hash = Objects.hash(objArr);
        } else {
            hash = Objects.hash(settextalignment);
        }
        int i4 = ThreeDS2ServiceInstance;
        int i5 = (i4 ^ 119) + ((i4 & 119) << 1);
        initialize = i5 % 128;
        if (i5 % 2 != 0) {
            return hash;
        }
        throw null;
    }

    public static final class initialize {
        private static int ThreeDS2Service = 0;
        private static int getWarnings = 1;
        private String ThreeDS2ServiceInstance;
        private Throwable get;
        private final setTextAlignment initialize;

        private initialize(setTextAlignment settextalignment) {
            this.initialize = settextalignment;
        }

        public initialize ThreeDS2Service(Throwable th) {
            int i = getWarnings;
            int i2 = (((i | 121) << 1) - (i ^ 121)) % 128;
            ThreeDS2Service = i2;
            this.get = th;
            int i3 = i2 & 99;
            int i4 = -(-((i2 ^ 99) | i3));
            getWarnings = ((i3 & i4) + (i3 | i4)) % 128;
            return this;
        }

        public initialize ThreeDS2ServiceInstance(String str, Object... objArr) {
            int i = ThreeDS2Service;
            getWarnings = ((i ^ 105) + ((i & 105) << 1)) % 128;
            if (objArr != null) {
                int i2 = (i & 125) + (i | 125);
                getWarnings = i2 % 128;
                if (i2 % 2 == 0) {
                    int length = objArr.length;
                    throw null;
                }
                if (objArr.length > 0) {
                    int identityHashCode = System.identityHashCode(this);
                    int i3 = ~identityHashCode;
                    int i4 = (2078276591 & i3) | ((-2078276592) & identityHashCode);
                    int i5 = identityHashCode & 2078276591;
                    int i6 = (i5 & i4) | (i4 ^ i5);
                    int i7 = (i6 | (~i6)) & (~i6);
                    int i8 = 1965301628 - (~(-(~(-(-(((i7 & 1354825999) | (1354825999 ^ i7)) * (-756)))))));
                    int i9 = 2078276591 & i3;
                    int i10 = (i3 | 2078276591) & (~i9);
                    int i11 = ((i9 & i10) | (i10 ^ i9)) * 756;
                    int i12 = ((i8 & i11) - (~(-(-(i11 | i8))))) - 1;
                    int identityHashCode2 = System.identityHashCode(this);
                    int i13 = (-897901893) & identityHashCode2;
                    int i14 = (((-897901893) | identityHashCode2) & (~i13)) | i13;
                    int i15 = (i14 | (~i14)) & (~i14);
                    int i16 = ((i15 & 360997120) | (360997120 ^ i15)) * (-566);
                    int i17 = ((~i16) & 556069008) | ((-556069009) & i16);
                    int i18 = (i16 & 556069008) << 1;
                    int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                    int i20 = i19 & (-1892024048);
                    int i21 = ((-1892024048) | i19) & (~i20);
                    int i22 = i20 << 1;
                    int i23 = (i21 & i22) + (i22 | i21);
                    int i24 = ((~identityHashCode2) & (-536904773)) | (536904772 & identityHashCode2);
                    int i25 = identityHashCode2 & (-536904773);
                    int i26 = (i25 & i24) | (i24 ^ i25);
                    int i27 = ((i26 | (~i26)) & (~i26)) * 566;
                    int i28 = i23 & i27;
                    int i29 = (i27 ^ i23) | i28;
                    if (i12 > (i28 & i29) + (i29 | i28)) {
                        ThreeDS2Service(MessageFormatter.arrayFormat(str, objArr).getMessage());
                        throw null;
                    }
                    initialize ThreeDS2Service2 = ThreeDS2Service(MessageFormatter.arrayFormat(str, objArr).getMessage());
                    int i30 = getWarnings;
                    int i31 = i30 & 101;
                    int i32 = i31 + ((i30 ^ 101) | i31);
                    ThreeDS2Service = i32 % 128;
                    if (i32 % 2 == 0) {
                        return ThreeDS2Service2;
                    }
                    throw null;
                }
            }
            initialize ThreeDS2Service3 = ThreeDS2Service(str);
            int i33 = ThreeDS2Service;
            int i34 = i33 ^ 53;
            getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i33 & 53) | i34) << 1, ~(-i34), 1, 128);
            return ThreeDS2Service3;
        }

        public initialize ThreeDS2Service(String str) {
            int i = ThreeDS2Service + 5;
            getWarnings = i % 128;
            if (i % 2 != 0) {
                this.ThreeDS2ServiceInstance = str;
                return this;
            }
            this.ThreeDS2ServiceInstance = str;
            throw null;
        }

        public setScrollCaptureCallback ThreeDS2ServiceInstance() {
            setScrollCaptureCallback setscrollcapturecallback = new setScrollCaptureCallback(this.initialize, this.ThreeDS2ServiceInstance, this.get);
            int i = getWarnings;
            int i2 = i & 11;
            ThreeDS2Service = (((i | 11) & (~i2)) + (i2 << 1)) % 128;
            return setscrollcapturecallback;
        }
    }

    public static /* synthetic */ Object getWarnings(Object[] objArr, int i, int i2, int i3) {
        return ThreeDS2ServiceInstance(objArr);
    }
}
