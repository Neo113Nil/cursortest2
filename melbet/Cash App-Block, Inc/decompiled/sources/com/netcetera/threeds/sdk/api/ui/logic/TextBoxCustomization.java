package com.netcetera.threeds.sdk.api.ui.logic;

import com.netcetera.threeds.sdk.infrastructure.ng;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class TextBoxCustomization extends Customization implements Serializable {
    private static int getSDKVersion = 1;
    private static int initialize;
    private int ThreeDS2Service;
    private int ThreeDS2ServiceInstance;
    private String get;
    private String getWarnings;

    public String getBorderColor() {
        int i = getSDKVersion + 17;
        initialize = i % 128;
        int i2 = i % 2;
        String str = this.getWarnings;
        if (i2 != 0) {
            int i3 = 6 / 0;
        }
        return str;
    }

    public int getBorderWidth() {
        int i = (initialize + 17) % 128;
        getSDKVersion = i;
        int i2 = this.ThreeDS2Service;
        initialize = (i + 99) % 128;
        return i2;
    }

    public int getCornerRadius() {
        int i = getSDKVersion;
        int i2 = this.ThreeDS2ServiceInstance;
        int i3 = i + 61;
        initialize = i3 % 128;
        if (i3 % 2 == 0) {
            return i2;
        }
        throw null;
    }

    @Deprecated
    public String getDarkBorderColor() {
        int i = (initialize + 113) % 128;
        getSDKVersion = i;
        String str = this.get;
        initialize = (i + 125) % 128;
        return str;
    }

    public void setBorderColor(String str) {
        initialize = (getSDKVersion + 5) % 128;
        ng.initialize(str, "borderColor");
        this.getWarnings = str;
        int i = getSDKVersion + 15;
        initialize = i % 128;
        if (i % 2 != 0) {
            int i2 = 43 / 0;
        }
    }

    public void setBorderWidth(int i) {
        int i2 = initialize + 51;
        getSDKVersion = i2 % 128;
        if (i2 % 2 != 0) {
            ng.initialize(i, "borderWidth");
            this.ThreeDS2Service = i;
        } else {
            ng.initialize(i, "borderWidth");
            this.ThreeDS2Service = i;
            int i3 = 83 / 0;
        }
    }

    public void setCornerRadius(int i) {
        int i2 = getSDKVersion + 125;
        initialize = i2 % 128;
        if (i2 % 2 == 0) {
            ng.initialize(i, "cornerRadius");
            this.ThreeDS2ServiceInstance = i;
        } else {
            ng.initialize(i, "cornerRadius");
            this.ThreeDS2ServiceInstance = i;
            int i3 = 31 / 0;
        }
    }

    @Deprecated
    public void setDarkBorderColor(String str) {
        int i = getSDKVersion + 119;
        initialize = i % 128;
        if (i % 2 != 0) {
            ng.initialize(str, "darkBorderColor");
            this.get = str;
            throw null;
        }
        ng.initialize(str, "darkBorderColor");
        this.get = str;
        getSDKVersion = (initialize + 91) % 128;
    }
}
