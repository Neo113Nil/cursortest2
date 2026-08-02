package com.netcetera.threeds.sdk.infrastructure;

import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
class setSecondaryProgressTintBlendMode implements Callable {
    private final setProgressBackgroundTintList ThreeDS2Service;
    private final setSecondaryProgressTintList ThreeDS2ServiceInstance;

    public setSecondaryProgressTintBlendMode(setSecondaryProgressTintList setsecondaryprogresstintlist, setProgressBackgroundTintList setprogressbackgroundtintlist) {
        this.ThreeDS2ServiceInstance = setsecondaryprogresstintlist;
        this.ThreeDS2Service = setprogressbackgroundtintlist;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return setSecondaryProgressTintList.getWarnings(this.ThreeDS2ServiceInstance, this.ThreeDS2Service);
    }
}
