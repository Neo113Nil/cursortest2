package com.netcetera.threeds.sdk.infrastructure;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class setFastScrollAlwaysVisible {
    private static int ThreeDS2Service = 0;
    private static int get = 1;

    public boolean get(setScrollCaptureCallback setscrollcapturecallback) {
        get = (ThreeDS2Service + 27) % 128;
        boolean z = false;
        if (setscrollcapturecallback.getWarnings() == setTextAlignment.cleanup) {
            int i = ThreeDS2Service;
            int i2 = (i & (-44)) | ((~i) & 43);
            int i3 = -(-((i & 43) << 1));
            int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
            get = i4 % 128;
            if (i4 % 2 != 0) {
                z = true;
            }
        } else {
            int i5 = ThreeDS2Service;
            int i6 = i5 & 65;
            get = SVG$Unit$EnumUnboxingLocalUtility.m$1((i5 | 65) & (~i6), ~(i6 << 1), 1, 128);
        }
        int i7 = ThreeDS2Service + 61;
        get = i7 % 128;
        if (i7 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public boolean initialize(setScrollCaptureCallback setscrollcapturecallback) {
        int identityHashCode = System.identityHashCode(this);
        int i = ~(1885561717 | identityHashCode);
        int i2 = 1242011952 & i;
        int i3 = (i | 1242011952) & (~i2);
        int i4 = ((i3 & i2) | (i3 ^ i2)) * (-948);
        boolean z = true;
        int i5 = (967572437 ^ i4) + ((i4 & 967572437) << 1);
        int i6 = (identityHashCode | (~identityHashCode)) & (~identityHashCode);
        int i7 = -(-((~((i6 & 2053634933) | ((~i6) & 2053634933) | ((-2053634934) & i6))) * (-948)));
        int i8 = i5 & i7;
        int i9 = (i7 | i5) & (~i8);
        int i10 = -(-(i8 << 1));
        int i11 = (i9 & i10) + (i9 | i10);
        int i12 = i11 & (-419619764);
        int i13 = ((-419619764) | i11) & (~i12);
        int i14 = i12 << 1;
        int i15 = (i13 & i14) + (i13 | i14);
        int identityHashCode2 = System.identityHashCode(this);
        int i16 = ~identityHashCode2;
        int i17 = ~((i16 & 863978000) | (i16 ^ 863978000));
        int i18 = ((i17 & (-2115973354)) | ((-2115973354) ^ i17)) * (-1042);
        int i19 = 971510364 | i18;
        int i20 = ((i19 << 1) - (~(-((~(i18 & 971510364)) & i19)))) - 1;
        int i21 = 863978000 & identityHashCode2;
        int i22 = (~i21) & (863978000 | identityHashCode2);
        int i23 = -(-(((i21 & i22) | (i22 ^ i21)) * 521));
        int i24 = (i20 & i23) + (i23 | i20);
        int i25 = 2115973353 ^ identityHashCode2;
        int i26 = 2115973353 & identityHashCode2;
        int i27 = ~((i25 & i26) | (i25 ^ i26));
        int i28 = ((~i27) & 23085584) | ((-23085585) & i27);
        int i29 = i27 & 23085584;
        int i30 = ~identityHashCode2;
        int i31 = (i30 & (-2115973354)) | (2115973353 & i30) | ((~i30) & (-2115973354));
        int i32 = ((-863978001) & i31) | ((~i31) & 863978000);
        int i33 = i31 & 863978000;
        int i34 = -(-(((~((i33 & i32) | (i32 ^ i33))) | (i29 & i28) | (i28 ^ i29)) * 521));
        if (i15 <= ((i24 & i34) - (~(i34 | i24))) - 1) {
            setscrollcapturecallback.getWarnings();
            setTextAlignment settextalignment = setTextAlignment.getWarnings;
            throw null;
        }
        if (setscrollcapturecallback.getWarnings() == setTextAlignment.ThreeDS2ServiceInitializationCallback) {
            int i35 = ThreeDS2Service;
            int i36 = ((i35 ^ 65) | (i35 & 65)) << 1;
            int i37 = -(((~i35) & 65) | (i35 & (-66)));
            get = ((i36 & i37) + (i37 | i36)) % 128;
        } else {
            int i38 = ThreeDS2Service;
            get = ((i38 & 45) + (i38 | 45)) % 128;
            z = false;
        }
        int i39 = ThreeDS2Service;
        int i40 = i39 & 19;
        int i41 = -(-(i39 | 19));
        get = ((i40 & i41) + (i41 | i40)) % 128;
        return z;
    }

    public String get(setSafeBrowsingWhitelist setsafebrowsingwhitelist) {
        get = (ThreeDS2Service + 23) % 128;
        boolean warnings = setsafebrowsingwhitelist.getWarnings();
        String warnings2 = setsafebrowsingwhitelist.get().getWarnings();
        if (warnings) {
            int i = get;
            ThreeDS2Service = ((i ^ 101) + ((i & 101) << 1)) % 128;
            return warnings2;
        }
        int i2 = ThreeDS2Service;
        int i3 = i2 & 41;
        get = ((((i2 ^ 41) | i3) << 1) - ((i2 | 41) & (~i3))) % 128;
        throw setTextAlignment.Severity.initialize(Integer.valueOf(setsafebrowsingwhitelist.ThreeDS2ServiceInstance()));
    }
}
