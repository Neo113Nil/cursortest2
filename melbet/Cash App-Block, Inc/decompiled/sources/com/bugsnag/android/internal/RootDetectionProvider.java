package com.bugsnag.android.internal;

import com.bugsnag.android.ClientObservable;
import com.bugsnag.android.DeviceBuildInfo;
import com.bugsnag.android.Logger;
import com.bugsnag.android.RootDetector;
import com.bugsnag.android.internal.dag.RunnableProvider;

/* loaded from: classes.dex */
public final class RootDetectionProvider extends RunnableProvider {
    public final ClientObservable clientObservable;
    public final DeviceBuildInfo deviceBuildInfo;
    public boolean isRooted;
    public final Logger logger;

    public RootDetectionProvider(DeviceBuildInfo deviceBuildInfo, ClientObservable clientObservable, Logger logger) {
        this.deviceBuildInfo = deviceBuildInfo;
        this.clientObservable = clientObservable;
        this.logger = logger;
    }

    @Override // com.bugsnag.android.internal.dag.RunnableProvider
    public final Object invoke() {
        this.isRooted = new RootDetector(this.deviceBuildInfo, this.logger).isRooted();
        this.clientObservable.postSynchronizeState();
        return Boolean.valueOf(this.isRooted);
    }
}
