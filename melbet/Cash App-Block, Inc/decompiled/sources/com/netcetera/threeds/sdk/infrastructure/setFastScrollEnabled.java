package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
class setFastScrollEnabled implements Runnable {
    private final setMultiChoiceModeListener ThreeDS2Service;
    private final setMinEms ThreeDS2ServiceInstance;
    private final setNetworkAvailable initialize;

    public setFastScrollEnabled(setMultiChoiceModeListener setmultichoicemodelistener, setMinEms setminems, setNetworkAvailable setnetworkavailable) {
        this.ThreeDS2Service = setmultichoicemodelistener;
        this.ThreeDS2ServiceInstance = setminems;
        this.initialize = setnetworkavailable;
    }

    @Override // java.lang.Runnable
    public void run() {
        setMultiChoiceModeListener.ThreeDS2ServiceInstance(this.ThreeDS2Service, this.ThreeDS2ServiceInstance, this.initialize);
    }
}
