package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;

/* loaded from: classes5.dex */
class setClipChildren implements setScrollCaptureHint.ThreeDS2Service {
    private final setViewTranslationCallback ThreeDS2ServiceInstance;

    public setClipChildren(setViewTranslationCallback setviewtranslationcallback) {
        this.ThreeDS2ServiceInstance = setviewtranslationcallback;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2Service
    public void getWarnings() {
        this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance();
    }
}
