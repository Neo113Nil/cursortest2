package com.netcetera.threeds.sdk.infrastructure;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class lt implements jq {
    private static int ThreeDS2Service = 1;
    private static int get;
    private final com.netcetera.threeds.sdk.api.ui.logic.TextBoxCustomization initialize;

    public lt(com.netcetera.threeds.sdk.api.ui.logic.TextBoxCustomization textBoxCustomization) {
        this.initialize = textBoxCustomization;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jq
    public String ThreeDS2Service() {
        int i = ThreeDS2Service;
        int i2 = i ^ 69;
        get = ((((i & 69) | i2) << 1) - i2) % 128;
        String darkBorderColor = this.initialize.getDarkBorderColor();
        int i3 = get;
        ThreeDS2Service = SVG$Unit$EnumUnboxingLocalUtility.m(i3 ^ 68, (i3 & 68) << 1, -1, 128);
        return darkBorderColor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public int ThreeDS2ServiceInstance() {
        int i = ThreeDS2Service;
        get = (((i | 97) << 1) - (i ^ 97)) % 128;
        int textFontSize = this.initialize.getTextFontSize();
        int i2 = get;
        int i3 = i2 | 91;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 91)) & i3);
        ThreeDS2Service = (((i4 | i5) << 1) - (i5 ^ i4)) % 128;
        return textFontSize;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jq
    public int createTransaction() {
        int i = get;
        int i2 = i & 89;
        int i3 = (i ^ 89) | i2;
        ThreeDS2Service = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        int cornerRadius = this.initialize.getCornerRadius();
        int i4 = get;
        ThreeDS2Service = ((i4 & 87) + (i4 | 87)) % 128;
        return cornerRadius;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String get() {
        int i = get;
        int i2 = (i ^ 53) + ((i & 53) << 1);
        ThreeDS2Service = i2 % 128;
        int i3 = i2 % 2;
        String darkTextColor = this.initialize.getDarkTextColor();
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return darkTextColor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jq
    public int getWarnings() {
        int i = ThreeDS2Service;
        int i2 = (i & 55) + (i | 55);
        get = i2 % 128;
        int i3 = i2 % 2;
        com.netcetera.threeds.sdk.api.ui.logic.TextBoxCustomization textBoxCustomization = this.initialize;
        if (i3 == 0) {
            return textBoxCustomization.getBorderWidth();
        }
        textBoxCustomization.getBorderWidth();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String initialize() {
        int i = get;
        int i2 = i & 9;
        int i3 = ((i ^ 9) | i2) << 1;
        int i4 = -((i | 9) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        ThreeDS2Service = i5 % 128;
        int i6 = i5 % 2;
        com.netcetera.threeds.sdk.api.ui.logic.TextBoxCustomization textBoxCustomization = this.initialize;
        if (i6 != 0) {
            return textBoxCustomization.getTextFontName();
        }
        textBoxCustomization.getTextFontName();
        throw null;
    }
}
