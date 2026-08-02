package com.netcetera.threeds.sdk.api.ui.logic;

import com.netcetera.threeds.sdk.infrastructure.ng;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class ToolbarCustomization extends Customization implements Serializable {
    private static int ThreeDS2Service = 0;
    private static int getSDKInfo = 1;
    private String ThreeDS2ServiceInstance;
    private String get;
    private String getWarnings;
    private String initialize;

    public String getBackgroundColor() {
        int i = ThreeDS2Service + 79;
        int i2 = i % 128;
        getSDKInfo = i2;
        int i3 = i % 2;
        String str = this.get;
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        ThreeDS2Service = (i2 + 37) % 128;
        return str;
    }

    public String getButtonText() {
        int i = ThreeDS2Service;
        String str = this.initialize;
        int i2 = i + 13;
        getSDKInfo = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Deprecated
    public String getDarkBackgroundColor() {
        int i = getSDKInfo + 75;
        ThreeDS2Service = i % 128;
        int i2 = i % 2;
        String str = this.getWarnings;
        if (i2 != 0) {
            int i3 = 80 / 0;
        }
        return str;
    }

    public String getHeaderText() {
        int i = getSDKInfo + 13;
        ThreeDS2Service = i % 128;
        int i2 = i % 2;
        String str = this.ThreeDS2ServiceInstance;
        if (i2 != 0) {
            int i3 = 5 / 0;
        }
        return str;
    }

    public void setBackgroundColor(String str) {
        getSDKInfo = (ThreeDS2Service + 19) % 128;
        ng.initialize(str, "hexColorCode");
        this.get = str;
        int i = ThreeDS2Service + 79;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public void setButtonText(String str) {
        int i = ThreeDS2Service + 7;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            ng.get(str, "buttonText");
            this.initialize = str;
            int i2 = 2 / 0;
        } else {
            ng.get(str, "buttonText");
            this.initialize = str;
        }
        getSDKInfo = (ThreeDS2Service + 65) % 128;
    }

    @Deprecated
    public void setDarkBackgroundColor(String str) {
        ThreeDS2Service = (getSDKInfo + 121) % 128;
        ng.initialize(str, "darkHexColorCode");
        this.getWarnings = str;
        getSDKInfo = (ThreeDS2Service + 93) % 128;
    }

    public void setHeaderText(String str) {
        getSDKInfo = (ThreeDS2Service + 27) % 128;
        ng.get(str, "headerText");
        this.ThreeDS2ServiceInstance = str;
        int i = ThreeDS2Service + 117;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            int i2 = 20 / 0;
        }
    }
}
