package com.netcetera.threeds.sdk.api.ui.logic;

import com.netcetera.threeds.sdk.infrastructure.ng;
import com.plaid.internal.EnumC0170g;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class ViewCustomization implements Serializable {
    private static int ThreeDS2ServiceInstance = 1;
    private static int initialize;
    private String ThreeDS2Service;
    private String getWarnings;

    public String getChallengeViewBackgroundColor() {
        int i = (ThreeDS2ServiceInstance + 9) % 128;
        initialize = i;
        String str = this.getWarnings;
        ThreeDS2ServiceInstance = (i + 121) % 128;
        return str;
    }

    public String getProgressViewBackgroundColor() {
        int i = initialize + 113;
        ThreeDS2ServiceInstance = i % 128;
        int i2 = i % 2;
        String str = this.ThreeDS2Service;
        if (i2 == 0) {
            int i3 = 22 / 0;
        }
        return str;
    }

    public void setChallengeViewBackgroundColor(String str) {
        ThreeDS2ServiceInstance = (initialize + 27) % 128;
        ng.initialize(str, "challengeViewBackgroundColor");
        this.getWarnings = str;
        int i = initialize + 73;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public void setProgressViewBackgroundColor(String str) {
        int i = ThreeDS2ServiceInstance + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        initialize = i % 128;
        if (i % 2 != 0) {
            ng.initialize(str, "progressViewBackgroundColor");
            this.ThreeDS2Service = str;
            throw null;
        }
        ng.initialize(str, "progressViewBackgroundColor");
        this.ThreeDS2Service = str;
        initialize = (ThreeDS2ServiceInstance + 85) % 128;
    }
}
