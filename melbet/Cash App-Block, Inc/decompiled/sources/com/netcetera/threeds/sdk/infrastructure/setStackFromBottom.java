package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
class setStackFromBottom implements Runnable {
    private final setCertificate ThreeDS2Service;
    private final setCursorVisible ThreeDS2ServiceInstance;
    private final setMultiChoiceModeListener getWarnings;

    public setStackFromBottom(setMultiChoiceModeListener setmultichoicemodelistener, setCursorVisible setcursorvisible, setCertificate setcertificate) {
        this.getWarnings = setmultichoicemodelistener;
        this.ThreeDS2ServiceInstance = setcursorvisible;
        this.ThreeDS2Service = setcertificate;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object[] objArr = {this.getWarnings, this.ThreeDS2ServiceInstance, this.ThreeDS2Service};
        setMultiChoiceModeListener.getWarnings(objArr);
    }
}
