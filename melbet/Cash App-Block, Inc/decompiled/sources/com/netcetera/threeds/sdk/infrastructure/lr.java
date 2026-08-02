package com.netcetera.threeds.sdk.infrastructure;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class lr implements jr {
    private static int get = 0;
    private static int initialize = 1;
    private final com.netcetera.threeds.sdk.api.ui.logic.LabelCustomization ThreeDS2Service;

    public lr(com.netcetera.threeds.sdk.api.ui.logic.LabelCustomization labelCustomization) {
        this.ThreeDS2Service = labelCustomization;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jr
    public String ThreeDS2Service() {
        int i = get + 27;
        initialize = i % 128;
        int i2 = i % 2;
        com.netcetera.threeds.sdk.api.ui.logic.LabelCustomization labelCustomization = this.ThreeDS2Service;
        if (i2 == 0) {
            labelCustomization.getHeadingDarkTextColor();
            throw null;
        }
        String headingDarkTextColor = labelCustomization.getHeadingDarkTextColor();
        int i3 = initialize;
        int i4 = i3 & 7;
        int i5 = -(-((i3 ^ 7) | i4));
        int i6 = (i4 & i5) + (i5 | i4);
        get = i6 % 128;
        if (i6 % 2 == 0) {
            return headingDarkTextColor;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public int ThreeDS2ServiceInstance() {
        int i = get;
        initialize = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i ^ 49) | (i & 49)) << 1, ~(-(((~i) & 49) | (i & (-50)))), 1, 128);
        int textFontSize = this.ThreeDS2Service.getTextFontSize();
        int i2 = get + 69;
        initialize = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 22 / 0;
        }
        return textFontSize;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String get() {
        int i = get;
        int i2 = i & 53;
        int i3 = (i ^ 53) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        initialize = i4 % 128;
        int i5 = i4 % 2;
        com.netcetera.threeds.sdk.api.ui.logic.LabelCustomization labelCustomization = this.ThreeDS2Service;
        if (i5 == 0) {
            labelCustomization.getDarkTextColor();
            throw null;
        }
        String darkTextColor = labelCustomization.getDarkTextColor();
        int i6 = get;
        int i7 = i6 ^ 91;
        int i8 = (i6 & 91) << 1;
        initialize = ((i7 & i8) + (i8 | i7)) % 128;
        return darkTextColor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jr
    public int getWarnings() {
        initialize = ((-2) - ((get + 116) ^ (-1))) % 128;
        int headingTextFontSize = this.ThreeDS2Service.getHeadingTextFontSize();
        int i = initialize;
        int i2 = (((i | 100) << 1) - (i ^ 100)) - 1;
        get = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 38 / 0;
        }
        return headingTextFontSize;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String initialize() {
        int i = initialize;
        int i2 = i ^ 89;
        int i3 = ((i & 89) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        get = i5 % 128;
        int i6 = i5 % 2;
        com.netcetera.threeds.sdk.api.ui.logic.LabelCustomization labelCustomization = this.ThreeDS2Service;
        if (i6 == 0) {
            return labelCustomization.getTextFontName();
        }
        labelCustomization.getTextFontName();
        throw null;
    }
}
