package com.netcetera.threeds.sdk.infrastructure;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class ls implements jt {
    private static int ThreeDS2ServiceInstance = 0;
    private static int initialize = 1;
    private final com.netcetera.threeds.sdk.api.ui.logic.ViewCustomization get;

    public ls(com.netcetera.threeds.sdk.api.ui.logic.ViewCustomization viewCustomization) {
        this.get = viewCustomization;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jt
    public String get() {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 89;
        int i3 = i2 + ((i ^ 89) | i2);
        initialize = i3 % 128;
        int i4 = i3 % 2;
        com.netcetera.threeds.sdk.api.ui.logic.ViewCustomization viewCustomization = this.get;
        if (i4 == 0) {
            viewCustomization.getChallengeViewBackgroundColor();
            throw null;
        }
        String challengeViewBackgroundColor = viewCustomization.getChallengeViewBackgroundColor();
        int i5 = ThreeDS2ServiceInstance;
        int i6 = i5 & 113;
        int i7 = (i6 - (~((i5 ^ 113) | i6))) - 1;
        initialize = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 52 / 0;
        }
        return challengeViewBackgroundColor;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jt
    public String getWarnings() {
        int i = initialize;
        ThreeDS2ServiceInstance = (((i & (-54)) | ((~i) & 53)) + ((i & 53) << 1)) % 128;
        String progressViewBackgroundColor = this.get.getProgressViewBackgroundColor();
        int i2 = ThreeDS2ServiceInstance;
        int i3 = i2 & 75;
        initialize = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i2 ^ 75) | i3) << 1, ~(-((i2 | 75) & (~i3))), 1, 128);
        return progressViewBackgroundColor;
    }
}
