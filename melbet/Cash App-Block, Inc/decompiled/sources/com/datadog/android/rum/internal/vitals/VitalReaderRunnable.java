package com.datadog.android.rum.internal.vitals;

import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.rum.internal.domain.RumContext;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public final class VitalReaderRunnable implements Runnable {
    public volatile RumContext currentRumContext;
    public final ScheduledExecutorService executor;
    public final VitalMonitor observer;
    public final long periodMs;
    public final VitalReader reader;
    public final InternalSdkCore sdkCore;

    public VitalReaderRunnable(InternalSdkCore internalSdkCore, VitalReader vitalReader, VitalMonitor vitalMonitor, ScheduledExecutorService scheduledExecutorService, long j) {
        internalSdkCore.getClass();
        vitalMonitor.getClass();
        scheduledExecutorService.getClass();
        this.sdkCore = internalSdkCore;
        this.reader = vitalReader;
        this.observer = vitalMonitor;
        this.executor = scheduledExecutorService;
        this.periodMs = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Double readVitalData;
        RumContext rumContext = this.currentRumContext;
        if ((rumContext != null ? rumContext.viewType : 0) == 2 && (readVitalData = this.reader.readVitalData()) != null) {
            this.observer.onNewSample(readVitalData.doubleValue());
        }
        zzho.scheduleSafe(this.executor, "Vitals monitoring", this.periodMs, this.sdkCore.getInternalLogger(), this);
    }
}
