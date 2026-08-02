package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
class setSelectedChildViewEnabled implements Runnable {
    private final setCertificate initialize;

    public setSelectedChildViewEnabled(setCertificate setcertificate) {
        this.initialize = setcertificate;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.initialize.ThreeDS2ServiceInstance();
    }
}
