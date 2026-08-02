package com.datadog.android.rum.internal.vitals;

/* loaded from: classes4.dex */
public interface VitalMonitor {
    void onNewSample(double d);

    void register(VitalListener vitalListener);

    void unregister(VitalListener vitalListener);
}
