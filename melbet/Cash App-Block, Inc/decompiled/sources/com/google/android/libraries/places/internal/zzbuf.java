package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.fillr.browsersdk.Fillr;
import com.google.android.filament.Box;
import java.lang.Thread;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class zzbuf implements Executor {
    public final Thread.UncaughtExceptionHandler zza;
    public final ConcurrentLinkedQueue zzb = new ConcurrentLinkedQueue();
    public final AtomicReference zzc = new AtomicReference();

    public zzbuf(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zza = uncaughtExceptionHandler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        zzb(runnable);
        zza();
    }

    public final void zza() {
        AtomicReference atomicReference;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.zzb;
        do {
            Thread currentThread = Thread.currentThread();
            do {
                atomicReference = this.zzc;
                if (atomicReference.compareAndSet(null, currentThread)) {
                    while (true) {
                        try {
                            Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                            if (runnable == null) {
                                break;
                            }
                            try {
                                runnable.run();
                            } catch (Throwable th) {
                                this.zza.uncaughtException(Thread.currentThread(), th);
                            }
                        } catch (Throwable th2) {
                            atomicReference.set(null);
                            throw th2;
                        }
                    }
                    atomicReference.set(null);
                }
            } while (atomicReference.get() == null);
            return;
        } while (!concurrentLinkedQueue.isEmpty());
    }

    public final void zzb(Runnable runnable) {
        Trace.checkNotNull(runnable, "runnable is null");
        this.zzb.add(runnable);
    }

    public final void zzc() {
        Trace.checkState("Not called from the SynchronizationContext", Thread.currentThread() == this.zzc.get());
    }

    public final Box zzd(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit) {
        zzbud zzbudVar = new zzbud(runnable);
        return new Box(zzbudVar, scheduledExecutorService.schedule(new Fillr.AnonymousClass2(this, zzbudVar, runnable, false, 22), j, timeUnit));
    }
}
