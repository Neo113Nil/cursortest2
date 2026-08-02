package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
class setIndeterminate implements Runnable {
    private final String ThreeDS2ServiceInstance;
    private final setOverscrollFooter getWarnings;
    private final setOnItemClickListener initialize;

    public setIndeterminate(setOverscrollFooter setoverscrollfooter, setOnItemClickListener setonitemclicklistener, String str) {
        this.getWarnings = setoverscrollfooter;
        this.initialize = setonitemclicklistener;
        this.ThreeDS2ServiceInstance = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        setOverscrollFooter.ThreeDS2ServiceInstance(this.getWarnings, this.initialize, this.ThreeDS2ServiceInstance);
    }
}
