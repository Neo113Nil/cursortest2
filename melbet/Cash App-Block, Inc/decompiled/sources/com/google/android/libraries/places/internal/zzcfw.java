package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzcfw implements Executor, Runnable {
    public static final Logger zza = Logger.getLogger(zzcfw.class.getName());
    public static final zzie zzb;
    public final Executor zzc;
    public final ConcurrentLinkedQueue zzd = new ConcurrentLinkedQueue();
    public volatile int zze = 0;

    static {
        zzie zzcfvVar;
        try {
            zzcfvVar = new zzcfu(AtomicIntegerFieldUpdater.newUpdater(zzcfw.class, "zze"));
        } catch (Throwable th) {
            zza.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", th);
            zzcfvVar = new zzcfv();
        }
        zzb = zzcfvVar;
    }

    public zzcfw(Executor executor) {
        Trace.checkNotNull(executor, "'executor' must not be null.");
        this.zzc = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Trace.checkNotNull(runnable, "'r' must not be null.");
        this.zzd.add(runnable);
        zzc(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzie zzieVar = zzb;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.zzd;
        while (true) {
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e) {
                    Logger logger = zza;
                    Level level = Level.SEVERE;
                    String obj = runnable.toString();
                    StringBuilder sb = new StringBuilder(obj.length() + 35);
                    sb.append("Exception while executing runnable ");
                    sb.append(obj);
                    logger.logp(level, "io.grpc.internal.SerializingExecutor", "run", sb.toString(), (Throwable) e);
                }
            } catch (Throwable th) {
                zzieVar.zzb(this);
                throw th;
            }
        }
        zzieVar.zzb(this);
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        zzc(null);
    }

    public final void zzc(Runnable runnable) {
        zzie zzieVar = zzb;
        if (zzieVar.zza(this)) {
            try {
                this.zzc.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.zzd.remove(runnable);
                }
                zzieVar.zzb(this);
                throw th;
            }
        }
    }
}
