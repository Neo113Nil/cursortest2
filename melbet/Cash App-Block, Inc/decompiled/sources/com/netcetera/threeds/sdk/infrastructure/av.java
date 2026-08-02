package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
class av implements Runnable {
    private final String getWarnings;
    private final at initialize;

    public av(at atVar, String str) {
        this.initialize = atVar;
        this.getWarnings = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        at.get(this.initialize, this.getWarnings);
    }
}
