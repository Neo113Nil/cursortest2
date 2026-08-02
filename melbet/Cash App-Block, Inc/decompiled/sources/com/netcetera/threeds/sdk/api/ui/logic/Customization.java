package com.netcetera.threeds.sdk.api.ui.logic;

import com.netcetera.threeds.sdk.infrastructure.ng;
import java.io.Serializable;

/* loaded from: classes5.dex */
public abstract class Customization implements Serializable {
    private static int ThreeDS2Service = 0;
    private static int ThreeDS2ServiceInitializationCallback = 1;
    private String ThreeDS2ServiceInstance;
    private String get;
    private int getWarnings;
    private String initialize;

    @Deprecated
    public String getDarkTextColor() {
        int i = ThreeDS2ServiceInitializationCallback;
        String str = this.ThreeDS2ServiceInstance;
        int i2 = i + 83;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String getTextColor() {
        int i = ThreeDS2Service;
        String str = this.get;
        int i2 = i + 13;
        ThreeDS2ServiceInitializationCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public String getTextFontName() {
        int i = ThreeDS2Service;
        String str = this.initialize;
        ThreeDS2ServiceInitializationCallback = (i + 31) % 128;
        return str;
    }

    public int getTextFontSize() {
        int i = (ThreeDS2Service + 43) % 128;
        ThreeDS2ServiceInitializationCallback = i;
        int i2 = this.getWarnings;
        ThreeDS2Service = (i + 85) % 128;
        return i2;
    }

    @Deprecated
    public void setDarkTextColor(String str) {
        ThreeDS2Service = (ThreeDS2ServiceInitializationCallback + 71) % 128;
        ng.initialize(str, "darkTextColor");
        this.ThreeDS2ServiceInstance = str;
        ThreeDS2ServiceInitializationCallback = (ThreeDS2Service + 65) % 128;
    }

    public void setTextColor(String str) {
        int i = ThreeDS2ServiceInitializationCallback + 79;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            ng.initialize(str, "hexColorCode");
            this.get = str;
        } else {
            ng.initialize(str, "hexColorCode");
            this.get = str;
            int i2 = 64 / 0;
        }
    }

    public void setTextFontName(String str) {
        int i = ThreeDS2Service + 41;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 != 0) {
            ng.get(str, "textFontName");
            this.initialize = str;
        } else {
            ng.get(str, "textFontName");
            this.initialize = str;
            throw null;
        }
    }

    public void setTextFontSize(int i) {
        int i2 = ThreeDS2ServiceInitializationCallback + 49;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 != 0) {
            ng.initialize(i, "textFontSize");
            this.getWarnings = i;
            throw null;
        }
        ng.initialize(i, "textFontSize");
        this.getWarnings = i;
        ThreeDS2ServiceInitializationCallback = (ThreeDS2Service + 15) % 128;
    }
}
