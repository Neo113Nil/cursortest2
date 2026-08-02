package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.jj;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
class setOverScrollMode implements Callable {
    private final String ThreeDS2ServiceInstance;
    private final jj.initialize get;
    private final setTextDirection initialize;

    public setOverScrollMode(setTextDirection settextdirection, String str, jj.initialize initializeVar) {
        this.initialize = settextdirection;
        this.ThreeDS2ServiceInstance = str;
        this.get = initializeVar;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return setTextDirection.initialize(this.initialize, this.ThreeDS2ServiceInstance, this.get);
    }
}
