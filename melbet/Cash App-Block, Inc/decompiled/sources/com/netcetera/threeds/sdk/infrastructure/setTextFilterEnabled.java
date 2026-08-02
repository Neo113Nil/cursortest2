package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setMultiChoiceModeListener;

/* loaded from: classes5.dex */
class setTextFilterEnabled implements Runnable {
    private final setScrollCaptureCallback ThreeDS2Service;
    private final setMultiChoiceModeListener.getWarnings ThreeDS2ServiceInstance;

    public setTextFilterEnabled(setMultiChoiceModeListener.getWarnings getwarnings, setScrollCaptureCallback setscrollcapturecallback) {
        this.ThreeDS2ServiceInstance = getwarnings;
        this.ThreeDS2Service = setscrollcapturecallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        setMultiChoiceModeListener.getWarnings.initialize(new Object[]{r0, this.ThreeDS2Service}, 1866864161, -1866864161, System.identityHashCode(this.ThreeDS2ServiceInstance));
    }
}
