package com.google.android.gms.tasks;

import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import retrofit2.AndroidMainExecutor;

/* loaded from: classes.dex */
public final class zzw extends Task {
    public final Object zza = new Object();
    public final zzr zzb = new zzr();
    public boolean zzc;
    public volatile boolean zzd;
    public Object zze;
    public Exception zzf;

    @Override // com.google.android.gms.tasks.Task
    public final void addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        this.zzb.zza(new zzh(executor, onCanceledListener));
        zzi();
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        this.zzb.zza(new zzh(TaskExecutors.MAIN_THREAD, onCompleteListener));
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final zzw addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        this.zzb.zza(new zzh(executor, onFailureListener));
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final zzw addOnSuccessListener(Executor executor, OnSuccessListener onSuccessListener) {
        this.zzb.zza(new zzh(executor, onSuccessListener));
        zzi();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWith(Executor executor, Continuation continuation) {
        zzw zzwVar = new zzw();
        this.zzb.zza(new zzd(executor, continuation, zzwVar, 0));
        zzi();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWithTask(Executor executor, Continuation continuation) {
        zzw zzwVar = new zzw();
        this.zzb.zza(new zzd(executor, continuation, zzwVar, 1));
        zzi();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        Exception exc;
        synchronized (this.zza) {
            exc = this.zzf;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult() {
        Object obj;
        synchronized (this.zza) {
            try {
                com.google.android.gms.common.internal.zzae.checkState("Task is not yet complete", this.zzc);
                if (this.zzd) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.zzf;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.zze;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult$1() {
        Object obj;
        synchronized (this.zza) {
            try {
                com.google.android.gms.common.internal.zzae.checkState("Task is not yet complete", this.zzc);
                if (this.zzd) {
                    throw new CancellationException("Task is already canceled.");
                }
                boolean isInstance = IOException.class.isInstance(this.zzf);
                Exception exc = this.zzf;
                if (isInstance) {
                    throw ((Throwable) IOException.class.cast(exc));
                }
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.zze;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isCanceled() {
        return this.zzd;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isComplete() {
        boolean z;
        synchronized (this.zza) {
            z = this.zzc;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z;
        synchronized (this.zza) {
            try {
                z = false;
                if (this.zzc && !this.zzd && this.zzf == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task onSuccessTask(SuccessContinuation successContinuation) {
        AndroidMainExecutor androidMainExecutor = TaskExecutors.MAIN_THREAD;
        zzw zzwVar = new zzw();
        this.zzb.zza(new zzh(androidMainExecutor, successContinuation, zzwVar));
        zzi();
        return zzwVar;
    }

    public final void zza(Object obj) {
        synchronized (this.zza) {
            if (this.zzc) {
                throw DuplicateTaskCompletionException.of(this);
            }
            this.zzc = true;
            this.zze = obj;
        }
        this.zzb.zzb(this);
    }

    public final boolean zzb(Object obj) {
        synchronized (this.zza) {
            try {
                if (this.zzc) {
                    return false;
                }
                this.zzc = true;
                this.zze = obj;
                this.zzb.zzb(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(Exception exc) {
        com.google.android.gms.common.internal.zzae.checkNotNull(exc, "Exception must not be null");
        synchronized (this.zza) {
            if (this.zzc) {
                throw DuplicateTaskCompletionException.of(this);
            }
            this.zzc = true;
            this.zzf = exc;
        }
        this.zzb.zzb(this);
    }

    public final void zze() {
        synchronized (this.zza) {
            try {
                if (this.zzc) {
                    return;
                }
                this.zzc = true;
                this.zzd = true;
                this.zzb.zzb(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzi() {
        synchronized (this.zza) {
            try {
                if (this.zzc) {
                    this.zzb.zzb(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzw addOnFailureListener(OnFailureListener onFailureListener) {
        addOnFailureListener(TaskExecutors.MAIN_THREAD, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final zzw addOnSuccessListener(OnSuccessListener onSuccessListener) {
        addOnSuccessListener(TaskExecutors.MAIN_THREAD, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final void addOnCompleteListener(Executor executor, OnCompleteListener onCompleteListener) {
        this.zzb.zza(new zzh(executor, onCompleteListener));
        zzi();
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWithTask(Continuation continuation) {
        return continueWithTask(TaskExecutors.MAIN_THREAD, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task onSuccessTask(Executor executor, SuccessContinuation successContinuation) {
        zzw zzwVar = new zzw();
        this.zzb.zza(new zzh(executor, successContinuation, zzwVar));
        zzi();
        return zzwVar;
    }
}
