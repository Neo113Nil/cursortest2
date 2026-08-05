package com.google.android.gms.internal.wearable;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
abstract class zzbd extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzbc(null);
    private static final Runnable zzb = new zzbc(null);

    zzbd() {
    }

    private final void zzg(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzbb zzbbVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof zzbb)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzbbVar = (zzbb) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(zzbbVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean zza2 = zza();
            if (!zza2) {
                try {
                    obj = zzb();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, zza)) {
                            zzg(currentThread);
                        }
                        zzd(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, zza)) {
                            zzg(currentThread);
                        }
                        zzc(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, zza)) {
                zzg(currentThread);
            }
            if (zza2) {
                return;
            }
            zzc(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            str = "running=[DONE]";
        } else if (runnable instanceof zzbb) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String zzf = zzf();
        StringBuilder sb2 = new StringBuilder(str.length() + 2 + String.valueOf(zzf).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(zzf);
        return sb2.toString();
    }

    abstract boolean zza();

    abstract Object zzb() throws Exception;

    abstract void zzc(Object obj);

    abstract void zzd(Throwable th);

    final void zze() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzbb zzbbVar = new zzbb(this, null);
            zzbbVar.zza(Thread.currentThread());
            if (compareAndSet(runnable, zzbbVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    abstract String zzf();
}
