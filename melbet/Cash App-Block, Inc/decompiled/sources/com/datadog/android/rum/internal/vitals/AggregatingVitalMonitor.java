package com.datadog.android.rum.internal.vitals;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class AggregatingVitalMonitor implements VitalMonitor {
    public double lastKnownSample = Double.NaN;
    public final LinkedHashMap listeners = new LinkedHashMap();

    public final void notifyListener(VitalListener vitalListener, double d) {
        VitalInfo vitalInfo = (VitalInfo) this.listeners.get(vitalListener);
        if (vitalInfo == null) {
            vitalInfo = VitalInfo.EMPTY;
        }
        int i = vitalInfo.sampleCount;
        int i2 = i + 1;
        VitalInfo vitalInfo2 = new VitalInfo(Math.min(d, vitalInfo.minValue), Math.max(d, vitalInfo.maxValue), ((i * vitalInfo.meanValue) + d) / i2, i2);
        vitalListener.onVitalUpdate(vitalInfo2);
        synchronized (this.listeners) {
            this.listeners.put(vitalListener, vitalInfo2);
        }
    }

    @Override // com.datadog.android.rum.internal.vitals.VitalMonitor
    public final void onNewSample(double d) {
        this.lastKnownSample = d;
        synchronized (this.listeners) {
            Iterator it = this.listeners.keySet().iterator();
            while (it.hasNext()) {
                notifyListener((VitalListener) it.next(), d);
            }
        }
    }

    @Override // com.datadog.android.rum.internal.vitals.VitalMonitor
    public final void register(VitalListener vitalListener) {
        double d = this.lastKnownSample;
        synchronized (this.listeners) {
            this.listeners.put(vitalListener, VitalInfo.EMPTY);
        }
        if (Double.isNaN(d)) {
            return;
        }
        notifyListener(vitalListener, d);
    }

    @Override // com.datadog.android.rum.internal.vitals.VitalMonitor
    public final void unregister(VitalListener vitalListener) {
        vitalListener.getClass();
        synchronized (this.listeners) {
        }
    }
}
