package com.google.android.gms.tasks;

import com.google.android.gms.stats.zza;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzh implements zzq, OnSuccessListener, OnFailureListener, OnCanceledListener {
    public final /* synthetic */ int $r8$classId;
    public final Executor zza;
    public final Object zzb;
    public final Object zzc;

    public zzh(Executor executor, OnCanceledListener onCanceledListener) {
        this.$r8$classId = 0;
        this.zzb = new Object();
        this.zza = executor;
        this.zzc = onCanceledListener;
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public void onCanceled() {
        ((zzw) this.zzc).zze();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((zzw) this.zzc).zzc(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((zzw) this.zzc).zza(obj);
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zza(Task task) {
        int i = 8;
        switch (this.$r8$classId) {
            case 0:
                if (task.isCanceled()) {
                    synchronized (this.zzb) {
                        try {
                            if (((OnCanceledListener) this.zzc) != null) {
                                this.zza.execute(new zza(this, i));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 1:
                synchronized (this.zzb) {
                    try {
                        if (((OnCompleteListener) this.zzc) == null) {
                            return;
                        }
                        this.zza.execute(new zzi(0, this, task));
                        return;
                    } finally {
                    }
                }
            case 2:
                if (task.isSuccessful() || task.isCanceled()) {
                    return;
                }
                synchronized (this.zzb) {
                    try {
                        if (((OnFailureListener) this.zzc) != null) {
                            this.zza.execute(new zzi(i, this, task));
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                if (task.isSuccessful()) {
                    synchronized (this.zzb) {
                        try {
                            if (((OnSuccessListener) this.zzc) != null) {
                                this.zza.execute(new zzi(9, this, task));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                this.zza.execute(new zzi(10, this, task));
                return;
        }
    }

    public zzh(Executor executor, OnCompleteListener onCompleteListener) {
        this.$r8$classId = 1;
        this.zzb = new Object();
        this.zza = executor;
        this.zzc = onCompleteListener;
    }

    public zzh(Executor executor, OnFailureListener onFailureListener) {
        this.$r8$classId = 2;
        this.zzb = new Object();
        this.zza = executor;
        this.zzc = onFailureListener;
    }

    public zzh(Executor executor, OnSuccessListener onSuccessListener) {
        this.$r8$classId = 3;
        this.zzb = new Object();
        this.zza = executor;
        this.zzc = onSuccessListener;
    }

    public zzh(Executor executor, SuccessContinuation successContinuation, zzw zzwVar) {
        this.$r8$classId = 4;
        this.zza = executor;
        this.zzb = successContinuation;
        this.zzc = zzwVar;
    }
}
