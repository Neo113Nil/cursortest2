package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes4.dex */
public abstract class zzkq extends AtomicReference implements Runnable {
    public static final zzeh zza = new zzeh(1);
    public static final zzeh zzb = new zzeh(1);

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean zzg = zzg();
            zzeh zzehVar = zza;
            if (!zzg) {
                try {
                    obj = zza();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, zzehVar)) {
                            zzc(currentThread);
                        }
                        zzd(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, zzehVar)) {
                            zzc(currentThread);
                        }
                        zze(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, zzehVar)) {
                zzc(currentThread);
            }
            if (zzg) {
                return;
            }
            zze(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable runnable = (Runnable) get();
        return Recorder$$ExternalSyntheticOutline2.m(runnable == zza ? "running=[DONE]" : runnable instanceof zzkn ? "running=[INTERRUPTED]" : runnable instanceof Thread ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]", ", ", zzb());
    }

    public abstract Object zza();

    public abstract String zzb();

    public final void zzc(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzkn zzknVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof zzkn;
            zzeh zzehVar = zzb;
            if (!z2) {
                if (runnable != zzehVar) {
                    break;
                }
            } else {
                zzknVar = (zzkn) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == zzehVar || compareAndSet(runnable, zzehVar)) {
                z = Thread.interrupted() || z;
                LockSupport.park(zzknVar);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public abstract void zzd(Throwable th);

    public abstract void zze(Object obj);

    public abstract boolean zzg();

    public final void zzh() {
        zzeh zzehVar = zzb;
        zzeh zzehVar2 = zza;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzkn zzknVar = new zzkn(this);
            zzknVar.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, zzknVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(zzehVar2)) == zzehVar) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(zzehVar2)) == zzehVar) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }
}
