package com.netcetera.threeds.sdk.infrastructure;

import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
class setMovementMethod implements Callable {
    private final setAutoSizeTextTypeUniformWithPresetSizes get;

    public setMovementMethod(setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes) {
        this.get = setautosizetexttypeuniformwithpresetsizes;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return setAutoSizeTextTypeUniformWithPresetSizes.getWarnings(this.get);
    }
}
