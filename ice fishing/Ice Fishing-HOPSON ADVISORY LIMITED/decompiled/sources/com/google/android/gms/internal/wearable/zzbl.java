package com.google.android.gms.internal.wearable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzbl {
    public static zzbg zza(ExecutorService executorService) {
        if (executorService instanceof zzbg) {
            return (zzbg) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new zzbk((ScheduledExecutorService) executorService) : new zzbh(executorService);
    }
}
