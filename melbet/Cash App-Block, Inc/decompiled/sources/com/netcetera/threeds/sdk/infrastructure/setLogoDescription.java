package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setPopupTheme;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class setLogoDescription implements setPopupTheme, setPopupTheme.ThreeDS2ServiceInstance, setPopupTheme.initialize {
    private static int ThreeDS2ServiceInstance = 1;
    private static int getWarnings;
    private final setPopupTheme.initialize ThreeDS2Service;
    private final setPopupTheme.ThreeDS2ServiceInstance get;

    public setLogoDescription(setPopupTheme.initialize initializeVar, setPopupTheme.ThreeDS2ServiceInstance threeDS2ServiceInstance) {
        this.ThreeDS2Service = initializeVar;
        this.get = threeDS2ServiceInstance;
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i2 * (-448)) + (i * 450);
        int i5 = ~((~i) | i2);
        int i6 = ~i2;
        int i7 = (((~(i6 | i | i3)) | i5) * 449) + i4;
        if ((((~(i | i6 | (~i3))) | i5) * 449) + (i5 * (-1347)) + i7 != 1) {
            return ThreeDS2Service(objArr);
        }
        setLogoDescription setlogodescription = new setLogoDescription(new setTitleMarginEnd((String) objArr[0], (String) objArr[1], (String) objArr[2]), null);
        int i8 = ThreeDS2ServiceInstance;
        getWarnings = ((((i8 ^ 89) | (i8 & 89)) << 1) - (((~i8) & 89) | (i8 & (-90)))) % 128;
        return setlogodescription;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPopupTheme.ThreeDS2ServiceInstance
    public String ThreeDS2ServiceInitializationCallback() {
        int i = getWarnings;
        int i2 = i & 31;
        int i3 = (i | 31) & (~i2);
        int i4 = i2 << 1;
        ThreeDS2ServiceInstance = ((i3 & i4) + (i3 | i4)) % 128;
        String ThreeDS2ServiceInitializationCallback = this.get.ThreeDS2ServiceInitializationCallback();
        int i5 = getWarnings;
        int i6 = (((i5 | 38) << 1) - (i5 ^ 38)) - 1;
        ThreeDS2ServiceInstance = i6 % 128;
        if (i6 % 2 != 0) {
            return ThreeDS2ServiceInitializationCallback;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPopupTheme.initialize
    public String ThreeDS2ServiceInstance() {
        int i = getWarnings + 59;
        ThreeDS2ServiceInstance = i % 128;
        int i2 = i % 2;
        String ThreeDS2ServiceInstance2 = this.ThreeDS2Service.ThreeDS2ServiceInstance();
        if (i2 == 0) {
            int i3 = 61 / 0;
        }
        return ThreeDS2ServiceInstance2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPopupTheme.initialize
    public String get() {
        int i = getWarnings;
        int i2 = i & 93;
        ThreeDS2ServiceInstance = (i2 + ((i ^ 93) | i2)) % 128;
        String str = this.ThreeDS2Service.get();
        int i3 = ThreeDS2ServiceInstance;
        getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m$1(i3 ^ 71, ~((i3 & 71) << 1), 1, 128);
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPopupTheme.ThreeDS2ServiceInstance
    public String getSDKVersion() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 11;
        getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m$1((i | 11) & (~i2), ~(-(-(i2 << 1))), 1, 128);
        String sDKVersion = this.get.getSDKVersion();
        int i3 = ThreeDS2ServiceInstance;
        int i4 = (-2) - (((i3 ^ 12) + ((i3 & 12) << 1)) ^ (-1));
        getWarnings = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
        return sDKVersion;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPopupTheme
    public setPopupTheme.initialize getWarnings() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 105;
        int i3 = (i2 + ((i ^ 105) | i2)) % 128;
        getWarnings = i3;
        int i4 = (-2) - ((((i3 | 58) << 1) - (i3 ^ 58)) ^ (-1));
        ThreeDS2ServiceInstance = i4 % 128;
        if (i4 % 2 != 0) {
            return this;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPopupTheme
    public setPopupTheme.ThreeDS2ServiceInstance initialize() {
        int i = getWarnings;
        int i2 = ((i ^ 51) | (i & 51)) << 1;
        int i3 = -(((~i) & 51) | (i & (-52)));
        ThreeDS2ServiceInstance = ((i2 & i3) + (i3 | i2)) % 128;
        return this;
    }

    public static setPopupTheme ThreeDS2ServiceInstance(String str, String str2, String str3) {
        return (setPopupTheme) ThreeDS2Service(new Object[]{str, str2, str3}, -577701259, 577701259, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        setLogoDescription setlogodescription = new setLogoDescription(null, new setSubtitleTextAppearance((String) objArr[0], (String) objArr[1], (String) objArr[2]));
        int i = getWarnings;
        int i2 = (((i | 121) << 1) - (~(-(i ^ 121)))) - 1;
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 37 / 0;
        }
        return setlogodescription;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPopupTheme.initialize
    public String ThreeDS2Service() {
        int i = getWarnings + 89;
        ThreeDS2ServiceInstance = i % 128;
        int i2 = i % 2;
        setPopupTheme.initialize initializeVar = this.ThreeDS2Service;
        if (i2 == 0) {
            initializeVar.ThreeDS2Service();
            throw null;
        }
        String ThreeDS2Service = initializeVar.ThreeDS2Service();
        int i3 = ThreeDS2ServiceInstance;
        int i4 = (i3 & (-76)) | ((~i3) & 75);
        int i5 = (i3 & 75) << 1;
        int i6 = (i4 & i5) + (i5 | i4);
        getWarnings = i6 % 128;
        if (i6 % 2 == 0) {
            return ThreeDS2Service;
        }
        throw null;
    }

    public static setPopupTheme ThreeDS2Service(String str, String str2, String str3) {
        return (setPopupTheme) ThreeDS2Service(new Object[]{str, str2, str3}, 1932196761, -1932196760, (int) System.currentTimeMillis());
    }
}
