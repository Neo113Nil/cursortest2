package com.netcetera.threeds.sdk.infrastructure;

import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
class setImeActionLabel implements Callable {
    private final String ThreeDS2Service;
    private final setFreezesText getWarnings;

    public setImeActionLabel(setFreezesText setfreezestext, String str) {
        this.getWarnings = setfreezestext;
        this.ThreeDS2Service = str;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return setFreezesText.C_(this.getWarnings, this.ThreeDS2Service);
    }
}
