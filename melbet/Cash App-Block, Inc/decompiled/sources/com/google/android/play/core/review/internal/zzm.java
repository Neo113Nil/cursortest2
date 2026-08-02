package com.google.android.play.core.review.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.zxing.Result;

/* loaded from: classes4.dex */
public final class zzm extends zzj {
    public final /* synthetic */ TaskCompletionSource zza;
    public final /* synthetic */ com.google.android.play.core.review.zzf zzb;
    public final /* synthetic */ zzt zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzm(zzt zztVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, com.google.android.play.core.review.zzf zzfVar) {
        super(taskCompletionSource);
        this.zza = taskCompletionSource2;
        this.zzb = zzfVar;
        this.zzc = zztVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void zza() {
        synchronized (this.zzc.zzg) {
            try {
                zzt zztVar = this.zzc;
                TaskCompletionSource taskCompletionSource = this.zza;
                zztVar.zzf.add(taskCompletionSource);
                taskCompletionSource.zza.addOnCompleteListener(new Result(8, zztVar, taskCompletionSource));
                if (this.zzc.zzl.getAndIncrement() > 0) {
                    this.zzc.zzc.zzc("Already connected to the service.", new Object[0]);
                }
                zzt.zzp(this.zzc, this.zzb);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
