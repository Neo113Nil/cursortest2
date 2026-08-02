package com.netcetera.threeds.sdk.infrastructure;

import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
class setProgressDrawableTiled implements Callable {
    private final setSecondaryProgressTintList get;

    public setProgressDrawableTiled(setSecondaryProgressTintList setsecondaryprogresstintlist) {
        this.get = setsecondaryprogresstintlist;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return setSecondaryProgressTintList.ThreeDS2ServiceInstance(this.get);
    }
}
