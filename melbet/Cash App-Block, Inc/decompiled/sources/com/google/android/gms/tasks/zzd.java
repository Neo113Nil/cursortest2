package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class zzd implements zzq, OnSuccessListener, OnFailureListener, OnCanceledListener {
    public final /* synthetic */ int $r8$classId;
    public final Executor zza;
    public final Continuation zzb;
    public final zzw zzc;

    public /* synthetic */ zzd(Executor executor, Continuation continuation, zzw zzwVar, int i) {
        this.$r8$classId = i;
        this.zza = executor;
        this.zzb = continuation;
        this.zzc = zzwVar;
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public void onCanceled() {
        this.zzc.zze();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        this.zzc.zzc(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        this.zzc.zza(obj);
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zza(Task task) {
        switch (this.$r8$classId) {
            case 0:
                this.zza.execute(new zzc(0, this, task));
                break;
            default:
                this.zza.execute(new zzc(7, this, task));
                break;
        }
    }
}
