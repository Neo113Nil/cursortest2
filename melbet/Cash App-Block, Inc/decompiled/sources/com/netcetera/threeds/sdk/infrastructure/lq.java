package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class lq implements jw {
    private static int ThreeDS2Service = 0;
    private static int get = 1;
    private final com.netcetera.threeds.sdk.api.ui.logic.ToolbarCustomization ThreeDS2ServiceInstance;

    public lq(com.netcetera.threeds.sdk.api.ui.logic.ToolbarCustomization toolbarCustomization) {
        this.ThreeDS2ServiceInstance = toolbarCustomization;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jw
    public String ThreeDS2Service() {
        ThreeDS2Service = (get + 65) % 128;
        String buttonText = this.ThreeDS2ServiceInstance.getButtonText();
        int i = ThreeDS2Service + 87;
        get = i % 128;
        if (i % 2 == 0) {
            int i2 = 21 / 0;
        }
        return buttonText;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public int ThreeDS2ServiceInstance() {
        int i = get;
        int i2 = i & 39;
        int i3 = i2 + ((i ^ 39) | i2);
        ThreeDS2Service = i3 % 128;
        int i4 = i3 % 2;
        com.netcetera.threeds.sdk.api.ui.logic.ToolbarCustomization toolbarCustomization = this.ThreeDS2ServiceInstance;
        if (i4 == 0) {
            return toolbarCustomization.getTextFontSize();
        }
        toolbarCustomization.getTextFontSize();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String get() {
        int i = ThreeDS2Service;
        get = ((i ^ 91) + ((i & 91) << 1)) % 128;
        String darkTextColor = this.ThreeDS2ServiceInstance.getDarkTextColor();
        get = (ThreeDS2Service + 113) % 128;
        return darkTextColor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jw
    public String getSDKInfo() {
        int i = get + 112;
        int i2 = (i ^ (-1)) + (i << 1);
        ThreeDS2Service = i2 % 128;
        int i3 = i2 % 2;
        com.netcetera.threeds.sdk.api.ui.logic.ToolbarCustomization toolbarCustomization = this.ThreeDS2ServiceInstance;
        if (i3 != 0) {
            toolbarCustomization.getDarkBackgroundColor();
            throw null;
        }
        String darkBackgroundColor = toolbarCustomization.getDarkBackgroundColor();
        int i4 = ThreeDS2Service;
        int i5 = (((i4 | 66) << 1) - (i4 ^ 66)) - 1;
        get = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 30 / 0;
        }
        return darkBackgroundColor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jw
    public String getWarnings() {
        int i = ThreeDS2Service;
        int i2 = i & 119;
        int i3 = ((i ^ 119) | i2) << 1;
        int i4 = -((i | 119) & (~i2));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        get = i5 % 128;
        int i6 = i5 % 2;
        com.netcetera.threeds.sdk.api.ui.logic.ToolbarCustomization toolbarCustomization = this.ThreeDS2ServiceInstance;
        if (i6 == 0) {
            toolbarCustomization.getHeaderText();
            throw null;
        }
        String headerText = toolbarCustomization.getHeaderText();
        int i7 = ThreeDS2Service;
        int i8 = (i7 & 21) + (i7 | 21);
        get = i8 % 128;
        if (i8 % 2 != 0) {
            return headerText;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String initialize() {
        int i = get;
        int i2 = i ^ 63;
        int i3 = -(-((i & 63) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        ThreeDS2Service = i4 % 128;
        int i5 = i4 % 2;
        com.netcetera.threeds.sdk.api.ui.logic.ToolbarCustomization toolbarCustomization = this.ThreeDS2ServiceInstance;
        if (i5 != 0) {
            toolbarCustomization.getTextFontName();
            throw null;
        }
        String textFontName = toolbarCustomization.getTextFontName();
        int i6 = ThreeDS2Service;
        int i7 = i6 ^ 51;
        get = ((((i6 & 51) | i7) << 1) - i7) % 128;
        return textFontName;
    }
}
