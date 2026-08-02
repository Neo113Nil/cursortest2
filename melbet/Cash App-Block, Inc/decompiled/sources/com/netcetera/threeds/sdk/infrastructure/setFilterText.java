package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setMultiChoiceModeListener;

/* loaded from: classes5.dex */
class setFilterText implements Runnable {
    private final setMultiChoiceModeListener.getWarnings ThreeDS2ServiceInstance;
    private final setScrollCaptureCallback get;

    public setFilterText(setMultiChoiceModeListener.getWarnings getwarnings, setScrollCaptureCallback setscrollcapturecallback) {
        this.ThreeDS2ServiceInstance = getwarnings;
        this.get = setscrollcapturecallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        setMultiChoiceModeListener.getWarnings.initialize(new Object[]{r0, this.get}, -1622489240, 1622489243, System.identityHashCode(this.ThreeDS2ServiceInstance));
    }
}
