package com.netcetera.threeds.sdk.infrastructure;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class jk implements com.netcetera.threeds.sdk.api.ui.ProgressView {
    private static int getWarnings = 1;
    private static int initialize;
    private final com.netcetera.threeds.sdk.api.ui.ProgressView ThreeDS2Service;
    private final nc ThreeDS2ServiceInstance;

    public jk(com.netcetera.threeds.sdk.api.ui.ProgressView progressView, nc ncVar) {
        this.ThreeDS2Service = progressView;
        this.ThreeDS2ServiceInstance = ncVar;
    }

    @Override // com.netcetera.threeds.sdk.api.ui.ProgressView
    public void hideProgress() {
        int i = getWarnings + 69;
        initialize = i % 128;
        int i2 = i % 2;
        nc ncVar = this.ThreeDS2ServiceInstance;
        if (i2 != 0) {
            ncVar.ThreeDS2ServiceInstance();
            throw null;
        }
        if (!ncVar.ThreeDS2ServiceInstance()) {
            this.ThreeDS2Service.hideProgress();
            int i3 = initialize;
            getWarnings = (((i3 | 115) << 1) - (i3 ^ 115)) % 128;
        }
        int i4 = getWarnings;
        int i5 = i4 | 97;
        int i6 = i5 << 1;
        int i7 = -((~(i4 & 97)) & i5);
        int i8 = (i6 & i7) + (i7 | i6);
        initialize = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.api.ui.ProgressView
    public boolean isProgressShown() {
        int i = initialize;
        int i2 = i & 95;
        getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m$1(i2, ~(-(-((i ^ 95) | i2))), 1, 128);
        boolean isProgressShown = this.ThreeDS2Service.isProgressShown();
        int i3 = getWarnings;
        initialize = SVG$Unit$EnumUnboxingLocalUtility.m$1(i3 & 121, ~(-(-(i3 | 121))), 1, 128);
        return isProgressShown;
    }

    @Override // com.netcetera.threeds.sdk.api.ui.ProgressView
    public void showProgress() {
        int i = getWarnings;
        int i2 = i & 53;
        int i3 = i2 + ((i ^ 53) | i2);
        initialize = i3 % 128;
        int i4 = i3 % 2;
        nc ncVar = this.ThreeDS2ServiceInstance;
        if (i4 != 0) {
            ncVar.ThreeDS2ServiceInstance();
            throw null;
        }
        if (!ncVar.ThreeDS2ServiceInstance()) {
            int i5 = initialize;
            int i6 = ((i5 & (-24)) | ((~i5) & 23)) + ((i5 & 23) << 1);
            getWarnings = i6 % 128;
            int i7 = i6 % 2;
            com.netcetera.threeds.sdk.api.ui.ProgressView progressView = this.ThreeDS2Service;
            if (i7 == 0) {
                progressView.showProgress();
                int i8 = 75 / 0;
            } else {
                progressView.showProgress();
            }
        }
        int i9 = getWarnings;
        int i10 = (i9 & 117) + (i9 | 117);
        initialize = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 56 / 0;
        }
    }
}
