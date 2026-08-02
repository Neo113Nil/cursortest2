package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setMultiChoiceModeListener;

/* loaded from: classes5.dex */
class setDrawSelectorOnTop implements Runnable {
    private final setMultiChoiceModeListener.ThreeDS2Service ThreeDS2Service;
    private final setScrollCaptureCallback get;

    public setDrawSelectorOnTop(setMultiChoiceModeListener.ThreeDS2Service threeDS2Service, setScrollCaptureCallback setscrollcapturecallback) {
        this.ThreeDS2Service = threeDS2Service;
        this.get = setscrollcapturecallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        setMultiChoiceModeListener.ThreeDS2Service.ThreeDS2ServiceInstance(new Object[]{r0, this.get}, 1203320398, -1203320398, System.identityHashCode(this.ThreeDS2Service));
    }
}
