package com.netcetera.threeds.sdk.api.ui.logic;

import com.netcetera.threeds.sdk.infrastructure.ng;
import com.plaid.internal.EnumC0170g;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class LabelCustomization extends Customization implements Serializable {
    private static int ThreeDS2ServiceInstance = 0;
    private static int createTransaction = 1;
    private int ThreeDS2Service;
    private String get;
    private String getWarnings;
    private String initialize;

    @Deprecated
    public String getHeadingDarkTextColor() {
        int i = createTransaction;
        String str = this.initialize;
        int i2 = i + 89;
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String getHeadingTextColor() {
        int i = createTransaction + 105;
        ThreeDS2ServiceInstance = i % 128;
        int i2 = i % 2;
        String str = this.get;
        if (i2 != 0) {
            int i3 = 73 / 0;
        }
        return str;
    }

    public String getHeadingTextFontName() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i + 97;
        createTransaction = i2 % 128;
        int i3 = i2 % 2;
        String str = this.getWarnings;
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        createTransaction = (i + 53) % 128;
        return str;
    }

    public int getHeadingTextFontSize() {
        int i = ThreeDS2ServiceInstance + 65;
        createTransaction = i % 128;
        int i2 = i % 2;
        int i3 = this.ThreeDS2Service;
        if (i2 != 0) {
            return i3;
        }
        throw null;
    }

    @Deprecated
    public void setHeadingDarkTextColor(String str) {
        int i = createTransaction + 51;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 != 0) {
            ng.initialize(str, "darkHeadingTextColor");
            this.initialize = str;
            throw null;
        }
        ng.initialize(str, "darkHeadingTextColor");
        this.initialize = str;
        int i2 = createTransaction + 37;
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 86 / 0;
        }
    }

    public void setHeadingTextColor(String str) {
        createTransaction = (ThreeDS2ServiceInstance + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        ng.initialize(str, "hexColorCode");
        this.get = str;
        int i = createTransaction + 61;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public void setHeadingTextFontName(String str) {
        int i = createTransaction + 107;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 != 0) {
            ng.get(str, "headingTextFontName");
            this.getWarnings = str;
            int i2 = 86 / 0;
        } else {
            ng.get(str, "headingTextFontName");
            this.getWarnings = str;
        }
        int i3 = ThreeDS2ServiceInstance + 27;
        createTransaction = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 38 / 0;
        }
    }

    public void setHeadingTextFontSize(int i) {
        int i2 = createTransaction + 93;
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 != 0) {
            ng.initialize(i, "headingTextFontSize");
            this.ThreeDS2Service = i;
            int i3 = 56 / 0;
        } else {
            ng.initialize(i, "headingTextFontSize");
            this.ThreeDS2Service = i;
        }
        int i4 = createTransaction + 29;
        ThreeDS2ServiceInstance = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
