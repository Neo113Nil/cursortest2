package com.datadog.android.rum.internal.vitals;

/* loaded from: classes4.dex */
public final class NoOpVitalMonitor implements VitalMonitor {
    @Override // com.datadog.android.rum.internal.vitals.VitalMonitor
    public void onNewSample(double d) {
    }

    @Override // com.datadog.android.rum.internal.vitals.VitalMonitor
    public void register(VitalListener vitalListener) {
    }

    @Override // com.datadog.android.rum.internal.vitals.VitalMonitor
    public void unregister(VitalListener vitalListener) {
        vitalListener.getClass();
    }
}
