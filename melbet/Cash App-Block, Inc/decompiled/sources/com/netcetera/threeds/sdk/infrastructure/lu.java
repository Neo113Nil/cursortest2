package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class lu implements jo {
    private static int get = 0;
    private static int getWarnings = 1;
    private final com.netcetera.threeds.sdk.api.ui.logic.ButtonCustomization ThreeDS2Service;

    public lu(com.netcetera.threeds.sdk.api.ui.logic.ButtonCustomization buttonCustomization) {
        this.ThreeDS2Service = buttonCustomization;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jo
    public String ThreeDS2Service() {
        int i = getWarnings + 25;
        get = i % 128;
        int i2 = i % 2;
        com.netcetera.threeds.sdk.api.ui.logic.ButtonCustomization buttonCustomization = this.ThreeDS2Service;
        if (i2 != 0) {
            buttonCustomization.getDarkBackgroundColor();
            throw null;
        }
        String darkBackgroundColor = buttonCustomization.getDarkBackgroundColor();
        int i3 = get;
        int i4 = i3 & 97;
        int i5 = (i3 ^ 97) | i4;
        int i6 = (i4 & i5) + (i5 | i4);
        getWarnings = i6 % 128;
        if (i6 % 2 != 0) {
            return darkBackgroundColor;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public int ThreeDS2ServiceInstance() {
        int i = getWarnings;
        int i2 = (((i | 12) << 1) - (i ^ 12)) - 1;
        get = i2 % 128;
        int i3 = i2 % 2;
        com.netcetera.threeds.sdk.api.ui.logic.ButtonCustomization buttonCustomization = this.ThreeDS2Service;
        if (i3 == 0) {
            return buttonCustomization.getTextFontSize();
        }
        buttonCustomization.getTextFontSize();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String get() {
        int i = get;
        getWarnings = ((-2) - (((i ^ 36) + ((i & 36) << 1)) ^ (-1))) % 128;
        String darkTextColor = this.ThreeDS2Service.getDarkTextColor();
        int i2 = get;
        getWarnings = ((i2 & 107) + (i2 | 107)) % 128;
        return darkTextColor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jo
    public int getWarnings() {
        int i = get;
        int i2 = i ^ 37;
        int i3 = ((i & 37) | i2) << 1;
        int i4 = -i2;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        getWarnings = i5 % 128;
        int i6 = i5 % 2;
        int cornerRadius = this.ThreeDS2Service.getCornerRadius();
        if (i6 == 0) {
            int i7 = 6 / 0;
        }
        return cornerRadius;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String initialize() {
        int i = get;
        int i2 = (((i | 76) << 1) - (i ^ 76)) - 1;
        getWarnings = i2 % 128;
        int i3 = i2 % 2;
        com.netcetera.threeds.sdk.api.ui.logic.ButtonCustomization buttonCustomization = this.ThreeDS2Service;
        if (i3 == 0) {
            buttonCustomization.getTextFontName();
            throw null;
        }
        String textFontName = buttonCustomization.getTextFontName();
        int i4 = getWarnings;
        int i5 = i4 ^ 17;
        get = ((((i4 & 17) | i5) << 1) - i5) % 128;
        return textFontName;
    }
}
