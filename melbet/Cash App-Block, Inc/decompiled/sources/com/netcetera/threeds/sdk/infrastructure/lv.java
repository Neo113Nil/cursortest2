package com.netcetera.threeds.sdk.infrastructure;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class lv implements jq {
    private static int ThreeDS2ServiceInstance = 1;
    private static int get;
    private final com.netcetera.threeds.sdk.api.ui.logic.TextBoxCustomization getWarnings;

    public lv(com.netcetera.threeds.sdk.api.ui.logic.TextBoxCustomization textBoxCustomization) {
        this.getWarnings = textBoxCustomization;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jq
    public String ThreeDS2Service() {
        System.identityHashCode(this);
        System.identityHashCode(this);
        String borderColor = this.getWarnings.getBorderColor();
        int i = get;
        int i2 = i & 37;
        ThreeDS2ServiceInstance = (i2 + ((i ^ 37) | i2)) % 128;
        return borderColor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public int ThreeDS2ServiceInstance() {
        ThreeDS2ServiceInstance = (get + 21) % 128;
        int textFontSize = this.getWarnings.getTextFontSize();
        int i = get;
        int i2 = (i ^ 75) + ((i & 75) << 1);
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            return textFontSize;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jq
    public int createTransaction() {
        get = (ThreeDS2ServiceInstance + 95) % 128;
        int cornerRadius = this.getWarnings.getCornerRadius();
        int i = get;
        int i2 = ((i & (-94)) | ((~i) & 93)) + ((i & 93) << 1);
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            return cornerRadius;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String get() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 67;
        int i3 = -(-((i ^ 67) | i2));
        get = ((i2 & i3) + (i3 | i2)) % 128;
        String textColor = this.getWarnings.getTextColor();
        int i4 = get;
        ThreeDS2ServiceInstance = SVG$Unit$EnumUnboxingLocalUtility.m$1((i4 & (-92)) | ((~i4) & 91), ~((i4 & 91) << 1), 1, 128);
        return textColor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jq
    public int getWarnings() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 85;
        int i3 = ((i ^ 85) | i2) << 1;
        int i4 = -((i | 85) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        get = i5 % 128;
        int i6 = i5 % 2;
        com.netcetera.threeds.sdk.api.ui.logic.TextBoxCustomization textBoxCustomization = this.getWarnings;
        if (i6 == 0) {
            return textBoxCustomization.getBorderWidth();
        }
        textBoxCustomization.getBorderWidth();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String initialize() {
        int i = get;
        int i2 = ((i & 87) - (~(-(-(i | 87))))) - 1;
        ThreeDS2ServiceInstance = i2 % 128;
        int i3 = i2 % 2;
        com.netcetera.threeds.sdk.api.ui.logic.TextBoxCustomization textBoxCustomization = this.getWarnings;
        if (i3 == 0) {
            textBoxCustomization.getTextFontName();
            throw null;
        }
        String textFontName = textBoxCustomization.getTextFontName();
        int i4 = ThreeDS2ServiceInstance;
        int i5 = i4 & 107;
        int i6 = ((i4 ^ 107) | i5) << 1;
        int i7 = -((i4 | 107) & (~i5));
        get = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
        return textFontName;
    }
}
