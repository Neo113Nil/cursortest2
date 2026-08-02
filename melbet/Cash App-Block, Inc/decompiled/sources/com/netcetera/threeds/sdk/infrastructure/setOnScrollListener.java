package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setMultiChoiceModeListener;

/* loaded from: classes5.dex */
class setOnScrollListener implements Runnable {
    private final setMultiChoiceModeListener.getWarnings get;
    private final setScroller getWarnings;

    public setOnScrollListener(setMultiChoiceModeListener.getWarnings getwarnings, setScroller setscroller) {
        this.get = getwarnings;
        this.getWarnings = setscroller;
    }

    @Override // java.lang.Runnable
    public void run() {
        setMultiChoiceModeListener.getWarnings.initialize(new Object[]{r0, this.getWarnings}, -583085767, 583085768, System.identityHashCode(this.get));
    }
}
