package com.google.android.gms.measurement.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.internal.zzae;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzhz extends zzjf {
    public static final AtomicLong zzj = new AtomicLong(Long.MIN_VALUE);
    public zzhy zza;
    public zzhy zzb;
    public final PriorityBlockingQueue zzc;
    public final LinkedBlockingQueue zzd;
    public final zzhw zze;
    public final zzhw zzf;
    public final Object zzg;
    public final Semaphore zzh;

    public zzhz(zzic zzicVar) {
        super(zzicVar);
        this.zzg = new Object();
        this.zzh = new Semaphore(2);
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new LinkedBlockingQueue();
        this.zze = new zzhw(this, "Thread death: Uncaught exception on worker thread");
        this.zzf = new zzhw(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final boolean zza() {
        return false;
    }

    public final void zzaY() {
        if (Thread.currentThread() == this.zzb) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Call expected from network thread");
    }

    public final void zzd() {
        if (Thread.currentThread() != this.zza) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Call not expected from worker thread");
    }

    public final boolean zze() {
        return Thread.currentThread() == this.zza;
    }

    @Override // papa.InteractionResult
    public final void zzg() {
        if (Thread.currentThread() == this.zza) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Call expected from worker thread");
    }

    public final zzhx zzh(Callable callable) {
        zzw();
        zzhx zzhxVar = new zzhx(this, callable, false);
        if (Thread.currentThread() != this.zza) {
            zzz(zzhxVar);
            return zzhxVar;
        }
        if (!this.zzc.isEmpty()) {
            zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzg.zza("Callable skipped the worker queue.");
        }
        zzhxVar.run();
        return zzhxVar;
    }

    public final zzhx zzi(Callable callable) {
        zzw();
        zzhx zzhxVar = new zzhx(this, callable, true);
        if (Thread.currentThread() == this.zza) {
            zzhxVar.run();
            return zzhxVar;
        }
        zzz(zzhxVar);
        return zzhxVar;
    }

    public final void zzj(Runnable runnable) {
        zzw();
        zzae.checkNotNull(runnable);
        zzz(new zzhx(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object zzk(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            zzhz zzhzVar = ((zzic) this.$$delegate_0).zzj;
            zzic.zzP(zzhzVar);
            zzhzVar.zzj(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                zzgu zzguVar = ((zzic) this.$$delegate_0).zzi;
                zzic.zzP(zzguVar);
                zzgs zzgsVar = zzguVar.zzg;
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                zzgsVar.zza(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            zzgu zzguVar2 = ((zzic) this.$$delegate_0).zzi;
            zzic.zzP(zzguVar2);
            zzguVar2.zzg.zza("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void zzl(Runnable runnable) {
        zzw();
        zzz(new zzhx(this, runnable, true, "Task exception on worker thread"));
    }

    public final void zzm(Runnable runnable) {
        zzw();
        zzhx zzhxVar = new zzhx(this, runnable, false, "Task exception on network thread");
        synchronized (this.zzg) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.zzd;
                linkedBlockingQueue.add(zzhxVar);
                zzhy zzhyVar = this.zzb;
                if (zzhyVar == null) {
                    zzhy zzhyVar2 = new zzhy(this, "Measurement Network", linkedBlockingQueue);
                    this.zzb = zzhyVar2;
                    zzhyVar2.setUncaughtExceptionHandler(this.zzf);
                    this.zzb.start();
                } else {
                    Object obj = zzhyVar.zzb;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzz(zzhx zzhxVar) {
        synchronized (this.zzg) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.zzc;
                priorityBlockingQueue.add(zzhxVar);
                zzhy zzhyVar = this.zza;
                if (zzhyVar == null) {
                    zzhy zzhyVar2 = new zzhy(this, "Measurement Worker", priorityBlockingQueue);
                    this.zza = zzhyVar2;
                    zzhyVar2.setUncaughtExceptionHandler(this.zze);
                    this.zza.start();
                } else {
                    Object obj = zzhyVar.zzb;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
