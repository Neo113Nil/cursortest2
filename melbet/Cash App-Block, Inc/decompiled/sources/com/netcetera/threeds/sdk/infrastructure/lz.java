package com.netcetera.threeds.sdk.infrastructure;

import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class lz implements jw {
    private static int ThreeDS2Service = 0;
    private static int getWarnings = 1;
    private final com.netcetera.threeds.sdk.api.ui.logic.ToolbarCustomization initialize;

    public lz(com.netcetera.threeds.sdk.api.ui.logic.ToolbarCustomization toolbarCustomization) {
        this.initialize = toolbarCustomization;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jw
    public String ThreeDS2Service() {
        int i = getWarnings + 57;
        ThreeDS2Service = i % 128;
        int i2 = i % 2;
        String buttonText = this.initialize.getButtonText();
        if (i2 != 0) {
            int i3 = 77 / 0;
        }
        int i4 = getWarnings + 23;
        ThreeDS2Service = i4 % 128;
        if (i4 % 2 == 0) {
            return buttonText;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public int ThreeDS2ServiceInstance() {
        int i = getWarnings;
        int i2 = i & 67;
        ThreeDS2Service = (i2 + ((i ^ 67) | i2)) % 128;
        int textFontSize = this.initialize.getTextFontSize();
        int i3 = getWarnings;
        int i4 = ((i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) + (i3 | EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE)) - 1;
        ThreeDS2Service = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        return textFontSize;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String get() {
        int i = ThreeDS2Service;
        int i2 = i & 49;
        int i3 = ((i | 49) & (~i2)) + (i2 << 1);
        getWarnings = i3 % 128;
        int i4 = i3 % 2;
        String textColor = this.initialize.getTextColor();
        if (i4 == 0) {
            int i5 = 70 / 0;
        }
        ThreeDS2Service = (getWarnings + 45) % 128;
        return textColor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jw
    public String getSDKInfo() {
        int i = getWarnings;
        int i2 = (i & (-14)) | ((~i) & 13);
        int i3 = -(-((i & 13) << 1));
        ThreeDS2Service = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        String backgroundColor = this.initialize.getBackgroundColor();
        int i4 = ThreeDS2Service;
        int i5 = i4 | 11;
        int i6 = i5 << 1;
        int i7 = -((~(i4 & 11)) & i5);
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        getWarnings = i8 % 128;
        if (i8 % 2 != 0) {
            return backgroundColor;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jw
    public String getWarnings() {
        int i = ThreeDS2Service;
        int i2 = i ^ 107;
        int i3 = ((i & 107) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        getWarnings = i5 % 128;
        int i6 = i5 % 2;
        com.netcetera.threeds.sdk.api.ui.logic.ToolbarCustomization toolbarCustomization = this.initialize;
        if (i6 != 0) {
            return toolbarCustomization.getHeaderText();
        }
        toolbarCustomization.getHeaderText();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String initialize() {
        int i = getWarnings;
        ThreeDS2Service = SVG$Unit$EnumUnboxingLocalUtility.m$1((i | EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) << 1, i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 1, 128);
        String textFontName = this.initialize.getTextFontName();
        int i2 = getWarnings;
        int i3 = ((i2 | 91) << 1) - (i2 ^ 91);
        ThreeDS2Service = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 11 / 0;
        }
        return textFontName;
    }
}
