package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
class ch implements Runnable {
    private final cg ThreeDS2ServiceInstance;
    private final setScroller initialize;

    public ch(cg cgVar, setScroller setscroller) {
        this.ThreeDS2ServiceInstance = cgVar;
        this.initialize = setscroller;
    }

    @Override // java.lang.Runnable
    public void run() {
        cg.ThreeDS2Service(this.ThreeDS2ServiceInstance, this.initialize);
    }
}
