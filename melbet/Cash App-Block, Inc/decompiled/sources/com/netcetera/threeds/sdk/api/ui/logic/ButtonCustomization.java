package com.netcetera.threeds.sdk.api.ui.logic;

import com.netcetera.threeds.sdk.infrastructure.ng;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class ButtonCustomization extends Customization implements Serializable {
    private static int get = 0;
    private static int getWarnings = 1;
    private String ThreeDS2Service;
    private String ThreeDS2ServiceInstance;
    private int initialize;

    public String getBackgroundColor() {
        int i = (get + 107) % 128;
        getWarnings = i;
        String str = this.ThreeDS2ServiceInstance;
        get = (i + 35) % 128;
        return str;
    }

    public int getCornerRadius() {
        int i = (get + 5) % 128;
        getWarnings = i;
        int i2 = this.initialize;
        get = (i + 21) % 128;
        return i2;
    }

    @Deprecated
    public String getDarkBackgroundColor() {
        int i = get + 83;
        int i2 = i % 128;
        getWarnings = i2;
        int i3 = i % 2;
        String str = this.ThreeDS2Service;
        if (i3 == 0) {
            throw null;
        }
        get = (i2 + 71) % 128;
        return str;
    }

    public void setBackgroundColor(String str) {
        get = (getWarnings + 33) % 128;
        ng.initialize(str, "backgroundColor");
        this.ThreeDS2ServiceInstance = str;
        int i = getWarnings + 75;
        get = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public void setCornerRadius(int i) {
        getWarnings = (get + 117) % 128;
        ng.ThreeDS2ServiceInstance(i, "cornerRadius");
        this.initialize = i;
        int i2 = getWarnings + 103;
        get = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Deprecated
    public void setDarkBackgroundColor(String str) {
        int i = getWarnings + 81;
        get = i % 128;
        if (i % 2 != 0) {
            ng.initialize(str, "darkBackgroundColor");
            this.ThreeDS2Service = str;
            throw null;
        }
        ng.initialize(str, "darkBackgroundColor");
        this.ThreeDS2Service = str;
        getWarnings = (get + 11) % 128;
    }
}
