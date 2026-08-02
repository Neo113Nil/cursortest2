package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;

/* loaded from: classes5.dex */
class setRequestedFrameRate implements setScrollCaptureHint.ThreeDS2Service {
    private final setViewTranslationCallback initialize;

    public setRequestedFrameRate(setViewTranslationCallback setviewtranslationcallback) {
        this.initialize = setviewtranslationcallback;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2Service
    public void getWarnings() {
        this.initialize.initialize();
    }
}
