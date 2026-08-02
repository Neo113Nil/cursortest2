package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class lw implements jr {
    private static int ThreeDS2ServiceInstance = 1;
    private static int getWarnings;
    private final com.netcetera.threeds.sdk.api.ui.logic.LabelCustomization get;

    public lw(com.netcetera.threeds.sdk.api.ui.logic.LabelCustomization labelCustomization) {
        this.get = labelCustomization;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jr
    public String ThreeDS2Service() {
        int i = getWarnings;
        int i2 = i | 63;
        int i3 = i2 << 1;
        int i4 = -((~(i & 63)) & i2);
        int i5 = (i3 & i4) + (i4 | i3);
        ThreeDS2ServiceInstance = i5 % 128;
        int i6 = i5 % 2;
        String headingTextColor = this.get.getHeadingTextColor();
        if (i6 == 0) {
            int i7 = 67 / 0;
        }
        int i8 = ThreeDS2ServiceInstance;
        getWarnings = (((i8 | 89) << 1) - (i8 ^ 89)) % 128;
        return headingTextColor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public int ThreeDS2ServiceInstance() {
        getWarnings = ((-2) - ((ThreeDS2ServiceInstance + 116) ^ (-1))) % 128;
        int textFontSize = this.get.getTextFontSize();
        int i = getWarnings + 61;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 != 0) {
            return textFontSize;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String get() {
        int i = getWarnings;
        int i2 = i & 5;
        int i3 = (i | 5) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 & i4) + (i3 | i4);
        ThreeDS2ServiceInstance = i5 % 128;
        int i6 = i5 % 2;
        String textColor = this.get.getTextColor();
        if (i6 == 0) {
            int i7 = 73 / 0;
        }
        int i8 = getWarnings;
        ThreeDS2ServiceInstance = (((i8 | 79) << 1) - (i8 ^ 79)) % 128;
        return textColor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jr
    public int getWarnings() {
        int i = getWarnings + 67;
        ThreeDS2ServiceInstance = i % 128;
        int i2 = i % 2;
        int headingTextFontSize = this.get.getHeadingTextFontSize();
        if (i2 == 0) {
            int i3 = 38 / 0;
        }
        int i4 = getWarnings + 105;
        ThreeDS2ServiceInstance = i4 % 128;
        if (i4 % 2 != 0) {
            return headingTextFontSize;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String initialize() {
        int i = getWarnings;
        ThreeDS2ServiceInstance = ((i & 97) + (i | 97)) % 128;
        String textFontName = this.get.getTextFontName();
        int i2 = ThreeDS2ServiceInstance + 7;
        getWarnings = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 67 / 0;
        }
        return textFontName;
    }
}
