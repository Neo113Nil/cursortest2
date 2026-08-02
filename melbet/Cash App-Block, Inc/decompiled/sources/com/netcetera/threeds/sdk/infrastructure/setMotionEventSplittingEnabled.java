package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;

/* loaded from: classes5.dex */
class setMotionEventSplittingEnabled implements setScrollCaptureHint.ThreeDS2Service {
    private final com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent ThreeDS2Service;
    private final setViewTranslationCallback get;

    public setMotionEventSplittingEnabled(setViewTranslationCallback setviewtranslationcallback, com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent runtimeErrorEvent) {
        this.get = setviewtranslationcallback;
        this.ThreeDS2Service = runtimeErrorEvent;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2Service
    public void getWarnings() {
        setViewTranslationCallback.initialize(new Object[]{r0, this.ThreeDS2Service}, -1611090650, 1611090651, System.identityHashCode(this.get));
    }
}
