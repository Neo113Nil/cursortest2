package com.netcetera.threeds.sdk.infrastructure;

import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
class setSecondaryProgressTintMode implements Callable {
    private final setSecondaryProgressTintList ThreeDS2Service;

    public setSecondaryProgressTintMode(setSecondaryProgressTintList setsecondaryprogresstintlist) {
        this.ThreeDS2Service = setsecondaryprogresstintlist;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return setSecondaryProgressTintList.get(this.ThreeDS2Service);
    }
}
