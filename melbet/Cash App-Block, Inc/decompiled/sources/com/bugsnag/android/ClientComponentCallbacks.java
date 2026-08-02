package com.bugsnag.android;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.bugsnag.android.Client;

/* loaded from: classes.dex */
public final class ClientComponentCallbacks implements ComponentCallbacks2 {
    public final Client.AnonymousClass1 cb;
    public final DeviceDataCollector deviceDataCollector;
    public final Client.AnonymousClass1 memoryCallback;

    public ClientComponentCallbacks(DeviceDataCollector deviceDataCollector, Client.AnonymousClass1 anonymousClass1, Client.AnonymousClass1 anonymousClass12) {
        this.deviceDataCollector = deviceDataCollector;
        this.cb = anonymousClass1;
        this.memoryCallback = anonymousClass12;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        DeviceDataCollector deviceDataCollector = this.deviceDataCollector;
        String orientationAsString$bugsnag_android_core_release = deviceDataCollector.getOrientationAsString$bugsnag_android_core_release();
        int i = configuration.orientation;
        if (deviceDataCollector.orientation.getAndSet(i) != i) {
            this.cb.invoke(orientationAsString$bugsnag_android_core_release, deviceDataCollector.getOrientationAsString$bugsnag_android_core_release());
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.memoryCallback.invoke(Boolean.TRUE, null);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.memoryCallback.invoke(Boolean.valueOf(i >= 80), Integer.valueOf(i));
    }
}
