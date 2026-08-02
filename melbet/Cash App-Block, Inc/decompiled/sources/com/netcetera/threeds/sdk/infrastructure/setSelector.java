package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setMultiChoiceModeListener;

/* loaded from: classes5.dex */
class setSelector implements Runnable {
    private final setScrollCaptureCallback ThreeDS2ServiceInstance;
    private final setMultiChoiceModeListener.getWarnings getWarnings;

    public setSelector(setMultiChoiceModeListener.getWarnings getwarnings, setScrollCaptureCallback setscrollcapturecallback) {
        this.getWarnings = getwarnings;
        this.ThreeDS2ServiceInstance = setscrollcapturecallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        setMultiChoiceModeListener.getWarnings.initialize(new Object[]{r0, this.ThreeDS2ServiceInstance}, -881455256, 881455260, System.identityHashCode(this.getWarnings));
    }
}
