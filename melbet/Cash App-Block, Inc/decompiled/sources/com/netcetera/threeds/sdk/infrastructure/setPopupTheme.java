package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public interface setPopupTheme {

    public interface ThreeDS2ServiceInstance {
        String ThreeDS2ServiceInitializationCallback();

        String getSDKVersion();
    }

    public interface initialize {
        String ThreeDS2Service();

        String ThreeDS2ServiceInstance();

        String get();
    }

    initialize getWarnings();

    ThreeDS2ServiceInstance initialize();
}
