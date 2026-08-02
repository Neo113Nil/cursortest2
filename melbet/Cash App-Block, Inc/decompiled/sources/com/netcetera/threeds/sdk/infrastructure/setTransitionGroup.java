package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;

/* loaded from: classes5.dex */
class setTransitionGroup implements setScrollCaptureHint.ThreeDS2Service {
    private final com.netcetera.threeds.sdk.api.transaction.challenge.events.ProtocolErrorEvent get;
    private final setViewTranslationCallback initialize;

    public setTransitionGroup(setViewTranslationCallback setviewtranslationcallback, com.netcetera.threeds.sdk.api.transaction.challenge.events.ProtocolErrorEvent protocolErrorEvent) {
        this.initialize = setviewtranslationcallback;
        this.get = protocolErrorEvent;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2Service
    public void getWarnings() {
        setViewTranslationCallback.initialize(new Object[]{r0, this.get}, 370795263, -370795260, System.identityHashCode(this.initialize));
    }
}
