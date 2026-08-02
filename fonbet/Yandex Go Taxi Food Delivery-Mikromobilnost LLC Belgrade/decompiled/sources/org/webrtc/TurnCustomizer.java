package org.webrtc;

import defpackage.ny61;

/* loaded from: classes4.dex */
public class TurnCustomizer {
    private long nativeTurnCustomizer;

    public TurnCustomizer(long j) {
        this.nativeTurnCustomizer = j;
    }

    private void checkTurnCustomizerExists() {
        if (this.nativeTurnCustomizer != 0) {
            return;
        }
        ny61.r("TurnCustomizer has been disposed.");
    }

    private static native void nativeFreeTurnCustomizer(long j);

    public void dispose() {
        checkTurnCustomizerExists();
        nativeFreeTurnCustomizer(this.nativeTurnCustomizer);
        this.nativeTurnCustomizer = 0L;
    }

    public long getNativeTurnCustomizer() {
        checkTurnCustomizerExists();
        return this.nativeTurnCustomizer;
    }
}
