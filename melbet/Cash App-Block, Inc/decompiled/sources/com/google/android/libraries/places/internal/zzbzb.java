package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public final class zzbzb implements zzcgd {
    @Override // com.google.android.libraries.places.internal.zzcgd
    public final /* synthetic */ void zza(Object obj) {
        ((ScheduledExecutorService) obj).shutdown();
    }

    @Override // com.google.android.libraries.places.internal.zzcgd
    public final /* bridge */ /* synthetic */ Object zzb() {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, zzbzg.zzd("grpc-timer-%d"));
        try {
            newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(newScheduledThreadPool, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            return null;
        }
        return Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
    }
}
