package com.netcetera.threeds.sdk.infrastructure;

import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
class setTransformationMethod implements Callable {
    private final setOnItemClickListener ThreeDS2Service;
    private final String ThreeDS2ServiceInitializationCallback;
    private final String ThreeDS2ServiceInstance;
    private final String get;
    private final String getWarnings;
    private final setAutoSizeTextTypeUniformWithPresetSizes initialize;

    public setTransformationMethod(setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes, setOnItemClickListener setonitemclicklistener, String str, String str2, String str3, String str4) {
        this.initialize = setautosizetexttypeuniformwithpresetsizes;
        this.ThreeDS2Service = setonitemclicklistener;
        this.getWarnings = str;
        this.get = str2;
        this.ThreeDS2ServiceInstance = str3;
        this.ThreeDS2ServiceInitializationCallback = str4;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return setAutoSizeTextTypeUniformWithPresetSizes.ThreeDS2ServiceInstance(this.initialize, this.ThreeDS2Service, this.getWarnings, this.get, this.ThreeDS2ServiceInstance, this.ThreeDS2ServiceInitializationCallback);
    }
}
