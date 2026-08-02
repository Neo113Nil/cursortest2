package com.google.android.libraries.places.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzcav implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ zzcby zza;

    public zzcav(zzcby zzcbyVar) {
        this.zza = zzcbyVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Logger logger = zzcby.zza;
        Level level = Level.SEVERE;
        zzcby zzcbyVar = this.zza;
        String valueOf = String.valueOf(zzcbyVar.zzj);
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(valueOf.length() + 59), "[", valueOf, "] Uncaught exception in the SynchronizationContext. Panic!"), th);
        try {
            zzcbyVar.zzh(th);
        } catch (Throwable th2) {
            String valueOf2 = String.valueOf(zzcbyVar.zzj);
            logger.logp(level, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(valueOf2.length() + 37), "[", valueOf2, "] Uncaught exception while panicking"), th2);
        }
    }
}
