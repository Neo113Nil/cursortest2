package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class ly implements jo {
    private static int ThreeDS2ServiceInstance = 1;
    private static int get;
    private final com.netcetera.threeds.sdk.api.ui.logic.ButtonCustomization getWarnings;

    public ly(com.netcetera.threeds.sdk.api.ui.logic.ButtonCustomization buttonCustomization) {
        this.getWarnings = buttonCustomization;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jo
    public String ThreeDS2Service() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 33;
        int i3 = -(-((i ^ 33) | i2));
        get = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        String backgroundColor = this.getWarnings.getBackgroundColor();
        int i4 = ThreeDS2ServiceInstance;
        int i5 = (i4 ^ 83) + ((i4 & 83) << 1);
        get = i5 % 128;
        if (i5 % 2 == 0) {
            return backgroundColor;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public int ThreeDS2ServiceInstance() {
        int identityHashCode = System.identityHashCode(this);
        int i = ~identityHashCode;
        int i2 = (identityHashCode | (~identityHashCode)) & i;
        int i3 = i2 & (-1436690304);
        int i4 = ((i2 | (-1436690304)) & (~i3)) | i3;
        int i5 = ((-197143579) & i4) | ((~i4) & 197143578);
        int i6 = i4 & 197143578;
        int i7 = ~((i6 & i5) | (i5 ^ i6));
        int i8 = 171968512 ^ i7;
        int i9 = i7 & 171968512;
        int i10 = (-1087052111) - (~(-(-(((i9 & i8) | (i8 ^ i9)) * (-828)))));
        int i11 = ((~i) & (-1411515238)) | (1411515237 & i);
        int i12 = i & (-1411515238);
        int i13 = -(-(((i11 & i12) | (i11 ^ i12)) * (-828)));
        int i14 = (i10 ^ i13) + ((i13 & i10) << 1);
        int i15 = i14 ^ 503511724;
        int i16 = (503511724 & i14) << 1;
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        int identityHashCode2 = System.identityHashCode(this);
        int i18 = 263727932 ^ identityHashCode2;
        int i19 = ~identityHashCode2;
        int i20 = 263727932 & identityHashCode2;
        int i21 = ~((i18 & i20) | (i18 ^ i20));
        int i22 = ~identityHashCode2;
        int i23 = i22 ^ (-1526735145);
        int i24 = i22 & (-1526735145);
        int i25 = ~((i24 & i23) | (i23 ^ i24));
        int i26 = i21 & i25;
        int i27 = (i21 | i25) & (~i26);
        int i28 = ((i27 & i26) | (i27 ^ i26)) * (-1808);
        int i29 = ((1801723130 | i28) << 1) - (i28 ^ 1801723130);
        int i30 = 1605905212 & identityHashCode2;
        int i31 = (1605905212 | identityHashCode2) & (~i30);
        int i32 = ~((i31 & i30) | (i31 ^ i30));
        int i33 = (i19 & 263727932) | ((~i19) & (-263727933)) | (i19 & (-263727933));
        int i34 = i33 & (-1526735145);
        int i35 = (i33 | (-1526735145)) & (~i34);
        int i36 = ~((i35 & i34) | (i35 ^ i34));
        int i37 = i32 & i36;
        int i38 = (i32 | i36) & (~i37);
        int i39 = (-2) - ((i29 - (~(((i38 & i37) | (i38 ^ i37)) * 904))) ^ (-1));
        int i40 = ((-1526735145) & identityHashCode2) | (1526735144 & i19);
        int i41 = identityHashCode2 & 1526735144;
        int i42 = (i41 & i40) | (i40 ^ i41);
        int i43 = (i42 | (~i42)) & (~i42);
        int i44 = (i43 & 1342177280) | (1342177280 ^ i43);
        int i45 = (263727932 & i19) | ((~i19) & (-263727933));
        int i46 = i19 & (-263727933);
        int i47 = ~((i45 & i46) | (i45 ^ i46));
        int i48 = ((~i47) & i44) | ((~i44) & i47);
        int i49 = i44 & i47;
        int i50 = -(-(((i49 & i48) | (i48 ^ i49)) * 904));
        int i51 = i39 & i50;
        int i52 = ((i50 | i39) & (~i51)) + (i51 << 1);
        com.netcetera.threeds.sdk.api.ui.logic.ButtonCustomization buttonCustomization = this.getWarnings;
        if (i17 <= i52) {
            buttonCustomization.getTextFontSize();
            throw null;
        }
        int textFontSize = buttonCustomization.getTextFontSize();
        int i53 = ThreeDS2ServiceInstance;
        int i54 = i53 & 23;
        int i55 = (i53 | 23) & (~i54);
        int i56 = i54 << 1;
        get = ((i55 ^ i56) + ((i55 & i56) << 1)) % 128;
        return textFontSize;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String get() {
        int i = get;
        ThreeDS2ServiceInstance = ((i & 47) + (i | 47)) % 128;
        String textColor = this.getWarnings.getTextColor();
        int i2 = get;
        int i3 = i2 & 53;
        int i4 = -(-((i2 ^ 53) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        ThreeDS2ServiceInstance = i5 % 128;
        if (i5 % 2 != 0) {
            return textColor;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jo
    public int getWarnings() {
        int i = ThreeDS2ServiceInstance;
        int i2 = (i | 49) << 1;
        int i3 = -(((~i) & 49) | (i & (-50)));
        int i4 = (i2 & i3) + (i3 | i2);
        get = i4 % 128;
        int i5 = i4 % 2;
        com.netcetera.threeds.sdk.api.ui.logic.ButtonCustomization buttonCustomization = this.getWarnings;
        if (i5 != 0) {
            buttonCustomization.getCornerRadius();
            throw null;
        }
        int cornerRadius = buttonCustomization.getCornerRadius();
        int i6 = get;
        int i7 = i6 & 19;
        int i8 = i6 | 19;
        ThreeDS2ServiceInstance = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
        return cornerRadius;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String initialize() {
        get = (ThreeDS2ServiceInstance + 53) % 128;
        String textFontName = this.getWarnings.getTextFontName();
        int i = get + 77;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            int i2 = 86 / 0;
        }
        return textFontName;
    }
}
