package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint;

/* loaded from: classes5.dex */
class setAutoHandwritingEnabled implements setScrollCaptureHint.ThreeDS2Service {
    private final com.netcetera.threeds.sdk.api.transaction.challenge.events.CompletionEvent ThreeDS2Service;
    private final setViewTranslationCallback initialize;

    public setAutoHandwritingEnabled(setViewTranslationCallback setviewtranslationcallback, com.netcetera.threeds.sdk.api.transaction.challenge.events.CompletionEvent completionEvent) {
        this.initialize = setviewtranslationcallback;
        this.ThreeDS2Service = completionEvent;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint.ThreeDS2Service
    public void getWarnings() {
        setViewTranslationCallback.initialize(new Object[]{r0, this.ThreeDS2Service}, -1334083054, 1334083056, System.identityHashCode(this.initialize));
    }
}
