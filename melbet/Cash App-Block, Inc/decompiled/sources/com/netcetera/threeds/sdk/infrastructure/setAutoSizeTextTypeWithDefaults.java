package com.netcetera.threeds.sdk.infrastructure;

import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
class setAutoSizeTextTypeWithDefaults implements Callable {
    private final setOnItemClickListener ThreeDS2Service;
    private final setAutoSizeTextTypeUniformWithPresetSizes getWarnings;
    private final String initialize;

    public setAutoSizeTextTypeWithDefaults(setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes, setOnItemClickListener setonitemclicklistener, String str) {
        this.getWarnings = setautosizetexttypeuniformwithpresetsizes;
        this.ThreeDS2Service = setonitemclicklistener;
        this.initialize = str;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return setAutoSizeTextTypeUniformWithPresetSizes.ThreeDS2Service(this.getWarnings, this.ThreeDS2Service, this.initialize);
    }
}
