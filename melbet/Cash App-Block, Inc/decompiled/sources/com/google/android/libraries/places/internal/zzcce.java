package com.google.android.libraries.places.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzcce extends WeakReference {
    public static final boolean zza = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
    public static final RuntimeException zzb;
    public final ReferenceQueue zzc;
    public final ConcurrentMap zzd;
    public final String zze;
    public final SoftReference zzf;
    public final AtomicBoolean zzg;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        zzb = runtimeException;
    }

    public zzcce(zzccf zzccfVar, zzcby zzcbyVar, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(zzccfVar, referenceQueue);
        this.zzg = new AtomicBoolean();
        this.zzf = new SoftReference(zza ? new RuntimeException("ManagedChannel allocation site") : zzb);
        this.zze = zzcbyVar.toString();
        this.zzc = referenceQueue;
        this.zzd = concurrentMap;
        concurrentMap.put(this, this);
        zza(referenceQueue);
    }

    public static void zza(ReferenceQueue referenceQueue) {
        while (true) {
            zzcce zzcceVar = (zzcce) referenceQueue.poll();
            if (zzcceVar == null) {
                return;
            }
            SoftReference softReference = zzcceVar.zzf;
            RuntimeException runtimeException = (RuntimeException) softReference.get();
            super.clear();
            zzcceVar.zzd.remove(zzcceVar);
            softReference.clear();
            if (!zzcceVar.zzg.get()) {
                Level level = Level.SEVERE;
                Logger logger = zzccf.zzc;
                if (logger.isLoggable(level)) {
                    String property = System.getProperty("line.separator");
                    LogRecord logRecord = new LogRecord(level, Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(String.valueOf(property).length() + 127), "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*", property, "    Make sure to call shutdown()/shutdownNow()"));
                    logRecord.setLoggerName(logger.getName());
                    logRecord.setParameters(new Object[]{zzcceVar.zze});
                    logRecord.setThrown(runtimeException);
                    logger.log(logRecord);
                }
            }
        }
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        super.clear();
        this.zzd.remove(this);
        this.zzf.clear();
        zza(this.zzc);
    }
}
