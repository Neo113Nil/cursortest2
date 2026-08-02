package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class lx implements jt {
    private static int ThreeDS2ServiceInstance = 1;
    private static int getWarnings;
    private final com.netcetera.threeds.sdk.api.ui.logic.ViewCustomization ThreeDS2Service;

    public lx(com.netcetera.threeds.sdk.api.ui.logic.ViewCustomization viewCustomization) {
        this.ThreeDS2Service = viewCustomization;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jt
    public String get() {
        int i = getWarnings;
        int i2 = (i & (-54)) | ((~i) & 53);
        int i3 = (i & 53) << 1;
        ThreeDS2ServiceInstance = ((i2 & i3) + (i3 | i2)) % 128;
        String challengeViewBackgroundColor = this.ThreeDS2Service.getChallengeViewBackgroundColor();
        int i4 = getWarnings;
        int i5 = i4 & 69;
        int i6 = (i4 | 69) & (~i5);
        int i7 = i5 << 1;
        ThreeDS2ServiceInstance = (((i6 | i7) << 1) - (i6 ^ i7)) % 128;
        return challengeViewBackgroundColor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jt
    public String getWarnings() {
        int i = ThreeDS2ServiceInstance;
        int i2 = (i & (-34)) | ((~i) & 33);
        int i3 = (i & 33) << 1;
        int i4 = (i2 & i3) + (i3 | i2);
        getWarnings = i4 % 128;
        int i5 = i4 % 2;
        String progressViewBackgroundColor = this.ThreeDS2Service.getProgressViewBackgroundColor();
        if (i5 != 0) {
            int i6 = 77 / 0;
        }
        return progressViewBackgroundColor;
    }
}
