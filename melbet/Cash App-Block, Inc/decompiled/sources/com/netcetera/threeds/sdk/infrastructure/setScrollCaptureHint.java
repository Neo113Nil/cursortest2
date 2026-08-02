package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public interface setScrollCaptureHint {

    public interface ThreeDS2Service {
        void getWarnings();
    }

    public interface ThreeDS2ServiceInstance<T> {
        T initialize();
    }

    void ThreeDS2Service(ThreeDS2Service threeDS2Service, Runnable runnable);

    <T> T ThreeDS2ServiceInstance(ThreeDS2ServiceInstance<T> threeDS2ServiceInstance);

    void get(ThreeDS2Service threeDS2Service);
}
