package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
class ad implements Runnable {
    private final String ThreeDS2Service;
    private final x initialize;

    public ad(x xVar, String str) {
        this.initialize = xVar;
        this.ThreeDS2Service = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        x.ThreeDS2Service(this.initialize, this.ThreeDS2Service);
    }
}
